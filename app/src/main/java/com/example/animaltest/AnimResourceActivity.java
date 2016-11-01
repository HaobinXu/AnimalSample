package com.example.animaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/10/31 下午2:47
 */
public class AnimResourceActivity extends AppCompatActivity {

    TextView textView;

    Interpolator interpolator;

//    AccelerateDecelerateInterpolator 在动画开始与介绍的地方速率改变比较慢，在中间的时候加速
//    AccelerateInterpolator 在动画开始的地方速率改变比较慢，然后开始加速
//    AnticipateInterpolator 开始的时候向后然后向前甩
//    AnticipateOvershootInterpolator 开始的时候向后然后向前甩一定值后返回最后的值
//    BounceInterpolator 动画结束的时候弹起
//    CycleInterpolator 动画循环播放特定的次数，速率改变沿着正弦曲线
//    DecelerateInterpolator 在动画开始的地方快然后慢
//    LinearInterpolator 以常量速率改变
//    OvershootInterpolator 向前甩一定值后再回到原来位置

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_resource);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void scaleClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_test);
        animation.setInterpolator(interpolator);
        textView.startAnimation(animation);

    }

    public void alphaClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_test);
        animation.setInterpolator(interpolator);
        textView.startAnimation(animation);

    }

    public void rotationClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_test);
        animation.setInterpolator(interpolator);
        textView.startAnimation(animation);
    }

    public void translate(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_test);
        animation.setInterpolator(interpolator);
        textView.startAnimation(animation);
    }

    public void setClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.set_test);
        animation.setInterpolator(interpolator);
        textView.startAnimation(animation);
    }

    public void accelerateDecelerateInterpolator(View view) {
        interpolator = new AccelerateDecelerateInterpolator();
    }

    public void accelerateInterpolator(View view) {
        interpolator = new AccelerateInterpolator();
    }

    public void anticipateInterpolator(View view) {
        interpolator = new AnticipateInterpolator();
    }

    public void anticipateOvershootInterpolator(View view) {
        interpolator = new AnticipateOvershootInterpolator();
    }

    public void bounceInterpolator(View view) {
        interpolator = new BounceInterpolator();
    }

    public void cycleInterpolator(View view) {
        interpolator = new CycleInterpolator(1);
    }

    public void decelerateInterpolator(View view) {
        interpolator = new DecelerateInterpolator();
    }

    public void linearInterpolator(View view) {
        interpolator = new LinearInterpolator();
    }

    public void overshootInterpolator(View view) {
        interpolator = new OvershootInterpolator();
    }
}
