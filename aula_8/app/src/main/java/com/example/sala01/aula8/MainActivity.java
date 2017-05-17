package com.example.sala01.aula8;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case com.example.sala01.aula8.R.id.navigation_home:
                    mTextMessage.setText(com.example.sala01.aula8.R.string.title_home);
                    return true;
                case com.example.sala01.aula8.R.id.navigation_dashboard:
                    mTextMessage.setText(com.example.sala01.aula8.R.string.title_dashboard);
                    return true;
                case com.example.sala01.aula8.R.id.navigation_notifications:
                    mTextMessage.setText(com.example.sala01.aula8.R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sala01.aula8.R.layout.activity_main);

        mTextMessage = (TextView) findViewById(com.example.sala01.aula8.R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(com.example.sala01.aula8.R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
