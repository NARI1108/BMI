package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class bmi_Activity extends AppCompatActivity {
    TextView txt_name, txt_weight, txt_tall, txt_gender, txt_result;
    EditText edt_name, edt_weight, edt_tall;
    RadioButton rdo_mr, rdo_miss;
    Button  btn_scale;
    int Weight, tall_centimeter, Weight_Suitable_0, Weight_Suitable_1, Weight_Suitable_2;
    String weight, tall, name;
    float tall_meter, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        findViews();
        animation();
        bmiApp();
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
    public void animation(){
        Animation animation_txt_name = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_txt_weight = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_txt_tall = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_txt_gender = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_txt_result = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_edt_name = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_edt_weight = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_edt_tall = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_rdo_mr  = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_rdo_miss = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        Animation animation_btn_scale = AnimationUtils.loadAnimation(this,R.anim.anim_trans_left);

        txt_name.setAnimation(animation_txt_name);
        txt_weight.setAnimation(animation_txt_weight);
        txt_tall.setAnimation(animation_txt_tall);
        txt_gender.setAnimation(animation_txt_gender);
        txt_result.setAnimation(animation_txt_result);
        edt_name.setAnimation(animation_edt_name);
        edt_weight.setAnimation(animation_edt_weight);
        edt_tall.setAnimation(animation_edt_tall);
        rdo_mr.setAnimation(animation_rdo_mr);
        rdo_miss.setAnimation(animation_rdo_miss);
        btn_scale.setAnimation(animation_btn_scale);
    }
    public void bmiApp(){
        btn_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 name = edt_name.getText().toString().trim();
                 weight = edt_weight.getText().toString().trim();
                 tall = edt_tall.getText().toString().trim();
                if(TextUtils.isEmpty(name) || TextUtils.isEmpty(weight) || TextUtils.isEmpty(tall)){
                    Toast.makeText(getApplicationContext(), "All items must be filled", Toast.LENGTH_SHORT).show();
                }else{

                    Weight =Integer.parseInt(edt_weight.getText().toString());
                    tall_centimeter =Integer.parseInt(edt_tall.getText().toString());

                    tall_meter =(float)tall_centimeter/100;

                    tall_meter =(float)Math.pow(tall_meter,2);

                    result = Weight/tall_meter;

                     Weight_Suitable_0 = (int)(24 * tall_meter);
                     Weight_Suitable_1 =  Weight - Weight_Suitable_0;
                     Weight_Suitable_2 =  Weight_Suitable_0 - Weight;

                     if(rdo_miss.isChecked()){
                         result--;
                     }
                     
                     if(result<16.5){
                         txt_result.setText(name+"Dear, you are severely underweight"+Weight_Suitable_2+"You are underweight.");
                     } else if (result < 18.40 && result >= 16) {
                         txt_result.setText(name+"Dear you, approx"+Weight_Suitable_2+"You are underweight.");
                     } else if (result < 25 && result >= 18.40) {
                         txt_result.setText(name+"Dear, your weight and height are in proportion, but it can be better");
                     } else if (result < 30 && result >= 25) {
                         txt_result.setText(name+"Dear you, approx"+Weight_Suitable_0+"Are you overweight");
                     }else if  (result < 35 && result >= 30 ){
                         txt_result.setText(name+"Dear, you have type 1 obesity and approx"+Weight_Suitable_0+"Are you overweight");
                     } else if (result < 40 && result >= 35 ) {
                         txt_result.setText(name+"Dear, you have type 2 obesity and approx"+Weight_Suitable_0+"Are you overweight");
                     }else if(result > 40){
                         txt_result.setText(name+"Dear, you have type 3 obesity and approx"+Weight_Suitable_0+"take care of yourself");
                     }
                }
            }
        });
    }
}