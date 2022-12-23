package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.K0 */
final class C26071K0 extends C26075L0 {

    /* renamed from: k */
    public static final /* synthetic */ int f64771k = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26071K0(int i, Spliterator spliterator, C26239v0 v0Var) {
        super(v0Var, spliterator, new C26138b(29), new C26067J0(0));
        if (i == 1) {
            super(v0Var, spliterator, new C26067J0(1), new C26067J0(2));
        } else if (i != 2) {
        } else {
            super(v0Var, spliterator, new C26067J0(3), new C26067J0(4));
        }
    }

    public /* synthetic */ C26071K0(Spliterator spliterator, IntFunction intFunction, C26239v0 v0Var) {
        super(v0Var, spliterator, new C26133a(2, intFunction), new C26067J0(5));
    }
}
