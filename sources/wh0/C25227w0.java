package wh0;

import bf0.C21050d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lf0.C24236l;

/* renamed from: wh0.w0 */
public final class C25227w0 extends C25236z0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63501g = AtomicIntegerFieldUpdater.newUpdater(C25227w0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: f */
    public final C24236l<Throwable, C21050d> f63502f;

    public C25227w0(C24236l<? super Throwable, C21050d> lVar) {
        this.f63502f = lVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo61759q((Throwable) obj);
        return C21050d.f52856a;
    }

    /* renamed from: q */
    public final void mo61759q(Throwable th) {
        if (f63501g.compareAndSet(this, 0, 1)) {
            this.f63502f.invoke(th);
        }
    }
}
