package com.example.rtm.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 练习使用git

    }

    @Override
    protected void onPause() {
        super.onPause();
        // 第五次提交
        String str = "第五次提交";
        // 第六次进行提交
        String string = "第六次提交的结果";
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 第四次提交的内容
    }
}
