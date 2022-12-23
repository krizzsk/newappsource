package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1026n0;
import java.lang.reflect.Constructor;
import mf0.C24362h;
import p091g2.C4749c;
import p256t2.C6552c;
import p256t2.C6556e;

/* renamed from: androidx.lifecycle.f0 */
public final class C1007f0 extends C1026n0.C1030d implements C1026n0.C1028b {

    /* renamed from: a */
    public Application f3932a;

    /* renamed from: b */
    public final C1026n0.C1027a f3933b;

    /* renamed from: c */
    public Bundle f3934c;

    /* renamed from: d */
    public Lifecycle f3935d;

    /* renamed from: e */
    public C6552c f3936e;

    @SuppressLint({"LambdaLast"})
    public C1007f0(Application application, C6556e eVar, Bundle bundle) {
        C1026n0.C1027a aVar;
        C24362h.m61211f(eVar, "owner");
        this.f3936e = eVar.getSavedStateRegistry();
        this.f3935d = eVar.getLifecycle();
        this.f3934c = bundle;
        this.f3932a = application;
        if (application != null) {
            if (C1026n0.C1027a.f3965c == null) {
                C1026n0.C1027a.f3965c = new C1026n0.C1027a(application);
            }
            aVar = C1026n0.C1027a.f3965c;
            C24362h.m61208c(aVar);
        } else {
            aVar = new C1026n0.C1027a((Application) null);
        }
        this.f3933b = aVar;
    }

    /* renamed from: a */
    public final <T extends C1019k0> T mo4064a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4301d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public final C1019k0 mo4065b(Class cls, C4749c cVar) {
        Constructor<T> constructor;
        String str = (String) cVar.f16032a.get(C1032o0.f3968a);
        if (str != null) {
            if (cVar.f16032a.get(SavedStateHandleSupport.f3897a) != null) {
                if (cVar.f16032a.get(SavedStateHandleSupport.f3898b) != null) {
                    Application application = (Application) cVar.f16032a.get(C1024m0.f3961a);
                    boolean isAssignableFrom = C0989a.class.isAssignableFrom(cls);
                    if (!isAssignableFrom || application == null) {
                        constructor = C1009g0.m2877a(cls, C1009g0.f3938b);
                    } else {
                        constructor = C1009g0.m2877a(cls, C1009g0.f3937a);
                    }
                    if (constructor == null) {
                        return this.f3933b.mo4065b(cls, cVar);
                    }
                    if (!isAssignableFrom || application == null) {
                        return C1009g0.m2878b(cls, constructor, SavedStateHandleSupport.m2849a(cVar));
                    }
                    return C1009g0.m2878b(cls, constructor, application, SavedStateHandleSupport.m2849a(cVar));
                }
            }
            if (this.f3935d != null) {
                return mo4301d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    /* renamed from: c */
    public final void mo4300c(C1019k0 k0Var) {
        boolean z;
        Lifecycle lifecycle = this.f3935d;
        if (lifecycle != null) {
            C6552c cVar = this.f3936e;
            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) k0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
            if (savedStateHandleController != null && !z) {
                if (!(z = savedStateHandleController.f3895c)) {
                    savedStateHandleController.f3895c = true;
                    lifecycle.mo4224a(savedStateHandleController);
                    cVar.mo22665c(savedStateHandleController.f3894b, savedStateHandleController.f3896d.f3928e);
                    C1013i.m2880a(lifecycle, cVar);
                    return;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            }
        }
    }

    /* renamed from: d */
    public final C1019k0 mo4301d(Class cls, String str) {
        Constructor<T> constructor;
        T t;
        Application application;
        if (this.f3935d != null) {
            boolean isAssignableFrom = C0989a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f3932a == null) {
                constructor = C1009g0.m2877a(cls, C1009g0.f3938b);
            } else {
                constructor = C1009g0.m2877a(cls, C1009g0.f3937a);
            }
            if (constructor != null) {
                C6552c cVar = this.f3936e;
                Lifecycle lifecycle = this.f3935d;
                Bundle bundle = this.f3934c;
                Bundle a = cVar.mo22663a(str);
                Class<? extends Object>[] clsArr = C1001d0.f3923f;
                C1001d0 a2 = C1001d0.C1002a.m2870a(a, bundle);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(a2, str);
                if (!savedStateHandleController.f3895c) {
                    savedStateHandleController.f3895c = true;
                    lifecycle.mo4224a(savedStateHandleController);
                    cVar.mo22665c(str, a2.f3928e);
                    C1013i.m2880a(lifecycle, cVar);
                    if (!isAssignableFrom || (application = this.f3932a) == null) {
                        t = C1009g0.m2878b(cls, constructor, a2);
                    } else {
                        t = C1009g0.m2878b(cls, constructor, application, a2);
                    }
                    t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                    return t;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            } else if (this.f3932a != null) {
                return this.f3933b.mo4064a(cls);
            } else {
                if (C1026n0.C1029c.f3967a == null) {
                    C1026n0.C1029c.f3967a = new C1026n0.C1029c();
                }
                C1026n0.C1029c cVar2 = C1026n0.C1029c.f3967a;
                C24362h.m61208c(cVar2);
                return cVar2.mo4064a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
