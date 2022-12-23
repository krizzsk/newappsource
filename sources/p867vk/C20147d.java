package p867vk;

import java.util.Objects;

/* renamed from: vk.d */
public final class C20147d {

    /* renamed from: a */
    public final String f51134a;

    /* renamed from: b */
    public final long f51135b;

    /* renamed from: c */
    public final long f51136c;

    public C20147d(String str, long j, long j2) {
        this.f51134a = str;
        this.f51135b = j;
        this.f51136c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20147d.class != obj.getClass()) {
            return false;
        }
        C20147d dVar = (C20147d) obj;
        if (Objects.equals(this.f51134a, dVar.f51134a) && this.f51135b == dVar.f51135b && this.f51136c == dVar.f51136c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51134a, Long.valueOf(this.f51135b), Long.valueOf(this.f51136c)});
    }
}
