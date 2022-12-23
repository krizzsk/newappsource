package p988j$.util.stream;

import p988j$.util.C25861I;
import p988j$.util.C25864L;
import p988j$.util.C26016n;
import p988j$.util.Spliterators;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.N2 */
final class C26085N2 extends C26093P2 implements C25861I {

    /* renamed from: g */
    final /* synthetic */ C26089O2 f64790g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26085N2(C26089O2 o2, int i, int i2, int i3, int i4) {
        super(o2, i, i2, i3, i4);
        this.f64790g = o2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo84324d(int i, Object obj, Object obj2) {
        ((C25966e0) obj2).accept(((long[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C25864L mo84325e(Object obj, int i, int i2) {
        return Spliterators.m64711k((long[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C25864L mo84326f(int i, int i2, int i3, int i4) {
        return new C26085N2(this.f64790g, i, i2, i3, i4);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64891f(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64894j(this, consumer);
    }
}
