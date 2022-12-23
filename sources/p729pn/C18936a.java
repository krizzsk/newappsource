package p729pn;

import java.util.Objects;
import p657mn.C18405a;

/* renamed from: pn.a */
public final class C18936a {

    /* renamed from: a */
    public final C18405a f48229a;

    /* renamed from: b */
    public final String f48230b;

    public C18936a(C18405a aVar, String str) {
        this.f48229a = aVar;
        this.f48230b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18936a.class != obj.getClass()) {
            return false;
        }
        C18936a aVar = (C18936a) obj;
        if (!this.f48229a.equals(aVar.f48229a) || !this.f48230b.equals(aVar.f48230b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48229a, this.f48230b});
    }
}
