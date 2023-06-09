package com.puravish.recycleviewquoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuoteIntroductionScreen extends AppCompatActivity {
    AppCompatButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_introduction_screen);


         button = findViewById( R.id.btn );


         button.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(QuoteIntroductionScreen.this,Sign_in_Screen.class);
                 startActivity( i );
                 finish();
             }
         } );





    }
}