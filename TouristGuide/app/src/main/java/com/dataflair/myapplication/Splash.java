package com.dataflair.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;


public class Splash extends AppCompatActivity {
    //    ImageView imageView;
    LottieAnimationView lottieAnimationView;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        imageView=findViewById(R.id.image);
        lottieAnimationView=findViewById(R.id.lottie);
        tv2=findViewById(R.id.tv1);
        getSupportActionBar().hide();

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent=new Intent(Splash.this,LogInActivity.class);
//                startActivity(intent);
//            }
//        },2000);
        Thread thread=new Thread(){

            public void run(){

                try {
                    sleep(3000);
                }
                catch (Exception e){
                    System.out.println(e);
                }

                finally {
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }



        };
        thread.start();








    }

//    public void anim(){
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animate2);
//        tv2.startAnimation(animation);
//
//
//
//    }

    @Override
    protected void onStart() {
        super.onStart();
        //anim();
    }
}