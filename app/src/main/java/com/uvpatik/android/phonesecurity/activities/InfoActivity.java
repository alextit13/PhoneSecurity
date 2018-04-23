package com.uvpatik.android.phonesecurity.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.uvpatik.android.phonesecurity.R;
import com.uvpatik.android.phonesecurity.classes.objects.Result;
import com.uvpatik.android.phonesecurity.classes.objects.ResultNums;

public class InfoActivity extends AppCompatActivity {

    private LinearLayout container_1,container_2;

    private CheckBox cb_version_android,cb_have_antivirus,cb_root,cb_system_permissions,cb_sms,cb_contakts,cb_camera,cb_location,cb_microphone,cb_disc,cb_ident_data,cb_buys,cb_prosh,cb_knox
            ,cb_internet,cb_protect_internet;
    private EditText et_version_android,et_have_antivirus,et_root,et_system_permissions,et_sms,et_contakts,et_camera,et_location,et_microphone,et_disc,et_ident_data,et_buys,et_prosh,et_knox
            ,et_internet,et_protect_internet;
    private Button calculate_risk;

    int ib_1=0,ib_2=0,ib_3=0,ib_4=0,ib_5=0,ib_6=0,ib_7=0,ib_8=0,ib_9=0,ib_10=0,ib_11=0,ib_12=0,ib_13=0,ib_14=0,ib_15=0,ib_16=0;         // P(t)
    double b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_10,b_11,b_12,b_13,b_14,b_15,b_16;                                                      // S
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initViews();
        listeners();
    }

    private void listeners() {
        calculate_risk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
        cb_system_permissions.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    container_1.setVisibility(View.VISIBLE);
                }else{
                    container_1.setVisibility(View.GONE);
                }
            }
        });
        cb_internet.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    container_2.setVisibility(View.VISIBLE);
                }else{
                    container_2.setVisibility(View.GONE);
                }
            }
        });
    }

    private void calculate() {
        if (cb_version_android.isChecked()){ib_1=1;}if (cb_have_antivirus.isChecked()){ib_2=1;}if (cb_root.isChecked()){ib_3=1;}
        if (cb_system_permissions.isChecked()){ib_4=1;}if (cb_sms.isChecked()){ib_5=1;}if (cb_contakts.isChecked()){ib_6=1;}
        if (cb_camera.isChecked()){ib_7=1;}if (cb_location.isChecked()){ib_8=1;}if (cb_microphone.isChecked()){ib_9=1;}
        if (cb_disc.isChecked()){ib_10=1;}if (cb_ident_data.isChecked()){ib_11=1;}if (cb_buys.isChecked()){ib_12=1;}
        if (cb_prosh.isChecked()){ib_13=1;}if (cb_knox.isChecked()){ib_14=1;}if (cb_internet.isChecked()){ib_15=1;}if (cb_protect_internet.isChecked()){ib_16=1;}
        b_1=Double.parseDouble(et_version_android.getText().toString());b_2=Double.parseDouble(et_have_antivirus.getText().toString());b_3=Double.parseDouble(et_root.getText().toString());
        b_4=Double.parseDouble(et_system_permissions.getText().toString());b_5=Double.parseDouble(et_sms.getText().toString());b_6=Double.parseDouble(et_contakts.getText().toString());
        b_7=Double.parseDouble(et_camera.getText().toString());b_8=Double.parseDouble(et_location.getText().toString());b_9=Double.parseDouble(et_microphone.getText().toString());b_10=Double.parseDouble(et_disc.getText().toString());b_11=Double.parseDouble(et_ident_data.getText().toString());
        b_12=Double.parseDouble(et_buys.getText().toString());b_13=Double.parseDouble(et_prosh.getText().toString());b_14=Double.parseDouble(et_knox.getText().toString());
        b_15=Double.parseDouble(et_internet.getText().toString());b_16=Double.parseDouble(et_protect_internet.getText().toString());
        calculateResult();
    }

    private void calculateResult() {
        result=(ib_1*b_1)+
                (ib_2*b_2)+
                (ib_3*b_3)+
                (ib_4*b_4)+
                (ib_5*b_5)+
                (ib_6*b_6)+
                (ib_7*b_7)+
                (ib_8*b_8)+
                (ib_9*b_9)+
                (ib_10*b_10)+
                (ib_11*b_11)+
                (ib_12*b_12)+
                (ib_13*b_13)+
                (ib_14*b_14)+
                (ib_15*b_15)+
                (ib_16*b_16);
        double maxResult = b_1+b_2+b_3+b_4+b_5+b_6+b_7+b_8+b_9+b_10+b_11+b_12+b_13+b_14+b_15+b_16;
        createResult(maxResult);
    }

    private void createResult(double max) {
        boolean b_1=false,b_2=false,b_3=false,b_4=false,b_5=false,b_6=false,b_7=false,b_8=false,b_9=false,b_10=false,b_11=false,b_12=false,b_13=false,b_14=false,b_15=false,b_16=false;
        if (ib_1==1){b_1=true;}if (ib_2==1){b_2=true;}if (ib_3==1){b_3=true;}if (ib_4==1){b_4=true;}if (ib_5==1){b_5=true;}if (ib_6==1){b_6=true;}if (ib_7==1){b_7=true;}
        if (ib_8==1){b_8=true;}if (ib_9==1){b_9=true;}if (ib_10==1){b_10=true;}if (ib_11==1){b_11=true;}if (ib_12==1){b_12=true;}if (ib_13==1){b_13=true;}if (ib_14==1){b_14=true;}
        if (ib_15==1){b_15=true;}if (ib_16==1){b_16=true;}
        Result r = new Result(b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_10,b_11,b_12,b_13,b_14,b_15,b_16);
        pushResult(r,max);
    }

    private void pushResult(Result r,double max) {
        Intent intent = new Intent(InfoActivity.this,ResultActivit.class);
        intent.putExtra("result", r);
        intent.putExtra("max", max);
        intent.putExtra("r",result);
        ResultNums tn = new ResultNums(b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_10,b_11,b_12,b_13,b_14,b_15,b_16);
        intent.putExtra("tn",tn);
        startActivity(intent);
    }

    private void initViews() {
        container_1 = (LinearLayout)findViewById(R.id.container_1);
        container_1.setVisibility(View.GONE);
        container_2 = (LinearLayout)findViewById(R.id.container_2);
        container_2.setVisibility(View.GONE);

        cb_version_android = (CheckBox)findViewById(R.id.cb_version_android);cb_have_antivirus = (CheckBox)findViewById(R.id.cb_have_antivirus);cb_root = (CheckBox)findViewById(R.id.cb_root);
        cb_system_permissions = (CheckBox)findViewById(R.id.cb_system_permissions);cb_sms = (CheckBox)findViewById(R.id.cb_sms);cb_contakts = (CheckBox)findViewById(R.id.cb_contakts);
        cb_camera = (CheckBox)findViewById(R.id.cb_camera);cb_location = (CheckBox)findViewById(R.id.cb_location);cb_microphone = (CheckBox)findViewById(R.id.cb_microphone);
        cb_disc = (CheckBox)findViewById(R.id.cb_disc);cb_ident_data = (CheckBox)findViewById(R.id.cb_ident_data);cb_buys = (CheckBox)findViewById(R.id.cb_buys);
        cb_prosh = (CheckBox)findViewById(R.id.cb_prosh);cb_knox = (CheckBox)findViewById(R.id.cb_knox);cb_internet = (CheckBox)findViewById(R.id.cb_internet);cb_protect_internet = (CheckBox)findViewById(R.id.cb_protect_internet);

        et_version_android = (EditText)findViewById(R.id.et_version_android);
        et_have_antivirus = (EditText)findViewById(R.id.et_have_antivirus);
        et_root = (EditText)findViewById(R.id.et_root);
        et_system_permissions = (EditText)findViewById(R.id.et_system_permissions);
        et_sms = (EditText)findViewById(R.id.et_sms);
        et_contakts = (EditText)findViewById(R.id.et_contakts);
        et_camera = (EditText)findViewById(R.id.et_camera);
        et_location = (EditText)findViewById(R.id.et_location);
        et_microphone = (EditText)findViewById(R.id.et_microphone);
        et_disc = (EditText)findViewById(R.id.et_disc);
        et_ident_data = (EditText)findViewById(R.id.et_ident_data);
        et_buys = (EditText)findViewById(R.id.et_buys);
        et_prosh = (EditText)findViewById(R.id.et_prosh);
        et_knox = (EditText)findViewById(R.id.et_knox);
        et_internet = (EditText)findViewById(R.id.et_internet);
        et_protect_internet = (EditText)findViewById(R.id.et_protect_internet);

        et_version_android.setText(0.3+"");
        et_have_antivirus.setText(1+"");
        et_root .setText(0.8+"");
        et_system_permissions.setText(0+"");
        et_sms .setText(0.4+"");
        et_contakts.setText(0.2+"");
        et_camera .setText(0.2+"");
        et_location .setText(0.3+"");
        et_microphone.setText(0.1+"");
        et_disc .setText(0.8+"");
        et_ident_data .setText(0.7+"");
        et_buys .setText(0.7+"");
        et_prosh .setText(0.6+"");
        et_knox .setText(0.5+"");
        et_internet.setText(0.9+"");
        et_protect_internet.setText(0.9+"");

        calculate_risk = (Button)findViewById(R.id.calculate_risk);
    }
}
