package com.masabi.justride.sdk.p415ui.base.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00028\u0000@@X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/base/views/MaxHeightFrameLayout;", "Landroid/widget/FrameLayout;", "", "getHeightOfTallestChildView", "value", "b", "I", "getMaxHeight$Android_release", "()I", "setMaxHeight$Android_release", "(I)V", "maxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.base.views.MaxHeightFrameLayout */
public final class MaxHeightFrameLayout extends FrameLayout {

    /* renamed from: b */
    public int f37191b;

    public MaxHeightFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int getHeightOfTallestChildView() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C24362h.m61210e(childAt, "child");
            i = Math.max(i, childAt.getMeasuredHeight());
        }
        return i;
    }

    public final int getMaxHeight$Android_release() {
        return this.f37191b;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE && this.f37191b >= 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(getPaddingTop() + getPaddingBottom() + getHeightOfTallestChildView(), Math.min(View.MeasureSpec.getSize(i2), this.f37191b)), mode));
        }
    }

    public final void setMaxHeight$Android_release(int i) {
        this.f37191b = i;
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f37191b = -1;
    }
}
