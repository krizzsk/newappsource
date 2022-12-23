package rf0;

/* renamed from: rf0.h */
public final class C24806h extends C24804f implements C24803e<Integer> {

    /* renamed from: e */
    public static final C24806h f62735e = new C24806h(1, 0);

    public C24806h(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: e */
    public final Comparable mo61244e() {
        return Integer.valueOf(this.f62728b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24806h) {
            if (!isEmpty() || !((C24806h) obj).isEmpty()) {
                C24806h hVar = (C24806h) obj;
                if (!(this.f62728b == hVar.f62728b && this.f62729c == hVar.f62729c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f62728b * 31) + this.f62729c;
    }

    /* renamed from: i */
    public final Comparable mo61247i() {
        return Integer.valueOf(this.f62729c);
    }

    public final boolean isEmpty() {
        if (this.f62728b > this.f62729c) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo61258s(int i) {
        if (this.f62728b > i || i > this.f62729c) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f62728b + ".." + this.f62729c;
    }
}
