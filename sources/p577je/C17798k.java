package p577je;

import p577je.C17746a0;

/* renamed from: je.k */
public final class C17798k extends C17746a0.C17753e.C17759d {

    /* renamed from: a */
    public final long f45680a;

    /* renamed from: b */
    public final String f45681b;

    /* renamed from: c */
    public final C17746a0.C17753e.C17759d.C17760a f45682c;

    /* renamed from: d */
    public final C17746a0.C17753e.C17759d.C17774c f45683d;

    /* renamed from: e */
    public final C17746a0.C17753e.C17759d.C17776d f45684e;

    /* renamed from: je.k$a */
    public static final class C17799a extends C17746a0.C17753e.C17759d.C17773b {

        /* renamed from: a */
        public Long f45685a;

        /* renamed from: b */
        public String f45686b;

        /* renamed from: c */
        public C17746a0.C17753e.C17759d.C17760a f45687c;

        /* renamed from: d */
        public C17746a0.C17753e.C17759d.C17774c f45688d;

        /* renamed from: e */
        public C17746a0.C17753e.C17759d.C17776d f45689e;

        public C17799a() {
        }

        /* renamed from: a */
        public final C17798k mo50350a() {
            String str;
            if (this.f45685a == null) {
                str = " timestamp";
            } else {
                str = "";
            }
            if (this.f45686b == null) {
                str = C25541a.m63881k(str, " type");
            }
            if (this.f45687c == null) {
                str = C25541a.m63881k(str, " app");
            }
            if (this.f45688d == null) {
                str = C25541a.m63881k(str, " device");
            }
            if (str.isEmpty()) {
                return new C17798k(this.f45685a.longValue(), this.f45686b, this.f45687c, this.f45688d, this.f45689e);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }

        public C17799a(C17746a0.C17753e.C17759d dVar) {
            this.f45685a = Long.valueOf(dVar.mo50225d());
            this.f45686b = dVar.mo50226e();
            this.f45687c = dVar.mo50222a();
            this.f45688d = dVar.mo50223b();
            this.f45689e = dVar.mo50224c();
        }
    }

    public C17798k(long j, String str, C17746a0.C17753e.C17759d.C17760a aVar, C17746a0.C17753e.C17759d.C17774c cVar, C17746a0.C17753e.C17759d.C17776d dVar) {
        this.f45680a = j;
        this.f45681b = str;
        this.f45682c = aVar;
        this.f45683d = cVar;
        this.f45684e = dVar;
    }

    /* renamed from: a */
    public final C17746a0.C17753e.C17759d.C17760a mo50222a() {
        return this.f45682c;
    }

    /* renamed from: b */
    public final C17746a0.C17753e.C17759d.C17774c mo50223b() {
        return this.f45683d;
    }

    /* renamed from: c */
    public final C17746a0.C17753e.C17759d.C17776d mo50224c() {
        return this.f45684e;
    }

    /* renamed from: d */
    public final long mo50225d() {
        return this.f45680a;
    }

    /* renamed from: e */
    public final String mo50226e() {
        return this.f45681b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d)) {
            return false;
        }
        C17746a0.C17753e.C17759d dVar = (C17746a0.C17753e.C17759d) obj;
        if (this.f45680a == dVar.mo50225d() && this.f45681b.equals(dVar.mo50226e()) && this.f45682c.equals(dVar.mo50222a()) && this.f45683d.equals(dVar.mo50223b())) {
            C17746a0.C17753e.C17759d.C17776d dVar2 = this.f45684e;
            if (dVar2 == null) {
                if (dVar.mo50224c() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.mo50224c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.f45680a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f45681b.hashCode()) * 1000003) ^ this.f45682c.hashCode()) * 1000003) ^ this.f45683d.hashCode()) * 1000003;
        C17746a0.C17753e.C17759d.C17776d dVar = this.f45684e;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Event{timestamp=");
        k.append(this.f45680a);
        k.append(", type=");
        k.append(this.f45681b);
        k.append(", app=");
        k.append(this.f45682c);
        k.append(", device=");
        k.append(this.f45683d);
        k.append(", log=");
        k.append(this.f45684e);
        k.append("}");
        return k.toString();
    }
}
