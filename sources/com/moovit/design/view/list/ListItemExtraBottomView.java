package com.moovit.design.view.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class ListItemExtraBottomView extends ImageOrTextSubtitleListItemView {

    /* renamed from: q0 */
    public View f41441q0 = null;

    public ListItemExtraBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: e */
    public final boolean mo24760e() {
        return false;
    }

    /* renamed from: f */
    public final void mo23935f(int i, int i2) {
        View view = this.f41441q0;
        if (view != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public View getExtraBottomView() {
        return this.f41441q0;
    }

    public int getExtraBottomViewsMeasuredHeight() {
        View view = this.f41441q0;
        if (view == null) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: h */
    public final void mo23939h(int i, int i2, int i3, int i4) {
        if (this.f41441q0 != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            this.f41441q0.layout(C6333d0.C6338e.m15065f(this), i2, getMeasuredWidth() - C6333d0.C6338e.m15064e(this), i4);
        }
    }

    public void setExtraBottomView(View view) {
        View view2 = this.f41441q0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f41441q0 = view;
        if (view != null) {
            addView(view);
        }
    }

    public ListItemExtraBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
