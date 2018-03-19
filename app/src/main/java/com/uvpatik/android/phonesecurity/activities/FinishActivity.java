package com.uvpatik.android.phonesecurity.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.uvpatik.android.phonesecurity.R;
import com.uvpatik.android.phonesecurity.classes.objects.Result;

import java.text.DecimalFormat;

public class FinishActivity extends AppCompatActivity {

    private TextView about_risk;
    //private Result result;
    private double r_0,r_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        r_0= intent.getDoubleExtra("r_0",0); // был
        r_1 = intent.getDoubleExtra("r",0);  // новый

        DecimalFormat mDf = new DecimalFormat("#.#");
        ((TextView)findViewById(R.id.first_risk)).setText("Исходный риск: " + r_0);
        ((TextView)findViewById(R.id.second_risk)).setText("Риск после выполнения рекомендаций: " + mDf.format((100*r_1)/r_0) + " %");
        about_risk = (TextView)findViewById(R.id.about_risk);
        DecimalFormat mDecimalFormat = new DecimalFormat("#.#");
        if (r_1>=0&&r_1<=0.9){
            about_risk.setText("Уровень риска = " + mDecimalFormat.format(r_1) + "\n" + "Низкий уровень риска");
        }else if (r_1>=1&&r_1<=2.9){
            about_risk.setText("Уровень риска = " + mDecimalFormat.format(r_1) + "\n" + "Средний уровень риска");
        }else if (r_1>3){
            about_risk.setText("Уровень риска = " + mDecimalFormat.format(r_1) + "\n" + "Высокий уровень риска");
        }
        ((Button)findViewById(R.id.b_exit))
                .setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                android.os.Process.killProcess(android.os.Process.myPid());
                            }
                        }
                );
    }
}
