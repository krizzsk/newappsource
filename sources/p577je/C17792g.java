package p577je;

import p358af.C13437d;
import p577je.C17746a0;

/* renamed from: je.g */
public final class C17792g extends C17746a0.C17753e {

    /* renamed from: a */
    public final String f45633a;

    /* renamed from: b */
    public final String f45634b;

    /* renamed from: c */
    public final long f45635c;

    /* renamed from: d */
    public final Long f45636d;

    /* renamed from: e */
    public final boolean f45637e;

    /* renamed from: f */
    public final C17746a0.C17753e.C17754a f45638f;

    /* renamed from: g */
    public final C17746a0.C17753e.C17779f f45639g;

    /* renamed from: h */
    public final C17746a0.C17753e.C17777e f45640h;

    /* renamed from: i */
    public final C17746a0.C17753e.C17757c f45641i;

    /* renamed from: j */
    public final C17782b0<C17746a0.C17753e.C17759d> f45642j;

    /* renamed from: k */
    public final int f45643k;

    /* renamed from: je.g$a */
    public static final class C17793a extends C17746a0.C17753e.C17756b {

        /* renamed from: a */
        public String f45644a;

        /* renamed from: b */
        public String f45645b;

        /* renamed from: c */
        public Long f45646c;

        /* renamed from: d */
        public Long f45647d;

        /* renamed from: e */
        public Boolean f45648e;

        /* renamed from: f */
        public C17746a0.C17753e.C17754a f45649f;

        /* renamed from: g */
        public C17746a0.C17753e.C17779f f45650g;

        /* renamed from: h */
        public C17746a0.C17753e.C17777e f45651h;

        /* renamed from: i */
        public C17746a0.C17753e.C17757c f45652i;

        /* renamed from: j */
        public C17782b0<C17746a0.C17753e.C17759d> f45653j;

        /* renamed from: k */
        public Integer f45654k;

        public C17793a() {
        }

