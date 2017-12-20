package com.example.android.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView cat1 = findViewById(R.id.imageViewCat1);
        cat1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

//        ImageView cat2 = findViewById(R.id.imageViewCat2);
//        cat2.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
