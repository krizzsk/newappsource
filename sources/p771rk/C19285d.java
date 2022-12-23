package p771rk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: rk.d */
public final class C19285d {

    /* renamed from: a */
    public final String f49025a;

    /* renamed from: b */
    public final boolean f49026b;

    /* renamed from: c */
    public final List<C19284c> f49027c;

    /* renamed from: d */
    public final List<C19282a> f49028d;

    public C19285d(String str, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.f49025a = str;
        this.f49026b = z;
        this.f49027c = arrayList;
        this.f49028d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19285d.class != obj.getClass()) {
            return false;
        }
        C19285d dVar = (C19285d) obj;
        if (this.f49026b != dVar.f49026b || !Objects.equals(this.f49025a, dVar.f49025a) || !Objects.equals(this.f49027c, dVar.f49027c) || !Objects.equals(this.f49028d, dVar.f49028d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f49025a, Boolean.valueOf(this.f49026b), this.f49027c, this.f49028d});
    }
}
