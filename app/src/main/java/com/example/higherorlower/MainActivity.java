package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int random_number;


    public void guess(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        int guessvalue = Integer.parseInt(editText.getText().toString());
        String message;
        if (guessvalue > random_number) {

            message = "Lower";

        } else if (guessvalue < random_number) {

            message = "Higher";
        } else {
            message = "BINGO YOU HAVE GOT IT BUDDY";
        }
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();
        Log.i("Entered Value", editText.getText().toString());
        Log.i("Random Number", Integer.toString(random_number));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Random rand = new Random();
        random_number = rand.nextInt(20)+1;
            }
}
