package com.example.applicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.button:
                    // do your code
                    Intent intent = new Intent(getApplicationContext(), SecondFragment.class);
                    startActivity(intent);
                    break;

                case R.id.buttonSecondeCarte:
                    // do your code
                    Intent intent2 = new Intent(getApplicationContext(), ThirdFragment.class);
                    startActivity(intent2);
                    break;

                default:
                    System.out.println("Une erreur s'est produit ");
                    break;
            }

        }
    private void showError() {
        Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
    }
}
