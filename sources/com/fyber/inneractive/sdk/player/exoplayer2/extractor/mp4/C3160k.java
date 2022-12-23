package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k */
public final class C3160k {

    /* renamed from: a */
    public final int f11206a;

    /* renamed from: b */
    public final long[] f11207b;

    /* renamed from: c */
    public final int[] f11208c;

    /* renamed from: d */
    public final int f11209d;

    /* renamed from: e */
    public final long[] f11210e;

    /* renamed from: f */
    public final int[] f11211f;

    public C3160k(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8505a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        C3380a.m8505a(z2);
        C3380a.m8505a(iArr2.length != jArr2.length ? false : z3);
        this.f11207b = jArr;
        this.f11208c = iArr;
        this.f11209d = i;
        this.f11210e = jArr2;
        this.f11211f = iArr2;
        this.f11206a = jArr.length;
    }

    /* renamed from: a */
    public int mo14223a(long j) {
        for (int b = C3406u.m8599b(this.f11210e, j, true, false); b >= 0; b--) {
            if ((this.f11211f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo14224b(long j) {
        for (int a = C3406u.m8590a(this.f11210e, j, true, false); a < this.f11210e.length; a++) {
            if ((this.f11211f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
