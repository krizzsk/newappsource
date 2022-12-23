package rf0;

import cf0.C21148v;
import java.util.NoSuchElementException;

/* renamed from: rf0.j */
public final class C24808j extends C21148v {

    /* renamed from: b */
    public final long f62739b;

    /* renamed from: c */
    public final long f62740c;

    /* renamed from: d */
    public boolean f62741d;

    /* renamed from: e */
    public long f62742e;

    public C24808j(long j, long j2, long j3) {
        this.f62739b = j3;
        this.f62740c = j2;
        boolean z = true;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.f62741d = z;
        this.f62742e = !z ? j2 : j;
    }

    public final boolean hasNext() {
        return this.f62741d;
    }

    public final long nextLong() {
        long j = this.f62742e;
        if (j != this.f62740c) {
            this.f62742e = this.f62739b + j;
        } else if (this.f62741d) {
            this.f62741d = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}
