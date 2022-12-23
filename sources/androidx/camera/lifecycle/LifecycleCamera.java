package androidx.camera.lifecycle;

import android.os.Build;
import androidx.camera.core.CameraControl;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0574c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import java.util.Collections;
import java.util.List;
import p054d0.C4279f;
import p066e0.C4434j;

final class LifecycleCamera implements C1031o, C4279f {

    /* renamed from: b */
    public final Object f2212b = new Object();

    /* renamed from: c */
    public final C1033p f2213c;

    /* renamed from: d */
    public final CameraUseCaseAdapter f2214d;

    /* renamed from: e */
    public boolean f2215e = false;

    public LifecycleCamera(C1033p pVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f2213c = pVar;
        this.f2214d = cameraUseCaseAdapter;
        if (pVar.getLifecycle().mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.mo2526b();
        } else {
            cameraUseCaseAdapter.mo2529i();
        }
        pVar.getLifecycle().mo4224a(this);
    }

    /* renamed from: a */
    public final List<UseCase> mo2585a() {
        List<UseCase> unmodifiableList;
        synchronized (this.f2212b) {
            unmodifiableList = Collections.unmodifiableList(this.f2214d.mo2530j());
        }
        return unmodifiableList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2586d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2212b
            monitor-enter(r0)
            boolean r1 = r3.f2215e     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0009:
            r1 = 0
            r3.f2215e = r1     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.p r1 = r3.f2213c     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle$State r1 = r1.mo4225b()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.isAtLeast(r2)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            androidx.lifecycle.p r1 = r3.f2213c     // Catch:{ all -> 0x0025 }
            r3.onStart(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCamera.mo2586d():void");
    }

    /* renamed from: g */
    public final void mo2587g(C0574c cVar) {
        CameraUseCaseAdapter cameraUseCaseAdapter = this.f2214d;
        synchronized (cameraUseCaseAdapter.f2075i) {
            if (cVar == null) {
                cVar = C4434j.f15499a;
            }
            if (!cameraUseCaseAdapter.f2072f.isEmpty()) {
                if (!((C4434j.C4435a) cameraUseCaseAdapter.f2074h).f15500x.equals(((C4434j.C4435a) cVar).f15500x)) {
                    throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
                }
            }
            cameraUseCaseAdapter.f2074h = cVar;
            cameraUseCaseAdapter.f2068b.mo2243g(cVar);
        }
    }

    public final CameraControl getCameraControl() {
        return this.f2214d.getCameraControl();
    }

    @C1045x(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(C1033p pVar) {
        synchronized (this.f2212b) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f2214d;
            cameraUseCaseAdapter.mo2532l(cameraUseCaseAdapter.mo2530j());
        }
    }

    @C1045x(Lifecycle.Event.ON_PAUSE)
    public void onPause(C1033p pVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2214d.f2068b.mo2238c(false);
        }
    }

    @C1045x(Lifecycle.Event.ON_RESUME)
    public void onResume(C1033p pVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2214d.f2068b.mo2238c(true);
        }
    }

    @C1045x(Lifecycle.Event.ON_START)
    public void onStart(C1033p pVar) {
        synchronized (this.f2212b) {
            if (!this.f2215e) {
                this.f2214d.mo2526b();
            }
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public void onStop(C1033p pVar) {
        synchronized (this.f2212b) {
            if (!this.f2215e) {
                this.f2214d.mo2529i();
            }
        }
    }
}
