package com.example.rtm.gitdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by RTM on 2017/8/21.
 */

public class BaseAty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String a = "123";
        int b = 0;
        b += 1;
        String c = a + b;
        log(c);
    }

    private void log(String c) {
        Log.d("BaseAty", c);
    }
}
