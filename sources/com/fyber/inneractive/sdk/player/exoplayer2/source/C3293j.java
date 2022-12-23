package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3287i;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.j */
public class C3293j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3287i.C3291d f11852a;

    /* renamed from: b */
    public final /* synthetic */ C3287i f11853b;

    public C3293j(C3287i iVar, C3287i.C3291d dVar) {
        this.f11853b = iVar;
        this.f11852a = dVar;
    }

    public void run() {
        C3287i.C3291d dVar = this.f11852a;
        C3080f fVar = dVar.f11849c;
        if (fVar != null) {
            fVar.mo14116b();
            dVar.f11849c = null;
        }
        int size = this.f11853b.f11823o.size();
        for (int i = 0; i < size; i++) {
            this.f11853b.f11823o.valueAt(i).mo14102b();
        }
    }
}
