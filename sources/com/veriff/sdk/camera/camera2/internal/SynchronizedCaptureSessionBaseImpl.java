package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSession;
import com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionOpener;
import com.veriff.sdk.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import com.veriff.sdk.camera.camera2.internal.compat.CameraDeviceCompat;
import com.veriff.sdk.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.DeferrableSurfaces;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureCallback;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureChain;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import mf0.C24361g;
import p695od.C18728c;

class SynchronizedCaptureSessionBaseImpl extends SynchronizedCaptureSession.StateCallback implements SynchronizedCaptureSession, SynchronizedCaptureSessionOpener.OpenerImpl {
    public CameraCaptureSessionCompat mCameraCaptureSessionCompat;
    public final CaptureSessionRepository mCaptureSessionRepository;
    public SynchronizedCaptureSession.StateCallback mCaptureSessionStateCallback;
    private boolean mClosed = false;
    public final Handler mCompatHandler;
    public final Executor mExecutor;
    private List<DeferrableSurface> mHeldDeferrableSurfaces = null;
    public final Object mLock = new Object();
    public CallbackToFutureAdapter.C0673a<Void> mOpenCaptureSessionCompleter;
    public C18728c<Void> mOpenCaptureSessionFuture;
    private boolean mOpenerDisabled = false;
    private final ScheduledExecutorService mScheduledExecutorService;
    private boolean mSessionFinished = false;
    private C18728c<List<Surface>> mStartingSurface;

