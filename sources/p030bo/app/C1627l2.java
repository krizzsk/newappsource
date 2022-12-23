package p030bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.UUID;

/* renamed from: bo.app.l2 */
public final class C1627l2 implements IPutIntoJson<String> {

    /* renamed from: a */
    public final UUID f5815a;

    /* renamed from: b */
    public final String f5816b;

    public C1627l2(UUID uuid) {
        this.f5815a = uuid;
        this.f5816b = uuid.toString();
    }

    /* renamed from: b */
    public static C1627l2 m4441b(String str) {
        return new C1627l2(UUID.fromString(str));
    }

    /* renamed from: v */
    public static C1627l2 m4442v() {
        return new C1627l2(UUID.randomUUID());
    }

    /* renamed from: e */
    public String forJsonPut() {
        return this.f5816b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1627l2.class != obj.getClass()) {
            return false;
        }
        return this.f5815a.equals(((C1627l2) obj).f5815a);
    }

    public int hashCode() {
        return this.f5815a.hashCode();
    }

    public String toString() {
        return this.f5816b;
    }
}
