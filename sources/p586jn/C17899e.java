package p586jn;

import java.util.Objects;

/* renamed from: jn.e */
public final class C17899e {

    /* renamed from: a */
    public final Integer f45932a;

    /* renamed from: b */
    public final String f45933b;

    /* renamed from: c */
    public final String f45934c;

    /* renamed from: d */
    public final String f45935d;

    /* renamed from: e */
    public final Integer f45936e;

    /* renamed from: f */
    public final boolean f45937f;

    /* renamed from: g */
    public final boolean f45938g;

    public C17899e(Integer num, String str, String str2, String str3, Integer num2, boolean z, boolean z2) {
        this.f45932a = num;
        this.f45933b = str;
        this.f45934c = str2;
        this.f45935d = str3;
        this.f45936e = num2;
        this.f45937f = z;
        this.f45938g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17899e.class != obj.getClass()) {
            return false;
        }
        C17899e eVar = (C17899e) obj;
        if (this.f45937f != eVar.f45937f || this.f45938g != eVar.f45938g || !Objects.equals(this.f45932a, eVar.f45932a) || !Objects.equals(this.f45933b, eVar.f45933b) || !Objects.equals(this.f45934c, eVar.f45934c) || !Objects.equals(this.f45935d, eVar.f45935d) || !Objects.equals(this.f45936e, eVar.f45936e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f45932a, this.f45933b, this.f45934c, this.f45935d, this.f45936e, Boolean.valueOf(this.f45937f), Boolean.valueOf(this.f45938g)});
    }
}
