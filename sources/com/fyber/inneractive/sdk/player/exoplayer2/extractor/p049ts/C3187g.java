package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.g */
public final class C3187g implements C3188h {

    /* renamed from: a */
    public final List<C3210v.C3211a> f11337a;

    /* renamed from: b */
    public final C3161n[] f11338b;

    /* renamed from: c */
    public boolean f11339c;

    /* renamed from: d */
    public int f11340d;

    /* renamed from: e */
    public int f11341e;

    /* renamed from: f */
    public long f11342f;

    public C3187g(List<C3210v.C3211a> list) {
        this.f11337a = list;
        this.f11338b = new C3161n[list.size()];
    }

    /* renamed from: a */
    public void mo14242a() {
        this.f11339c = false;
    }

    /* renamed from: b */
    public void mo14246b() {
        if (this.f11339c) {
            for (C3161n a : this.f11338b) {
                a.mo14096a(this.f11342f, 1, this.f11341e, 0, (byte[]) null);
            }
            this.f11339c = false;
        }
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        for (int i = 0; i < this.f11338b.length; i++) {
            C3210v.C3211a aVar = this.f11337a.get(i);
            dVar.mo14271a();
            C3161n a = hVar.mo14122a(dVar.mo14273c(), 3);
            a.mo14098a(C3226i.m8182a(dVar.mo14272b(), "application/dvbsubs", (String) null, -1, (List<byte[]>) Collections.singletonList(aVar.f11518b), aVar.f11517a, (C3059a) null));
            this.f11338b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        if (z) {
            this.f11339c = true;
            this.f11342f = j;
            this.f11341e = 0;
            this.f11340d = 2;
        }
    }

    /* renamed from: a */
    public void mo14245a(C3393k kVar) {
        if (!this.f11339c) {
            return;
        }
        if (this.f11340d != 2 || mo14253a(kVar, 32)) {
            if (this.f11340d != 1 || mo14253a(kVar, 0)) {
                int i = kVar.f12122b;
                int a = kVar.mo14537a();
                for (C3161n a2 : this.f11338b) {
                    kVar.mo14549e(i);
                    a2.mo14099a(kVar, a);
                }
                this.f11341e += a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14253a(C3393k kVar, int i) {
        if (kVar.mo14537a() == 0) {
            return false;
        }
        if (kVar.mo14557l() != i) {
            this.f11339c = false;
        }
        this.f11340d--;
        return this.f11339c;
    }
}
