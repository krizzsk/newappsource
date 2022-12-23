package p771rk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: rk.a */
public final class C19282a {

    /* renamed from: a */
    public final int f49010a;

    /* renamed from: b */
    public final String f49011b;

    /* renamed from: c */
    public final boolean f49012c;

    /* renamed from: d */
    public final List<String> f49013d;

    /* renamed from: e */
    public final List<String> f49014e;

    /* renamed from: f */
    public final List<String> f49015f;

    /* renamed from: g */
    public final List<String> f49016g;

    /* renamed from: h */
    public final List<String> f49017h;

    /* renamed from: i */
    public final List<String> f49018i;

    /* renamed from: j */
    public final List<String> f49019j;

    /* renamed from: k */
    public final List<List<Integer>> f49020k;

    public C19282a(int i, String str, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.f49010a = i;
        this.f49011b = str;
        this.f49012c = z;
        this.f49013d = arrayList;
        this.f49014e = arrayList2;
        this.f49015f = arrayList3;
        this.f49016g = arrayList4;
        this.f49017h = arrayList5;
        this.f49018i = arrayList6;
        this.f49019j = arrayList7;
        this.f49020k = arrayList8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19282a.class != obj.getClass()) {
            return false;
        }
        C19282a aVar = (C19282a) obj;
        if (this.f49010a != aVar.f49010a || this.f49012c != aVar.f49012c || !this.f49011b.equals(aVar.f49011b) || !Objects.equals(this.f49013d, aVar.f49013d) || !Objects.equals(this.f49014e, aVar.f49014e) || !Objects.equals(this.f49015f, aVar.f49015f) || !Objects.equals(this.f49016g, aVar.f49016g) || !Objects.equals(this.f49017h, aVar.f49017h) || !Objects.equals(this.f49018i, aVar.f49018i) || !Objects.equals(this.f49019j, aVar.f49019j) || !Objects.equals(this.f49020k, aVar.f49020k)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f49010a), this.f49011b, Boolean.valueOf(this.f49012c), this.f49013d, this.f49014e, this.f49015f, this.f49016g, this.f49017h, this.f49018i, this.f49019j, this.f49020k});
    }
}
