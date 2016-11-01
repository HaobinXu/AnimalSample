package com.example.animaltest;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/11/1 下午1:44
 */
public class ObjectAnimActivity extends AppCompatActivity {

    private TextView textView3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_anim);
        textView3 = (TextView) findViewById(R.id.textView3);
    }

    public void startAlpha(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView3, "alpha", 1, 0, 1);
        animator.setDuration(2000);
        animator.start();
    }

    public void rotationX(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView3, "rotationX", 0, 180, 0);
        animator.setDuration(2000);
        animator.start();
    }

    public void rotationZ(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView3, "rotation", 0, 180, 0);
        animator.setDuration(2000);
        animator.start();
    }

    public void translateX(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView3, "translationX", 0, 180, -180, 0);
        animator.setDuration(2000);
        animator.start();
    }

    public void translateY(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView3, "translationY", 0, 180, -90, 0);
        animator.setDuration(2000);
        animator.start();
    }

    public void scaleX(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView3, "scaleX", 0, 3, 1);
        animator.setDuration(2000);
        animator.start();
    }

    public void scaleY(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView3, "scaleY", 0, 3, 1);
        animator.setDuration(2000);
        animator.start();
    }
}
