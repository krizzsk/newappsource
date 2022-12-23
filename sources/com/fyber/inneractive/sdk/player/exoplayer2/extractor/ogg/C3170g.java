package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3171h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g */
public final class C3170g extends C3171h {

    /* renamed from: o */
    public static final int f11246o = C3406u.m8589a("Opus");

    /* renamed from: p */
    public static final byte[] f11247p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f11248n;

    /* renamed from: a */
    public void mo14230a(boolean z) {
        super.mo14230a(z);
        if (z) {
            this.f11248n = false;
        }
    }

    /* renamed from: a */
    public long mo14229a(C3393k kVar) {
        byte[] bArr = kVar.f12121a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo14237a((long) (b3 * (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* renamed from: a */
    public boolean mo14231a(C3393k kVar, long j, C3171h.C3172a aVar) throws IOException, InterruptedException {
        C3393k kVar2 = kVar;
        boolean z = true;
        if (!this.f11248n) {
            byte[] copyOf = Arrays.copyOf(kVar2.f12121a, kVar2.f12123c);
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            mo14236a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            mo14236a(arrayList, 3840);
            aVar.f11262a = C3226i.m8178a((String) null, "audio/opus", (String) null, -1, -1, (int) b, 48000, -1, (List<byte[]>) arrayList, (C3059a) null, 0, (String) null);
            this.f11248n = true;
            return true;
        }
        if (kVar.mo14544c() != f11246o) {
            z = false;
        }
        kVar2.mo14549e(0);
        return z;
    }

    /* renamed from: a */
    public final void mo14236a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
