package com.vidyakalkendra.languagetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numbersTV, colorsTV, familyTV, phrasesTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbersTV = findViewById(R.id.numbersTV);
        colorsTV = findViewById(R.id.colorsTV);
        familyTV = findViewById(R.id.familyTV);
        phrasesTV = findViewById(R.id.phrasesTV);

        numbersTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numIntent);
            }
        });

        colorsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,Colors.class);
                startActivity(colorsIntent);
            }
        });

        familyTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,Family.class);
                startActivity(familyIntent);
            }
        });

        phrasesTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this,Phrases.class);
                startActivity(phraseIntent);
            }
        });

    }
}