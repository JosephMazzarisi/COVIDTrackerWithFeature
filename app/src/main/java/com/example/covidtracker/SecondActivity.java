package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class SecondActivity extends AppCompatActivity {

    private boolean yesOne;
    private boolean yesTwo;
    private boolean yesThree;
    private boolean yesFour;
    private boolean yesFive;
    private String nameOfPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        yesOne = b.getBoolean("yesOneS");
        yesTwo = b.getBoolean("yesTwoS");
        yesThree = b.getBoolean("yesThreeS");
        yesFour = b.getBoolean("yesFourS");
        yesFive = b.getBoolean("yesFiveS");
        Date currentTime;
        String nameOfPerson = intent.getExtras().getString("nameOfPerson");
        currentTime = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance().format(currentTime);
        TextView textDate = findViewById(R.id.textDate);
        textDate.setText(formattedDate);
        TextView nameOfperson = findViewById(R.id.nameOfPerson);
        nameOfperson.setText(nameOfPerson.toString());


       if ((yesOne && yesTwo && yesThree && yesFour && yesFive) == true){
           TextView textResults = findViewById(R.id.textResults);
           textResults.setText("Be gone, for thoust is unholy");
       }
       else {
           TextView textResults = findViewById(R.id.textResults);
           textResults.setText("You're good to go.");

       }
        int x = (int)(Math.random()*5);
        TextView textFacts = findViewById(R.id.textFacts);
        if(x == 1)
        textFacts.setText("Fact: Humans can't live without oxygen");
        if(x == 2)
            textFacts.setText("Fact: People coughed before Coivd-19");
            if (x==3)
                textFacts.setText("Fact: Canadians say sorry so much that a law was passed declaring that an apology is not admission of guilt");
            if(x==4)
                textFacts.setText("Fact: Oranges weren't originally orange");
                if(x==0)
                    textFacts.setText("Fact: Armadillo shells are bulletproof");


    }
}
