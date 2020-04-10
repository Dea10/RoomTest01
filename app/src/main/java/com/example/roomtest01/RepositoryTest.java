package com.example.roomtest01;

import android.content.Context;

import androidx.room.Room;

public class RepositoryTest {
    private String DB_NAME = "db_dea";
    private DatabaseTest databaseTest;

    public RepositoryTest(Context context) {
        databaseTest = Room.databaseBuilder(context, DatabaseTest.class, DB_NAME).build();
    }

    public void insert(String newWord) {
        Word word = new Word(newWord);
    }
}
