package com.example.barnista.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText first_number, second_number;
    private TextView result_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        first_number = (EditText)findViewById(R.id.first_number);
        second_number = (EditText)findViewById(R.id.second_number);
        result_number = (TextView)findViewById(R.id.result_number);
    }

    double firstNUM, secondNUM, resultNUM;

    public void vary(){
        firstNUM = Double.parseDouble(first_number.getText().toString());
        secondNUM = Double.parseDouble(second_number.getText().toString());
    }

    public void onClick_ADD (View v){
        try{
            vary();
            resultNUM = firstNUM + secondNUM;
            result_number.setText(Double.toString(resultNUM));
        }catch (Exception ex){
            result_number.setText(ex.toString());
        }
    }

    public void onClick_SUB (View v){
        try{
            vary();
            resultNUM = firstNUM - secondNUM;
            result_number.setText(Double.toString(resultNUM));
        }catch (Exception ex){
            result_number.setText(ex.toString());
        }
    }

    public void onClick_MUL (View v){
        try{
            vary();
            resultNUM = firstNUM * secondNUM;
            result_number.setText(Double.toString(resultNUM));
        }catch (Exception ex){
            result_number.setText(ex.toString());
        }
    }

    public void onClick_DIV (View v){
        try{
            vary();
            resultNUM = firstNUM / secondNUM;
            result_number.setText(Double.toString(resultNUM));
        }catch (Exception ex){
            result_number.setText(ex.toString());
        }
    }

    public void onClick_POW (View v){
        try{
            vary();
            resultNUM = Math.pow(firstNUM, secondNUM);
            result_number.setText(Double.toString(resultNUM));
        }catch (Exception ex){
            result_number.setText(ex.toString());
        }
    }



}
