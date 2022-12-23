package p654mk;

import java.util.Objects;
import p819tk.C19687d;

/* renamed from: mk.k */
public final class C18389k extends C19687d {

    /* renamed from: d */
    public String f46870d;

    /* renamed from: e */
    public String f46871e;

    /* renamed from: f */
    public String f46872f;

    public C18389k(String str, String str2, String str3) {
        this.f46870d = str;
        this.f46871e = str2;
        this.f46872f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18389k.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18389k kVar = (C18389k) obj;
        if (!this.f46870d.equals(kVar.f46870d) || !this.f46871e.equals(kVar.f46871e) || !this.f46872f.equals(kVar.f46872f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46870d, this.f46871e, this.f46872f});
    }
}
