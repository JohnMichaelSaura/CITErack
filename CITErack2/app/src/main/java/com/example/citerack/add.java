package com.example.citerack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add extends AppCompatActivity {

    Button btnInsert, btnDelete, btnUpdate, btnbak;
    EditText textID, textName, textCollege;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        btnInsert = findViewById(R.id.btnAdd);
        btnbak = findViewById(R.id.btnback);

        textID = findViewById(R.id.idN);
        textName = findViewById(R.id.name);
        textCollege = findViewById(R.id.college);

        final DatabasesHelper openHelper = new DatabasesHelper(this);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = textID.getText().toString();
                String name = textName.getText().toString();
                String college = textCollege.getText().toString();
                db = openHelper.getWritableDatabase();
                insertData(id, name, college);
                Toast.makeText(getApplicationContext(), "INSERTED SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            }
        });

        btnbak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(add.this, home.class);
                startActivity(back);
                finish();
            }
        });


    }

    public void insertData(String id,String name, String college) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabasesHelper.COLS_1, id );
        contentValues.put(DatabasesHelper.COL_2, name);
        contentValues.put(DatabasesHelper.COL_2, college);

        long ID = db.insert(DatabasesHelper.TABLE_NAME, null,contentValues);

    }
}
