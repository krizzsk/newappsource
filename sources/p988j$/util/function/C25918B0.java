package p988j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.B0 */
public final /* synthetic */ class C25918B0 implements C25922D0 {

    /* renamed from: a */
    final /* synthetic */ ObjLongConsumer f64600a;

    private /* synthetic */ C25918B0(ObjLongConsumer objLongConsumer) {
        this.f64600a = objLongConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C25922D0 m64763a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof C25920C0 ? ((C25920C0) objLongConsumer).f64606a : new C25918B0(objLongConsumer);
    }

    public final /* synthetic */ void accept(Object obj, long j) {
        this.f64600a.accept(obj, j);
    }
}
