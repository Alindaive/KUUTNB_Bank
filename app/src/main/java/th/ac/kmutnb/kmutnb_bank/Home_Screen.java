package th.ac.kmutnb.kmutnb_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Home_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home_screen);


    }

    public void openQR(View V){


        Intent itn3 = new Intent(this,ScanCam.class);
        startActivity(itn3);
    }

    public void openQRgen(View V){


        Intent itn6 = new Intent(this,QRGENERATE.class);
        startActivity(itn6);
    }

    public void openTranfer(View V){

        Intent itn4 = new Intent(this,Tranfer.class);
        startActivity(itn4);
    }

    public void openUserIm(View V){

        Intent itn5 = new Intent(this,User_Information.class);
        startActivity(itn5);
    }
}