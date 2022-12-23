package p531he;

import com.google.firebase.crashlytics.internal.common.C14450d;
import com.google.firebase.crashlytics.internal.common.C14452e;
import java.util.concurrent.Callable;
import p555ie.C17580c;

/* renamed from: he.m */
public final class C17410m implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ long f44833b;

    /* renamed from: c */
    public final /* synthetic */ String f44834c;

    /* renamed from: d */
    public final /* synthetic */ C14450d f44835d;

    public C17410m(C14450d dVar, long j, String str) {
        this.f44835d = dVar;
        this.f44833b = j;
        this.f44834c = str;
    }

    public final Object call() throws Exception {
        boolean z;
        C14452e eVar = this.f44835d.f36492m;
        if (eVar == null || !eVar.f36502e.get()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        C17580c cVar = this.f44835d.f36488i;
        cVar.f45209b.mo50032c(this.f44833b, this.f44834c);
        return null;
    }
}
