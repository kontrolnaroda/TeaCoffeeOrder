package com.example.teacoffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
private EditText editTextPersonName;
private EditText editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextPassword = findViewById(R.id.editTextTextPassword);

    }

    public void doOrder(View view) {
        String name = editTextPersonName.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if (!name.isEmpty() && !password.isEmpty()) {

            Intent intent = new Intent(this, OrderActivity.class);
            startActivity(intent);
        }else{
Toast toast = Toast.makeText(LoginActivity.this,"Все поля должны быть заполнены!", Toast.LENGTH_SHORT);

            toast.show();
        }
}}