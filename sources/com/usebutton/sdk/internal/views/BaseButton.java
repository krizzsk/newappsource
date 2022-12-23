package com.usebutton.sdk.internal.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.usebutton.sdk.C12238R;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

public abstract class BaseButton extends FrameLayout {
    /* access modifiers changed from: private */
    public ViewGroup mContentView;
    public boolean mDidReportViewed;
    private Runnable mDoInvalidateStyling;
    private final Handler mHandler;

    public static class Style {
        public Integer backgroundColor;
        public Drawable backgroundDrawable;
        public Integer backgroundDrawableResource;
        public Integer drawablePadding;
        public Integer drawablePaddingBottom;
        public Integer drawablePaddingLeft;
        public Integer drawablePaddingRight;
        public Integer drawablePaddingTop;
        public String font;
        public Integer iconSize;
        public Integer textSize;
    }

    public BaseButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private void checkReportViewed() {
        if (!this.mDidReportViewed) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15075b(this)) {
                reportViewed();
            }
        }
    }

    public static int overrideOrDefault(Integer num, Integer num2) {
        if (num2 != null) {
            return num2.intValue();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public synchronized void addContentView(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.mContentView;
        if (viewGroup2 != viewGroup) {
            if (viewGroup2 != null) {
                removeView(viewGroup2);
            }
            this.mContentView = viewGroup;
            ViewParent parent = viewGroup.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(viewGroup);
            }
            removeAllViews();
            applyStylingAttributes(viewGroup);
            addView(viewGroup);
        }
    }

    public abstract void applyStylingAttributes(ViewGroup viewGroup);

    public abstract int getDefaultStyleResource();

    public abstract Style getStyle();

    public void invalidateStyling() {
        this.mHandler.removeCallbacks(this.mDoInvalidateStyling);
        this.mHandler.post(this.mDoInvalidateStyling);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mDidReportViewed = false;
        reportViewed();
    }

    public void onContent() {
        this.mDidReportViewed = false;
        checkReportViewed();
    }

    public void onReportedView() {
        this.mDidReportViewed = true;
    }

    public void readAttributes(AttributeSet attributeSet) {
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12238R.styleable.com_usebutton_sdk_internal_views_BaseButton, 0, getDefaultStyleResource());
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C12238R.styleable.com_usebutton_sdk_internal_views_BaseButton_btn_font) {
                getStyle().font = obtainStyledAttributes.getString(index);
            } else if (index == C12238R.styleable.com_usebutton_sdk_internal_views_BaseButton_btn_backgroundColor) {
                getStyle().backgroundColor = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
            } else if (index == C12238R.styleable.f30914x88594c1) {
                getStyle().backgroundDrawableResource = Integer.valueOf(obtainStyledAttributes.getResourceId(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_internal_views_BaseButton_btn_textSize) {
                getStyle().textSize = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_internal_views_BaseButton_btn_drawablePadding) {
                getStyle().drawablePadding = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.f30916x45c4ca05) {
                getStyle().drawablePaddingLeft = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.f30918x8ea35f97) {
                getStyle().drawablePaddingTop = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.f30917x732ad7de) {
                getStyle().drawablePaddingRight = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.f30915xd73d3ca9) {
                getStyle().drawablePaddingBottom = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_internal_views_BaseButton_btn_iconSize) {
                getStyle().iconSize = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public abstract void reportViewed();

    public void setBackgroundColor_Button(int i) {
        getStyle().backgroundColor = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setBackgroundDrawable_Button(Drawable drawable) {
        getStyle().backgroundDrawable = drawable;
        invalidateStyling();
    }

    public void setDrawablePadding_Button(int i) {
        getStyle().drawablePadding = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setFont_Button(String str) {
        getStyle().font = str;
        invalidateStyling();
    }

    public void setIconSize_Button(int i) {
        getStyle().iconSize = Integer.valueOf(i);
        invalidateStyling();
    }

    public BaseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mDoInvalidateStyling = new Runnable() {
            public void run() {
                synchronized (BaseButton.this) {
                    if (BaseButton.this.mContentView != null) {
                        BaseButton baseButton = BaseButton.this;
                        baseButton.applyStylingAttributes(baseButton.mContentView);
                        BaseButton.this.invalidate();
                    }
                }
            }
        };
        readAttributes(attributeSet);
    }

    @TargetApi(21)
    public BaseButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mDoInvalidateStyling = new Runnable() {
            public void run() {
                synchronized (BaseButton.this) {
                    if (BaseButton.this.mContentView != null) {
                        BaseButton baseButton = BaseButton.this;
                        baseButton.applyStylingAttributes(baseButton.mContentView);
                        BaseButton.this.invalidate();
                    }
                }
            }
        };
        readAttributes(attributeSet);
    }
}
