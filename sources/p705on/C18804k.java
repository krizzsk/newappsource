package p705on;

import ce0.C21100e;
import java.util.List;
import java.util.Objects;

/* renamed from: on.k */
public final class C18804k {

    /* renamed from: a */
    public final Long f47893a;

    /* renamed from: b */
    public final Integer f47894b;

    /* renamed from: c */
    public final List<C18800h> f47895c;

    /* renamed from: d */
    public final Integer f47896d;

    /* renamed from: e */
    public final String f47897e;

    public C18804k(String str, Long l, Integer num, Integer num2, List list) {
        this.f47896d = num;
        this.f47894b = num2;
        this.f47895c = C21100e.m49306F(list);
        this.f47897e = str;
        this.f47893a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18804k.class != obj.getClass()) {
            return false;
        }
        C18804k kVar = (C18804k) obj;
        if (!Objects.equals(this.f47896d, kVar.f47896d) || !Objects.equals(this.f47894b, kVar.f47894b) || !Objects.equals(this.f47895c, kVar.f47895c) || !Objects.equals(this.f47897e, kVar.f47897e) || !Objects.equals(this.f47893a, kVar.f47893a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47896d, this.f47894b, this.f47895c, this.f47897e, this.f47893a});
    }
}
