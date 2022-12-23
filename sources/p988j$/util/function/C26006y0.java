package p988j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.y0 */
public final /* synthetic */ class C26006y0 implements C25916A0 {

    /* renamed from: a */
    final /* synthetic */ ObjIntConsumer f64682a;

    private /* synthetic */ C26006y0(ObjIntConsumer objIntConsumer) {
        this.f64682a = objIntConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C25916A0 m64859a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof C26008z0 ? ((C26008z0) objIntConsumer).f64684a : new C26006y0(objIntConsumer);
    }

    public final /* synthetic */ void accept(Object obj, int i) {
        this.f64682a.accept(obj, i);
    }
}
