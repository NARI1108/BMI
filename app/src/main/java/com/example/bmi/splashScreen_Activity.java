package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashScreen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

          ImageView img_splashScreen = findViewById(R.id.img_splashScreen);

          Animation  animation_img_splashScreen = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

          img_splashScreen.setAnimation(animation_img_splashScreen);
          new Handler().postDelayed(new Runnable() {
              @Override
              public void run() {
                  startActivity(new Intent(splashScreen_Activity.this,MainActivity.class));
                  finish();
              }
          },4000);
    }
}