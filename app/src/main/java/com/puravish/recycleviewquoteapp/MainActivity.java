package com.puravish.recycleviewquoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<shayariModel> categori =new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        initView();

    }

    @SuppressLint("ResourceAsColor")
    private void initView() {

        recyclerView = findViewById( R.id.rcv );


//        recyclerView.setBackgroundColor( R.color.black );



        shayariModel m1 = new shayariModel();
        m1.setShayariname("Alone");
        m1.setEmoji( R.drawable.alone);
//        m1.setBgcolor( R.color.black );
        categori.add( m1 );



        shayariModel m2 = new shayariModel();
        m2.setShayariname("Attitude");
        m2.setEmoji( R.drawable.attitude );
//        m2.setBgcolor( R.color.red );
        categori.add( m2 );


        shayariModel m3 = new shayariModel();
        m3.setShayariname("Angry");
//        m3.setBgcolor( R.color.skyblue );
        m3.setEmoji( R.drawable.angari );
        categori.add( m3);

//        shayariModel m4 = new shayariModel();
//        m4.setShayariname("Birthday");
////        m4.setBgcolor( R.color.purpul );
//        m4.setEmoji( R.drawable.birthday );
//        categori.add( m4);



        shayariModel m5 = new shayariModel();
        m5.setShayariname("Funny");
        m5.setEmoji( R.drawable.funny );
//        m5.setBgcolor( R.color.orange );
        categori.add( m5);



        shayariModel m6 = new shayariModel();
        m6.setShayariname("Helth");
        m6.setEmoji( R.drawable.helath );
//        m5.setBgcolor( R.color.orange );
        categori.add( m6);



        shayariModel m7 = new shayariModel();
        m7.setShayariname("LeaderShip");
        m7.setEmoji( R.drawable.leadership );
//        m5.setBgcolor( R.color.orange );
        categori.add( m7);


        shayariModel m8 = new shayariModel();
        m8.setShayariname("Positive");
        m8.setEmoji( R.drawable.positiv );
//        m5.setBgcolor( R.color.orange );
        categori.add( m8);




        shayariModel m9 = new shayariModel();
        m9.setShayariname("Smile");
        m9.setEmoji( R.drawable.smiles );
//        m5.setBgcolor( R.color.orange );
        categori.add( m9);
//
//
//
//        shayariModel m10 = new shayariModel();
//        m10.setShayariname("Workout");
//        m10.setEmoji( R.drawable.execise );
////        m5.setBgcolor( R.color.orange );
//        categori.add( m10);
//
//


//        shayariModel m11 = new shayariModel();
//        m11.setShayariname("Dating");
//        m11.setEmoji( R.drawable.dating );
////        m5.setBgcolor( R.color.orange );
//        categori.add( m11);



        shayariModel m12 = new shayariModel();
        m12.setShayariname("Death");
        m12.setEmoji( R.drawable.death );
//        m5.setBgcolor( R.color.orange );
        categori.add( m12);




        shayariModel m13 = new shayariModel();
        m13.setShayariname("Failure");
        m13.setEmoji( R.drawable.streess );
//        m5.setBgcolor( R.color.orange );
        categori.add( m13);


        shayariModel m14 = new shayariModel();
        m14.setShayariname("Music");
        m14.setEmoji( R.drawable.musicemoji );
//        m5.setBgcolor( R.color.orange );
        categori.add( m14);


        shayariModel m15 = new shayariModel();
        m15.setShayariname("Nature");
        m15.setEmoji( R.drawable.nature );
//        m5.setBgcolor( R.color.orange );
        categori.add( m15);







        ShayariInterface shayariInterface = new ShayariInterface() {
            @Override
            public void onClick(String title) {

//                Toast.makeText( MainActivity.this, "Click this Item Name"+shayariInterface., Toast.LENGTH_SHORT ).show();


                Intent i=  new Intent(MainActivity.this,ShowQuoteActivity.class);
                i.putExtra( "title",title );
                startActivity(i);


            }
        };



            GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);


        ShayariAdapter shayariAdapter = new ShayariAdapter(MainActivity.this,categori,shayariInterface);
        recyclerView.setAdapter( shayariAdapter );




    }
}