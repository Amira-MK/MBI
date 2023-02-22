package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // calculate the bmi and display it
        EditText weight = findViewById(R.id.editweight);
        EditText height = findViewById(R.id.editheight);
        TextView result = findViewById(R.id.txt);
        ImageView image = findViewById(R.id.image);
        Button calculate = findViewById(R.id.btn);
        calculate.setOnClickListener(v -> {
            double w = Double.parseDouble(weight.getText().toString());
            double h = Double.parseDouble(height.getText().toString());
            double bmi = w / (h * h);
            result.setText(String.valueOf(bmi));
            if (bmi < 18.5) {
                result.setText("Underweight");
                image.setImageResource(R.drawable.maigreur);

            } else if (bmi >= 18.5 && bmi < 25) {
                result.setText("Normal");
                image.setImageResource(R.drawable.normal);
            } else if (bmi >= 25 && bmi < 30) {
                result.setText("Overweight");
                image.setImageResource(R.drawable.obesite);
            } else if (bmi >= 30) {
                result.setText("Obese");
                image.setImageResource(R.drawable.obesitesevere);
            }
        });













    }
}