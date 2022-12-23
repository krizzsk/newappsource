package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import java.util.List;
import p695od.C18728c;

interface SynchronizedCaptureSession {

    public static abstract class StateCallback {
        public void onActive(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onCaptureQueueEmpty(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSurfacePrepared(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        }
    }

    void abortCaptures() throws CameraAccessException;

    int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void close();

    void finishClose();

    CameraDevice getDevice();

    StateCallback getStateCallback();

    C18728c<Void> getSynchronizedBlocker(String str);

    int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void stopRepeating() throws CameraAccessException;

    CameraCaptureSessionCompat toCameraCaptureSessionCompat();
}
