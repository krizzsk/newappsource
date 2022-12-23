package com.fyber.inneractive.sdk.p051ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

@TargetApi(11)
/* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar */
public class IAsmoothProgressBar extends ProgressBar {

    /* renamed from: c */
    public static final Interpolator f12809c = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public ValueAnimator f12810a;

    /* renamed from: b */
    public ValueAnimator f12811b;

    /* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar$a */
    public class C3665a implements ValueAnimator.AnimatorUpdateListener {
        public C3665a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar$b */
    public class C3666b implements ValueAnimator.AnimatorUpdateListener {
        public C3666b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f12810a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f12811b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public synchronized void setProgress(int i) {
        ValueAnimator valueAnimator = this.f12810a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f12810a;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f12810a = ofInt;
            ofInt.setInterpolator(f12809c);
            this.f12810a.addUpdateListener(new C3665a());
        } else {
            valueAnimator2.setIntValues(new int[]{getProgress(), i});
        }
        this.f12810a.start();
    }

    public synchronized void setSecondaryProgress(int i) {
        ValueAnimator valueAnimator = this.f12811b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f12811b;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f12811b = ofInt;
            ofInt.setInterpolator(f12809c);
            this.f12811b.addUpdateListener(new C3666b());
        } else {
            valueAnimator2.setIntValues(new int[]{getProgress(), i});
        }
        this.f12811b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
