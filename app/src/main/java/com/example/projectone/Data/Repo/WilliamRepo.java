package com.example.projectone.Data.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.projectone.Data.DataBaseManager;
import com.example.projectone.Data.Model.WilliamData;

import java.util.ArrayList;

public class WilliamRepo {

    public static String createTable(){
        return "CREATETABLE" + WilliamData.TABLE + " ( "
                + WilliamData.KEY_PersonName + "TEXT PRIMARY KEY ,"
                + WilliamData.KEY_HoursSleptOneToThree + "INTEGER ,"
                + WilliamData.KEY_HoursSleptFourToSeven + "INTEGER ,"
                + WilliamData.KEY_HoursSleptEightToEleven + "INTEGER ,"
                + WilliamData.KEY_HoursSleptTwelvePlus + "INTEGER ,"
                + WilliamData.KEY_SleepComfortYes + "INTEGER ,"
                + WilliamData.KEY_SleepComfortNo + "INTEGER ,"
                + WilliamData.KEY_EnergyWakeYes + "INTEGER ,"
                + WilliamData.KEY_EnergyWakeMeh + "INTEGER ,"
                + WilliamData.KEY_EnergyWakeNo + "INTEGER ,"
                + WilliamData.KEY_MattressYes+ "INTEGER ,"
                + WilliamData.KEY_MattressNo + "INTEGER ,"
                + WilliamData.KEY_ShareRoomYes + "INTEGER ,"
                + WilliamData.KEY_ShareRoomNo + "INTEGER ,"
                + WilliamData.KEY_DreamYes + "INTEGER ,"
                + WilliamData.KEY_DreamNo + "INTEGER ,"
                + WilliamData.KEY_WakeyFeelyHappy + "INTEGER ,"
                + WilliamData.KEY_WakeyFeelySad + "INTEGER ,"
                + WilliamData.KEY_WakeyFeelyMad + "INTEGER ,"
                + WilliamData.KEY_WakeyFeelyTired + "INTEGER ,"
                + WilliamData.KEY_AnswerBedtime + "TEXT ,";
    }

