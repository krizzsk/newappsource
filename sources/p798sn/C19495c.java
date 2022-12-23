package p798sn;

import java.util.Date;
import java.util.Objects;

/* renamed from: sn.c */
public final class C19495c {

    /* renamed from: a */
    public final int f49587a;

    /* renamed from: b */
    public final int f49588b;

    /* renamed from: c */
    public final int f49589c;

    /* renamed from: d */
    public final int f49590d;

    /* renamed from: e */
    public final int f49591e;

    /* renamed from: f */
    public final Date f49592f;

    public C19495c(int i, int i2, int i3, int i4, int i5, Date date) {
        this.f49587a = i;
        this.f49588b = i2;
        this.f49589c = i3;
        this.f49590d = i4;
        this.f49591e = i5;
        this.f49592f = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19495c.class != obj.getClass()) {
            return false;
        }
        C19495c cVar = (C19495c) obj;
        if (this.f49587a == cVar.f49587a && this.f49588b == cVar.f49588b && this.f49589c == cVar.f49589c && this.f49590d == cVar.f49590d && this.f49591e == cVar.f49591e && this.f49592f.equals(cVar.f49592f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f49587a), Integer.valueOf(this.f49588b), Integer.valueOf(this.f49589c), Integer.valueOf(this.f49590d), Integer.valueOf(this.f49591e), this.f49592f});
    }
}
