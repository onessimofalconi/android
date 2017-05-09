package com.example.sala01.aula2_teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textView);
        String mString = getIntent().getStringExtra("mTag");
        User userGson = new Gson().fromJson(mString, User.class);
        textView.setText(userGson.getName());
        //textView.setText(getIntent().getStringExtra("mTag"));

    }
}
