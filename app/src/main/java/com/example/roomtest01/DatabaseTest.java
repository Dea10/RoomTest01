package com.example.roomtest01;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Word.class}, version = 1, exportSchema = false)
public abstract class DatabaseTest extends RoomDatabase {
    public abstract DAOWord daoWord();
}
