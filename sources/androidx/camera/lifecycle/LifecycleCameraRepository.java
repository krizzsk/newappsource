package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mf0.C24361g;

public final class LifecycleCameraRepository {

    /* renamed from: a */
    public final Object f2216a = new Object();

    /* renamed from: b */
    public final HashMap f2217b = new HashMap();

    /* renamed from: c */
    public final HashMap f2218c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque<C1033p> f2219d = new ArrayDeque<>();

    public static class LifecycleCameraRepositoryObserver implements C1031o {

        /* renamed from: b */
        public final LifecycleCameraRepository f2220b;

        /* renamed from: c */
        public final C1033p f2221c;

        public LifecycleCameraRepositoryObserver(C1033p pVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f2221c = pVar;
            this.f2220b = lifecycleCameraRepository;
        }

        @C1045x(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(C1033p pVar) {
            LifecycleCameraRepository lifecycleCameraRepository = this.f2220b;
            synchronized (lifecycleCameraRepository.f2216a) {
                LifecycleCameraRepositoryObserver b = lifecycleCameraRepository.mo2594b(pVar);
                if (b != null) {
                    lifecycleCameraRepository.mo2598f(pVar);
                    for (C0645a remove : (Set) lifecycleCameraRepository.f2218c.get(b)) {
                        lifecycleCameraRepository.f2217b.remove(remove);
                    }
                    lifecycleCameraRepository.f2218c.remove(b);
                    b.f2221c.getLifecycle().mo4226c(b);
                }
            }
        }

        @C1045x(Lifecycle.Event.ON_START)
        public void onStart(C1033p pVar) {
            this.f2220b.mo2597e(pVar);
        }

        @C1045x(Lifecycle.Event.ON_STOP)
        public void onStop(C1033p pVar) {
            this.f2220b.mo2598f(pVar);
        }
    }

    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    public static abstract class C0645a {
        /* renamed from: a */
        public abstract CameraUseCaseAdapter.C0606a mo2604a();

        /* renamed from: b */
        public abstract C1033p mo2605b();
    }

    /* renamed from: a */
    public final void mo2593a(LifecycleCamera lifecycleCamera, List list) {
        boolean z;
        C1033p pVar;
        synchronized (this.f2216a) {
            if (!list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61175n(z);
            synchronized (lifecycleCamera.f2212b) {
                pVar = lifecycleCamera.f2213c;
            }
            for (C0645a aVar : (Set) this.f2218c.get(mo2594b(pVar))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.f2217b.get(aVar);
                lifecycleCamera2.getClass();
                if (!lifecycleCamera2.equals(lifecycleCamera)) {
                    if (!lifecycleCamera2.mo2585a().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.f2214d;
                synchronized (cameraUseCaseAdapter.f2075i) {
                    cameraUseCaseAdapter.f2073g = null;
                }
                synchronized (lifecycleCamera.f2212b) {
                    lifecycleCamera.f2214d.mo2525a(list);
                }
                if (pVar.getLifecycle().mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
                    mo2597e(pVar);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final LifecycleCameraRepositoryObserver mo2594b(C1033p pVar) {
        synchronized (this.f2216a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f2218c.keySet()) {
                if (pVar.equals(lifecycleCameraRepositoryObserver.f2221c)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo2595c(C1033p pVar) {
        synchronized (this.f2216a) {
            LifecycleCameraRepositoryObserver b = mo2594b(pVar);
            if (b == null) {
                return false;
            }
            for (C0645a aVar : (Set) this.f2218c.get(b)) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f2217b.get(aVar);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.mo2585a().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final void mo2596d(LifecycleCamera lifecycleCamera) {
        C1033p pVar;
        Set set;
        synchronized (this.f2216a) {
            synchronized (lifecycleCamera.f2212b) {
                pVar = lifecycleCamera.f2213c;
            }
            C0646a aVar = new C0646a(pVar, lifecycleCamera.f2214d.f2071e);
            LifecycleCameraRepositoryObserver b = mo2594b(pVar);
            if (b != null) {
                set = (Set) this.f2218c.get(b);
            } else {
                set = new HashSet();
            }
            set.add(aVar);
            this.f2217b.put(aVar, lifecycleCamera);
            if (b == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(pVar, this);
                this.f2218c.put(lifecycleCameraRepositoryObserver, set);
                pVar.getLifecycle().mo4224a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: e */
    public final void mo2597e(C1033p pVar) {
        synchronized (this.f2216a) {
            if (mo2595c(pVar)) {
                if (this.f2219d.isEmpty()) {
                    this.f2219d.push(pVar);
                } else {
                    C1033p peek = this.f2219d.peek();
                    if (!pVar.equals(peek)) {
                        mo2599g(peek);
                        this.f2219d.remove(pVar);
                        this.f2219d.push(pVar);
                    }
                }
                mo2600h(pVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo2598f(C1033p pVar) {
        synchronized (this.f2216a) {
            this.f2219d.remove(pVar);
            mo2599g(pVar);
            if (!this.f2219d.isEmpty()) {
                mo2600h(this.f2219d.peek());
            }
        }
    }

    /* renamed from: g */
    public final void mo2599g(C1033p pVar) {
        synchronized (this.f2216a) {
            LifecycleCameraRepositoryObserver b = mo2594b(pVar);
            if (b != null) {
                for (C0645a aVar : (Set) this.f2218c.get(b)) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f2217b.get(aVar);
                    lifecycleCamera.getClass();
                    synchronized (lifecycleCamera.f2212b) {
                        if (!lifecycleCamera.f2215e) {
                            lifecycleCamera.onStop(lifecycleCamera.f2213c);
                            lifecycleCamera.f2215e = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo2600h(C1033p pVar) {
        synchronized (this.f2216a) {
            for (C0645a aVar : (Set) this.f2218c.get(mo2594b(pVar))) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f2217b.get(aVar);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.mo2585a().isEmpty()) {
                    lifecycleCamera.mo2586d();
                }
            }
        }
    }
}
