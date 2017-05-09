package com.example.android.spacequizandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.spacequizandroid.R.id.Q10A2;

public class MainActivity extends AppCompatActivity {

    int q1points = 0;
    int q2points = 0;
    int q3points = 0;
    int q4points = 0;
    int q5points = 0;
    int q6points = 0;
    int q7points = 0;
    int q8points = 0;
    int q9points = 0;
    int q10points = 0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Q1A3", q1points);
        outState.putInt("Q2A1", q2points);
        outState.putInt("Q3A3", q3points);
        outState.putInt("Q4A1", q4points);
        outState.putInt("Q5A1", q5points);
        outState.putInt("Q6A1", q6points);
        outState.putInt("Q7A2", q7points);
        outState.putInt("Q8A1", q8points);
        outState.putInt("Q9A3", q9points);
        outState.putInt("Q10A2", q10points);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            q1points = savedInstanceState.getInt("Q1A3");
            q2points = savedInstanceState.getInt("Q2A1");
            q3points = savedInstanceState.getInt("Q3A3");
            q4points = savedInstanceState.getInt("Q4A1");
            q5points = savedInstanceState.getInt("Q5A1");
            q6points = savedInstanceState.getInt("Q6A1");
            q7points = savedInstanceState.getInt("Q7A2");
            q8points = savedInstanceState.getInt("Q8A1");
            q9points = savedInstanceState.getInt("Q9A3");
            q10points = savedInstanceState.getInt("Q10A1");
        }
    }

    // Question 1 radio buttons
    public int question1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q1A3:
                if (checked)
                    q1points += 1;
        }
        return q1points;
    }

    // Question 2 radio buttons
    public int question2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q2A1:
                if (checked)
                    q2points += 1;
        }
        return q2points;
    }

    // Question 3 radio buttons
    public int question3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q3A3:
                if (checked)
                    q3points += 1;
        }
        return q3points;
    }

    // Question 4 Text type Answer
    public int question4(View View) {
        EditText laikaAnswer = (EditText) findViewById(R.id.Q4A1);
        if (laikaAnswer.getText().toString().equals("Laika")) {
            q4points += 1;
        }  else if (laikaAnswer.getText().toString().equals("laika")) {
            q4points += 1;
        }  else if (laikaAnswer.getText().toString().equals("Laika ")) {
            q4points += 1;
        }
        return q4points;
    }

    // Question 5 Text type Answer
    public int question5(View View) {
        EditText yuriAnswer = (EditText) findViewById(R.id.Q5A1);
        if (yuriAnswer.getText().toString().equals("Yuri Gagarin")) {
            q5points += 1;
        }  else if (yuriAnswer.getText().toString().equals("Yuri Gagarin ")) {
            q4points += 1;
        }  else if (yuriAnswer.getText().toString().equals("Gagarin")) {
            q4points += 1;
        }  else if (yuriAnswer.getText().toString().equals("Yuri")) {
            q4points += 1;
        }
        return q5points;
    }

    // Question 6 Multi Answer Question
    public int question6(View View) {

        // Is the view now checked?
        CheckBox checkBoxsunRay1 = (CheckBox) findViewById(R.id.sunRay1);
        boolean checkedsunRay1 = checkBoxsunRay1.isChecked();
        CheckBox checkBoxsunRay2 = (CheckBox) findViewById(R.id.sunRay2);
        boolean checkedsunRay2 = checkBoxsunRay2.isChecked();
        CheckBox checkBoxsunRay3 = (CheckBox) findViewById(R.id.sunRay3);
        boolean checkedsunRay3 = checkBoxsunRay3.isChecked();
        if (checkedsunRay1 && checkedsunRay2 && checkedsunRay3) {
            q6points += 1;
        }
        return q6points;
    }

    // Question 7 Radio Buttons
    public int question7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q7A2:
                if (checked)
                    q7points += 1;
        }
        return q7points;
    }

    // Question 8 Radio Buttons
    public int question8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q8A1:
                if (checked)
                    q8points += 1;
        }
        return q8points;
    }

    // Question 9 Multi Answer Question
    public int question9(View View) {

        // Is the view now checked?
        CheckBox checkBoxSun1 = (CheckBox) findViewById(R.id.object1);
        boolean checkedSun1 = checkBoxSun1.isChecked();
        CheckBox checkBoxSun2 = (CheckBox) findViewById(R.id.object2);
        boolean checkedSun2 = checkBoxSun2.isChecked();
        CheckBox checkBoxSun3 = (CheckBox) findViewById(R.id.object3);
        boolean checkedSun3 = checkBoxSun3.isChecked();
        if (checkedSun1 && checkedSun2 && checkedSun3) {
            q9points += 1;
        }
        return q9points;
    }

    // Question 10 Radio Buttons
    public int question10(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case Q10A2:
                if (checked)
                    q10points ++;
        }
        return q10points;
    }

    // ANSWER TIME!!!!
    // Displays Toast with Name and Score
    public int results(View View) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        System.out.println("before->>"+name+"<<-");
        name = name.trim();
        System.out.println("after->>"+name+"<<-");
        int finalPoints = q1points + q2points + q3points + q4points + q5points + q6points + q7points + q8points + q9points + q10points;
        if (finalPoints >=8) {
            Toast.makeText(getApplicationContext(), getString(R.string.high) + name + getString(R.string.youScored) + finalPoints + getString(R.string.outOfTen), Toast.LENGTH_LONG).show();
        } else if (finalPoints >=5) {
            Toast.makeText(getApplicationContext(), getString(R.string.mid) + name + getString(R.string.youScored) + finalPoints + getString(R.string.outOfTen), Toast.LENGTH_LONG).show();
        } else if (finalPoints <=4) {
            Toast.makeText(getApplicationContext(), getString(R.string.low) + name + getString(R.string.youScored) + finalPoints + getString(R.string.outOfTen), Toast.LENGTH_LONG).show();
        }
        q1points = 0;
        q2points = 0;
        q3points = 0;
        q4points = 0;
        q5points = 0;
        q6points = 0;
        q7points = 0;
        q8points = 0;
        q9points = 0;
        q10points = 0;
        return (q1points + q2points + q3points + q4points + q5points + q6points + q7points + q8points + q9points + q10points);
    }
}





