
#  WORKSHOP ANDROID ADDTION APPLICATION

## Aim
To develop an Android application that accepts two numbers from the user and displays their sum in a text box.

## Software Requirements
Android Studio(Latest Version)


## Description
This application is used to add two numbers.
The user enters two values in the input fields.
When the ADD button is clicked, the sum is calculated and displayed in the result text box.

## Algorithm
1. Start the application.
2. Enter the first number.
3. Enter the second number.
4. Click the ADD button.
5. Calculate the sum of the two numbers.
6. Display the result in the text box.
7. Stop.

## Program
The application is developed using Java and XML in Android Studio.

Developed by: JENOVIYA D
Registeration Number : 212225040151

## ACTIVITY_MAIN.XML:
~~~
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F3F4F6"
    android:fillViewport="true">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:orientation="vertical"
        android:padding="24dp">

        <!-- Elevated Main Card -->
        <com.google.android.material.card.MaterialCardView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:cardBackgroundColor="#FFFFFF"
            app:cardCornerRadius="24dp"
            app:cardElevation="6dp"
            app:strokeWidth="0dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="28dp">

                <!-- Header Badge -->
                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:background="#EEF2FF"
                    android:paddingHorizontal="12dp"
                    android:paddingVertical="4dp"
                    android:text="MATH UTILITY"
                    android:textColor="#4F46E5"
                    android:textSize="11sp"
                    android:textStyle="bold" />

                <!-- Title & Subtitle -->
                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="12dp"
                    android:text="Sum Calculator"
                    android:textColor="#111827"
                    android:textSize="26sp"
                    android:textStyle="bold" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="4dp"
                    android:layout_marginBottom="24dp"
                    android:text="Enter two values below to compute their total."
                    android:textColor="#6B7280"
                    android:textSize="14sp" />

                <!-- First Number Input (Floating Label + Clear Button) -->
                <com.google.android.material.textfield.TextInputLayout
                    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginBottom="16dp"
                    android:hint="First Number"
                    app:boxCornerRadiusBottomEnd="14dp"
                    app:boxCornerRadiusBottomStart="14dp"
                    app:boxCornerRadiusTopEnd="14dp"
                    app:boxCornerRadiusTopStart="14dp"
                    app:boxStrokeColor="#4F46E5"
                    app:endIconMode="clear_text"
                    app:hintTextColor="#4F46E5">

                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etFirstNumber"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="numberDecimal|numberSigned"
                        android:textColor="#111827"
                        android:textSize="16sp" />
                </com.google.android.material.textfield.TextInputLayout>

                <!-- Plus Divider Indicator -->
                <TextView
                    android:layout_width="36dp"
                    android:layout_height="36dp"
                    android:layout_gravity="center"
                    android:layout_marginBottom="16dp"
                    android:background="#EEF2FF"
                    android:gravity="center"
                    android:text="+"
                    android:textColor="#4F46E5"
                    android:textSize="20sp"
                    android:textStyle="bold" />

                <!-- Second Number Input -->
                <com.google.android.material.textfield.TextInputLayout
                    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginBottom="24dp"
                    android:hint="Second Number"
                    app:boxCornerRadiusBottomEnd="14dp"
                    app:boxCornerRadiusBottomStart="14dp"
                    app:boxCornerRadiusTopEnd="14dp"
                    app:boxCornerRadiusTopStart="14dp"
                    app:boxStrokeColor="#4F46E5"
                    app:endIconMode="clear_text"
                    app:hintTextColor="#4F46E5">

                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etSecondNumber"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="numberDecimal|numberSigned"
                        android:textColor="#111827"
                        android:textSize="16sp" />
                </com.google.android.material.textfield.TextInputLayout>

                <!-- Action Buttons Row -->
                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginBottom="24dp"
                    android:orientation="horizontal">

                    <com.google.android.material.button.MaterialButton
                        android:id="@+id/btnClear"
                        style="@style/Widget.MaterialComponents.Button.OutlinedButton"
                        android:layout_width="0dp"
                        android:layout_height="56dp"
                        android:layout_marginEnd="10dp"
                        android:layout_weight="1"
                        android:text="Reset"
                        android:textAllCaps="false"
                        android:textColor="#4B5563"
                        android:textSize="15sp"
                        app:cornerRadius="14dp"
                        app:strokeColor="#D1D5DB" />

                    <com.google.android.material.button.MaterialButton
                        android:id="@+id/btnAdd"
                        android:layout_width="0dp"
                        android:layout_height="56dp"
                        android:layout_weight="2"
                        android:backgroundTint="#4F46E5"
                        android:text="Calculate Sum"
                        android:textAllCaps="false"
                        android:textColor="#FFFFFF"
                        android:textSize="15sp"
                        android:textStyle="bold"
                        app:cornerRadius="14dp" />
                </LinearLayout>

                <!-- Result Display Box (Read-Only Text Box) -->
                <com.google.android.material.textfield.TextInputLayout
                    style="@style/Widget.MaterialComponents.TextInputLayout.FilledBox"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:hint="Summation Result"
                    app:boxBackgroundColor="#EEF2FF"
                    app:boxCornerRadiusBottomEnd="14dp"
                    app:boxCornerRadiusBottomStart="14dp"
                    app:boxCornerRadiusTopEnd="14dp"
                    app:boxCornerRadiusTopStart="14dp"
                    app:boxStrokeWidth="0dp"
                    app:boxStrokeWidthFocused="0dp"
                    app:hintTextColor="#4F46E5">

                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etResult"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:clickable="false"
                        android:cursorVisible="false"
                        android:focusable="false"
                        android:gravity="end"
                        android:text="0"
                        android:textColor="#312E81"
                        android:textSize="26sp"
                        android:textStyle="bold" />
                </com.google.android.material.textfield.TextInputLayout>

            </LinearLayout>
        </com.google.android.material.card.MaterialCardView>
    </LinearLayout>
</ScrollView>
~~~

## MAINACTIVITY.JAVA:
~~~
package com.example.workshop1; // Keep your actual package name here

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
~~~

## Output

## OUTPUT PAGE :

<img width="1917" height="1078" alt="Screenshot 2026-11-24 090218" src="https://github.com/user-attachments/assets/f389cfd8-1a7c-44b3-9be3-47eb25dc9c03" />


## INPUT GIVEN :

<img width="1917" height="1078" alt="Screenshot 2026-11-24 090248" src="https://github.com/user-attachments/assets/b559c5b9-c18d-44a6-b93b-6d7b28c495e5" />


## RESULT IMAGE :

<img width="1917" height="1078" alt="Screenshot 2026-11-24 090315" src="https://github.com/user-attachments/assets/6638b338-bf03-4d52-8662-4de8c92723c6" />


## Result
Thus, the Android application for addition of two numbers was developed and executed successfully.
