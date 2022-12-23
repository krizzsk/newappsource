package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.impl.Camera2ImplConfig;
import com.veriff.sdk.camera.camera2.impl.CameraEventCallbacks;
import com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSession;
import com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import com.veriff.sdk.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import com.veriff.sdk.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.CameraCaptureCallback;
import com.veriff.sdk.camera.core.impl.CaptureConfig;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.SessionConfig;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureChain;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import mf0.C24361g;
import p695od.C18728c;

final class CaptureSession {
    public CameraEventCallbacks mCameraEventCallbacks;
    public volatile Config mCameraEventOnRepeatingOptions;
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;
    private final List<CaptureConfig> mCaptureConfigs;
    private final StateCallback mCaptureSessionStateCallback;
    public List<DeferrableSurface> mConfiguredDeferrableSurfaces;
    private Map<DeferrableSurface, Surface> mConfiguredSurfaceMap;
    public CallbackToFutureAdapter.C0673a<Void> mReleaseCompleter;
    public C18728c<Void> mReleaseFuture;
    public volatile SessionConfig mSessionConfig;
    public State mState;
    public final Object mStateLock;
    public final StillCaptureFlow mStillCaptureFlow;
    public SynchronizedCaptureSession mSynchronizedCaptureSession;
    public SynchronizedCaptureSessionOpener mSynchronizedCaptureSessionOpener;

