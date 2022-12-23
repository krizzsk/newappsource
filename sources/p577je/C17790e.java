package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.e */
public final class C17790e extends C17746a0.C17751d {

    /* renamed from: a */
    public final C17782b0<C17746a0.C17751d.C17752a> f45629a;

    /* renamed from: b */
    public final String f45630b;

    public C17790e() {
        throw null;
    }

    public C17790e(C17782b0 b0Var, String str) {
        this.f45629a = b0Var;
        this.f45630b = str;
    }

    /* renamed from: a */
    public final C17782b0<C17746a0.C17751d.C17752a> mo50189a() {
        return this.f45629a;
    }

    /* renamed from: b */
    public final String mo50190b() {
        return this.f45630b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17751d)) {
            return false;
        }
        C17746a0.C17751d dVar = (C17746a0.C17751d) obj;
        if (this.f45629a.equals(dVar.mo50189a())) {
            String str = this.f45630b;
            if (str == null) {
                if (dVar.mo50190b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo50190b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f45629a.hashCode() ^ 1000003) * 1000003;
        String str = this.f45630b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("FilesPayload{files=");
        k.append(this.f45629a);
        k.append(", orgId=");
        return C0016g.m31o(k, this.f45630b, "}");
    }
}
