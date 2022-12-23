package p358af;

/* renamed from: af.a */
public final class C13434a extends C13440g {

    /* renamed from: a */
    public final String f33289a;

    /* renamed from: b */
    public final long f33290b;

    /* renamed from: c */
    public final long f33291c;

    public C13434a(String str, long j, long j2) {
        this.f33289a = str;
        this.f33290b = j;
        this.f33291c = j2;
    }

    /* renamed from: a */
    public final String mo40308a() {
        return this.f33289a;
    }

    /* renamed from: b */
    public final long mo40309b() {
        return this.f33291c;
    }

    /* renamed from: c */
    public final long mo40310c() {
        return this.f33290b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13440g)) {
            return false;
        }
        C13440g gVar = (C13440g) obj;
        if (this.f33289a.equals(gVar.mo40308a()) && this.f33290b == gVar.mo40310c() && this.f33291c == gVar.mo40309b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33290b;
        long j2 = this.f33291c;
        return ((((this.f33289a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("InstallationTokenResult{token=");
        k.append(this.f33289a);
        k.append(", tokenExpirationTimestamp=");
        k.append(this.f33290b);
        k.append(", tokenCreationTimestamp=");
        return C25541a.m63884o(k, this.f33291c, "}");
    }
}
