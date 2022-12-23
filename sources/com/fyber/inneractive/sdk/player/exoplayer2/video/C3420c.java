package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.c */
public final class C3420c {

    /* renamed from: a */
    public final List<byte[]> f12219a;

    /* renamed from: b */
    public final int f12220b;

    public C3420c(List<byte[]> list, int i) {
        this.f12219a = list;
        this.f12220b = i;
    }

    /* renamed from: a */
    public static C3420c m8632a(C3393k kVar) throws C3230l {
        List list;
        try {
            kVar.mo14551f(21);
            int l = kVar.mo14557l() & 3;
            int l2 = kVar.mo14557l();
            int i = kVar.f12122b;
            int i2 = 0;
            for (int i3 = 0; i3 < l2; i3++) {
                kVar.mo14551f(1);
                int q = kVar.mo14562q();
                for (int i4 = 0; i4 < q; i4++) {
                    int q2 = kVar.mo14562q();
                    i2 += q2 + 4;
                    kVar.mo14551f(q2);
                }
            }
            kVar.mo14549e(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < l2; i6++) {
                kVar.mo14551f(1);
                int q3 = kVar.mo14562q();
                for (int i7 = 0; i7 < q3; i7++) {
                    int q4 = kVar.mo14562q();
                    byte[] bArr2 = C3389i.f12100a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, length, q4);
                    i5 = length + q4;
                    kVar.mo14551f(q4);
                }
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C3420c(list, l + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C3230l("Error parsing HEVC config", e);
        }
    }
}
