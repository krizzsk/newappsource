package p654mk;

import java.util.Objects;

/* renamed from: mk.o */
public final class C18393o {

    /* renamed from: a */
    public final Integer f46888a;

    /* renamed from: b */
    public final String f46889b;

    /* renamed from: c */
    public final String f46890c;

    /* renamed from: d */
    public final String f46891d;

    /* renamed from: e */
    public final Integer f46892e;

    /* renamed from: f */
    public final boolean f46893f;

    /* renamed from: g */
    public final boolean f46894g;

    public C18393o(Integer num, String str, String str2, String str3, Integer num2, boolean z, boolean z2) {
        this.f46888a = num;
        this.f46889b = str;
        this.f46890c = str2;
        this.f46891d = str3;
        this.f46892e = num2;
        this.f46893f = z;
        this.f46894g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18393o.class != obj.getClass()) {
            return false;
        }
        C18393o oVar = (C18393o) obj;
        if (this.f46893f != oVar.f46893f || this.f46894g != oVar.f46894g || !Objects.equals(this.f46888a, oVar.f46888a) || !Objects.equals(this.f46889b, oVar.f46889b) || !Objects.equals(this.f46890c, oVar.f46890c) || !Objects.equals(this.f46891d, oVar.f46891d) || !Objects.equals(this.f46892e, oVar.f46892e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46888a, this.f46889b, this.f46890c, this.f46891d, this.f46892e, Boolean.valueOf(this.f46893f), Boolean.valueOf(this.f46894g)});
    }
}
