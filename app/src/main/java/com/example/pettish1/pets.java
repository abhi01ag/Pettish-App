package com.example.pettish1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class pets extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);

        MaterialButton Button11 = (MaterialButton) findViewById(R.id.button11);
        MaterialButton Button10 = (MaterialButton) findViewById((R.id.button10));

        Button11.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                String theurl = "https://only4pets.com/listing/persian-kitten-for-sale-3390788701.html";
                Uri urlstr = Uri.parse(theurl);
                Intent urlintent = new Intent();
                urlintent.setData(urlstr);
                urlintent.setAction(Intent.ACTION_VIEW);
                startActivity(urlintent);



            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String theurl = "https://only4pets.com/listing/labrador-retriever-2025743853.html";
                Uri urlstr = Uri.parse(theurl);
                Intent urlintent = new Intent();
                urlintent.setData(urlstr);
                urlintent.setAction(Intent.ACTION_VIEW);
                startActivity(urlintent);
            }
        });

    }
}