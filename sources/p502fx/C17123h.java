package p502fx;

import c00.C13717b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p684nq.C18583d;

/* renamed from: fx.h */
public final class C17123h {

    /* renamed from: a */
    public final List<C17124i> f44325a;

    /* renamed from: b */
    public final int f44326b;

    public C17123h(ArrayList arrayList) {
        this.f44325a = Collections.unmodifiableList(arrayList);
        this.f44326b = C13717b.m34257d(arrayList, new C18583d(6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17123h)) {
            return false;
        }
        return this.f44325a.equals(((C17123h) obj).f44325a);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f44325a);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRideRoute{wayPoints=");
        k.append(this.f44325a);
        k.append(", wayPointIndex=");
        return C16530d.m42014g(k, this.f44326b, '}');
    }
}
