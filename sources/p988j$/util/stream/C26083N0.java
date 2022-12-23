package p988j$.util.stream;

import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.N0 */
final class C26083N0 extends C26091P0 implements C26028B0 {
    C26083N0(C26028B0 b0, C26028B0 b02) {
        super(b0, b02);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84243j(Integer[] numArr, int i) {
        C26239v0.m65677w0(this, numArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65680z0(this, consumer);
    }

    public final Object newArray(int i) {
        return new int[i];
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65642C0(this, j, j2);
    }

    public final C25864L spliterator() {
        return new C26155e1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65757spliterator() {
        return new C26155e1(this);
    }
}
