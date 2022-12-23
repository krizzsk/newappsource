package p819tk;

import java.util.List;

/* renamed from: tk.d */
public abstract class C19687d {

    /* renamed from: a */
    public C19692i f49976a;

    /* renamed from: b */
    public String f49977b;

    /* renamed from: c */
    public List<C19685b> f49978c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C19687d dVar = (C19687d) obj;
        C19692i iVar = this.f49976a;
        if (iVar == null ? dVar.f49976a != null : !iVar.equals(dVar.f49976a)) {
            return false;
        }
        String str = this.f49977b;
        if (str == null ? dVar.f49977b != null : !str.equals(dVar.f49977b)) {
            return false;
        }
        List<C19685b> list = this.f49978c;
        List<C19685b> list2 = dVar.f49978c;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        C19692i iVar = this.f49976a;
        int i3 = 0;
        if (iVar != null) {
            i = iVar.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str = this.f49977b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List<C19685b> list = this.f49978c;
        if (list != null) {
            i3 = list.hashCode();
        }
        return i5 + i3;
    }
}
