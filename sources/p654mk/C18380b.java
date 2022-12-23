package p654mk;

import java.util.Objects;
import p819tk.C19687d;

/* renamed from: mk.b */
public final class C18380b extends C19687d {

    /* renamed from: d */
    public final String f46849d;

    /* renamed from: e */
    public final String f46850e;

    /* renamed from: f */
    public final String f46851f;

    /* renamed from: g */
    public final C18381c f46852g;

    public C18380b(String str, String str2, String str3, C18381c cVar) {
        this.f46849d = str;
        this.f46850e = str2;
        this.f46851f = str3;
        this.f46852g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18380b.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18380b bVar = (C18380b) obj;
        if (!this.f46849d.equals(bVar.f46849d) || !this.f46850e.equals(bVar.f46850e) || !this.f46851f.equals(bVar.f46851f) || !this.f46852g.equals(bVar.f46852g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46849d, this.f46850e, this.f46851f, this.f46852g});
    }
}
