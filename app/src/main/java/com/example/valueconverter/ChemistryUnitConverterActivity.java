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
        TextView convertValue = findViewById(R.id.chemInputText);
        Double resultValue = Double.parseDouble(convertValue.getText().toString());
        switch(convertTypeFrom){
            case "torr":
                if (convertTypeTo.equals("torr")) {
                    resultText.setText("You are converting the same unit");

                }else if (convertTypeTo.equals("pascals")) {
                    double returnValue = resultValue*133.322;
                    resultText.setText("" + returnValue);
                }else if (convertTypeTo.equals("atmospheres")) {
                    double returnValue = resultValue*0.00131579;
                    resultText.setText("" + returnValue);
                }
                break;
            case "pascals":
                if (convertTypeTo.equals("pascals")) {
                    resultText.setText("You are converting the same unit");
                } else if (convertTypeTo.equals("torr")){
                    double returnValue = resultValue * 0.007501;
                    resultText.setText("" + returnValue);
                } else if (convertTypeTo.equals("atmospheres")) {
                    double returnValue = resultValue /101325;
                    resultText.setText("" + returnValue);
                }
                break;
            case "atmospheres":
                if (convertTypeTo.equals("atmospheres")) {
                    resultText.setText("You are converting the same unit");
                } else if (convertTypeTo.equals("torr")) {
                    double returnValue = resultValue * 760;
                    resultText.setText("" + returnValue);
                } else if (convertTypeTo.equals("pascals")) {
                    double returnValue = resultValue * 101325;
                    resultText.setText("" + returnValue);
                }
                break;
        }


    }

}








