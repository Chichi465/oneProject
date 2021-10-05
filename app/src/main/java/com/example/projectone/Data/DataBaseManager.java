package com.example.projectone.Data;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseManager {
    private Integer mOpenCounter = 0;

    private static DatabaseManager instance;
    private static SQLiteOpenHelper mDatabaseHelper;
    private SQLiteDatabase mDatabase;

    public static synchronized void initializedInstance(SQLiteOpenHelper helper){
        if (instance == null){
            instance = new DatabaseManager();
            mDatabaseHelper = helper;
        }
    }
    public static synchronized DatabaseManager getInstance(){
        if(instance == null){
            throw new IllegalStateException(DatabaseManager.class.getSimpleName() + " is now initialized, call initializeInstance() methodfirst.");
        }
        return instance;
    }

    public synchronized SQLiteDatatbase openDatabase(){
        mOpenCounter++;
        if(mOpenCOunter == 1){
            mDatabase = mDatabaseHelper.getWritableDatabase();
        }
        return mDatabase;
    }

    public synchronized void closeDatabase(){
        mOpenCounter--;
        if(mOpenCounter == 0){
            mDatabase.close();
        }
    }
}