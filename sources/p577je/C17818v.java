package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.v */
public final class C17818v extends C17746a0.C17753e.C17779f {

    /* renamed from: a */
    public final String f45766a;

    public C17818v(String str) {
        this.f45766a = str;
    }

    /* renamed from: a */
    public final String mo50269a() {
        return this.f45766a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17746a0.C17753e.C17779f) {
            return this.f45766a.equals(((C17746a0.C17753e.C17779f) obj).mo50269a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f45766a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0016g.m31o(C13555b.m33972k("User{identifier="), this.f45766a, "}");
    }
}
