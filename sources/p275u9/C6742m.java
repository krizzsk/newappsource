package p275u9;

import java.util.Arrays;
import p237r9.C6269b;

/* renamed from: u9.m */
public final class C6742m {

    /* renamed from: a */
    public final C6269b f20874a;

    /* renamed from: b */
    public final byte[] f20875b;

    public C6742m(C6269b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f20874a = bVar;
            this.f20875b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6742m)) {
            return false;
        }
        C6742m mVar = (C6742m) obj;
        if (!this.f20874a.equals(mVar.f20874a)) {
            return false;
        }
        return Arrays.equals(this.f20875b, mVar.f20875b);
    }

    public final int hashCode() {
        return ((this.f20874a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20875b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("EncodedPayload{encoding=");
        k.append(this.f20874a);
        k.append(", bytes=[...]}");
        return k.toString();
    }
}
