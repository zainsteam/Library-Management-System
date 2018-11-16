package com.example.virgo.lmsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.virgo.lmsapp.R.id.username2;

public class login extends AppCompatActivity {

    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onbtn (View V) {
        if (V.getId() == R.id.Lbtn) {
            EditText d = (EditText) findViewById(username2);
            EditText e = (EditText) findViewById(R.id.password2);

            String dstr = d.getText().toString();
            String estr = e.getText().toString();

            String passhelper = helper.searchlibrarian (dstr);

            if (estr.equals(passhelper)) {


                Toast pass = Toast.makeText(login.this, "Login Successfull", Toast.LENGTH_SHORT);
                pass.show();
                Intent i = new Intent(login.this, panel.class);
                i.putExtra("user" , dstr);
                startActivity(i);
            }
            else
            {
                Toast pass = Toast.makeText(login.this, "Invalid password and User Name", Toast.LENGTH_SHORT);
                pass.show();

            }
        }
        if (V.getId() == R.id.sbtn) {
            Intent i = new Intent(login.this, SigUP.class);
            startActivity(i);
        }
        if (V.getId() == R.id.bbtn) {
            Intent i = new Intent(login.this, home.class);
            startActivity(i);
        }
    }

}
