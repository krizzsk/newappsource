package com.moovit.commons.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import p622kz.C18159a;
import p622kz.C18165g;
import p977zz.C20941h;

public class DotLineView extends View {

    /* renamed from: b */
    public final float f41073b;

    /* renamed from: c */
    public final float f41074c;

    /* renamed from: d */
    public final int f41075d;

    /* renamed from: e */
    public final Paint f41076e;

    public DotLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.dotLineViewStyle);
    }

    public int getSuggestedMinimumHeight() {
        return getPaddingBottom() + getPaddingTop() + ((int) Math.ceil((double) (this.f41073b * 4.0f)));
    }

    public int getSuggestedMinimumWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil((double) (this.f41073b * 2.0f)));
    }

    public final void onDraw(Canvas canvas) {
        if (this.f41075d == 1) {
            int paddingLeft = getPaddingLeft();
            int width = (getWidth() - paddingLeft) - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = (getHeight() - paddingTop) - getPaddingBottom();
            int i = (width / 2) + paddingLeft;
            float f = this.f41073b;
            float f2 = ((float) paddingTop) + f;
            float f3 = ((float) (paddingTop + height)) - f;
            float f4 = (f * 2.0f) + this.f41074c;
            float f5 = f3 - f2;
            float floor = ((float) ((int) Math.floor((double) (f5 / f4)))) * f4;
            float f6 = (this.f41073b * 2.0f) + floor;
            if (f6 > f5) {
                f6 = floor - this.f41074c;
            }
            float f7 = ((f3 + f2) / 2.0f) - (f6 / 2.0f);
            float f8 = (float) i;
            canvas.drawLine(f8, f7, f8, f7 + f6, this.f41076e);
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int width2 = (getWidth() - paddingLeft2) - getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int height2 = (((getHeight() - paddingTop2) - getPaddingBottom()) / 2) + paddingTop2;
        float f9 = this.f41073b;
        float f11 = ((float) paddingLeft2) + f9;
        float f12 = ((float) (paddingLeft2 + width2)) - f9;
        float f13 = (f9 * 2.0f) + this.f41074c;
        float f14 = f12 - f11;
        float floor2 = ((float) ((int) Math.floor((double) (f14 / f13)))) * f13;
        float f15 = (this.f41073b * 2.0f) + floor2;
        if (f15 > f14) {
            f15 = floor2 - this.f41074c;
        }
        float f16 = ((f12 + f11) / 2.0f) - (f15 / 2.0f);
        float f17 = (float) height2;
        canvas.drawLine(f16, f17, f16 + f15, f17, this.f41076e);
    }

    public final void onMeasure(int i, int i2) {
        if (this.f41075d == 1) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == 0 || (mode == Integer.MIN_VALUE && getSuggestedMinimumWidth() < size)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getSuggestedMinimumWidth(), 1073741824), i2);
            } else {
                super.onMeasure(i, i2);
            }
        } else {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode2 == 0 || (mode2 == Integer.MIN_VALUE && getSuggestedMinimumHeight() < size2)) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getSuggestedMinimumHeight(), 1073741824));
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public DotLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.DotLineView, i);
        try {
            float d = (float) C20941h.m49041d(context, o, C18165g.DotLineView_circleRadius, UiUtils.m40249h(context.getResources(), 1.0f));
            this.f41073b = d;
            float d2 = (float) C20941h.m49041d(context, o, C18165g.DotLineView_android_dashGap, UiUtils.m40249h(context.getResources(), 4.0f));
            this.f41074c = d2;
            ColorStateList b = C20941h.m49039b(context, o, C18165g.DotLineView_android_color);
            if (b != null) {
                i2 = b.getDefaultColor();
            } else {
                i2 = Color.f41002f.f41007b;
            }
            Path path = new Path();
            path.addCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, d, Path.Direction.CW);
            Paint paint = new Paint(1);
            this.f41076e = paint;
            paint.setColor(i2);
            paint.setStyle(Paint.Style.FILL);
            paint.setPathEffect(new PathDashPathEffect(path, (d * 2.0f) + d2, BitmapDescriptorFactory.HUE_RED, PathDashPathEffect.Style.TRANSLATE));
            this.f41075d = o.getInt(C18165g.DotLineView_orientation, 1);
            o.recycle();
            setWillNotDraw(false);
            setLayerType(1, (Paint) null);
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }
}
