package com.example.android.football;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TeamAGoal(View view) {
        scoreTeamA=scoreTeamA + 1;
        displayTeamAScore(scoreTeamA);
    }

    public void TeamAFoul(View view){
        scoreTeamA= scoreTeamA - 1;
        displayTeamAScore(scoreTeamA);
    }

    private void displayTeamAScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.TeamAScore);
        quantityTextView.setText("" + number);
    }

    public void TeamBGoal(View view) {
        scoreTeamB=scoreTeamB + 1;
        displayTeamBScore(scoreTeamB);
    }

    public void TeamBFoul(View view){
        scoreTeamB= scoreTeamB - 1;
        displayTeamBScore(scoreTeamB);
    }

    private void displayTeamBScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.TeamBScore);
        quantityTextView.setText("" + number);
    }

    public void resetScore(View view){
        scoreTeamA=0;
        displayTeamAScore(scoreTeamA);
        scoreTeamB=0;
        displayTeamBScore(scoreTeamB);

    }


}