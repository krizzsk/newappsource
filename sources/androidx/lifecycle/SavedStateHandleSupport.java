package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Arrays;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import p091g2.C4748b;
import p091g2.C4749c;
import p091g2.C4751e;
import p256t2.C6552c;
import p256t2.C6556e;
import sf0.C24855b;

public final class SavedStateHandleSupport {

    /* renamed from: a */
    public static final C0986b f3897a = new C0986b();

    /* renamed from: b */
    public static final C0987c f3898b = new C0987c();

    /* renamed from: c */
    public static final C0985a f3899c = new C0985a();

    /* renamed from: androidx.lifecycle.SavedStateHandleSupport$a */
    public static final class C0985a {
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleSupport$b */
    public static final class C0986b {
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleSupport$c */
    public static final class C0987c {
    }

    /* renamed from: a */
    public static final C1001d0 m2849a(C4749c cVar) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        Bundle bundle;
        C6556e eVar = (C6556e) cVar.f16032a.get(f3897a);
        if (eVar != null) {
            C1037q0 q0Var = (C1037q0) cVar.f16032a.get(f3898b);
            if (q0Var != null) {
                Bundle bundle2 = (Bundle) cVar.f16032a.get(f3899c);
                String str = (String) cVar.f16032a.get(C1032o0.f3968a);
                if (str != null) {
                    C6552c.C6554b b = eVar.getSavedStateRegistry().mo22664b();
                    if (b instanceof SavedStateHandlesProvider) {
                        savedStateHandlesProvider = (SavedStateHandlesProvider) b;
                    } else {
                        savedStateHandlesProvider = null;
                    }
                    if (savedStateHandlesProvider != null) {
                        C1005e0 c = m2851c(q0Var);
                        C1001d0 d0Var = (C1001d0) c.f3931b.get(str);
                        if (d0Var != null) {
                            return d0Var;
                        }
                        Class<? extends Object>[] clsArr = C1001d0.f3923f;
                        boolean z = true;
                        if (!savedStateHandlesProvider.f3902b) {
                            savedStateHandlesProvider.f3903c = savedStateHandlesProvider.f3901a.mo22663a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                            savedStateHandlesProvider.f3902b = true;
                            C1005e0 e0Var = (C1005e0) savedStateHandlesProvider.f3904d.getValue();
                        }
                        Bundle bundle3 = savedStateHandlesProvider.f3903c;
                        if (bundle3 != null) {
                            bundle = bundle3.getBundle(str);
                        } else {
                            bundle = null;
                        }
                        Bundle bundle4 = savedStateHandlesProvider.f3903c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = savedStateHandlesProvider.f3903c;
                        if (bundle5 == null || !bundle5.isEmpty()) {
                            z = false;
                        }
                        if (z) {
                            savedStateHandlesProvider.f3903c = null;
                        }
                        C1001d0 a = C1001d0.C1002a.m2870a(bundle, bundle2);
                        c.f3931b.put(str, a);
                        return a;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: b */
    public static final <T extends C6556e & C1037q0> void m2850b(T t) {
        boolean z;
        C24362h.m61211f(t, "<this>");
        Lifecycle.State b = t.getLifecycle().mo4225b();
        C24362h.m61210e(b, "lifecycle.currentState");
        if (b == Lifecycle.State.INITIALIZED || b == Lifecycle.State.CREATED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t.getSavedStateRegistry().mo22664b() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), (C1037q0) t);
            t.getSavedStateRegistry().mo22665c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            t.getLifecycle().mo4224a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    /* renamed from: c */
    public static final C1005e0 m2851c(C1037q0 q0Var) {
        Class<C1005e0> cls = C1005e0.class;
        C24362h.m61211f(q0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        SavedStateHandleSupport$savedStateHandlesVM$1$1 savedStateHandleSupport$savedStateHandlesVM$1$1 = SavedStateHandleSupport$savedStateHandlesVM$1$1.f3900f;
        C24855b a = C24365j.m61219a(cls);
        C24362h.m61211f(a, "clazz");
        C24362h.m61211f(savedStateHandleSupport$savedStateHandlesVM$1$1, "initializer");
        arrayList.add(new C4751e(C24361g.m61144N(a), savedStateHandleSupport$savedStateHandlesVM$1$1));
        Object[] array = arrayList.toArray(new C4751e[0]);
        if (array != null) {
            C4751e[] eVarArr = (C4751e[]) array;
            return (C1005e0) new C1026n0(q0Var, (C1026n0.C1028b) new C4748b((C4751e[]) Arrays.copyOf(eVarArr, eVarArr.length))).mo4314b(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
