package com.example.elzatom.drawrectangle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by elzatom on 2/19/16.
 */
public class DrawRectangle extends View {


    int left ;
    int right;

    public DrawRectangle(Context context) {
        super(context);
        left = 200;
        right = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect downRectangle = new Rect();
        downRectangle.set(canvas.getWidth() - left, canvas.getHeight() - 700, canvas.getWidth() - right, canvas.getHeight());
        Rect upRectangle = new Rect();
        upRectangle.set(canvas.getWidth()-left,0,canvas.getWidth()-right,canvas.getHeight()-900);
        left = left + 1;
        right = right + 1;
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(downRectangle, paint);
        canvas.drawRect(upRectangle, paint);
       if(left != canvas.getWidth()) {
           invalidate();
        }
    }
}
