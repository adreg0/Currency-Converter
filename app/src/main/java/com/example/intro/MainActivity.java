package com.example.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editNum);
        textView2=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int a= Integer.parseInt(s);
                float inr=a*72.74f;
                textView2.setText(a+" "+"USD"+" "+"in INR is "+ inr);
                Toast.makeText(MainActivity.this, "Thanks for using the app :)", Toast.LENGTH_SHORT).show();

            }
        });










    }
}