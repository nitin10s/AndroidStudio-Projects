package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn2.setOnClickListener(new OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }

        });

        btn3.setOnClickListener(new OnClickListener(){
            public void onClick(View view){
                Bundle bundle = getIntent().getExtras();
                String name = bundle.getString("name");
                String age = Integer.toString(bundle.getInt("age"));
                String data = name + " " + age;
                Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG).show();
            }
        });
    }
}
