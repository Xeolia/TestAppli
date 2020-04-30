package com.example.applicationtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyNewActivity extends AppCompatActivity {
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
        Button one = (Button) findViewById(R.id.button);
        one.setOnClickListener((View.OnClickListener) button);
        // this.button= findViewById(R.id.button);
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener((View.OnClickListener) button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //finish();
            }
        });
    }
}