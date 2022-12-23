package p843uk;

import ce0.C21100e;
import java.util.List;

/* renamed from: uk.i */
public final class C19935i {

    /* renamed from: a */
    public final String f50627a;

    /* renamed from: b */
    public final List<String> f50628b;

    public C19935i(String str, List<String> list) {
        this.f50627a = str;
        this.f50628b = C21100e.m49362r0(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19935i.class != obj.getClass()) {
            return false;
        }
        C19935i iVar = (C19935i) obj;
        String str = this.f50627a;
        if (str == null ? iVar.f50627a != null : !str.equals(iVar.f50627a)) {
            return false;
        }
        List<String> list = this.f50628b;
        List<String> list2 = iVar.f50628b;
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
        String str = this.f50627a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<String> list = this.f50628b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }
}
