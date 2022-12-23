package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.Z0 */
final class C26130Z0 extends C26058H0 implements C26259z0 {
    C26130Z0(long j, IntFunction intFunction) {
        super(j, intFunction);
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final void accept(Object obj) {
        int i = this.f64748b;
        Object[] objArr = this.f64747a;
        if (i < objArr.length) {
            this.f64748b = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f64747a.length)}));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final C26043E0 build() {
        if (this.f64748b >= this.f64747a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64748b), Integer.valueOf(this.f64747a.length)}));
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j == ((long) this.f64747a.length)) {
            this.f64748b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.f64747a.length)}));
        }
    }

    public final void end() {
        if (this.f64748b < this.f64747a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64748b), Integer.valueOf(this.f64747a.length)}));
        }
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final String toString() {
        return String.format("FixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f64747a.length - this.f64748b), Arrays.toString(this.f64747a)});
    }
}
