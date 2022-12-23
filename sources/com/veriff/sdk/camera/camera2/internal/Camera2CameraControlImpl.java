package com.veriff.sdk.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.camera2.internal.C0510d;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import cd0.C7590a;
import cd0.C7591b;
import cd0.C7592c;
import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.AeFpsRange;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import com.veriff.sdk.camera.camera2.interop.Camera2CameraControl;
import com.veriff.sdk.camera.camera2.interop.CaptureRequestOptions;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.FocusMeteringAction;
import com.veriff.sdk.camera.core.FocusMeteringResult;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CameraCaptureFailure;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import com.veriff.sdk.camera.core.impl.CameraControlInternal;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.Quirks;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p054d0.C4267a0;
import p304x.C7061i;
import p304x.C7067k;
import p316y.C7218m;
import p695od.C18728c;

public class Camera2CameraControlImpl implements CameraControlInternal {
    private final AeFpsRange mAeFpsRange;
    private final AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final Camera2CameraControl mCamera2CameraControl;
    private final CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private final CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    public final Executor mExecutor;
    private final ExposureControl mExposureControl;
    private volatile int mFlashMode;
    private final FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsTorchOn;
    private final Object mLock = new Object();
    private final AtomicLong mNextSessionUpdateId;
    public final CameraControlSessionCallback mSessionCallback;
    private final SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final TorchControl mTorchControl;
    private int mUseCount;
    private final ZoomControl mZoomControl;

    public static final class CameraCaptureCallbackSet extends CameraCaptureCallback {
        public Map<CameraCaptureCallback, Executor> mCallbackExecutors = new ArrayMap();
        public Set<CameraCaptureCallback> mCallbacks = new HashSet();

        public void addCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.add(cameraCaptureCallback);
            this.mCallbackExecutors.put(cameraCaptureCallback, executor);
        }

