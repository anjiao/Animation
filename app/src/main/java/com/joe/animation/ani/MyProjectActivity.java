package com.joe.animation.ani;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.joe.animation.R;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.ValueAnimator;

/**
 * Created by Joe.
 */
public class MyProjectActivity extends AppCompatActivity {


    private View item1, item2;
    private LinearLayout llParent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myproject);
        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        llParent = (LinearLayout) findViewById(R.id.llParent);

        ObjectAnimator colorAnim = ObjectAnimator.ofFloat(llParent, "translationY", 25, -25);
        colorAnim.setDuration(1500);
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item1.clearAnimation();
                ObjectAnimator colorAnim = ObjectAnimator.ofFloat(item1, "translationY", 0, -1000);
                colorAnim.setDuration(800);
                colorAnim.start();
            }
        });

        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item1.clearAnimation();
                ObjectAnimator colorAnim = ObjectAnimator.ofFloat(item2, "translationY", 0, -1000);
                colorAnim.setDuration(800);
                colorAnim.start();
            }
        });

    }
}
