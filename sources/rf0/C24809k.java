package rf0;

/* renamed from: rf0.k */
public final class C24809k extends C24807i implements C24803e<Long> {
    static {
        new C24809k(1, 0);
    }

    public C24809k(long j, long j2) {
        super(j, j2);
    }

    /* renamed from: e */
    public final Comparable mo61244e() {
        return Long.valueOf(this.f62736b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24809k) {
            if (!isEmpty() || !((C24809k) obj).isEmpty()) {
                C24809k kVar = (C24809k) obj;
                if (!(this.f62736b == kVar.f62736b && this.f62737c == kVar.f62737c)) {
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
        long j = this.f62736b;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.f62737c;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    /* renamed from: i */
    public final Comparable mo61247i() {
        return Long.valueOf(this.f62737c);
    }

    public final boolean isEmpty() {
        if (this.f62736b > this.f62737c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f62736b + ".." + this.f62737c;
    }
}
