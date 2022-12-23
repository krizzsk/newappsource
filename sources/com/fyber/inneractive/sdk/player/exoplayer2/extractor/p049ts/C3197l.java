package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.l */
public final class C3197l implements C3188h {

    /* renamed from: a */
    public final C3393k f11436a = new C3393k(10);

    /* renamed from: b */
    public C3161n f11437b;

    /* renamed from: c */
    public boolean f11438c;

    /* renamed from: d */
    public long f11439d;

    /* renamed from: e */
    public int f11440e;

    /* renamed from: f */
    public int f11441f;

    /* renamed from: a */
    public void mo14242a() {
        this.f11438c = false;
    }

    /* renamed from: b */
    public void mo14246b() {
        int i;
        if (this.f11438c && (i = this.f11440e) != 0 && this.f11441f == i) {
            this.f11437b.mo14096a(this.f11439d, 1, i, 0, (byte[]) null);
            this.f11438c = false;
        }
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        C3161n a = hVar.mo14122a(dVar.mo14273c(), 4);
        this.f11437b = a;
        a.mo14098a(C3226i.m8181a(dVar.mo14272b(), "application/id3", (String) null, -1, (C3059a) null));
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        if (z) {
            this.f11438c = true;
            this.f11439d = j;
            this.f11440e = 0;
            this.f11441f = 0;
        }
    }

    /* renamed from: a */
    public void mo14245a(C3393k kVar) {
        if (this.f11438c) {
            int a = kVar.mo14537a();
            int i = this.f11441f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(kVar.f12121a, kVar.f12122b, this.f11436a.f12121a, this.f11441f, min);
                if (this.f11441f + min == 10) {
                    this.f11436a.mo14549e(0);
                    if (73 == this.f11436a.mo14557l() && 68 == this.f11436a.mo14557l() && 51 == this.f11436a.mo14557l()) {
                        this.f11436a.mo14551f(3);
                        this.f11440e = this.f11436a.mo14556k() + 10;
                    } else {
                        this.f11438c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f11440e - this.f11441f);
            this.f11437b.mo14099a(kVar, min2);
            this.f11441f += min2;
        }
    }
}
