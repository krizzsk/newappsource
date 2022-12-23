package p843uk;

import java.util.List;
import java.util.Objects;

/* renamed from: uk.k */
public final class C19939k {

    /* renamed from: a */
    public final String f50643a;

    /* renamed from: b */
    public final String f50644b;

    /* renamed from: c */
    public final List<String> f50645c;

    /* renamed from: d */
    public final List<String> f50646d;

    public C19939k(String str, String str2, List<String> list, List<String> list2) {
        this.f50643a = str;
        this.f50644b = str2;
        this.f50645c = list;
        this.f50646d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19939k.class != obj.getClass()) {
            return false;
        }
        C19939k kVar = (C19939k) obj;
        if (!this.f50645c.equals(kVar.f50645c) || !this.f50643a.equals(kVar.f50643a) || !this.f50644b.equals(kVar.f50644b) || !this.f50646d.equals(kVar.f50646d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50645c, this.f50643a, this.f50644b, this.f50646d});
    }
}
