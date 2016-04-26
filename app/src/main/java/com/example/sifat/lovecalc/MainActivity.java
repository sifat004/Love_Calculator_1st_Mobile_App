package com.example.sifat.lovecalc;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/KINKEE__.TTF");
        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/Love Letters.ttf");
        Typeface tf4 = Typeface.createFromAsset(getAssets(), "fonts/Mf Love Song.ttf");




        b=(Button) findViewById(R.id.calculator);

        b.setTypeface(tf4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });

    }
}
