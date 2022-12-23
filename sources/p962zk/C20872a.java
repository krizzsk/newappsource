package p962zk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p891wk.C20362q;

/* renamed from: zk.a */
public final class C20872a {

    /* renamed from: a */
    public final List<C20362q> f52608a;

    /* renamed from: b */
    public final int f52609b;

    public C20872a(ArrayList arrayList, int i) {
        this.f52608a = arrayList;
        this.f52609b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20872a.class != obj.getClass()) {
            return false;
        }
        C20872a aVar = (C20872a) obj;
        if (this.f52609b != aVar.f52609b || !this.f52608a.equals(aVar.f52608a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f52608a, Integer.valueOf(this.f52609b)});
    }
}
