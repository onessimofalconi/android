package com.example.sala01.aula07;

/**
 * Created by sala01 on 16/05/2017.
 */

import com.google.firebase.database.FirebaseDatabase;

public class mFireData {

    private static FirebaseDatabase mDatabase;

    public mFireData() {
    }

    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }

        return mDatabase;
    }

}
