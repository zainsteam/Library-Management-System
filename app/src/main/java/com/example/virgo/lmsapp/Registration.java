package com.example.virgo.lmsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Date;

public class Registration extends AppCompatActivity {

    DataBaseHelper helper = new DataBaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void rbtn (View v)
    {

        if (v.getId()==R.id.rbtn)
        {


            EditText b = (EditText)findViewById(R.id.m_name);
            String bstr = b.getText().toString();


            EditText c = (EditText)findViewById(R.id.m_addr);
            String cstr = c.getText().toString();

            EditText d = (EditText)findViewById(R.id.m_numb);
            String dstr = d.getText().toString();

            EditText e = (EditText)findViewById(R.id.m_edate);
            String estr = e.getText().toString();

            EditText f = (EditText)findViewById(R.id.m_idate);
            String fstr = f.getText().toString();

            EditText g = (EditText)findViewById(R.id.m_age);
            String gstr = g.getText().toString();

            member l = new member();
            l.setname(bstr);
            l.setaddr(cstr);

            if (bstr.equals("") || cstr.equals("") || dstr.equals("") || estr.equals("") || gstr.equals("")|| fstr.equals("") ) {

                Toast pass = Toast.makeText(Registration.this, "Filled Empty Field", Toast.LENGTH_SHORT);
                pass.show();

            }
            else
            {

              //  helper.insertmembers(l);

                Toast pass = Toast.makeText(Registration.this, "Member Successfully Added", Toast.LENGTH_SHORT);
                pass.show();
                Intent i = new Intent(this, panel.class);
                startActivity(i);
            }
        }
        if (v.getId()==R.id.bbtn)
        {

            Intent i = new Intent(this, panel.class);
            startActivity(i);
        }

    }
}
