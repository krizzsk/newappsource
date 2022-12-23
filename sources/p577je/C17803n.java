package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.n */
public final class C17803n extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a {

    /* renamed from: a */
    public final long f45705a;

    /* renamed from: b */
    public final long f45706b;

    /* renamed from: c */
    public final String f45707c;

    /* renamed from: d */
    public final String f45708d;

    /* renamed from: je.n$a */
    public static final class C17804a extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a.C17764a {

        /* renamed from: a */
        public Long f45709a;

        /* renamed from: b */
        public Long f45710b;

        /* renamed from: c */
        public String f45711c;

        /* renamed from: d */
        public String f45712d;

        /* renamed from: a */
        public final C17803n mo50361a() {
            String str;
            if (this.f45709a == null) {
                str = " baseAddress";
            } else {
                str = "";
            }
            if (this.f45710b == null) {
                str = C25541a.m63881k(str, " size");
            }
            if (this.f45711c == null) {
                str = C25541a.m63881k(str, " name");
            }
            if (str.isEmpty()) {
                return new C17803n(this.f45709a.longValue(), this.f45710b.longValue(), this.f45711c, this.f45712d);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17803n(long j, long j2, String str, String str2) {
        this.f45705a = j;
        this.f45706b = j2;
        this.f45707c = str;
        this.f45708d = str2;
    }

    /* renamed from: a */
    public final long mo50238a() {
        return this.f45705a;
    }

    /* renamed from: b */
    public final String mo50239b() {
        return this.f45707c;
    }

    /* renamed from: c */
    public final long mo50240c() {
        return this.f45706b;
    }

    /* renamed from: d */
    public final String mo50241d() {
        return this.f45708d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a aVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a) obj;
        if (this.f45705a == aVar.mo50238a() && this.f45706b == aVar.mo50240c() && this.f45707c.equals(aVar.mo50239b())) {
            String str = this.f45708d;
            if (str == null) {
                if (aVar.mo50241d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo50241d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.f45705a;
        long j2 = this.f45706b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f45707c.hashCode()) * 1000003;
        String str = this.f45708d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BinaryImage{baseAddress=");
        k.append(this.f45705a);
        k.append(", size=");
        k.append(this.f45706b);
        k.append(", name=");
        k.append(this.f45707c);
        k.append(", uuid=");
        return C0016g.m31o(k, this.f45708d, "}");
    }
}
