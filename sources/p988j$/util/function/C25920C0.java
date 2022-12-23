package p988j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.C0 */
public final /* synthetic */ class C25920C0 implements ObjLongConsumer {

    /* renamed from: a */
    final /* synthetic */ C25922D0 f64606a;

    private /* synthetic */ C25920C0(C25922D0 d0) {
        this.f64606a = d0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjLongConsumer m64764a(C25922D0 d0) {
        if (d0 == null) {
            return null;
        }
        return d0 instanceof C25918B0 ? ((C25918B0) d0).f64600a : new C25920C0(d0);
    }

    public final /* synthetic */ void accept(Object obj, long j) {
        this.f64606a.accept(obj, j);
    }
}
