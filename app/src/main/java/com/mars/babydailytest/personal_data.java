package com.mars.babydailytest;

/**
 * Created by Student on 2018/1/23.
 */

public class personal_data {
    int personid;//(KEY)
    String name;
    int gender;
    String birthday;
    String img;
    public personal_data(int personid,String  name, int gender, String  birthday, String  img)
    {
        this.personid = personid;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.img = img;
    }
}

