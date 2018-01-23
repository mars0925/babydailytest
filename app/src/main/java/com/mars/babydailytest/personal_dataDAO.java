package com.mars.babydailytest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Student on 2018/1/23.
 */

public class personal_dataDAO {
    Context context;
    SQLiteDatabase db;

    public personal_dataDAO(Context context)
    {
        this.context = context;
        MyDBHelper myDBHelper = new MyDBHelper(context);
        db = myDBHelper.getWritableDatabase();
    }
    //新增寶寶資料
    public boolean addbaby(personal_data s)
    {
        ContentValues cv = new ContentValues();
        cv.put("_personid",1);
        cv.put("name","ANN");
        cv.put("gender",1);
        cv.put("birthday","2018/8");
        cv.put("img","IMG");
        db.insert("personal data",null,cv);

        db.close();
        return true;
    }
    //修改寶寶資料
    public boolean alterbabydata(personal_data  s)
    {
        ContentValues cv = new ContentValues();
        cv.put("name",s.name);
        cv.put("gender",s.gender);
        cv.put("birthday",s.birthday);
        cv.put("img",s.img);
        db.update("personal data",cv,"_personid=?",
                new String[]{String.valueOf(s.personid)});
        return true;
    }
    //刪除寶寶資料
    public boolean deletebabydata(int  personalid)
    {
       db.delete("personal data","_personid=?",new String[]{String.valueOf(personalid)});
       return true;
    }
}



