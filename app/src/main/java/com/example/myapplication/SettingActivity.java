package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class SettingActivity extends AppCompatActivity {
    LinearLayout cov;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        confirm = findViewById(R.id.confirm);

        // Declaring and initializing the Spinner from the layout file
        Spinner mSpinner = findViewById(R.id.spinner_1);
        Spinner mSpinner2 = findViewById(R.id.spinner_2);

        // Create a list to display in the Spinner
        List<String> mList = Arrays.asList("White Dot", "Blue", "Old", "Black");
        List<String> mList2 = Arrays.asList("Red", "White");

        // Create an adapter as shown below
        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this, R.layout.spinner_list, mList);
        mArrayAdapter.setDropDownViewResource(R.layout.spinner_list);
        ArrayAdapter<String> mArrayAdapter2 = new ArrayAdapter<String>(this, R.layout.spinner_list, mList2);
        mArrayAdapter2.setDropDownViewResource(R.layout.spinner_list);

        // Set the adapter to the Spinner

        mSpinner.setAdapter(mArrayAdapter);
        mSpinner2.setAdapter(mArrayAdapter2);



        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String data = mSpinner.getSelectedItem().toString();
                String textData = mSpinner2.getSelectedItem().toString();

                System.out.println(textData);

                if(data == "White Dot"){
                    MainActivity.backPic.setBackground(getDrawable(R.drawable.white_dot));
//                    startActivity(new Intent(SettingActivity.this, MainActivity.class));
//                    finish();
                } else if (data == "Black") {
                    MainActivity.backPic.setBackground(getDrawable(R.drawable.black));
                }else if (data == "Old") {
                    MainActivity.backPic.setBackground(getDrawable(R.drawable.old));
//                    startActivity(new Intent(SettingActivity.this, MainActivity.class));
                }
                else if (data == "Blue") {
                    MainActivity.backPic.setBackground(getDrawable(R.drawable.blue));
                } else if (textData == "Red") {
                    MainActivity.top.setTextColor(getColor(R.color.red));
                    MainActivity.bottom.setTextColor(getColor(R.color.red));

                }
                else if (textData == "White") {
                    MainActivity.top.setTextColor(getColor(R.color.white));
                    MainActivity.bottom.setTextColor(getColor(R.color.white));


                }


//+
            }
        });


    }

}

