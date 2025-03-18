package com.example.edittext_test2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private EditText eName, ePassword, ePhone;

    private Button eButton;

    private TextView eTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        eName =(EditText) findViewById(R.id.edittext);
        ePassword = (EditText) findViewById(R.id.edit_password);
        ePhone = (EditText) findViewById(R.id.edit_phone);
        eButton = (Button) findViewById(R.id.button);
        eTextView = (TextView) findViewById(R.id.textView);

    }

    public void onClicked(View view) {

        String name = eName.getText().toString();
        String password = ePassword.getText().toString();
        String phone = ePhone.getText().toString();
        eTextView.setText("아이디: " + name + "\n" + "패스워드: " + password + "\n" + "전화번호: " + phone);
    }



}