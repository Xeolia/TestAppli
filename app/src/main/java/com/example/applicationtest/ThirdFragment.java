package com.example.applicationtest;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdFragment extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_third);
        Button one = (Button) findViewById(R.id.buttonSecondeCarte);

 /*       one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(ThirdFragment.this, MainActivity.class);
                startActivity(intent);
            }
        });*/

    }
}

