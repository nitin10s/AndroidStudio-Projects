package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybtn1 = (Button)findViewById(R.id.mybtn1);
        Button mybtn2  = (Button) findViewById(R.id.mybtn2);
        mybtn1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                EditText myinput1  = (EditText)findViewById(R.id.myinput1);
                String data = myinput1.getText().toString();
                Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG).show();

            }
        });
        mybtn2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                EditText myinput1  = (EditText)findViewById(R.id.myinput1);
                myinput1.setText(null);
            }
        });

    }
}
