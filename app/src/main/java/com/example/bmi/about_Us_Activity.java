package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class about_Us_Activity extends AppCompatActivity {
    TextView txt_about_us, txt_version;
    ImageView img_icon;
    Animation animation_txt_about_us, animation_txt_version, animation_img_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        findViews();
        animation();
    }
    public void findViews(){
        txt_about_us = findViewById(R.id.txt_about_us);
        txt_version  = findViewById(R.id.txt_version);
        img_icon     = findViewById(R.id.img_icon);
    }
    public void animation(){
          animation_txt_about_us = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
          animation_txt_version  = AnimationUtils.loadAnimation(this,R.anim.anim_trans_right);
          animation_img_icon     = AnimationUtils.loadAnimation(this,R.anim.anim_trans_left);

          txt_about_us.setAnimation(animation_txt_about_us);
          txt_version.setAnimation(animation_txt_version);
          img_icon.setAnimation(animation_img_icon);
    }
}