package p705on;

/* renamed from: on.g */
public final class C18799g {

    /* renamed from: a */
    public final String f47861a;

    /* renamed from: b */
    public final String f47862b;

    /* renamed from: c */
    public final String f47863c;

    /* renamed from: d */
    public final String f47864d;

    /* renamed from: e */
    public final String f47865e;

    /* renamed from: f */
    public final String f47866f;

    /* renamed from: g */
    public final Boolean f47867g;

    public C18799g(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        this.f47861a = str;
        this.f47862b = str2;
        this.f47863c = str3;
        this.f47864d = str4;
        this.f47865e = str5;
        this.f47866f = str6;
        this.f47867g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18799g.class != obj.getClass()) {
            return false;
        }
        C18799g gVar = (C18799g) obj;
        if (!this.f47861a.equals(gVar.f47861a) || !this.f47862b.equals(gVar.f47862b) || !this.f47863c.equals(gVar.f47863c) || !this.f47864d.equals(gVar.f47864d) || !this.f47865e.equals(gVar.f47865e)) {
            return false;
        }
        String str = this.f47866f;
        if (str == null ? gVar.f47866f == null : str.equals(gVar.f47866f)) {
            return this.f47867g.equals(gVar.f47867g);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f47865e, C13715c.m34238d(this.f47864d, C13715c.m34238d(this.f47863c, C13715c.m34238d(this.f47862b, this.f47861a.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f47866f;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.f47867g.hashCode() + ((d + i) * 31);
    }
}
