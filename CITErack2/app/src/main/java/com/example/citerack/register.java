package com.example.citerack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    EditText nam, users, pass;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nam = findViewById(R.id.name);
        users = findViewById(R.id.etuser);
        pass = findViewById(R.id.etpass);

        reg = findViewById(R.id.btnetreg);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, uters, pasw;

                name = nam.getText().toString();
                uters = users.getText().toString();
                pasw = pass.getText().toString();

                if (name.equals("")){
                    Toast.makeText(register.this, "Enter Name", Toast.LENGTH_SHORT).show();
                }
                else if (uters.equals("")){
                    Toast.makeText(register.this, "Enter Username", Toast.LENGTH_SHORT).show();
                }
                else if (pasw.equals("")){
                    Toast.makeText(register.this, "Enter Password", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(register.this, "Successful Registered", Toast.LENGTH_SHORT).show();
                    Intent r = new Intent(register.this,MainActivity.class);
                    startActivity(r);
                    finish();
                }

            }
        });
    }
}
