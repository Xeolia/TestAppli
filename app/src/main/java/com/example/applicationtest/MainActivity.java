package com.example.applicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        Button b1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button);
        // Set a click listener on that View
        button1.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent firstIntent = new Intent(MainActivity.this, MonSecondFragment.class);

                // Start the new activity
                startActivity(firstIntent);
            }
        });
        Button button2 = (Button) findViewById(R.id.buttonSecondeCarte);
        // Set a click listener on that View
        button2.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent secondIntent = new Intent(MainActivity.this, ThirdFragment.class);

                // Start the new activity
                startActivity(secondIntent);
            }
        });
    }

   /* public void openButtonOne(View view) {
        Intent i2= new Intent(getApplicationContext(), SecondFragment.class);
        startActivity(i2);
    }

    public void openButtonTwo(View view) {
        Intent i3= new Intent(getApplicationContext(), ThirdFragment.class);
        startActivity(i3);
    }*/

}
