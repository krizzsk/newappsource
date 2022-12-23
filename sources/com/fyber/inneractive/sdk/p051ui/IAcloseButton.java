package com.fyber.inneractive.sdk.p051ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.C3707l;

/* renamed from: com.fyber.inneractive.sdk.ui.IAcloseButton */
public class IAcloseButton extends View {

    /* renamed from: a */
    public Paint f12793a;

    /* renamed from: b */
    public Path f12794b;

    public IAcloseButton(Context context, int i, boolean z) {
        super(context);
        int i2;
        int b = C3707l.m9963b(10);
        if (z) {
            i2 = (i - (b * 2)) / 4;
        } else {
            i2 = 0;
        }
        int i3 = i2 + b;
        Point point = new Point(i3, i3);
        int i4 = i - i3;
        Point point2 = new Point(i3, i4);
        Point point3 = new Point(i4, i4);
        Point point4 = new Point(i4, i3);
        Path path = new Path();
        this.f12794b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f12794b.moveTo((float) point.x, (float) point.y);
        this.f12794b.lineTo((float) point3.x, (float) point3.y);
        this.f12794b.moveTo((float) point2.x, (float) point2.y);
        this.f12794b.lineTo((float) point4.x, (float) point4.y);
        this.f12794b.close();
        Paint paint = new Paint(1);
        this.f12793a = paint;
        paint.setStrokeWidth((float) C3707l.m9963b(2));
        this.f12793a.setColor(-1);
        this.f12793a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12793a.setAntiAlias(true);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1436657061);
            gradientDrawable.setStroke(C3707l.m9963b(2), -1);
            C3707l.m9959a((View) this, (Drawable) gradientDrawable);
        }
        setPadding(b, b, b, b);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f12794b, this.f12793a);
    }
}
