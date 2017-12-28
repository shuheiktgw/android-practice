package com.example.android.gridlayoutdemo;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onClickPlay(View view) {
        int id = audioSelector(view);
        MediaPlayer.create(this, id).start();
    }

    private int audioSelector(View button) {
        int id = 0;
        switch (button.getId()) {
            case R.id.hello:
                id = R.raw.hello;
                break;
            case R.id.goodevening:
                id = R.raw.goodevening;
                break;
            case R.id.doyouspeakenglish:
                id = R.raw.goodevening;
                break;
            case R.id.howareyou:
                id = R.raw.howareyou;
                break;
            case R.id.ilivein:
                id = R.raw.ilivein;
                break;
            case R.id.mynameis:
                id = R.raw.mynameis;
                break;
            case R.id.please:
                id = R.raw.please;
                break;
            case R.id.welcome:
                id = R.raw.welcome;
                break;
        }

        return id;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
