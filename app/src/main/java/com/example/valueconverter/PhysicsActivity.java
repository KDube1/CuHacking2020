package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.Math;

public class PhysicsActivity extends AppCompatActivity {

    private double velocity = 0.0, angle = 0.0, height1 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
    }

    private double getVelocity(){
        TextView eText = findViewById(R.id.VelocityEdit);
        velocity = Double.parseDouble(eText.getText().toString());
        return velocity;
    }

    private double getAngle(){
        TextView eText = findViewById(R.id.AngleEdit);
        angle = Double.parseDouble(eText.getText().toString());
        return angle;
    }

    private double getHeight1(){
        TextView eText = findViewById(R.id.HeightEdit);
        height1 = Double.parseDouble(eText.getText().toString());
        return height1;
    }

    private double calculateTime(){
        double vY = getVelocity() * Math.sin(getAngle()*(Math.PI/180));

        double t = (vY + (Math.sqrt(Math.pow(vY,2)+2*9.81*getHeight1())))/9.81;
        TextView eText = findViewById(R.id.Time);
        eText.setText(t + " is the flight time");
        return t;
    }

    private void calculateDistance(){
        double vX = getVelocity() * Math.cos(getAngle()*(Math.PI/180));

        double d = vX * calculateTime();
        TextView eText = findViewById(R.id.Distance);
        eText.setText(d + " is the distance travelled");
    }

    private void calculateMaxHeight(){
        double vY = getVelocity() * Math.sin(getAngle()*(Math.PI/180));
        double hMax = getHeight1() +(Math.pow(vY,2))/(2*9.81);
        TextView eText = findViewById(R.id.MaxHeight);
        eText.setText(hMax + " is the max height");
    }

    public void btnClick(View view){
        calculateDistance();
        calculateTime();
        calculateMaxHeight();
    }


}