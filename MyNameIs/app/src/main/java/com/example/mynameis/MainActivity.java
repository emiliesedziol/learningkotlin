package com.example.mynameis;
// exercise by Simon Howard
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button analysisButton = (Button) findViewById(R.id.analysisButton);

        analysisButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                //get name
                EditText nameCtrl = (EditText) findViewById(R.id.userName);
                Editable userName = nameCtrl.getText();

                // get interests
                EditText interstCtrl = (EditText) findViewById(R.id.userInterests);
                Editable userInterest = interstCtrl.getText();

                // form analysis string
                String resultText = "Your Name is" + userName + " and interest " + userInterest;

                // display analysis
                TextView result = (TextView) findViewById(R.id.results);
                result.setText(resultText);
            }
        });


    }
}
