package com.veriff.sdk.camera.core.impl;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.CameraUnavailableException;
import com.veriff.sdk.camera.core.InitializationException;
import com.veriff.sdk.camera.core.Logger;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p695od.C18728c;

public final class CameraRepository {
    private final Map<String, CameraInternal> mCameras = new LinkedHashMap();
    private final Object mCamerasLock = new Object();
    private CallbackToFutureAdapter.C0673a<Void> mDeinitCompleter;
    private C18728c<Void> mDeinitFuture;
    private final Set<CameraInternal> mReleasingCameras = new HashSet();

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$deinit$0(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        synchronized (this.mCamerasLock) {
            this.mDeinitCompleter = aVar;
        }
        return "CameraRepository-deinit";
    }

    /* access modifiers changed from: private */
    public void lambda$deinit$1(CameraInternal cameraInternal) {
        synchronized (this.mCamerasLock) {
            this.mReleasingCameras.remove(cameraInternal);
            if (this.mReleasingCameras.isEmpty()) {
                this.mDeinitCompleter.getClass();
                this.mDeinitCompleter.mo2697b(null);
                this.mDeinitCompleter = null;
                this.mDeinitFuture = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p695od.C18728c<java.lang.Void> deinit() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.mCamerasLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.veriff.sdk.camera.core.impl.CameraInternal> r1 = r7.mCameras     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0016
            od.c<java.lang.Void> r1 = r7.mDeinitFuture     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0014
            r1 = 0
            od.c r1 = com.veriff.sdk.camera.core.impl.utils.futures.Futures.immediateFuture(r1)     // Catch:{ all -> 0x0062 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return r1
        L_0x0016:
            od.c<java.lang.Void> r1 = r7.mDeinitFuture     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0027
            au.e r1 = new au.e     // Catch:{ all -> 0x0062 }
            r2 = 19
            r1.<init>(r7, r2)     // Catch:{ all -> 0x0062 }
            androidx.concurrent.futures.CallbackToFutureAdapter$c r1 = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(r1)     // Catch:{ all -> 0x0062 }
            r7.mDeinitFuture = r1     // Catch:{ all -> 0x0062 }
        L_0x0027:
            java.util.Set<com.veriff.sdk.camera.core.impl.CameraInternal> r2 = r7.mReleasingCameras     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, com.veriff.sdk.camera.core.impl.CameraInternal> r3 = r7.mCameras     // Catch:{ all -> 0x0062 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0062 }
            r2.addAll(r3)     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, com.veriff.sdk.camera.core.impl.CameraInternal> r2 = r7.mCameras     // Catch:{ all -> 0x0062 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0062 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0062 }
        L_0x003c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0062 }
            com.veriff.sdk.camera.core.impl.CameraInternal r3 = (com.veriff.sdk.camera.core.impl.CameraInternal) r3     // Catch:{ all -> 0x0062 }
            od.c r4 = r3.release()     // Catch:{ all -> 0x0062 }
            y.m r5 = new y.m     // Catch:{ all -> 0x0062 }
            r6 = 10
            r5.<init>(r6, r7, r3)     // Catch:{ all -> 0x0062 }
            java.util.concurrent.Executor r3 = com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch:{ all -> 0x0062 }
            r4.addListener(r5, r3)     // Catch:{ all -> 0x0062 }
            goto L_0x003c
        L_0x005b:
            java.util.Map<java.lang.String, com.veriff.sdk.camera.core.impl.CameraInternal> r2 = r7.mCameras     // Catch:{ all -> 0x0062 }
            r2.clear()     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return r1
        L_0x0062:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.impl.CameraRepository.deinit():od.c");
    }

    public LinkedHashSet<CameraInternal> getCameras() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet<>(this.mCameras.values());
        }
        return linkedHashSet;
    }

    public void init(CameraFactory cameraFactory) throws InitializationException {
        synchronized (this.mCamerasLock) {
            try {
                for (String next : cameraFactory.getAvailableCameraIds()) {
                    Logger.m32239d("CameraRepository", "Added camera: " + next);
                    this.mCameras.put(next, cameraFactory.getCamera(next));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