        public void onCaptureCancelled() {
            for (CameraCaptureCallback next : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(next).execute(new C12426a(next));
                } catch (RejectedExecutionException e) {
                    Logger.m32242e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            for (CameraCaptureCallback next : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(next).execute(new C12430c(0, next, cameraCaptureResult));
                } catch (RejectedExecutionException e) {
                    Logger.m32242e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
            for (CameraCaptureCallback next : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(next).execute(new C12428b(next, cameraCaptureFailure));
                } catch (RejectedExecutionException e) {
                    Logger.m32242e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        public void removeCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.remove(cameraCaptureCallback);
            this.mCallbackExecutors.remove(cameraCaptureCallback);
        }
    }

    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        public final Set<CaptureResultListener> mResultListeners = new HashSet();

        public CameraControlSessionCallback(Executor executor) {
            this.mExecutor = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$0(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (CaptureResultListener next : this.mResultListeners) {
                if (next.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(next);
                }
            }
            if (!hashSet.isEmpty()) {
                this.mResultListeners.removeAll(hashSet);
            }
        }

        public void addListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new C12454d(0, this, totalCaptureResult));
        }

        public void removeListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }
    }

    public interface CaptureResultListener {
        boolean onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback, Quirks quirks) {
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.mSessionConfigBuilder = builder;
        this.mUseCount = 0;
        this.mIsTorchOn = false;
        this.mFlashMode = 2;
        this.mAutoFlashAEModeDisabler = new AutoFlashAEModeDisabler();
        this.mNextSessionUpdateId = new AtomicLong(0);
        this.mTemplate = 1;
        this.mCurrentSessionUpdateId = 0;
        CameraCaptureCallbackSet cameraCaptureCallbackSet = new CameraCaptureCallbackSet();
        this.mCameraCaptureCallbackSet = cameraCaptureCallbackSet;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mControlUpdateCallback = controlUpdateCallback;
        this.mExecutor = executor;
        CameraControlSessionCallback cameraControlSessionCallback = new CameraControlSessionCallback(executor);
        this.mSessionCallback = cameraControlSessionCallback;
        builder.setTemplateType(this.mTemplate);
        builder.addRepeatingCameraCaptureCallback(CaptureCallbackContainer.create(cameraControlSessionCallback));
        builder.addRepeatingCameraCaptureCallback(cameraCaptureCallbackSet);
        this.mExposureControl = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.mFocusMeteringControl = new FocusMeteringControl(this, scheduledExecutorService, executor);
        this.mZoomControl = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchControl = new TorchControl(this, cameraCharacteristicsCompat, executor);
        this.mAeFpsRange = new AeFpsRange(quirks);
        this.mCamera2CameraControl = new Camera2CameraControl(this, executor);
        executor.execute(new C7591b(this));
    }

    private int getSupportedAeMode(int i) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i, iArr)) {
            return i;
        }
        if (isModeInList(1, iArr)) {
            return 1;
        }
        return 0;
    }

    private int getSupportedAwbMode(int i) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i, iArr)) {
            return i;
        }
        if (isModeInList(1, iArr)) {
            return 1;
        }
        return 0;
    }

    private boolean isControlInUse() {
        return getUseCount() > 0;
    }

    private boolean isModeInList(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addInteropConfig$1() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addSessionCameraCaptureCallback$9(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.addCaptureCallback(executor, cameraCaptureCallback);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelAfAeTrigger$7(boolean z, boolean z2) {
        this.mFocusMeteringControl.cancelAfAeTrigger(z, z2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearInteropConfig$2() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        addCaptureResultListener(this.mCamera2CameraControl.getCaptureRequestListener());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSessionCameraCaptureCallback$10(CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.removeCaptureCallback(cameraCaptureCallback);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerAePrecapture$5(CallbackToFutureAdapter.C0673a aVar) {
        this.mFocusMeteringControl.triggerAePrecapture(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$triggerAePrecapture$6(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mExecutor.execute(new C12467l(1, this, aVar));
        return "triggerAePrecapture";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerAf$3(CallbackToFutureAdapter.C0673a aVar) {
        this.mFocusMeteringControl.triggerAf(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$triggerAf$4(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mExecutor.execute(new C12466k(1, this, aVar));
        return "triggerAf";
    }

    public void addCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.addListener(captureResultListener);
    }

    public void addInteropConfig(Config config) {
        this.mCamera2CameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new C7061i(2), CameraXExecutors.directExecutor());
    }

    public void addSessionCameraCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new C0510d(7, this, executor, cameraCaptureCallback));
    }

    public void cancelAfAeTrigger(boolean z, boolean z2) {
        if (!isControlInUse()) {
            Logger.m32245w("Camera2CameraControlImp", "Camera is not active.");
        } else {
            this.mExecutor.execute(new C7590a(this, z, z2));
        }
    }

    public void clearInteropConfig() {
        this.mCamera2CameraControl.clearCaptureRequestOptions().addListener(new C7067k(4), CameraXExecutors.directExecutor());
    }

    public void decrementUseCount() {
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i != 0) {
                this.mUseCount = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    public C18728c<Void> enableTorch(boolean z) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.mTorchControl.enableTorch(z));
    }

    public void enableTorchInternal(boolean z) {
        this.mIsTorchOn = z;
        if (!z) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(1)));
            builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            lambda$submitCaptureRequests$8(Collections.singletonList(builder.build()));
        }
        updateSessionConfigSynchronous();
    }

    public Rect getCropSensorRegion() {
        return this.mZoomControl.getCropSensorRegion();
    }

    public Config getInteropConfig() {
        return this.mCamera2CameraControl.getCamera2ImplConfig();
    }

    public int getMaxAeRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAfRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAwbRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public SessionConfig getSessionConfig() {
        this.mSessionConfigBuilder.setTemplateType(this.mTemplate);
        this.mSessionConfigBuilder.setImplementationOptions(getSessionOptions());
        Object captureRequestTag = this.mCamera2CameraControl.getCamera2ImplConfig().getCaptureRequestTag((Object) null);
        if (captureRequestTag != null && (captureRequestTag instanceof Integer)) {
            this.mSessionConfigBuilder.addTag("Camera2CameraControl", captureRequestTag);
        }
        this.mSessionConfigBuilder.addTag("CameraControlSessionUpdateId", Long.valueOf(this.mCurrentSessionUpdateId));
        return this.mSessionConfigBuilder.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0073 A[LOOP:0: B:10:0x006d->B:12:0x0073, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.camera.core.impl.Config getSessionOptions() {
        /*
            r7 = this;
            com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r3)
            com.veriff.sdk.camera.camera2.internal.FocusMeteringControl r1 = r7.mFocusMeteringControl
            r1.addFocusMeteringOptions(r0)
            com.veriff.sdk.camera.camera2.internal.compat.workaround.AeFpsRange r1 = r7.mAeFpsRange
            r1.addAeFpsRangeOptions(r0)
            com.veriff.sdk.camera.camera2.internal.ZoomControl r1 = r7.mZoomControl
            r1.addZoomOption(r0)
            boolean r1 = r7.mIsTorchOn
            r3 = 2
            if (r1 == 0) goto L_0x002d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setCaptureRequestOption(r1, r3)
            goto L_0x0033
        L_0x002d:
            int r1 = r7.mFlashMode
            if (r1 == 0) goto L_0x0037
            if (r1 == r2) goto L_0x0035
        L_0x0033:
            r1 = 1
            goto L_0x003d
        L_0x0035:
            r1 = 3
            goto L_0x003d
        L_0x0037:
            com.veriff.sdk.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler r1 = r7.mAutoFlashAEModeDisabler
            int r1 = r1.getCorrectedAeMode(r3)
        L_0x003d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.getSupportedAeMode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setCaptureRequestOption(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.getSupportedAwbMode(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r2)
            com.veriff.sdk.camera.camera2.internal.ExposureControl r1 = r7.mExposureControl
            r1.setCaptureRequestOption(r0)
            com.veriff.sdk.camera.camera2.interop.Camera2CameraControl r1 = r7.mCamera2CameraControl
            com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig r1 = r1.getCamera2ImplConfig()
            r1.getClass()
            java.util.Set r2 = fd0.C12690k.m32422e(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x006d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r2.next()
            com.veriff.sdk.camera.core.impl.Config$Option r3 = (com.veriff.sdk.camera.core.impl.Config.Option) r3
            com.veriff.sdk.camera.core.impl.MutableConfig r4 = r0.getMutableConfig()
            com.veriff.sdk.camera.core.impl.Config$OptionPriority r5 = com.veriff.sdk.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
            java.lang.Object r6 = fd0.C12690k.m32423f(r1, r3)
            r4.insertOption(r3, r5, r6)
            goto L_0x006d
        L_0x0087:
            com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl.getSessionOptions():com.veriff.sdk.camera.core.impl.Config");
    }

    public int getSupportedAfMode(int i) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i, iArr)) {
            return i;
        }
        if (isModeInList(4, iArr)) {
            return 4;
        }
        if (isModeInList(1, iArr)) {
            return 1;
        }
        return 0;
    }

    public TorchControl getTorchControl() {
        return this.mTorchControl;
    }

    public int getUseCount() {
        int i;
        synchronized (this.mLock) {
            i = this.mUseCount;
        }
        return i;
    }

    public ZoomControl getZoomControl() {
        return this.mZoomControl;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            this.mUseCount++;
        }
    }

    public void removeCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.removeListener(captureResultListener);
    }

    public void removeSessionCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new C12428b(this, cameraCaptureCallback));
    }

    public void resetTemplate() {
        setTemplate(1);
    }

    public void setActive(boolean z) {
        this.mFocusMeteringControl.setActive(z);
        this.mZoomControl.setActive(z);
        this.mTorchControl.setActive(z);
        this.mExposureControl.setActive(z);
        this.mCamera2CameraControl.setActive(z);
    }

    public void setFlashMode(int i) {
        if (!isControlInUse()) {
            Logger.m32245w("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.mFlashMode = i;
        updateSessionConfig();
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.mFocusMeteringControl.setPreviewAspectRatio(rational);
    }

    public void setTemplate(int i) {
        this.mTemplate = i;
        this.mFocusMeteringControl.setTemplate(i);
    }

    public C18728c<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.mFocusMeteringControl.startFocusAndMetering(focusMeteringAction));
    }

    public void submitCaptureRequests(List<CaptureConfig> list) {
        if (!isControlInUse()) {
            Logger.m32245w("Camera2CameraControlImp", "Camera is not active.");
        } else {
            this.mExecutor.execute(new C7218m(9, this, list));
        }
    }

    /* renamed from: submitCaptureRequestsInternal */
    public void lambda$submitCaptureRequests$8(List<CaptureConfig> list) {
        this.mControlUpdateCallback.onCameraControlCaptureRequests(list);
    }

    public C18728c<CameraCaptureResult> triggerAePrecapture() {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.m1884a(new C7592c(this)));
    }

    public C18728c<CameraCaptureResult> triggerAf() {
        if (!isControlInUse()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.m1884a(new C4267a0(this, 18)));
    }

    public void updateSessionConfig() {
        this.mExecutor.execute(new C12459f0(this, 1));
    }

    public long updateSessionConfigSynchronous() {
        this.mCurrentSessionUpdateId = this.mNextSessionUpdateId.getAndIncrement();
        this.mControlUpdateCallback.onCameraControlUpdateSessionConfig();
        return this.mCurrentSessionUpdateId;
    }
}
