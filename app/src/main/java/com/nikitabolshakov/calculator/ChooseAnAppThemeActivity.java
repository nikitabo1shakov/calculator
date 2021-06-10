package com.nikitabolshakov.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ChooseAnAppThemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_an_app_theme);

        findViewById(R.id.themeMoccasin).setOnClickListener(v -> {
            Intent intentThemeMoccasin = new Intent(ChooseAnAppThemeActivity.this, MainMoccasinActivity.class);
            startActivity(intentThemeMoccasin);
        });

        findViewById(R.id.themeSpace).setOnClickListener(v -> {
            Intent intentThemeSpace = new Intent(ChooseAnAppThemeActivity.this, MainSpaceActivity.class);
            startActivity(intentThemeSpace);
        });
    }
}