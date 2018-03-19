package com.uvpatik.android.phonesecurity.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.uvpatik.android.phonesecurity.R;
import com.uvpatik.android.phonesecurity.classes.objects.Result;
import com.uvpatik.android.phonesecurity.classes.objects.ResultNums;

import java.text.DecimalFormat;

public class ResultActivit extends AppCompatActivity {

    private Result result;
    private ResultNums tn;
    private double r;
    private TextView rext_result;
    private Button show_recomendation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        result = (Result) intent.getSerializableExtra("result");
        tn = (ResultNums)intent.getSerializableExtra("tn");
        r = intent.getDoubleExtra("r",0);
        rext_result = (TextView) findViewById(R.id.rext_result);
        show_recomendation = (Button) findViewById(R.id.show_recomendation);
        show_recomendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show recomendations
                Intent i = new Intent(ResultActivit.this,Recomendation.class);
                i.putExtra("result",result);
                i.putExtra("r",r);
                i.putExtra("tn",tn);
                startActivity(i);
            }
        });
        chengeText();
    }

    private void chengeText() {
        DecimalFormat mDf = new DecimalFormat("#.#");
        if (r>=0&&r<=0.9){
            rext_result.setText("Уровень риска = " + mDf.format(r) + "\n" + "Низкий уровень риска");
        }else if (r>=1&&r<=2.9){
            rext_result.setText("Уровень риска = " + mDf.format(r)+ "\n" + "Средний уровень риска");
        }else if (r>3){
            rext_result.setText("Уровень риска = " + mDf.format(r) + "\n" + "Высокий уровень риска");
        }
    }
}
