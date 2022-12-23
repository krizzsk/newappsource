package p413co;

import p725pj.C18926a;

/* renamed from: co.r */
public final class C13872r<S> {

    /* renamed from: a */
    public S f34119a;

    /* renamed from: b */
    public C18926a f34120b;

    public C13872r(S s, C18926a aVar) {
        this.f34119a = s;
        this.f34120b = aVar;
    }

    /* renamed from: a */
    public final boolean mo40817a() {
        return this.f34120b != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13872r.class != obj.getClass()) {
            return false;
        }
        C13872r rVar = (C13872r) obj;
        S s = this.f34119a;
        if (s == null ? rVar.f34119a != null : !s.equals(rVar.f34119a)) {
            return false;
        }
        C18926a aVar = this.f34120b;
        C18926a aVar2 = rVar.f34120b;
        if (aVar != null) {
            return aVar.equals(aVar2);
        }
        if (aVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        S s = this.f34119a;
        int i2 = 0;
        if (s != null) {
            i = s.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C18926a aVar = this.f34120b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 + i2;
    }
}
