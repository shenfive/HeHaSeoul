package com.example.shenf.hehaseoul;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                goWeb();
            }
        };
        timer.schedule(timerTask, 3000);
    }

    public void startWeb(View v){
        timer.cancel();
        goWeb();
    }
    public void goWeb(){
        Intent intent = new Intent();
        intent.setClass(this,WebOne.class);
        startActivity(intent);

    }
}
