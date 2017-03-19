package com.example.ctadmin.scoreboard;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTemA = 0;
        int scoreTemB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView=(TextView)findViewById(R.id.team_a);
        TextView myTextView1=(TextView)findViewById(R.id.team_b);
        TextView myTextView2=(TextView)findViewById(R.id.team_a_score);
        TextView myTextView3=(TextView)findViewById(R.id.team_b_score);
        Typeface typeFace= Typeface.createFromAsset(getAssets(),"fonts/cap2.ttf");
        myTextView.setTypeface(typeFace);
        myTextView1.setTypeface(typeFace);
        myTextView2.setTypeface(typeFace);
        myTextView3.setTypeface(typeFace);
    }
    public void teamAOneScore(View view) {


                 scoreTemA = scoreTemA + 1;
               displayForTeamA(scoreTemA);
             }


                 public void teamATwoScore(View view) {
                scoreTemA = scoreTemA + 2;
                displayForTeamA(scoreTemA);
           }


    public void teamAThreeScore(View view) {
                 scoreTemA = scoreTemA + 3;
        displayForTeamA(scoreTemA);
    }

    private void displayForTeamA(int score) {
                TextView scoreView = (TextView) findViewById(R.id.team_a_score);
                 scoreView.setText("" + score);
             }
    public void teamBOneScore(View view) {
                 scoreTemB = scoreTemB + 1;
                 displayForTeamB(scoreTemB);
             }


                 public void teamBTwoScore(View view) {
                 scoreTemB = scoreTemB + 2;
                 displayForTeamB(scoreTemB);
             }


                 public void teamBThreeScore(View view) {
                 scoreTemB = scoreTemB + 3;
                 displayForTeamB(scoreTemB);
             }


                 private void displayForTeamB(int score) {
                TextView scoreView = (TextView) findViewById(R.id.team_b_score);
                 scoreView.setText(String.valueOf(score));
             }
          /*
     * Team B Code finish
    * */


                 //Reset button code
                 public void resetButton(View view) {
                 scoreTemA = 0;
                scoreTemB = 0;
                displayForTeamA(0);
               displayForTeamB(0);


             }
     }



