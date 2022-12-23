package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.C14077m;
import java.util.WeakHashMap;
import p141k1.C5450a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13410k;
import p355ac.C13411l;
import p742qc.C19099c;

public class MaterialDividerItemDecoration extends RecyclerView.C1133l {

    /* renamed from: j */
    public static final int f34783j = C13410k.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: b */
    public Drawable f34784b;

    /* renamed from: c */
    public int f34785c;

    /* renamed from: d */
    public int f34786d;

    /* renamed from: e */
    public int f34787e;

    /* renamed from: f */
    public int f34788f;

    /* renamed from: g */
    public int f34789g;

    /* renamed from: h */
    public boolean f34790h;

    /* renamed from: i */
    public final Rect f34791i = new Rect();

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        int i2 = C13401b.materialDividerStyle;
        TypedArray d = C14077m.m35060d(context, attributeSet, C13411l.MaterialDivider, i2, f34783j, new int[0]);
        this.f34786d = C19099c.m46247a(context, d, C13411l.MaterialDivider_dividerColor).getDefaultColor();
        this.f34785c = d.getDimensionPixelSize(C13411l.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C13403d.material_divider_thickness));
        this.f34788f = d.getDimensionPixelOffset(C13411l.MaterialDivider_dividerInsetStart, 0);
        this.f34789g = d.getDimensionPixelOffset(C13411l.MaterialDivider_dividerInsetEnd, 0);
        this.f34790h = d.getBoolean(C13411l.MaterialDivider_lastItemDecorated, true);
        d.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.f34784b = shapeDrawable;
        int i3 = this.f34786d;
        this.f34786d = i3;
        Drawable g = C5450a.m13604g(shapeDrawable);
        this.f34784b = g;
        C5450a.C5452b.m13616g(g, i3);
        if (i == 0 || i == 1) {
            this.f34787e = i;
            return;
        }
        throw new IllegalArgumentException(C25541a.m63878h("Invalid orientation: ", i, ". It should be either HORIZONTAL or VERTICAL"));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        rect.set(0, 0, 0, 0);
        if (this.f34787e == 1) {
            rect.bottom = this.f34784b.getIntrinsicHeight() + this.f34785c;
        } else {
            rect.right = this.f34784b.getIntrinsicWidth() + this.f34785c;
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (recyclerView.getLayoutManager() != null) {
            boolean z = true;
            int i7 = 0;
            if (this.f34787e == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6338e.m15063d(recyclerView) != 1) {
                    z = false;
                }
                if (z) {
                    i5 = this.f34789g;
                } else {
                    i5 = this.f34788f;
                }
                int i8 = i3 + i5;
                if (z) {
                    i6 = this.f34788f;
                } else {
                    i6 = this.f34789g;
                }
                int i9 = i4 - i6;
                int childCount = recyclerView.getChildCount();
                if (!this.f34790h) {
                    childCount--;
                }
                while (i7 < childCount) {
                    View childAt = recyclerView.getChildAt(i7);
                    RecyclerView.m3002L(childAt, this.f34791i);
                    int round = Math.round(childAt.getTranslationY()) + this.f34791i.bottom;
                    this.f34784b.setBounds(i8, (round - this.f34784b.getIntrinsicHeight()) - this.f34785c, i9, round);
                    this.f34784b.draw(canvas);
                    i7++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int i11 = i + this.f34788f;
            int i12 = i2 - this.f34789g;
            int childCount2 = recyclerView.getChildCount();
            while (i7 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i7);
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.f34791i);
                int round2 = Math.round(childAt2.getTranslationX()) + this.f34791i.right;
                this.f34784b.setBounds((round2 - this.f34784b.getIntrinsicWidth()) - this.f34785c, i11, round2, i12);
                this.f34784b.draw(canvas);
                i7++;
            }
            canvas.restore();
        }
    }
}
