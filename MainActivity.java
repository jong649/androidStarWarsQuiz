package com.example.android.testyourstarwarsknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quizResults(View view){
        //Resets the score with each button push
        score = 0;

        //Checks if correct radio button is checked for question 1
        RadioButton q1 = (RadioButton) findViewById(R.id.q1_solution);
        boolean isQ1Correct = q1.isChecked();
        if(isQ1Correct){
            score += 1;
        }

        //Checks to see if EditText view contains the correct answer for question 2
        EditText q2 = (EditText) findViewById(R.id.q2_solution);
        String isQ2Correct = q2.getText().toString();
        if(isQ2Correct.equals("Yoda")){
            score += 1;
        }

        //Checks to see which checkboxes are checked
        CheckBox q3Luke = (CheckBox) findViewById(R.id.check_luke);
        boolean isQ3Luke = q3Luke.isChecked();
        CheckBox q3Leia = (CheckBox) findViewById(R.id.check_leia);
        boolean isQ3Leia = q3Leia.isChecked();
        CheckBox q3Vader = (CheckBox) findViewById(R.id.check_vader);
        boolean isQ3Vader = q3Vader.isChecked();
        CheckBox q3Obi = (CheckBox) findViewById(R.id.check_obi_wan);
        boolean isQ3Obi = q3Obi.isChecked();
        //If Luke, Leia, Vader are checked, and ObiWan is not, the answer is correct
        if(isQ3Luke&&isQ3Leia&&isQ3Vader&&!isQ3Obi){
            score += 1;
        }

        //Checks if correct radio button is checked for question 4
        RadioButton q4 = (RadioButton) findViewById(R.id.q4_solution);
        boolean isQ4Correct = q4.isChecked();
        if(isQ4Correct){
            score += 1;
        }

        //Checks if correct radio button is checked for question 5
        RadioButton q5 = (RadioButton) findViewById(R.id.q5_solution);
        boolean isQ5Correct = q5.isChecked();
        if(isQ5Correct){
            score += 1;
        }

        //Checks to see if EditText view contains the correct answer for question 2
        EditText q6 = (EditText) findViewById(R.id.q6_solution);
        String isQ6Correct = q6.getText().toString();
        if(isQ6Correct.equals("Tarkin")){
            score += 1;
        }

        //Displays a different Toast depending on the final score
        if(score >= 4) {
            Toast.makeText(this, "Your score is " + score + "/6" + "\nThe Force will be with you...always!", Toast.LENGTH_LONG).show();
        }

        if(score >= 2 && score <= 3){
            Toast.makeText(this, "Your score is " + score + "/6" + "\nDo or do not, there is no try.", Toast.LENGTH_LONG).show();
        }

        if(score < 2){
            Toast.makeText(this, "Your score is " + score + "/6" + "\nYou Rebel scum! Better try again!", Toast.LENGTH_LONG).show();

        }
    }
}
