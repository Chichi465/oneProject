package com.example.projectone.Data;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseManager {
    private Integer mOpenCounter = 0;

    private static DataBaseManager instance;
    private static SQLiteOpenHelper mDatabaseHelper;
    private SQLiteDatabase mDatabase;

    public static synchronized void initializedInstance(SQLiteOpenHelper helper){
        if (instance == null){
            instance = new DataBaseManager();
            mDatabaseHelper = helper;
        }
    }
    public static synchronized DataBaseManager getInstance(){
        if(instance == null){
            throw new IllegalStateException(DataBaseManager.class.getSimpleName() + " is now initialized, call initializeInstance() methodfirst.");
        }
        return instance;
    }

    public synchronized SQLiteDatabase openDatabase(){
        mOpenCounter++;
        if(mOpenCounter == 1){
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