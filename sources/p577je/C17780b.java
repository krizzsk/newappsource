package p577je;

import p577je.C17746a0;

/* renamed from: je.b */
public final class C17780b extends C17746a0 {

    /* renamed from: b */
    public final String f45594b;

    /* renamed from: c */
    public final String f45595c;

    /* renamed from: d */
    public final int f45596d;

    /* renamed from: e */
    public final String f45597e;

    /* renamed from: f */
    public final String f45598f;

    /* renamed from: g */
    public final String f45599g;

    /* renamed from: h */
    public final C17746a0.C17753e f45600h;

    /* renamed from: i */
    public final C17746a0.C17751d f45601i;

    /* renamed from: je.b$a */
    public static final class C17781a extends C17746a0.C17749b {

        /* renamed from: a */
        public String f45602a;

        /* renamed from: b */
        public String f45603b;

        /* renamed from: c */
        public Integer f45604c;

        /* renamed from: d */
        public String f45605d;

        /* renamed from: e */
        public String f45606e;

        /* renamed from: f */
        public String f45607f;

        /* renamed from: g */
        public C17746a0.C17753e f45608g;

        /* renamed from: h */
        public C17746a0.C17751d f45609h;

        public C17781a() {
        }

        /* renamed from: a */
        public final C17780b mo50273a() {
            String str;
            if (this.f45602a == null) {
                str = " sdkVersion";
            } else {
                str = "";
            }
            if (this.f45603b == null) {
                str = C25541a.m63881k(str, " gmpAppId");
            }
            if (this.f45604c == null) {
                str = C25541a.m63881k(str, " platform");
            }
            if (this.f45605d == null) {
                str = C25541a.m63881k(str, " installationUuid");
            }
            if (this.f45606e == null) {
                str = C25541a.m63881k(str, " buildVersion");
            }
            if (this.f45607f == null) {
                str = C25541a.m63881k(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new C17780b(this.f45602a, this.f45603b, this.f45604c.intValue(), this.f45605d, this.f45606e, this.f45607f, this.f45608g, this.f45609h);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }

        public C17781a(C17746a0 a0Var) {
            this.f45602a = a0Var.mo50176g();
            this.f45603b = a0Var.mo50172c();
            this.f45604c = Integer.valueOf(a0Var.mo50175f());
            this.f45605d = a0Var.mo50173d();
            this.f45606e = a0Var.mo50170a();
            this.f45607f = a0Var.mo50171b();
            this.f45608g = a0Var.mo50177h();
            this.f45609h = a0Var.mo50174e();
        }
    }

    public C17780b(String str, String str2, int i, String str3, String str4, String str5, C17746a0.C17753e eVar, C17746a0.C17751d dVar) {
        this.f45594b = str;
        this.f45595c = str2;
        this.f45596d = i;
        this.f45597e = str3;
        this.f45598f = str4;
        this.f45599g = str5;
        this.f45600h = eVar;
        this.f45601i = dVar;
    }

    /* renamed from: a */
    public final String mo50170a() {
        return this.f45598f;
    }

    /* renamed from: b */
    public final String mo50171b() {
        return this.f45599g;
    }

    /* renamed from: c */
    public final String mo50172c() {
        return this.f45595c;
    }

    /* renamed from: d */
    public final String mo50173d() {
        return this.f45597e;
    }

    /* renamed from: e */
    public final C17746a0.C17751d mo50174e() {
        return this.f45601i;
    }

    public final boolean equals(Object obj) {
        C17746a0.C17753e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0)) {
            return false;
        }
        C17746a0 a0Var = (C17746a0) obj;
        if (this.f45594b.equals(a0Var.mo50176g()) && this.f45595c.equals(a0Var.mo50172c()) && this.f45596d == a0Var.mo50175f() && this.f45597e.equals(a0Var.mo50173d()) && this.f45598f.equals(a0Var.mo50170a()) && this.f45599g.equals(a0Var.mo50171b()) && ((eVar = this.f45600h) != null ? eVar.equals(a0Var.mo50177h()) : a0Var.mo50177h() == null)) {
            C17746a0.C17751d dVar = this.f45601i;
            if (dVar == null) {
                if (a0Var.mo50174e() == null) {
                    return true;
                }
            } else if (dVar.equals(a0Var.mo50174e())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo50175f() {
        return this.f45596d;
    }

    /* renamed from: g */
    public final String mo50176g() {
        return this.f45594b;
    }

    /* renamed from: h */
    public final C17746a0.C17753e mo50177h() {
        return this.f45600h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((this.f45594b.hashCode() ^ 1000003) * 1000003) ^ this.f45595c.hashCode()) * 1000003) ^ this.f45596d) * 1000003) ^ this.f45597e.hashCode()) * 1000003) ^ this.f45598f.hashCode()) * 1000003) ^ this.f45599g.hashCode()) * 1000003;
        C17746a0.C17753e eVar = this.f45600h;
        int i2 = 0;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C17746a0.C17751d dVar = this.f45601i;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CrashlyticsReport{sdkVersion=");
        k.append(this.f45594b);
        k.append(", gmpAppId=");
        k.append(this.f45595c);
        k.append(", platform=");
        k.append(this.f45596d);
        k.append(", installationUuid=");
        k.append(this.f45597e);
        k.append(", buildVersion=");
        k.append(this.f45598f);
        k.append(", displayVersion=");
        k.append(this.f45599g);
        k.append(", session=");
        k.append(this.f45600h);
        k.append(", ndkPayload=");
        k.append(this.f45601i);
        k.append("}");
        return k.toString();
    }
}
