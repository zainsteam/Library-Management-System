package com.example.virgo.lmsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class R_book extends AppCompatActivity {

    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_book);
    }

    public void abtn (View V)
    {

        if (V.getId()==R.id.rbtn)
        {

            EditText b = (EditText)findViewById(R.id.bname);
            EditText c = (EditText)findViewById(R.id.bauthor);
            EditText d = (EditText)findViewById(R.id.tech);

            String bstr = b.getText().toString();
            String cstr = c.getText().toString();
            String dstr = d.getText().toString();

            books l = new books();
            l.setBname(bstr);
            l.setBauthor(cstr);
            l.setTech(dstr);

            if(bstr.equals("") || cstr.equals("") || dstr.equals("")  )
            {Toast pass = Toast.makeText(R_book.this, "Filled Empty Field", Toast.LENGTH_SHORT);
                pass.show();

            }
            else {

                helper.insertBook(l);

                Toast pass = Toast.makeText(R_book.this, "Book Successfully Added", Toast.LENGTH_SHORT);
                pass.show();

                Intent i = new Intent(this, panel.class);
                startActivity(i);
            }
            }

        if (V.getId()==R.id.bbtn)
        {
            Intent i = new Intent(this, panel.class);
            startActivity(i);
        }
    }
}
