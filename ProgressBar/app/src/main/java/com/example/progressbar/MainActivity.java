package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar myprogressbar = (ProgressBar)findViewById(R.id.myprogressbar);
        final TextView myprogresstext = (TextView) findViewById(R.id.myprogresstext);
        Button mybutton = (Button) findViewById(R.id.mybutton);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=2;i<=100;i++)
                {
                        myprogressbar.setProgress(i);
                        myprogresstext.setText(Integer.toString(i));
                }

            }
        });

    }
}
