package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.LiveData;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.utils.Threads;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.Executor;
import p695od.C18728c;

final class TorchControl {
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener;
    public CallbackToFutureAdapter.C0673a<Void> mEnableTorchCompleter;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    public boolean mTargetTorchEnabled;
    private final C1043v<Integer> mTorchState;

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        boolean z;
        C124241 r0 = new Camera2CameraControlImpl.CaptureResultListener() {
            public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                boolean z;
                if (TorchControl.this.mEnableTorchCompleter != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if (num == null || num.intValue() != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    TorchControl torchControl = TorchControl.this;
                    if (z == torchControl.mTargetTorchEnabled) {
                        torchControl.mEnableTorchCompleter.mo2697b(null);
                        TorchControl.this.mEnableTorchCompleter = null;
                    }
                }
                return false;
            }
        };
        this.mCaptureResultListener = r0;
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        Boolean bool = (Boolean) cameraCharacteristicsCompat.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.mHasFlashUnit = z;
        this.mTorchState = new C1043v<>(0);
        camera2CameraControlImpl.addCaptureResultListener(r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$enableTorch$1(boolean z, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mExecutor.execute(new C12461g0(aVar, this, z));
        return "enableTorch: " + z;
    }

    private <T> void setLiveDataValue(C1043v<T> vVar, T t) {
        if (Threads.isMainThread()) {
            vVar.setValue(t);
        } else {
            vVar.postValue(t);
        }
    }

    public C18728c<Void> enableTorch(boolean z) {
        if (!this.mHasFlashUnit) {
            Logger.m32239d("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
        }
        setLiveDataValue(this.mTorchState, Integer.valueOf(z ? 1 : 0));
        return CallbackToFutureAdapter.m1884a(new C12463h0(this, z));
    }

    /* renamed from: enableTorchInternal */
    public void lambda$enableTorch$0(CallbackToFutureAdapter.C0673a<Void> aVar, boolean z) {
        if (!this.mIsActive) {
            setLiveDataValue(this.mTorchState, 0);
            aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        this.mTargetTorchEnabled = z;
        this.mCamera2CameraControlImpl.enableTorchInternal(z);
        setLiveDataValue(this.mTorchState, Integer.valueOf(z ? 1 : 0));
        CallbackToFutureAdapter.C0673a<Void> aVar2 = this.mEnableTorchCompleter;
        if (aVar2 != null) {
            aVar2.mo2698c(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.mEnableTorchCompleter = aVar;
    }

    public LiveData<Integer> getTorchState() {
        return this.mTorchState;
    }

    public void setActive(boolean z) {
        if (this.mIsActive != z) {
            this.mIsActive = z;
            if (!z) {
                if (this.mTargetTorchEnabled) {
                    this.mTargetTorchEnabled = false;
                    this.mCamera2CameraControlImpl.enableTorchInternal(false);
                    setLiveDataValue(this.mTorchState, 0);
                }
                CallbackToFutureAdapter.C0673a<Void> aVar = this.mEnableTorchCompleter;
                if (aVar != null) {
                    aVar.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
                    this.mEnableTorchCompleter = null;
                }
            }
        }
    }
}
