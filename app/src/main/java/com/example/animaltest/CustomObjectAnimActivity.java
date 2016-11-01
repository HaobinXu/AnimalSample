package com.example.animaltest;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.animaltest.view.MyPointView;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/11/1 下午2:06
 */
public class CustomObjectAnimActivity extends AppCompatActivity {
    private MyPointView myPointView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_object_anim);
        myPointView = (MyPointView) findViewById(R.id.myPointView);
    }

    public void startAnim(View view) {
        ObjectAnimator animator = ObjectAnimator.ofInt(myPointView, "pointRadius", 0, 300, 100);
        animator.setDuration(2000);
        animator.start();
    }
}
