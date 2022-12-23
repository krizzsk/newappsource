package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.d */
public final class C17789d extends C17746a0.C17750c {

    /* renamed from: a */
    public final String f45627a;

    /* renamed from: b */
    public final String f45628b;

    public C17789d(String str, String str2) {
        this.f45627a = str;
        this.f45628b = str2;
    }

    /* renamed from: a */
    public final String mo50187a() {
        return this.f45627a;
    }

    /* renamed from: b */
    public final String mo50188b() {
        return this.f45628b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17750c)) {
            return false;
        }
        C17746a0.C17750c cVar = (C17746a0.C17750c) obj;
        if (!this.f45627a.equals(cVar.mo50187a()) || !this.f45628b.equals(cVar.mo50188b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f45627a.hashCode() ^ 1000003) * 1000003) ^ this.f45628b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CustomAttribute{key=");
        k.append(this.f45627a);
        k.append(", value=");
        return C0016g.m31o(k, this.f45628b, "}");
    }
}
