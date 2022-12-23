package p702ok;

import ce0.C21100e;
import java.util.List;

/* renamed from: ok.b */
public final class C18776b {

    /* renamed from: a */
    public final Integer f47786a;

    /* renamed from: b */
    public final String f47787b;

    /* renamed from: c */
    public final List<Integer> f47788c;

    /* renamed from: d */
    public final String f47789d;

    /* renamed from: e */
    public final boolean f47790e;

    /* renamed from: f */
    public final boolean f47791f;

    public C18776b() {
        throw null;
    }

    public C18776b(Integer num, String str, List list, String str2, boolean z, boolean z2) {
        this.f47786a = num;
        this.f47787b = str;
        this.f47788c = C21100e.m49362r0(list);
        this.f47789d = str2;
        this.f47790e = z;
        this.f47791f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18776b.class != obj.getClass()) {
            return false;
        }
        C18776b bVar = (C18776b) obj;
        if (this.f47790e != bVar.f47790e || this.f47791f != bVar.f47791f || !this.f47786a.equals(bVar.f47786a) || !this.f47787b.equals(bVar.f47787b)) {
            return false;
        }
        List<Integer> list = this.f47788c;
        if (list == null ? bVar.f47788c == null : list.equals(bVar.f47788c)) {
            return this.f47789d.equals(bVar.f47789d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f47787b, this.f47786a.hashCode() * 31, 31);
        List<Integer> list = this.f47788c;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return ((C13715c.m34238d(this.f47789d, (d + i) * 31, 31) + (this.f47790e ? 1 : 0)) * 31) + (this.f47791f ? 1 : 0);
    }
}
