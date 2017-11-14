package com.example.yjyou.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView countLabel;
    private TextView questionLabel;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;
    private Button answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount=0;
    private int quizCount=1;

    ArrayList<ArrayList<String>> quizArray=new ArrayList<>();

    String quizData[][]={
            //{"Country","Right Answer","Choice1","Choice2","Choice3}
            {"China","Beijing","Jakarta","Manila","Stockholm"},
            {"India","New Delhi","Beijing","Bangkok","Seoul"},
            {"Indonesia","Jakarta","Manila","New Delhi","Kuala Lumpur"},
            {"Japan","Tokyo","Bangkok","Taipei","Jakarta"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
