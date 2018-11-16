package com.example.virgo.lmsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class v_member extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_member);
    }

    public void abtn (View V) {
        if (V.getId() == R.id.rbtn) {
            Intent i = new Intent(this, Registration.class);
            startActivity(i);
        }
        if (V.getId() == R.id.bbtn) {
            Intent i = new Intent(this, panel.class);
            startActivity(i);
        }
    }

}
