package p752qn;

import java.util.Date;
import java.util.Objects;

/* renamed from: qn.i */
public final class C19151i {

    /* renamed from: a */
    public final boolean f48734a;

    /* renamed from: b */
    public final boolean f48735b;

    /* renamed from: c */
    public final long f48736c;

    /* renamed from: d */
    public final Date f48737d;

    /* renamed from: e */
    public final boolean f48738e;

    /* renamed from: f */
    public final boolean f48739f;

    public C19151i(boolean z, boolean z2, long j, Date date, boolean z3, boolean z4) {
        this.f48734a = z;
        this.f48735b = z2;
        this.f48736c = j;
        this.f48737d = date;
        this.f48738e = z3;
        this.f48739f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19151i.class != obj.getClass()) {
            return false;
        }
        C19151i iVar = (C19151i) obj;
        if (this.f48734a == iVar.f48734a && this.f48735b == iVar.f48735b && this.f48736c == iVar.f48736c && this.f48738e == iVar.f48738e && this.f48739f == iVar.f48739f && Objects.equals(this.f48737d, iVar.f48737d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f48734a), Boolean.valueOf(this.f48735b), Long.valueOf(this.f48736c), this.f48737d, Boolean.valueOf(this.f48738e), Boolean.valueOf(this.f48739f)});
    }
}
