package p205p3;

import androidx.work.WorkerParameters;
import p092g3.C4763k;

/* renamed from: p3.k */
public final class C6047k implements Runnable {

    /* renamed from: b */
    public C4763k f19273b;

    /* renamed from: c */
    public String f19274c;

    /* renamed from: d */
    public WorkerParameters.C1384a f19275d;

    public C6047k(C4763k kVar, String str, WorkerParameters.C1384a aVar) {
        this.f19273b = kVar;
        this.f19274c = str;
        this.f19275d = aVar;
    }

    public final void run() {
        this.f19273b.f16075f.mo20265f(this.f19274c, this.f19275d);
    }
}
