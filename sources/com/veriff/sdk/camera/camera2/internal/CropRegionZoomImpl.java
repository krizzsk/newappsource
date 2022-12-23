package com.veriff.sdk.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.internal.ZoomControl;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.core.CameraControl;

final class CropRegionZoomImpl implements ZoomControl.ZoomImpl {
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private Rect mCurrentCropRect = null;
    private Rect mPendingZoomCropRegion = null;
    private CallbackToFutureAdapter.C0673a<Void> mPendingZoomRatioCompleter;

    public CropRegionZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
    }

    private Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public void addRequestOption(Camera2ImplConfig.Builder builder) {
        Rect rect = this.mCurrentCropRect;
        if (rect != null) {
            builder.setCaptureRequestOption(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    public Rect getCropSensorRegion() {
        Rect rect = this.mCurrentCropRect;
        return rect != null ? rect : getSensorRect();
    }

    public float getMaxZoom() {
        Float f = (Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < getMinZoom()) {
            return getMinZoom();
        }
        return f.floatValue();
    }

    public float getMinZoom() {
        return 1.0f;
    }

    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (this.mPendingZoomRatioCompleter != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = this.mPendingZoomCropRegion;
            if (rect2 != null && rect2.equals(rect)) {
                this.mPendingZoomRatioCompleter.mo2697b(null);
                this.mPendingZoomRatioCompleter = null;
                this.mPendingZoomCropRegion = null;
            }
        }
    }

    public void resetZoom() {
        this.mPendingZoomCropRegion = null;
        this.mCurrentCropRect = null;
        CallbackToFutureAdapter.C0673a<Void> aVar = this.mPendingZoomRatioCompleter;
        if (aVar != null) {
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }
}
