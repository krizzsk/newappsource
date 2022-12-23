package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.cache.C2971h;
import com.fyber.inneractive.sdk.player.controller.C3019r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3295l;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.k */
public class C3294k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IOException f11854a;

    /* renamed from: b */
    public final /* synthetic */ C3287i f11855b;

    public C3294k(C3287i iVar, IOException iOException) {
        this.f11855b = iVar;
        this.f11854a = iOException;
    }

    public void run() {
        C3295l.C3296a aVar = this.f11855b.f11813e;
        IOException iOException = this.f11854a;
        C3019r rVar = (C3019r) aVar;
        if (rVar.f10316a != null && (iOException.getCause() instanceof C2971h.C2977f) && rVar.f10316a.get().f10231B) {
            rVar.f10316a.get().mo13836a(rVar.f10316a.get().f10234E, rVar.f10316a.get().f10233D, false);
        }
    }
}
