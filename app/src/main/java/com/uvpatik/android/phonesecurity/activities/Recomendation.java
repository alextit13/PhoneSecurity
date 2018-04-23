package com.uvpatik.android.phonesecurity.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.uvpatik.android.phonesecurity.R;
import com.uvpatik.android.phonesecurity.classes.objects.Result;
import com.uvpatik.android.phonesecurity.classes.objects.ResultNums;

public class Recomendation extends AppCompatActivity {

    private Button b_1;
    private Result result;
    private ResultNums tn;
    private double r;
    private double r_0,procent;
    private TextView tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13, tv_14, tv_16;
    private CheckBox cb_1, cb_2, cb_3, cb_4, cb_5, cb_6, cb_7, cb_8, cb_9, cb_10, cb_11, cb_12, cb_13, cb_14, cb_16;
    private LinearLayout l_1, l_2, l_3, l_4, l_5, l_6, l_7, l_8, l_9, l_10, l_11, l_12, l_13, l_14, l_16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendation);
        getData();
        initView();
    }

    private void getData() {
        result = (Result) getIntent().getSerializableExtra("result");
        r = getIntent().getDoubleExtra("r", 0);
        procent = getIntent().getDoubleExtra("procent", 0);
        tn = (ResultNums) getIntent().getSerializableExtra("tn");
        r_0 = r;
    }

    private void initView() {
        b_1 = (Button) findViewById(R.id.b_1);

        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        tv_5 = (TextView) findViewById(R.id.tv_5);
        tv_6 = (TextView) findViewById(R.id.tv_6);
        tv_7 = (TextView) findViewById(R.id.tv_7);
        tv_8 = (TextView) findViewById(R.id.tv_8);
        tv_9 = (TextView) findViewById(R.id.tv_9);
        tv_10 = (TextView) findViewById(R.id.tv_10);
        tv_11 = (TextView) findViewById(R.id.tv_11);
        tv_12 = (TextView) findViewById(R.id.tv_12);
        tv_13 = (TextView) findViewById(R.id.tv_13);
        tv_14 = (TextView) findViewById(R.id.tv_14);
        tv_16 = (TextView) findViewById(R.id.tv_16);

        cb_1 = (CheckBox) findViewById(R.id.cb_1);
        cb_2 = (CheckBox) findViewById(R.id.cb_2);
        cb_3 = (CheckBox) findViewById(R.id.cb_3);
        cb_4 = (CheckBox) findViewById(R.id.cb_4);
        cb_5 = (CheckBox) findViewById(R.id.cb_5);
        cb_6 = (CheckBox) findViewById(R.id.cb_6);
        cb_7 = (CheckBox) findViewById(R.id.cb_7);
        cb_8 = (CheckBox) findViewById(R.id.cb_8);
        cb_9 = (CheckBox) findViewById(R.id.cb_9);
        cb_10 = (CheckBox) findViewById(R.id.cb_10);
        cb_11 = (CheckBox) findViewById(R.id.cb_11);
        cb_12 = (CheckBox) findViewById(R.id.cb_12);
        cb_13 = (CheckBox) findViewById(R.id.cb_13);
        cb_14 = (CheckBox) findViewById(R.id.cb_14);
        cb_16 = (CheckBox) findViewById(R.id.cb_16);

        l_1 = (LinearLayout) findViewById(R.id.l_1);
        l_2 = (LinearLayout) findViewById(R.id.l_2);
        l_3 = (LinearLayout) findViewById(R.id.l_3);
        l_4 = (LinearLayout) findViewById(R.id.l_4);
        l_5 = (LinearLayout) findViewById(R.id.l_5);
        l_6 = (LinearLayout) findViewById(R.id.l_6);
        l_7 = (LinearLayout) findViewById(R.id.l_7);
        l_8 = (LinearLayout) findViewById(R.id.l_8);
        l_9 = (LinearLayout) findViewById(R.id.l_9);
        l_10 = (LinearLayout) findViewById(R.id.l_10);
        l_11 = (LinearLayout) findViewById(R.id.l_11);
        l_12 = (LinearLayout) findViewById(R.id.l_12);
        l_13 = (LinearLayout) findViewById(R.id.l_13);
        l_14 = (LinearLayout) findViewById(R.id.l_14);
        l_16 = (LinearLayout) findViewById(R.id.l_16);
        clicker();
        completeViews();
    }

    private void completeViews() {
        tv_1.setText(R.string.t_1);
        tv_2.setText(R.string.t_2);
        tv_3.setText(R.string.t_3);
        tv_4.setText(R.string.t_4);
        tv_5.setText(R.string.t_5);
        tv_6.setText(R.string.t_6);
        tv_7.setText(R.string.t_7);
        tv_8.setText(R.string.t_8);
        tv_9.setText(R.string.t_9);
        tv_10.setText(R.string.t_10);
        tv_11.setText(R.string.t_11);
        tv_12.setText(R.string.t_12);
        tv_13.setText(R.string.t_13);
        tv_14.setText(R.string.t_14);
        //tv_15.setText(R.string.t_15);
        tv_16.setText(R.string.t_16);
        checkAndCollapse();
    }

    private void checkAndCollapse() {
        if (!result.isB_1()) {
            l_1.setVisibility(View.GONE);
        }
        if (!result.isB_2()) {
            l_2.setVisibility(View.GONE);
        }
        if (!result.isB_3()) {
            l_3.setVisibility(View.GONE);
        }
        if (!result.isB_4()) {
            l_4.setVisibility(View.GONE);
        }
        if (!result.isB_5()) {
            l_5.setVisibility(View.GONE);
        }
        if (!result.isB_6()) {
            l_6.setVisibility(View.GONE);
        }
        if (!result.isB_7()) {
            l_7.setVisibility(View.GONE);
        }
        if (!result.isB_8()) {
            l_8.setVisibility(View.GONE);
        }
        if (!result.isB_9()) {
            l_9.setVisibility(View.GONE);
        }
        if (!result.isB_10()) {
            l_10.setVisibility(View.GONE);
        }
        if (!result.isB_11()) {
            l_11.setVisibility(View.GONE);
        }
        if (!result.isB_12()) {
            l_12.setVisibility(View.GONE);
        }
        if (!result.isB_13()) {
            l_13.setVisibility(View.GONE);
        }
        if (!result.isB_14()) {
            l_14.setVisibility(View.GONE);
        }
        if (!result.isB_16()) {
            l_16.setVisibility(View.GONE);
        }
    }

    private void createNewResult() {
        if (cb_1.isChecked()) {
            r = r - tn.getD_1();
        }
        if (cb_2.isChecked()) {
            r =  r -tn.getD_2();
        }
        if (cb_3.isChecked()) {
            r = r  -tn.getD_3();
        }
        if (cb_4.isChecked()) {
            r = r  -tn.getD_4();
        }
        if (cb_5.isChecked()) {
            r =  r -tn.getD_5();
        }
        if (cb_6.isChecked()) {
            r = r  -tn.getD_6();
        }
        if (cb_7.isChecked()) {
            r = r  -tn.getD_7();
        }
        if (cb_8.isChecked()) {
            r = r  -tn.getD_8();
        }
        if (cb_9.isChecked()) {
            r = r  -tn.getD_9();
        }
        if (cb_10.isChecked()) {
            r = r  -tn.getD_10();
        }
        if (cb_11.isChecked()) {
            r = r  -tn.getD_11();
        }
        if (cb_12.isChecked()) {
            r = r  -tn.getD_12();
        }
        if (cb_13.isChecked()) {
            r = r  -tn.getD_13();
        }
        if (cb_14.isChecked()) {
            r = r  -tn.getD_14();
        }
        //if (cb_15.isChecked()){result.setB_15(true);r = r - tn.getD_15();}
        if (cb_16.isChecked()) {
            r = r  -tn.getD_16();
        }

    }

    private void clicker() {
        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewResult();
                r_0 = procent;
                Intent intent = new Intent(Recomendation.this, FinishActivity.class);
                intent.putExtra("r_0", r_0); // был
                intent.putExtra("r", r);
                startActivity(intent);
            }
        });
    }
}
