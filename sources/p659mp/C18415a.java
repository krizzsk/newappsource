package p659mp;

/* renamed from: mp.a */
public final class C18415a {

    /* renamed from: a */
    public final long f46965a;

    /* renamed from: b */
    public final long f46966b;

    /* renamed from: c */
    public final long f46967c;

    /* renamed from: d */
    public final boolean f46968d;

    public C18415a(long j, long j2, long j3, boolean z) {
        this.f46965a = j;
        this.f46966b = j2;
        this.f46967c = j3;
        this.f46968d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18415a.class != obj.getClass()) {
            return false;
        }
        C18415a aVar = (C18415a) obj;
        if (this.f46965a == aVar.f46965a && this.f46966b == aVar.f46966b && this.f46967c == aVar.f46967c && this.f46968d == aVar.f46968d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f46965a;
        long j2 = this.f46966b;
        long j3 = this.f46967c;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f46968d ? 1 : 0);
    }
}
