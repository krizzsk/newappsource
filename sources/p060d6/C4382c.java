package p060d6;

import java.security.MessageDigest;
import p025b6.C1487b;

/* renamed from: d6.c */
public final class C4382c implements C1487b {

    /* renamed from: b */
    public final C1487b f15410b;

    /* renamed from: c */
    public final C1487b f15411c;

    public C4382c(C1487b bVar, C1487b bVar2) {
        this.f15410b = bVar;
        this.f15411c = bVar2;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        this.f15410b.mo5841a(messageDigest);
        this.f15411c.mo5841a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4382c)) {
            return false;
        }
        C4382c cVar = (C4382c) obj;
        if (!this.f15410b.equals(cVar.f15410b) || !this.f15411c.equals(cVar.f15411c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15411c.hashCode() + (this.f15410b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DataCacheKey{sourceKey=");
        k.append(this.f15410b);
        k.append(", signature=");
        k.append(this.f15411c);
        k.append('}');
        return k.toString();
    }
}
