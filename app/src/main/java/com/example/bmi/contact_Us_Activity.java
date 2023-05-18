package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class contact_Us_Activity extends AppCompatActivity {
    TextView txt_contact_us, txt_number, txt_telegram, txt_eitaa;
    ImageView img_telephone, img_telegram, img_eitaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        findViews();
        animation();
    }
    public void findViews(){
        txt_contact_us = findViewById(R.id.txt_contact_us);
        txt_number     = findViewById(R.id.txt_number);
        txt_telegram   = findViewById(R.id.txt_telegram);
        txt_eitaa      = findViewById(R.id.txt_eitaa);
        img_telephone  = findViewById(R.id.img_telephone);
        img_telegram   = findViewById(R.id.img_telegram);
        img_eitaa      = findViewById(R.id.img_eitaa);
    }
    public void animation(){
        Animation animation_txt_contact_us = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_txt_number     = AnimationUtils.loadAnimation(this,R.anim.anim_trans_right);
        Animation animation_txt_telegram   = AnimationUtils.loadAnimation(this,R.anim.anim_trans_right);
        Animation animation_txt_eitaa      = AnimationUtils.loadAnimation(this,R.anim.anim_trans_right);
        Animation animation_img_telephone  = AnimationUtils.loadAnimation(this,R.anim.anim_trans_left);
        Animation animation_img_telegram   = AnimationUtils.loadAnimation(this,R.anim.anim_trans_left);
        Animation animation_img_eitaa      = AnimationUtils.loadAnimation(this,R.anim.anim_trans_left);

        txt_contact_us.setAnimation(animation_txt_contact_us);
        txt_number.setAnimation(animation_txt_number);
        txt_telegram.setAnimation(animation_txt_telegram);
        txt_eitaa.setAnimation(animation_txt_eitaa);
        img_telephone.setAnimation(animation_img_telephone);
        img_telegram.setAnimation(animation_img_telegram);
        img_eitaa.setAnimation(animation_img_eitaa);
    }
}