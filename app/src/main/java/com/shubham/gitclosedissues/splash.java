package com.shubham.gitclosedissues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotoMain = new Intent(splash.this, MainActivity.class);
                startActivity(gotoMain);
                finish();
            }
        },2000);
    }
}