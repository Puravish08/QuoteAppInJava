package com.puravish.recycleviewquoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplachScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splach_screen );


        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent( SplachScreen.this, QuoteIntroductionScreen.class );
                startActivity( i );
                finish();
            }
        }, 2000 );
    }

}