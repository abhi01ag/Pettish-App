package com.example.pettish1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class products extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        MaterialButton Button12 = (MaterialButton) findViewById(R.id.button12);
        MaterialButton Button13 = (MaterialButton) findViewById((R.id.button13));

        Button12.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                String theurl = "https://www.flipkart.com/petfun-rubber-chew-toy-squeaky-toy-dog-cat/p/itm20aa0b009bdbb?pid=PTYGBP8ZPJZHNZUA&lid=LSTPTYGBP8ZPJZHNZUANVWVZK&marketplace=FLIPKART&store=p3t%2Fea3%2Fg4c&srno=b_1_2&otracker=browse&fm=organic&iid=en_SCnia4Jeni5960zpNflbKW9lfmTjQJjaITw1vWEUBTBOd7RfrIKbK7jykVKVYDVUyucrFYa2qscLiG95JVgTdQ%3D%3D&ppt=browse&ppn=browse";
                Uri urlstr = Uri.parse(theurl);
                Intent urlintent = new Intent();
                urlintent.setData(urlstr);
                urlintent.setAction(Intent.ACTION_VIEW);
                startActivity(urlintent);



            }
        });
        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String theurl = "https://www.flipkart.com/jaspo-superbite-spike-hard-ball-tpu-material-puppy-teething-toy-dogs-pets-red-color-polyresin-ball-dog/p/itm6340461c8f6bf?pid=PTYFWARVXR8T9YM6&lid=LSTPTYFWARVXR8T9YM6VL9EWQ&marketplace=FLIPKART&store=p3t%2Fea3%2Fg4c&spotlightTagId=BestsellerId_p3t%2Fea3%2Fg4c&srno=b_1_3&otracker=browse&fm=organic&iid=da2255a7-6083-4845-9475-33157af6339f.PTYFWARVXR8T9YM6.SEARCH&ppt=browse&ppn=browse&ssid=x7il31nw0w0000001645949752392";
                Uri urlstr = Uri.parse(theurl);
                Intent urlintent = new Intent();
                urlintent.setData(urlstr);
                urlintent.setAction(Intent.ACTION_VIEW);
                startActivity(urlintent);
            }
        });


    }
}