package p843uk;

import java.util.Objects;

/* renamed from: uk.m */
public final class C19943m implements C19949s {

    /* renamed from: a */
    public String f50656a;

    /* renamed from: b */
    public String f50657b;

    /* renamed from: c */
    public String f50658c;

    /* renamed from: d */
    public String f50659d;

    /* renamed from: e */
    public C19917a f50660e;

    /* renamed from: f */
    public boolean f50661f;

    public C19943m(String str, String str2, String str3, String str4, C19917a aVar, boolean z) {
        this.f50656a = str;
        this.f50657b = str2;
        this.f50658c = str3;
        this.f50659d = str4;
        this.f50660e = aVar;
        this.f50661f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19943m.class != obj.getClass()) {
            return false;
        }
        C19943m mVar = (C19943m) obj;
        if (this.f50661f != mVar.f50661f || !this.f50656a.equals(mVar.f50656a) || !this.f50657b.equals(mVar.f50657b) || !this.f50658c.equals(mVar.f50658c) || !this.f50659d.equals(mVar.f50659d) || !this.f50660e.equals(mVar.f50660e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50656a, this.f50657b, this.f50658c, this.f50659d, this.f50660e, Boolean.valueOf(this.f50661f)});
    }
}
