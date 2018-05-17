package com.example.oddoreven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "main activity";

    private TextView mDisplayNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get reference to number
        mDisplayNumber = (TextView) findViewById(R.id.numberTextView);

        // get ref to result text
        TextView displayResult = (TextView) findViewById(R.id.numberTextView);

        //get references to odd button and setup the click listener
        Button oddButton = (Button) findViewById(R.id.oddButton);
        oddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // get references to even  and setup the click listener
        Button evenButton = (Button) findViewById(R.id.evenButton);
        evenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // get again button and setup the click listener
        Button againButton = (Button) findViewById(R.id.againButton);
        againButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberGenerator();
            }
        });

        // generate first number
        numberGenerator();
    }

    // method to generate a random number
    void numberGenerator() {
        Random r = new Random();
        int low = 1;
        int high = 99;
        int result = r.nextInt(high) + low;

        Log.d(TAG, "new number: " + result);

        String displayNumberAsString = Integer.toString(result);
        mDisplayNumber.setText(displayNumberAsString);

    }
}
