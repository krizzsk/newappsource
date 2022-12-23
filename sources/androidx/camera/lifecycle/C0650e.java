package androidx.camera.lifecycle;

import androidx.camera.core.CameraX;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0574c;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mf0.C24361g;
import p054d0.C4279f;
import p054d0.C4286i;
import p054d0.C4290k;
import p054d0.C4292l;
import p066e0.C4432i;
import p066e0.C4437k;
import p066e0.C4458v;
import p102h0.C5023g;
import p102h0.C5028j;
import p583jk.C17884p;

/* renamed from: androidx.camera.lifecycle.e */
public final class C0650e implements C4290k {

    /* renamed from: f */
    public static final C0650e f2228f = new C0650e();

    /* renamed from: a */
    public final Object f2229a = new Object();

    /* renamed from: b */
    public CallbackToFutureAdapter.C0675c f2230b;

    /* renamed from: c */
    public C5028j.C5031c f2231c = C5023g.m12857e((Object) null);

    /* renamed from: d */
    public final LifecycleCameraRepository f2232d = new LifecycleCameraRepository();

    /* renamed from: e */
    public CameraX f2233e;

    /* renamed from: a */
    public final C4279f mo2609a(C1033p pVar, C4292l lVar, UseCase... useCaseArr) {
        LifecycleCamera lifecycleCamera;
        Collection<LifecycleCamera> unmodifiableCollection;
        LifecycleCamera lifecycleCamera2;
        boolean contains;
        C17884p.m44372k();
        LinkedHashSet linkedHashSet = new LinkedHashSet(lVar.f15215a);
        boolean z = false;
        for (UseCase useCase : useCaseArr) {
            C4292l q = useCase.f1865f.mo2498q();
            if (q != null) {
                Iterator<C4286i> it = q.f15215a.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
            }
        }
        LinkedHashSet<CameraInternal> a = new C4292l(linkedHashSet).mo19814a(this.f2233e.f1828a.mo19983a());
        if (!a.isEmpty()) {
            CameraUseCaseAdapter.C0606a aVar = new CameraUseCaseAdapter.C0606a(a);
            LifecycleCameraRepository lifecycleCameraRepository = this.f2232d;
            synchronized (lifecycleCameraRepository.f2216a) {
                lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f2217b.get(new C0646a(pVar, aVar));
            }
            LifecycleCameraRepository lifecycleCameraRepository2 = this.f2232d;
            synchronized (lifecycleCameraRepository2.f2216a) {
                unmodifiableCollection = Collections.unmodifiableCollection(lifecycleCameraRepository2.f2217b.values());
            }
            for (UseCase useCase2 : useCaseArr) {
                for (LifecycleCamera lifecycleCamera3 : unmodifiableCollection) {
                    synchronized (lifecycleCamera3.f2212b) {
                        contains = ((ArrayList) lifecycleCamera3.f2214d.mo2530j()).contains(useCase2);
                    }
                    if (contains && lifecycleCamera3 != lifecycleCamera) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{useCase2}));
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository3 = this.f2232d;
                CameraX cameraX = this.f2233e;
                C4437k kVar = cameraX.f1834g;
                if (kVar != null) {
                    UseCaseConfigFactory useCaseConfigFactory = cameraX.f1835h;
                    if (useCaseConfigFactory != null) {
                        CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(a, kVar, useCaseConfigFactory);
                        synchronized (lifecycleCameraRepository3.f2216a) {
                            if (lifecycleCameraRepository3.f2217b.get(new C0646a(pVar, cameraUseCaseAdapter.f2071e)) == null) {
                                z = true;
                            }
                            C24361g.m61177o(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                            if (pVar.getLifecycle().mo4225b() != Lifecycle.State.DESTROYED) {
                                lifecycleCamera2 = new LifecycleCamera(pVar, cameraUseCaseAdapter);
                                if (((ArrayList) cameraUseCaseAdapter.mo2530j()).isEmpty()) {
                                    synchronized (lifecycleCamera2.f2212b) {
                                        if (!lifecycleCamera2.f2215e) {
                                            lifecycleCamera2.onStop(pVar);
                                            lifecycleCamera2.f2215e = true;
                                        }
                                    }
                                }
                                lifecycleCameraRepository3.mo2596d(lifecycleCamera2);
                            } else {
                                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                            }
                        }
                        lifecycleCamera = lifecycleCamera2;
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Iterator<C4286i> it2 = lVar.f15215a.iterator();
            while (it2.hasNext()) {
                C4286i next = it2.next();
                if (next.getIdentifier() != C4286i.f15209a) {
                    C4432i a2 = C4458v.m11668a(next.getIdentifier());
                    lifecycleCamera.f2214d.f2068b.getCameraInfoInternal();
                    a2.getConfig();
                }
            }
            lifecycleCamera.mo2587g((C0574c) null);
            if (useCaseArr.length != 0) {
                this.f2232d.mo2593a(lifecycleCamera, Arrays.asList(useCaseArr));
            }
            return lifecycleCamera;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    /* renamed from: b */
    public final void mo2610b() {
        C1033p pVar;
        C17884p.m44372k();
        LifecycleCameraRepository lifecycleCameraRepository = this.f2232d;
        synchronized (lifecycleCameraRepository.f2216a) {
            for (LifecycleCameraRepository.C0645a aVar : lifecycleCameraRepository.f2217b.keySet()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f2217b.get(aVar);
                synchronized (lifecycleCamera.f2212b) {
                    CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.f2214d;
                    cameraUseCaseAdapter.mo2532l(cameraUseCaseAdapter.mo2530j());
                }
                synchronized (lifecycleCamera.f2212b) {
                    pVar = lifecycleCamera.f2213c;
                }
                lifecycleCameraRepository.mo2598f(pVar);
            }
        }
    }
}
