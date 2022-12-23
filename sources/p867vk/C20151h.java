package p867vk;

import java.util.Objects;

/* renamed from: vk.h */
public final class C20151h {

    /* renamed from: a */
    public final long f51144a;

    /* renamed from: b */
    public final long f51145b;

    public C20151h(long j, long j2) {
        this.f51144a = j;
        this.f51145b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20151h.class != obj.getClass()) {
            return false;
        }
        C20151h hVar = (C20151h) obj;
        if (!Objects.equals(Long.valueOf(this.f51144a), Long.valueOf(hVar.f51144a)) || !Objects.equals(Long.valueOf(this.f51145b), Long.valueOf(hVar.f51145b))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f51144a), Long.valueOf(this.f51145b)});
    }
}
