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
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        fold.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    int one = Integer.parseInt(String.valueOf(firstNumber.getText()));
                    int two = Integer.parseInt(String.valueOf(secondNumber.getText()));
                    startActivity(intent);
                } catch (Exception ex) {
                    AlertDialog.Builder message = new AlertDialog.Builder(MainActivity.this);
                    message.setTitle("Ошибка");
                    message.setMessage("Неверные входные данные, введите еще раз");
                    message.setPositiveButton("Ок", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    message.show();
                }
            }
        });
    }
}
