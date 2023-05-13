package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView set ;
    public static LinearLayout backPic;
    public static TextView top,bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set = findViewById(R.id.setting);
        backPic = findViewById(R.id.cover);
        top = findViewById(R.id.headerText);
        bottom = findViewById(R.id.bottomText);



        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, SettingActivity.class));
//                top.setTextColor(getColor(R.color.red));
            }
        });
    }
}