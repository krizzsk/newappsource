package p891wk;

import java.util.List;

/* renamed from: wk.v */
public final class C20367v {

    /* renamed from: a */
    public List<C20365t> f51642a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20367v.class != obj.getClass()) {
            return false;
        }
        List<C20365t> list = this.f51642a;
        List<C20365t> list2 = ((C20367v) obj).f51642a;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        List<C20365t> list = this.f51642a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
