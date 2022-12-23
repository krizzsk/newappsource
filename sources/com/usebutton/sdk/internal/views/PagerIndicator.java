package com.usebutton.sdk.internal.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.usebutton.sdk.C12238R;

public class PagerIndicator extends LinearLayout {
    private ViewPager.OnPageChangeListener mOnPageChanged = new ViewPager.OnPageChangeListener() {
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                PagerIndicator pagerIndicator = PagerIndicator.this;
                pagerIndicator.refresh(pagerIndicator.mPager.getCurrentItem());
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (i < PagerIndicator.this.mPager.getCurrentItem() && ((double) f) < 0.5d) {
                PagerIndicator.this.refresh(i);
            } else if (((double) f) > 0.5d) {
                PagerIndicator.this.refresh(i + 1);
            }
        }

        public void onPageSelected(int i) {
        }
    };
    /* access modifiers changed from: private */
    public ViewPager mPager;

    public PagerIndicator(Context context) {
        super(context);
    }

    private void createChildren(int i) {
        while (getChildCount() > i) {
            removeViewAt(0);
        }
        while (getChildCount() < i) {
            addView(createDot());
        }
    }

    private View createDot() {
        View view = new View(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C12238R.dimen.btn_pager_dot_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C12238R.dimen.btn_pager_dot_margin);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        view.setLayoutParams(layoutParams);
        view.setBackgroundResource(C12238R.C12239drawable.btn_dot);
        return view;
    }

    /* access modifiers changed from: private */
    public void refresh(int i) {
        boolean z;
        int count = this.mPager.getAdapter().getCount();
        if (count != getChildCount()) {
            createChildren(count);
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setEnabled(z);
        }
    }

    public void setPager(ViewPager viewPager) {
        int i;
        ViewPager viewPager2 = this.mPager;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this.mOnPageChanged);
        }
        this.mPager = viewPager;
        viewPager.addOnPageChangeListener(this.mOnPageChanged);
        refresh(this.mPager.getCurrentItem());
        if (viewPager.getAdapter().getCount() > 1) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public PagerIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
