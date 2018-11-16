package com.example.virgo.lmsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Request extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
    }

    public void abtn(View V) {

        if (V.getId() == R.id.rbtn) {

            EditText b = (EditText) findViewById(R.id.m_id1);
            EditText c = (EditText) findViewById(R.id.m_name1);
            EditText d = (EditText) findViewById(R.id.md_id1);
            EditText e = (EditText) findViewById(R.id.md_name1);
            EditText f = (EditText) findViewById(R.id.i_date1);

            String bstr = b.getText().toString();
            String cstr = c.getText().toString();
            String dstr = d.getText().toString();
            String estr = e.getText().toString();
            String fstr = f.getText().toString();

            if (bstr.equals("") || cstr.equals("") || dstr.equals("")|| estr.equals("")|| fstr.equals("")) {
                Toast pass = Toast.makeText(this, "Filled Empty Field", Toast.LENGTH_SHORT);
                pass.show();

            } else {

                Toast pass = Toast.makeText(this, "Request Successful", Toast.LENGTH_SHORT);
                pass.show();

                Intent i = new Intent(this, home.class);
                startActivity(i);
            }
            }
            if (V.getId()==R.id.bbtn)
            {
                Intent i = new Intent(this, home.class);
                startActivity(i);
            }
        }
    }