package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv = findViewById(R.id.text_view);


        String text = getIntent().getStringExtra(MainActivity.TEXT);
        tv.setText(text);

        findViewById(R.id.second_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setResult(Activity.RESULT_OK);
                finish();

            }
        });
    }
}