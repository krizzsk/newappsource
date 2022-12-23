package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3122k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m */
public final class C3198m implements C3188h {

    /* renamed from: a */
    public final C3393k f11442a;

    /* renamed from: b */
    public final C3122k f11443b;

    /* renamed from: c */
    public final String f11444c;

    /* renamed from: d */
    public String f11445d;

    /* renamed from: e */
    public C3161n f11446e;

    /* renamed from: f */
    public int f11447f = 0;

    /* renamed from: g */
    public int f11448g;

    /* renamed from: h */
    public boolean f11449h;

    /* renamed from: i */
    public boolean f11450i;

    /* renamed from: j */
    public long f11451j;

    /* renamed from: k */
    public int f11452k;

    /* renamed from: l */
    public long f11453l;

    public C3198m(String str) {
        C3393k kVar = new C3393k(4);
        this.f11442a = kVar;
        kVar.f12121a[0] = -1;
        this.f11443b = new C3122k();
        this.f11444c = str;
    }

    /* renamed from: a */
    public void mo14242a() {
        this.f11447f = 0;
        this.f11448g = 0;
        this.f11450i = false;
    }

    /* renamed from: b */
    public void mo14246b() {
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        this.f11445d = dVar.mo14272b();
        this.f11446e = hVar.mo14122a(dVar.mo14273c(), 1);
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        this.f11453l = j;
    }

    /* renamed from: a */
    public void mo14245a(C3393k kVar) {
        C3393k kVar2 = kVar;
        while (kVar.mo14537a() > 0) {
            int i = this.f11447f;
            if (i == 0) {
                byte[] bArr = kVar2.f12121a;
                int i2 = kVar2.f12122b;
                int i3 = kVar2.f12123c;
                while (true) {
                    if (i2 >= i3) {
                        kVar2.mo14549e(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f11450i && (b & 224) == 224;
                    this.f11450i = z;
                    if (z2) {
                        kVar2.mo14549e(i2 + 1);
                        this.f11450i = false;
                        this.f11442a.f12121a[1] = bArr[i2];
                        this.f11448g = 2;
                        this.f11447f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(kVar.mo14537a(), 4 - this.f11448g);
                kVar2.mo14541a(this.f11442a.f12121a, this.f11448g, min);
                int i4 = this.f11448g + min;
                this.f11448g = i4;
                if (i4 >= 4) {
                    this.f11442a.mo14549e(0);
                    if (!C3122k.m7847a(this.f11442a.mo14544c(), this.f11443b)) {
                        this.f11448g = 0;
                        this.f11447f = 1;
                    } else {
                        C3122k kVar3 = this.f11443b;
                        this.f11452k = kVar3.f10817c;
                        if (!this.f11449h) {
                            int i5 = kVar3.f10818d;
                            this.f11451j = (((long) kVar3.f10821g) * 1000000) / ((long) i5);
                            this.f11446e.mo14098a(C3226i.m8178a(this.f11445d, kVar3.f10816b, (String) null, -1, 4096, kVar3.f10819e, i5, -1, (List<byte[]>) null, (C3059a) null, 0, this.f11444c));
                            this.f11449h = true;
                        }
                        this.f11442a.mo14549e(0);
                        this.f11446e.mo14099a(this.f11442a, 4);
                        this.f11447f = 2;
                    }
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.mo14537a(), this.f11452k - this.f11448g);
                this.f11446e.mo14099a(kVar2, min2);
                int i6 = this.f11448g + min2;
                this.f11448g = i6;
                int i7 = this.f11452k;
                if (i6 >= i7) {
                    this.f11446e.mo14096a(this.f11453l, 1, i7, 0, (byte[]) null);
                    this.f11453l += this.f11451j;
                    this.f11448g = 0;
                    this.f11447f = 0;
                }
            }
        }
    }
}
