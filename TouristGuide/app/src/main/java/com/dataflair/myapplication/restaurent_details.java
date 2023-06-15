package com.dataflair.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class restaurent_details extends AppCompatActivity {

    Model model;
    TextView textView1,textView2;
    ImageView img1,img2,img3,img4;
    Button btnl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_restaurent_details);
        LayoutInflater inflater = getLayoutInflater();
        View layout  = inflater.inflate(R.layout.activity_restaurent_details,null);
        textView1=findViewById(R.id.tv);
        textView2=findViewById(R.id.tv2);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.iv2);
        img1=findViewById(R.id.img2);
        btnl = findViewById(R.id.goibibo);


        Bundle extras = getIntent().getExtras();
        //Accessing the values form intent using key
        String discription=extras.getString("discription");
        String name=extras.getString("name");
        String image=extras.getString("image");

        String image2=extras.getString("image2");
        String image3=extras.getString("image3");
        String image4=extras.getString("image4");
        String location=extras.getString("location");


        Picasso.get().load(image).into(img1);
        Picasso.get().load(image2).into(img2);
        Picasso.get().load(image3).into(img3);
        Picasso.get().load(image4).into(img4);

        //for loading hotel name into recycler view
        textView1.setText(name);

        //for loading hotel discription into recyclerview
        textView2.setText(discription);
//        textView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(restaurent_details.this, "Hello", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btnl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(restaurent_details.this, "Hello", Toast.LENGTH_SHORT).show();
//                gotoUrl(location);
//
//            }
//        });

    }
//    public void gotoUrl(String s){
//        Uri uri = Uri.parse(s);
//
//        Intent intent =  new Intent(Intent.ACTION_VIEW,uri);
//        startActivity(intent);
//
//
//
//    }
}