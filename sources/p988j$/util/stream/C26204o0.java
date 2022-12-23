package p988j$.util.stream;

import p988j$.util.function.C25937L;
import p988j$.util.function.C25941N;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.o0 */
final class C26204o0 extends C26219r0 implements C26156e2 {

    /* renamed from: c */
    final /* synthetic */ C26224s0 f64976c;

    /* renamed from: d */
    final /* synthetic */ C25941N f64977d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26204o0(C25941N n, C26224s0 s0Var) {
        super(s0Var);
        this.f64976c = s0Var;
        this.f64977d = n;
    }

    public final void accept(int i) {
        if (!this.f65007a && ((C25937L) this.f64977d).mo84034e(i) == this.f64976c.f65012a) {
            this.f65007a = true;
            this.f65008b = this.f64976c.f65013b;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84323e((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }
}
