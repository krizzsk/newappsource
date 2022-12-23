package com.veriff.sdk.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.concurrent.Executor;

public final class CameraDeviceCompat {
    private final CameraDeviceCompatImpl mImpl;

    public interface CameraDeviceCompatImpl {
        void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException;
    }

    public static final class StateCallbackExecutorWrapper extends CameraDevice.StateCallback {
        private final Executor mExecutor;
        public final CameraDevice.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        public void onClosed(final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onClosed(cameraDevice);
                }
            });
        }

        public void onDisconnected(final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onDisconnected(cameraDevice);
                }
            });
        }

        public void onError(final CameraDevice cameraDevice, final int i) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onError(cameraDevice, i);
                }
            });
        }

        public void onOpened(final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onOpened(cameraDevice);
                }
            });
        }
    }

    private CameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new CameraDeviceCompatApi28Impl(cameraDevice);
        } else if (i >= 24) {
            this.mImpl = CameraDeviceCompatApi24Impl.create(cameraDevice, handler);
        } else if (i >= 23) {
            this.mImpl = CameraDeviceCompatApi23Impl.create(cameraDevice, handler);
        } else {
            this.mImpl = CameraDeviceCompatBaseImpl.create(cameraDevice, handler);
        }
    }

    public static CameraDeviceCompat toCameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        return new CameraDeviceCompat(cameraDevice, handler);
    }

    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException {
        this.mImpl.createCaptureSession(sessionConfigurationCompat);
    }
}
