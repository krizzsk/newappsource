package com.moovit.barcode.scan;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.moovit.commons.utils.UiUtils;
import p456dz.C16758a;

public class BarcodeOverlayView extends FrameLayout {

    /* renamed from: l */
    public static final int f40799l = Color.parseColor("#7F000000");

    /* renamed from: b */
    public final RectF f40800b;

    /* renamed from: c */
    public final RectF f40801c;

    /* renamed from: d */
    public final Paint f40802d;

    /* renamed from: e */
    public final Paint f40803e;

    /* renamed from: f */
    public final float f40804f;

    /* renamed from: g */
    public final float f40805g;

    /* renamed from: h */
    public final Paint f40806h;

    /* renamed from: i */
    public float f40807i;

    /* renamed from: j */
    public TimeAnimator f40808j;

    /* renamed from: k */
    public boolean f40809k;

    public BarcodeOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f40808j = timeAnimator;
        timeAnimator.setTimeListener(new C16758a(this));
        this.f40808j.start();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40808j.cancel();
        this.f40808j.setTimeListener((TimeAnimator.TimeListener) null);
        this.f40808j.removeAllListeners();
        this.f40808j = null;
    }

    public final void onDraw(Canvas canvas) {
        canvas.drawColor(f40799l);
        canvas.drawRect(this.f40800b, this.f40802d);
        canvas.drawRect(this.f40801c, this.f40803e);
        RectF rectF = this.f40800b;
        float width = (rectF.width() * (this.f40807i / 100.0f)) + rectF.top;
        RectF rectF2 = this.f40800b;
        canvas.drawLine(rectF2.left, width, rectF2.right, width, this.f40806h);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.f40805g;
        float f2 = ((float) i) - f;
        float f3 = f2 - f;
        float f4 = (((float) i2) - f3) / 2.0f;
        float f5 = f3 + f4;
        this.f40800b.set(f, f4, f2, f5);
        RectF rectF = this.f40801c;
        float f6 = this.f40804f;
        rectF.set(f - f6, f4 - f6, f2 + f6, f5 + f6);
    }

    public BarcodeOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40800b = new RectF();
        this.f40801c = new RectF();
        this.f40807i = 1.0f;
        this.f40809k = true;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
        Paint paint = new Paint();
        this.f40802d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint();
        this.f40806h = paint2;
        paint2.setColor(Color.parseColor("#7ff0500c"));
        paint2.setStrokeWidth(UiUtils.m40246e(getContext(), 4.0f));
        Paint paint3 = new Paint();
        this.f40803e = paint3;
        paint3.setColor(Color.parseColor("#7fbdc3c7"));
        float e = UiUtils.m40246e(getContext(), 1.0f);
        this.f40804f = e;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(UiUtils.m40246e(getContext(), e));
        this.f40805g = UiUtils.m40246e(getContext(), 40.0f);
    }
}
