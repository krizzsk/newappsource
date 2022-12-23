package com.usebutton.sdk.internal.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.C12238R;

public class LoadingGradient extends View {
    public static final float HIGHLIGHT_RELATIVE_WIDTH = 1.0f;
    public static final String TAG = "LoadingGradient";
    public static boolean isTesting;
    private int mBackgroundColor;
    private int mDuration;
    private Paint mGradientpainter;
    private int mHighlightColor;
    private Paint mSolidPainter;
    private int mStartColor;
    private long mStartTimeMillis;

    public LoadingGradient(Context context) {
        this(context, (AttributeSet) null);
    }

    private float currentPosition() {
        if (this.mStartTimeMillis == Long.MIN_VALUE) {
            this.mStartTimeMillis = SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.mStartTimeMillis;
        int i = this.mDuration;
        return ((float) (elapsedRealtime % ((long) i))) / (((float) i) * 1.0f);
    }

    private float gradientWidth() {
        return ((float) getWidth()) * 1.0f;
    }

    private void readAttributes(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12238R.styleable.com_usebutton_sdk_internal_views_LoadingGradient, 0, C12238R.style.BtnLoadingGradient);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C12238R.styleable.com_usebutton_sdk_internal_views_LoadingGradient_btn_duration) {
                this.mDuration = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C12238R.styleable.com_usebutton_sdk_internal_views_LoadingGradient_btn_startColor) {
                this.mStartColor = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C12238R.styleable.f30920xf00b58ef) {
                this.mHighlightColor = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C12238R.styleable.f30919xd385dcf5) {
                this.mBackgroundColor = obtainStyledAttributes.getInt(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
        recreatePainters();
    }

    private void recreatePainters() {
        Paint paint = new Paint(1);
        this.mSolidPainter = paint;
        paint.setColor(this.mBackgroundColor);
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        float gradientWidth = gradientWidth();
        int i = this.mStartColor;
        LinearGradient linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gradientWidth, BitmapDescriptorFactory.HUE_RED, new int[]{i, this.mHighlightColor, i}, fArr, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint();
        this.mGradientpainter = paint2;
        paint2.setShader(linearGradient);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            canvas.drawColor(this.mBackgroundColor);
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2, this.mSolidPainter);
            float gradientWidth = gradientWidth();
            float currentPosition = (f + gradientWidth) * currentPosition();
            canvas.save();
            canvas.translate(currentPosition + (-gradientWidth), BitmapDescriptorFactory.HUE_RED);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gradientWidth, f2, this.mGradientpainter);
            canvas.restore();
            if (isTesting) {
                postInvalidateDelayed(1000);
            } else {
                postInvalidateDelayed(1);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        recreatePainters();
    }

    public LoadingGradient(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12238R.style.BtnLoadingGradient);
    }

    public LoadingGradient(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStartTimeMillis = Long.MIN_VALUE;
        readAttributes(attributeSet);
    }

    @TargetApi(21)
    public LoadingGradient(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mStartTimeMillis = Long.MIN_VALUE;
        readAttributes(attributeSet);
    }
}
