package com.joe.animation.ani;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.joe.animation.R;

/**
 * Created by Joe.
 */
public class TweenedAniActivity extends AppCompatActivity {

    private View viewDemo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweenedani);
        initView();

    }

    private void initView() {
        viewDemo = findViewById(R.id.viewDemo);
        findViewById(R.id.btnAplf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
                Animation animation = AnimationUtils.loadAnimation(TweenedAniActivity.this, R.anim.alpha_ani);
                viewDemo.startAnimation(animation);
            }
        });
        findViewById(R.id.btnTranslate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
                Animation animation = AnimationUtils.loadAnimation(TweenedAniActivity.this, R.anim.translate_ani);
                viewDemo.startAnimation(animation);
            }
        });
        findViewById(R.id.btnScale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
                Animation animation = AnimationUtils.loadAnimation(TweenedAniActivity.this, R.anim.scale_ani);
                viewDemo.startAnimation(animation);
            }
        });
        findViewById(R.id.btnRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
                Animation animation = AnimationUtils.loadAnimation(TweenedAniActivity.this, R.anim.rolate_ani);
                viewDemo.startAnimation(animation);
            }
        });
        findViewById(R.id.btnZuHe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
                Animation animation = AnimationUtils.loadAnimation(TweenedAniActivity.this, R.anim.zuhe_ani);
                viewDemo.startAnimation(animation);
            }
        });
    }
}
