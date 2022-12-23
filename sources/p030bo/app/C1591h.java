package p030bo.app;

/* renamed from: bo.app.h */
public class C1591h implements C1736y2 {

    /* renamed from: a */
    public final int f5729a;

    /* renamed from: b */
    public final String f5730b;

    /* renamed from: c */
    public final String f5731c;

    /* renamed from: d */
    public final C1620k3 f5732d;

    public C1591h(C1620k3 k3Var, int i, String str, String str2) {
        this.f5731c = str2;
        this.f5729a = i;
        this.f5730b = str;
        this.f5732d = k3Var;
    }

    /* renamed from: a */
    public String mo6064a() {
        return this.f5731c;
    }

    /* renamed from: b */
    public C1620k3 mo6126b() {
        return this.f5732d;
    }

    /* renamed from: c */
    public int mo6127c() {
        return this.f5729a;
    }

    /* renamed from: d */
    public String mo6128d() {
        return this.f5730b;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{code = ");
        k.append(this.f5729a);
        k.append(", reason? = '");
        C25541a.m63890u(k, this.f5730b, '\'', ", message = '");
        k.append(this.f5731c);
        k.append('\'');
        k.append('}');
        return k.toString();
    }
}
