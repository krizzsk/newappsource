package p795sk;

import java.util.Objects;

/* renamed from: sk.a */
public final class C19468a {

    /* renamed from: a */
    public final double f49497a;

    /* renamed from: b */
    public final double f49498b;

    /* renamed from: c */
    public final double f49499c;

    /* renamed from: d */
    public final long f49500d;

    public C19468a(double d, double d2, double d3, long j) {
        this.f49498b = d2;
        this.f49497a = d;
        this.f49499c = d3;
        this.f49500d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19468a.class != obj.getClass()) {
            return false;
        }
        C19468a aVar = (C19468a) obj;
        if (Double.compare(aVar.f49497a, this.f49497a) == 0 && Double.compare(aVar.f49498b, this.f49498b) == 0 && Double.compare(aVar.f49499c, this.f49499c) == 0 && this.f49500d == aVar.f49500d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Double.valueOf(this.f49497a), Double.valueOf(this.f49498b), Double.valueOf(this.f49499c), Long.valueOf(this.f49500d)});
    }
}
