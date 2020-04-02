package com.example.togglewithimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton togglebtn = (ToggleButton) findViewById(R.id.togglebtn);
        final ImageView toggleimage = (ImageView) findViewById(R.id.toggleimage);
        togglebtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    toggleimage.setImageResource(R.drawable.off);
                }
                else{
                    toggleimage.setImageResource(R.drawable.on);
                }
            }
        });

    }
}
