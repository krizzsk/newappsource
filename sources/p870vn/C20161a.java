package p870vn;

import java.util.Objects;
import p564in.C17623a;

/* renamed from: vn.a */
public final class C20161a implements C20163c {

    /* renamed from: a */
    public final C17623a f51172a;

    public C20161a(C17623a aVar) {
        this.f51172a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20161a.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f51172a, ((C20161a) obj).f51172a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51172a});
    }
}
