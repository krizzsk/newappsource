package p531he;

import com.android.billingclient.api.C1963s;
import com.google.firebase.crashlytics.internal.common.C14450d;
import java.io.File;
import java.util.concurrent.Callable;
import p648me.C18365c;

/* renamed from: he.u */
public final class C17419u implements Callable<Boolean> {

    /* renamed from: b */
    public final /* synthetic */ C17417t f44864b;

    public C17419u(C17417t tVar) {
        this.f44864b = tVar;
    }

    public final Object call() throws Exception {
        C14450d dVar = this.f44864b.f44855g;
        C1963s sVar = dVar.f36482c;
        C18365c cVar = (C18365c) sVar.f6792b;
        cVar.getClass();
        boolean exists = new File(cVar.f46821b, (String) sVar.f6791a).exists();
        boolean z = true;
        if (!exists) {
            String d = dVar.mo43336d();
            if (d == null || !dVar.f36489j.mo49486d(d)) {
                z = false;
            }
        } else {
            C1963s sVar2 = dVar.f36482c;
            C18365c cVar2 = (C18365c) sVar2.f6792b;
            cVar2.getClass();
            new File(cVar2.f46821b, (String) sVar2.f6791a).delete();
        }
        return Boolean.valueOf(z);
    }
}
