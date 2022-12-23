package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s */
public final class C3205s {

    /* renamed from: a */
    public final List<C3226i> f11491a;

    /* renamed from: b */
    public final C3161n[] f11492b;

    public C3205s(List<C3226i> list) {
        this.f11491a = list;
        this.f11492b = new C3161n[list.size()];
    }

    /* renamed from: a */
    public void mo14269a(C3088h hVar, C3210v.C3214d dVar) {
        boolean z;
        for (int i = 0; i < this.f11492b.length; i++) {
            dVar.mo14271a();
            C3161n a = hVar.mo14122a(dVar.mo14273c(), 3);
            C3226i iVar = this.f11491a.get(i);
            String str = iVar.f11633f;
            if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            C3380a.m8506a(z, "Invalid closed caption mime type provided: " + str);
            String str2 = iVar.f11628a;
            if (str2 == null) {
                str2 = dVar.mo14272b();
            }
            a.mo14098a(C3226i.m8179a(str2, str, (String) null, -1, iVar.f11651x, iVar.f11652y, iVar.f11653z, (C3059a) null, Long.MAX_VALUE, Collections.emptyList()));
            this.f11492b[i] = a;
        }
    }
}
