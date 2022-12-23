package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.k1 */
final class C26185k1 extends C26180j1 implements C26254y0 {
    C26185k1(long j) {
        super(j);
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final void accept(long j) {
        int i = this.f64940b;
        long[] jArr = this.f64939a;
        if (i < jArr.length) {
            this.f64940b = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f64939a.length)}));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final C26033C0 build() {
        if (this.f64940b >= this.f64939a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64940b), Integer.valueOf(this.f64939a.length)}));
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j == ((long) this.f64939a.length)) {
            this.f64940b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.f64939a.length)}));
        }
    }

    public final void end() {
        if (this.f64940b < this.f64939a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64940b), Integer.valueOf(this.f64939a.length)}));
        }
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
    }

    public final String toString() {
        return String.format("LongFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f64939a.length - this.f64940b), Arrays.toString(this.f64939a)});
    }
}
