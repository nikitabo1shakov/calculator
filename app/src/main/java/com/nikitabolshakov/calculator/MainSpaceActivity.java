package com.nikitabolshakov.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.util.TypedValue;
import android.widget.Button;

public class MainSpaceActivity extends AppCompatActivity {

    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_equally;
    private Button button_multiplication;
    private Button button_division;
    private Button button_addition;
    private Button button_subtraction;
    private Button button_clear;
    private Button button_dot;
    private TextView text_1;
    private TextView text_2;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUALLY = '=';
    private char ACTION;
    private double val1 = Double.NaN;
    private double val2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_space);
        viewSetup();

        button_0.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "0");
        });

        button_1.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "1");
        });

        button_2.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "2");
        });

        button_3.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "3");
        });

        button_4.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "4");
        });

        button_5.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "5");
        });

        button_6.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "6");
        });

        button_7.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "7");
        });

        button_8.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "8");
        });

        button_9.setOnClickListener(view -> {
            ifErrorOnOutput();
            exceedLength();
            text_1.setText(text_1.getText().toString() + "9");
        });

        button_dot.setOnClickListener(view -> {
            exceedLength();
            text_1.setText(text_1.getText().toString() + ".");
        });

        button_addition.setOnClickListener(view -> {
            if (text_1.getText().length() > 0) {
                ACTION = ADDITION;
                operation();
                if (!ifReallyDecimal()) {
                    text_2.setText(val1 + "+");
                } else {
                    text_2.setText((int) val1 + "+");
                }
                text_1.setText(null);
            } else {
                text_2.setText("Error");
            }
        });

        button_subtraction.setOnClickListener(view -> {
            if (text_1.getText().length() > 0) {
                ACTION = SUBTRACTION;
                operation();
                if (text_1.getText().length() > 0)
                    if (!ifReallyDecimal()) {
                        text_2.setText(val1 + "-");
                    } else {
                        text_2.setText((int) val1 + "-");
                    }
                text_1.setText(null);
            } else {
                text_2.setText("Error");
            }
        });

        button_multiplication.setOnClickListener(view -> {
            if (text_1.getText().length() > 0) {
                ACTION = MULTIPLICATION;
                operation();
                if (!ifReallyDecimal()) {
                    text_2.setText(val1 + "×");
                } else {
                    text_2.setText((int) val1 + "×");
                }
                text_1.setText(null);
            } else {
                text_2.setText("Error");
            }
        });

        button_division.setOnClickListener(view -> {
            if (text_1.getText().length() > 0) {
                ACTION = DIVISION;
                operation();
                if (ifReallyDecimal()) {
                    text_2.setText((int) val1 + "/");
                } else {
                    text_2.setText(val1 + "/");
                }
                text_1.setText(null);
            } else {
                text_2.setText("Error");
            }
        });

        button_equally.setOnClickListener(view -> {
            if (text_1.getText().length() > 0) {
                operation();
                ACTION = EQUALLY;
                if (!ifReallyDecimal()) {
                    text_2.setText(String.valueOf(val1));
                } else {
                    text_2.setText(String.valueOf((int) val1));
                }
                text_1.setText(null);
            } else {
                text_2.setText("Error");
            }
        });

        button_clear.setOnClickListener(view -> {
            if (text_1.getText().length() > 0) {
                CharSequence name = text_1.getText().toString();
                text_1.setText(name.subSequence(0, name.length() - 1));
            } else {
                val1 = Double.NaN;
                val2 = Double.NaN;
                text_1.setText("");
                text_2.setText("");
            }
        });

        button_clear.setOnLongClickListener(view -> {
            val1 = Double.NaN;
            val2 = Double.NaN;
            text_1.setText("");
            text_2.setText("");
            return true;
        });
    }

    private void viewSetup() {
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_equally = findViewById(R.id.button_equally);
        button_multiplication = findViewById(R.id.button_multiplication);
        button_division = findViewById(R.id.button_division);
        button_addition = findViewById(R.id.button_addition);
        button_subtraction = findViewById(R.id.button_subtraction);
        button_clear = findViewById(R.id.button_clear);
        button_dot = findViewById(R.id.button_dot);
        text_1 = findViewById(R.id.input);
        text_2 = findViewById(R.id.output);
    }

    private void operation() {
        if (!Double.isNaN(val1)) {
            if (text_2.getText().toString().charAt(0) == '-') {
                val1 = (-1) * val1;
            }
            val2 = Double.parseDouble(text_1.getText().toString());

            switch (ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQUALLY:
                    break;
            }
        } else {
            val1 = Double.parseDouble(text_1.getText().toString());
        }
    }

    private void ifErrorOnOutput() {
        if (text_2.getText().toString().equals("Error")) {
            text_2.setText("");
        }
    }

    private boolean ifReallyDecimal() {
        return val1 == (int) val1;
    }

    private void exceedLength() {
        if (text_1.getText().toString().length() > 10) {
            text_1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }
}