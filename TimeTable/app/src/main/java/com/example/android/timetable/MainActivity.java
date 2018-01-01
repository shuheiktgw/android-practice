package com.example.android.timetable;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> timesTableContent;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timesTableContent = new ArrayList<String>();
        listView = findViewById(R.id.listView);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(9);
        seekBar.setProgress(1);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1;
                int timesTable;

                if (i < 1) {
                    timesTable = min;
                    seekBar.setProgress(min);
                } else {
                    timesTable = i;
                }

                timesCalculator(timesTable);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        timesCalculator(1);
    }

    private void timesCalculator(int starter) {
        timesTableContent.clear();
        for(int i = 1; i < 10; i++) {
            timesTableContent.add(Integer.toString(starter * i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timesTableContent);
        listView.setAdapter(arrayAdapter);
    }
}
