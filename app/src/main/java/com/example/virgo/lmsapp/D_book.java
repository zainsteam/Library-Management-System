package com.example.virgo.lmsapp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class D_book extends AppCompatActivity {

    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_book);

        ListView listview = (ListView) findViewById(R.id.lv2);
        ArrayList<String> thelist = new ArrayList<>();
        Cursor data = helper.getListContent();

        if (data.getCount() == 0) {
            Toast pass = Toast.makeText(D_book.this, "Empty Database", Toast.LENGTH_SHORT);
            pass.show();
        }
        else
        {
            while(data.moveToNext())
            {

                thelist.add(data.getString(1));
                ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,thelist);
                listview.setAdapter(listAdapter);
            }
        }

    }

    public void abtn(View V) {

        if (V.getId() == R.id.rbtn) {

            EditText d = (EditText) findViewById(R.id.md_id1);
            EditText e = (EditText) findViewById(R.id.md_name1);

            String dstr = d.getText().toString();
            String estr = e.getText().toString();

            if (dstr.equals("") || estr.equals("")) {
                Toast pass = Toast.makeText(this, "Filled Empty Field", Toast.LENGTH_SHORT);
                pass.show();

            } else {

                Toast pass = Toast.makeText(this, "Successful Deleted", Toast.LENGTH_SHORT);
                pass.show();

                Intent i = new Intent(this, panel.class);
                startActivity(i);
            }
            }
            if (V.getId() == R.id.bbtn) {
                Intent i = new Intent(this, panel.class);
                startActivity(i);
            }



    }
}