    public SynchronizedCaptureSessionBaseImpl(CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mCompatHandler = handler;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        onSessionFinished(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$3(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionRepository.onCaptureSessionClosed(this);
        onSessionFinished(synchronizedCaptureSession);
        this.mCaptureSessionStateCallback.onClosed(synchronizedCaptureSession);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSessionFinished$4(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onSessionFinished(synchronizedCaptureSession);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$openCaptureSession$0(List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat, CallbackToFutureAdapter.C0673a aVar) throws Exception {
        boolean z;
        String str;
        synchronized (this.mLock) {
            holdDeferrableSurfaces(list);
            if (this.mOpenCaptureSessionCompleter == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("The openCaptureSessionCompleter can only set once!", z);
            this.mOpenCaptureSessionCompleter = aVar;
            cameraDeviceCompat.createCaptureSession(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C18728c lambda$startWithDeferrableSurface$1(List list, List list2) throws Exception {
        Logger.m32239d("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains((Object) null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf((Object) null))));
        }
        if (list2.isEmpty()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return Futures.immediateFuture(list2);
    }

    public void abortCaptures() throws CameraAccessException {
        C24361g.m61185s(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().abortCaptures();
    }

    public int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C24361g.m61185s(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, getExecutor(), captureCallback);
    }

    public void close() {
        C24361g.m61185s(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCaptureSessionRepository.onCaptureSessionClosing(this);
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().close();
        getExecutor().execute(new C12475t(this, 1));
    }

    public void createCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        if (this.mCameraCaptureSessionCompat == null) {
            this.mCameraCaptureSessionCompat = CameraCaptureSessionCompat.toCameraCaptureSessionCompat(cameraCaptureSession, this.mCompatHandler);
        }
    }

    public SessionConfigurationCompat createSessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback) {
        this.mCaptureSessionStateCallback = stateCallback;
        return new SessionConfigurationCompat(i, list, getExecutor(), new CameraCaptureSession.StateCallback() {
            public void onActive(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onActive(synchronizedCaptureSessionBaseImpl);
            }

            public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onCaptureQueueEmpty(synchronizedCaptureSessionBaseImpl);
            }

            public void onClosed(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onClosed(synchronizedCaptureSessionBaseImpl);
            }

            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                CallbackToFutureAdapter.C0673a<Void> aVar;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigureFailed(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C24361g.m61185s(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        aVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    aVar.mo2698c(new IllegalStateException("onConfigureFailed"));
                } catch (Throwable th) {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C24361g.m61185s(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        CallbackToFutureAdapter.C0673a<Void> aVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        aVar2.mo2698c(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            }

            public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                CallbackToFutureAdapter.C0673a<Void> aVar;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigured(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C24361g.m61185s(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        aVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    aVar.mo2697b(null);
                } catch (Throwable th) {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C24361g.m61185s(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        CallbackToFutureAdapter.C0673a<Void> aVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        aVar2.mo2697b(null);
                        throw th;
                    }
                }
            }

            public void onReady(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onReady(synchronizedCaptureSessionBaseImpl);
            }

            public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onSurfacePrepared(synchronizedCaptureSessionBaseImpl, surface);
            }
        });
    }

    public void finishClose() {
        releaseDeferrableSurfaces();
    }

    public CameraDevice getDevice() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat.toCameraCaptureSession().getDevice();
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public SynchronizedCaptureSession.StateCallback getStateCallback() {
        return this;
    }

    public C18728c<Void> getSynchronizedBlocker(String str) {
        return Futures.immediateFuture(null);
    }

    public void holdDeferrableSurfaces(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.mLock) {
            releaseDeferrableSurfaces();
            DeferrableSurfaces.incrementAll(list);
            this.mHeldDeferrableSurfaces = list;
        }
    }

    public boolean isCameraCaptureSessionOpen() {
        boolean z;
        synchronized (this.mLock) {
            if (this.mOpenCaptureSessionFuture != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void onActive(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onActive(synchronizedCaptureSession);
    }

    public void onCaptureQueueEmpty(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onCaptureQueueEmpty(synchronizedCaptureSession);
    }

    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        C18728c<Void> cVar;
        synchronized (this.mLock) {
            try {
                if (!this.mClosed) {
                    this.mClosed = true;
                    C24361g.m61185s(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                    cVar = this.mOpenCaptureSessionFuture;
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        finishClose();
        if (cVar != null) {
            cVar.addListener(new C12465j(1, this, synchronizedCaptureSession), CameraXExecutors.directExecutor());
        }
    }

    public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        finishClose();
        this.mCaptureSessionRepository.onCaptureSessionConfigureFail(this);
        this.mCaptureSessionStateCallback.onConfigureFailed(synchronizedCaptureSession);
    }

    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionRepository.onCaptureSessionCreated(this);
        this.mCaptureSessionStateCallback.onConfigured(synchronizedCaptureSession);
    }

    public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onReady(synchronizedCaptureSession);
    }

    public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
        C18728c<Void> cVar;
        synchronized (this.mLock) {
            try {
                if (!this.mSessionFinished) {
                    this.mSessionFinished = true;
                    C24361g.m61185s(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                    cVar = this.mOpenCaptureSessionFuture;
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (cVar != null) {
            cVar.addListener(new C12462h(1, this, synchronizedCaptureSession), CameraXExecutors.directExecutor());
        }
    }

    public void onSurfacePrepared(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        this.mCaptureSessionStateCallback.onSurfacePrepared(synchronizedCaptureSession, surface);
    }

    public C18728c<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list) {
        synchronized (this.mLock) {
            if (this.mOpenerDisabled) {
                C18728c<Void> immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                return immediateFailedFuture;
            }
            this.mCaptureSessionRepository.onCreateCaptureSession(this);
            CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C12431c0(this, list, CameraDeviceCompat.toCameraDeviceCompat(cameraDevice, this.mCompatHandler), sessionConfigurationCompat));
            this.mOpenCaptureSessionFuture = a;
            Futures.addCallback(a, new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    SynchronizedCaptureSessionBaseImpl.this.finishClose();
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.mCaptureSessionRepository.onCaptureSessionConfigureFail(synchronizedCaptureSessionBaseImpl);
                }

                public void onSuccess(Void voidR) {
                }
            }, CameraXExecutors.directExecutor());
            C18728c<Void> nonCancellationPropagating = Futures.nonCancellationPropagating(this.mOpenCaptureSessionFuture);
            return nonCancellationPropagating;
        }
    }

    public void releaseDeferrableSurfaces() {
        synchronized (this.mLock) {
            List<DeferrableSurface> list = this.mHeldDeferrableSurfaces;
            if (list != null) {
                DeferrableSurfaces.decrementAll(list);
                this.mHeldDeferrableSurfaces = null;
            }
        }
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C24361g.m61185s(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, getExecutor(), captureCallback);
    }

    public C18728c<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j) {
        synchronized (this.mLock) {
            if (this.mOpenerDisabled) {
                C18728c<List<Surface>> immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                return immediateFailedFuture;
            }
            FutureChain<T> transformAsync = FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(list, false, j, getExecutor(), this.mScheduledExecutorService)).transformAsync(new C12429b0(this, list), getExecutor());
            this.mStartingSurface = transformAsync;
            C18728c<List<Surface>> nonCancellationPropagating = Futures.nonCancellationPropagating(transformAsync);
            return nonCancellationPropagating;
        }
    }

    public boolean stop() {
        boolean z;
        C18728c<List<Surface>> cVar = null;
        try {
            synchronized (this.mLock) {
                if (!this.mOpenerDisabled) {
                    C18728c<List<Surface>> cVar2 = this.mStartingSurface;
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.mOpenerDisabled = true;
                }
                if (!isCameraCaptureSessionOpen()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (cVar != null) {
                cVar.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (cVar != null) {
                cVar.cancel(true);
            }
            throw th;
        }
    }

    public void stopRepeating() throws CameraAccessException {
        C24361g.m61185s(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().stopRepeating();
    }

    public CameraCaptureSessionCompat toCameraCaptureSessionCompat() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat;
    }
}
