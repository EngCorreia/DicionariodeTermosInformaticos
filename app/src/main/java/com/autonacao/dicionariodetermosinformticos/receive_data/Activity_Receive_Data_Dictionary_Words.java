package com.autonacao.dicionariodetermosinformticos.receive_data;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.autonacao.dicionariodetermosinformticos.R;

public class Activity_Receive_Data_Dictionary_Words extends AppCompatActivity {

    private TextView receive_title, receive_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_data_dictionary_words);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        receive_title = findViewById(R.id.receive_title);
        receive_description = findViewById(R.id.receive_description);

        Intent intent = getIntent();
        String receive_data_title = intent.getStringExtra("title");
        String receive_data_description = intent.getStringExtra("description");

        receive_title.setText(receive_data_title);
        receive_description.setText(receive_data_description);
    }
}
