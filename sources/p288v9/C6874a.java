package p288v9;

import java.util.Arrays;
import p275u9.C6743n;

/* renamed from: v9.a */
public final class C6874a extends C6878e {

    /* renamed from: a */
    public final Iterable<C6743n> f21229a;

    /* renamed from: b */
    public final byte[] f21230b;

    public C6874a() {
        throw null;
    }

    public C6874a(Iterable iterable, byte[] bArr) {
        this.f21229a = iterable;
        this.f21230b = bArr;
    }

    /* renamed from: a */
    public final Iterable<C6743n> mo23125a() {
        return this.f21229a;
    }

    /* renamed from: b */
    public final byte[] mo23126b() {
        return this.f21230b;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6878e)) {
            return false;
        }
        C6878e eVar = (C6878e) obj;
        if (this.f21229a.equals(eVar.mo23125a())) {
            byte[] bArr2 = this.f21230b;
            if (eVar instanceof C6874a) {
                bArr = ((C6874a) eVar).f21230b;
            } else {
                bArr = eVar.mo23126b();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21229a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21230b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BackendRequest{events=");
        k.append(this.f21229a);
        k.append(", extras=");
        k.append(Arrays.toString(this.f21230b));
        k.append("}");
        return k.toString();
    }
}
