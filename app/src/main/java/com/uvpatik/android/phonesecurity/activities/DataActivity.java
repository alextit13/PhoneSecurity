package com.uvpatik.android.phonesecurity.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.uvpatik.android.phonesecurity.R;
import com.uvpatik.android.phonesecurity.classes.OSInfo;

public class DataActivity extends AppCompatActivity {
    private TextView os_android,version_android,version_prosh,sb_number,security_version
            ,knox_version,level_security,root;
    private ListView all_applications;
    private Button next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initViews();
        listeners();
        completeFields();
    }

    private void completeFields() {
        os_android.setText(OSInfo.osVersion());
        version_android.setText(OSInfo.AndroidVersion());
        version_prosh.setText(OSInfo.andridFirmvareVersion());
        sb_number.setText(OSInfo.buildVersion(DataActivity.this));
        security_version.setText(OSInfo.security());
        level_security.setText(OSInfo.security());
        knox_version.setText(OSInfo.knoxVersion(DataActivity.this));
        all_applications.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,OSInfo.getListApp(DataActivity.this)));
        root.setText(OSInfo.isRoot(this));
    }

    private void listeners() {
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // next
            }
        });
    }

    private void initViews() {
        os_android = (TextView)findViewById(R.id.os_android);
        version_android = (TextView)findViewById(R.id.version_android);
        version_prosh = (TextView)findViewById(R.id.version_prosh);
        sb_number = (TextView)findViewById(R.id.sb_number);
        security_version = (TextView)findViewById(R.id.security_version);
        knox_version = (TextView)findViewById(R.id.knox_version);
        level_security = (TextView)findViewById(R.id.level_security);
        root = (TextView)findViewById(R.id.root);

        all_applications = (ListView) findViewById(R.id.all_applications);

        next_button = (Button) findViewById(R.id.next_button);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about_application:
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog
                        .setTitle(R.string.about_application_item_menu)
                        .setMessage(R.string.about_programm_message_dialog)
                        .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();
        }

        return true;
    }
}
