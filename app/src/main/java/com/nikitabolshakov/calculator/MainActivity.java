package com.nikitabolshakov.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Calculator calculator = new Calculator();
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_on_grid_layout);

        textView = (TextView) findViewById(R.id.textView);

        findViewById(R.id.button_0).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_0()));

        findViewById(R.id.button_1).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_1()));

        findViewById(R.id.button_2).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_2()));

        findViewById(R.id.button_3).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_3()));

        findViewById(R.id.button_4).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_4()));

        findViewById(R.id.button_5).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_5()));

        findViewById(R.id.button_6).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_6()));

        findViewById(R.id.button_7).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_7()));

        findViewById(R.id.button_8).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_8()));

        findViewById(R.id.button_9).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_9()));

        findViewById(R.id.buttonDot).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_DOT()));

        findViewById(R.id.buttonCancel).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_CANCEL()));

        findViewById(R.id.buttonDivision).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_DIVISION()));

        findViewById(R.id.buttonMultiplication).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_MULTIPLICATION()));

        findViewById(R.id.buttonSubtraction).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_SUBTRACTION()));

        findViewById(R.id.buttonAddition).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_ADDITION()));

        findViewById(R.id.buttonEqually).setOnClickListener(v -> textView.setText(textView.getText() + calculator.getBUTTON_EQUALLY()));
    }
}