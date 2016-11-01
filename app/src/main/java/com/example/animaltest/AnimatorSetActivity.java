package com.example.animaltest;

import android.animation.AnimatorSet;
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
 * @date 16/11/1 下午2:41
 */
public class AnimatorSetActivity extends AppCompatActivity {

    private TextView textView5;
    private TextView textView6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator_set);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
    }

    public void startPlaySequentially(View view) {
        ObjectAnimator tv1BgAnimator = ObjectAnimator.ofInt(textView5, "scaleX",  0, 3, 1);
        ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(textView5, "translationY", 0, 300, 0);
        ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(textView6, "translationY", 0, 400, 0);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(tv1BgAnimator,tv1TranslateY,tv2TranslateY);
        animatorSet.setDuration(3000);
        animatorSet.start();
    }

    public void startPlayTogether(View view) {
        ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(textView5, "translationY", 0, 300, 0);
        ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(textView6, "translationY", 0, 400, 0);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(tv1TranslateY,tv2TranslateY);
        animatorSet.setDuration(1000);
        animatorSet.start();
    }

    /**
     * 自定义动画顺序
     * @param view
     */
    public void customSequentially(View view) {
        ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(textView5, "translationY", 0, 400, 0);
        ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(textView6, "translationY", 0, 400, 0);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000);
        AnimatorSet.Builder builder = animatorSet.play(tv2TranslateY);
        builder.before(tv1TranslateY);
//        builder.after(tv1TranslateY);
//        builder.with(tv1TranslateY);

        animatorSet.start();
    }
}
