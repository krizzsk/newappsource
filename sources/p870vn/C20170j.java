package p870vn;

import java.util.Objects;
import p586jn.C17900f;

/* renamed from: vn.j */
public final class C20170j implements C20163c {

    /* renamed from: a */
    public final C17900f f51178a;

    public C20170j(C17900f fVar) {
        this.f51178a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20170j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f51178a, ((C20170j) obj).f51178a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51178a});
    }
}
