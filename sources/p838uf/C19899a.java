package p838uf;

import p001a0.C0016g;

/* renamed from: uf.a */
public final class C19899a extends C19902d {

    /* renamed from: a */
    public final String f50534a;

    /* renamed from: b */
    public final String f50535b;

    public C19899a(String str, String str2) {
        if (str != null) {
            this.f50534a = str;
            if (str2 != null) {
                this.f50535b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: a */
    public final String mo52179a() {
        return this.f50534a;
    }

    /* renamed from: b */
    public final String mo52180b() {
        return this.f50535b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19902d)) {
            return false;
        }
        C19902d dVar = (C19902d) obj;
        if (!this.f50534a.equals(dVar.mo52179a()) || !this.f50535b.equals(dVar.mo52180b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f50534a.hashCode() ^ 1000003) * 1000003) ^ this.f50535b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LibraryVersion{libraryName=");
        k.append(this.f50534a);
        k.append(", version=");
        return C0016g.m31o(k, this.f50535b, "}");
    }
}
