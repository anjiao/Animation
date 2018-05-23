package com.joe.animation.ani;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.joe.animation.R;

/**
 * Created by Joe.
 */
public class TweenedJavaActivity extends AppCompatActivity {

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
//                Animation animation = AnimationUtils.loadAnimation(TweenedJavaActivity.this, R.anim.alpha_ani);
//                viewDemo.startAnimation(animation);

                //实例化渐变动画
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                //变化时间
                alphaAnimation.setDuration(3000);
                //保持动画之后的状态
                alphaAnimation.setFillAfter(true);
                //设置动画的重复模式：反转REVERSE和重新开始RESTART
                alphaAnimation.setRepeatMode(AlphaAnimation.RESTART);
                //设置动画播放次数
                alphaAnimation.setRepeatCount(1);
                //设置监听
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                //清除动画
                viewDemo.clearAnimation();
                //给View设置动画
                viewDemo.setAnimation(alphaAnimation);
                //开始动画，不调用好像也可以开始
                alphaAnimation.start();

            }
        });
        findViewById(R.id.btnTranslate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
//                Animation animation = AnimationUtils.loadAnimation(TweenedJavaActivity.this, R.anim.translate_ani);
//                viewDemo.startAnimation(animation);

                TranslateAnimation translateAnimation = new TranslateAnimation(
                        Animation.RELATIVE_TO_PARENT, 0.0f,
                        Animation.RELATIVE_TO_PARENT, 0.5f,
                        Animation.RELATIVE_TO_PARENT, 0.0f,
                        Animation.RELATIVE_TO_PARENT, 0.0f
                );
                //变化时间
                translateAnimation.setDuration(3000);
                //保持动画之后的状态
                translateAnimation.setFillAfter(true);
                //设置动画的重复模式：反转REVERSE和重新开始RESTART
                translateAnimation.setRepeatMode(AlphaAnimation.RESTART);
                //设置动画播放次数
                translateAnimation.setRepeatCount(0);
                //设置监听
                translateAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                //清除动画
                viewDemo.clearAnimation();
                //给View设置动画
                viewDemo.setAnimation(translateAnimation);
                //开始动画，不调用好像也可以开始
                translateAnimation.start();

            }
        });
        findViewById(R.id.btnScale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
//                Animation animation = AnimationUtils.loadAnimation(TweenedJavaActivity.this, R.anim.scale_ani);
//                viewDemo.startAnimation(animation);

                //float fromX, float toX, float fromY, float toY
                ScaleAnimation scaleAnimation = new ScaleAnimation(
                        0.0f,
                        1.0f,
                        0.0f,
                        1.0f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f
                );
                //变化时间
                scaleAnimation.setDuration(3000);
                //保持动画之后的状态
                scaleAnimation.setFillAfter(true);
                //设置动画的重复模式：反转REVERSE和重新开始RESTART
                scaleAnimation.setRepeatMode(AlphaAnimation.RESTART);
                //设置动画播放次数
                scaleAnimation.setRepeatCount(0);
                //清除动画
                viewDemo.clearAnimation();
                //给View设置动画
                viewDemo.setAnimation(scaleAnimation);
                scaleAnimation.start();

            }
        });
        findViewById(R.id.btnRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
//                Animation animation = AnimationUtils.loadAnimation(TweenedJavaActivity.this, R.anim.rolate_ani);
//                viewDemo.startAnimation(animation);

                RotateAnimation rotateAnimation = new RotateAnimation(
                        0.0f,
                        180.0f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f
                );

                //变化时间
                rotateAnimation.setDuration(3000);
                //保持动画之后的状态
                rotateAnimation.setFillAfter(true);
                //设置动画的重复模式：反转REVERSE和重新开始RESTART
                rotateAnimation.setRepeatMode(AlphaAnimation.RESTART);
                //设置动画播放次数
                rotateAnimation.setRepeatCount(0);
                //清除动画
                viewDemo.clearAnimation();
                //给View设置动画
                viewDemo.setAnimation(rotateAnimation);
                rotateAnimation.start();


            }
        });
        findViewById(R.id.btnZuHe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关键代码引入动画资源
//                Animation animation = AnimationUtils.loadAnimation(TweenedJavaActivity.this, R.anim.zuhe_ani);
//                viewDemo.startAnimation(animation);

                /*
                 *  创建一个AnimationSet，它能够同时执行多个动画效果
                 *  构造方法的入参如果是“true”，则代表使用默认的interpolator，
                 *  如果是“false”则代表使用自定义interpolator
                 */
                AnimationSet animationSet = new AnimationSet(true);

                RotateAnimation rotateAnimation = new RotateAnimation(
                        0.0f,
                        180.0f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f
                );

                ScaleAnimation scaleAnimation = new ScaleAnimation(
                        0.0f,
                        1.0f,
                        0.0f,
                        1.0f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f
                );

                animationSet.addAnimation(rotateAnimation);
                animationSet.addAnimation(scaleAnimation);
                animationSet.setFillAfter(true);
                animationSet.setDuration(3000);
                animationSet.setRepeatMode(AlphaAnimation.RESTART);
                animationSet.setRepeatCount(0);
                viewDemo.startAnimation(animationSet);

            }
        });
    }
}
