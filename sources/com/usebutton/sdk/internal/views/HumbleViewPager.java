package com.usebutton.sdk.internal.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.util.ButtonLog;

public class HumbleViewPager extends ViewPager {
    private static final String TAG = "HumbleViewPager";
    private boolean mCanScroll = true;
    private boolean mCanScrollOverride = true;

    public HumbleViewPager(Context context) {
        super(context);
    }

    private static void ensureDecorViewIfStrip(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (((view instanceof PagerTabStrip) || (view instanceof PagerTitleStrip)) && (layoutParams = view.getLayoutParams()) != null) {
            try {
                ViewPager.LayoutParams.class.getField("isDecor").setBoolean(layoutParams, true);
            } catch (IllegalAccessException | IllegalStateException | NoSuchFieldException unused) {
            }
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        ensureDecorViewIfStrip(view);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean addViewInLayout = super.addViewInLayout(view, i, layoutParams);
        ensureDecorViewIfStrip(view);
        return addViewInLayout;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mCanScrollOverride && this.mCanScroll && super.onInterceptTouchEvent(motionEvent);
    }

    @SuppressLint({"Range"})
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        int defaultSize = View.getDefaultSize(0, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        View findViewById = findViewById(C12238R.C12240id.promo_pager_title);
        ButtonLog.verboseFormat(TAG, "@%s onMeasure %s", Integer.toHexString(hashCode()), findViewById);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            i3 = 0;
        } else {
            findViewById.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(defaultSize + 0, Integer.MIN_VALUE));
            i3 = findViewById.getMeasuredHeight() + 0;
        }
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() == C12238R.C12240id.group_items_scroller) {
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(defaultSize - i3, Integer.MIN_VALUE));
                i4 = Math.min(i4, childAt.getMeasuredHeight());
            }
        }
        int i6 = i3 + i4;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getId() == C12238R.C12240id.group_items_scroller) {
                childAt2.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                ButtonLog.verboseFormat(TAG, "Set scroller (%d) to: %d height", Integer.valueOf(i7), Integer.valueOf(childAt2.getMeasuredHeight()));
            }
        }
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(Math.min(i6, defaultSize), 1073741824));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mCanScrollOverride && this.mCanScroll && super.onTouchEvent(motionEvent);
    }

    public void onViewRemoved(View view) {
        ButtonLog.verboseFormat(TAG, "@%s Removing %s", Integer.toHexString(hashCode()), view);
        super.onViewRemoved(view);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        boolean z = false;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < getAdapter().getCount(); i++) {
            f += getAdapter().getPageWidth(i);
            if (f > 1.0f) {
                break;
            }
        }
        if (f > 1.0f) {
            z = true;
        }
        this.mCanScroll = z;
    }

    public void setCanScroll(boolean z) {
        this.mCanScrollOverride = z;
    }

    public HumbleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
