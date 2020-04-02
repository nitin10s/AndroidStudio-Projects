package com.example.radioandcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogrp);
        final CheckBox android = (CheckBox)findViewById(R.id.android);
        final CheckBox python = (CheckBox) findViewById(R.id.python);
        final CheckBox javascript = (CheckBox) findViewById(R.id.javascript);
        final Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = "";
                if(radioGroup.getCheckedRadioButtonId()==-1){
                    res = res + "";
                }
                else{
                    final RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                    res = res + radioButton.getText().toString();
                }
                if(android.isChecked())
                {
                    res = res + " " + android.getText().toString();
                }
                if (python.isChecked())
                {
                    res = res + " " + python.getText().toString();
                }
                if (javascript.isChecked())
                {
                    res = res + " " + javascript.getText().toString();
                }
                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();
            }
        });
    }

}
