package com.moovit.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import java.util.ArrayList;
import java.util.Iterator;
import k00.C17988b;
import p824tp.C19735m;
import p824tp.C19739q;
import p977zz.C20964s0;

public class DirectionsView extends LinearLayout {

    /* renamed from: b */
    public final Drawable f23939b;

    /* renamed from: c */
    public final int f23940c;

    /* renamed from: d */
    public final int f23941d;

    /* renamed from: e */
    public ArrayList f23942e;

    public DirectionsView() {
        throw null;
    }

    public DirectionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo24678a(ArrayList arrayList) {
        removeAllViews();
        int g = UiUtils.m40248g(getContext(), 8.0f);
        int g2 = UiUtils.m40248g(getContext(), 16.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MaterialTextView materialTextView = new MaterialTextView(getContext(), (AttributeSet) null);
            C20964s0.m49107y(materialTextView, C19735m.textAppearanceCaption, C19735m.colorOnSurfaceEmphasisMedium);
            materialTextView.setText((CharSequence) it.next());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(g2, g, g2, 0);
            addView(materialTextView, layoutParams);
        }
        this.f23942e = new ArrayList(arrayList.size());
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount != 0) {
            boolean z = !C15780a.m40268a(getContext());
            View childAt = getChildAt(childCount - 1);
            int g = UiUtils.m40248g(getContext(), 2.0f);
            if (z) {
                i = getPaddingLeft();
            } else {
                i = (getWidth() - this.f23941d) - getPaddingRight();
            }
            Drawable drawable = this.f23939b;
            for (int height = ((childAt.getHeight() / 2) + childAt.getTop()) - (this.f23940c / 2); height > 0; height -= drawable.getIntrinsicHeight() + g) {
                drawable.setBounds(i, height, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + height);
                drawable.draw(canvas);
            }
            int childCount2 = getChildCount();
            if (z) {
                i2 = getPaddingLeft() + this.f23941d + g;
            } else {
                i2 = ((getWidth() - g) - getPaddingRight()) - (this.f23941d * 2);
            }
            if (z) {
                i3 = this.f23941d + i2 + g;
            } else {
                i3 = ((getWidth() - (g * 2)) - getPaddingRight()) - (this.f23941d * 3);
            }
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = getChildAt(i4);
                int height2 = (childAt2.getHeight() / 2) + childAt2.getTop();
                int i5 = this.f23940c;
                int i6 = height2 - (i5 / 2);
                this.f23939b.setBounds(i2, i6, this.f23941d + i2, i5 + i6);
                this.f23939b.draw(canvas);
                this.f23939b.setBounds(i3, i6, this.f23941d + i3, this.f23940c + i6);
                this.f23939b.draw(canvas);
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        if (childCount != 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                int intValue = ((Integer) this.f23942e.get(i6)).intValue();
                childAt.layout(childAt.getLeft(), childAt.getTop() + i5, childAt.getRight(), childAt.getBottom() + i5 + intValue);
                i5 += intValue;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount != 0) {
            this.f23942e.clear();
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                int measuredHeight = getChildAt(i5).getMeasuredHeight();
                int i6 = this.f23940c;
                int i7 = measuredHeight % i6;
                if (i7 != 0) {
                    i3 = i6 - i7;
                } else {
                    i3 = 0;
                }
                if (((measuredHeight + i3) / i6) % 2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i3 += i6;
                }
                this.f23942e.add(Integer.valueOf(i3));
                i4 += i3;
            }
            setMeasuredDimension(View.resolveSize(getWidth(), i), View.resolveSize(getMeasuredHeight() + i4, i2));
        }
    }

    public DirectionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setWillNotDraw(false);
        Drawable b = C17988b.m44611b(C19739q.wdg_directions_small_circle, context);
        this.f23939b = b;
        this.f23940c = b.getIntrinsicHeight();
        this.f23941d = b.getIntrinsicWidth();
    }
}
