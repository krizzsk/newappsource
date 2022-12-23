package rf0;

import java.util.Iterator;
import nf0.C24497a;

/* renamed from: rf0.i */
public class C24807i implements Iterable<Long>, C24497a {

    /* renamed from: b */
    public final long f62736b;

    /* renamed from: c */
    public final long f62737c;

    /* renamed from: d */
    public final long f62738d;

    public C24807i(long j, long j2) {
        this.f62736b = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f62737c = j2;
        this.f62738d = 1;
    }

    public final Iterator iterator() {
        return new C24808j(this.f62736b, this.f62737c, this.f62738d);
    }
}
