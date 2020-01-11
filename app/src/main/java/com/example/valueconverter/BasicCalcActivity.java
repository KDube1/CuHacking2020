package com.example.valueconverter;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class BasicCalcActivity extends AppCompatActivity {

    private enum Operator {none,add,minus,multiply,divide}
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calc);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public void btn00Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }

    public void btn01Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");
    }

    public void btn02Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }

    public void btn03Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }

    public void btn04Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }

    public void btn05Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }

    public void btn06Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }

    public void btn07Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }

    public void btn08Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }

    public void btn09Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }

    public void btnAddClick(View view) {
        optr = Operator.add;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view) {
        optr = Operator.minus;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyClick(View view) {
        optr = Operator.multiply;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDivideClick(View view) {
        optr = Operator.divide;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearClick(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText("");
    }

    public void btnDotClick(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

    public void btnResultClick(View view){
        if(optr != Operator.none){
            EditText eText = (EditText) findViewBuId(R.id.resultEdit);
            data2 = Double.pareseDouble(eText.getText().toString());
            double result = 0;
            if(optr == Operator.add){
                result = data1+ data2;
            } else if (optr == Operator.minus){
                result = data1-data2;
            } else if (optr == Operator.multiply){
                result = data1*data2;
            } else if (optr ==  Operator.divide){
                result = data1/data2;
            }
            optr = Operator.none;
            data1 = reult;
            if((result- (int)result)!= 0){
                eText.setText(String.valueOf(result));
            }else{
                eText.setText(String.valueOf((int)result));
            }
        }
    }
}
