package p577je;

import p577je.C17746a0;

/* renamed from: je.u */
public final class C17816u extends C17746a0.C17753e.C17777e {

    /* renamed from: a */
    public final int f45758a;

    /* renamed from: b */
    public final String f45759b;

    /* renamed from: c */
    public final String f45760c;

    /* renamed from: d */
    public final boolean f45761d;

    /* renamed from: je.u$a */
    public static final class C17817a extends C17746a0.C17753e.C17777e.C17778a {

        /* renamed from: a */
        public Integer f45762a;

        /* renamed from: b */
        public String f45763b;

        /* renamed from: c */
        public String f45764c;

        /* renamed from: d */
        public Boolean f45765d;

        /* renamed from: a */
        public final C17816u mo50388a() {
            String str;
            if (this.f45762a == null) {
                str = " platform";
            } else {
                str = "";
            }
            if (this.f45763b == null) {
                str = C25541a.m63881k(str, " version");
            }
            if (this.f45764c == null) {
                str = C25541a.m63881k(str, " buildVersion");
            }
            if (this.f45765d == null) {
                str = C25541a.m63881k(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new C17816u(this.f45762a.intValue(), this.f45763b, this.f45764c, this.f45765d.booleanValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17816u(int i, String str, String str2, boolean z) {
        this.f45758a = i;
        this.f45759b = str;
        this.f45760c = str2;
        this.f45761d = z;
    }

    /* renamed from: a */
    public final String mo50265a() {
        return this.f45760c;
    }

    /* renamed from: b */
    public final int mo50266b() {
        return this.f45758a;
    }

    /* renamed from: c */
    public final String mo50267c() {
        return this.f45759b;
    }

    /* renamed from: d */
    public final boolean mo50268d() {
        return this.f45761d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17777e)) {
            return false;
        }
        C17746a0.C17753e.C17777e eVar = (C17746a0.C17753e.C17777e) obj;
        if (this.f45758a != eVar.mo50266b() || !this.f45759b.equals(eVar.mo50267c()) || !this.f45760c.equals(eVar.mo50265a()) || this.f45761d != eVar.mo50268d()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f45758a ^ 1000003) * 1000003) ^ this.f45759b.hashCode()) * 1000003) ^ this.f45760c.hashCode()) * 1000003;
        if (this.f45761d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("OperatingSystem{platform=");
        k.append(this.f45758a);
        k.append(", version=");
        k.append(this.f45759b);
        k.append(", buildVersion=");
        k.append(this.f45760c);
        k.append(", jailbroken=");
        return C25541a.m63885p(k, this.f45761d, "}");
    }
}
