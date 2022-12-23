package p819tk;

import java.util.Objects;

/* renamed from: tk.a */
public final class C19684a {

    /* renamed from: a */
    public final String f49969a;

    /* renamed from: b */
    public final String f49970b;

    /* renamed from: c */
    public final String f49971c;

    public C19684a(String str, String str2, String str3) {
        this.f49969a = str;
        this.f49970b = str2;
        this.f49971c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19684a.class != obj.getClass()) {
            return false;
        }
        C19684a aVar = (C19684a) obj;
        if (!this.f49969a.equals(aVar.f49969a) || !this.f49970b.equals(aVar.f49970b) || !Objects.equals(this.f49971c, aVar.f49971c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f49969a, this.f49970b, this.f49971c});
    }
}
