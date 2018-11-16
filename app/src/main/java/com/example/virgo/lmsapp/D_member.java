package com.example.virgo.lmsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class D_member extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_member);
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