package p988j$.util.stream;

import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.W0 */
final class C26118W0 extends C26126Y0 implements C26033C0 {
    C26118W0() {
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo84199b() {
        return C26239v0.f65040f;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84243j(Long[] lArr, int i) {
        C26239v0.m65678x0(this, lArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65640A0(this, consumer);
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65643D0(this, j, j2);
    }

    public final C25864L spliterator() {
        return Spliterators.m64704d();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65764spliterator() {
        return Spliterators.m64704d();
    }
}
