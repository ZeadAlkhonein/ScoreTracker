package com.example.android.scoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    int goalars=0;
    int goalman=0;
    int foulars=0;
    int foulman=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goalTeam1(View view){
        TextView Aresnal = (TextView) findViewById(R.id.goalarsenal);
        increaseArsenal();

    }

    private void increaseArsenal (){
        goalars++;
        TextView goal = (TextView) findViewById(R.id.goalarsenal);
        goal.setText(String.valueOf(goalars));

    }
    public void goalTeam2(View view){
        TextView man = (TextView) findViewById(R.id.goalmanutd);
        increaseMan();

    }
    private void increaseMan (){
        goalman++;
        TextView goal = (TextView) findViewById(R.id.goalmanutd);
        goal.setText(String.valueOf(goalman));
    }

    public void foul1(View view){
        increaseFoulArs();
    }
    private void increaseFoulArs(){
        foulars++;
        TextView foul = (TextView) findViewById(R.id.foularsenal);
        foul.setText(String.valueOf(foulars));
    }
    public void foul2(View view){
        increaseFoulMan();
    }
    private void increaseFoulMan(){
        foulman++;
        TextView foul = (TextView) findViewById(R.id.foulMan);
        foul.setText(String.valueOf(foulman));
    }
    public void Rest(View view){
        rest();
    }

    private void rest(){
        goalars=0;
        goalman=0;
        foulars=0;
        foulman=0;

        TextView ArsenalGoal = (TextView) findViewById(R.id.goalarsenal);
        TextView ManGoal = (TextView) findViewById(R.id.goalmanutd);
        TextView foulArs=(TextView) findViewById(R.id.foularsenal);
        TextView foulMan = (TextView) findViewById(R.id.foulMan);

        ArsenalGoal.setText(String.valueOf(goalars));
        ManGoal.setText(String.valueOf(goalman));
        foulArs.setText(String.valueOf(foulars));
        foulMan.setText(String.valueOf(foulman));

    }


}
