// MainActivity.java
package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        add.setOnClickListener(view -> calculate('+'));
        subtract.setOnClickListener(view -> calculate('-'));
        multiply.setOnClickListener(view -> calculate('*'));
        divide.setOnClickListener(view -> calculate('/'));
    }

    private void calculate(char operator) {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        if (s1.isEmpty() || s2.isEmpty()) {
            result.setText("숫자를 입력하세요");
            return;
        }
        
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);
        double res = 0;

        switch (operator) {
            case '+': res = n1 + n2; break;
            case '-': res = n1 - n2; break;
            case '*': res = n1 * n2; break;
            case '/':
                if (n2 == 0) {
                    result.setText("0으로 나눌 수 없습니다");
                    return;
                }
                res = n1 / n2; 
                break;
        }
        result.setText("결과: " + res);
    }
}
