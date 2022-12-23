package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C3035a;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b */
public final class C3182b implements C3188h {

    /* renamed from: a */
    public final C3392j f11289a;

    /* renamed from: b */
    public final C3393k f11290b;

    /* renamed from: c */
    public final String f11291c;

    /* renamed from: d */
    public String f11292d;

    /* renamed from: e */
    public C3161n f11293e;

    /* renamed from: f */
    public int f11294f = 0;

    /* renamed from: g */
    public int f11295g;

    /* renamed from: h */
    public boolean f11296h;

    /* renamed from: i */
    public long f11297i;

    /* renamed from: j */
    public C3226i f11298j;

    /* renamed from: k */
    public int f11299k;

    /* renamed from: l */
    public long f11300l;

    public C3182b(String str) {
        byte[] bArr = new byte[8];
        this.f11289a = new C3392j(bArr);
        this.f11290b = new C3393k(bArr);
        this.f11291c = str;
    }

    /* renamed from: a */
    public void mo14242a() {
        this.f11294f = 0;
        this.f11295g = 0;
        this.f11296h = false;
    }

    /* renamed from: b */
    public void mo14246b() {
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        this.f11292d = dVar.mo14272b();
        this.f11293e = hVar.mo14122a(dVar.mo14273c(), 1);
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        this.f11300l = j;
    }

    /* renamed from: a */
    public void mo14245a(C3393k kVar) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        C3393k kVar2 = kVar;
        while (kVar.mo14537a() > 0) {
            int i5 = this.f11294f;
            if (i5 == 0) {
                while (true) {
                    if (kVar.mo14537a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.f11296h) {
                        this.f11296h = kVar.mo14557l() == 11;
                    } else {
                        int l = kVar.mo14557l();
                        if (l == 119) {
                            this.f11296h = false;
                            z = true;
                            break;
                        }
                        this.f11296h = l == 11;
                    }
                }
                if (z) {
                    this.f11294f = 1;
                    byte[] bArr = this.f11290b.f12121a;
                    bArr[0] = 11;
                    bArr[1] = 119;
                    this.f11295g = 2;
                }
            } else if (i5 == 1) {
                byte[] bArr2 = this.f11290b.f12121a;
                int min = Math.min(kVar.mo14537a(), 8 - this.f11295g);
                System.arraycopy(kVar2.f12121a, kVar2.f12122b, bArr2, this.f11295g, min);
                kVar2.f12122b += min;
                int i6 = this.f11295g + min;
                this.f11295g = i6;
                if (i6 == 8) {
                    this.f11289a.mo14534b(0);
                    C3392j jVar = this.f11289a;
                    int i7 = (jVar.f12118b * 8) + jVar.f12119c;
                    jVar.mo14536c(40);
                    boolean z2 = jVar.mo14532a(5) == 16;
                    jVar.mo14534b(i7);
                    int i8 = 6;
                    if (z2) {
                        jVar.mo14536c(21);
                        i4 = (jVar.mo14532a(11) + 1) * 2;
                        int a = jVar.mo14532a(2);
                        if (a == 3) {
                            i3 = C3035a.f10377c[jVar.mo14532a(2)];
                        } else {
                            i8 = C3035a.f10375a[jVar.mo14532a(2)];
                            i3 = C3035a.f10376b[a];
                        }
                        i2 = i8 * 256;
                        i = jVar.mo14532a(3);
                        str = "audio/eac3";
                    } else {
                        jVar.mo14536c(32);
                        int a2 = jVar.mo14532a(2);
                        int a3 = C3035a.m7585a(a2, jVar.mo14532a(6));
                        jVar.mo14536c(8);
                        i = jVar.mo14532a(3);
                        if (!((i & 1) == 0 || i == 1)) {
                            jVar.mo14536c(2);
                        }
                        if ((i & 4) != 0) {
                            jVar.mo14536c(2);
                        }
                        if (i == 2) {
                            jVar.mo14536c(2);
                        }
                        i3 = C3035a.f10376b[a2];
                        i4 = a3;
                        str = "audio/ac3";
                        i2 = 1536;
                    }
                    int i9 = C3035a.f10378d[i] + (jVar.mo14535b() ? 1 : 0);
                    C3226i iVar = this.f11298j;
                    if (!(iVar != null && i9 == iVar.f11645r && i3 == iVar.f11646s && str == iVar.f11633f)) {
                        C3226i a4 = C3226i.m8178a(this.f11292d, str, (String) null, -1, -1, i9, i3, -1, (List<byte[]>) null, (C3059a) null, 0, this.f11291c);
                        this.f11298j = a4;
                        this.f11293e.mo14098a(a4);
                    }
                    this.f11299k = i4;
                    this.f11297i = (((long) i2) * 1000000) / ((long) this.f11298j.f11646s);
                    this.f11290b.mo14549e(0);
                    this.f11293e.mo14099a(this.f11290b, 8);
                    this.f11294f = 2;
                }
            } else if (i5 == 2) {
                int min2 = Math.min(kVar.mo14537a(), this.f11299k - this.f11295g);
                this.f11293e.mo14099a(kVar2, min2);
                int i11 = this.f11295g + min2;
                this.f11295g = i11;
                int i12 = this.f11299k;
                if (i11 == i12) {
                    this.f11293e.mo14096a(this.f11300l, 1, i12, 0, (byte[]) null);
                    this.f11300l += this.f11297i;
                    this.f11294f = 0;
                }
            }
        }
    }
}
