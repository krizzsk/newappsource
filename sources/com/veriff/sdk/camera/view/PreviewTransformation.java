package com.veriff.sdk.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.view.PreviewView;
import com.veriff.sdk.camera.view.internal.compat.quirk.DeviceQuirks;
import com.veriff.sdk.camera.view.internal.compat.quirk.PreviewOneThirdWiderQuirk;
import mf0.C24361g;

final class PreviewTransformation {
    private static final PreviewView.ScaleType DEFAULT_SCALE_TYPE = PreviewView.ScaleType.FILL_CENTER;
    private boolean mIsFrontCamera;
    private int mPreviewRotationDegrees;
    private Size mResolution;
    private PreviewView.ScaleType mScaleType = DEFAULT_SCALE_TYPE;
    private Rect mSurfaceCropRect;
    private int mTargetRotation;
    private Rect mViewportRect;

    /* renamed from: com.veriff.sdk.camera.view.PreviewTransformation$1 */
    public static /* synthetic */ class C125791 {
        public static final /* synthetic */ int[] $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.camera.view.PreviewView$ScaleType[] r0 = com.veriff.sdk.camera.view.PreviewView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType = r0
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FILL_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.camera.view.PreviewView$ScaleType r1 = com.veriff.sdk.camera.view.PreviewView.ScaleType.FILL_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.view.PreviewTransformation.C125791.<clinit>():void");
        }
    }

    private static RectF flipHorizontally(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    private Rect getCorrectedCropRect(Rect rect) {
        PreviewOneThirdWiderQuirk previewOneThirdWiderQuirk = (PreviewOneThirdWiderQuirk) DeviceQuirks.get(PreviewOneThirdWiderQuirk.class);
        if (previewOneThirdWiderQuirk == null) {
            return rect;
        }
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setScale(previewOneThirdWiderQuirk.getCropRectScaleX(), 1.0f, (float) rect.centerX(), (float) rect.centerY());
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private Size getRotatedViewportSize() {
        if (TransformUtils.is90or270(this.mPreviewRotationDegrees)) {
            return new Size(this.mViewportRect.height(), this.mViewportRect.width());
        }
        return new Size(this.mViewportRect.width(), this.mViewportRect.height());
    }

    private RectF getTransformedSurfaceRect(Size size, int i) {
        C24361g.m61193w((String) null, isTransformationInfoReady());
        Matrix surfaceToPreviewViewMatrix = getSurfaceToPreviewViewMatrix(size, i);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.mResolution.getWidth(), (float) this.mResolution.getHeight());
        surfaceToPreviewViewMatrix.mapRect(rectF);
        return rectF;
    }

    private boolean isTransformationInfoReady() {
        return (this.mSurfaceCropRect == null || this.mResolution == null) ? false : true;
    }

    private static void setMatrixRectToRect(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.ScaleType scaleType) {
        Matrix.ScaleToFit scaleToFit;
        boolean z;
        switch (C125791.$SwitchMap$com$veriff$sdk$camera$view$PreviewView$ScaleType[scaleType.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                Logger.m32241e("PreviewTransform", "Unexpected crop rect: " + scaleType);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (scaleType == PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    public Bitmap createTransformedBitmap(Bitmap bitmap, Size size, int i) {
        if (!isTransformationInfoReady()) {
            return bitmap;
        }
        Matrix textureViewCorrectionMatrix = getTextureViewCorrectionMatrix();
        RectF transformedSurfaceRect = getTransformedSurfaceRect(size, i);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(textureViewCorrectionMatrix);
        matrix.postScale(transformedSurfaceRect.width() / ((float) this.mResolution.getWidth()), transformedSurfaceRect.height() / ((float) this.mResolution.getHeight()));
        matrix.postTranslate(transformedSurfaceRect.left, transformedSurfaceRect.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    public Matrix getPreviewViewToNormalizedSurfaceMatrix(Size size, int i) {
        if (!isTransformationInfoReady()) {
            return null;
        }
        Matrix matrix = new Matrix();
        getSurfaceToPreviewViewMatrix(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.mResolution.getWidth(), (float) this.mResolution.getHeight()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public RectF getPreviewViewViewportRectForMismatchedAspectRatios(Size size, int i) {
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) size.getWidth(), (float) size.getHeight());
        Size rotatedViewportSize = getRotatedViewportSize();
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) rotatedViewportSize.getWidth(), (float) rotatedViewportSize.getHeight());
        Matrix matrix = new Matrix();
        setMatrixRectToRect(matrix, rectF2, rectF, this.mScaleType);
        matrix.mapRect(rectF2);
        if (i == 1) {
            return flipHorizontally(rectF2, ((float) size.getWidth()) / 2.0f);
        }
        return rectF2;
    }

    public PreviewView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public Rect getSurfaceCropRect() {
        return this.mSurfaceCropRect;
    }

    public Matrix getSurfaceToPreviewViewMatrix(Size size, int i) {
        RectF rectF;
        C24361g.m61193w((String) null, isTransformationInfoReady());
        if (isViewportAspectRatioMatchPreviewView(size)) {
            rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) size.getWidth(), (float) size.getHeight());
        } else {
            rectF = getPreviewViewViewportRectForMismatchedAspectRatios(size, i);
        }
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(this.mSurfaceCropRect), rectF, this.mPreviewRotationDegrees);
        if (this.mIsFrontCamera) {
            if (TransformUtils.is90or270(this.mPreviewRotationDegrees)) {
                rectToRect.preScale(1.0f, -1.0f, (float) this.mSurfaceCropRect.centerX(), (float) this.mSurfaceCropRect.centerY());
            } else {
                rectToRect.preScale(-1.0f, 1.0f, (float) this.mSurfaceCropRect.centerX(), (float) this.mSurfaceCropRect.centerY());
            }
        }
        return rectToRect;
    }

    public Matrix getTextureViewCorrectionMatrix() {
        C24361g.m61193w((String) null, isTransformationInfoReady());
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.mResolution.getWidth(), (float) this.mResolution.getHeight());
        return TransformUtils.getRectToRect(rectF, rectF, -TransformUtils.surfaceRotationToRotationDegrees(this.mTargetRotation));
    }

    public boolean isViewportAspectRatioMatchPreviewView(Size size) {
        return TransformUtils.isAspectRatioMatchingWithRoundingError(size, true, getRotatedViewportSize(), false);
    }

    public void setScaleType(PreviewView.ScaleType scaleType) {
        this.mScaleType = scaleType;
    }

    public void setTransformationInfo(SurfaceRequest.TransformationInfo transformationInfo, Size size, boolean z) {
        Logger.m32239d("PreviewTransform", "Transformation info set: " + transformationInfo + " " + size + " " + z);
        this.mSurfaceCropRect = getCorrectedCropRect(transformationInfo.getCropRect());
        this.mViewportRect = transformationInfo.getCropRect();
        this.mPreviewRotationDegrees = transformationInfo.getRotationDegrees();
        this.mTargetRotation = transformationInfo.getTargetRotation();
        this.mResolution = size;
        this.mIsFrontCamera = z;
    }

    public void transformView(Size size, int i, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            Logger.m32245w("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        } else if (isTransformationInfoReady()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(getTextureViewCorrectionMatrix());
            } else {
                Display display = view.getDisplay();
                if (!(display == null || display.getRotation() == this.mTargetRotation)) {
                    Logger.m32241e("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF transformedSurfaceRect = getTransformedSurfaceRect(size, i);
            view.setPivotX(BitmapDescriptorFactory.HUE_RED);
            view.setPivotY(BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(transformedSurfaceRect.width() / ((float) this.mResolution.getWidth()));
            view.setScaleY(transformedSurfaceRect.height() / ((float) this.mResolution.getHeight()));
            view.setTranslationX(transformedSurfaceRect.left - ((float) view.getLeft()));
            view.setTranslationY(transformedSurfaceRect.top - ((float) view.getTop()));
        }
    }
}
