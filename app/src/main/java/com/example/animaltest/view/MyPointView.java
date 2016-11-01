package com.example.animaltest.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.animaltest.bean.PaintEntity;

/**
 * @author xuhb
 * @version 2.8.2
 * @描述:
 * @Copyright Copyright (c) 2015
 * @Company 杭州传送门网络科技有限公司.
 * @date 16/11/1 下午2:13
 */
public class MyPointView extends View {

    PaintEntity paintEntity = new PaintEntity(100);

    public MyPointView(Context context) {
        super(context);
    }

    public MyPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyPointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (paintEntity != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(300, 300, paintEntity.getRadius(), paint);
        }
        super.onDraw(canvas);
    }

    /**
     * 在ObjectAnimator中的"pointRadius"调用
     * @param radius
     */
    public void setPointRadius(int radius){
        paintEntity.setRadius(radius);
        invalidate();
    }
}
