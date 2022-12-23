package p263t9;

/* renamed from: t9.f */
public final class C6613f extends C6618j {

    /* renamed from: a */
    public final long f20487a;

    public C6613f(long j) {
        this.f20487a = j;
    }

    /* renamed from: b */
    public final long mo22795b() {
        return this.f20487a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6618j) || this.f20487a != ((C6618j) obj).mo22795b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f20487a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return C25541a.m63884o(C13555b.m33972k("LogResponse{nextRequestWaitMillis="), this.f20487a, "}");
    }
}
