package com.mars.babydailytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    TextView tv;
    personal_data personal_data;
    personal_dataDAO dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        ed4 = (EditText)findViewById(R.id.editText4);
        ed5 = (EditText)findViewById(R.id.editText5);
        tv = (TextView)findViewById(R.id.textView);

        dao = new personal_dataDAO(MainActivity.this);
        personal_data = new personal_data(Integer.parseInt(ed1.getText().toString()),ed2.getText().toString(),
                Integer.parseInt(ed3.getText().toString()),ed4.getText().toString(),ed5.getText().toString());
        /*
        ArrayList<personal_data> a = new ArrayList<>();
        a.add(personal_data);
        Log.d("MSDDDDD",String.valueOf(a));
        */
    }

    //新增寶寶資料
    public void click1(View v)
    {
        personal_data = new personal_data(Integer.parseInt(ed1.getText().toString()),ed2.getText().toString(),
                Integer.parseInt(ed3.getText().toString()),ed4.getText().toString(),ed5.getText().toString());
        dao.addbaby(personal_data);
    }

    //更新寶寶資料
    public void click2(View v)
    {
        personal_data = new personal_data(Integer.parseInt(ed1.getText().toString()),ed2.getText().toString(),
                Integer.parseInt(ed3.getText().toString()),ed4.getText().toString(),ed5.getText().toString());
        dao.alterbabydata(personal_data);
    }
    //刪除寶寶資料
    public void click3(View v)
    {

        personal_data = new personal_data(Integer.parseInt(ed1.getText().toString()),ed2.getText().toString(),
                Integer.parseInt(ed3.getText().toString()),ed4.getText().toString(),ed5.getText().toString());
        dao.deletebabydata(Integer.valueOf(ed1.toString()));

    }

}
