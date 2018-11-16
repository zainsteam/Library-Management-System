package com.example.virgo.lmsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    public void onClick (View v)
    {
     if (v.getId()==R.id.a_book)
     {
            Intent i = new Intent(this, v_book.class);
            startActivity(i);
    }
        if (v.getId()==R.id.d_book) {
            Intent i = new Intent(this, Request.class);

            startActivity(i);
        }

        if (v.getId()==R.id.reg)
        {
            Intent i = new Intent(this, login.class);
            startActivity(i);

        }

        if (v.getId()==R.id.v_mem)
        {
            Intent i = new Intent(this, SigUP.class);
            startActivity(i);

        }
    }
}

