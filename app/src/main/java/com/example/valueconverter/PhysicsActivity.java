package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.Math;

public class PhysicsActivity extends AppCompatActivity {

    private double velocity = 0, angle = 0, height1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
    }

    private void getVelocity(View view){
        TextView eText = (TextView) findViewById(R.id.VelocityEdit);
        velocity = Double.parseDouble(eText.getText().toString());
    }

    private void getAngle(View view){
        TextView eText = (TextView) findViewById(R.id.AngleEdit);
        angle = Double.parseDouble(eText.getText().toString());
    }

    private void getHeight1(View view){
        TextView eText = (TextView) findViewById(R.id.HeightEdit);
        height1 = Double.parseDouble(eText.getText().toString());
    }

    private double calculateTime(View view){
        double t = 0;
        t = -velocity*Math.sin(angle*(Math.PI/180)) + Math.sqrt(Math.pow(velocity*Math.sin(angle*(Math.PI/180)),2) - 2*(-9.81)*(height1));
        TextView eText = (TextView) findViewById(R.id.Time);
        eText.setText(Double.toString(t)+ " is the flight time");
        return t;
    }

    private void calculateDistance(View view){
        double d = 0;
        d = velocity*Math.cos(angle*(Math.PI/180)*calculateTime(view));
        TextView eText = (TextView) findViewById(R.id.Distance);
        eText.setText(Double.toString(d)+ " is the distance travelled");
    }

    private void calculateMaxHeight(View view){
        double hmax = 0;
        hmax = (Math.pow(velocity,2)*Math.pow(Math.sin(angle*(Math.PI/180)),2))/(2*9.81);
        TextView eText = (TextView) findViewById(R.id.MaxHeight);
        eText.setText(Double.toString(hmax) + " is the max height");
    }

    public void btnClick(View view){
        calculateDistance(view);
        calculateTime(view);
        calculateMaxHeight(view);
    }


}
