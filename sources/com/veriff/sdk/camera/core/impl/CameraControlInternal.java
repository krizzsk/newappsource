package com.veriff.sdk.camera.core.impl;

import android.graphics.Rect;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.FocusMeteringAction;
import com.veriff.sdk.camera.core.FocusMeteringResult;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.List;
import p695od.C18728c;

public interface CameraControlInternal extends CameraControl {
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() {
        public void addInteropConfig(Config config) {
        }

        public void cancelAfAeTrigger(boolean z, boolean z2) {
        }

        public void clearInteropConfig() {
        }

        public C18728c<Void> enableTorch(boolean z) {
            return Futures.immediateFuture(null);
        }

        public Config getInteropConfig() {
            return null;
        }

        public Rect getSensorRect() {
            return new Rect();
        }

        public void setFlashMode(int i) {
        }

        public C18728c<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        public void submitCaptureRequests(List<CaptureConfig> list) {
        }

        public C18728c<CameraCaptureResult> triggerAePrecapture() {
            return Futures.immediateFuture(CameraCaptureResult.EmptyCameraCaptureResult.create());
        }

        public C18728c<CameraCaptureResult> triggerAf() {
            return Futures.immediateFuture(CameraCaptureResult.EmptyCameraCaptureResult.create());
        }
    };

    public static final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }

    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(Config config);

    void cancelAfAeTrigger(boolean z, boolean z2);

    void clearInteropConfig();

    Config getInteropConfig();

    Rect getSensorRect();

    void setFlashMode(int i);

    void submitCaptureRequests(List<CaptureConfig> list);

    C18728c<CameraCaptureResult> triggerAePrecapture();

    C18728c<CameraCaptureResult> triggerAf();
}
