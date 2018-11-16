package com.example.virgo.lmsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class panel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        String user = getIntent().getStringExtra("user");
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(user);
    }

    public void onClick (View v) {
        if (v.getId() == R.id.a_book) {
            Intent i = new Intent(this, R_book.class);
            startActivity(i);
        }
        if (v.getId() == R.id.d_book) {
            Intent i = new Intent(this, D_book.class);
            startActivity(i);
        }

        if (v.getId() == R.id.reg) {
            Intent i = new Intent(this, Registration.class);
            startActivity(i);

        }

        if (v.getId() == R.id.s_out) {
            Intent i = new Intent(this, home.class);
            startActivity(i);
            Toast pass = Toast.makeText(panel.this, "Successfully Sign-OUT", Toast.LENGTH_SHORT);
            pass.show();
        }

        if (v.getId() == R.id.v_mem) {
            Intent i = new Intent(this, v_member.class);
            startActivity(i);

        }
        if (v.getId() == R.id.d_mem) {
            Intent i = new Intent(this, D_member.class);
            startActivity(i);

        }

    }
}