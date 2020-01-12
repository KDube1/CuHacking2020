package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button basicCalcButton = findViewById(R.id.basicCalculatorButton);
        Button chemButton = findViewById((R.id.chemConverterButton));
       basicCalcButton.setOnClickListener((View v)->{
            Intent switchActivity = new Intent(this, BasicCalcActivity.class);
            startActivity(switchActivity);
        });

        Button unitConverterButton = findViewById(R.id.unitConverterButton);
        unitConverterButton.setOnClickListener((View v)->{
            Intent switchActivity = new Intent(this, SIconverter.class);
            startActivity(switchActivity);
        });

        chemButton.setOnClickListener((View v)->{
            Intent switchActivity = new Intent(this,ChemistryUnitConverterActivity.class);
            startActivity(switchActivity);
        });



       Button projectileCalcButton = findViewById(R.id.projectileCalcButton);
        projectileCalcButton.setOnClickListener((View v)->{
           Intent switchActivity = new Intent(this, PhysicsActivity.class);
           startActivity(switchActivity);
        });

    }


}