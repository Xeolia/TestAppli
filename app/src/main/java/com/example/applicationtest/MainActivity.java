package com.example.applicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
        Button one = (Button) findViewById(R.id.button);
        one.setOnClickListener(this);
       // this.button= findViewById(R.id.button);
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                // do your code
                Intent intent = new Intent(getApplicationContext(),SecondFragment.class);
                startActivity(intent);
                break;

            case R.id.button2:
                // do your code
                Intent intent2 = new Intent(getApplicationContext(),ThirdFragment.class);
                startActivity(intent2);
                break;

            default:
                System.out.println("Une erreur s'est produit ");
                break;
        }

    }
}
