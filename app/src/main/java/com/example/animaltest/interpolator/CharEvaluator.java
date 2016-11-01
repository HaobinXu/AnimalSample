package com.example.animaltest.interpolator;

import android.animation.TypeEvaluator;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/11/1 下午1:34
 */
public class CharEvaluator implements TypeEvaluator<Character> {
    @Override
    public Character evaluate(float fraction, Character startValue, Character endValue) {
        int startInt = (int) startValue;
        int endInt = (int) endValue;
        int curInt = (int) (startInt + fraction * (endInt - startInt));
        char result = (char) curInt;
        return result;
    }
}
