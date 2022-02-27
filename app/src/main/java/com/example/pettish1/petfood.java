package com.example.pettish1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class petfood extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petfood);

        MaterialButton Button7 = (MaterialButton) findViewById(R.id.button7);
        MaterialButton Button8 = (MaterialButton) findViewById((R.id.button4));


        Button7.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                String theurl = "https://www.amazon.in/Royal-Canin-Maxi-Starter-4kg/dp/B07KT5RC88/ref=sr_1_1_sspa?hvadid=82051224965586&hvbmt=bp&hvdev=c&hvqmt=p&keywords=pet+food+royal+canin&qid=1645947446&s=pet-supplies&sr=1-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFNWDFNQ0Y0Q0M1NFomZW5jcnlwdGVkSWQ9QTA3NDM0MDkzOTVKMEo1TjNWV0pEJmVuY3J5cHRlZEFkSWQ9QTAxMDQyMTcyUkhUTVRLSktFMkQyJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==";
                Uri urlstr = Uri.parse(theurl);
                Intent urlintent = new Intent();
                urlintent.setData(urlstr);
                urlintent.setAction(Intent.ACTION_VIEW);
                startActivity(urlintent);



            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String theurl = "https://www.amazon.in/Himalaya-Healthy-Pet-Food-Adult/dp/B07TJ21XQ1#:~:text=Save%20Extra%20with%202%20offers%20%20%20Brand,%20%20Bag%20%203%20more%20rows%20";
                Uri urlstr = Uri.parse(theurl);
                Intent urlintent = new Intent();
                urlintent.setData(urlstr);
                urlintent.setAction(Intent.ACTION_VIEW);
                startActivity(urlintent);
            }
        });

    }
}