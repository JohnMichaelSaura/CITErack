package com.example.citerack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button btnadd, btnass, btnlogouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnadd = findViewById(R.id.btnHadd);
        btnass = findViewById(R.id.btnHassign);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, add.class);
                startActivity(i);
                finish();
            }
        });

        btnass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(home.this, assign.class);
                startActivity(in);
                finish();
            }
        });
    }
}
