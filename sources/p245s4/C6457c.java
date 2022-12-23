package p245s4;

import p232r4.C6244d;

/* renamed from: s4.c */
public class C6457c extends C6458d {

    /* renamed from: d */
    public C6244d f20170d;

    public C6457c(int i, Object obj) {
        super(i, obj);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C6457c)) {
            return false;
        }
        C6244d dVar = this.f20170d;
        C6244d dVar2 = ((C6457c) obj).f20170d;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        C6244d dVar = this.f20170d;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
