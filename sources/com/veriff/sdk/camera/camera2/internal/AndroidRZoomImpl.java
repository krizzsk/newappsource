package com.veriff.sdk.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.internal.ZoomControl;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.core.CameraControl;

final class AndroidRZoomImpl implements ZoomControl.ZoomImpl {
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private float mCurrentZoomRatio = 1.0f;
    private float mPendingZoomRatio = 1.0f;
    private CallbackToFutureAdapter.C0673a<Void> mPendingZoomRatioCompleter;
    private final Range<Float> mZoomRatioRange;

    public AndroidRZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mZoomRatioRange = (Range) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    public void addRequestOption(Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.mCurrentZoomRatio));
    }

    public Rect getCropSensorRegion() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public float getMaxZoom() {
        return this.mZoomRatioRange.getUpper().floatValue();
    }

    public float getMinZoom() {
        return this.mZoomRatioRange.getLower().floatValue();
    }

    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        Float f;
        if (this.mPendingZoomRatioCompleter != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f = null;
            } else {
                f = (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            }
            if (f != null) {
                if (this.mPendingZoomRatio == f.floatValue()) {
                    this.mPendingZoomRatioCompleter.mo2697b(null);
                    this.mPendingZoomRatioCompleter = null;
                }
            }
        }
    }

    public void resetZoom() {
        this.mCurrentZoomRatio = 1.0f;
        CallbackToFutureAdapter.C0673a<Void> aVar = this.mPendingZoomRatioCompleter;
        if (aVar != null) {
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }
}
