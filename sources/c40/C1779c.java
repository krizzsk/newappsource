package c40;

import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: c40.c */
public final class C1779c {

    /* renamed from: a */
    public final C1778b f6253a;

    /* renamed from: b */
    public final C1777a f6254b;

    public C1779c(C1778b bVar, C1777a aVar) {
        this.f6253a = bVar;
        this.f6254b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1779c)) {
            return false;
        }
        C1779c cVar = (C1779c) obj;
        if (!C20975x0.m49118e(this.f6253a, cVar.f6253a) || !C20975x0.m49118e(this.f6254b, cVar.f6254b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f6253a), C17884p.m44335F(this.f6254b));
    }
}
