package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText FirstNumber;
    private EditText SecondNumber;
    private Button Add;
    private Button Subs;
    private Button Multiply;
    private Button Division;
    private TextView Result;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstNumber=(EditText) findViewById(R.id.num1);
        SecondNumber=(EditText) findViewById(R.id.num2);
        Add=(Button) findViewById(R.id.addbtn);
        Subs=(Button) findViewById(R.id.subsbtn);
        Multiply=(Button) findViewById(R.id.multibtn);
        Division=(Button) findViewById(R.id.dividebtn);
        Result=(TextView) findViewById(R.id.result);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(FirstNumber.getText().toString());
                int num2=Integer.parseInt(SecondNumber.getText().toString());
                int Output=num1+num2;
                Result.setText("Answer:"+Output);
            }
        });
        Subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(FirstNumber.getText().toString());
                int num2=Integer.parseInt(SecondNumber.getText().toString());
                int Output=num1-num2;

                Result.setText("Answer:"+Output);
            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(FirstNumber.getText().toString());
                int num2=Integer.parseInt(SecondNumber.getText().toString());
                int Output=num1*num2;

                Result.setText("Answer:"+Output);
            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Integer.parseInt(FirstNumber.getText().toString());
                float num2=Integer.parseInt(SecondNumber.getText().toString());
                float Output=num1/num2;

                Result.setText("Answer:"+Output);
            }
        });
    }
}