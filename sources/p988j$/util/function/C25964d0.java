package p988j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.d0 */
public final /* synthetic */ class C25964d0 implements LongConsumer {

    /* renamed from: a */
    final /* synthetic */ C25966e0 f64651a;

    private /* synthetic */ C25964d0(C25966e0 e0Var) {
        this.f64651a = e0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongConsumer m64810a(C25966e0 e0Var) {
        if (e0Var == null) {
            return null;
        }
        return e0Var instanceof C25962c0 ? ((C25962c0) e0Var).f64649a : new C25964d0(e0Var);
    }

    public final /* synthetic */ void accept(long j) {
        this.f64651a.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return m64810a(this.f64651a.mo83884g(C25962c0.m64807a(longConsumer)));
    }
}