    public int insert(WilliamData williamData){
        int WilliamDataId;
        SQLiteDatabase db = DataBaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(WilliamData.KEY_PersonName, williamData.getPersonName());
        values.put(WilliamData.KEY_HoursSleptOneToThree, williamData.getHoursSleptOneToThree());
        values.put(WilliamData.KEY_HoursSleptFourToSeven, williamData.getHoursSleptFourToSeven());
        values.put(WilliamData.KEY_HoursSleptEightToEleven, williamData.getHoursSleptEightToEleven());
        values.put(WilliamData.KEY_HoursSleptTwelvePlus, williamData.getHoursSleptTwelvePlus());
        values.put(WilliamData.KEY_SleepComfortYes, williamData.getSleepComfortYes());
        values.put(WilliamData.KEY_SleepComfortNo, williamData.getSleepComfortNo());
        values.put(WilliamData.KEY_EnergyWakeYes, williamData.getEnergyWakeYes());
        values.put(WilliamData.KEY_EnergyWakeMeh, williamData.getEnergyWakeMeh());
        values.put(WilliamData.KEY_EnergyWakeNo, williamData.getEnergyWakeNo());
        values.put(WilliamData.KEY_MattressYes, williamData.getMattressYes());
        values.put(WilliamData.KEY_MattressNo, williamData.getMattressNo());
        values.put(WilliamData.KEY_ShareRoomYes, williamData.getShareRoomYes());
        values.put(WilliamData.KEY_ShareRoomNo, williamData.getShareRoomNo());
        values.put(WilliamData.KEY_DreamYes, williamData.getDreamYes());
        values.put(WilliamData.KEY_DreamNo, williamData.getDreamNo());
        values.put(WilliamData.KEY_WakeyFeelyHappy, williamData.getWakeyFeelyHappy());
        values.put(WilliamData.KEY_WakeyFeelySad, williamData.getWakeyFeelySad());
        values.put(WilliamData.KEY_WakeyFeelyMad, williamData.getWakeyFeelyMad());
        values.put(WilliamData.KEY_WakeyFeelyTired, williamData.getWakeyFeelyTired());
        values.put(WilliamData.KEY_AnswerBedtime, williamData.getAnswerBedTime());

        WilliamDataId = (int)db.insertWithOnConflict(WilliamData.TABLE, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        DataBaseManager.getInstance().closeDatabase();
        return WilliamDataId;
    }
    public int update(WilliamData williamData) {
        int WilliamDataId;
        SQLiteDatabase db = DataBaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(WilliamData.KEY_PersonName, williamData.getPersonName());
        values.put(WilliamData.KEY_HoursSleptOneToThree, williamData.getHoursSleptOneToThree());
        values.put(WilliamData.KEY_HoursSleptFourToSeven, williamData.getHoursSleptFourToSeven());
        values.put(WilliamData.KEY_HoursSleptEightToEleven, williamData.getHoursSleptEightToEleven());
        values.put(WilliamData.KEY_HoursSleptTwelvePlus, williamData.getHoursSleptTwelvePlus());
        values.put(WilliamData.KEY_SleepComfortYes, williamData.getSleepComfortYes());
        values.put(WilliamData.KEY_SleepComfortNo, williamData.getSleepComfortNo());
        values.put(WilliamData.KEY_EnergyWakeYes, williamData.getEnergyWakeYes());
        values.put(WilliamData.KEY_EnergyWakeMeh, williamData.getEnergyWakeMeh());
        values.put(WilliamData.KEY_EnergyWakeNo, williamData.getEnergyWakeNo());
        values.put(WilliamData.KEY_MattressYes, williamData.getMattressYes());
        values.put(WilliamData.KEY_MattressNo, williamData.getMattressNo());
        values.put(WilliamData.KEY_ShareRoomYes, williamData.getShareRoomYes());
        values.put(WilliamData.KEY_ShareRoomNo, williamData.getShareRoomNo());
        values.put(WilliamData.KEY_DreamYes, williamData.getDreamYes());
        values.put(WilliamData.KEY_DreamNo, williamData.getDreamNo());
        values.put(WilliamData.KEY_WakeyFeelyHappy, williamData.getWakeyFeelyHappy());
        values.put(WilliamData.KEY_WakeyFeelySad, williamData.getWakeyFeelySad());
        values.put(WilliamData.KEY_WakeyFeelyMad, williamData.getWakeyFeelyMad());
        values.put(WilliamData.KEY_WakeyFeelyTired, williamData.getWakeyFeelyTired());
        values.put(WilliamData.KEY_AnswerBedtime, williamData.getAnswerBedTime());

        WilliamDataId = db.update(WilliamData.TABLE, values, WilliamData.KEY_PersonName + " = " + williamData.getPersonName(), null);
        DataBaseManager.getInstance().closeDatabase();
        return WilliamDataId;
    }
    public ArrayList<Integer> getNames() {
        ArrayList<Integer> names = new ArrayList<>();
        names.add(0);
        SQLiteDatabase db = DataBaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT WilliamData." + WilliamData.KEY_PersonName + "FROM" + WilliamData.TABLE;
        Cursor cursor = db.rawQuery(selectQuery, null);
        if(cursor.moveToFirst()) {
            do {
                names.add(cursor.getInt(cursor.getColumnIndex(WilliamData.KEY_PersonName)));
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        DataBaseManager.getInstance().closeDatabase();
        return names;
    }
    public WilliamData getPersonData(int personName) {
        WilliamData williamData = new WilliamData(personName);

        SQLiteDatabase db = DataBaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT WilliamData." + WilliamData.KEY_PersonName
                + ", WilliamData." + WilliamData.KEY_HoursSleptOneToThree
                + ", WilliamData." + WilliamData.KEY_HoursSleptFourToSeven
                + ", WilliamData." + WilliamData.KEY_HoursSleptEightToEleven
                + ", WilliamData." + WilliamData.KEY_HoursSleptTwelvePlus
                + ", WilliamData." + WilliamData.KEY_SleepComfortYes
                + ", WilliamData." + WilliamData.KEY_SleepComfortNo
                + ", WilliamData." + WilliamData.KEY_EnergyWakeYes
                + ", WilliamData." + WilliamData.KEY_EnergyWakeNo
                + ", WilliamData." + WilliamData.KEY_EnergyWakeMeh
                + ", WilliamData." + WilliamData.KEY_MattressYes
                + ", WilliamData." + WilliamData.KEY_MattressNo
                + ", WilliamData." + WilliamData.KEY_ShareRoomYes
                + ", WilliamData." + WilliamData.KEY_ShareRoomNo
                + ", WilliamData." + WilliamData.KEY_DreamYes
                + ", WilliamData." + WilliamData.KEY_DreamNo
                + ", WilliamData." + WilliamData.KEY_WakeyFeelyHappy
                + ", WilliamData." + WilliamData.KEY_WakeyFeelySad
                + ", WilliamData." + WilliamData.KEY_WakeyFeelyMad
                + ", WilliamData." + WilliamData.KEY_WakeyFeelyTired
                + "FROM" + WilliamData.TABLE
                + "WHERE WilliamData." + WilliamData.KEY_PersonName + " = " + personName;
        Cursor cursor = db.rawQuery(selectQuery, null);

    }
}
