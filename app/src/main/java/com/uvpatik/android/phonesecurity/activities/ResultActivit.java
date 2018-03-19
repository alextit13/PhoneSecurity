package com.uvpatik.android.phonesecurity.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.uvpatik.android.phonesecurity.R;
import com.uvpatik.android.phonesecurity.classes.objects.Result;

public class ResultActivit extends AppCompatActivity {

    private Result result;
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
        r = intent.getDoubleExtra("r",0);
        rext_result = (TextView) findViewById(R.id.rext_result);
        show_recomendation = (Button) findViewById(R.id.show_recomendation);
        show_recomendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show recomendations
            }
        });
        rext_result.setText("Степень риска = " + r);
    }
}
