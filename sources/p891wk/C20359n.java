package p891wk;

import java.util.List;
import p702ok.C18777c;

/* renamed from: wk.n */
public final class C20359n {

    /* renamed from: a */
    public Integer f51567a;

    /* renamed from: b */
    public Integer f51568b;

    /* renamed from: c */
    public C18777c f51569c;

    /* renamed from: d */
    public C18777c f51570d;

    /* renamed from: e */
    public List<Integer> f51571e;

    /* renamed from: f */
    public List<C18777c> f51572f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20359n.class != obj.getClass()) {
            return false;
        }
        C20359n nVar = (C20359n) obj;
        Integer num = this.f51567a;
        if (num == null ? nVar.f51567a != null : !num.equals(nVar.f51567a)) {
            return false;
        }
        Integer num2 = this.f51568b;
        if (num2 == null ? nVar.f51568b != null : !num2.equals(nVar.f51568b)) {
            return false;
        }
        C18777c cVar = this.f51569c;
        if (cVar == null ? nVar.f51569c != null : !cVar.equals(nVar.f51569c)) {
            return false;
        }
        C18777c cVar2 = this.f51570d;
        if (cVar2 == null ? nVar.f51570d != null : !cVar2.equals(nVar.f51570d)) {
            return false;
        }
        List<Integer> list = this.f51571e;
        if (list == null ? nVar.f51571e != null : !list.equals(nVar.f51571e)) {
            return false;
        }
        List<C18777c> list2 = this.f51572f;
        List<C18777c> list3 = nVar.f51572f;
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
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num = this.f51567a;
        int i6 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        Integer num2 = this.f51568b;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        C18777c cVar = this.f51569c;
        if (cVar != null) {
            i3 = cVar.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        C18777c cVar2 = this.f51570d;
        if (cVar2 != null) {
            i4 = cVar2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i9 + i4) * 31;
        List<Integer> list = this.f51571e;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        List<C18777c> list2 = this.f51572f;
        if (list2 != null) {
            i6 = list2.hashCode();
        }
        return i12 + i6;
    }
}
