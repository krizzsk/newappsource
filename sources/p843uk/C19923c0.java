package p843uk;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;
import p819tk.C19687d;

/* renamed from: uk.c0 */
public final class C19923c0 extends C19687d {

    /* renamed from: d */
    public final List<C19918a0> f50596d;

    public C19923c0(ArrayList arrayList) {
        this.f50596d = C21100e.m49362r0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19923c0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        List<C19918a0> list = this.f50596d;
        List<C19918a0> list2 = ((C19923c0) obj).f50596d;
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
        List<C19918a0> list = this.f50596d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
