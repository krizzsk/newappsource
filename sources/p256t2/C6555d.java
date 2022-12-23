package p256t2;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import java.util.Map;
import mf0.C24362h;
import p214q.C6120b;
import p256t2.C6552c;

/* renamed from: t2.d */
public final class C6555d {

    /* renamed from: a */
    public final C6556e f20363a;

    /* renamed from: b */
    public final C6552c f20364b = new C6552c();

    /* renamed from: c */
    public boolean f20365c;

    public C6555d(C6556e eVar) {
        this.f20363a = eVar;
    }

    /* renamed from: a */
    public final void mo22667a() {
        boolean z;
        Lifecycle lifecycle = this.f20363a.getLifecycle();
        C24362h.m61210e(lifecycle, "owner.lifecycle");
        if (lifecycle.mo4225b() == Lifecycle.State.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.mo4224a(new Recreator(this.f20363a));
            C6552c cVar = this.f20364b;
            cVar.getClass();
            if (!cVar.f20358b) {
                lifecycle.mo4224a(new C6551b(cVar));
                cVar.f20358b = true;
                this.f20365c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: b */
    public final void mo22668b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f20365c) {
            mo22667a();
        }
        Lifecycle lifecycle = this.f20363a.getLifecycle();
        C24362h.m61210e(lifecycle, "owner.lifecycle");
        if (!lifecycle.mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
            C6552c cVar = this.f20364b;
            if (!cVar.f20358b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!cVar.f20360d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                cVar.f20359c = bundle2;
                cVar.f20360d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            StringBuilder k = C13555b.m33972k("performRestore cannot be called when owner is ");
            k.append(lifecycle.mo4225b());
            throw new IllegalStateException(k.toString().toString());
        }
    }

    /* renamed from: c */
    public final void mo22669c(Bundle bundle) {
        C24362h.m61211f(bundle, "outBundle");
        C6552c cVar = this.f20364b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = cVar.f20359c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C6120b<String, C6552c.C6554b> bVar = cVar.f20357a;
        bVar.getClass();
        C6120b.C6124d dVar = new C6120b.C6124d();
        bVar.f19474d.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C6552c.C6554b) entry.getValue()).mo747a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
