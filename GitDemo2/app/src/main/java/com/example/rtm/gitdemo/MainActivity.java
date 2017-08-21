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
// 第七次提交
        int  a = 10;
        String string = "第七次提交";
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 第四次提交的内容
        // 准备进行第七次提交了, 看看效果
    }
}
