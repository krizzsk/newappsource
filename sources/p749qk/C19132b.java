package p749qk;

import java.util.Objects;

/* renamed from: qk.b */
public final class C19132b {

    /* renamed from: a */
    public final String f48645a;

    /* renamed from: b */
    public final String f48646b;

    /* renamed from: c */
    public final String f48647c;

    /* renamed from: d */
    public final int f48648d;

    /* renamed from: e */
    public final long f48649e;

    /* renamed from: f */
    public final String f48650f;

    /* renamed from: g */
    public final C19131a f48651g;

    public C19132b(String str, String str2, String str3, int i, long j, String str4, C19131a aVar) {
        this.f48645a = str;
        this.f48646b = str2;
        this.f48647c = str3;
        this.f48648d = i;
        this.f48649e = j;
        this.f48650f = str4;
        this.f48651g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19132b.class != obj.getClass()) {
            return false;
        }
        C19132b bVar = (C19132b) obj;
        if (this.f48648d != bVar.f48648d || this.f48649e != bVar.f48649e || !this.f48645a.equals(bVar.f48645a) || !this.f48646b.equals(bVar.f48646b) || !this.f48647c.equals(bVar.f48647c) || !this.f48650f.equals(bVar.f48650f) || !this.f48651g.equals(bVar.f48651g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48645a, this.f48646b, this.f48647c, Integer.valueOf(this.f48648d), Long.valueOf(this.f48649e), this.f48650f, this.f48651g});
    }
}
