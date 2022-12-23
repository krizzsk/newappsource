package p843uk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: uk.g0 */
public final class C19932g0 {

    /* renamed from: a */
    public final String f50620a;

    /* renamed from: b */
    public final String f50621b;

    /* renamed from: c */
    public final List<C19955y> f50622c;

    /* renamed from: d */
    public final String f50623d;

    /* renamed from: e */
    public final String f50624e;

    public C19932g0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f50620a = str;
        this.f50621b = str2;
        this.f50622c = arrayList;
        this.f50623d = str3;
        this.f50624e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19932g0.class != obj.getClass()) {
            return false;
        }
        C19932g0 g0Var = (C19932g0) obj;
        if (!Objects.equals(this.f50620a, g0Var.f50620a) || !this.f50621b.equals(g0Var.f50621b) || !this.f50622c.equals(g0Var.f50622c) || !this.f50623d.equals(g0Var.f50623d) || !this.f50624e.equals(g0Var.f50624e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50620a, this.f50621b, this.f50622c, this.f50623d, this.f50624e});
    }
}
