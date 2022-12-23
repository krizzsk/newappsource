package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.r */
public final class C3403r {

    /* renamed from: a */
    public long f12145a;

    /* renamed from: b */
    public long f12146b;

    /* renamed from: c */
    public volatile long f12147c = -9223372036854775807L;

    public C3403r(long j) {
        mo14585c(j);
    }

    /* renamed from: a */
    public long mo14582a() {
        if (this.f12145a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f12147c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f12146b;
    }

    /* renamed from: b */
    public long mo14584b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f12147c != -9223372036854775807L) {
            long j2 = (this.f12147c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return mo14583a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public synchronized void mo14585c(long j) {
        boolean z;
        if (this.f12147c == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8507b(z);
        this.f12145a = j;
    }

    /* renamed from: a */
    public long mo14583a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f12147c != -9223372036854775807L) {
            this.f12147c = j;
        } else {
            long j2 = this.f12145a;
            if (j2 != Long.MAX_VALUE) {
                this.f12146b = j2 - j;
            }
            synchronized (this) {
                this.f12147c = j;
                notifyAll();
            }
        }
        return j + this.f12146b;
    }
}
