package p867vk;

import java.util.Objects;

/* renamed from: vk.c */
public final class C20146c {

    /* renamed from: a */
    public final long f51131a;

    /* renamed from: b */
    public final String f51132b;

    /* renamed from: c */
    public final C20151h f51133c;

    public C20146c(long j, String str, C20151h hVar) {
        this.f51131a = j;
        this.f51132b = str;
        this.f51133c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20146c.class != obj.getClass()) {
            return false;
        }
        C20146c cVar = (C20146c) obj;
        if (this.f51131a != cVar.f51131a || !this.f51132b.equals(cVar.f51132b) || !this.f51133c.equals(cVar.f51133c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f51131a), this.f51132b, this.f51133c});
    }
}
