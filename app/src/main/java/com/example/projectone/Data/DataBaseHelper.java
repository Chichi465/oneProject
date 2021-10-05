package com.example.projectone.Data;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.projectone.Data.Repo.FatimaRepo;
import com.example.projectone.Data.Repo.WilliamRepo;
import com.example.projectone.Repo.CharlotteRepo;


public class DataBaseHelper {
    public static final int DATABASE_VERSION = 42;
    public static final String DATABASE_NAME = "TabletData.db";
    public static final String TAG = DataBaseHelper.class.getSimpleName();
    public DataBaseHelper()super(App.getContext(), DATABASE_NAME, null, DATABASE_VERSION;)

    @Override

    public void onCreate(SQLiteDatabase db){
        db.execSQL(FatimaRepo.createTable());
        db.execSQL(CharlotteRepo.createTable());
        db.execSQL(WilliamRepo.createTable());
    }

    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        Log.d(TAG, String.format("SQLiteDatabase.onUpgrade(%d -> %d)", oldVersion, newVersion));

        db.execSQL("Drop Table if Exists "+ PersonName.Table);
        onCreate(db);
    }
}
