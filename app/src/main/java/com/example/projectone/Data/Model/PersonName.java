package com.example.projectone.Data.Model;

public class PersonName {
    public static final String TABLE = "People";
    public static final String KEY_PersonName = "People";
    private String personName;
    public PersonName(){

        personName = "Person Name";
    }
    public String getPersonName() {

        return personName;
    }
    public void setPersonName(String s) {

        personName = s;
    }

}
