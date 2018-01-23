package com.mars.babydailytest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/23.
 */

public class MyDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "badydaily.sqlite";
    final static int VERSION = 1;
    public MyDBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE `personal data` ( `_personid` INTEGER, `name` TEXT, `gender` INTEGER, `birthday` TEXT, `img` TEXT, PRIMARY KEY(`_personid`) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
