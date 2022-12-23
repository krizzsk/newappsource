package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C1007f0;
import androidx.lifecycle.C1010h;
import androidx.lifecycle.C1024m0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1034p0;
import androidx.lifecycle.C1035q;
import androidx.lifecycle.C1037q0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import p091g2.C4746a;
import p091g2.C4749c;
import p256t2.C6552c;
import p256t2.C6555d;
import p256t2.C6556e;

/* renamed from: androidx.fragment.app.p0 */
public final class C0958p0 implements C1010h, C6556e, C1037q0 {

    /* renamed from: b */
    public final Fragment f3839b;

    /* renamed from: c */
    public final C1034p0 f3840c;

    /* renamed from: d */
    public C1026n0.C1028b f3841d;

    /* renamed from: e */
    public C1035q f3842e = null;

    /* renamed from: f */
    public C6555d f3843f = null;

    public C0958p0(Fragment fragment, C1034p0 p0Var) {
        this.f3839b = fragment;
        this.f3840c = p0Var;
    }

    /* renamed from: a */
    public final void mo4178a(Lifecycle.Event event) {
        this.f3842e.mo4319f(event);
    }

    /* renamed from: b */
    public final void mo4179b() {
        if (this.f3842e == null) {
            this.f3842e = new C1035q(this);
            C6555d dVar = new C6555d(this);
            this.f3843f = dVar;
            dVar.mo22667a();
            SavedStateHandleSupport.m2850b(this);
        }
    }

    public final C4746a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f3839b.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C4749c cVar = new C4749c();
        if (application != null) {
            cVar.f16032a.put(C1024m0.f3961a, application);
        }
        cVar.f16032a.put(SavedStateHandleSupport.f3897a, this);
        cVar.f16032a.put(SavedStateHandleSupport.f3898b, this);
        if (this.f3839b.getArguments() != null) {
            cVar.f16032a.put(SavedStateHandleSupport.f3899c, this.f3839b.getArguments());
        }
        return cVar;
    }

    public final C1026n0.C1028b getDefaultViewModelProviderFactory() {
        C1026n0.C1028b defaultViewModelProviderFactory = this.f3839b.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f3839b.mDefaultFactory)) {
            this.f3841d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f3841d == null) {
            Application application = null;
            Context context = this.f3839b.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.f3841d = new C1007f0(application, this, this.f3839b.getArguments());
        }
        return this.f3841d;
    }

    public final Lifecycle getLifecycle() {
        mo4179b();
        return this.f3842e;
    }

    public final C6552c getSavedStateRegistry() {
        mo4179b();
        return this.f3843f.f20364b;
    }

    public final C1034p0 getViewModelStore() {
        mo4179b();
        return this.f3840c;
    }
}
