package p610kn;

import java.util.Objects;

/* renamed from: kn.b */
public final class C18108b {

    /* renamed from: a */
    public final String f46302a;

    /* renamed from: b */
    public final String f46303b;

    public C18108b(String str, String str2) {
        this.f46302a = str;
        this.f46303b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18108b.class != obj.getClass()) {
            return false;
        }
        C18108b bVar = (C18108b) obj;
        if (!Objects.equals(this.f46302a, bVar.f46302a) || !Objects.equals(this.f46303b, bVar.f46303b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46302a, this.f46303b});
    }
}
