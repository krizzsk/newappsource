package p702ok;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ok.d */
public final class C18778d {

    /* renamed from: a */
    public final List<C18777c> f47803a;

    /* renamed from: b */
    public final List<C18776b> f47804b;

    public C18778d(ArrayList arrayList, ArrayList arrayList2) {
        this.f47803a = C21100e.m49362r0(arrayList);
        this.f47804b = C21100e.m49362r0(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18778d.class != obj.getClass()) {
            return false;
        }
        C18778d dVar = (C18778d) obj;
        List<C18777c> list = this.f47803a;
        if (list == null ? dVar.f47803a != null : !list.equals(dVar.f47803a)) {
            return false;
        }
        List<C18776b> list2 = this.f47804b;
        List<C18776b> list3 = dVar.f47804b;
        if (list2 != null) {
            return list2.equals(list3);
        }
        if (list3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        List<C18777c> list = this.f47803a;
        int i2 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<C18776b> list2 = this.f47804b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return i3 + i2;
    }
}
