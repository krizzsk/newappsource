package p752qn;

import java.util.Objects;

/* renamed from: qn.b */
public final class C19144b {

    /* renamed from: a */
    public final String f48678a;

    /* renamed from: b */
    public final String f48679b;

    /* renamed from: c */
    public final String f48680c;

    /* renamed from: d */
    public final String f48681d;

    /* renamed from: e */
    public final String f48682e;

    /* renamed from: f */
    public final boolean f48683f;

    /* renamed from: g */
    public final boolean f48684g;

    public C19144b(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f48678a = str;
        this.f48679b = str2;
        this.f48680c = str3;
        this.f48681d = str4;
        this.f48682e = str5;
        this.f48683f = z;
        this.f48684g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19144b.class != obj.getClass()) {
            return false;
        }
        C19144b bVar = (C19144b) obj;
        if (this.f48683f != bVar.f48683f || this.f48684g != bVar.f48684g || !this.f48678a.equals(bVar.f48678a) || !this.f48679b.equals(bVar.f48679b) || !this.f48680c.equals(bVar.f48680c) || !this.f48681d.equals(bVar.f48681d) || !Objects.equals(this.f48682e, bVar.f48682e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48678a, this.f48679b, this.f48680c, this.f48681d, this.f48682e, Boolean.valueOf(this.f48683f), Boolean.valueOf(this.f48684g)});
    }
}
