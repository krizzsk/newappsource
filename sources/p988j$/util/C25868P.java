package p988j$.util;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.NoSuchElementException;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.P */
final class C25868P implements C26268y, C25966e0, Iterator {

    /* renamed from: a */
    boolean f64491a = false;

    /* renamed from: b */
    long f64492b;

    /* renamed from: c */
    final /* synthetic */ C25861I f64493c;

    C25868P(C25861I i) {
        this.f64493c = i;
    }

    /* renamed from: a */
    public final void forEachRemaining(C25966e0 e0Var) {
        e0Var.getClass();
        while (hasNext()) {
            e0Var.accept(nextLong());
        }
    }

    public final void accept(long j) {
        this.f64491a = true;
        this.f64492b = j;
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof C25966e0) {
            forEachRemaining((C25966e0) consumer);
            return;
        }
        consumer.getClass();
        if (!C25883c0.f64528a) {
            forEachRemaining(new C26265v(consumer));
        } else {
            C25883c0.m64722a(C25868P.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    public final boolean hasNext() {
        if (!this.f64491a) {
            this.f64493c.mo83849c(this);
        }
        return this.f64491a;
    }

    public final Long next() {
        if (!C25883c0.f64528a) {
            return Long.valueOf(nextLong());
        }
        C25883c0.m64722a(C25868P.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    public final long nextLong() {
        if (this.f64491a || hasNext()) {
            this.f64491a = false;
            return this.f64492b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
    }
}
