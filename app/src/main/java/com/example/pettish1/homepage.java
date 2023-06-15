package com.example.pettish1;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pettish1.databinding.ActivityHomepageBinding;

public class homepage extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
//    private FloatingActionButton mMainAddFab, mMainkartFab, mMainsettingFab, mMainAcountFab;
//    private Animation mopenanim,mcloseanim,mrotateopen,mrotateclose;
//    private boolean isopen;


    //private val rotateOpen:Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.rotate_open_anim)}
    //private val rotateclose:Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.rotate_close_anim)}
    //private val frombottom:Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.from_bottom_anim)}
    //private val tobottom:Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.to_bottom_anim)}

    private ActivityHomepageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityHomepageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

//        drawerLayout = findViewById(R.id.drawer_layout);
//        navigationView = findViewById(R.id.nav_view);
//        toolbar = findViewById(R.id.toolbar);
//
//        setSupportActionBar(toolbar);
//
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//        mMainAddFab = findViewById(R.id.floatingActionButton6);
//        mMainkartFab = findViewById(R.id.floatingActionButton7);
//        mMainsettingFab = findViewById(R.id.floatingActionButton8);
//        mMainAcountFab = findViewById(R.id.floatingActionButton9);

   /*     mopenanim = AnimationUtils.loadAnimation(homepage.this,R.anim.from_bottom_anim);
        mopenanim = AnimationUtils.loadAnimation(homepage.this,R.anim.to_bottom_anim);
        mrotateopen = AnimationUtils.loadAnimation(homepage.this,R.anim.rotate_open_anim);
        mrotateclose = AnimationUtils.loadAnimation(homepage.this,R.anim.rotate_close_anim);*/

//        isopen = true;

//        mMainAddFab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(isopen){
//                    mMainAddFab.setAnimation(mrotateclose);
//                    mMainkartFab.setVisibility(view.INVISIBLE);
//                    mMainAcountFab.setAnimation(mopenanim);
//                    //mMainAcountFab.setVisibility(view.INVISIBLE);
//                    mMainsettingFab.setAnimation(mopenanim);
//
//                    isopen = false;
//                } else {
//                    //mMainAddFab.setVisibility(view.VISIBLE);
//                    mMainAddFab.setAnimation(mrotateopen);
//
//                    mMainkartFab.setVisibility(view.VISIBLE);
//                    mMainkartFab.setAnimation(mcloseanim);
//                    mMainAcountFab.setAnimation(mcloseanim);
//                    mMainsettingFab.setAnimation(mcloseanim);
//
//                    isopen = true;
//                }
//
//            }
//
//
//
//        }




        imageButton6   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, products.class);
                startActivity(intent);


            }

        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, petfood.class);
                startActivity(intent);
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, pets.class);
                startActivity(intent);
            }
        });


    }
}