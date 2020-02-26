package com.example.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybtn = (Button)findViewById(R.id.mybtn);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePicker mytime = (TimePicker) findViewById(R.id.mytime);
                int hour = mytime.getCurrentHour();
                int min = mytime.getCurrentMinute();
                String data = Integer.toString(hour)+Integer.toString(min);
                Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG).show();
            }
        });
    }
}
