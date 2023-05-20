package com.example.bmi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class about_Us_Activity extends AppCompatActivity {
    TextView txt_about_us, txt_version;
    ImageView img_icon;
    Button btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        findViews();
        animation();
        buttonExit();
    }
    public void findViews(){
        txt_about_us = findViewById(R.id.txt_about_us);
        txt_version  = findViewById(R.id.txt_version);
        img_icon     = findViewById(R.id.img_icon);
        btn_exit     = findViewById(R.id.btn_exit);
    }
    public void animation(){
        Animation   animation_txt_about_us = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation   animation_txt_version  = AnimationUtils.loadAnimation(this,R.anim.anim_trans_right);
        Animation   animation_img_icon     = AnimationUtils.loadAnimation(this,R.anim.anim_trans_left);
        Animation   animation_btn_exit     = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);

          txt_about_us.setAnimation(animation_txt_about_us);
          txt_version.setAnimation(animation_txt_version);
          img_icon.setAnimation(animation_img_icon);
          btn_exit.setAnimation(animation_btn_exit);
    }

    @Override
    public void onBackPressed() {
        buttonExit();
    }
    void buttonExit(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setCancelable(false);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}