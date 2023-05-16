package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_scale_bmi, btn_about_us, btn_contact_us, btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
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
    }
    public void btn_click(View view){
          switch(view.getId()){
              case R.id.btn_exit:finish();
          }
    }
    public void findViews(){
        btn_scale_bmi = findViewById(R.id.btn_scale_bmi);
        btn_about_us  = findViewById(R.id.btn_about_us);
        btn_contact_us= findViewById(R.id.btn_contact_us);
        btn_exit      = findViewById(R.id.btn_exit);
    }

}