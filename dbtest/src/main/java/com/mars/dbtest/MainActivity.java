package com.mars.dbtest;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyHelp myHelp = new MyHelp(MainActivity.this);
        SQLiteDatabase db = myHelp.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("_id",1);
        cv.put("name","ann");
        cv.put("tall",15);
        db.insert("baby",null,cv);
    }
}
