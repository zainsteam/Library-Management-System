package com.example.virgo.lmsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Date;
import java.lang.String;
/**
 * Created by VIRGO on 12/24/2016.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "librarians.db";

    private static final String TABLE_NAME = "librarians";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_ADDRESS = "adress";
    private static final String COLUMN_USER = "user";
    private static final String COLUMN_PASS = "pass";

    private static final String TABLE_NAME2 = "Books";
    private static final String COLUMN_BID = "bid";
    private static final String COLUMN_BNAME = "bname";
    private static final String COLUMN_BAUTHOR = "bauthor";
    private static final String COLUMN_TECH = "tech";


    private static final String TABLE_CREATE2 = "create table Books (bid integer primary key not null  ," +
            "bname text not null , bauthor text not null , tech text not null )";


    private static final String TABLE_CREATE = "create table librarians (id integer primary key not null  ," +
    "name text not null , adress text not null , user text not null , pass text not null )";

    public DataBaseHelper (Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(TABLE_CREATE);
        this.db = db;
    db.execSQL(TABLE_CREATE2);
        this.db = db;

    }

    public void inserlibrarian(labrarian l)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from librarians";
        Cursor cursor = db.rawQuery(query ,  null);
        int count = cursor.getCount();

        values.put(COLUMN_ID , count);
        values.put(COLUMN_NAME , l.getname());
        values.put(COLUMN_ADDRESS , l.getAdress());
        values.put(COLUMN_USER , l.getUser());
        values.put(COLUMN_PASS , l.getPass());

        db.insert(TABLE_NAME , null, values);
        db.close();
    }

    public String searchlibrarian(String user)
    {
        db = this.getReadableDatabase();
        String query = "select user , pass from " + TABLE_NAME ;
        Cursor cursor = db.rawQuery(query , null );
        String a , b;
        b = "not found";
        if (cursor.moveToFirst())
        {
            do
            {
                a=cursor.getString(0);
                b=cursor.getString(1);
                if(a.equals(user))
                {
                    b = cursor.getString(1);
                    break;
                }
            }
            while (cursor.moveToNext());
        }
        return b;
    }


    public void insertBook(books l)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from Books";
        Cursor cursor = db.rawQuery(query ,  null);
        int count = cursor.getCount();

        values.put(COLUMN_BID , count);
        values.put(COLUMN_BNAME , l.getBname());
        values.put(COLUMN_BAUTHOR , l.getBauthor());
        values.put(COLUMN_TECH , l.getTech());

        db.insert(TABLE_NAME2 , null, values);
        db.close();
    }

    public Cursor getListContent(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor Data = db.rawQuery("select * from " + TABLE_NAME2,null);
        return Data;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXIST" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
        String query2 = "DROP TABLE IF EXIST" + TABLE_NAME2;
        db.execSQL(query2);
        this.onCreate(db);
    }
}