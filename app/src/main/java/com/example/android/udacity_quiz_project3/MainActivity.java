package com.example.android.udacity_quiz_project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice3;
    // Question 2
    CheckBox question2_choice1;
    CheckBox question2_choice2;
    CheckBox question2_choice3;
    CheckBox question2_choice4;
    // Question 3
    RadioButton question3_choice2;
    // Question 4
    CheckBox question4_choice1;
    CheckBox question4_choice2;
    CheckBox question4_choice3;
    CheckBox question4_choice4;
    // Question 5
    RadioButton question5_choice2;
    // Question 6
    EditText question6_answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #3 (Wirt and Greg)
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 2  - Correct Answers are #1 (Jason Funderberk) and #3 (Wirt, Jr)
        //------------------------------------------------------------------------------------------
        Boolean answer2_choice1;
        Boolean answer2_choice2;
        Boolean answer2_choice3;
        Boolean answer2_choice4;
        question2_choice1 = (CheckBox) this.findViewById(R.id.question2_choice1);
        question2_choice2 = (CheckBox) this.findViewById(R.id.question2_choice2);
        question2_choice3 = (CheckBox) this.findViewById(R.id.question2_choice3);
        question2_choice4 = (CheckBox) this.findViewById(R.id.question2_choice4);
        answer2_choice1 = question2_choice1.isChecked();
        answer2_choice2 = question2_choice2.isChecked();
        answer2_choice3 = question2_choice3.isChecked();
        answer2_choice4 = question2_choice4.isChecked();
        if (answer2_choice1 && !answer2_choice2 && answer2_choice3 && !answer2_choice4) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers is #2 "Tome of the Unknown"
        //------------------------------------------------------------------------------------------
        Boolean answer3;
        question3_choice2 = (RadioButton) this.findViewById(R.id.question3_choice2);
        answer3 = question3_choice2.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4  - Correct Answers are #3 (Tim Curry) and #4 (Christopher Lloyd)
        //------------------------------------------------------------------------------------------
        Boolean answer4_choice1;
        Boolean answer4_choice2;
        Boolean answer4_choice3;
        Boolean answer4_choice4;
        question4_choice1 = (CheckBox) this.findViewById(R.id.question4_choice1);
        question4_choice2 = (CheckBox) this.findViewById(R.id.question4_choice2);
        question4_choice3 = (CheckBox) this.findViewById(R.id.question4_choice3);
        question4_choice4 = (CheckBox) this.findViewById(R.id.question4_choice4);
        answer4_choice1 = question4_choice1.isChecked();
        answer4_choice2 = question4_choice2.isChecked();
        answer4_choice3 = question4_choice3.isChecked();
        answer4_choice4 = question4_choice4.isChecked();
        if (!answer4_choice1 && !answer4_choice2 && answer4_choice3 && answer4_choice4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #2 "Cartoon Network"
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is "2014"
        //------------------------------------------------------------------------------------------
        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals ("2014")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score +
                answer4_score + answer5_score + answer6_score;

        if (final_score == 6) {
            resultsDisplay = "6 out of 6! That's a rock fact!";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 6";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}