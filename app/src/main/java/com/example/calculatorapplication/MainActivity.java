package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText mEditText1, mEditText2;
    private TextView mResultTextView;
    private Button mButtonAdd;
    private Button mButtonSubtract;
    private Button mButtonMultiply;
    private Button mButtonDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = findViewById(R.id.first);
        mEditText2 = findViewById(R.id.second);
        mResultTextView = findViewById(R.id.result);
        mButtonAdd = findViewById(R.id.buttonadd);
        mButtonSubtract=findViewById(R.id.buttonsubtract);
        mButtonMultiply=findViewById(R.id.buttonmultiply);
        mButtonDivision=findViewById(R.id.buttondivision);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int sum = num1 + num2;
                mResultTextView.setText(String.valueOf(sum));
            }
        });
        mButtonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int sub = num1 - num2;
                mResultTextView.setText(String.valueOf(sub));
            }
        });
        mButtonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(mEditText1.getText().toString());
                double num2 = Double.parseDouble(mEditText2.getText().toString());
                double mul = num1 * num2;
                mResultTextView.setText(String.valueOf(mul));
            }
        });
        mButtonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(mEditText1.getText().toString());
                double num2 = Double.parseDouble(mEditText2.getText().toString());
                double div = num1 / num2;
                mResultTextView.setText(String.valueOf(div));
            }
        });
    }

}