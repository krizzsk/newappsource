package p988j$.util.stream;

import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.V0 */
final class C26114V0 extends C26126Y0 implements C26028B0 {
    C26114V0() {
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo84199b() {
        return C26239v0.f65039e;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84243j(Integer[] numArr, int i) {
        C26239v0.m65677w0(this, numArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65680z0(this, consumer);
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65642C0(this, j, j2);
    }

    public final C25864L spliterator() {
        return Spliterators.m64703c();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65763spliterator() {
        return Spliterators.m64703c();
    }
}
