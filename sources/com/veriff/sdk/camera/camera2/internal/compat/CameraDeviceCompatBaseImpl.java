package com.veriff.sdk.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import com.veriff.sdk.camera.camera2.internal.compat.CameraDeviceCompat;
import com.veriff.sdk.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import com.veriff.sdk.camera.core.Logger;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0017h;

class CameraDeviceCompatBaseImpl implements CameraDeviceCompat.CameraDeviceCompatImpl {
    public final CameraDevice mCameraDevice;
    public final Object mImplParams;

    public static class CameraDeviceCompatParamsApi21 {
        public final Handler mCompatHandler;

        public CameraDeviceCompatParamsApi21(Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public CameraDeviceCompatBaseImpl(CameraDevice cameraDevice, Object obj) {
        cameraDevice.getClass();
        this.mCameraDevice = cameraDevice;
        this.mImplParams = obj;
    }

    private static void checkPhysicalCameraIdValid(CameraDevice cameraDevice, List<OutputConfigurationCompat> list) {
        String id = cameraDevice.getId();
        for (OutputConfigurationCompat physicalCameraId : list) {
            String physicalCameraId2 = physicalCameraId.getPhysicalCameraId();
            if (physicalCameraId2 != null && !physicalCameraId2.isEmpty()) {
                Logger.m32245w("CameraDeviceCompat", C0017h.m56M("Camera ", id, ": Camera doesn't support physicalCameraId ", physicalCameraId2, ". Ignoring."));
            }
        }
    }

    public static void checkPreconditions(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat) {
        cameraDevice.getClass();
        sessionConfigurationCompat.getClass();
        sessionConfigurationCompat.getStateCallback().getClass();
        List<OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (sessionConfigurationCompat.getExecutor() != null) {
            checkPhysicalCameraIdValid(cameraDevice, outputConfigurations);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    public static CameraDeviceCompatBaseImpl create(CameraDevice cameraDevice, Handler handler) {
        return new CameraDeviceCompatBaseImpl(cameraDevice, new CameraDeviceCompatParamsApi21(handler));
    }

    public static List<Surface> unpackSurfaces(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfigurationCompat surface : list) {
            arrayList.add(surface.getSurface());
        }
        return arrayList;
    }

    public void createBaseCaptureSession(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        cameraDevice.createCaptureSession(list, stateCallback, handler);
    }

    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException {
        checkPreconditions(this.mCameraDevice, sessionConfigurationCompat);
        if (sessionConfigurationCompat.getInputConfiguration() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (sessionConfigurationCompat.getSessionType() != 1) {
            CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new CameraCaptureSessionCompat.StateCallbackExecutorWrapper(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
            createBaseCaptureSession(this.mCameraDevice, unpackSurfaces(sessionConfigurationCompat.getOutputConfigurations()), stateCallbackExecutorWrapper, ((CameraDeviceCompatParamsApi21) this.mImplParams).mCompatHandler);
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }
}
