package p988j$.util.stream;

import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.z3 */
public final /* synthetic */ class C26262z3 implements C26166g2 {

    /* renamed from: a */
    public final /* synthetic */ int f65072a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f65073b;

    public /* synthetic */ C26262z3(Consumer consumer, int i) {
        this.f65072a = i;
        this.f65073b = consumer;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f65072a) {
            case 0:
                C26239v0.m65666l0();
                throw null;
            default:
                C26239v0.m65666l0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f65072a) {
            case 0:
                C26239v0.m65673s0();
                throw null;
            default:
                C26239v0.m65673s0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f65072a) {
            case 0:
                C26239v0.m65674t0();
                throw null;
            default:
                C26239v0.m65674t0();
                throw null;
        }
    }

    public final void accept(Object obj) {
        switch (this.f65072a) {
            case 0:
                ((C26100R2) this.f65073b).accept(obj);
                return;
            default:
                this.f65073b.accept(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f65072a) {
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
}
