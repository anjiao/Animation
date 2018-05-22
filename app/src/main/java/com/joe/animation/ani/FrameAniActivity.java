package com.joe.animation.ani;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.joe.animation.R;

/**
 * Created by Joe.
 */
public class FrameAniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frameani);
        ImageView ivAnim = (ImageView) findViewById(R.id.ivAnim);
        AnimationDrawable animationDrawable1 = (AnimationDrawable) ivAnim.getBackground();
        animationDrawable1.start();


    }
}
