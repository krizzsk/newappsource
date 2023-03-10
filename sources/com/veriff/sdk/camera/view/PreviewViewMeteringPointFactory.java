package com.veriff.sdk.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import com.veriff.sdk.camera.core.MeteringPointFactory;
import com.veriff.sdk.camera.core.impl.utils.Threads;

class PreviewViewMeteringPointFactory extends MeteringPointFactory {
    public static final PointF INVALID_POINT = new PointF(2.0f, 2.0f);
    private Matrix mMatrix;
    private final PreviewTransformation mPreviewTransformation;

    public PreviewViewMeteringPointFactory(PreviewTransformation previewTransformation) {
        this.mPreviewTransformation = previewTransformation;
    }

    public PointF convertPoint(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.mMatrix;
            if (matrix == null) {
                PointF pointF = INVALID_POINT;
                return pointF;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    public void recalculate(Size size, int i) {
        Threads.checkMainThread();
        synchronized (this) {
            if (size.getWidth() != 0) {
                if (size.getHeight() != 0) {
                    this.mMatrix = this.mPreviewTransformation.getPreviewViewToNormalizedSurfaceMatrix(size, i);
                    return;
                }
            }
            this.mMatrix = null;
        }
    }
}
