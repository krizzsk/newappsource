package p061d7;

import ce0.C21100e;

/* renamed from: d7.b */
public final class C4403b {

    /* renamed from: a */
    public final int f15464a;

    /* renamed from: b */
    public final int f15465b;

    public C4403b(int i, int i2) {
        this.f15464a = i;
        this.f15465b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4403b)) {
            return false;
        }
        C4403b bVar = (C4403b) obj;
        return this.f15464a == bVar.f15464a && this.f15465b == bVar.f15465b;
    }

    public final int hashCode() {
        return this.f15465b + (this.f15464a * 31);
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("UMOAdKitSize(width=");
        J0.append(this.f15464a);
        J0.append(", height=");
        return C16530d.m42014g(J0, this.f15465b, ')');
    }

    public C4403b() {
        this(0, 0);
    }
}
