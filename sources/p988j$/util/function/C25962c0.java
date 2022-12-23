package p988j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.c0 */
public final /* synthetic */ class C25962c0 implements C25966e0 {

    /* renamed from: a */
    final /* synthetic */ LongConsumer f64649a;

    private /* synthetic */ C25962c0(LongConsumer longConsumer) {
        this.f64649a = longConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C25966e0 m64807a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C25964d0 ? ((C25964d0) longConsumer).f64651a : new C25962c0(longConsumer);
    }

    public final /* synthetic */ void accept(long j) {
        this.f64649a.accept(j);
    }

    /* renamed from: g */
    public final /* synthetic */ C25966e0 mo83884g(C25966e0 e0Var) {
        return m64807a(this.f64649a.andThen(C25964d0.m64810a(e0Var)));
    }
}
