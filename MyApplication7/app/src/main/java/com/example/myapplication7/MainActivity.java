package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import  android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybtn = (Button) findViewById(R.id.mybtn);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mytext = (TextView)findViewById(R.id.mytext);
                DatePicker mydate = (DatePicker)findViewById(R.id.mydate);
                String text = mydate.getDayOfMonth()+"/"+(mydate.getMonth()+1)+"/"+mydate.getYear();
                mytext.setText(text);
            }
        });
    }
}
