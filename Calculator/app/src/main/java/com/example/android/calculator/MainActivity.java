package com.example.android.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.calculator.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    TextView mResult;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnMul;
    Button btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mResult = (TextView)findViewById(R.id.result);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);

    }

    public void display(View view){
        Button btn = (Button)view;
        int id = btn.getId();
        String name = getResources().getResourceEntryName(id);
        switch (name){
            case "btn0":
                mResult.setText(mResult.getText() + "0");
                break;
            case "btn1":
                mResult.setText(mResult.getText() + "1");
                break;
            case "btn2":
                mResult.setText(mResult.getText() + "2");
                break;
            case "btn3":
                mResult.setText(mResult.getText() + "3");
                break;
            case "btn4":
                mResult.setText(mResult.getText() + "4");
                break;
            case "btn5":
                mResult.setText(mResult.getText() + "5");
                break;
            case "btn6":
                mResult.setText(mResult.getText() + "6");
                break;
            case "btn7":
                mResult.setText(mResult.getText() + "7");
                break;
            case "btn8":
                mResult.setText(mResult.getText() + "8");
                break;
            case "btn9":
                mResult.setText(mResult.getText() + "9");
                break;
            case "btnMul":
                mResult.setText(mResult.getText() + " * ");
                break;
            case "btnDiv":
                mResult.setText(mResult.getText() + " / ");
                break;
            case "btnAdd":
                mResult.append(" + ");
                break;
            case "btnSub":
                mResult.append(" - ");
                break;

        }
    }

    public void clearScreen(View view){
        mResult.setText("");
    }
    public void calculate(View view){
        double x1,x2;
        String[] separated = mResult.getText().toString().split(" ");
        x1 = Double.parseDouble(separated[0]);
        x2 = Double.parseDouble(separated[2]);
        String operation = separated[1];
        mResult.setText("");
        switch (operation){
            case "+":
                mResult.append(""+(x1+x2));
                break;
            case "-":
                mResult.append(""+(x1-x2));
                break;
            case "/":
                mResult.append(""+(x1/x2));
                break;
            case "*":
                mResult.append(""+(x1*x2));
                break;
        }


    }
}
