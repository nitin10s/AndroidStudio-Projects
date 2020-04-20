package com.androchunk.customspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner customSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customSpinner = findViewById(R.id.customSpinner);

        // create spinneritemlist for spinner

        ArrayList<CustomItems> customList = new ArrayList<>();
        customList.add(new CustomItems("Android", R.drawable.ic_android_black_24dp));
        customList.add(new CustomItems("School", R.drawable.ic_school_black_24dp));
        customList.add(new CustomItems("satisfied", R.drawable.ic_sentiment_very_satisfied_black_24dp));
        customList.add(new CustomItems("shopping_cart", R.drawable.ic_shopping_cart_black_24dp));
        customList.add(new CustomItems("whatshot", R.drawable.ic_whatshot_black_24dp));

        // create Adapter for spinner
        CustomAdapter customAdapter = new CustomAdapter(this, customList);

        if (customSpinner != null) {
            customSpinner.setAdapter(customAdapter);
            customSpinner.setOnItemSelectedListener(this);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        CustomItems items = (CustomItems) adapterView.getSelectedItem();
        Toast.makeText(this, items.getSpinnerText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
