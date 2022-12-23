package p988j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.v0 */
public final /* synthetic */ class C26000v0 implements C26004x0 {

    /* renamed from: a */
    final /* synthetic */ ObjDoubleConsumer f64678a;

    private /* synthetic */ C26000v0(ObjDoubleConsumer objDoubleConsumer) {
        this.f64678a = objDoubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C26004x0 m64855a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof C26002w0 ? ((C26002w0) objDoubleConsumer).f64680a : new C26000v0(objDoubleConsumer);
    }

    public final /* synthetic */ void accept(Object obj, double d) {
        this.f64678a.accept(obj, d);
    }
}
