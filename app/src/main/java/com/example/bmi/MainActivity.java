package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_scale_bmi, btn_about_us, btn_contact_us, btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        animation();
        setOnClickListener();
    }

    public void findViews(){
        btn_scale_bmi = findViewById(R.id.btn_scale_bmi);
        btn_about_us  = findViewById(R.id.btn_about_us);
        btn_contact_us= findViewById(R.id.btn_contact_us);
        btn_exit      = findViewById(R.id.btn_exit);
    }
    public void animation(){

        Animation animation_btn_scale_bmi  = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim_trans_left);
        Animation animation_btn_about_us   = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim_trans_right);
        Animation animation_btn_contact_us = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim_trans_left);
        Animation animation_btn_exit       = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim_trans_right);

        btn_scale_bmi.setAnimation(animation_btn_scale_bmi);
        btn_about_us.setAnimation(animation_btn_about_us);
        btn_contact_us.setAnimation(animation_btn_contact_us);
        btn_exit.setAnimation(animation_btn_exit);
    }
    protected void setOnClickListener(){
        btn_scale_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,bmi_Activity.class));
            }
        });
        btn_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,about_Us_Activity.class));
            }
        });
        btn_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,contact_Us_Activity.class));
            }
        });
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exit_dialog();
            }
        });
    }
    @Override
    public void onBackPressed() {
          exit_dialog();
    }
    void exit_dialog(){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setMessage("Do you wanna exit?");
        alert.setCancelable(false);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alert.create().show();
    }
}