package com.usebutton.sdk.internal.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.util.CompatHelpers;

public class LoadingDots extends LinearLayout {
    public static final int PULSE_DURATION = 750;
    private int mDotCount;
    private float mDotPadding;
    private float mDotSize;

    public static class BezierInterpolator implements TimeInterpolator {
        private final float mA0;
        private final float mA1;
        private final float mA2;
        private final float mA3;

        public BezierInterpolator(float f, float f2, float f3, float f4) {
            this.mA0 = f;
            this.mA1 = f2;
            this.mA2 = f3;
            this.mA3 = f4;
        }

        public float getInterpolation(float f) {
            float f2 = 1.0f - f;
            double d = (double) f2;
            double d2 = (double) f;
            double pow = (Math.pow(d, 2.0d) * 3.0d * d2 * ((double) this.mA1)) + (Math.pow(d, 3.0d) * ((double) this.mA0));
            double pow2 = Math.pow(d2, 2.0d);
            return (float) ((Math.pow(d2, 3.0d) * ((double) this.mA3)) + (pow2 * ((double) (f2 * 3.0f)) * ((double) this.mA2)) + pow);
        }
    }

    public class LoadingDot extends View {
        private final Paint mPainter;

        public LoadingDot(Context context) {
            super(context);
            Paint paint = new Paint();
            this.mPainter = paint;
            setLayerType(2, (Paint) null);
            paint.setColor(CompatHelpers.getColor(getContext(), C12238R.color.btn_placeholder));
            paint.setStyle(Paint.Style.FILL);
        }

        private int getAvailableHeight() {
            return (getHeight() - getPaddingTop()) - getPaddingBottom();
        }

        private int getAvailableWidth() {
            return (getWidth() - getPaddingLeft()) - getPaddingTop();
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawCircle((float) (getAvailableWidth() / 2), (float) (getAvailableHeight() / 2), (float) (getAvailableHeight() / 2), this.mPainter);
        }
    }

    public LoadingDots(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addDot(int i) {
        LoadingDot loadingDot = new LoadingDot(getContext());
        float f = this.mDotSize;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) f, (int) f);
        layoutParams.rightMargin = (int) this.mDotPadding;
        loadingDot.setLayoutParams(layoutParams);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            AnimatorSet animatorSet = new AnimatorSet();
            long j = (long) (((float) i) * 90.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(loadingDot, "alpha", new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            ofFloat.setDuration(j);
            animatorSet.playTogether(new Animator[]{scaleProperty(loadingDot, "scaleX"), scaleProperty(loadingDot, "scaleY"), ofFloat});
            animatorSet.setInterpolator(new BezierInterpolator(0.2f, 0.68f, 0.18f, 1.0f));
            animatorSet.setDuration(750);
            animatorSet.setStartDelay(j);
            animatorSet.start();
        }
        addView(loadingDot);
    }

    private void addDotViews(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            addDot(i2);
        }
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12238R.styleable.LoadingDots, 0, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C12238R.styleable.LoadingDots_btn_loadingDotsCount) {
                this.mDotCount = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C12238R.styleable.LoadingDots_btn_dotSize) {
                this.mDotSize = obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED);
            } else if (index == C12238R.styleable.LoadingDots_btn_paddingRight) {
                this.mDotPadding = obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED);
            }
        }
        obtainStyledAttributes.recycle();
        int i2 = this.mDotCount;
        if (i2 > 0) {
            addDotViews(i2);
            return;
        }
        throw new IllegalArgumentException("We need more than 0 dots to show loading dots, set with btn:btn_loadingDotsCount=\"3\"");
    }

    private ObjectAnimator scaleProperty(View view, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, new float[]{1.0f, 0.3f, 1.0f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        return ofFloat;
    }

    public LoadingDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingDots(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    @TargetApi(21)
    public LoadingDots(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet);
    }
}
