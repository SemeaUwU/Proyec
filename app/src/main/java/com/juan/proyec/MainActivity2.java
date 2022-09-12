package com.juan.proyec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button btn_reg;
    EditText email_r,password_r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email_r = findViewById(R.id.Email_r);
        password_r = findViewById(R.id.Password_r);
        btn_reg = findViewById(R.id.btn_reg);


    }
}