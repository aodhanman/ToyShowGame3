package com.flange.aodhan.toyshowgame;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer merry = MediaPlayer.create(this, R.raw.christmas);
        final MediaPlayer clap = MediaPlayer.create(this, R.raw.applause2);
        final MediaPlayer goahead = MediaPlayer.create(this, R.raw.goaheadtomaudience);



        final Button button1 = (Button) findViewById(R.id.merryplay);
        button1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();

                button1.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button2.setBackgroundResource(R.drawable.cross);
            }
        });

        final Button button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button3.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button4.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button5.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button6.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button7.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button8.setBackgroundResource(R.drawable.cross);
            }
        });

        final Button jedward = (Button) findViewById(R.id.jedward);
        jedward.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, doom.class));
                jedward.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button10.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                clap.start();
                button11.setBackgroundResource(R.drawable.cross);
            }
        });
        final Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                merry.start();
                button11.setBackgroundResource(R.drawable.cross);
            }
        });


        Button audi = (Button) findViewById(R.id.audience);
        audi.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goahead.start();

            }
        });







    }
}

