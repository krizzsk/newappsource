package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.C3269o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h */
public final class C3325h {

    /* renamed from: a */
    public final C3305s f11912a;

    /* renamed from: b */
    public final C3323f f11913b;

    /* renamed from: c */
    public final Object f11914c;

    /* renamed from: d */
    public final C3269o[] f11915d;

    public C3325h(C3305s sVar, C3323f fVar, Object obj, C3269o[] oVarArr) {
        this.f11912a = sVar;
        this.f11913b = fVar;
        this.f11914c = obj;
        this.f11915d = oVarArr;
    }

    /* renamed from: a */
    public boolean mo14459a(C3325h hVar, int i) {
        if (hVar != null && C3406u.m8596a((Object) this.f11913b.f11910b[i], (Object) hVar.f11913b.f11910b[i]) && C3406u.m8596a((Object) this.f11915d[i], (Object) hVar.f11915d[i])) {
            return true;
        }
        return false;
    }
}
