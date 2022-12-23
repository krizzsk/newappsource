package p843uk;

import ce0.C21100e;
import java.util.List;

/* renamed from: uk.h */
public final class C19933h {

    /* renamed from: a */
    public final List<C19935i> f50625a;

    public C19933h(List<C19935i> list) {
        this.f50625a = C21100e.m49362r0(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19933h.class != obj.getClass()) {
            return false;
        }
        List<C19935i> list = this.f50625a;
        List<C19935i> list2 = ((C19933h) obj).f50625a;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        List<C19935i> list = this.f50625a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
