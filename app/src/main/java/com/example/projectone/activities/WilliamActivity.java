package com.example.projectone.activities;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class WilliamActivity {

    private Spinner personName;
    private EditText answerBedTime;
    private RadioButton hoursSleptNotSlept;
    private RadioButton hoursSleptOneToThree;
    private RadioButton hoursSleptFourToSeven;
    private RadioButton hoursSleptEightToEleven;
    private RadioButton hoursSleptTwelvePlus;
    private RadioButton sleepComfortYes;
    private RadioButton sleepComfortNo;
    private RadioButton energyWakeYes;
    private RadioButton energyWakeMeh;
    private RadioButton energyWakeNo;
    private RadioButton mattressYes;
    private RadioButton mattressNo;
    private RadioButton dreamYes;
    private RadioButton dreamNo;
    private CheckBox wakeyFeelySad;
    private CheckBox wakeyFeelyHappy;
    private CheckBox wakeyFeelyMad;
    private CheckBox wakeyFeelyTired;
    private ArrayList<String> data = new ArrayList<>();
}
