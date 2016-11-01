package com.example.animaltest.interpolator;

import android.animation.TypeEvaluator;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/10/31 下午6:41
 */
public class ReverseEvaluator implements TypeEvaluator<Integer>{
    @Override
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int startInt = startValue;
        return (int) (endValue - fraction * (endValue - startInt));
    }
}
