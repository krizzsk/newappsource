package p867vk;

import java.util.Objects;

/* renamed from: vk.b */
public final class C20145b {

    /* renamed from: a */
    public final String f51129a;

    /* renamed from: b */
    public final long f51130b;

    public C20145b(String str, long j) {
        this.f51129a = str;
        this.f51130b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20145b.class != obj.getClass()) {
            return false;
        }
        C20145b bVar = (C20145b) obj;
        if (!Objects.equals(this.f51129a, bVar.f51129a) || this.f51130b != bVar.f51130b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51129a, Long.valueOf(this.f51130b)});
    }
}
