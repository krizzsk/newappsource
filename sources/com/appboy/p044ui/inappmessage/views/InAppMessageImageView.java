package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.p044ui.inappmessage.IInAppMessageImageView;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.appboy.ui.inappmessage.views.InAppMessageImageView */
public class InAppMessageImageView extends AppCompatImageView implements IInAppMessageImageView {
    private static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageImageView.class);
    private float mAspectRatio = -1.0f;
    private Path mClipPath = new Path();
    private float[] mInAppRadii;
    private RectF mRect = new RectF();
    private boolean mSetToHalfParentHeight = false;

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAdjustViewBounds(true);
    }

    public boolean clipCanvasToPath(Canvas canvas, int i, int i2) {
        if (this.mInAppRadii != null) {
            try {
                this.mClipPath.reset();
                this.mRect.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
                this.mClipPath.addRoundRect(this.mRect, this.mInAppRadii, Path.Direction.CW);
                canvas.clipPath(this.mClipPath);
                return true;
            } catch (Exception e) {
                AppboyLogger.m5452e(TAG, "Encountered exception while trying to clip in-app message image", e);
            }
        }
        return false;
    }

    public Path getClipPath() {
        return this.mClipPath;
    }

    public float[] getInAppRadii() {
        return this.mInAppRadii;
    }

    public RectF getRectf() {
        return this.mRect;
    }

    public void onDraw(Canvas canvas) {
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mAspectRatio == -1.0f || getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (((float) measuredWidth) / this.mAspectRatio)) + 1);
        }
        if (this.mSetToHalfParentHeight) {
            setMeasuredDimension(getMeasuredWidth(), (int) (((double) ((View) getParent()).getHeight()) * 0.5d));
        }
    }

    public void setAspectRatio(float f) {
        this.mAspectRatio = f;
        requestLayout();
    }

    public void setClipPath(Path path) {
        this.mClipPath = path;
    }

    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.mInAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    public void setInAppMessageImageCropType(CropType cropType) {
        if (cropType.equals(CropType.FIT_CENTER)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (cropType.equals(CropType.CENTER_CROP)) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public void setRectf(RectF rectF) {
        this.mRect = rectF;
    }

    public void setToHalfParentHeight(boolean z) {
        this.mSetToHalfParentHeight = z;
        requestLayout();
    }
}
