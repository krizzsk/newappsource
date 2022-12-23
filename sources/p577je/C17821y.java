package p577je;

import p001a0.C0016g;
import p577je.C17785c0;

/* renamed from: je.y */
public final class C17821y extends C17785c0.C17787b {

    /* renamed from: a */
    public final int f45776a;

    /* renamed from: b */
    public final String f45777b;

    /* renamed from: c */
    public final int f45778c;

    /* renamed from: d */
    public final long f45779d;

    /* renamed from: e */
    public final long f45780e;

    /* renamed from: f */
    public final boolean f45781f;

    /* renamed from: g */
    public final int f45782g;

    /* renamed from: h */
    public final String f45783h;

    /* renamed from: i */
    public final String f45784i;

    public C17821y(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f45776a = i;
        if (str != null) {
            this.f45777b = str;
            this.f45778c = i2;
            this.f45779d = j;
            this.f45780e = j2;
            this.f45781f = z;
            this.f45782g = i3;
            if (str2 != null) {
                this.f45783h = str2;
                if (str3 != null) {
                    this.f45784i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    /* renamed from: a */
    public final int mo50312a() {
        return this.f45776a;
    }

    /* renamed from: b */
    public final int mo50313b() {
        return this.f45778c;
    }

    /* renamed from: c */
    public final long mo50314c() {
        return this.f45780e;
    }

    /* renamed from: d */
    public final boolean mo50315d() {
        return this.f45781f;
    }

    /* renamed from: e */
    public final String mo50316e() {
        return this.f45783h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17785c0.C17787b)) {
            return false;
        }
        C17785c0.C17787b bVar = (C17785c0.C17787b) obj;
        if (this.f45776a == bVar.mo50312a() && this.f45777b.equals(bVar.mo50317f()) && this.f45778c == bVar.mo50313b() && this.f45779d == bVar.mo50320i() && this.f45780e == bVar.mo50314c() && this.f45781f == bVar.mo50315d() && this.f45782g == bVar.mo50319h() && this.f45783h.equals(bVar.mo50316e()) && this.f45784i.equals(bVar.mo50318g())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo50317f() {
        return this.f45777b;
    }

    /* renamed from: g */
    public final String mo50318g() {
        return this.f45784i;
    }

    /* renamed from: h */
    public final int mo50319h() {
        return this.f45782g;
    }

    public final int hashCode() {
        int i;
        long j = this.f45779d;
        long j2 = this.f45780e;
        int hashCode = (((((((((this.f45776a ^ 1000003) * 1000003) ^ this.f45777b.hashCode()) * 1000003) ^ this.f45778c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f45781f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f45782g) * 1000003) ^ this.f45783h.hashCode()) * 1000003) ^ this.f45784i.hashCode();
    }

    /* renamed from: i */
    public final long mo50320i() {
        return this.f45779d;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DeviceData{arch=");
        k.append(this.f45776a);
        k.append(", model=");
        k.append(this.f45777b);
        k.append(", availableProcessors=");
        k.append(this.f45778c);
        k.append(", totalRam=");
        k.append(this.f45779d);
        k.append(", diskSpace=");
        k.append(this.f45780e);
        k.append(", isEmulator=");
        k.append(this.f45781f);
        k.append(", state=");
        k.append(this.f45782g);
        k.append(", manufacturer=");
        k.append(this.f45783h);
        k.append(", modelClass=");
        return C0016g.m31o(k, this.f45784i, "}");
    }
}
