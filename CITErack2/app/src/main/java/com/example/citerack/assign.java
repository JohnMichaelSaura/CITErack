package com.example.citerack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class assign extends AppCompatActivity {

    EditText task;
    Button back, assign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign);

        task =findViewById(R.id.ettast);
        back = findViewById(R.id.baks);
        assign = findViewById(R.id.btnsign);

        assign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(com.example.citerack.assign.this, "Successful", Toast.LENGTH_SHORT).show();
                Intent q = new Intent(assign.this, home.class);
                startActivity(q);
                finish();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(com.example.citerack.assign.this, home.class);
                startActivity(w);
                finish();
            }
        });



    }
}