        /* renamed from: a */
        public final C17792g mo50336a() {
            String str;
            if (this.f45644a == null) {
                str = " generator";
            } else {
                str = "";
            }
            if (this.f45645b == null) {
                str = C25541a.m63881k(str, " identifier");
            }
            if (this.f45646c == null) {
                str = C25541a.m63881k(str, " startedAt");
            }
            if (this.f45648e == null) {
                str = C25541a.m63881k(str, " crashed");
            }
            if (this.f45649f == null) {
                str = C25541a.m63881k(str, " app");
            }
            if (this.f45654k == null) {
                str = C25541a.m63881k(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new C17792g(this.f45644a, this.f45645b, this.f45646c.longValue(), this.f45647d, this.f45648e.booleanValue(), this.f45649f, this.f45650g, this.f45651h, this.f45652i, this.f45653j, this.f45654k.intValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }

        public C17793a(C17746a0.C17753e eVar) {
            this.f45644a = eVar.mo50197e();
            this.f45645b = eVar.mo50199g();
            this.f45646c = Long.valueOf(eVar.mo50201i());
            this.f45647d = eVar.mo50195c();
            this.f45648e = Boolean.valueOf(eVar.mo50203k());
            this.f45649f = eVar.mo50193a();
            this.f45650g = eVar.mo50202j();
            this.f45651h = eVar.mo50200h();
            this.f45652i = eVar.mo50194b();
            this.f45653j = eVar.mo50196d();
            this.f45654k = Integer.valueOf(eVar.mo50198f());
        }
    }

    public C17792g() {
        throw null;
    }

    public C17792g(String str, String str2, long j, Long l, boolean z, C17746a0.C17753e.C17754a aVar, C17746a0.C17753e.C17779f fVar, C17746a0.C17753e.C17777e eVar, C17746a0.C17753e.C17757c cVar, C17782b0 b0Var, int i) {
        this.f45633a = str;
        this.f45634b = str2;
        this.f45635c = j;
        this.f45636d = l;
        this.f45637e = z;
        this.f45638f = aVar;
        this.f45639g = fVar;
        this.f45640h = eVar;
        this.f45641i = cVar;
        this.f45642j = b0Var;
        this.f45643k = i;
    }

    /* renamed from: a */
    public final C17746a0.C17753e.C17754a mo50193a() {
        return this.f45638f;
    }

    /* renamed from: b */
    public final C17746a0.C17753e.C17757c mo50194b() {
        return this.f45641i;
    }

    /* renamed from: c */
    public final Long mo50195c() {
        return this.f45636d;
    }

    /* renamed from: d */
    public final C17782b0<C17746a0.C17753e.C17759d> mo50196d() {
        return this.f45642j;
    }

    /* renamed from: e */
    public final String mo50197e() {
        return this.f45633a;
    }

    public final boolean equals(Object obj) {
        Long l;
        C17746a0.C17753e.C17779f fVar;
        C17746a0.C17753e.C17777e eVar;
        C17746a0.C17753e.C17757c cVar;
        C17782b0<C17746a0.C17753e.C17759d> b0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e)) {
            return false;
        }
        C17746a0.C17753e eVar2 = (C17746a0.C17753e) obj;
        if (!this.f45633a.equals(eVar2.mo50197e()) || !this.f45634b.equals(eVar2.mo50199g()) || this.f45635c != eVar2.mo50201i() || ((l = this.f45636d) != null ? !l.equals(eVar2.mo50195c()) : eVar2.mo50195c() != null) || this.f45637e != eVar2.mo50203k() || !this.f45638f.equals(eVar2.mo50193a()) || ((fVar = this.f45639g) != null ? !fVar.equals(eVar2.mo50202j()) : eVar2.mo50202j() != null) || ((eVar = this.f45640h) != null ? !eVar.equals(eVar2.mo50200h()) : eVar2.mo50200h() != null) || ((cVar = this.f45641i) != null ? !cVar.equals(eVar2.mo50194b()) : eVar2.mo50194b() != null) || ((b0Var = this.f45642j) != null ? !b0Var.equals(eVar2.mo50196d()) : eVar2.mo50196d() != null) || this.f45643k != eVar2.mo50198f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo50198f() {
        return this.f45643k;
    }

    /* renamed from: g */
    public final String mo50199g() {
        return this.f45634b;
    }

    /* renamed from: h */
    public final C17746a0.C17753e.C17777e mo50200h() {
        return this.f45640h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = this.f45635c;
        int hashCode = (((((this.f45633a.hashCode() ^ 1000003) * 1000003) ^ this.f45634b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f45636d;
        int i6 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        if (this.f45637e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int hashCode2 = (((i7 ^ i2) * 1000003) ^ this.f45638f.hashCode()) * 1000003;
        C17746a0.C17753e.C17779f fVar = this.f45639g;
        if (fVar == null) {
            i3 = 0;
        } else {
            i3 = fVar.hashCode();
        }
        int i8 = (hashCode2 ^ i3) * 1000003;
        C17746a0.C17753e.C17777e eVar = this.f45640h;
        if (eVar == null) {
            i4 = 0;
        } else {
            i4 = eVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        C17746a0.C17753e.C17757c cVar = this.f45641i;
        if (cVar == null) {
            i5 = 0;
        } else {
            i5 = cVar.hashCode();
        }
        int i11 = (i9 ^ i5) * 1000003;
        C17782b0<C17746a0.C17753e.C17759d> b0Var = this.f45642j;
        if (b0Var != null) {
            i6 = b0Var.hashCode();
        }
        return ((i11 ^ i6) * 1000003) ^ this.f45643k;
    }

    /* renamed from: i */
    public final long mo50201i() {
        return this.f45635c;
    }

    /* renamed from: j */
    public final C17746a0.C17753e.C17779f mo50202j() {
        return this.f45639g;
    }

    /* renamed from: k */
    public final boolean mo50203k() {
        return this.f45637e;
    }

    /* renamed from: l */
    public final C17793a mo50204l() {
        return new C17793a(this);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Session{generator=");
        k.append(this.f45633a);
        k.append(", identifier=");
        k.append(this.f45634b);
        k.append(", startedAt=");
        k.append(this.f45635c);
        k.append(", endedAt=");
        k.append(this.f45636d);
        k.append(", crashed=");
        k.append(this.f45637e);
        k.append(", app=");
        k.append(this.f45638f);
        k.append(", user=");
        k.append(this.f45639g);
        k.append(", os=");
        k.append(this.f45640h);
        k.append(", device=");
        k.append(this.f45641i);
        k.append(", events=");
        k.append(this.f45642j);
        k.append(", generatorType=");
        return C13437d.m33707l(k, this.f45643k, "}");
    }
}
