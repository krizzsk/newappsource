package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.camera2.internal.compat.quirk.CameraQuirks;
import com.veriff.sdk.camera.camera2.interop.Camera2CameraInfo;
import com.veriff.sdk.camera.core.CameraState;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.ZoomState;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraInfoInternal;
import com.veriff.sdk.camera.core.impl.Quirks;
import com.veriff.sdk.camera.core.impl.utils.CameraOrientationUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class Camera2CameraInfoImpl implements CameraInfoInternal {
    private Camera2CameraControlImpl mCamera2CameraControlImpl;
    private List<Pair<CameraCaptureCallback, Executor>> mCameraCaptureCallbacks = null;
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final String mCameraId;
    private final Quirks mCameraQuirks;
    private final RedirectableLiveData<CameraState> mCameraStateLiveData;
    private final Object mLock = new Object();
    private RedirectableLiveData<Integer> mRedirectTorchStateLiveData = null;
    private RedirectableLiveData<ZoomState> mRedirectZoomStateLiveData = null;

    public static class RedirectableLiveData<T> extends C1040t<T> {
        private T mInitialValue;
        private LiveData<T> mLiveDataSource;

        public RedirectableLiveData(T t) {
            this.mInitialValue = t;
        }

        public <S> void addSource(LiveData<S> liveData, C1044w<? super S> wVar) {
            throw new UnsupportedOperationException();
        }

        public T getValue() {
            LiveData<T> liveData = this.mLiveDataSource;
            return liveData == null ? this.mInitialValue : liveData.getValue();
        }

        public void redirectTo(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.mLiveDataSource;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.mLiveDataSource = liveData;
            super.addSource(liveData, new C12471p(this));
        }
    }

    public Camera2CameraInfoImpl(String str, CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        str.getClass();
        this.mCameraId = str;
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        new Camera2CameraInfo(this);
        this.mCameraQuirks = CameraQuirks.get(str, cameraCharacteristicsCompat);
        new Camera2CamcorderProfileProvider(str, cameraCharacteristicsCompat);
        this.mCameraStateLiveData = new RedirectableLiveData<>(CameraState.create(CameraState.Type.CLOSED));
    }

    private void logDeviceInfo() {
        logDeviceLevel();
    }

    private void logDeviceLevel() {
        String str;
        int supportedHardwareLevel = getSupportedHardwareLevel();
        if (supportedHardwareLevel == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (supportedHardwareLevel == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (supportedHardwareLevel == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (supportedHardwareLevel == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (supportedHardwareLevel != 4) {
            str = C16759e.m42349e("Unknown value: ", supportedHardwareLevel);
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        Logger.m32243i("Camera2CameraInfo", "Device Level: " + str);
    }

    public void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mCameraCaptureCallbacks == null) {
                    this.mCameraCaptureCallbacks = new ArrayList();
                }
                this.mCameraCaptureCallbacks.add(new Pair(cameraCaptureCallback, executor));
                return;
            }
            camera2CameraControlImpl.addSessionCameraCaptureCallback(executor, cameraCaptureCallback);
        }
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.mCameraCharacteristicsCompat;
    }

    public String getCameraId() {
        return this.mCameraId;
    }

    public Quirks getCameraQuirks() {
        return this.mCameraQuirks;
    }

    public String getImplementationType() {
        return getSupportedHardwareLevel() == 2 ? "com.veriff.sdk.camera.camera2.legacy" : "com.veriff.sdk.camera.camera2";
    }

    public Integer getLensFacing() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
        num.getClass();
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue != 1) {
            return null;
        }
        return 1;
    }

    public int getSensorOrientation() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return num.intValue();
    }

    public int getSensorRotationDegrees(int i) {
        Integer valueOf = Integer.valueOf(getSensorOrientation());
        int surfaceRotationToDegrees = CameraOrientationUtil.surfaceRotationToDegrees(i);
        Integer lensFacing = getLensFacing();
        boolean z = true;
        if (lensFacing == null || 1 != lensFacing.intValue()) {
            z = false;
        }
        return CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, valueOf.intValue(), z);
    }

    public int getSupportedHardwareLevel() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    public LiveData<Integer> getTorchState() {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mRedirectTorchStateLiveData == null) {
                    this.mRedirectTorchStateLiveData = new RedirectableLiveData<>(0);
                }
                RedirectableLiveData<Integer> redirectableLiveData = this.mRedirectTorchStateLiveData;
                return redirectableLiveData;
            }
            RedirectableLiveData<Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData2 != null) {
                return redirectableLiveData2;
            }
            LiveData<Integer> torchState = camera2CameraControlImpl.getTorchControl().getTorchState();
            return torchState;
        }
    }

    public boolean hasFlashUnit() {
        Boolean bool = (Boolean) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        bool.getClass();
        return bool.booleanValue();
    }

    public void linkWithCameraControl(Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.mLock) {
            this.mCamera2CameraControlImpl = camera2CameraControlImpl;
            RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
            if (redirectableLiveData != null) {
                redirectableLiveData.redirectTo(camera2CameraControlImpl.getZoomControl().getZoomState());
            }
            RedirectableLiveData<Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData2 != null) {
                redirectableLiveData2.redirectTo(this.mCamera2CameraControlImpl.getTorchControl().getTorchState());
            }
            List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
            if (list != null) {
                for (Pair next : list) {
                    this.mCamera2CameraControlImpl.addSessionCameraCaptureCallback((Executor) next.second, (CameraCaptureCallback) next.first);
                }
                this.mCameraCaptureCallbacks = null;
            }
        }
        logDeviceInfo();
    }

    public void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
                if (list != null) {
                    Iterator<Pair<CameraCaptureCallback, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == cameraCaptureCallback) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            camera2CameraControlImpl.removeSessionCameraCaptureCallback(cameraCaptureCallback);
        }
    }

    public void setCameraStateSource(LiveData<CameraState> liveData) {
        this.mCameraStateLiveData.redirectTo(liveData);
    }
}
