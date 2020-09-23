package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.example.covidtracker.R.id.errorText;
import static com.example.covidtracker.R.id.errorText2;
import static com.example.covidtracker.R.id.nameText;
import static com.example.covidtracker.R.id.noOne;
import static com.example.covidtracker.R.id.visible;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;

    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    TextView View1;
    TextView View2;
    TextView View3;
    TextView View4;
    TextView View5;
    TextView View6;

    TextView textName;
    Button button1;
    boolean textName2;
    boolean group1, group2, group3, group4, group5;
    boolean yesOne, yesTwo, yesThree, yesFour, yesFive;
    boolean noOne, noTwo, noThree, noFour, noFive;
    String yesOneS = "yesOneS";
    String yesTwoS = "yesTwoS";
    String yesThreeS = "yesThreeS";
    String yesFourS = "yesFourS";
    String yesFiveS = "yesFiveS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View1 = findViewById(R.id.titleText);
        View2 = findViewById(R.id.questionOne);
        View3 = findViewById(R.id.questionTwo);
        View4 = findViewById(R.id.questionThree);
        View5 = findViewById(R.id.questionFour);
        View6 = findViewById(R.id.questionFive);


        textName = findViewById(R.id.nameText);
        button1 = findViewById(R.id.buttonSubmit);
        radioGroup1 = findViewById(R.id.groupOne);
        radioGroup2 = findViewById(R.id.groupTwo);
        radioGroup3 = findViewById(R.id.groupThree);
        radioGroup4 = findViewById(R.id.groupFour);
        radioGroup5 = findViewById(R.id.groupFive);

        /*radioGroup1.setOnCheckedChangeListener();
        radioGroup2.setOnCheckedChangeListener();
        radioGroup3.setOnCheckedChangeListener();
        radioGroup4.setOnCheckedChangeListener();
        radioGroup5.setOnCheckedChangeListener(); */
        /*Date currentTime = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance().format(currentTime);
        TextView textDate = findViewById(R.id.textDate);
        textDate.setText(formattedDate);*/

    }


    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        if (((yesOne || noOne) == true) && ((yesTwo || noTwo) == true) && ((yesThree || noThree) == true) && ((yesFour || noFour) == true) && ((yesFive || noFive) == true)) {
            intent.putExtra(yesOneS, yesOne);
            intent.putExtra(yesTwoS, yesTwo);
            intent.putExtra(yesThreeS, yesThree);
            intent.putExtra(yesFourS, yesFour);
            intent.putExtra(yesFiveS, yesFive);
            String a = findViewById(nameText).toString();
            if(a.equals("Name") || a.equals("")){
                TextView errorText2 = findViewById(R.id.errorText2);
                errorText2.setVisibility(View.VISIBLE);
                startActivity(intent);}
        }
         else {
          TextView errorText = findViewById(R.id.errorText);
          errorText.setVisibility(View.VISIBLE);
            String a = findViewById(R.id.nameText).toString();
            if(a.equals("Name")){
                TextView errorText2 = findViewById(R.id.errorText2);
                errorText2.setVisibility(View.VISIBLE);}
            else if(a.equals("")) {
                TextView errorText2 = findViewById(R.id.errorText2);
                errorText2.setVisibility(View.VISIBLE);}
            }
    }




    public void questionOneclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.yesOne :
                if (checked)
                    yesOne = true;
                break;
            case R.id.noOne:
                if(checked)
                    noOne = true;
                break;

        }
        }
    public void questionTwoclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.yesTwo :
                if (checked)
                    yesTwo = true;
                break;
            case R.id.noTwo:
                if(checked)
                    noTwo = true;
                break;

        }
    }
    public void questionThreeclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.yesThree :
                if (checked)
                    yesThree = true;
                break;
            case R.id.noThree:
                if(checked)
                    noThree = true;
                break;

        }
    }
    public void questionFourclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.yesFour :
                if (checked)
                    yesFour = true;
                break;
            case R.id.noFour:
                if(checked)
                    noFour = true;
                break;

        }
    }
    public void questionFiveclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.yesFive :
                if (checked)
                    yesFive = true;
                break;
            case R.id.noFive:
                if(checked)
                    noFive = true;
                break;

        }
    }


    @Override
    public void onClick(View view) {
        if(!textName.getText().equals("")) {
            textName2 = true;
        }
        else {
            textName2 = false;
        }

        }
    }


