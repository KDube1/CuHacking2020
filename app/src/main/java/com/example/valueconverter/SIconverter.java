package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.Menu;

public class SIconverter extends AppCompatActivity {
    String convertTypeFrom;
    String convertTypeTo;
    TextView valueEntered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siconverter);
    }

    public void goConvert(View view){
        RadioGroup typeRadio = findViewById(R.id.OriginalUnit);
        convertTypeFrom = ((RadioButton) findViewById(typeRadio.getCheckedRadioButtonId())).getText().toString().toLowerCase();
        RadioGroup toRadio = findViewById(R.id.convertRadioGroup);
        convertTypeTo = ((RadioButton) findViewById(toRadio.getCheckedRadioButtonId())).getText().toString().toLowerCase();
        TextView SIresultText = findViewById(R.id.convertResultText);
        valueEntered = (TextView) findViewById(R.id.InputNumber);
        switch(convertTypeFrom){
            case "cm":
                if (convertTypeTo.equals("cm")) {
                    SIresultText.setText("That's the same unit!");
                }
                else if (convertTypeFrom.equals("m")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 100;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("km")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 100000;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("in")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 2.54;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("ft")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 30.48;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("mi")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 160934;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
            case "m":
                if (convertTypeTo.equals("m")) {
                    SIresultText.setText("That's the same unit!");
                }
                else if (convertTypeFrom.equals("cm")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 100;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("km")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 1000;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("in")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 39.37;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("ft")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 3.281;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("mi")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 1609;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
            case "km":
                if (convertTypeTo.equals("km")) {
                    SIresultText.setText("That's the same unit!");
                }
                else if (convertTypeFrom.equals("cm")) {
                double original = Double.parseDouble(valueEntered.getText().toString());
                double converted = original * 100000;
                TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("m")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 1000;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("in")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 39307;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("ft")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 3281;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("mi")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 1.609;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
            case "in":
                if (convertTypeTo.equals("in")) {
                    SIresultText.setText("That's the same unit!");
                }
                else if (convertTypeFrom.equals("cm")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 2.54;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("m")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 39.37;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("km")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 39370;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("ft")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 12;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("mi")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 63360;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
            case "ft":
                if (convertTypeTo.equals("ft")) {
                    SIresultText.setText("That's the same unit!");
                }
                else if (convertTypeFrom.equals("cm")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 30.48;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("m")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 3.81;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("km")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 3281;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("in")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 12;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("mi")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original / 5280;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
            case "mi":
                if (convertTypeTo.equals("mi")) {
                    SIresultText.setText("That's the same unit!");
                }
                else if (convertTypeFrom.equals("cm")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 160934;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("m")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 1609;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("km")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 1.609;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("in")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 63360;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
                else if (convertTypeFrom.equals("ft")) {
                    double original = Double.parseDouble(valueEntered.getText().toString());
                    double converted = original * 5280;
                    TextView convertedText = (TextView) findViewById(R.id.SIresultText);
                    convertedText.setText(Double.toString(converted));
                }
        }
    }
}
