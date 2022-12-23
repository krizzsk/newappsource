package p531he;

import com.google.firebase.crashlytics.internal.common.C14450d;
import com.google.firebase.crashlytics.internal.common.C14452e;

/* renamed from: he.n */
public final class C17411n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f44836b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f44837c;

    /* renamed from: d */
    public final /* synthetic */ Thread f44838d;

    /* renamed from: e */
    public final /* synthetic */ C14450d f44839e;

    public C17411n(C14450d dVar, long j, Throwable th, Thread thread) {
        this.f44839e = dVar;
        this.f44836b = j;
        this.f44837c = th;
        this.f44838d = thread;
    }

    public final void run() {
        boolean z;
        C14452e eVar = this.f44839e.f36492m;
        if (eVar == null || !eVar.f36502e.get()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            long j = this.f44836b / 1000;
            String d = this.f44839e.mo43336d();
            if (d != null) {
                this.f44839e.f36491l.mo49871d(this.f44837c, this.f44838d, d, "error", j, false);
            }
        }
    }
}
