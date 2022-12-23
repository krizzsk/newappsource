package p774rn;

import java.util.Date;
import java.util.Objects;

/* renamed from: rn.c */
public final class C19293c {

    /* renamed from: a */
    public final Date f49050a;

    /* renamed from: b */
    public final long f49051b;

    /* renamed from: c */
    public final long f49052c;

    /* renamed from: d */
    public final boolean f49053d;

    public C19293c(Date date, long j, long j2, boolean z) {
        this.f49050a = date;
        this.f49051b = j;
        this.f49052c = j2;
        this.f49053d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19293c.class != obj.getClass()) {
            return false;
        }
        C19293c cVar = (C19293c) obj;
        if (Objects.equals(this.f49050a, cVar.f49050a) && this.f49051b == cVar.f49051b && this.f49052c == cVar.f49052c && this.f49053d == cVar.f49053d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f49050a, Long.valueOf(this.f49051b), Long.valueOf(this.f49052c), Boolean.valueOf(this.f49053d)});
    }
}
