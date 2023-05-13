package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class SettingActivity extends AppCompatActivity {
//    LinearLayout cov;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

//        cov = findViewById(R.id.cover);
        confirm = findViewById(R.id.confirm);

        // Declaring and initializing the Spinner from the layout file
        Spinner mSpinner = findViewById(R.id.spinner_1);
        Spinner mSpinner2 = findViewById(R.id.spinner_2);

        // Create a list to display in the Spinner
        List<String> mList = Arrays.asList("Red", "Blue", "Green");
        List<String> mList2 = Arrays.asList("dark", "Light", "Green");

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
                if(data.equals("Red")){
//
                } else if (data.equals("Blue")) {

//

                }

            }
        });


    }

}

