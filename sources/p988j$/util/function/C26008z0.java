package p988j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.z0 */
public final /* synthetic */ class C26008z0 implements ObjIntConsumer {

    /* renamed from: a */
    final /* synthetic */ C25916A0 f64684a;

    private /* synthetic */ C26008z0(C25916A0 a0) {
        this.f64684a = a0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjIntConsumer m64864a(C25916A0 a0) {
        if (a0 == null) {
            return null;
        }
        return a0 instanceof C26006y0 ? ((C26006y0) a0).f64682a : new C26008z0(a0);
    }

    public final /* synthetic */ void accept(Object obj, int i) {
        this.f64684a.accept(obj, i);
    }
}
