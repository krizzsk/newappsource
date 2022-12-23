package p891wk;

import java.util.Objects;
import p752qn.C19148f;

/* renamed from: wk.l */
public final class C20357l {

    /* renamed from: a */
    public final String f51561a;

    /* renamed from: b */
    public final String f51562b;

    /* renamed from: c */
    public final boolean f51563c;

    /* renamed from: d */
    public final String f51564d;

    /* renamed from: e */
    public final C19148f f51565e;

    public C20357l(String str, String str2, boolean z, String str3, C19148f fVar) {
        this.f51561a = str;
        this.f51562b = str2;
        this.f51563c = z;
        this.f51564d = str3;
        this.f51565e = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20357l.class != obj.getClass()) {
            return false;
        }
        C20357l lVar = (C20357l) obj;
        if (this.f51563c != lVar.f51563c || !this.f51561a.equals(lVar.f51561a) || !this.f51562b.equals(lVar.f51562b) || !Objects.equals(this.f51564d, lVar.f51564d) || !this.f51565e.equals(lVar.f51565e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51561a, this.f51562b, Boolean.valueOf(this.f51563c), this.f51564d, this.f51565e});
    }
}
