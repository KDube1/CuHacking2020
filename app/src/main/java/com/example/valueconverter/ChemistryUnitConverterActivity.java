package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.math.*;

public class ChemistryUnitConverterActivity extends AppCompatActivity {
    String convertTypeFrom;
    String convertTypeTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_unit_converter);


    }


    public void goConvert(View view){
        RadioGroup typeRadio = findViewById(R.id.pressureUnitRadioGroup);
        convertTypeFrom = ((RadioButton) findViewById(typeRadio.getCheckedRadioButtonId())).getText().toString().toLowerCase();

        switch(convertTypeFrom){
            case "torr":
                Toast toast=Toast. makeText(getApplicationContext(),"this shit works",Toast. LENGTH_SHORT);
                toast. setMargin(50,50);
                toast. show();
        }
    }




}



