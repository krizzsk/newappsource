package p988j$.util.stream;

import p988j$.util.C25856D;
import p988j$.util.C25864L;
import p988j$.util.C26016n;
import p988j$.util.Spliterators;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.J2 */
final class C26069J2 extends C26093P2 implements C25856D {

    /* renamed from: g */
    final /* synthetic */ C26073K2 f64770g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26069J2(C26073K2 k2, int i, int i2, int i3, int i4) {
        super(k2, i, i2, i3, i4);
        this.f64770g = k2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo84324d(int i, Object obj, Object obj2) {
        ((C25981m) obj2).accept(((double[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C25864L mo84325e(Object obj, int i, int i2) {
        return Spliterators.m64710j((double[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C25864L mo84326f(int i, int i2, int i3, int i4) {
        return new C26069J2(this.f64770g, i, i2, i3, i4);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64889d(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64892g(this, consumer);
    }
}
