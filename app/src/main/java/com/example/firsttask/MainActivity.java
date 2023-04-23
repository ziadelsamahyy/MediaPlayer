package com.example.firsttask;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void play(View v){
        if(player==null){
            player=MediaPlayer.create(this,R.raw.b);
        }
        player.start();

    }
    public void pause(View v){
        if(player!=null){
            player.pause();
        }
    }
    public void stop(View v){
        if(player!=null){
            player.release();
            player=null;
            Toast.makeText(this, "media player released", Toast.LENGTH_SHORT).show();
        }
    }

}