package com.example.animaltest.interpolator;

import android.animation.TimeInterpolator;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/10/31 下午5:40
 */
public class MyInterpolator implements TimeInterpolator {
    @Override
    public float getInterpolation(float input) {
        return 1 - input;
    }
}
