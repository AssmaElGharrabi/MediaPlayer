package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long l) {

            }
            @Override
            public void onFinish() {
                gotoSoundActivity();
            }
        }.start();
    }

    public void gotoSoundActivity() {
        startActivity(new Intent(MainActivity.this, SoundActivity.class));

    }
}