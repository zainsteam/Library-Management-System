package com.example.virgo.lmsapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class SigUP extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sig_up);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    public void onaddbtn(View V) {
        if (V.getId() == R.id.sbtn) {

            EditText b = (EditText) findViewById(R.id.lname);
            EditText c = (EditText) findViewById(R.id.addr);
            EditText d = (EditText) findViewById(R.id.username);
            EditText e = (EditText) findViewById(R.id.password);
            EditText f = (EditText) findViewById(R.id.cpassword);


            String bstr = b.getText().toString();
            String cstr = c.getText().toString();
            String dstr = d.getText().toString();
            String estr = e.getText().toString();
            String fstr = f.getText().toString();

            labrarian l = new labrarian();
            l.setname(bstr);
            l.setAdress(cstr);
            l.setUser(dstr);
            l.setPass(estr);


            if (!estr.equals(fstr)) {

                Toast pass = Toast.makeText(SigUP.this, "Password doesn't Match", Toast.LENGTH_SHORT);
                pass.show();
            } else if (bstr.equals("") || cstr.equals("") || dstr.equals("") || estr.equals("")  ) {
                Toast pass = Toast.makeText(SigUP.this, "Filled Empty Field", Toast.LENGTH_SHORT);
                pass.show();

            }else{

                helper.inserlibrarian(l);

                Toast pass = Toast.makeText(SigUP.this, "Successfully SignUp", Toast.LENGTH_SHORT);
                pass.show();
                Intent i = new Intent(this, login.class);
                startActivity(i);
            }
        }
        if (V.getId() == R.id.bbtn) {
            Intent i = new Intent(this, home.class);
            startActivity(i);
        }

    }
}
