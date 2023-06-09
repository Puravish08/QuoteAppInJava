package com.puravish.recycleviewquoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.MotionButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_in_Screen extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sign_in_screen );
        initView();
    }

    private void initView() {


        MotionButton btn = findViewById( R.id.btn );



        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Sign_in_Screen.this,MainActivity.class);
                startActivity( i );
                finish();



            }
        } );








    }
}