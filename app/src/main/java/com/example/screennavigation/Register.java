package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        String imageUri = "https://i.imgur.com/DvpvklR.png";
        String url = "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg";


        ImageView ivBasicImage = (ImageView) findViewById(R.id.imageView5);
        Picasso.with(this).load(imageUri).into(ivBasicImage);
//
//        Picasso.with(this).load(url).resize(50, 50).
//                centerCrop().into(ivBasicImage);
    }

    public void GotoSchool(View view) {
        Intent i = new Intent(this, SchoolsList.class);
        startActivity(i);
    }
}