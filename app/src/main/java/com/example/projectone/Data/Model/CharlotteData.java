package com.example.projectone.Data.Model;

public class CharlotteData {

    public static final String TABLE ="CharlotteData";
    public static final String KEY_PersonName = "PersonName";


    public static final String KEY_OneTwoSleepQuestion = "OneTwoSleepQuestion";
    public static final String KEY_ThreeFourSleepQuestion = "ThreeFourSleepQuestion";
    public static final String KEY_FiveSixSleepQuestion = "FiveSixSleepQuestion";
    public static final String KEY_SevenPlusSleepQuestion = "SevenPlusSleepQuestion";
    public static final String KEY_YesOkay = "YesOkay";
    public static final String KEY_NoOkay = "NoOkay";
    public static final String KEY_AnxietyIllness = "AnxietyIllness";
    public static final String KEY_DepressionIllness = "DepressionIllness";
    public static final String KEY_OcdIllness = "Ocd Illness";
    public static final String KEY_BipolarIllness = "BipolarIllness";
    public static final String KEY_AdhdIllness = "AdhdIllness";
    public static final String KEY_PtsdIllness = "PtsdIllness";
    public static final String KEY_NotSureYetIllness = "NotSureYetIllness";
    public static final String KEY_OtherIllness  = "OtherIllness";
    public static final String KEY_YesSupport = "YesSupport";
    public static final String KEY_NoSupport = "NoSupport";
    public static final String KEY_TryingSupport = "TryingSupport";
    public static final String KEY_ComplicatedSupport = "ComplicatedSupport";
    public static final String KEY_PetSupport = "PetSupport";
    public static final String KEY_TylerSupport = "TylerSupport";
    public static final String KEY_ElijahSupport = "ELijahSupport";
    public static final String KEY_LifeAnswer = "LifeAnswer";

    private String lifeAnswer;
    private int personName;
    private int oneTwoSleepQuestion;
    private int threeFourSleepQuestion;
    private int fiveSixSleepQuestion;
    private int sevenPlusSleepQuestion;
    private int yesOkay;
    private int noOkay;
    private int anxietyIllness;
    private int depressionIllness;
    private int ocdIllness;
    private int bipolarIllness;
    private int adhdIllness;
    private int ptsdIllness;
    private int notSureYetIllness;
    private int otherIllness;
    private int yesSupport;
    private int noSupport;
    private int tryingSupport;
    private int complicatedSupport;
    private int petSupport;
    private int tylerSupport;
    private int elijahSupport;

    public CharlotteData(int name){
    personName = name;

    lifeAnswer = "";
    oneTwoSleepQuestion = 0;
    threeFourSleepQuestion = 0;
    fiveSixSleepQuestion = 0;
    sevenPlusSleepQuestion = 0;
    yesOkay = 0;
    noOkay = 0;
    anxietyIllness = 0;
    depressionIllness = 0;
    ocdIllness = 0;
    bipolarIllness = 0;
    adhdIllness = 0;
    ptsdIllness = 0;
    notSureYetIllness = 0;
    otherIllness = 0;
    yesSupport = 0;
    noSupport = 0;
    tryingSupport = 0;
    complicatedSupport = 0;
    petSupport = 0;
    tylerSupport = 0;
    elijahSupport = 0;
    }

public int getPersonName() {return personName;}
public void setPersonName(int s) {personName = s;}

public String getLifeAnswer() {return lifeAnswer;}
public void setLifeAnswer(String s) {lifeAnswer = s;}


public int getOneTwoSleepQuestion(){return oneTwoSleepQuestion;}
public void setOneTwoSleepQuestion(int b){oneTwoSleepQuestion =b; }

public int getThreeFourSleepQuestion(){return threeFourSleepQuestion;}
public void setThreeFourSleepQuestion(int b){threeFourSleepQuestion =b; }

public int getFiveSixSleepQuestion(){return fiveSixSleepQuestion;}
public void setFiveSixSleepQuestion(int b){fiveSixSleepQuestion =b; }

public int getSevenPlusSleepQuestion(){return sevenPlusSleepQuestion; }
public void setSevenPlusSleepQuestion(int b){sevenPlusSleepQuestion =b; }

public int getYesOkay(){return yesOkay;}
public void setYesOkay(int b){yesOkay =b; }

public int getNoOkay(){return noOkay;}
public void setNoOkay(int b){noOkay =b;}

public int getAnxietyIllness(){return anxietyIllness;}
public void setAnxietyIllness(int b){anxietyIllness =b; }

public int getDepressionIllness(){return depressionIllness;}
public void setDepressionIllness(int b){depressionIllness =b; }

public int getOcdIllness(){return ocdIllness;}
public void setOcdIllness(int b){ocdIllness =b; }

public int getBipolarIllness(){return bipolarIllness;}
public void setBipolarIllness(int b){bipolarIllness =b; }

public int getAdhdIllness(){return  adhdIllness;}
public void setAdhdIllness(int b){adhdIllness =b; }

public int getPtsdIllness(){return ptsdIllness;}
public void setPtsdIllness(int b){ptsdIllness =b; }

public int getNotSureYetIllness(){return notSureYetIllness;}
public void setNotSureYetIllnessIllness(int b){notSureYetIllness =b; }

public int getYesSupport(){return yesSupport;}
public void setYesSupport(int b){yesSupport =b; }

public int getNoSupport(){return noSupport;}
public void setNoSupport(int b){noSupport =b; }

public int getTryingSupport(){return tryingSupport;}
public void setTryingSupports(int b){tryingSupport =b; }

public int getComplicatedSupport(){return complicatedSupport;}
public void setComplicatedSupport(int b){complicatedSupport =b; }

public int getPetSupport(){return petSupport; }
public void setPetSupport(int b){petSupport =b; }

public int getTylerSupport(){return tylerSupport;}
public void setTylerSupport(int b){tylerSupport =b; }

public int getElijahSupport(){return elijahSupport;}
public void setElijahSupport(int b){elijahSupport =b; }
}