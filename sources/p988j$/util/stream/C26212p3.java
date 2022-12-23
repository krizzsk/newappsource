package p988j$.util.stream;

import p988j$.util.C25861I;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.p3 */
final class C26212p3 extends C26217q3 implements C25861I {
    C26212p3(C25861I i, long j, long j2) {
        super(i, j, j2);
    }

    C26212p3(C25861I i, long j, long j2, long j3, long j4) {
        super(i, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Spliterator mo84578d(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C26212p3((C25861I) spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Object mo84579e() {
        return new C26207o3(0);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64891f(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64894j(this, consumer);
    }
}
