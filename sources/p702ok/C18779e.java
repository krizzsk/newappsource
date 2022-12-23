package p702ok;

import java.util.Objects;

/* renamed from: ok.e */
public final class C18779e {

    /* renamed from: a */
    public String f47805a;

    /* renamed from: b */
    public long f47806b;

    public C18779e(String str, long j) {
        this.f47805a = str;
        this.f47806b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18779e.class != obj.getClass()) {
            return false;
        }
        C18779e eVar = (C18779e) obj;
        if (this.f47806b != eVar.f47806b || !Objects.equals(this.f47805a, eVar.f47805a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47805a, Long.valueOf(this.f47806b)});
    }
}
