package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
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
        RadioGroup toRadio = findViewById(R.id.convertRadioGroup);
        convertTypeTo = ((RadioButton) findViewById(toRadio.getCheckedRadioButtonId())).getText().toString().toLowerCase();
        TextView resultText = findViewById(R.id.convertResultText);
        switch(convertTypeFrom){
            case "torr":
                if (convertTypeTo.equals("torr")){
                    resultText.setText("Bitch thats the same unit");
                }
        }
    }




}



