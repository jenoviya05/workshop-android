package com.example.workshop2; // Keep your actual package name here

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link UI components
        TextInputEditText etFirstNumber = findViewById(R.id.etFirstNumber);
        TextInputEditText etSecondNumber = findViewById(R.id.etSecondNumber);
        MaterialButton btnAdd = findViewById(R.id.btnAdd);
        MaterialButton btnClear = findViewById(R.id.btnClear);
        TextInputEditText etResult = findViewById(R.id.etResult);

        // Calculate Sum button logic
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = etFirstNumber.getText() != null ? etFirstNumber.getText().toString().trim() : "";
                String num2Str = etSecondNumber.getText() != null ? etSecondNumber.getText().toString().trim() : "";

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double sum = num1 + num2;

                    // Format cleanly with commas and up to 4 decimal places (e.g., 1,250.5)
                    DecimalFormat formatter = new DecimalFormat("#,###.####");
                    etResult.setText(formatter.format(sum));

                    // Dismiss keyboard so user sees the result clearly
                    hideKeyboard();
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Please enter valid numeric values", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Reset button logic
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etFirstNumber.setText("");
                etSecondNumber.setText("");
                etResult.setText("0");
                etFirstNumber.requestFocus();
            }
        });
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}