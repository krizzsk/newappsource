package p277ub;

/* renamed from: ub.y */
public final class C6812y {

    /* renamed from: a */
    public long f21069a;

    /* renamed from: b */
    public long f21070b;

    /* renamed from: c */
    public long f21071c = -9223372036854775807L;

    public C6812y(long j) {
        this.f21069a = j;
    }

    /* renamed from: a */
    public final synchronized long mo23032a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f21071c != -9223372036854775807L) {
            this.f21071c = j;
        } else {
            long j2 = this.f21069a;
            if (j2 != Long.MAX_VALUE) {
                this.f21070b = j2 - j;
            }
            this.f21071c = j;
            notifyAll();
        }
        return j + this.f21070b;
    }

    /* renamed from: b */
    public final synchronized long mo23033b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f21071c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return mo23032a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long mo23034c() {
        long j;
        j = -9223372036854775807L;
        if (this.f21069a == Long.MAX_VALUE) {
            j = 0;
        } else if (this.f21071c != -9223372036854775807L) {
            j = this.f21070b;
        }
        return j;
    }
}
