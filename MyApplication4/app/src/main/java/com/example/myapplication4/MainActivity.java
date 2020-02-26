package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),ActivityTwo.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","joe");
                bundle.putInt("age",25);
                intent.putExtras(bundle);
                startActivity(intent);
                
            }
        });


    }
}
