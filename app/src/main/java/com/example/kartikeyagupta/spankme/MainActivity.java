package com.example.kartikeyagupta.spankme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    int count = 0;
    Button button1;
    TextView abc ;
    EditText inp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abc = (TextView) findViewById(R.id.textView2);
        inp =  (EditText) findViewById(R.id.input)  ;  }


    public void addone (View v) {

        count++;
        abc.setText(Integer.toString(count));
    }
    public void subtractone (View v) {

        count--;
        abc.setText(Integer.toString(count));
    }
    public void reset (View v) {

        count=0;
        abc.setText(Integer.toString(count));
    }
    public void manualadd (View v) {
int a ;
String b =inp.getText().toString();
a= Integer.parseInt(b);
        count=count+a;
        abc.setText(Integer.toString(count));
    }
    public void subtractfive (View v) {

        count=count-5;
        abc.setText(Integer.toString(count));
    }public void subtractten (View v) {

        count=count-10;
        abc.setText(Integer.toString(count));
    }public void addfive (View v) {

        count=count+5;
        abc.setText(Integer.toString(count));
    }public void addten (View v) {

        count=count+10;
        abc.setText(Integer.toString(count));
    }
}

