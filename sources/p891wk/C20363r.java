package p891wk;

import java.util.Objects;
import p795sk.C19468a;

/* renamed from: wk.r */
public final class C20363r {

    /* renamed from: a */
    public final long f51621a;

    /* renamed from: b */
    public final C19468a f51622b;

    public C20363r(long j, C19468a aVar) {
        this.f51621a = j;
        this.f51622b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20363r.class != obj.getClass()) {
            return false;
        }
        C20363r rVar = (C20363r) obj;
        if (this.f51621a != rVar.f51621a || !Objects.equals(this.f51622b, rVar.f51622b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f51621a), this.f51622b});
    }
}
