package com.veriff.sdk.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionOpener;
import com.veriff.sdk.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.veriff.sdk.camera.camera2.internal.compat.CameraManagerCompat;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.CameraInfo;
import com.veriff.sdk.camera.core.CameraState;
import com.veriff.sdk.camera.core.CameraUnavailableException;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.Preview;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CameraControlInternal;
import com.veriff.sdk.camera.core.impl.CameraInfoInternal;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.CameraStateRegistry;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.ImmediateSurface;
import com.veriff.sdk.camera.core.impl.LiveDataObservable;
import com.veriff.sdk.camera.core.impl.Observable;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.UseCaseAttachState;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import fd0.C12684e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24361g;
import p001a0.C0016g;
import p695od.C18728c;

final class Camera2CameraImpl implements CameraInternal {
    private final CameraAvailability mCameraAvailability;
    private final Camera2CameraControlImpl mCameraControlInternal;
    public CameraDevice mCameraDevice;
    public int mCameraDeviceError;
    public final Camera2CameraInfoImpl mCameraInfoInternal;
    private final CameraManagerCompat mCameraManager;
    private final CameraStateMachine mCameraStateMachine;
    private final CameraStateRegistry mCameraStateRegistry;
    public CaptureSession mCaptureSession;
    private final SynchronizedCaptureSessionOpener.Builder mCaptureSessionOpenerBuilder;
    private final CaptureSessionRepository mCaptureSessionRepository;
    public final Set<CaptureSession> mConfiguringForClose;
    private final Executor mExecutor;
    private MeteringRepeatingSession mMeteringRepeatingSession;
    private final Set<String> mNotifyStateAttachedSet;
    private final LiveDataObservable<CameraInternal.State> mObservableState;
    public final AtomicInteger mReleaseRequestCount;
    public final Map<CaptureSession, C18728c<Void>> mReleasedCaptureSessions;
    public volatile InternalState mState = InternalState.INITIALIZED;
    private final StateCallback mStateCallback;
    private final UseCaseAttachState mUseCaseAttachState;
    public C18728c<Void> mUserReleaseFuture;
    public CallbackToFutureAdapter.C0673a<Void> mUserReleaseNotifier;

