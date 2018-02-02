package com.example.sagar.sicklab;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {


    /**
     * Duration of wait
     **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */


                Intent mainIntent = new Intent(SplashScreen.this, LoginChecker.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

