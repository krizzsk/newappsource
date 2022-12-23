package p298w6;

import java.security.MessageDigest;
import p025b6.C1487b;
import p584jl.C17885a;

/* renamed from: w6.d */
public final class C7000d implements C1487b {

    /* renamed from: b */
    public final Object f21777b;

    public C7000d(Object obj) {
        C17885a.m44458r(obj);
        this.f21777b = obj;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(this.f21777b.toString().getBytes(C1487b.f5389a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7000d) {
            return this.f21777b.equals(((C7000d) obj).f21777b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21777b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ObjectKey{object=");
        k.append(this.f21777b);
        k.append('}');
        return k.toString();
    }
}
