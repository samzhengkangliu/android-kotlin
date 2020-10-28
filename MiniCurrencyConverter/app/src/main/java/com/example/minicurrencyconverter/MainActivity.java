package com.example.minicurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view) {
        Log.i("Info", "button pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        String input = editText.getText().toString();

        if (input.equals("")) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else {
            double amountInUSDDouble = Double.parseDouble(input);

            double amountInCADDouble = amountInUSDDouble * 1.3;

            String amountInCAD = String.format("%.2f", amountInCADDouble);

            Log.i("Amount in CAD: ", amountInCAD);

            Toast.makeText(this, "$" + input + " in USD is $" + amountInCAD + " in CAD",
                    Toast.LENGTH_SHORT).show();
        }
    }
}