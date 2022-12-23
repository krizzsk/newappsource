package wh0;

import bf0.C21050d;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: wh0.v */
public final class C25222v {

    /* renamed from: a */
    public final Object f63496a;

    /* renamed from: b */
    public final C24236l<Throwable, C21050d> f63497b;

    public C25222v(Object obj, C24236l<? super Throwable, C21050d> lVar) {
        this.f63496a = obj;
        this.f63497b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25222v)) {
            return false;
        }
        C25222v vVar = (C25222v) obj;
        return C24362h.m61206a(this.f63496a, vVar.f63496a) && C24362h.m61206a(this.f63497b, vVar.f63497b);
    }

    public final int hashCode() {
        Object obj = this.f63496a;
        return this.f63497b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CompletedWithCancellation(result=");
        k.append(this.f63496a);
        k.append(", onCancellation=");
        k.append(this.f63497b);
        k.append(')');
        return k.toString();
    }
}
