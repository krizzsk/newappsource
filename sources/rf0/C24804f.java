package rf0;

import com.google.android.play.core.assetpacks.C14256d1;
import nf0.C24497a;

/* renamed from: rf0.f */
public class C24804f implements Iterable<Integer>, C24497a {

    /* renamed from: b */
    public final int f62728b;

    /* renamed from: c */
    public final int f62729c;

    /* renamed from: d */
    public final int f62730d;

    public C24804f(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f62728b = i;
            this.f62729c = C14256d1.m35488f(i, i2, i3);
            this.f62730d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C24804f) {
            if (!isEmpty() || !((C24804f) obj).isEmpty()) {
                C24804f fVar = (C24804f) obj;
                if (!(this.f62728b == fVar.f62728b && this.f62729c == fVar.f62729c && this.f62730d == fVar.f62730d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f62728b * 31) + this.f62729c) * 31) + this.f62730d;
    }

    public boolean isEmpty() {
        if (this.f62730d > 0) {
            if (this.f62728b > this.f62729c) {
                return true;
            }
        } else if (this.f62728b < this.f62729c) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final C24805g iterator() {
        return new C24805g(this.f62728b, this.f62729c, this.f62730d);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f62730d > 0) {
            sb = new StringBuilder();
            sb.append(this.f62728b);
            sb.append("..");
            sb.append(this.f62729c);
            sb.append(" step ");
            i = this.f62730d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f62728b);
            sb.append(" downTo ");
            sb.append(this.f62729c);
            sb.append(" step ");
            i = -this.f62730d;
        }
        sb.append(i);
        return sb.toString();
    }
}
