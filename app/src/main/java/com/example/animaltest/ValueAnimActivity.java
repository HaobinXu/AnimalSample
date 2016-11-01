package com.example.animaltest;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;

import com.example.animaltest.interpolator.CharEvaluator;
import com.example.animaltest.interpolator.ReverseEvaluator;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/10/31 下午4:57
 */
public class ValueAnimActivity extends AppCompatActivity {

    TextView textView2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_anim);
        textView2 = (TextView) findViewById(R.id.textView2);
    }

    public void starAnim(View view) {
        ValueAnimator animator = ValueAnimator.ofInt(0,400);
        animator.setDuration(1000);
        animator.start();
//        animator.setInterpolator(new MyInterpolator());
        animator.setEvaluator(new ReverseEvaluator());
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int curValue = (int)valueAnimator.getAnimatedValue();
                textView2.layout(textView2.getLeft(), curValue, textView2.getRight(), curValue + textView2.getHeight());
            }
        });
    }

    public void startObjectAnim(View view) {
        ValueAnimator animator = ValueAnimator.ofObject(new CharEvaluator(), 'A', 'Z');
        animator.setInterpolator(new AccelerateInterpolator());
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                char text = (char)animation.getAnimatedValue();
                textView2.setText(String.valueOf(text));
            }
        });
        animator.setDuration(10000);
        animator.start();
    }
}
