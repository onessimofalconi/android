package com.example.sala01.aula07;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView img, avatar;
    TextView name;

    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.textView2);
        avatar = (ImageView) findViewById(R.id.imageView2);
        img = (ImageView) findViewById(R.id.imageView3);

        //verifica se tem dados salvos
        database = mFireData.getDatabase();

        reference = database.getReference();

        setUser();

        createViewFragment();

    }

    List<Result> lista = new ArrayList<>();

    private void setUser(){
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //for(int i = 0; i < dataSnapshot.getChildrenCount(); i++){ //percorre os 5 usuarios criados no firedata

                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Result user = dataSnapshot.getValue(Result.class);
                    lista.add(user);
                }
                name.setText(lista.get(0).getName().getFirst());
               // name.setText((String)dataSnapshot.child("0/").child("name/").child("first").getValue());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void createViewFragment(){
        FragmentQualquer fragment = new FragmentQualquer();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
