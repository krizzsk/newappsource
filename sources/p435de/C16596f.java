package p435de;

import com.google.firebase.crashlytics.internal.common.C14450d;
import p531he.C17395e;
import p531he.C17398f;
import p531he.C17410m;
import p531he.C17411n;
import p531he.C17417t;
import p743qd.C19107d;

/* renamed from: de.f */
public final class C16596f {

    /* renamed from: a */
    public final C17417t f43244a;

    public C16596f(C17417t tVar) {
        this.f43244a = tVar;
    }

    /* renamed from: a */
    public static C16596f m42113a() {
        C16596f fVar = (C16596f) C19107d.m46265d().mo51536b(C16596f.class);
        if (fVar != null) {
            return fVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* renamed from: b */
    public final void mo49363b(String str) {
        C17417t tVar = this.f43244a;
        tVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - tVar.f44852d;
        C14450d dVar = tVar.f44855g;
        dVar.f36484e.mo49869a(new C17410m(dVar, currentTimeMillis, str));
    }

    /* renamed from: c */
    public final void mo49364c(Throwable th) {
        if (th != null) {
            C14450d dVar = this.f43244a.f44855g;
            Thread currentThread = Thread.currentThread();
            dVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C17395e eVar = dVar.f36484e;
            C17411n nVar = new C17411n(dVar, currentTimeMillis, th, currentThread);
            eVar.getClass();
            eVar.mo49869a(new C17398f(nVar));
        }
    }
}
