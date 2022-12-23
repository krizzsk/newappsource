package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3383c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.a */
public final class C3417a {

    /* renamed from: a */
    public final List<byte[]> f12209a;

    /* renamed from: b */
    public final int f12210b;

    /* renamed from: c */
    public final int f12211c;

    /* renamed from: d */
    public final int f12212d;

    /* renamed from: e */
    public final float f12213e;

    public C3417a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f12209a = list;
        this.f12210b = i;
        this.f12211c = i2;
        this.f12212d = i3;
        this.f12213e = f;
    }

    /* renamed from: a */
    public static byte[] m8630a(C3393k kVar) {
        int q = kVar.mo14562q();
        int i = kVar.f12122b;
        kVar.mo14551f(q);
        byte[] bArr = kVar.f12121a;
        byte[] bArr2 = C3383c.f12090a;
        byte[] bArr3 = new byte[(bArr2.length + q)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, q);
        return bArr3;
    }

    /* renamed from: b */
    public static C3417a m8631b(C3393k kVar) throws C3230l {
        float f;
        int i;
        int i2;
        try {
            kVar.mo14551f(4);
            int l = (kVar.mo14557l() & 3) + 1;
            if (l != 3) {
                ArrayList arrayList = new ArrayList();
                int l2 = kVar.mo14557l() & 31;
                for (int i3 = 0; i3 < l2; i3++) {
                    arrayList.add(m8630a(kVar));
                }
                int l3 = kVar.mo14557l();
                for (int i4 = 0; i4 < l3; i4++) {
                    arrayList.add(m8630a(kVar));
                }
                if (l2 > 0) {
                    C3389i.C3391b b = C3389i.m8527b((byte[]) arrayList.get(0), l, ((byte[]) arrayList.get(0)).length);
                    int i5 = b.f12108b;
                    int i6 = b.f12109c;
                    f = b.f12110d;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C3417a(arrayList, l, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C3230l("Error parsing AVC config", e);
        }
    }
}
