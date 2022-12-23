package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.util.ButtonLog;

public class RatioViewPager extends ViewPager {
    private static final String TAG = "RatioViewPager";
    private float mHeightToWidth;
    private float mWidthToHeight;

    public RatioViewPager(Context context) {
        super(context);
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12238R.styleable.com_usebutton_sdk_internal_views_RatioViewPager);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C12238R.styleable.f30922x76665eb9) {
                this.mWidthToHeight = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
            }
            if (index == C12238R.styleable.f30921x711caba1) {
                this.mHeightToWidth = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
            }
        }
        if (this.mWidthToHeight <= BitmapDescriptorFactory.HUE_RED && this.mHeightToWidth <= BitmapDescriptorFactory.HUE_RED) {
            this.mWidthToHeight = 1.0f;
        }
        obtainStyledAttributes.recycle();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        float f = this.mWidthToHeight;
        int i4 = 0;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            i3 = (int) (((float) size) * f);
            ButtonLog.verboseFormat(TAG, "Measured with fraction (W/H) %f to %dx%d", Float.valueOf(f), Integer.valueOf(size), Integer.valueOf(i3));
        } else {
            float f2 = this.mHeightToWidth;
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                i3 = (int) (((float) size) / f2);
                ButtonLog.verboseFormat(TAG, "Measured with fraction %f (H/W) to %dx%d", Float.valueOf(f), Integer.valueOf(size), Integer.valueOf(i3));
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        i4 = i3;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public RatioViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }
}
