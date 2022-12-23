package p843uk;

import java.util.ArrayList;
import java.util.List;
import p819tk.C19686c;

/* renamed from: uk.e */
public final class C19926e extends C19686c {

    /* renamed from: b */
    public final List<C19941l> f50606b;

    /* renamed from: uk.e$a */
    public static class C19927a {
    }

    public C19926e(ArrayList arrayList) {
        this.f50606b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19926e.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        List<C19941l> list = this.f50606b;
        List<C19941l> list2 = ((C19926e) obj).f50606b;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        List<C19941l> list = this.f50606b;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
