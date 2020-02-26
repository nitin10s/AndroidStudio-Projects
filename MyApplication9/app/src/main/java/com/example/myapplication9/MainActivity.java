package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import  android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] myarr = {"C++","Java","Python"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myarr);
        final ListView listView = (ListView) findViewById(R.id.mylist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent,View view, int posistion, long id)
            {
                String value = parent.getItemAtPosition(posistion).toString()+ " " + Integer.toString(posistion);

                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();


            }
        });
    }
}
