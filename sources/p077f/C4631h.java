package p077f;

import p077f.C4626e;
import p088g.C4718a;

/* renamed from: f.h */
public final class C4631h extends C4626e.C4627a {

    /* renamed from: a */
    public final C4718a f15849a;

    /* renamed from: b */
    public final long f15850b;

    public C4631h(C4718a aVar, long j) {
        this.f15849a = aVar;
        this.f15850b = j;
    }

    /* renamed from: a */
    public final C4718a mo20144a() {
        return this.f15849a;
    }

    /* renamed from: b */
    public final long mo20145b() {
        return this.f15850b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4626e.C4627a)) {
            return false;
        }
        C4626e.C4627a aVar = (C4626e.C4627a) obj;
        if (!this.f15849a.equals(aVar.mo20144a()) || this.f15850b != aVar.mo20145b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f15850b;
        return ((this.f15849a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ConnectionPair{connectionClient=");
        k.append(this.f15849a);
        k.append(", connectionId=");
        return C25541a.m63884o(k, this.f15850b, "}");
    }
}
