package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.S0 */
final class C26102S0 extends C26098R0 implements C26244w0 {
    C26102S0(long j) {
        super(j);
    }

    public final void accept(double d) {
        int i = this.f64807b;
        double[] dArr = this.f64806a;
        if (i < dArr.length) {
            this.f64807b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f64806a.length)}));
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84151m((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final C26023A0 build() {
        if (this.f64807b >= this.f64806a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64807b), Integer.valueOf(this.f64806a.length)}));
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j == ((long) this.f64806a.length)) {
            this.f64807b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.f64806a.length)}));
        }
    }

    public final void end() {
        if (this.f64807b < this.f64806a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64807b), Integer.valueOf(this.f64806a.length)}));
        }
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo84151m(Double d) {
        C26239v0.m65667m0(this, d);
    }

    public final String toString() {
        return String.format("DoubleFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f64806a.length - this.f64807b), Arrays.toString(this.f64806a)});
    }
}
