package com.mars.dbtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/23.
 */

public class MyHelp extends SQLiteOpenHelper {
    final static String DB_NAME = "dbtest.sqlite";
    final static int VERSION = 1;
    public MyHelp(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE `baby` ( `_id` INTEGER, `name` TEXT, `tall` INTEGER, PRIMARY KEY(`_id`) )");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
