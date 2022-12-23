package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3228j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3282e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3301o;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i */
public final class C3100i implements C3301o {

    /* renamed from: a */
    public final int f10686a;

    /* renamed from: b */
    public final C3101j f10687b;

    public C3100i(C3101j jVar, int i) {
        this.f10687b = jVar;
        this.f10686a = i;
    }

    /* renamed from: a */
    public void mo14159a() throws IOException {
        this.f10687b.mo14172j();
    }

    public boolean isReady() {
        C3101j jVar = this.f10687b;
        int i = this.f10686a;
        if (jVar.f10712y || (!jVar.mo14170h() && !jVar.f10697j.valueAt(i).mo14106f())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo14158a(C3228j jVar, C3058b bVar, boolean z) {
        C3101j jVar2 = this.f10687b;
        int i = this.f10686a;
        if (jVar2.mo14170h()) {
            return -3;
        }
        while (true) {
            boolean z2 = true;
            if (jVar2.f10698k.size() <= 1) {
                break;
            }
            int i2 = jVar2.f10698k.getFirst().f10648j;
            int i3 = 0;
            while (true) {
                if (i3 >= jVar2.f10697j.size()) {
                    break;
                }
                if (jVar2.f10709v[i3]) {
                    C3074d.C3077c cVar = jVar2.f10697j.valueAt(i3).f10555c;
                    if ((cVar.f10579i == 0 ? cVar.f10588r : cVar.f10572b[cVar.f10581k]) == i2) {
                        z2 = false;
                        break;
                    }
                }
                i3++;
            }
            if (!z2) {
                break;
            }
            jVar2.f10698k.removeFirst();
        }
        C3097f first = jVar2.f10698k.getFirst();
        C3226i iVar = first.f11780c;
        if (!iVar.equals(jVar2.f10704q)) {
            C3283f.C3284a aVar = jVar2.f10695h;
            int i4 = jVar2.f10688a;
            int i5 = first.f11781d;
            Object obj = first.f11782e;
            long j = first.f11783f;
            if (aVar.f11799b != null) {
                aVar.f11798a.post(new C3282e(aVar, i4, iVar, i5, obj, j));
            }
        }
        jVar2.f10704q = iVar;
        return jVar2.f10697j.valueAt(i).mo14093a(jVar, bVar, z, jVar2.f10712y, jVar2.f10710w);
    }

    /* renamed from: a */
    public void mo14160a(long j) {
        C3101j jVar = this.f10687b;
        C3074d valueAt = jVar.f10697j.valueAt(this.f10686a);
        if (!jVar.f10712y || j <= valueAt.mo14104d()) {
            valueAt.mo14101a(j, true);
        } else {
            valueAt.mo14107g();
        }
    }
}
