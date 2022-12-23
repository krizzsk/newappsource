package com.veriff.sdk.camera.camera2.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.camera.core.ZoomState;

class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f, float f2) {
        this.mMaxZoomRatio = f;
        this.mMinZoomRatio = f2;
    }

    private float getPercentageByRatio(float f) {
        float f2 = this.mMaxZoomRatio;
        float f3 = this.mMinZoomRatio;
        if (f2 == f3) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setZoomRatio(float f) throws IllegalArgumentException {
        if (f > this.mMaxZoomRatio || f < this.mMinZoomRatio) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.mMinZoomRatio + " , " + this.mMaxZoomRatio + "]");
        }
        this.mZoomRatio = f;
        this.mLinearZoom = getPercentageByRatio(f);
    }
}
