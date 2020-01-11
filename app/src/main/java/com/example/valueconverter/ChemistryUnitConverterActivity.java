package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;

import java.math.*;

public class ChemistryUnitConverterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_unit_converter);

        addListenerOnSpinnerItemSelection();
        addListenerOnButton();
    }


}
