package com.veriff.sdk.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.FutureChain;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p695od.C18728c;

class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl {
    private final CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() {
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            CallbackToFutureAdapter.C0673a<Void> aVar = SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter;
            if (aVar != null) {
                boolean z = true;
                aVar.f2320d = true;
                CallbackToFutureAdapter.C0675c<T> cVar = aVar.f2318b;
                if (cVar == null || !cVar.f2322c.cancel(true)) {
                    z = false;
                }
                if (z) {
                    aVar.f2317a = null;
                    aVar.f2318b = null;
                    aVar.f2319c = null;
                }
                SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter = null;
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            CallbackToFutureAdapter.C0673a<Void> aVar = SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter;
            if (aVar != null) {
                aVar.mo2697b(null);
                SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter = null;
            }
        }
    };
    private List<DeferrableSurface> mDeferrableSurfaces;
    private final Set<String> mEnabledFeature;
    private boolean mHasSubmittedRepeating;
    private final Object mObjectLock = new Object();
    public C18728c<Void> mOpeningCaptureSession;
    public CallbackToFutureAdapter.C0673a<Void> mStartStreamingCompleter;
    private final C18728c<Void> mStartStreamingFuture;

    public SynchronizedCaptureSessionImpl(Set<String> set, CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.mEnabledFeature = set;
        if (set.contains("wait_for_request")) {
            this.mStartStreamingFuture = CallbackToFutureAdapter.m1884a(new C12455d0(this));
        } else {
            this.mStartStreamingFuture = Futures.immediateFuture(null);
        }
    }

    public static void forceOnClosed(Set<SynchronizedCaptureSession> set) {
        for (SynchronizedCaptureSession next : set) {
            next.getStateCallback().onClosed(next);
        }
    }

    private void forceOnConfigureFailed(Set<SynchronizedCaptureSession> set) {
        for (SynchronizedCaptureSession next : set) {
            next.getStateCallback().onConfigureFailed(next);
        }
    }

    private List<C18728c<Void>> getBlockerFuture(String str, List<SynchronizedCaptureSession> list) {
        ArrayList arrayList = new ArrayList();
        for (SynchronizedCaptureSession synchronizedBlocker : list) {
            arrayList.add(synchronizedBlocker.getSynchronizedBlocker(str));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        debugLog("Session call super.close()");
        super.close();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        this.mStartStreamingCompleter = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C18728c lambda$openCaptureSession$1(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list, List list2) throws Exception {
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    public void close() {
        debugLog("Session call close()");
        if (this.mEnabledFeature.contains("wait_for_request")) {
            synchronized (this.mObjectLock) {
                if (!this.mHasSubmittedRepeating) {
                    this.mStartStreamingFuture.cancel(true);
                }
            }
        }
        this.mStartStreamingFuture.addListener(new C12459f0(this, 0), getExecutor());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void closeConfiguredDeferrableSurfaces() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mObjectLock
            monitor-enter(r0)
            java.util.List<com.veriff.sdk.camera.core.impl.DeferrableSurface> r1 = r3.mDeferrableSurfaces     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "deferrableSurface == null, maybe forceClose, skip close"
            r3.debugLog(r1)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x000e:
            java.util.Set<java.lang.String> r1 = r3.mEnabledFeature     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "deferrableSurface_close"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0033
            java.util.List<com.veriff.sdk.camera.core.impl.DeferrableSurface> r1 = r3.mDeferrableSurfaces     // Catch:{ all -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0035 }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0035 }
            com.veriff.sdk.camera.core.impl.DeferrableSurface r2 = (com.veriff.sdk.camera.core.impl.DeferrableSurface) r2     // Catch:{ all -> 0x0035 }
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x001e
        L_0x002e:
            java.lang.String r1 = "deferrableSurface closed"
            r3.debugLog(r1)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.camera2.internal.SynchronizedCaptureSessionImpl.closeConfiguredDeferrableSurfaces():void");
    }

    public void debugLog(String str) {
        Logger.m32239d("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public C18728c<Void> getSynchronizedBlocker(String str) {
        str.getClass();
        if (!str.equals("wait_for_request")) {
            return super.getSynchronizedBlocker(str);
        }
        return Futures.nonCancellationPropagating(this.mStartStreamingFuture);
    }

    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        closeConfiguredDeferrableSurfaces();
        debugLog("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession next;
        SynchronizedCaptureSession next2;
        debugLog("Session onConfigured()");
        if (this.mEnabledFeature.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it = this.mCaptureSessionRepository.getCreatingCaptureSessions().iterator();
            while (it.hasNext() && (next2 = it.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(next2);
            }
            forceOnConfigureFailed(linkedHashSet);
        }
        super.onConfigured(synchronizedCaptureSession);
        if (this.mEnabledFeature.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it2 = this.mCaptureSessionRepository.getCaptureSessions().iterator();
            while (it2.hasNext() && (next = it2.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(next);
            }
            forceOnClosed(linkedHashSet2);
        }
    }

    public C18728c<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list) {
        C18728c<Void> nonCancellationPropagating;
        synchronized (this.mObjectLock) {
            FutureChain<T> transformAsync = FutureChain.from(Futures.successfulAsList(getBlockerFuture("wait_for_request", this.mCaptureSessionRepository.getClosingCaptureSession()))).transformAsync(new C12457e0(this, cameraDevice, sessionConfigurationCompat, list), CameraXExecutors.directExecutor());
            this.mOpeningCaptureSession = transformAsync;
            nonCancellationPropagating = Futures.nonCancellationPropagating(transformAsync);
        }
        return nonCancellationPropagating;
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        int singleRepeatingRequest;
        if (!this.mEnabledFeature.contains("wait_for_request")) {
            return super.setSingleRepeatingRequest(captureRequest, captureCallback);
        }
        synchronized (this.mObjectLock) {
            this.mHasSubmittedRepeating = true;
            singleRepeatingRequest = super.setSingleRepeatingRequest(captureRequest, Camera2CaptureCallbacks.createComboCallback(this.mCaptureCallback, captureCallback));
        }
        return singleRepeatingRequest;
    }

    public C18728c<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j) {
        C18728c<List<Surface>> nonCancellationPropagating;
        synchronized (this.mObjectLock) {
            this.mDeferrableSurfaces = list;
            nonCancellationPropagating = Futures.nonCancellationPropagating(super.startWithDeferrableSurface(list, j));
        }
        return nonCancellationPropagating;
    }

    public boolean stop() {
        boolean stop;
        synchronized (this.mObjectLock) {
            if (isCameraCaptureSessionOpen()) {
                closeConfiguredDeferrableSurfaces();
            } else {
                C18728c<Void> cVar = this.mOpeningCaptureSession;
                if (cVar != null) {
                    cVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
