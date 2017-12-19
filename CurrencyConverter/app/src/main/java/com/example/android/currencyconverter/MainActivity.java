package com.example.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickConvert(View view) {
        EditText text = findViewById(R.id.dollerEditText);
        int jpy = Integer.parseInt(text.getText().toString());
        String dollar = String.valueOf(jpy /113.0);

        Toast.makeText(MainActivity.this, "$ " + dollar, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
