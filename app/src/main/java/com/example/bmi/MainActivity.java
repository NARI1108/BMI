package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_scale_bmi, btn_about_us, btn_contact_us, btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        btn_scale_bmi = findViewById(R.id.btn_scale_bmi);
        btn_about_us  = findViewById(R.id.btn_about_us);
        btn_contact_us= findViewById(R.id.btn_contact_us);
        btn_exit      = findViewById(R.id.btn_exit);
    }

}