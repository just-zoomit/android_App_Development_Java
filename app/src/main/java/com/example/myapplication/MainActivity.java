package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set Screen Title
        setTitle("Home");
        Log.d("fail", "it's not working");

    }

    public void launchSettings(View v){
        //launch a new activity
        Intent i = new Intent(this,SettingsActivity.class);

        //Pass input data to second screen
        String message = ((EditText) findViewById(R.id.editSettingText)).getText().toString();
        i.putExtra("World",message);
        startActivity(i);

    }

    //Get User Input and log to console and display as Alert
    public void handleText(View changeText){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();

        //Display input in text View
        ((TextView) findViewById(R.id.output)).setText(input);
        // Alert Example
        //Toast.makeText(this, "Alert",Toast.LENGTH_LONG).show();
        // Display Input as alert
        Toast.makeText(this, input,Toast.LENGTH_LONG).show();
        Log.d("info: ",input);
    }

    // onClick Handler defined as disable
    public void disable (View buttonView){

        findViewById(R.id.button2).setEnabled(false);
        ((Button) findViewById(R.id.button2)).setText("New New Disabled");
        Log.d("success", "Change Disabled View");

        /*
        findViewById(R.id.button2).setEnabled(false);
        Button myButton = (Button) myView;
        myButton.setText("New Disabled");
        */
    }

    // onClick Handler defined as disable
    public void disableVoid (View buttonView){

        buttonView.setEnabled(false);
        Button myButton = (Button) buttonView;
        myButton.setText("Disabled");
        Log.d("success", "Button Disabled");
    }

}