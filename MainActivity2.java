package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = findViewById(R.id.result);

        int one = getIntent().getExtras().getInt("one");
        int two = getIntent().getExtras().getInt("two");
        int result3 = one + two;
        if(two < 0){
            result.setText(String.valueOf(one) + " + " + "(" + String.valueOf(two) + ")" + " = " + String.valueOf(result3));

        }
        else{
            result.setText(String.valueOf(one) + " + " + String.valueOf(two) + " = " + String.valueOf(result3));
        }
    }
}
