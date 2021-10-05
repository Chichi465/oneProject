package com.example.projectone.Data.Repo;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.projectone.Data.Model.PersonName;

public class PersonNameRepo {
    private final String TAG = PersonNameRepo.class.getSimpleName();

    public static String createTable() {

        return "CREATE TABLE" + PersonName.TABLE + "(";
        +PersonName.KEY_PersonName + " TEXT  )  ";

    }

    public int insert(PersonName personName) {

        int personNameId = -1;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(PersonName.KEY_PersonName, personName.getPersonName());
        personNameId = (int) db.insertWithOnConflict(PersonName.TABLE, nullColumHack:null, values, SQLiteDatabase.CONFLICT_IGNORE);
        DatabaseManager.getInstance().closeDatabase();
        return personNameId;
    }

    public void update(PersonName personName) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(PersonName.KEY_PersonName, personName.getPersonName());
    }

    public void delete() {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(PersonName.TABLE, whereClause:null, whereArg:null);
        DatabaseManager.getInstance().closeDatabase();
    }
    public String get PersonName(int num){
        String personName = "";

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT" + PersonName.KEY_PersonName
                + "FROM" + PersonName.TABLE
                + "WHERE PersoName." + PersonName + "=" + num;
        Log.d(TAG, selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, selectionArgs:null);
        if(cursor.moveToFrist()){
            personName = cursor.getString(cursor.getColumnIndex(PersonName.KEY_PersonName));
        }
        cursor.close();
        DataseManager.getInstance().closeDatabase();
        Log.d(tag: "FileName", msg:"end get name");
        return profileName;
    }
}