    /* renamed from: com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$3 */
    public static /* synthetic */ class C124103 {

        /* renamed from: $SwitchMap$com$veriff$sdk$camera$camera2$internal$Camera2CameraImpl$InternalState */
        public static final /* synthetic */ int[] f30938xc2e920ec;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30938xc2e920ec = r0
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30938xc2e920ec     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30938xc2e920ec     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30938xc2e920ec     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30938xc2e920ec     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30938xc2e920ec     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30938xc2e920ec     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30938xc2e920ec     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.Camera2CameraImpl.C124103.<clinit>():void");
        }
    }

    public final class CameraAvailability extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {
        private boolean mCameraAvailable = true;
        private final String mCameraId;

        public CameraAvailability(String str) {
            this.mCameraId = str;
        }

        public boolean isCameraAvailable() {
            return this.mCameraAvailable;
        }

        public void onCameraAvailable(String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = true;
                if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                    Camera2CameraImpl.this.tryOpenCameraDevice(false);
                }
            }
        }

        public void onCameraUnavailable(String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = false;
            }
        }

        public void onOpenAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.tryOpenCameraDevice(false);
            }
        }
    }

    public final class ControlUpdateListenerInternal implements CameraControlInternal.ControlUpdateCallback {
        public ControlUpdateListenerInternal() {
        }

        public void onCameraControlCaptureRequests(List<CaptureConfig> list) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            list.getClass();
            camera2CameraImpl.submitCaptureRequests(list);
        }

        public void onCameraControlUpdateSessionConfig() {
            Camera2CameraImpl.this.updateCaptureSessionConfig();
        }
    }

    public enum InternalState {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    public final class StateCallback extends CameraDevice.StateCallback {
        private final CameraReopenMonitor mCameraReopenMonitor = new CameraReopenMonitor(this);
        private final Executor mExecutor;
        public ScheduledFuture<?> mScheduledReopenHandle;
        private ScheduledReopen mScheduledReopenRunnable;
        private final ScheduledExecutorService mScheduler;

        public class CameraReopenMonitor {
            private long mFirstReopenTime = -1;

            public CameraReopenMonitor(StateCallback stateCallback) {
            }

            public boolean canScheduleCameraReopen() {
                boolean z;
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.mFirstReopenTime;
                if (j == -1) {
                    this.mFirstReopenTime = uptimeMillis;
                    return true;
                }
                if (uptimeMillis - j >= 10000) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
                reset();
                return false;
            }

            public void reset() {
                this.mFirstReopenTime = -1;
            }
        }

        public class ScheduledReopen implements Runnable {
            private boolean mCancelled = false;
            private Executor mExecutor;

            public ScheduledReopen(Executor executor) {
                this.mExecutor = executor;
            }

            /* access modifiers changed from: private */
            public void lambda$run$0() {
                boolean z;
                if (!this.mCancelled) {
                    if (Camera2CameraImpl.this.mState == InternalState.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C24361g.m61193w((String) null, z);
                    Camera2CameraImpl.this.tryOpenCameraDevice(true);
                }
            }

            public void cancel() {
                this.mCancelled = true;
            }

            public void run() {
                this.mExecutor.execute(new C12470o(this));
            }
        }

        public StateCallback(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
        }

        private void handleErrorOnOpen(CameraDevice cameraDevice, int i) {
            boolean z;
            int i2;
            if (Camera2CameraImpl.this.mState == InternalState.OPENING || Camera2CameraImpl.this.mState == InternalState.OPENED || Camera2CameraImpl.this.mState == InternalState.REOPENING) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder k = C13555b.m33972k("Attempt to handle open error from non open state: ");
            k.append(Camera2CameraImpl.this.mState);
            C24361g.m61193w(k.toString(), z);
            if (i == 1 || i == 2 || i == 4) {
                Logger.m32239d("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", new Object[]{cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i)}));
                reopenCameraAfterError(i);
                return;
            }
            StringBuilder k2 = C13555b.m33972k("Error observed on open (or opening) camera device ");
            k2.append(cameraDevice.getId());
            k2.append(": ");
            k2.append(Camera2CameraImpl.getErrorMessage(i));
            k2.append(" closing camera.");
            Logger.m32241e("Camera2CameraImpl", k2.toString());
            if (i == 3) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            Camera2CameraImpl.this.setState(InternalState.CLOSING, CameraState.StateError.create(i2));
            Camera2CameraImpl.this.closeCamera(false);
        }

        private void reopenCameraAfterError(int i) {
            boolean z;
            int i2 = 1;
            if (Camera2CameraImpl.this.mCameraDeviceError != 0) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("Can only reopen camera device after error if the camera device is actually in an error state.", z);
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            Camera2CameraImpl.this.setState(InternalState.REOPENING, CameraState.StateError.create(i2));
            Camera2CameraImpl.this.closeCamera(false);
        }

        public boolean cancelScheduledReopen() {
            if (this.mScheduledReopenHandle == null) {
                return false;
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            StringBuilder k = C13555b.m33972k("Cancelling scheduled re-open: ");
            k.append(this.mScheduledReopenRunnable);
            camera2CameraImpl.debugLog(k.toString());
            this.mScheduledReopenRunnable.cancel();
            this.mScheduledReopenRunnable = null;
            this.mScheduledReopenHandle.cancel(false);
            this.mScheduledReopenHandle = null;
            return true;
        }

        public void onClosed(CameraDevice cameraDevice) {
            boolean z;
            Camera2CameraImpl.this.debugLog("CameraDevice.onClosed()");
            if (Camera2CameraImpl.this.mCameraDevice == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("Unexpected onClose callback on camera device: " + cameraDevice, z);
            int i = C124103.f30938xc2e920ec[Camera2CameraImpl.this.mState.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.mCameraDeviceError != 0) {
                        StringBuilder k = C13555b.m33972k("Camera closed due to error: ");
                        k.append(Camera2CameraImpl.getErrorMessage(Camera2CameraImpl.this.mCameraDeviceError));
                        camera2CameraImpl.debugLog(k.toString());
                        scheduleCameraReopen();
                        return;
                    }
                    camera2CameraImpl.tryOpenCameraDevice(false);
                    return;
                } else if (i != 7) {
                    StringBuilder k2 = C13555b.m33972k("Camera closed while in state: ");
                    k2.append(Camera2CameraImpl.this.mState);
                    throw new IllegalStateException(k2.toString());
                }
            }
            C24361g.m61193w((String) null, Camera2CameraImpl.this.isSessionCloseComplete());
            Camera2CameraImpl.this.finishClose();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        public void onError(CameraDevice cameraDevice, int i) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = i;
            int i2 = C124103.f30938xc2e920ec[camera2CameraImpl.mState.ordinal()];
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    Logger.m32239d("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", new Object[]{cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i), Camera2CameraImpl.this.mState.name()}));
                    handleErrorOnOpen(cameraDevice, i);
                    return;
                } else if (i2 != 7) {
                    StringBuilder k = C13555b.m33972k("onError() should not be possible from state: ");
                    k.append(Camera2CameraImpl.this.mState);
                    throw new IllegalStateException(k.toString());
                }
            }
            Logger.m32241e("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", new Object[]{cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i), Camera2CameraImpl.this.mState.name()}));
            Camera2CameraImpl.this.closeCamera(false);
        }

        public void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onOpened()");
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = 0;
            int i = C124103.f30938xc2e920ec[camera2CameraImpl.mState.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    Camera2CameraImpl.this.setState(InternalState.OPENED);
                    Camera2CameraImpl.this.openCaptureSession();
                    return;
                } else if (i != 7) {
                    StringBuilder k = C13555b.m33972k("onOpened() should not be possible from state: ");
                    k.append(Camera2CameraImpl.this.mState);
                    throw new IllegalStateException(k.toString());
                }
            }
            C24361g.m61193w((String) null, Camera2CameraImpl.this.isSessionCloseComplete());
            Camera2CameraImpl.this.mCameraDevice.close();
            Camera2CameraImpl.this.mCameraDevice = null;
        }

        public void resetReopenMonitor() {
            this.mCameraReopenMonitor.reset();
        }

        public void scheduleCameraReopen() {
            boolean z;
            boolean z2 = true;
            if (this.mScheduledReopenRunnable == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w((String) null, z);
            if (this.mScheduledReopenHandle != null) {
                z2 = false;
            }
            C24361g.m61193w((String) null, z2);
            if (this.mCameraReopenMonitor.canScheduleCameraReopen()) {
                this.mScheduledReopenRunnable = new ScheduledReopen(this.mExecutor);
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                StringBuilder k = C13555b.m33972k("Attempting camera re-open in 700ms: ");
                k.append(this.mScheduledReopenRunnable);
                camera2CameraImpl.debugLog(k.toString());
                this.mScheduledReopenHandle = this.mScheduler.schedule(this.mScheduledReopenRunnable, 700, TimeUnit.MILLISECONDS);
                return;
            }
            Logger.m32241e("Camera2CameraImpl", "Camera reopening attempted for 10000ms without success.");
            Camera2CameraImpl.this.setState(InternalState.PENDING_OPEN, (CameraState.StateError) null, false);
        }
    }

    public Camera2CameraImpl(CameraManagerCompat cameraManagerCompat, String str, Camera2CameraInfoImpl camera2CameraInfoImpl, CameraStateRegistry cameraStateRegistry, Executor executor, Handler handler) throws CameraUnavailableException {
        CameraManagerCompat cameraManagerCompat2 = cameraManagerCompat;
        String str2 = str;
        Camera2CameraInfoImpl camera2CameraInfoImpl2 = camera2CameraInfoImpl;
        CameraStateRegistry cameraStateRegistry2 = cameraStateRegistry;
        LiveDataObservable<CameraInternal.State> liveDataObservable = new LiveDataObservable<>();
        this.mObservableState = liveDataObservable;
        this.mCameraDeviceError = 0;
        this.mReleaseRequestCount = new AtomicInteger(0);
        this.mReleasedCaptureSessions = new LinkedHashMap();
        this.mConfiguringForClose = new HashSet();
        this.mNotifyStateAttachedSet = new HashSet();
        this.mCameraManager = cameraManagerCompat2;
        this.mCameraStateRegistry = cameraStateRegistry2;
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = newSequentialExecutor;
        this.mStateCallback = new StateCallback(newSequentialExecutor, newHandlerExecutor);
        this.mUseCaseAttachState = new UseCaseAttachState(str2);
        liveDataObservable.postValue(CameraInternal.State.CLOSED);
        CameraStateMachine cameraStateMachine = new CameraStateMachine(cameraStateRegistry2);
        this.mCameraStateMachine = cameraStateMachine;
        CaptureSessionRepository captureSessionRepository = new CaptureSessionRepository(newSequentialExecutor);
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mCaptureSession = new CaptureSession();
        try {
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraManagerCompat.getCameraCharacteristicsCompat(str), newHandlerExecutor, newSequentialExecutor, new ControlUpdateListenerInternal(), camera2CameraInfoImpl.getCameraQuirks());
            this.mCameraControlInternal = camera2CameraControlImpl;
            this.mCameraInfoInternal = camera2CameraInfoImpl2;
            camera2CameraInfoImpl2.linkWithCameraControl(camera2CameraControlImpl);
            camera2CameraInfoImpl2.setCameraStateSource(cameraStateMachine.getStateLiveData());
            this.mCaptureSessionOpenerBuilder = new SynchronizedCaptureSessionOpener.Builder(newSequentialExecutor, newHandlerExecutor, handler, captureSessionRepository, camera2CameraInfoImpl.getSupportedHardwareLevel());
            CameraAvailability cameraAvailability = new CameraAvailability(str2);
            this.mCameraAvailability = cameraAvailability;
            cameraStateRegistry2.registerCamera(this, newSequentialExecutor, cameraAvailability);
            cameraManagerCompat2.registerAvailabilityCallback(newSequentialExecutor, cameraAvailability);
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    private void addMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            useCaseAttachState.setUseCaseAttached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode(), this.mMeteringRepeatingSession.getSessionConfig());
            UseCaseAttachState useCaseAttachState2 = this.mUseCaseAttachState;
            useCaseAttachState2.setUseCaseActive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode(), this.mMeteringRepeatingSession.getSessionConfig());
        }
    }

    private void addOrRemoveMeteringRepeatingUseCase() {
        SessionConfig build = this.mUseCaseAttachState.getAttachedBuilder().build();
        CaptureConfig repeatingCaptureConfig = build.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = build.getSurfaces().size();
        if (build.getSurfaces().isEmpty()) {
            return;
        }
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            if (this.mMeteringRepeatingSession == null) {
                this.mMeteringRepeatingSession = new MeteringRepeatingSession(this.mCameraInfoInternal.getCameraCharacteristicsCompat());
            }
            addMeteringRepeating();
        } else if (size2 == 1 && size == 1) {
            removeMeteringRepeating();
        } else if (size >= 2) {
            removeMeteringRepeating();
        } else {
            Logger.m32239d("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    private boolean checkAndAttachRepeatingSurface(CaptureConfig.Builder builder) {
        if (!builder.getSurfaces().isEmpty()) {
            Logger.m32245w("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (SessionConfig repeatingCaptureConfig : this.mUseCaseAttachState.getActiveAndAttachedSessionConfigs()) {
            List<DeferrableSurface> surfaces = repeatingCaptureConfig.getRepeatingCaptureConfig().getSurfaces();
            if (!surfaces.isEmpty()) {
                for (DeferrableSurface addSurface : surfaces) {
                    builder.addSurface(addSurface);
                }
            }
        }
        if (!builder.getSurfaces().isEmpty()) {
            return true;
        }
        Logger.m32245w("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    private void clearCameraControlPreviewAspectRatio(Collection<UseCase> collection) {
        for (UseCase useCase : collection) {
            if (useCase instanceof Preview) {
                this.mCameraControlInternal.setPreviewAspectRatio((Rational) null);
                return;
            }
        }
    }

    private void closeInternal() {
        debugLog("Closing camera.");
        int i = C124103.f30938xc2e920ec[this.mState.ordinal()];
        boolean z = false;
        if (i == 2) {
            if (this.mCameraDevice == null) {
                z = true;
            }
            C24361g.m61193w((String) null, z);
            setState(InternalState.INITIALIZED);
        } else if (i == 4) {
            setState(InternalState.CLOSING);
            closeCamera(false);
        } else if (i == 5 || i == 6) {
            boolean cancelScheduledReopen = this.mStateCallback.cancelScheduledReopen();
            setState(InternalState.CLOSING);
            if (cancelScheduledReopen) {
                C24361g.m61193w((String) null, isSessionCloseComplete());
                finishClose();
            }
        } else {
            StringBuilder k = C13555b.m33972k("close() ignored due to being in state: ");
            k.append(this.mState);
            debugLog(k.toString());
        }
    }

    private void configAndClose(boolean z) {
        CaptureSession captureSession = new CaptureSession();
        this.mConfiguringForClose.add(captureSession);
        resetCaptureSession(z);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        C12467l lVar = new C12467l(0, surface, surfaceTexture);
        SessionConfig.Builder builder = new SessionConfig.Builder();
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        builder.addNonRepeatingSurface(immediateSurface);
        builder.setTemplateType(1);
        debugLog("Start configAndClose.");
        SessionConfig build = builder.build();
        CameraDevice cameraDevice = this.mCameraDevice;
        cameraDevice.getClass();
        captureSession.open(build, cameraDevice, this.mCaptureSessionOpenerBuilder.build()).addListener(new C12468m(this, captureSession, immediateSurface, lVar), this.mExecutor);
    }

    private CameraDevice.StateCallback createDeviceStateCallback() {
        ArrayList arrayList = new ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
        arrayList.add(this.mStateCallback);
        return CameraDeviceStateCallbacks.createComboCallback(arrayList);
    }

    public static String getErrorMessage(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    private C18728c<Void> getOrCreateUserReleaseFuture() {
        if (this.mUserReleaseFuture == null) {
            if (this.mState != InternalState.RELEASED) {
                this.mUserReleaseFuture = CallbackToFutureAdapter.m1884a(new C12456e(this));
            } else {
                this.mUserReleaseFuture = Futures.immediateFuture(null);
            }
        }
        return this.mUserReleaseFuture;
    }

    private boolean isLegacyDevice() {
        if (((Camera2CameraInfoImpl) getCameraInfoInternal()).getSupportedHardwareLevel() == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$attachUseCases$11(Collection collection) {
        try {
            tryAttachUseCases(collection);
        } finally {
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$configAndClose$0(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$getOrCreateUserReleaseFuture$4(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        boolean z;
        if (this.mUserReleaseNotifier == null) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("Camera can only be released once, so release completer should be null on creation.", z);
        this.mUserReleaseNotifier = aVar;
        return "Release[camera=" + this + "]";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseActive$5(UseCase useCase) {
        debugLog("Use case " + useCase + " ACTIVE");
        try {
            UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            useCaseAttachState.setUseCaseActive(useCase.getName() + useCase.hashCode(), useCase.getSessionConfig());
            UseCaseAttachState useCaseAttachState2 = this.mUseCaseAttachState;
            useCaseAttachState2.updateUseCase(useCase.getName() + useCase.hashCode(), useCase.getSessionConfig());
            updateCaptureSessionConfig();
        } catch (NullPointerException unused) {
            debugLog("Failed to set already detached use case active");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseInactive$6(UseCase useCase) {
        debugLog("Use case " + useCase + " INACTIVE");
        UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
        useCaseAttachState.setUseCaseInactive(useCase.getName() + useCase.hashCode());
        updateCaptureSessionConfig();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseReset$8(UseCase useCase) {
        debugLog("Use case " + useCase + " RESET");
        UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
        useCaseAttachState.updateUseCase(useCase.getName() + useCase.hashCode(), useCase.getSessionConfig());
        resetCaptureSession(false);
        updateCaptureSessionConfig();
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseUpdated$7(UseCase useCase) {
        debugLog("Use case " + useCase + " UPDATED");
        UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
        useCaseAttachState.updateUseCase(useCase.getName() + useCase.hashCode(), useCase.getSessionConfig());
        updateCaptureSessionConfig();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(CallbackToFutureAdapter.C0673a aVar) {
        Futures.propagate(releaseInternal(), aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$release$3(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mExecutor.execute(new C12469n(this, aVar));
        return "Release[request=" + this.mReleaseRequestCount.getAndIncrement() + "]";
    }

    private void notifyStateAttachedToUseCases(List<UseCase> list) {
        for (UseCase next : list) {
            Set<String> set = this.mNotifyStateAttachedSet;
            if (!set.contains(next.getName() + next.hashCode())) {
                Set<String> set2 = this.mNotifyStateAttachedSet;
                set2.add(next.getName() + next.hashCode());
                next.onStateAttached();
            }
        }
    }

    private void notifyStateDetachedToUseCases(List<UseCase> list) {
        for (UseCase next : list) {
            Set<String> set = this.mNotifyStateAttachedSet;
            if (set.contains(next.getName() + next.hashCode())) {
                next.onStateDetached();
                Set<String> set2 = this.mNotifyStateAttachedSet;
                set2.remove(next.getName() + next.hashCode());
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private void openCameraDevice(boolean z) {
        if (!z) {
            this.mStateCallback.resetReopenMonitor();
        }
        this.mStateCallback.cancelScheduledReopen();
        debugLog("Opening camera.");
        setState(InternalState.OPENING);
        try {
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, createDeviceStateCallback());
        } catch (CameraAccessExceptionCompat e) {
            StringBuilder k = C13555b.m33972k("Unable to open camera due to ");
            k.append(e.getMessage());
            debugLog(k.toString());
            if (e.getReason() == 10001) {
                setState(InternalState.INITIALIZED, CameraState.StateError.create(7, e));
            }
        } catch (SecurityException e2) {
            StringBuilder k2 = C13555b.m33972k("Unable to open camera due to ");
            k2.append(e2.getMessage());
            debugLog(k2.toString());
            setState(InternalState.REOPENING);
            this.mStateCallback.scheduleCameraReopen();
        }
    }

    private void openInternal() {
        int i = C124103.f30938xc2e920ec[this.mState.ordinal()];
        boolean z = true;
        if (i == 1 || i == 2) {
            tryForceOpenCameraDevice();
        } else if (i != 3) {
            StringBuilder k = C13555b.m33972k("open() ignored due to being in state: ");
            k.append(this.mState);
            debugLog(k.toString());
        } else {
            setState(InternalState.REOPENING);
            if (!isSessionCloseComplete() && this.mCameraDeviceError == 0) {
                if (this.mCameraDevice == null) {
                    z = false;
                }
                C24361g.m61193w("Camera Device should be open if session close is not complete", z);
                setState(InternalState.OPENED);
                openCaptureSession();
            }
        }
    }

    private C18728c<Void> releaseInternal() {
        C18728c<Void> orCreateUserReleaseFuture = getOrCreateUserReleaseFuture();
        boolean z = false;
        switch (C124103.f30938xc2e920ec[this.mState.ordinal()]) {
            case 1:
            case 2:
                if (this.mCameraDevice == null) {
                    z = true;
                }
                C24361g.m61193w((String) null, z);
                setState(InternalState.RELEASING);
                C24361g.m61193w((String) null, isSessionCloseComplete());
                finishClose();
                break;
            case 3:
            case 5:
            case 6:
            case 7:
                boolean cancelScheduledReopen = this.mStateCallback.cancelScheduledReopen();
                setState(InternalState.RELEASING);
                if (cancelScheduledReopen) {
                    C24361g.m61193w((String) null, isSessionCloseComplete());
                    finishClose();
                    break;
                }
                break;
            case 4:
                setState(InternalState.RELEASING);
                closeCamera(false);
                break;
            default:
                StringBuilder k = C13555b.m33972k("release() ignored due to being in state: ");
                k.append(this.mState);
                debugLog(k.toString());
                break;
        }
        return orCreateUserReleaseFuture;
    }

    private void removeMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            useCaseAttachState.setUseCaseDetached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            UseCaseAttachState useCaseAttachState2 = this.mUseCaseAttachState;
            useCaseAttachState2.setUseCaseInactive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mMeteringRepeatingSession.clear();
            this.mMeteringRepeatingSession = null;
        }
    }

    private void tryAttachUseCases(Collection<UseCase> collection) {
        boolean isEmpty = this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        for (UseCase next : collection) {
            UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            if (!useCaseAttachState.isUseCaseAttached(next.getName() + next.hashCode())) {
                try {
                    UseCaseAttachState useCaseAttachState2 = this.mUseCaseAttachState;
                    useCaseAttachState2.setUseCaseAttached(next.getName() + next.hashCode(), next.getSessionConfig());
                    arrayList.add(next);
                } catch (NullPointerException unused) {
                    debugLog("Failed to attach a detached use case");
                }
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder k = C13555b.m33972k("Use cases [");
            k.append(TextUtils.join(", ", arrayList));
            k.append("] now ATTACHED");
            debugLog(k.toString());
            if (isEmpty) {
                this.mCameraControlInternal.setActive(true);
                this.mCameraControlInternal.incrementUseCount();
            }
            addOrRemoveMeteringRepeatingUseCase();
            updateCaptureSessionConfig();
            resetCaptureSession(false);
            if (this.mState == InternalState.OPENED) {
                openCaptureSession();
            } else {
                openInternal();
            }
            updateCameraControlPreviewAspectRatio(arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: tryDetachUseCases */
    public void lambda$detachUseCases$12(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        for (UseCase next : collection) {
            UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            if (useCaseAttachState.isUseCaseAttached(next.getName() + next.hashCode())) {
                UseCaseAttachState useCaseAttachState2 = this.mUseCaseAttachState;
                useCaseAttachState2.removeUseCase(next.getName() + next.hashCode());
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder k = C13555b.m33972k("Use cases [");
            k.append(TextUtils.join(", ", arrayList));
            k.append("] now DETACHED for camera");
            debugLog(k.toString());
            clearCameraControlPreviewAspectRatio(arrayList);
            addOrRemoveMeteringRepeatingUseCase();
            if (this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty()) {
                this.mCameraControlInternal.decrementUseCount();
                resetCaptureSession(false);
                this.mCameraControlInternal.setActive(false);
                this.mCaptureSession = new CaptureSession();
                closeInternal();
                return;
            }
            updateCaptureSessionConfig();
            resetCaptureSession(false);
            if (this.mState == InternalState.OPENED) {
                openCaptureSession();
            }
        }
    }

    private void updateCameraControlPreviewAspectRatio(Collection<UseCase> collection) {
        for (UseCase next : collection) {
            if (next instanceof Preview) {
                Size attachedSurfaceResolution = next.getAttachedSurfaceResolution();
                if (attachedSurfaceResolution != null) {
                    this.mCameraControlInternal.setPreviewAspectRatio(new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight()));
                    return;
                }
                return;
            }
        }
    }

    public void attachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.mCameraControlInternal.incrementUseCount();
            notifyStateAttachedToUseCases(new ArrayList(arrayList));
            try {
                this.mExecutor.execute(new C12454d(1, this, arrayList));
            } catch (RejectedExecutionException e) {
                debugLog("Unable to attach use cases.", e);
                this.mCameraControlInternal.decrementUseCount();
            }
        }
    }

    public void closeCamera(boolean z) {
        boolean z2;
        if (this.mState == InternalState.CLOSING || this.mState == InternalState.RELEASING || (this.mState == InternalState.REOPENING && this.mCameraDeviceError != 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder k = C13555b.m33972k("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: ");
        k.append(this.mState);
        k.append(" (error: ");
        k.append(getErrorMessage(this.mCameraDeviceError));
        k.append(")");
        C24361g.m61193w(k.toString(), z2);
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || i >= 29 || !isLegacyDevice() || this.mCameraDeviceError != 0) {
            resetCaptureSession(z);
        } else {
            configAndClose(z);
        }
        this.mCaptureSession.cancelIssuedCaptureRequests();
    }

    public void debugLog(String str) {
        debugLog(str, (Throwable) null);
    }

    public void detachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            notifyStateDetachedToUseCases(new ArrayList(arrayList));
            this.mExecutor.execute(new C12460g(this, arrayList));
        }
    }

    public SessionConfig findSessionConfigForSurface(DeferrableSurface deferrableSurface) {
        for (SessionConfig next : this.mUseCaseAttachState.getAttachedSessionConfigs()) {
            if (next.getSurfaces().contains(deferrableSurface)) {
                return next;
            }
        }
        return null;
    }

    public void finishClose() {
        boolean z;
        if (this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w((String) null, z);
        C24361g.m61193w((String) null, this.mReleasedCaptureSessions.isEmpty());
        this.mCameraDevice = null;
        if (this.mState == InternalState.CLOSING) {
            setState(InternalState.INITIALIZED);
            return;
        }
        this.mCameraManager.unregisterAvailabilityCallback(this.mCameraAvailability);
        setState(InternalState.RELEASED);
        CallbackToFutureAdapter.C0673a<Void> aVar = this.mUserReleaseNotifier;
        if (aVar != null) {
            aVar.mo2697b(null);
            this.mUserReleaseNotifier = null;
        }
    }

    public final /* synthetic */ CameraControl getCameraControl() {
        return C12684e.m32406a(this);
    }

    public CameraControlInternal getCameraControlInternal() {
        return this.mCameraControlInternal;
    }

    public final /* synthetic */ CameraInfo getCameraInfo() {
        return C12684e.m32407b(this);
    }

    public CameraInfoInternal getCameraInfoInternal() {
        return this.mCameraInfoInternal;
    }

    public Observable<CameraInternal.State> getCameraState() {
        return this.mObservableState;
    }

    public boolean isSessionCloseComplete() {
        return this.mReleasedCaptureSessions.isEmpty() && this.mConfiguringForClose.isEmpty();
    }

    public void onUseCaseActive(UseCase useCase) {
        useCase.getClass();
        this.mExecutor.execute(new C12465j(0, this, useCase));
    }

    public void onUseCaseInactive(UseCase useCase) {
        useCase.getClass();
        this.mExecutor.execute(new C12462h(0, this, useCase));
    }

    public void onUseCaseReset(UseCase useCase) {
        useCase.getClass();
        this.mExecutor.execute(new C12466k(0, this, useCase));
    }

    public void onUseCaseUpdated(UseCase useCase) {
        useCase.getClass();
        this.mExecutor.execute(new C12464i(this, useCase));
    }

    public void openCaptureSession() {
        boolean z;
        if (this.mState == InternalState.OPENED) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w((String) null, z);
        SessionConfig.ValidatingBuilder attachedBuilder = this.mUseCaseAttachState.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            debugLog("Unable to create capture session due to conflicting configurations");
            return;
        }
        CaptureSession captureSession = this.mCaptureSession;
        SessionConfig build = attachedBuilder.build();
        CameraDevice cameraDevice = this.mCameraDevice;
        cameraDevice.getClass();
        Futures.addCallback(captureSession.open(build, cameraDevice, this.mCaptureSessionOpenerBuilder.build()), new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
                if (th instanceof DeferrableSurface.SurfaceClosedException) {
                    SessionConfig findSessionConfigForSurface = Camera2CameraImpl.this.findSessionConfigForSurface(((DeferrableSurface.SurfaceClosedException) th).getDeferrableSurface());
                    if (findSessionConfigForSurface != null) {
                        Camera2CameraImpl.this.postSurfaceClosedError(findSessionConfigForSurface);
                    }
                } else if (th instanceof CancellationException) {
                    Camera2CameraImpl.this.debugLog("Unable to configure camera cancelled");
                } else {
                    InternalState internalState = Camera2CameraImpl.this.mState;
                    InternalState internalState2 = InternalState.OPENED;
                    if (internalState == internalState2) {
                        Camera2CameraImpl.this.setState(internalState2, CameraState.StateError.create(4, th));
                    }
                    if (th instanceof CameraAccessException) {
                        Camera2CameraImpl.this.debugLog(C0016g.m32p(th, C13555b.m33972k("Unable to configure camera due to ")));
                    } else if (th instanceof TimeoutException) {
                        StringBuilder k = C13555b.m33972k("Unable to configure camera ");
                        k.append(Camera2CameraImpl.this.mCameraInfoInternal.getCameraId());
                        k.append(", timeout!");
                        Logger.m32241e("Camera2CameraImpl", k.toString());
                    }
                }
            }

            public void onSuccess(Void voidR) {
            }
        }, this.mExecutor);
    }

    public void postSurfaceClosedError(SessionConfig sessionConfig) {
        ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        List<SessionConfig.ErrorListener> errorListeners = sessionConfig.getErrorListeners();
        if (!errorListeners.isEmpty()) {
            debugLog("Posting surface closed", new Throwable());
            mainThreadExecutor.execute(new C12430c(1, errorListeners.get(0), sessionConfig));
        }
    }

    public C18728c<Void> release() {
        return CallbackToFutureAdapter.m1884a(new C12458f(this));
    }

    /* renamed from: releaseNoOpSession */
    public void lambda$configAndClose$1(CaptureSession captureSession, DeferrableSurface deferrableSurface, Runnable runnable) {
        this.mConfiguringForClose.remove(captureSession);
        C18728c<Void> releaseSession = releaseSession(captureSession, false);
        deferrableSurface.close();
        Futures.successfulAsList(Arrays.asList(new C18728c[]{releaseSession, deferrableSurface.getTerminationFuture()})).addListener(runnable, CameraXExecutors.directExecutor());
    }

    public C18728c<Void> releaseSession(final CaptureSession captureSession, boolean z) {
        captureSession.close();
        C18728c<Void> release = captureSession.release(z);
        StringBuilder k = C13555b.m33972k("Releasing session in state ");
        k.append(this.mState.name());
        debugLog(k.toString());
        this.mReleasedCaptureSessions.put(captureSession, release);
        Futures.addCallback(release, new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
            }

            public void onSuccess(Void voidR) {
                CameraDevice cameraDevice;
                Camera2CameraImpl.this.mReleasedCaptureSessions.remove(captureSession);
                int i = C124103.f30938xc2e920ec[Camera2CameraImpl.this.mState.ordinal()];
                if (i != 3) {
                    if (i != 6) {
                        if (i != 7) {
                            return;
                        }
                    } else if (Camera2CameraImpl.this.mCameraDeviceError == 0) {
                        return;
                    }
                }
                if (Camera2CameraImpl.this.isSessionCloseComplete() && (cameraDevice = Camera2CameraImpl.this.mCameraDevice) != null) {
                    cameraDevice.close();
                    Camera2CameraImpl.this.mCameraDevice = null;
                }
            }
        }, CameraXExecutors.directExecutor());
        return release;
    }

    public void resetCaptureSession(boolean z) {
        boolean z2;
        if (this.mCaptureSession != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24361g.m61193w((String) null, z2);
        debugLog("Resetting Capture Session");
        CaptureSession captureSession = this.mCaptureSession;
        SessionConfig sessionConfig = captureSession.getSessionConfig();
        List<CaptureConfig> captureConfigs = captureSession.getCaptureConfigs();
        CaptureSession captureSession2 = new CaptureSession();
        this.mCaptureSession = captureSession2;
        captureSession2.setSessionConfig(sessionConfig);
        this.mCaptureSession.issueCaptureRequests(captureConfigs);
        releaseSession(captureSession, z);
    }

    public void setState(InternalState internalState, CameraState.StateError stateError, boolean z) {
        CameraInternal.State state;
        StringBuilder k = C13555b.m33972k("Transitioning camera internal state: ");
        k.append(this.mState);
        k.append(" --> ");
        k.append(internalState);
        debugLog(k.toString());
        this.mState = internalState;
        switch (C124103.f30938xc2e920ec[internalState.ordinal()]) {
            case 1:
                state = CameraInternal.State.CLOSED;
                break;
            case 2:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 3:
                state = CameraInternal.State.CLOSING;
                break;
            case 4:
                state = CameraInternal.State.OPEN;
                break;
            case 5:
            case 6:
                state = CameraInternal.State.OPENING;
                break;
            case 7:
                state = CameraInternal.State.RELEASING;
                break;
            case 8:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.mCameraStateRegistry.markCameraState(this, state, z);
        this.mObservableState.postValue(state);
        this.mCameraStateMachine.updateState(state, stateError);
    }

    public void submitCaptureRequests(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig next : list) {
            CaptureConfig.Builder from = CaptureConfig.Builder.from(next);
            if (!next.getSurfaces().isEmpty() || !next.isUseRepeatingSurface() || checkAndAttachRepeatingSurface(from)) {
                arrayList.add(from.build());
            }
        }
        debugLog("Issue capture request");
        this.mCaptureSession.issueCaptureRequests(arrayList);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.mCameraInfoInternal.getCameraId()});
    }

    public void tryForceOpenCameraDevice() {
        debugLog("Attempting to force open the camera.");
        if (!this.mCameraStateRegistry.tryOpenCamera(this)) {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
            return;
        }
        openCameraDevice(false);
    }

    public void tryOpenCameraDevice(boolean z) {
        boolean z2;
        debugLog("Attempting to open the camera.");
        if (!this.mCameraAvailability.isCameraAvailable() || !this.mCameraStateRegistry.tryOpenCamera(this)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
            return;
        }
        openCameraDevice(z);
    }

    public void updateCaptureSessionConfig() {
        SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.mUseCaseAttachState.getActiveAndAttachedBuilder();
        if (activeAndAttachedBuilder.isValid()) {
            this.mCameraControlInternal.setTemplate(activeAndAttachedBuilder.build().getTemplateType());
            activeAndAttachedBuilder.add(this.mCameraControlInternal.getSessionConfig());
            this.mCaptureSession.setSessionConfig(activeAndAttachedBuilder.build());
            return;
        }
        this.mCameraControlInternal.resetTemplate();
        this.mCaptureSession.setSessionConfig(this.mCameraControlInternal.getSessionConfig());
    }

    private void debugLog(String str, Throwable th) {
        Logger.m32240d("Camera2CameraImpl", String.format("{%s} %s", new Object[]{toString(), str}), th);
    }

    public void setState(InternalState internalState) {
        setState(internalState, (CameraState.StateError) null);
    }

    public void setState(InternalState internalState, CameraState.StateError stateError) {
        setState(internalState, stateError, true);
    }
}
