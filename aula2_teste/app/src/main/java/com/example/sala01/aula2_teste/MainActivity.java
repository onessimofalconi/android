package com.example.sala01.aula2_teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAnother();
//                EditText emailText = (EditText) findViewById(R.id.editText);
//
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("email", emailText.getText().toString());
//                startActivity(intent);
            }
        });
    }

    private void goToAnother(){
        String desc = getResources().getString(R.string.lorem);

        User user = new User();
        user.setName(editText.getText().toString());

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("mTag", new Gson().toJson(user));

        //Intent intent = new Intent(this, Main2Activity.class);
        //intent.putExtra("mTag", editText.getText().toString());
        startActivity(intent);
    }
}
