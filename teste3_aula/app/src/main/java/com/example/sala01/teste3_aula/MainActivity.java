package com.example.sala01.teste3_aula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    mInterface mInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.textView3);
    }

    public void myclick(View view){
        startActivityForResult(new Intent(this, Main2Activity.class), RESULT_OK);
    }

    protected  void onAtivirityResult(int requestCode, int resultCode, Intent data){
        of )reqiestCpde == RESULT_OK){
            //Use Data to get string
        }
    }

}
