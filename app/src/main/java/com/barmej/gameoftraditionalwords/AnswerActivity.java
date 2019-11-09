package com.barmej.gameoftraditionalwords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class AnswerActivity extends AppCompatActivity {
    private TextView mTextViewAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        mTextViewAnswer = findViewById(R.id.text_view_answer);

        String answer = getIntent().getStringExtra(constants.QUESTION_ANSWER);
        if(answer != null)
            mTextViewAnswer.setText(answer); }

    public void  onReturnClicked(View view) {
        finish();
    }


}
