package com.example.kartikeyagupta.spankme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    Button button1;
    TextView abc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abc = (TextView) findViewById(R.id.textView2);
    }


    public void plus (View v) {

        count++;
        abc.setText(Integer.toString(count));
    }
}

