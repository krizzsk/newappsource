package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f */
public final class C3135f {

    /* renamed from: d */
    public static final long[] f10932d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f10933a = new byte[8];

    /* renamed from: b */
    public int f10934b;

    /* renamed from: c */
    public int f10935c;

    /* renamed from: a */
    public long mo14205a(C3087g gVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f10934b == 0) {
            if (!((C3072b) gVar).mo14087b(this.f10933a, 0, 1, z)) {
                return -1;
            }
            int a = m7878a(this.f10933a[0] & 255);
            this.f10935c = a;
            if (a != -1) {
                this.f10934b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f10935c;
        if (i2 > i) {
            this.f10934b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((C3072b) gVar).mo14087b(this.f10933a, 1, i2 - 1, false);
        }
        this.f10934b = 0;
        return m7879a(this.f10933a, this.f10935c, z2);
    }

    /* renamed from: a */
    public static int m7878a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f10932d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public static long m7879a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f10932d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
