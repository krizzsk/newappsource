package p891wk;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: wk.z */
public final class C20371z {

    /* renamed from: a */
    public final Map<String, Integer> f51654a;

    /* renamed from: b */
    public final String f51655b;

    /* renamed from: c */
    public final String f51656c;

    /* renamed from: d */
    public final String f51657d;

    /* renamed from: e */
    public final String f51658e;

    /* renamed from: f */
    public final String f51659f;

    /* renamed from: g */
    public final Long f51660g;

    /* renamed from: h */
    public final C20360o f51661h;

    /* renamed from: i */
    public final Map<String, String> f51662i;

    /* renamed from: j */
    public final String f51663j;

    /* renamed from: k */
    public final String f51664k;

    /* renamed from: l */
    public final Double f51665l;

    /* renamed from: m */
    public final String f51666m;

    /* renamed from: n */
    public final String f51667n;

    /* renamed from: o */
    public final String f51668o;

    /* renamed from: p */
    public final Boolean f51669p;

    public C20371z(HashMap hashMap, String str, String str2, String str3, String str4, String str5, Long l, C20360o oVar, HashMap hashMap2, String str6, String str7, Double d, String str8, String str9, String str10, Boolean bool) {
        this.f51654a = hashMap;
        this.f51655b = str;
        this.f51656c = str2;
        this.f51657d = str3;
        this.f51658e = str4;
        this.f51659f = str5;
        this.f51660g = l;
        this.f51661h = oVar;
        this.f51662i = hashMap2;
        this.f51663j = str6;
        this.f51664k = str7;
        this.f51665l = d;
        this.f51666m = str8;
        this.f51667n = str9;
        this.f51668o = str10;
        this.f51669p = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20371z.class != obj.getClass()) {
            return false;
        }
        C20371z zVar = (C20371z) obj;
        if (!Objects.equals(this.f51654a, zVar.f51654a) || !Objects.equals(this.f51655b, zVar.f51655b) || !Objects.equals(this.f51656c, zVar.f51656c) || !Objects.equals(this.f51657d, zVar.f51657d) || !Objects.equals(this.f51658e, zVar.f51658e) || !Objects.equals(this.f51659f, zVar.f51659f) || !Objects.equals(this.f51660g, zVar.f51660g) || !Objects.equals(this.f51661h, zVar.f51661h) || !Objects.equals(this.f51662i, zVar.f51662i) || !Objects.equals(this.f51663j, zVar.f51663j) || !Objects.equals(this.f51664k, zVar.f51664k) || !Objects.equals(this.f51665l, zVar.f51665l) || !Objects.equals(this.f51666m, zVar.f51666m) || !Objects.equals(this.f51667n, zVar.f51667n) || !Objects.equals(this.f51668o, zVar.f51668o) || !Objects.equals(this.f51669p, zVar.f51669p)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51654a, this.f51655b, this.f51656c, this.f51657d, this.f51658e, this.f51659f, this.f51660g, this.f51661h, this.f51662i, this.f51663j, this.f51664k, this.f51665l, this.f51666m, this.f51667n, this.f51668o, this.f51669p});
    }
}