    /* renamed from: com.veriff.sdk.camera.camera2.internal.CaptureSession$3 */
    public static /* synthetic */ class C124163 {

        /* renamed from: $SwitchMap$com$veriff$sdk$camera$camera2$internal$CaptureSession$State */
        public static final /* synthetic */ int[] f30940x71bbfb93;

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
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State[] r0 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30940x71bbfb93 = r0
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30940x71bbfb93     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30940x71bbfb93     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.GET_SURFACE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30940x71bbfb93     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30940x71bbfb93     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.OPENED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30940x71bbfb93     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30940x71bbfb93     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30940x71bbfb93     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.veriff.sdk.camera.camera2.internal.CaptureSession$State r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.CaptureSession.C124163.<clinit>():void");
        }
    }

    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        public StateCallback() {
        }

        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                switch (C124163.f30940x71bbfb93[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                    case 6:
                    case 7:
                        CaptureSession.this.finishClose();
                        break;
                    case 8:
                        Logger.m32239d("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                Logger.m32241e("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
            }
        }

        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                switch (C124163.f30940x71bbfb93[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                        CaptureSession captureSession = CaptureSession.this;
                        captureSession.mState = State.OPENED;
                        captureSession.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        if (captureSession.mSessionConfig != null) {
                            List<CaptureConfig> onEnableSession = CaptureSession.this.mCameraEventCallbacks.createComboCallback().onEnableSession();
                            if (!onEnableSession.isEmpty()) {
                                CaptureSession captureSession2 = CaptureSession.this;
                                captureSession2.issueBurstCaptureRequest(captureSession2.setupConfiguredSurface(onEnableSession));
                            }
                        }
                        Logger.m32239d("CaptureSession", "Attempting to send capture request onConfigured");
                        CaptureSession.this.issueRepeatingCaptureRequests();
                        CaptureSession.this.issuePendingCaptureRequest();
                        break;
                    case 6:
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        break;
                    case 7:
                        synchronizedCaptureSession.close();
                        break;
                }
                Logger.m32239d("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
            }
        }

        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                if (C124163.f30940x71bbfb93[CaptureSession.this.mState.ordinal()] != 1) {
                    Logger.m32239d("CaptureSession", "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }

        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mStateLock) {
                if (CaptureSession.this.mState != State.UNINITIALIZED) {
                    Logger.m32239d("CaptureSession", "onSessionFinished()");
                    CaptureSession.this.finishClose();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }
    }

    public CaptureSession() {
        this.mStateLock = new Object();
        this.mCaptureConfigs = new ArrayList();
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback(this) {
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            }
        };
        this.mCameraEventOnRepeatingOptions = OptionsBundle.emptyBundle();
        this.mCameraEventCallbacks = CameraEventCallbacks.createEmptyCallback();
        this.mConfiguredSurfaceMap = new HashMap();
        this.mConfiguredDeferrableSurfaces = Collections.emptyList();
        this.mState = State.UNINITIALIZED;
        this.mStillCaptureFlow = new StillCaptureFlow();
        this.mState = State.INITIALIZED;
        this.mCaptureSessionStateCallback = new StateCallback();
    }

    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (CameraCaptureCallback captureCallback : list) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(captureCallback));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback((List<CameraCaptureSession.CaptureCallback>) arrayList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$issueBurstCaptureRequest$2(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.mStateLock) {
            if (this.mState == State.OPENED) {
                issueRepeatingCaptureRequests();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$release$1(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        boolean z;
        String str;
        synchronized (this.mStateLock) {
            if (this.mReleaseCompleter == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("Release completer expected to be null", z);
            this.mReleaseCompleter = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    private static Config mergeOptions(List<CaptureConfig> list) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        for (CaptureConfig implementationOptions : list) {
            Config implementationOptions2 = implementationOptions.getImplementationOptions();
            for (Config.Option next : implementationOptions2.listOptions()) {
                Object retrieveOption = implementationOptions2.retrieveOption(next, null);
                if (create.containsOption(next)) {
                    Object retrieveOption2 = create.retrieveOption(next, null);
                    if (!Objects.equals(retrieveOption2, retrieveOption)) {
                        StringBuilder k = C13555b.m33972k("Detect conflicting option ");
                        k.append(next.getId());
                        k.append(" : ");
                        k.append(retrieveOption);
                        k.append(" != ");
                        k.append(retrieveOption2);
                        Logger.m32239d("CaptureSession", k.toString());
                    }
                } else {
                    create.insertOption(next, retrieveOption);
                }
            }
        }
        return create;
    }

    /* access modifiers changed from: private */
    /* renamed from: openCaptureSession */
    public C18728c<Void> lambda$open$0(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.mStateLock) {
            int i = C124163.f30940x71bbfb93[this.mState.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    this.mConfiguredSurfaceMap.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i2), list.get(i2));
                    }
                    ArrayList arrayList = new ArrayList(new HashSet(list));
                    this.mState = State.OPENING;
                    Logger.m32239d("CaptureSession", "Opening capture session.");
                    SynchronizedCaptureSession.StateCallback createComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                    CameraEventCallbacks cameraEventCallback = new Camera2ImplConfig(sessionConfig.getImplementationOptions()).getCameraEventCallback(CameraEventCallbacks.createEmptyCallback());
                    this.mCameraEventCallbacks = cameraEventCallback;
                    List<CaptureConfig> onPresetSession = cameraEventCallback.createComboCallback().onPresetSession();
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                    for (CaptureConfig implementationOptions : onPresetSession) {
                        from.addImplementationOptions(implementationOptions.getImplementationOptions());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new OutputConfigurationCompat((Surface) it.next()));
                    }
                    SessionConfigurationCompat createSessionConfigurationCompat = this.mSynchronizedCaptureSessionOpener.createSessionConfigurationCompat(0, arrayList2, createComboCallback);
                    try {
                        CaptureRequest buildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(from.build(), cameraDevice);
                        if (buildWithoutTarget != null) {
                            createSessionConfigurationCompat.setSessionParameters(buildWithoutTarget);
                        }
                        C18728c<Void> openCaptureSession = this.mSynchronizedCaptureSessionOpener.openCaptureSession(cameraDevice, createSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                        return openCaptureSession;
                    } catch (CameraAccessException e) {
                        return Futures.immediateFailedFuture(e);
                    }
                } else if (i != 5) {
                    C18728c<Void> immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                    return immediateFailedFuture;
                }
            }
            C18728c<Void> immediateFailedFuture2 = Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
            return immediateFailedFuture2;
        }
    }

    public void cancelIssuedCaptureRequests() {
        if (!this.mCaptureConfigs.isEmpty()) {
            for (CaptureConfig cameraCaptureCallbacks : this.mCaptureConfigs) {
                for (CameraCaptureCallback onCaptureCancelled : cameraCaptureCallbacks.getCameraCaptureCallbacks()) {
                    onCaptureCancelled.onCaptureCancelled();
                }
            }
            this.mCaptureConfigs.clear();
        }
    }

    public void close() {
        synchronized (this.mStateLock) {
            int i = C124163.f30940x71bbfb93[this.mState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.mSessionConfig != null) {
                                    List<CaptureConfig> onDisableSession = this.mCameraEventCallbacks.createComboCallback().onDisableSession();
                                    if (!onDisableSession.isEmpty()) {
                                        try {
                                            issueCaptureRequests(setupConfiguredSurface(onDisableSession));
                                        } catch (IllegalStateException e) {
                                            Logger.m32242e("CaptureSession", "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener = this.mSynchronizedCaptureSessionOpener;
                        C24361g.m61185s(synchronizedCaptureSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                        this.mSynchronizedCaptureSessionOpener.stop();
                        this.mState = State.CLOSED;
                        this.mSessionConfig = null;
                    } else {
                        SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener2 = this.mSynchronizedCaptureSessionOpener;
                        C24361g.m61185s(synchronizedCaptureSessionOpener2, "The Opener shouldn't null in state:" + this.mState);
                        this.mSynchronizedCaptureSessionOpener.stop();
                    }
                }
                this.mState = State.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.mState);
            }
        }
    }

    public void finishClose() {
        State state = this.mState;
        State state2 = State.RELEASED;
        if (state == state2) {
            Logger.m32239d("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = state2;
        this.mSynchronizedCaptureSession = null;
        CallbackToFutureAdapter.C0673a<Void> aVar = this.mReleaseCompleter;
        if (aVar != null) {
            aVar.mo2697b(null);
            this.mReleaseCompleter = null;
        }
    }

    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.mStateLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mStateLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    public void issueBurstCaptureRequest(List<CaptureConfig> list) {
        boolean z;
        if (!list.isEmpty()) {
            try {
                CameraBurstCaptureCallback cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                ArrayList arrayList = new ArrayList();
                Logger.m32239d("CaptureSession", "Issuing capture request.");
                boolean z2 = false;
                for (CaptureConfig next : list) {
                    if (next.getSurfaces().isEmpty()) {
                        Logger.m32239d("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it = next.getSurfaces().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            }
                            DeferrableSurface next2 = it.next();
                            if (!this.mConfiguredSurfaceMap.containsKey(next2)) {
                                Logger.m32239d("CaptureSession", "Skipping capture request with invalid surface: " + next2);
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            if (next.getTemplateType() == 2) {
                                z2 = true;
                            }
                            CaptureConfig.Builder from = CaptureConfig.Builder.from(next);
                            if (this.mSessionConfig != null) {
                                from.addImplementationOptions(this.mSessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                            }
                            from.addImplementationOptions(this.mCameraEventOnRepeatingOptions);
                            from.addImplementationOptions(next.getImplementationOptions());
                            CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                            if (build == null) {
                                Logger.m32239d("CaptureSession", "Skipping issuing request without surface.");
                                return;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (CameraCaptureCallback captureCallback : next.getCameraCaptureCallbacks()) {
                                CaptureCallbackConverter.toCaptureCallback(captureCallback, arrayList2);
                            }
                            cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                            arrayList.add(build);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z2)) {
                        this.mSynchronizedCaptureSession.stopRepeating();
                        cameraBurstCaptureCallback.setCaptureSequenceCallback(new C12472q(this));
                    }
                    this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
                    return;
                }
                Logger.m32239d("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            } catch (CameraAccessException e) {
                StringBuilder k = C13555b.m33972k("Unable to access camera: ");
                k.append(e.getMessage());
                Logger.m32241e("CaptureSession", k.toString());
                Thread.dumpStack();
            }
        }
    }

    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mStateLock) {
            switch (C124163.f30940x71bbfb93[this.mState.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                case 2:
                case 3:
                case 4:
                    this.mCaptureConfigs.addAll(list);
                    break;
                case 5:
                    this.mCaptureConfigs.addAll(list);
                    issuePendingCaptureRequest();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    public void issuePendingCaptureRequest() {
        if (!this.mCaptureConfigs.isEmpty()) {
            try {
                issueBurstCaptureRequest(this.mCaptureConfigs);
            } finally {
                this.mCaptureConfigs.clear();
            }
        }
    }

    public void issueRepeatingCaptureRequests() {
        if (this.mSessionConfig == null) {
            Logger.m32239d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
            return;
        }
        CaptureConfig repeatingCaptureConfig = this.mSessionConfig.getRepeatingCaptureConfig();
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            Logger.m32239d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
            try {
                this.mSynchronizedCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                StringBuilder k = C13555b.m33972k("Unable to access camera: ");
                k.append(e.getMessage());
                Logger.m32241e("CaptureSession", k.toString());
                Thread.dumpStack();
            }
        } else {
            try {
                Logger.m32239d("CaptureSession", "Issuing request for session.");
                CaptureConfig.Builder from = CaptureConfig.Builder.from(repeatingCaptureConfig);
                this.mCameraEventOnRepeatingOptions = mergeOptions(this.mCameraEventCallbacks.createComboCallback().onRepeating());
                from.addImplementationOptions(this.mCameraEventOnRepeatingOptions);
                CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                if (build == null) {
                    Logger.m32239d("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                }
                this.mSynchronizedCaptureSession.setSingleRepeatingRequest(build, createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.mCaptureCallback));
            } catch (CameraAccessException e2) {
                StringBuilder k2 = C13555b.m33972k("Unable to access camera: ");
                k2.append(e2.getMessage());
                Logger.m32241e("CaptureSession", k2.toString());
                Thread.dumpStack();
            }
        }
    }

    public C18728c<Void> open(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener) {
        synchronized (this.mStateLock) {
            if (C124163.f30940x71bbfb93[this.mState.ordinal()] != 2) {
                Logger.m32241e("CaptureSession", "Open not allowed in state: " + this.mState);
                C18728c<Void> immediateFailedFuture = Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
                return immediateFailedFuture;
            }
            this.mState = State.GET_SURFACE;
            ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
            this.mConfiguredDeferrableSurfaces = arrayList;
            this.mSynchronizedCaptureSessionOpener = synchronizedCaptureSessionOpener;
            FutureChain<T> transformAsync = FutureChain.from(synchronizedCaptureSessionOpener.startWithDeferrableSurface(arrayList, InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS)).transformAsync(new C12474s(this, sessionConfig, cameraDevice), this.mSynchronizedCaptureSessionOpener.getExecutor());
            Futures.addCallback(transformAsync, new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    CaptureSession.this.mSynchronizedCaptureSessionOpener.stop();
                    synchronized (CaptureSession.this.mStateLock) {
                        int i = C124163.f30940x71bbfb93[CaptureSession.this.mState.ordinal()];
                        if (i == 4 || i == 6 || i == 7) {
                            if (!(th instanceof CancellationException)) {
                                Logger.m32246w("CaptureSession", "Opening session with fail " + CaptureSession.this.mState, th);
                                CaptureSession.this.finishClose();
                            }
                        }
                    }
                }

                public void onSuccess(Void voidR) {
                }
            }, this.mSynchronizedCaptureSessionOpener.getExecutor());
            C18728c<Void> nonCancellationPropagating = Futures.nonCancellationPropagating(transformAsync);
            return nonCancellationPropagating;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        r3.mState = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.RELEASING;
        r4 = r3.mSynchronizedCaptureSessionOpener;
        mf0.C24361g.m61185s(r4, "The Opener shouldn't null in state:" + r3.mState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r3.mSynchronizedCaptureSessionOpener.stop() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        finishClose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if (r3.mReleaseFuture != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r3.mReleaseFuture = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(new com.veriff.sdk.camera.camera2.internal.C12473r(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r4 = r3.mReleaseFuture;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r3.mState = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.RELEASED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        return com.veriff.sdk.camera.core.impl.utils.futures.Futures.immediateFuture(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p695od.C18728c<java.lang.Void> release(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mStateLock
            monitor-enter(r0)
            int[] r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.C124163.f30940x71bbfb93     // Catch:{ all -> 0x0071 }
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x0071 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0071 }
            r1 = r1[r2]     // Catch:{ all -> 0x0071 }
            switch(r1) {
                case 1: goto L_0x0095;
                case 2: goto L_0x0090;
                case 3: goto L_0x0073;
                case 4: goto L_0x0036;
                case 5: goto L_0x0012;
                case 6: goto L_0x0012;
                case 7: goto L_0x005e;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x0071 }
        L_0x0010:
            goto L_0x00ae
        L_0x0012:
            com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSession r1 = r3.mSynchronizedCaptureSession     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x0024
            r1.abortCaptures()     // Catch:{ CameraAccessException -> 0x001c }
            goto L_0x0024
        L_0x001c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            com.veriff.sdk.camera.core.Logger.m32242e(r1, r2, r4)     // Catch:{ all -> 0x0071 }
        L_0x0024:
            com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSession r4 = r3.mSynchronizedCaptureSession     // Catch:{ all -> 0x0071 }
            r4.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0036
        L_0x002a:
            java.lang.Object r4 = r3.mStateLock     // Catch:{ all -> 0x0071 }
            monitor-enter(r4)     // Catch:{ all -> 0x0071 }
            r3.finishClose()     // Catch:{ all -> 0x0033 }
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            goto L_0x00ae
        L_0x0033:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0036:
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r4 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ all -> 0x0071 }
            r3.mState = r4     // Catch:{ all -> 0x0071 }
            com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x0071 }
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0071 }
            mf0.C24361g.m61185s(r4, r1)     // Catch:{ all -> 0x0071 }
            com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x0071 }
            boolean r4 = r4.stop()     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x005e
            r3.finishClose()     // Catch:{ all -> 0x0071 }
            goto L_0x00ae
        L_0x005e:
            od.c<java.lang.Void> r4 = r3.mReleaseFuture     // Catch:{ all -> 0x0071 }
            if (r4 != 0) goto L_0x006d
            com.veriff.sdk.camera.camera2.internal.r r4 = new com.veriff.sdk.camera.camera2.internal.r     // Catch:{ all -> 0x0071 }
            r4.<init>(r3)     // Catch:{ all -> 0x0071 }
            androidx.concurrent.futures.CallbackToFutureAdapter$c r4 = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(r4)     // Catch:{ all -> 0x0071 }
            r3.mReleaseFuture = r4     // Catch:{ all -> 0x0071 }
        L_0x006d:
            od.c<java.lang.Void> r4 = r3.mReleaseFuture     // Catch:{ all -> 0x0071 }
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return r4
        L_0x0071:
            r4 = move-exception
            goto L_0x00b5
        L_0x0073:
            com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x0071 }
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0071 }
            mf0.C24361g.m61185s(r4, r1)     // Catch:{ all -> 0x0071 }
            com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x0071 }
            r4.stop()     // Catch:{ all -> 0x0071 }
        L_0x0090:
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r4 = com.veriff.sdk.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ all -> 0x0071 }
            r3.mState = r4     // Catch:{ all -> 0x0071 }
            goto L_0x00ae
        L_0x0095:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x0071 }
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r1)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x00ae:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            r4 = 0
            od.c r4 = com.veriff.sdk.camera.core.impl.utils.futures.Futures.immediateFuture(r4)
            return r4
        L_0x00b5:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.CaptureSession.release(boolean):od.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSessionConfig(com.veriff.sdk.camera.core.impl.SessionConfig r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mStateLock
            monitor-enter(r0)
            int[] r1 = com.veriff.sdk.camera.camera2.internal.CaptureSession.C124163.f30940x71bbfb93     // Catch:{ all -> 0x005d }
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x005d }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x005d }
            r1 = r1[r2]     // Catch:{ all -> 0x005d }
            switch(r1) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003f;
                case 4: goto L_0x003f;
                case 5: goto L_0x0019;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x005d }
        L_0x0010:
            goto L_0x005b
        L_0x0011:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x0019:
            r3.mSessionConfig = r4     // Catch:{ all -> 0x005d }
            java.util.Map<com.veriff.sdk.camera.core.impl.DeferrableSurface, android.view.Surface> r1 = r3.mConfiguredSurfaceMap     // Catch:{ all -> 0x005d }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x005d }
            java.util.List r4 = r4.getSurfaces()     // Catch:{ all -> 0x005d }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x005d }
            if (r4 != 0) goto L_0x0034
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Does not have the proper configured lists"
            com.veriff.sdk.camera.core.Logger.m32241e(r4, r1)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x0034:
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Attempting to submit CaptureRequest after setting"
            com.veriff.sdk.camera.core.Logger.m32239d(r4, r1)     // Catch:{ all -> 0x005d }
            r3.issueRepeatingCaptureRequests()     // Catch:{ all -> 0x005d }
            goto L_0x005b
        L_0x003f:
            r3.mSessionConfig = r4     // Catch:{ all -> 0x005d }
            goto L_0x005b
        L_0x0042:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r1.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x005d }
            com.veriff.sdk.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x005d }
            r1.append(r2)     // Catch:{ all -> 0x005d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005d }
            r4.<init>(r1)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x005d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.CaptureSession.setSessionConfig(com.veriff.sdk.camera.core.impl.SessionConfig):void");
    }

    public List<CaptureConfig> setupConfiguredSurface(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig from : list) {
            CaptureConfig.Builder from2 = CaptureConfig.Builder.from(from);
            from2.setTemplateType(1);
            for (DeferrableSurface addSurface : this.mSessionConfig.getRepeatingCaptureConfig().getSurfaces()) {
                from2.addSurface(addSurface);
            }
            arrayList.add(from2.build());
        }
        return arrayList;
    }
}
