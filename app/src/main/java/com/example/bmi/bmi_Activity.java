package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class bmi_Activity extends AppCompatActivity {
    TextView txt_name, txt_weight, txt_tall, txt_gender, txt_result;
    EditText edt_name, edt_weight, edt_tall;
    RadioButton rdo_mr, rdo_miss;
    Button  btn_scale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        findViews();
    }
    public void findViews(){
        txt_name = findViewById(R.id.txt_name);
        txt_weight = findViewById(R.id.txt_weight);
        txt_tall = findViewById(R.id.txt_tall);
        txt_gender = findViewById(R.id.txt_gender);
        txt_result = findViewById(R.id.txt_result);
        edt_name   = findViewById(R.id.edt_name);
        edt_weight = findViewById(R.id.edt_weight);
        edt_tall   = findViewById(R.id.edt_tall);
        rdo_mr   = findViewById(R.id.rdo_mr);
        rdo_miss = findViewById(R.id.rdo_miss);
        btn_scale = findViewById(R.id.btn_scale);
    }
}