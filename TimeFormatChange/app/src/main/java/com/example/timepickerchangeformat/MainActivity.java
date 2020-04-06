package com.example.timepickerchangeformat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.timepickerchangeformat.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybtn = (Button) findViewById(R.id.mybtn);
        final TimePicker mytimepicker = (TimePicker) findViewById(R.id.mytimepicker);
        mytimepicker.setIs24HourView(true);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer hour = mytimepicker.getCurrentHour();
                Integer min = mytimepicker.getCurrentMinute();
                String timeset = "";
                if(hour > 12)
                {
                    hour = hour - 12;
                    timeset = "PM";
                }
                else if (hour ==  0){
                    hour = hour + 12;
                    timeset = "AM";
                }
                else if (hour == 12)
                {
                    timeset = "PM";
                }
                else{
                    timeset = "AM";
                }
                Toast.makeText(getApplicationContext(),Integer.toString(hour)+" "+Integer.toString(min)+" "+timeset,Toast.LENGTH_LONG).show();
            }
        });



    }
}
