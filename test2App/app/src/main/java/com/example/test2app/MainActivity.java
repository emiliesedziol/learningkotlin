package com.example.test2app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myButton = (Button) findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView myTextView = (TextView) findViewById(R.id.textView);

                myTextView.setTextColor(0xFF00FF00);
            }
        });

        Button changeTextButton = (Button) findViewById(R.id.textButton_id);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView myTextView = (TextView) findViewById(R.id.textView);

                myTextView.setText("this is the new text");
                myTextView.setBackgroundColor(0xFFe2f442);
                myTextView.setTextSize(20);
            }
        });
    }
}
