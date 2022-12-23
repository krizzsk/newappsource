package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e */
public final class C3134e {

    /* renamed from: a */
    public final C3393k f10930a = new C3393k(8);

    /* renamed from: b */
    public int f10931b;

    /* renamed from: a */
    public final long mo14204a(C3087g gVar) throws IOException, InterruptedException {
        C3072b bVar = (C3072b) gVar;
        int i = 0;
        bVar.mo14085a(this.f10930a.f12121a, 0, 1, false);
        byte b = this.f10930a.f12121a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = RecyclerView.C1119a0.FLAG_IGNORE;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        bVar.mo14085a(this.f10930a.f12121a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f10930a.f12121a[i] & 255) + (i4 << 8);
        }
        this.f10931b = i3 + 1 + this.f10931b;
        return (long) i4;
    }
}
