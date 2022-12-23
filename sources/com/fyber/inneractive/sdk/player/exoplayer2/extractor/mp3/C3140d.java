package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C3137b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d */
public final class C3140d implements C3137b.C3138a {

    /* renamed from: a */
    public final long f10957a;

    /* renamed from: b */
    public final long f10958b;

    /* renamed from: c */
    public final long f10959c;

    /* renamed from: d */
    public final long[] f10960d;

    /* renamed from: e */
    public final long f10961e;

    /* renamed from: f */
    public final int f10962f;

    public C3140d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f10957a = j;
        this.f10958b = j2;
        this.f10959c = j3;
        this.f10960d = jArr;
        this.f10961e = j4;
        this.f10962f = i;
    }

    /* renamed from: a */
    public boolean mo14079a() {
        return this.f10960d != null;
    }

    /* renamed from: b */
    public long mo14206b(long j) {
        long j2;
        long j3;
        long j4 = 0;
        if (mo14079a()) {
            long j5 = this.f10957a;
            if (j >= j5) {
                double d = (((double) (j - j5)) * 256.0d) / ((double) this.f10961e);
                int b = C3406u.m8599b(this.f10960d, (long) d, true, false) + 1;
                long j6 = this.f10958b;
                long j7 = (((long) b) * j6) / 100;
                if (b == 0) {
                    j2 = 0;
                } else {
                    j2 = this.f10960d[b - 1];
                }
                if (b == 99) {
                    j3 = 256;
                } else {
                    j3 = this.f10960d[b];
                }
                long j8 = (j6 * ((long) (b + 1))) / 100;
                if (j3 != j2) {
                    j4 = (long) (((d - ((double) j2)) * ((double) (j8 - j7))) / ((double) (j3 - j2)));
                }
                return j7 + j4;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public long mo14080c() {
        return this.f10958b;
    }

    /* renamed from: a */
    public long mo14078a(long j) {
        long j2;
        if (!mo14079a()) {
            return this.f10957a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.f10958b);
        float f2 = 256.0f;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else if (f < 100.0f) {
            int i = (int) f;
            if (i != 0) {
                f3 = (float) this.f10960d[i - 1];
            }
            if (i < 99) {
                f2 = (float) this.f10960d[i];
            }
            f2 = C16759e.m42347c(f, (float) i, f2 - f3, f3);
        }
        long round = Math.round(((double) f2) * 0.00390625d * ((double) this.f10961e));
        long j3 = this.f10957a;
        long j4 = round + j3;
        long j5 = this.f10959c;
        if (j5 != -1) {
            j2 = j5 - 1;
        } else {
            j2 = ((j3 - ((long) this.f10962f)) + this.f10961e) - 1;
        }
        return Math.min(j4, j2);
    }
}
