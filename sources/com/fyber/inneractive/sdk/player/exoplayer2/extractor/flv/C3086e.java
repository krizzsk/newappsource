package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C3084d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C3417a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.e */
public final class C3086e extends C3084d {

    /* renamed from: b */
    public final C3393k f10609b = new C3393k(C3389i.f12100a);

    /* renamed from: c */
    public final C3393k f10610c = new C3393k(4);

    /* renamed from: d */
    public int f10611d;

    /* renamed from: e */
    public boolean f10612e;

    /* renamed from: f */
    public int f10613f;

    public C3086e(C3161n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    public boolean mo14117a(C3393k kVar) throws C3084d.C3085a {
        int l = kVar.mo14557l();
        int i = (l >> 4) & 15;
        int i2 = l & 15;
        if (i2 == 7) {
            this.f10613f = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new C3084d.C3085a(C16759e.m42349e("Video format not supported: ", i2));
    }

    /* renamed from: b */
    public void mo14118b(C3393k kVar, long j) throws C3230l {
        int i;
        int l = kVar.mo14557l();
        long n = (((long) kVar.mo14559n()) * 1000) + j;
        if (l == 0 && !this.f10612e) {
            C3393k kVar2 = new C3393k(new byte[kVar.mo14537a()]);
            kVar.mo14541a(kVar2.f12121a, 0, kVar.mo14537a());
            C3417a b = C3417a.m8631b(kVar2);
            this.f10611d = b.f12210b;
            this.f10608a.mo14098a(C3226i.m8175a((String) null, "video/avc", (String) null, -1, -1, b.f12211c, b.f12212d, -1.0f, b.f12209a, -1, b.f12213e, (C3059a) null));
            this.f10612e = true;
        } else if (l == 1 && this.f10612e) {
            byte[] bArr = this.f10610c.f12121a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i2 = 4 - this.f10611d;
            int i3 = 0;
            while (kVar.mo14537a() > 0) {
                kVar.mo14541a(this.f10610c.f12121a, i2, this.f10611d);
                this.f10610c.mo14549e(0);
                int o = this.f10610c.mo14560o();
                this.f10609b.mo14549e(0);
                this.f10608a.mo14099a(this.f10609b, 4);
                this.f10608a.mo14099a(kVar, o);
                i3 = i3 + 4 + o;
            }
            C3161n nVar = this.f10608a;
            if (this.f10613f == 1) {
                i = 1;
            } else {
                i = 0;
            }
            nVar.mo14096a(n, i, i3, 0, (byte[]) null);
        }
    }
}
