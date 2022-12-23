package p988j$.util.stream;

import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.e3 */
public final /* synthetic */ class C26157e3 implements C26151d2 {

    /* renamed from: a */
    public final /* synthetic */ int f64910a;

    /* renamed from: b */
    public final /* synthetic */ C25981m f64911b;

    public /* synthetic */ C26157e3(C25981m mVar, int i) {
        this.f64910a = i;
        this.f64911b = mVar;
    }

    public final void accept(double d) {
        switch (this.f64910a) {
            case 0:
                ((C26073K2) this.f64911b).accept(d);
                return;
            default:
                this.f64911b.accept(d);
                return;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f64910a) {
            case 0:
                C26239v0.m65673s0();
                throw null;
            default:
                C26239v0.m65673s0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f64910a) {
            case 0:
                C26239v0.m65674t0();
                throw null;
            default:
                C26239v0.m65674t0();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f64910a) {
            case 0:
                mo84151m((Double) obj);
                return;
            default:
                mo84151m((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f64910a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo84147d(long j) {
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        switch (this.f64910a) {
            case 0:
                mVar.getClass();
                return new C25975j(this, mVar);
            default:
                mVar.getClass();
                return new C25975j(this, mVar);
        }
    }

    /* renamed from: m */
    public final /* synthetic */ void mo84151m(Double d) {
        switch (this.f64910a) {
            case 0:
                C26239v0.m65667m0(this, d);
                return;
            default:
                C26239v0.m65667m0(this, d);
                return;
        }
    }
}
