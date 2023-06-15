package com.example.pettish1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView emailid = (TextView) findViewById(R.id.editTextTextEmailAddress);
        TextView password = (TextView) findViewById((R.id.editTextTextPassword));

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emailid.getText().toString().equals("admin@pettish.com") && password.getText().toString().equals("pettish")){
                    //correct
                    //Toast.makeText(login.this,"LOGIN SUCESSFULL",Toast.LENGTH_SHORT).show();
                    Intent intent   = new Intent(login.this,homepage.class);
                    startActivity(intent);

                }else
                    //incorrect
                    Toast.makeText(login.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

    }

}