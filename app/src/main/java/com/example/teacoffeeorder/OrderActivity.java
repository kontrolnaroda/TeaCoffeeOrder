package com.example.teacoffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
private TextView textViewHello;
private RadioButton radioButtonTea;
private  RadioButton radioButtonCoffee;
private  TextView textViewAdditions;
private CheckBox checkBoxMilk;
private CheckBox checkBoxSugar;
private CheckBox checkBoxLemon;
private Spinner spinnerTea;
private  Spinner spinnerCoffee;

private String name;
private  String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        if (intent.hasExtra("name") && intent.hasExtra("password")) {
            name = intent.getStringExtra("name");
            password = intent.getStringExtra("password");
        }else {
            name = getString(R.string.defalte_name);
            password = getString(R.string.defalte_password);
        }
        textViewHello = findViewById(R.id.textViewHello);
        String hello = String.format(getString(R.string.hellow_klient), name);
        radioButtonTea = findViewById(R.id.radiobuttonTea);
        radioButtonCoffee = findViewById(R.id.radiobuttonCoffee);
        textViewAdditions = findViewById(R.id.textViewAdditions);
        checkBoxMilk = findViewById(R.id.checkboxMilk);
        checkBoxSugar = findViewById(R.id.checkboxSugar);
        checkBoxLemon = findViewById(R.id.checkboxLemon);
        spinnerTea = findViewById(R.id.spinnerTea);
        spinnerCoffee = findViewById(R.id.spinnerCoffee);


        textViewHello.setText(hello);
    }

    public void onClickChangeButton(View view) {

    }
}