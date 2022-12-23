package p681nn;

import java.util.Date;
import java.util.Objects;

/* renamed from: nn.a */
public final class C18577a {

    /* renamed from: a */
    public final String f47284a;

    /* renamed from: b */
    public final String f47285b;

    /* renamed from: c */
    public final String f47286c;

    /* renamed from: d */
    public final String f47287d;

    /* renamed from: e */
    public final String f47288e;

    /* renamed from: f */
    public final String f47289f;

    /* renamed from: g */
    public final String f47290g;

    /* renamed from: h */
    public final String f47291h;

    /* renamed from: i */
    public final String f47292i;

    /* renamed from: j */
    public final String f47293j;

    /* renamed from: k */
    public final String f47294k;

    /* renamed from: l */
    public final Date f47295l;

    /* renamed from: m */
    public final String f47296m;

    /* renamed from: n */
    public final String f47297n;

    public C18577a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Date date, String str12, String str13) {
        this.f47284a = str;
        this.f47285b = str2;
        this.f47286c = str3;
        this.f47287d = str4;
        this.f47288e = str5;
        this.f47289f = str6;
        this.f47290g = str7;
        this.f47291h = str8;
        this.f47292i = str9;
        this.f47293j = str10;
        this.f47294k = str11;
        this.f47295l = date;
        this.f47296m = str12;
        this.f47297n = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18577a.class != obj.getClass()) {
            return false;
        }
        C18577a aVar = (C18577a) obj;
        if (!Objects.equals(this.f47284a, aVar.f47284a) || !Objects.equals(this.f47285b, aVar.f47285b) || !Objects.equals(this.f47286c, aVar.f47286c) || !Objects.equals(this.f47287d, aVar.f47287d) || !Objects.equals(this.f47288e, aVar.f47288e) || !Objects.equals(this.f47289f, aVar.f47289f) || !Objects.equals(this.f47290g, aVar.f47290g) || !Objects.equals(this.f47291h, aVar.f47291h) || !Objects.equals(this.f47292i, aVar.f47292i) || !Objects.equals(this.f47293j, aVar.f47293j) || !Objects.equals(this.f47294k, aVar.f47294k) || !Objects.equals(this.f47295l, aVar.f47295l) || !Objects.equals(this.f47296m, aVar.f47296m) || !Objects.equals(this.f47297n, aVar.f47297n)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47284a, this.f47285b, this.f47286c, this.f47287d, this.f47288e, this.f47289f, this.f47290g, this.f47291h, this.f47292i, this.f47293j, this.f47294k, this.f47295l, this.f47296m, this.f47297n});
    }
}
