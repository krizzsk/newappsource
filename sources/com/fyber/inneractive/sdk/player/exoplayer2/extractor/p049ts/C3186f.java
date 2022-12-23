package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C3048e;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f */
public final class C3186f implements C3188h {

    /* renamed from: a */
    public final C3393k f11326a;

    /* renamed from: b */
    public final String f11327b;

    /* renamed from: c */
    public String f11328c;

    /* renamed from: d */
    public C3161n f11329d;

    /* renamed from: e */
    public int f11330e = 0;

    /* renamed from: f */
    public int f11331f;

    /* renamed from: g */
    public int f11332g;

    /* renamed from: h */
    public long f11333h;

    /* renamed from: i */
    public C3226i f11334i;

    /* renamed from: j */
    public int f11335j;

    /* renamed from: k */
    public long f11336k;

    public C3186f(String str) {
        C3393k kVar = new C3393k(new byte[15]);
        this.f11326a = kVar;
        byte[] bArr = kVar.f12121a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.f11327b = str;
    }

    /* renamed from: a */
    public void mo14242a() {
        this.f11330e = 0;
        this.f11331f = 0;
        this.f11332g = 0;
    }

    /* renamed from: b */
    public void mo14246b() {
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        this.f11328c = dVar.mo14272b();
        this.f11329d = hVar.mo14122a(dVar.mo14273c(), 1);
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        this.f11336k = j;
    }

    /* renamed from: a */
    public void mo14245a(C3393k kVar) {
        int i;
        C3393k kVar2 = kVar;
        while (kVar.mo14537a() > 0) {
            int i2 = this.f11330e;
            boolean z = false;
            if (i2 == 0) {
                while (true) {
                    if (kVar.mo14537a() <= 0) {
                        break;
                    }
                    int i3 = this.f11332g << 8;
                    this.f11332g = i3;
                    int l = i3 | kVar.mo14557l();
                    this.f11332g = l;
                    if (l == 2147385345) {
                        this.f11332g = 0;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    this.f11331f = 4;
                    this.f11330e = 1;
                }
            } else if (i2 == 1) {
                byte[] bArr = this.f11326a.f12121a;
                int min = Math.min(kVar.mo14537a(), 15 - this.f11331f);
                System.arraycopy(kVar2.f12121a, kVar2.f12122b, bArr, this.f11331f, min);
                kVar2.f12122b += min;
                int i4 = this.f11331f + min;
                this.f11331f = i4;
                if (i4 == 15) {
                    byte[] bArr2 = this.f11326a.f12121a;
                    if (this.f11334i == null) {
                        String str = this.f11328c;
                        String str2 = this.f11327b;
                        C3392j jVar = new C3392j(bArr2, bArr2.length);
                        jVar.mo14536c(60);
                        int i5 = C3048e.f10463a[jVar.mo14532a(6)];
                        int i6 = C3048e.f10464b[jVar.mo14532a(4)];
                        int a = jVar.mo14532a(5);
                        int[] iArr = C3048e.f10465c;
                        if (a >= iArr.length) {
                            i = -1;
                        } else {
                            i = (iArr[a] * 1000) / 2;
                        }
                        jVar.mo14536c(10);
                        C3226i a2 = C3226i.m8178a(str, "audio/vnd.dts", (String) null, i, -1, i5 + (jVar.mo14532a(2) > 0 ? 1 : 0), i6, -1, (List<byte[]>) null, (C3059a) null, 0, str2);
                        this.f11334i = a2;
                        this.f11329d.mo14098a(a2);
                    }
                    byte b = bArr2[5];
                    this.f11335j = (((b & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f11333h = (long) ((int) ((((long) (((((bArr2[4] & 1) << 6) | ((b & 252) >> 2)) + 1) * 32)) * 1000000) / ((long) this.f11334i.f11646s)));
                    this.f11326a.mo14549e(0);
                    this.f11329d.mo14099a(this.f11326a, 15);
                    this.f11330e = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(kVar.mo14537a(), this.f11335j - this.f11331f);
                this.f11329d.mo14099a(kVar2, min2);
                int i7 = this.f11331f + min2;
                this.f11331f = i7;
                int i8 = this.f11335j;
                if (i7 == i8) {
                    this.f11329d.mo14096a(this.f11336k, 1, i8, 0, (byte[]) null);
                    this.f11336k += this.f11333h;
                    this.f11330e = 0;
                }
            }
        }
    }
}
