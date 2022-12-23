package p891wk;

import java.util.List;

/* renamed from: wk.x */
public final class C20369x {

    /* renamed from: a */
    public List<C20352g> f51644a;

    /* renamed from: b */
    public List<String> f51645b;

    /* renamed from: c */
    public String f51646c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20369x.class != obj.getClass()) {
            return false;
        }
        C20369x xVar = (C20369x) obj;
        List<C20352g> list = this.f51644a;
        if (list == null ? xVar.f51644a != null : !list.equals(xVar.f51644a)) {
            return false;
        }
        List<String> list2 = this.f51645b;
        if (list2 == null ? xVar.f51645b != null : !list2.equals(xVar.f51645b)) {
            return false;
        }
        String str = this.f51646c;
        String str2 = xVar.f51646c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        List<C20352g> list = this.f51644a;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        List<String> list2 = this.f51645b;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.f51646c;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }
}
