package com.example.q6week6plust1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ta1 = (Button) findViewById(R.id.ta1);
        Button ta2 = (Button) findViewById(R.id.ta2);
        Button ta3 = (Button) findViewById(R.id.ta3);
        Button tb1 = (Button) findViewById(R.id.tb1);
        Button tb2 = (Button) findViewById(R.id.tb2);
        Button tb3 = (Button) findViewById(R.id.tb3);
        Button reset = (Button) findViewById(R.id.reset);
        TextView tascore = (TextView) findViewById(R.id.tascore);
        TextView tbscore = (TextView) findViewById(R.id.tbscore);
        ta1.setOnClickListener(this);
        ta2.setOnClickListener(this);
        ta3.setOnClickListener(this);
        tb1.setOnClickListener(this);
        tb2.setOnClickListener(this);
        tb3.setOnClickListener(this);
        reset.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        TextView tascore = (TextView) findViewById(R.id.tascore);
        TextView tbscore = (TextView) findViewById(R.id.tbscore);

        switch (v.getId()){
            case R.id.ta1:
                Integer newScore1 = Integer.parseInt(tascore.getText().toString());
                newScore1+=1;
                tascore.setText(Integer.toString(newScore1));
                break;
            case R.id.tb1:
                Integer newScore2 = Integer.parseInt(tbscore.getText().toString());
                newScore2+=1;
                tbscore.setText(Integer.toString(newScore2));
                break;
            case R.id.reset:
                tascore.setText("0");
                tbscore.setText("0");
        }
    }
}
