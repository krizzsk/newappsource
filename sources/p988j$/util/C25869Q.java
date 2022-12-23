package p988j$.util;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.NoSuchElementException;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.Q */
final class C25869Q implements C26019q, C25981m, Iterator {

    /* renamed from: a */
    boolean f64494a = false;

    /* renamed from: b */
    double f64495b;

    /* renamed from: c */
    final /* synthetic */ C25856D f64496c;

    C25869Q(C25856D d) {
        this.f64496c = d;
    }

    public final void accept(double d) {
        this.f64494a = true;
        this.f64495b = d;
    }

    /* renamed from: b */
    public final void forEachRemaining(C25981m mVar) {
        mVar.getClass();
        while (hasNext()) {
            mVar.accept(nextDouble());
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof C25981m) {
            forEachRemaining((C25981m) consumer);
            return;
        }
        consumer.getClass();
        if (!C25883c0.f64528a) {
            forEachRemaining(new C26015m(consumer));
        } else {
            C25883c0.m64722a(C25869Q.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
    }

    public final boolean hasNext() {
        if (!this.f64494a) {
            this.f64496c.mo83820h(this);
        }
        return this.f64494a;
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    public final Double next() {
        if (!C25883c0.f64528a) {
            return Double.valueOf(nextDouble());
        }
        C25883c0.m64722a(C25869Q.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    public final double nextDouble() {
        if (this.f64494a || hasNext()) {
            this.f64494a = false;
            return this.f64495b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
    }
}
