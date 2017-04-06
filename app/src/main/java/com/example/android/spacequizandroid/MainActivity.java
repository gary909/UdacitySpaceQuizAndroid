package com.example.android.spacequizandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int points = 0;





    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("Q1A3", points);
    }

    EditText laikaAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            points = savedInstanceState.getInt("Q1A3");
        }

        laikaAnswer = (EditText) findViewById(R.id.Q4A1);
    }







    // Question 1 radio buttons
    public int question1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q1A3:
                if (checked)
                    points += 1;
        }
        return points;
    }






    // Question 2 radio buttons
    public int question2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q2A1:
                if (checked)
                    points += 1;
        }
        return points;
    }





    // Question 3 radio buttons
    public int question3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q3A3:
                if (checked)
                    points += 1;
        }
        return points;
    }






    // Question 4 Text type Answer
    public int question4(View View) {
        EditText laikaAnswer = (EditText) findViewById(R.id.Q4A1);
        if (laikaAnswer.getText().toString().equals("Laika")) {
            points += 1;
        }
        return points;
    }






    // Question 5 Text type Answer
    public int question5(View View) {
        EditText yuriAnswer = (EditText) findViewById(R.id.Q5A1);
        if (yuriAnswer.getText().toString().equals("Yuri Gagarin")) {
            points += 1;
        }
        return points;
    }





    // Question 6 Multi Answer Question
    public int question6(View View) {

        // Is the view now checked?
        CheckBox checkBoxPerson1 = (CheckBox) findViewById(R.id.person1);
        boolean checkedPerson1 = checkBoxPerson1.isChecked();
        CheckBox checkBoxPerson2 = (CheckBox) findViewById(R.id.person2);
        boolean checkedPerson2 = checkBoxPerson2.isChecked();
        CheckBox checkBoxPerson3 = (CheckBox) findViewById(R.id.person3);
        boolean checkedPerson3 = checkBoxPerson3.isChecked();
        if (checkedPerson1 && checkedPerson2 && checkedPerson3) {
            points += 1;
        }
        return points;
    }




    // Question 7 Radio Buttons
    public int question7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q7A2:
                if (checked)
                    points += 1;
        }
        return points;
    }



    // Question 8 Radio Buttons
    public int question8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q8A1:
                if (checked)
                    points += 1;
        }
        return points;
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
            points += 1;
        }
        return points;
    }


    // Question 10 Radio Buttons
    public int question10(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Q10A2:
                if (checked)
                    points += 1;
        }
        return points;
    }

    // ANSWER TIME!!!!
    // Displays Toast with Name and Score
    public int results(View View) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        Toast.makeText(getApplicationContext(), getString(R.string.hey) + name + getString(R.string.you) + points + getString(R.string.points), Toast.LENGTH_LONG).show();
        points = 0;
        return points;

    }
}





