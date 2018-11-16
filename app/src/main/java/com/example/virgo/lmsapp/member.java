package com.example.virgo.lmsapp;

import android.provider.ContactsContract;

import java.util.Date;
/**
 * Created by VIRGO on 12/24/2016.
 */

public class member {

String age , num;
    String name , addr  ;
    Date idate , edate ;


    public void setname(String name)
    {
        this.name = name;
    }
    public String getname ()

    {
        return this.name ;
    }

 public void setaddr (String addr)
    {
        this.addr = addr;
    }
    public String getaddr ()
    {

        return this.addr;
    }

    public void setage (String age)
    {
        this.age = age;
    }
    public String getage ()
    {

        return this.age;
    }

    public void setnum (String num)
    {
        this.num = num;
    }
    public String getnum ()
    {

        return this.num;
    }

    public void setidate (Date idate)
    {
        this.idate = idate;
    }
    public Date getidate ()
    {

        return this.idate;
    }

    public void setedate (Date edate)
    {
        this.edate = edate;
    }
    public Date getedate ()
    {

        return this.edate;
    }


}
