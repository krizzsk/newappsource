package p843uk;

import java.util.Objects;

/* renamed from: uk.u */
public final class C19951u {

    /* renamed from: a */
    public final String f50696a;

    /* renamed from: b */
    public final String f50697b;

    /* renamed from: c */
    public final boolean f50698c;

    /* renamed from: d */
    public final String f50699d;

    /* renamed from: e */
    public final String f50700e;

    /* renamed from: f */
    public final String f50701f;

    /* renamed from: g */
    public final String f50702g;

    /* renamed from: h */
    public final Long f50703h;

    /* renamed from: i */
    public final Long f50704i;

    public C19951u(String str, String str2, boolean z, String str3, String str4, String str5, String str6, Long l, Long l2) {
        this.f50696a = str;
        this.f50697b = str2;
        this.f50698c = z;
        this.f50699d = str3;
        this.f50700e = str4;
        this.f50701f = str5;
        this.f50702g = str6;
        this.f50703h = l;
        this.f50704i = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19951u.class != obj.getClass()) {
            return false;
        }
        C19951u uVar = (C19951u) obj;
        if (this.f50698c != uVar.f50698c || !Objects.equals(this.f50696a, uVar.f50696a) || !Objects.equals(this.f50697b, uVar.f50697b) || !Objects.equals(this.f50699d, uVar.f50699d) || !Objects.equals(this.f50700e, uVar.f50700e) || !Objects.equals(this.f50701f, uVar.f50701f) || !Objects.equals(this.f50702g, uVar.f50702g) || !Objects.equals(this.f50703h, uVar.f50703h) || !Objects.equals(this.f50704i, uVar.f50704i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50696a, this.f50697b, Boolean.valueOf(this.f50698c), this.f50699d, this.f50700e, this.f50701f, this.f50702g, this.f50703h, this.f50704i});
    }
}
