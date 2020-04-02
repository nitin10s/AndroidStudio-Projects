package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox pizza = (CheckBox) findViewById(R.id.pizza);
                CheckBox burger = (CheckBox) findViewById(R.id.burger);
                CheckBox coca = (CheckBox) findViewById(R.id.coca);
                Integer price = 0;
                String message = "";
                if(pizza.isChecked())
                {
                    message = message + "pizza\n";
                    price = price + 100;
                }
                if(burger.isChecked())
                {
                    message = message + "burger\n";
                    price = price + 200;
                }
                if(coca.isChecked())
                {
                    message = message + "coca\n";
                    price = price + 50;
                }
                message =  message + Integer.toString(price);
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
