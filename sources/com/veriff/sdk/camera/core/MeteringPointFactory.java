package com.veriff.sdk.camera.core;

import android.graphics.PointF;
import android.util.Rational;

public abstract class MeteringPointFactory {
    private Rational mSurfaceAspectRatio;

    public MeteringPointFactory() {
        this((Rational) null);
    }

    public abstract PointF convertPoint(float f, float f2);

    public final MeteringPoint createPoint(float f, float f2, float f3) {
        PointF convertPoint = convertPoint(f, f2);
        return new MeteringPoint(convertPoint.x, convertPoint.y, f3, this.mSurfaceAspectRatio);
    }

    public MeteringPointFactory(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }
}
