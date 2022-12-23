package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.appboy.p044ui.R$styleable;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageBoundedLayout */
public class AppboyInAppMessageBoundedLayout extends RelativeLayout {
    private int mMaxDefinedHeightPixels;
    private int mMaxDefinedWidthPixels;
    private int mMinDefinedHeightPixels;
    private int mMinDefinedWidthPixels;

    public AppboyInAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppboyInAppMessageBoundedLayout);
        this.mMaxDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMaxWidth, 0);
        this.mMinDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMinWidth, 0);
        this.mMaxDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMaxHeight, 0);
        this.mMinDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppboyInAppMessageBoundedLayout_appboyBoundedLayoutMinHeight, 0);
        obtainStyledAttributes.recycle();
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.mMinDefinedWidthPixels;
        if (i3 <= 0 || size >= i3) {
            int i4 = this.mMaxDefinedWidthPixels;
            if (i4 > 0 && size > i4) {
                i = View.MeasureSpec.makeMeasureSpec(this.mMaxDefinedWidthPixels, View.MeasureSpec.getMode(i));
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(this.mMinDefinedWidthPixels, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.mMinDefinedHeightPixels;
        if (i5 <= 0 || size2 >= i5) {
            int i6 = this.mMaxDefinedHeightPixels;
            if (i6 > 0 && size2 > i6) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.mMaxDefinedHeightPixels, View.MeasureSpec.getMode(i2));
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mMinDefinedHeightPixels, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
