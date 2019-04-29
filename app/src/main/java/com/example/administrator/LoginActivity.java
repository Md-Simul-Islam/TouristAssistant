package com.example.administrator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.sqliteloginactivity.AsteriskPasswordTransformationMethod;
import com.example.administrator.sqliteloginactivity.DatabaseHelper;
import com.example.administrator.sqliteloginactivity.Main2Activity;
import com.example.administrator.sqliteloginactivity.R;

public class LoginActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);

        e1 = (EditText) findViewById(R.id.reEmail);
        e2 = (EditText) findViewById(R.id.rePassword);
        e2.setTransformationMethod(new AsteriskPasswordTransformationMethod());

        b1 = (Button) findViewById(R.id.login);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String passward = e2.getText().toString();
                Boolean Checkemailpass = db.emailpassward(email, passward);
                if (Checkemailpass == true) {
                    Intent i=new Intent(LoginActivity.this,Main2Activity.class);
                    startActivity(i);

                    //Toast.makeText(getApplicationContext(), "successfully login", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "wrong password or email", Toast.LENGTH_SHORT).show();


                }


            }
        });
    }
}
