package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    Button fold;
    EditText firstNumber;
    EditText secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fold = findViewById(R.id.fold);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);

        fold.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int one = Integer.parseInt(firstNumber.getText().toString());
                int two = Integer.parseInt(secondNumber.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("first", one);
                intent.putExtra("second", two);
                startActivity(intent);
            }
        });
    }
}