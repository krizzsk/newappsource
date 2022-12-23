package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13410k;
import p811tc.C19648g;

public class MaterialDivider extends View {

    /* renamed from: g */
    public static final int f34777g = C13410k.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: b */
    public final C19648g f34778b;

    /* renamed from: c */
    public int f34779c;

    /* renamed from: d */
    public int f34780d;

    /* renamed from: e */
    public int f34781e;

    /* renamed from: f */
    public int f34782f;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.materialDividerStyle);
    }

    public int getDividerColor() {
        return this.f34780d;
    }

    public int getDividerInsetEnd() {
        return this.f34782f;
    }

    public int getDividerInsetStart() {
        return this.f34781e;
    }

    public int getDividerThickness() {
        return this.f34779c;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        boolean z = true;
        if (C6333d0.C6338e.m15063d(this) != 1) {
            z = false;
        }
        if (z) {
            i = this.f34782f;
        } else {
            i = this.f34781e;
        }
        if (z) {
            i3 = getWidth();
            i2 = this.f34781e;
        } else {
            i3 = getWidth();
            i2 = this.f34782f;
        }
        this.f34778b.setBounds(i, 0, i3 - i2, getBottom() - getTop());
        this.f34778b.draw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f34779c;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f34780d != i) {
            this.f34780d = i;
            this.f34778b.mo52005n(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(C4732a.getColor(getContext(), i));
    }

    public void setDividerInsetEnd(int i) {
        this.f34782f = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f34781e = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f34779c != i) {
            this.f34779c = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialDivider(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f34777g
            android.content.Context r8 = p883wc.C20289a.m47861a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            tc.g r0 = new tc.g
            r0.<init>()
            r7.f34778b = r0
            int[] r2 = p355ac.C13411l.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r10 = p355ac.C13411l.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p355ac.C13403d.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.f34779c = r10
            int r10 = p355ac.C13411l.MaterialDivider_dividerInsetStart
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f34781e = r10
            int r10 = p355ac.C13411l.MaterialDivider_dividerInsetEnd
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f34782f = r10
            int r10 = p355ac.C13411l.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46247a(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
