package p988j$.util.stream;

import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.M0 */
final class C26079M0 extends C26091P0 implements C26023A0 {
    C26079M0(C26023A0 a0, C26023A0 a02) {
        super(a0, a02);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84243j(Double[] dArr, int i) {
        C26239v0.m65676v0(this, dArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65679y0(this, consumer);
    }

    public final Object newArray(int i) {
        return new double[i];
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65641B0(this, j, j2);
    }

    public final C25864L spliterator() {
        return new C26150d1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65756spliterator() {
        return new C26150d1(this);
    }
}
