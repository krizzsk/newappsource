package p610kn;

import java.util.Objects;

/* renamed from: kn.a */
public final class C18107a {

    /* renamed from: a */
    public final String f46300a;

    /* renamed from: b */
    public final Long f46301b;

    public C18107a(String str, Long l) {
        this.f46300a = str;
        this.f46301b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18107a.class != obj.getClass()) {
            return false;
        }
        C18107a aVar = (C18107a) obj;
        if (!Objects.equals(this.f46300a, aVar.f46300a) || !Objects.equals(this.f46301b, aVar.f46301b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46300a, this.f46301b});
    }
}
