package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.j */
public final class C17796j extends C17746a0.C17753e.C17757c {

    /* renamed from: a */
    public final int f45662a;

    /* renamed from: b */
    public final String f45663b;

    /* renamed from: c */
    public final int f45664c;

    /* renamed from: d */
    public final long f45665d;

    /* renamed from: e */
    public final long f45666e;

    /* renamed from: f */
    public final boolean f45667f;

    /* renamed from: g */
    public final int f45668g;

    /* renamed from: h */
    public final String f45669h;

    /* renamed from: i */
    public final String f45670i;

    /* renamed from: je.j$a */
    public static final class C17797a extends C17746a0.C17753e.C17757c.C17758a {

        /* renamed from: a */
        public Integer f45671a;

        /* renamed from: b */
        public String f45672b;

        /* renamed from: c */
        public Integer f45673c;

        /* renamed from: d */
        public Long f45674d;

        /* renamed from: e */
        public Long f45675e;

        /* renamed from: f */
        public Boolean f45676f;

        /* renamed from: g */
        public Integer f45677g;

        /* renamed from: h */
        public String f45678h;

        /* renamed from: i */
        public String f45679i;

        /* renamed from: a */
        public final C17796j mo50346a() {
            String str;
            if (this.f45671a == null) {
                str = " arch";
            } else {
                str = "";
            }
            if (this.f45672b == null) {
                str = C25541a.m63881k(str, " model");
            }
            if (this.f45673c == null) {
                str = C25541a.m63881k(str, " cores");
            }
            if (this.f45674d == null) {
                str = C25541a.m63881k(str, " ram");
            }
            if (this.f45675e == null) {
                str = C25541a.m63881k(str, " diskSpace");
            }
            if (this.f45676f == null) {
                str = C25541a.m63881k(str, " simulator");
            }
            if (this.f45677g == null) {
                str = C25541a.m63881k(str, " state");
            }
            if (this.f45678h == null) {
                str = C25541a.m63881k(str, " manufacturer");
            }
            if (this.f45679i == null) {
                str = C25541a.m63881k(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new C17796j(this.f45671a.intValue(), this.f45672b, this.f45673c.intValue(), this.f45674d.longValue(), this.f45675e.longValue(), this.f45676f.booleanValue(), this.f45677g.intValue(), this.f45678h, this.f45679i);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17796j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f45662a = i;
        this.f45663b = str;
        this.f45664c = i2;
        this.f45665d = j;
        this.f45666e = j2;
        this.f45667f = z;
        this.f45668g = i3;
        this.f45669h = str2;
        this.f45670i = str3;
    }

    /* renamed from: a */
    public final int mo50213a() {
        return this.f45662a;
    }

    /* renamed from: b */
    public final int mo50214b() {
        return this.f45664c;
    }

    /* renamed from: c */
    public final long mo50215c() {
        return this.f45666e;
    }

    /* renamed from: d */
    public final String mo50216d() {
        return this.f45669h;
    }

    /* renamed from: e */
    public final String mo50217e() {
        return this.f45663b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17757c)) {
            return false;
        }
        C17746a0.C17753e.C17757c cVar = (C17746a0.C17753e.C17757c) obj;
        if (this.f45662a == cVar.mo50213a() && this.f45663b.equals(cVar.mo50217e()) && this.f45664c == cVar.mo50214b() && this.f45665d == cVar.mo50219g() && this.f45666e == cVar.mo50215c() && this.f45667f == cVar.mo50221i() && this.f45668g == cVar.mo50220h() && this.f45669h.equals(cVar.mo50216d()) && this.f45670i.equals(cVar.mo50218f())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo50218f() {
        return this.f45670i;
    }

    /* renamed from: g */
    public final long mo50219g() {
        return this.f45665d;
    }

    /* renamed from: h */
    public final int mo50220h() {
        return this.f45668g;
    }

    public final int hashCode() {
        int i;
        long j = this.f45665d;
        long j2 = this.f45666e;
        int hashCode = (((((((((this.f45662a ^ 1000003) * 1000003) ^ this.f45663b.hashCode()) * 1000003) ^ this.f45664c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f45667f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f45668g) * 1000003) ^ this.f45669h.hashCode()) * 1000003) ^ this.f45670i.hashCode();
    }

    /* renamed from: i */
    public final boolean mo50221i() {
        return this.f45667f;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Device{arch=");
        k.append(this.f45662a);
        k.append(", model=");
        k.append(this.f45663b);
        k.append(", cores=");
        k.append(this.f45664c);
        k.append(", ram=");
        k.append(this.f45665d);
        k.append(", diskSpace=");
        k.append(this.f45666e);
        k.append(", simulator=");
        k.append(this.f45667f);
        k.append(", state=");
        k.append(this.f45668g);
        k.append(", manufacturer=");
        k.append(this.f45669h);
        k.append(", modelClass=");
        return C0016g.m31o(k, this.f45670i, "}");
    }
}
