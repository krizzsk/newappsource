package c10;

import java.util.concurrent.Callable;

/* renamed from: c10.c */
public final /* synthetic */ class C13742c implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C13743d f33818b;

    /* renamed from: c */
    public final /* synthetic */ long f33819c;

    public /* synthetic */ C13742c(C13743d dVar, long j) {
        this.f33818b = dVar;
        this.f33819c = j;
    }

    public final Object call() {
        C13743d dVar = this.f33818b;
        if (dVar.f33821a.block(this.f33819c)) {
            return dVar.f33822b.getAndSet((Object) null);
        }
        return null;
    }
}
