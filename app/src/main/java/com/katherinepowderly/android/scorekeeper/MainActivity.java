package com.katherinepowderly.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamOneScore;
    int teamTwoScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Resets both scores
     */

    public void resetScore(View v) {

        teamOneScore = 0;
        teamTwoScore = 0;

        displayForTeamOne(teamOneScore);
        displayForTeamTwo(teamTwoScore);

    }

    /**
     * Displays the given score for Team One.
     */
    public void displayForTeamOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamOneScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Two.
     */
    public void displayForTeamTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamTwoScore);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * ---------------------------------------------------------------------------------------------
     */


    /**
     * Team One touchdown.
     */
    public void teamOneTouchdown(View v) {
        teamOneScore = teamOneScore + 6;
        displayForTeamOne(teamOneScore);
    }

    /**
     * Team One field goal
     */
    public void teamOneFieldGoal(View v) {
        teamOneScore = teamOneScore + 1;
        displayForTeamOne(teamOneScore);
    }

    /**
     * Team Two 2 pointer (run)
     */

    public void teamOneTwoPoint(View v) {
        teamOneScore = teamOneScore + 2;
        displayForTeamOne(teamOneScore);
    }


    /**
     * ---------------------------------------------------------------------------------------------
     */
    /**
     * Team Two touchdown.
     */
    public void teamTwoTouchdown(View v) {
        teamTwoScore = teamTwoScore + 6;
        displayForTeamTwo(teamTwoScore);
    }


    /**
     * Team Two field goal
     */
    public void teamTwoFieldGoal(View v) {
        teamTwoScore = teamTwoScore + 1;
        displayForTeamTwo(teamTwoScore);
    }

    /**
     * Team Two 2 pointer (run)
     */
    public void teamTwoTwoPoint(View v) {
        teamTwoScore = teamTwoScore + 2;
        displayForTeamTwo(teamTwoScore);
    }


}