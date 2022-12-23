package p988j$.util.stream;

import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.O0 */
final class C26087O0 extends C26091P0 implements C26033C0 {
    C26087O0(C26033C0 c0, C26033C0 c02) {
        super(c0, c02);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84243j(Long[] lArr, int i) {
        C26239v0.m65678x0(this, lArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65640A0(this, consumer);
    }

    public final Object newArray(int i) {
        return new long[i];
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65643D0(this, j, j2);
    }

    public final C25864L spliterator() {
        return new C26160f1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65758spliterator() {
        return new C26160f1(this);
    }
}
