 package com.example.projectone.Data.Model;

import android.widget.RadioButton;

public class WilliamData {

    public static final String TABLE = "WilliamActivity";
    public static final String KEY_PersonName = "personName";
    public static final String KEY_AnswerBedtime = "answerBedTime";
    public static final String KEY_HoursSleptNotSlept = "hoursSleptNotSlept";
    public static final String KEY_HoursSleptOneToThree = "hoursSleptOneToThree";
    public static final String KEY_HoursSleptFourToSeven = "hoursSleptFourToSeven";
    public static final String KEY_HoursSleptEightToEleven = "hoursSleptEightToEleven";
    public static final String KEY_HoursSleptTwelvePlus = "hoursSleptTwelvePlus";
    public static final String KEY_SleepComfortYes = "sleepComfortYes";
    public static final String KEY_SleepComfortNo = "sleepComfortNo";
    public static final String KEY_EnergyWakeYes = "energyWakeYes";
    public static final String KEY_EnergyWakeMeh = "energyWakeMeh";
    public static final String KEY_EnergyWakeNo = "energyWakeNo";
    public static final String KEY_MattressNo = "mattressNo";
    public static final String KEY_MattressYes = "mattressYes";
    public static final String KEY_ShareRoomYes = "shareRoomYes";
    public static final String KEY_ShareRoomNo = "shareRoomNo";
    public static final String KEY_DreamYes = "dreamYes";
    public static final String KEY_DreamNo = "dreamNo";
    public static final String KEY_WakeyFeelySad = "wakeyFeelySad";
    public static final String KEY_WakeyFeelyHappy = "wakeyFeelyHappy";
    public static final String KEY_WakeyFeelyMad = "wakeyFeelyMad";
    public static final String KEY_WakeyFeelyTired = "wakeyFeelyTired";

    private String answerBedTime;
    private int personName;
    private int hoursSleptNotSlept;
    private int hoursSleptOneToThree;
    private int hoursSleptFourToSeven;
    private int hoursSleptEightToEleven;
    private int hoursSleptTwelvePlus;
    private int sleepComfortYes;
    private int sleepComfortNo;
    private int energyWakeYes;
    private int energyWakeMeh;
    private int energyWakeNo;
    private int mattressYes;
    private int mattressNo;
    private int shareRoomYes;
    private int shareRoomNo;
    private int dreamYes;
    private int dreamNo;
    private int wakeyFeelySad;
    private int wakeyFeelyHappy;
    private int wakeyFeelyMad;
    private int wakeyFeelyTired;

    public WilliamData(int name) {
        personName = name;
        answerBedTime = "";
        hoursSleptNotSlept = 0;
        hoursSleptOneToThree = 0;
        hoursSleptFourToSeven = 0;
        hoursSleptEightToEleven = 0;
        hoursSleptTwelvePlus = 0;
        sleepComfortYes = 0;
        sleepComfortNo = 0;
        energyWakeYes = 0;
        energyWakeMeh = 0;
        energyWakeNo = 0;
        mattressYes = 0;
        mattressNo = 0;
        shareRoomYes = 0;
        shareRoomNo = 0;
        dreamYes = 0;
        dreamNo = 0;
        wakeyFeelySad = 0;
        wakeyFeelyHappy = 0;
        wakeyFeelyMad = 0;
        wakeyFeelyTired = 0;

    }
    public int getPersonName() { return personName; }
    public void setPersonName(int s) { personName = s; }

    public String getAnswerBedTime() { return answerBedTime;}
    public void setAnswerBedTime(String s) { answerBedTime = s;}

    public int getHoursSleptNotSlept() { return hoursSleptNotSlept;}
    public void setHoursSleptNotSlept(int b) { hoursSleptNotSlept = b;}

    public int getHoursSleptOneToThree() {return hoursSleptOneToThree;}
    public void setHoursSleptOneToThree(int b) { hoursSleptOneToThree = b;}

    public int getHoursSleptFourToSeven(){return hoursSleptFourToSeven;}
    public void setHoursSleptFourToSeven(int b){ hoursSleptFourToSeven = b; }

    public int getHoursSleptEightToEleven(){return hoursSleptEightToEleven;}
    public void setHoursSleptEightToEleven(int b){ hoursSleptEightToEleven = b; }

    public int getHoursSleptTwelvePlus(){return hoursSleptTwelvePlus;}
    public void setHoursSleptTwelvePlus(int b){ hoursSleptTwelvePlus = b; }

    public int getSleepComfortYes(){return sleepComfortYes;}
    public void setSleepComfortYes(int b){ sleepComfortYes = b; }

    public int getSleepComfortNo(){return sleepComfortNo;}
    public void setSleepComfortNo(int b){ sleepComfortNo = b; }

    public int getEnergyWakeYes(){return energyWakeYes;}
    public void setEnergyWakeYes(int b){ energyWakeYes = b; }

    public int getEnergyWakeMeh(){return energyWakeMeh;}
    public void setEnergyWakeMeh(int b){ energyWakeMeh = b; }

    public int getEnergyWakeNo(){return energyWakeNo;}
    public void setEnergyWakeNo(int b){ energyWakeNo = b; }

    public int getMattressYes(){return mattressYes;}
    public void setMattressYes(int b){  mattressYes = b; }

    public int getMattressNo(){return mattressNo;}
    public void setMattressNo(int b){ mattressNo = b; }

    public int getShareRoomYes(){return shareRoomYes;}
    public void setShareRoomYes(int b){ shareRoomYes = b; }

    public int getShareRoomNo(){return shareRoomNo;}
    public void setShareRoomNo(int b){ shareRoomNo = b; }

    public int getDreamYes(){return dreamYes;}
    public void setDreamYes(int b){ dreamYes = b; }

    public int getDreamNo(){return dreamNo;}
    public void getDreamNo(int b){ dreamNo = b; }

    public int getWakeyFeelySad(){return wakeyFeelySad;}
    public void setWakeyFeelySad(int b){ wakeyFeelySad = b; }

    public int getWakeyFeelyHappy(){return wakeyFeelyHappy;}
    public void setWakeyFeelyHappy(int b){ wakeyFeelyHappy = b; }

    public int getWakeyFeelyMad(){return wakeyFeelyMad;}
    public void setWakeyFeelyMad(int b){ wakeyFeelyMad = b; }

    public int getWakeyFeelyTired(){return wakeyFeelyTired;}
    public void setWakeyFeelyTired(int b){ wakeyFeelyTired = b; }
}
