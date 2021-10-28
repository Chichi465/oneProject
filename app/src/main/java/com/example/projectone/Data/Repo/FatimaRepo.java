package com.example.projectone.Data.Repo;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.projectone.Data.DataBaseManager;
import com.example.projectone.Data.Model.FatimaData;
import java.util.ArrayList;

public class FatimaRepo {

    public static String createTable(){
        return "CREATETABLE" + FatimaData.TABLE + " ( "
                + FatimaData.KEY_PersonName + "TEXT PRIMARY KEY ,"
                + FatimaData.KEY_DrinkNo + "INTEGER ,"
                + FatimaData.KEY_DrinkYes + "INTEGER ,"
                + FatimaData.KEY_EatNo + "INTEGER ,"
                + FatimaData.KEY_EatYes + "INTEGER ,"
                + FatimaData.KEY_FoodMaybe + "INTEGER ,"
                + FatimaData.KEY_FoodNo + "INTEGER ,"
                + FatimaData.KEY_FoodYes + "INTEGER ,"
                + FatimaData.KEY_MealBlue + "INTEGER ,"
                + FatimaData.KEY_MealMore + "INTEGER ,"
                + FatimaData.KEY_MealOne + "INTEGER ,"
                + FatimaData.KEY_MealThree + "INTEGER ,"
                + FatimaData.KEY_MealTwo + "INTEGER ,"
                + FatimaData.KEY_MeatBeef + "INTEGER ,"
                + FatimaData.KEY_MeatChicken + "INTEGER ,"
                + FatimaData.KEY_MeatPork + "INTEGER ,"
                + FatimaData.KEY_MeatSeafood + "INTEGER ,"
                + FatimaData.KEY_FavoriteMealAnswer + "TEXT ,";
    }

    public int insert(FatimaData fatimaData){
        int fatimaDataId;
        SQLiteDatabase db = DataBaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(FatimaData.KEY_PersonName, fatimaData.getPersonName());
        values.put(FatimaData.KEY_FoodYes, fatimaData.getFoodYes());
        values.put(FatimaData.KEY_FoodNo, fatimaData.getFoodNo());
        values.put(FatimaData.KEY_FoodMaybe, fatimaData.getFoodMaybe());
        values.put(FatimaData.KEY_MeatBeef, fatimaData.getMeatBeef());
        values.put(FatimaData.KEY_MeatSeafood, fatimaData.getMeatSeafood());
        values.put(FatimaData.KEY_MeatPork, fatimaData.getMeatPork());
        values.put(FatimaData.KEY_MeatChicken, fatimaData.getMeatChicken());
        values.put(FatimaData.KEY_EatYes, fatimaData.getEatYes());
        values.put(FatimaData.KEY_EatNo, fatimaData.getEatNo());
        values.put(FatimaData.KEY_DrinkYes, fatimaData.getDrinkYes());
        values.put(FatimaData.KEY_DrinkNo, fatimaData.getDrinkNo());
        values.put(FatimaData.KEY_MealTwo, fatimaData.getMealTwo());
        values.put(FatimaData.KEY_MealThree, fatimaData.getMealThree());
        values.put(FatimaData.KEY_MealOne, fatimaData.getMealOne());
        values.put(FatimaData.KEY_MealBlue, fatimaData.getMealBlue());
        values.put(FatimaData.KEY_MealMore, fatimaData.getMealMore());
        values.put(FatimaData.KEY_FavoriteMealAnswer, fatimaData.getFavoriteMealAnswer());

        fatimaDataId = (int)db.insertWithOnConflict(FatimaData.TABLE, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        DataBaseManager.getInstance().closeDatabase();
        return fatimaDataId;
    }
}