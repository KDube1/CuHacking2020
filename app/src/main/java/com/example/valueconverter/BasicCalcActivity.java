package com.example.valueconverter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.type.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BasicCalcActivity extends AppCompatActivity {
    private static final String TAG = "BasicCalcActivity";
    private enum Operator {none,add,minus,multiply,divide}
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;
    private Map<String, Object> sendToDB = new HashMap<>();
    private Map<String, Object> dbTime = new HashMap<>();
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calc);

    }


    public void btn00Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }

    public void btn01Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");
    }

    public void btn02Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }

    public void btn03Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }

    public void btn04Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }

    public void btn05Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }

    public void btn06Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }

    public void btn07Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }

    public void btn08Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }

    public void btn09Click(View view){
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }

    public void btnAddClick(View view) {
        optr = Operator.add;
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view) {
        optr = Operator.minus;
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyClick(View view) {
        optr = Operator.multiply;
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDivideClick(View view) {
        optr = Operator.divide;
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearClick(View view) {
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText("");
    }

    public void btnDotClick(View view) {
        TextView eText = (TextView) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

    public void btnResultClick(View view){
        String eqnToSend;
        if(optr != Operator.none){
            TextView eText = (TextView) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if(optr == Operator.add){
                result = data1+ data2;
                eqnToSend = Double.toString(data1) + " + " + Double.toString(data2) + " = " +
                        Double.toString(result);
                String uniqueID = UUID.randomUUID().toString();
                sendToDB.put("equation", eqnToSend);
                db.collection("calculations").document(uniqueID)
                        .set(sendToDB)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });

                dbTime.put("timestamp",LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
                db.collection("calculations").document(uniqueID)
                        .update(dbTime)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });


            } else if (optr == Operator.minus){
                result = data1-data2;
                eqnToSend = Double.toString(data1) + " - " + Double.toString(data2) + " = " +
                        Double.toString(result);
                String uniqueID = UUID.randomUUID().toString();
                sendToDB.put("equation", eqnToSend);
                db.collection("calculations").document(uniqueID)
                        .set(sendToDB)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });
                dbTime.put("timestamp",LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
                db.collection("calculations").document(uniqueID)
                        .update(dbTime)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });

            } else if (optr == Operator.multiply){
                result = data1*data2;
                eqnToSend = Double.toString(data1) + " * " + Double.toString(data2) + " = " +
                        Double.toString(result);
                String uniqueID = UUID.randomUUID().toString();
                sendToDB.put("equation", eqnToSend);
                db.collection("calculations").document(uniqueID)
                        .set(sendToDB)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });

                dbTime.put("timestamp",LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
                db.collection("calculations").document(uniqueID)
                        .update(dbTime)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });

            } else if (optr ==  Operator.divide){
                result = data1/data2;
                eqnToSend = Double.toString(data1) + " / " + Double.toString(data2) + " = " +
                        Double.toString(result);
                String uniqueID = UUID.randomUUID().toString();
                sendToDB.put("equation", eqnToSend);
                db.collection("calculations").document(uniqueID)
                        .set(sendToDB)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });

                dbTime.put("timestamp",LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
                db.collection("calculations").document(uniqueID)
                        .update(dbTime)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });
            }

            optr = Operator.none;
            data1 = result;
            if((result- (int)result)!= 0){
                eText.setText(String.valueOf(result));
            }else{
                eText.setText(String.valueOf((int)result));
            }
        }
    }

    public void onHistoryClick(View view){
        Intent intent = new Intent(this, CalcHistoryActivity.class);
        startActivity(intent);
    }
}
