package wh0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: wh0.u */
public class C25219u {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63492b = AtomicIntegerFieldUpdater.newUpdater(C25219u.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f63493a;

    public C25219u(Throwable th, boolean z) {
        this.f63493a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo61860a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f63493a + ']';
    }
}
