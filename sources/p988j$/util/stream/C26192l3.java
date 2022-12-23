package p988j$.util.stream;

import p988j$.util.C25856D;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.l3 */
final class C26192l3 extends C26217q3 implements C25856D {
    C26192l3(C25856D d, long j, long j2) {
        super(d, j, j2);
    }

    C26192l3(C25856D d, long j, long j2, long j3, long j4) {
        super(d, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Spliterator mo84578d(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C26192l3((C25856D) spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Object mo84579e() {
        return new C26187k3(0);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64889d(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64892g(this, consumer);
    }
}
