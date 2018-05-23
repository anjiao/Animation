package com.joe.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.joe.animation.ani.FrameAniActivity;
import com.joe.animation.ani.TweenedAniActivity;
import com.joe.animation.ani.TweenedJavaActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.btnFrameAni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startXActivity(FrameAniActivity.class);
            }
        });
        findViewById(R.id.btnTweenAni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startXActivity(TweenedAniActivity.class);
            }
        });
        findViewById(R.id.btnJava).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startXActivity(TweenedJavaActivity.class);
            }
        });
    }

    private void startXActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
