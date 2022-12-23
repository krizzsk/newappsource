package p577je;

import p358af.C13437d;
import p577je.C17746a0;

/* renamed from: je.r */
public final class C17811r extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b {

    /* renamed from: a */
    public final long f45735a;

    /* renamed from: b */
    public final String f45736b;

    /* renamed from: c */
    public final String f45737c;

    /* renamed from: d */
    public final long f45738d;

    /* renamed from: e */
    public final int f45739e;

    /* renamed from: je.r$a */
    public static final class C17812a extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b.C17772a {

        /* renamed from: a */
        public Long f45740a;

        /* renamed from: b */
        public String f45741b;

        /* renamed from: c */
        public String f45742c;

        /* renamed from: d */
        public Long f45743d;

        /* renamed from: e */
        public Integer f45744e;

        /* renamed from: a */
        public final C17811r mo50377a() {
            String str;
            if (this.f45740a == null) {
                str = " pc";
            } else {
                str = "";
            }
            if (this.f45741b == null) {
                str = C25541a.m63881k(str, " symbol");
            }
            if (this.f45743d == null) {
                str = C25541a.m63881k(str, " offset");
            }
            if (this.f45744e == null) {
                str = C25541a.m63881k(str, " importance");
            }
            if (str.isEmpty()) {
                return new C17811r(this.f45740a.longValue(), this.f45741b, this.f45742c, this.f45743d.longValue(), this.f45744e.intValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17811r(long j, String str, String str2, long j2, int i) {
        this.f45735a = j;
        this.f45736b = str;
        this.f45737c = str2;
        this.f45738d = j2;
        this.f45739e = i;
    }

    /* renamed from: a */
    public final String mo50253a() {
        return this.f45737c;
    }

    /* renamed from: b */
    public final int mo50254b() {
        return this.f45739e;
    }

    /* renamed from: c */
    public final long mo50255c() {
        return this.f45738d;
    }

    /* renamed from: d */
    public final long mo50256d() {
        return this.f45735a;
    }

    /* renamed from: e */
    public final String mo50257e() {
        return this.f45736b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b bVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b) obj;
        if (this.f45735a == bVar.mo50256d() && this.f45736b.equals(bVar.mo50257e()) && ((str = this.f45737c) != null ? str.equals(bVar.mo50253a()) : bVar.mo50253a() == null) && this.f45738d == bVar.mo50255c() && this.f45739e == bVar.mo50254b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.f45735a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f45736b.hashCode()) * 1000003;
        String str = this.f45737c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j2 = this.f45738d;
        return this.f45739e ^ ((((hashCode ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Frame{pc=");
        k.append(this.f45735a);
        k.append(", symbol=");
        k.append(this.f45736b);
        k.append(", file=");
        k.append(this.f45737c);
        k.append(", offset=");
        k.append(this.f45738d);
        k.append(", importance=");
        return C13437d.m33707l(k, this.f45739e, "}");
    }
}
