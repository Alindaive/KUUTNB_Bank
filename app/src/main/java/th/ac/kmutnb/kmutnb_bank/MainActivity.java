package th.ac.kmutnb.kmutnb_bank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "my_app" ;

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Signup"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTranslationY(300);
//        tabLayout.setAlpha(v);

    }

        public void openHome(View V){

        Intent itn1 = new Intent(this,Home_Screen.class);
        startActivity(itn1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"รัน onStart");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"รัน onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"รัน onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"รัน onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"รัน onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"รัน onDestroy");

    }


}