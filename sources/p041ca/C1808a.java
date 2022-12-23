package p041ca;

import p358af.C13437d;

/* renamed from: ca.a */
public final class C1808a extends C1816e {

    /* renamed from: b */
    public final long f6303b;

    /* renamed from: c */
    public final int f6304c;

    /* renamed from: d */
    public final int f6305d;

    /* renamed from: e */
    public final long f6306e;

    /* renamed from: f */
    public final int f6307f;

    public C1808a(long j, int i, int i2, long j2, int i3) {
        this.f6303b = j;
        this.f6304c = i;
        this.f6305d = i2;
        this.f6306e = j2;
        this.f6307f = i3;
    }

    /* renamed from: a */
    public final int mo6622a() {
        return this.f6305d;
    }

    /* renamed from: b */
    public final long mo6623b() {
        return this.f6306e;
    }

    /* renamed from: c */
    public final int mo6624c() {
        return this.f6304c;
    }

    /* renamed from: d */
    public final int mo6625d() {
        return this.f6307f;
    }

    /* renamed from: e */
    public final long mo6626e() {
        return this.f6303b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1816e)) {
            return false;
        }
        C1816e eVar = (C1816e) obj;
        if (this.f6303b == eVar.mo6626e() && this.f6304c == eVar.mo6624c() && this.f6305d == eVar.mo6622a() && this.f6306e == eVar.mo6623b() && this.f6307f == eVar.mo6625d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6303b;
        long j2 = this.f6306e;
        return this.f6307f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f6304c) * 1000003) ^ this.f6305d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("EventStoreConfig{maxStorageSizeInBytes=");
        k.append(this.f6303b);
        k.append(", loadBatchSize=");
        k.append(this.f6304c);
        k.append(", criticalSectionEnterTimeoutMs=");
        k.append(this.f6305d);
        k.append(", eventCleanUpAge=");
        k.append(this.f6306e);
        k.append(", maxBlobByteSizePerRow=");
        return C13437d.m33707l(k, this.f6307f, "}");
    }
}
