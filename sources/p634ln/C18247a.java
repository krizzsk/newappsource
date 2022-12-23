package p634ln;

import java.math.BigDecimal;
import java.util.Objects;

/* renamed from: ln.a */
public final class C18247a {

    /* renamed from: a */
    public final Integer f46552a;

    /* renamed from: b */
    public final String f46553b;

    /* renamed from: c */
    public final String f46554c;

    /* renamed from: d */
    public final String f46555d;

    /* renamed from: e */
    public final String f46556e;

    /* renamed from: f */
    public final String f46557f;

    /* renamed from: g */
    public final BigDecimal f46558g;

    /* renamed from: h */
    public final BigDecimal f46559h;

    /* renamed from: i */
    public final boolean f46560i;

    /* renamed from: j */
    public final boolean f46561j;

    public C18247a(Integer num, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2) {
        this.f46552a = num;
        this.f46553b = str;
        this.f46554c = str2;
        this.f46555d = str3;
        this.f46556e = str4;
        this.f46557f = str5;
        this.f46558g = bigDecimal;
        this.f46559h = bigDecimal2;
        this.f46560i = z;
        this.f46561j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18247a.class != obj.getClass()) {
            return false;
        }
        C18247a aVar = (C18247a) obj;
        if (this.f46560i != aVar.f46560i || this.f46561j != aVar.f46561j || !Objects.equals(this.f46552a, aVar.f46552a) || !Objects.equals(this.f46553b, aVar.f46553b) || !Objects.equals(this.f46554c, aVar.f46554c) || !Objects.equals(this.f46555d, aVar.f46555d) || !Objects.equals(this.f46556e, aVar.f46556e) || !Objects.equals(this.f46557f, aVar.f46557f) || !Objects.equals(this.f46558g, aVar.f46558g) || !Objects.equals(this.f46559h, aVar.f46559h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46552a, this.f46553b, this.f46554c, this.f46555d, this.f46556e, this.f46557f, this.f46558g, this.f46559h, Boolean.valueOf(this.f46560i), Boolean.valueOf(this.f46561j)});
    }
}
