package com.lutful.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edWeight, edFeet, edInch;
    Button buttonCal;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edWeight = findViewById(R.id.edWeight);
        edFeet = findViewById(R.id.edFeet);
        edInch = findViewById(R.id.edInch);
        buttonCal = findViewById(R.id.buttonCal);
        tvResult = findViewById(R.id.tvResult);


        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String sWeight = edWeight.getText().toString();
            String sFeet = edFeet.getText().toString();
            String sInch = edInch.getText().toString();

            float weight = Float.parseFloat(sWeight);
            float feet = Float.parseFloat(sFeet);
            float inch = Float.parseFloat(sInch);

            float height = (float) (feet*0.3048 + inch*0.0254);
            float bmiIndex = weight/(height*height) ;

            tvResult.setText("Your BMI Index is: "+bmiIndex);


            }
        });

    }
}