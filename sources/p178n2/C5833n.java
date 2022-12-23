package p178n2;

import androidx.paging.DataSource;
import mf0.C24362h;

/* renamed from: n2.n */
public abstract class C5833n<T> extends DataSource<Integer, T> {

    /* renamed from: n2.n$a */
    public static abstract class C5834a<T> {
    }

    /* renamed from: n2.n$b */
    public static class C5835b {

        /* renamed from: a */
        public final int f18813a;

        /* renamed from: b */
        public final boolean f18814b;

        public C5835b(int i, int i2, int i3, boolean z) {
            boolean z2;
            boolean z3;
            this.f18813a = i3;
            this.f18814b = z;
            boolean z4 = false;
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (!(i3 >= 0 ? true : z4)) {
                        throw new IllegalStateException(C24362h.m61216k(Integer.valueOf(i3), "invalid page size: ").toString());
                    }
                    return;
                }
                throw new IllegalStateException(C24362h.m61216k(Integer.valueOf(i2), "invalid load size: ").toString());
            }
            throw new IllegalStateException(C24362h.m61216k(Integer.valueOf(i), "invalid start position: ").toString());
        }
    }

    /* renamed from: n2.n$c */
    public static abstract class C5836c<T> {
    }

    /* renamed from: n2.n$d */
    public static class C5837d {

        /* renamed from: a */
        public final int f18815a;

        public C5837d(int i, int i2) {
            this.f18815a = i;
        }
    }

    public C5833n() {
        super(DataSource.KeyType.POSITIONAL);
    }
}
