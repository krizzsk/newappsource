package com.veriff.sdk.camera.lifecycle;

import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.veriff.sdk.camera.core.Camera;
import com.veriff.sdk.camera.core.CameraControl;
import com.veriff.sdk.camera.core.CameraInfo;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.impl.CameraConfig;
import com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class LifecycleCamera implements C1031o, Camera {
    private final CameraUseCaseAdapter mCameraUseCaseAdapter;
    private final C1033p mLifecycleOwner;
    private final Object mLock = new Object();
    private boolean mReleased = false;
    private boolean mSuspended = false;

    public LifecycleCamera(C1033p pVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.mLifecycleOwner = pVar;
        this.mCameraUseCaseAdapter = cameraUseCaseAdapter;
        if (pVar.getLifecycle().mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        pVar.getLifecycle().mo4224a(this);
    }

    public void bind(Collection<UseCase> collection) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.mLock) {
            this.mCameraUseCaseAdapter.addUseCases(collection);
        }
    }

    public CameraControl getCameraControl() {
        return this.mCameraUseCaseAdapter.getCameraControl();
    }

    public CameraInfo getCameraInfo() {
        return this.mCameraUseCaseAdapter.getCameraInfo();
    }

    public CameraUseCaseAdapter getCameraUseCaseAdapter() {
        return this.mCameraUseCaseAdapter;
    }

    public C1033p getLifecycleOwner() {
        C1033p pVar;
        synchronized (this.mLock) {
            pVar = this.mLifecycleOwner;
        }
        return pVar;
    }

    public List<UseCase> getUseCases() {
        List<UseCase> unmodifiableList;
        synchronized (this.mLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCameraUseCaseAdapter.getUseCases());
        }
        return unmodifiableList;
    }

    public boolean isBound(UseCase useCase) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCameraUseCaseAdapter.getUseCases().contains(useCase);
        }
        return contains;
    }

    @C1045x(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(C1033p pVar) {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @C1045x(Lifecycle.Event.ON_START)
    public void onStart(C1033p pVar) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.attachUseCases();
            }
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public void onStop(C1033p pVar) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.detachUseCases();
            }
        }
    }

    public void setExtendedConfig(CameraConfig cameraConfig) {
        this.mCameraUseCaseAdapter.setExtendedConfig(cameraConfig);
    }

    public void suspend() {
        synchronized (this.mLock) {
            if (!this.mSuspended) {
                onStop(this.mLifecycleOwner);
                this.mSuspended = true;
            }
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unsuspend() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mSuspended     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0009:
            r1 = 0
            r3.mSuspended = r1     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.p r1 = r3.mLifecycleOwner     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle$State r1 = r1.mo4225b()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.isAtLeast(r2)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            androidx.lifecycle.p r1 = r3.mLifecycleOwner     // Catch:{ all -> 0x0025 }
            r3.onStart(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.lifecycle.LifecycleCamera.unsuspend():void");
    }
}
