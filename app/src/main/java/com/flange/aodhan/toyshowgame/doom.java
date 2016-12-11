
package com.flange.aodhan.toyshowgame;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class doom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doom);

        final MediaPlayer helldoom = MediaPlayer.create(this, R.raw.doom);
        final MediaPlayer haha = MediaPlayer.create(this, R.raw.male);




        final Button ha = (Button) findViewById(R.id.hahaha);
        ha.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ha.setBackgroundColor(Color.GREEN);
                haha.start();
            }
        });
        helldoom.start();
    }
}
