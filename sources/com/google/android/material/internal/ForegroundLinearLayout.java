package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p355ac.C13411l;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: q */
    public Drawable f34936q;

    /* renamed from: r */
    public final Rect f34937r;

    /* renamed from: s */
    public final Rect f34938s;

    /* renamed from: t */
    public int f34939t;

    /* renamed from: u */
    public boolean f34940u;

    /* renamed from: v */
    public boolean f34941v;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f34936q;
        if (drawable != null) {
            if (this.f34941v) {
                this.f34941v = false;
                Rect rect = this.f34937r;
                Rect rect2 = this.f34938s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f34940u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f34939t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f34936q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f34936q;
        if (drawable != null && drawable.isStateful()) {
            this.f34936q.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f34936q;
    }

    public int getForegroundGravity() {
        return this.f34939t;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f34936q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f34941v = z | this.f34941v;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f34941v = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f34936q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f34936q);
            }
            this.f34936q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f34939t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f34939t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f34939t = i;
            if (i == 119 && this.f34936q != null) {
                this.f34936q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f34936q;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34937r = new Rect();
        this.f34938s = new Rect();
        this.f34939t = 119;
        this.f34940u = true;
        this.f34941v = false;
        TypedArray d = C14077m.m35060d(context, attributeSet, C13411l.ForegroundLinearLayout, i, 0, new int[0]);
        this.f34939t = d.getInt(C13411l.ForegroundLinearLayout_android_foregroundGravity, this.f34939t);
        Drawable drawable = d.getDrawable(C13411l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f34940u = d.getBoolean(C13411l.ForegroundLinearLayout_foregroundInsidePadding, true);
        d.recycle();
    }
}
