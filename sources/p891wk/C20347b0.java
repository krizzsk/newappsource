package p891wk;

import java.util.List;

/* renamed from: wk.b0 */
public final class C20347b0 {

    /* renamed from: a */
    public Integer f51520a;

    /* renamed from: b */
    public List<Integer> f51521b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20347b0.class != obj.getClass()) {
            return false;
        }
        C20347b0 b0Var = (C20347b0) obj;
        Integer num = this.f51520a;
        if (num == null ? b0Var.f51520a != null : !num.equals(b0Var.f51520a)) {
            return false;
        }
        List<Integer> list = this.f51521b;
        List<Integer> list2 = b0Var.f51521b;
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
        Integer num = this.f51520a;
        int i2 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<Integer> list = this.f51521b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }
}
