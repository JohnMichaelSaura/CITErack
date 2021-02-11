package com.example.citerack;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabasesHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "IDU.db";
    public static final String TABLE_NAME = "IDU";

    public static final String COLS_1 = "ID";
    public static final String COL_2 = "name";
    public static final String COLS_3 = "college";
    public DatabasesHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, college TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" CREATE TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
