package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.player.cache.C2956c;
import com.fyber.inneractive.sdk.player.cache.C2971h;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.cache.f */
public class C2969f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2971h f10167a;

    public C2969f(C2971h hVar) {
        this.f10167a = hVar;
    }

    public void run() {
        try {
            C2971h hVar = this.f10167a;
            C2956c.C2963f b = hVar.f10170b.mo13757b(hVar.mo13788a());
            C2971h hVar2 = this.f10167a;
            hVar2.f10171c = b;
            if (b == null) {
                C2956c.C2959c a = hVar2.f10170b.mo13754a(hVar2.mo13788a());
                if (a == null) {
                    boolean unused = this.f10167a.f10182n = true;
                }
                if (a != null) {
                    C2971h hVar3 = this.f10167a;
                    IAlog.m9905d("%s | start | got an editor for %s", hVar3.f10169a, hVar3.mo13788a());
                    a.mo13770a();
                }
            }
        } catch (IOException e) {
            C2971h hVar4 = this.f10167a;
            IAlog.m9901a(String.format("%s | Exception raised starting a new caching process for %s", new Object[]{hVar4.f10169a, hVar4.mo13788a()}), e, new Object[0]);
            C2931r.m7253a("Exception raised starting a new caching process", e.getMessage(), (InneractiveAdRequest) null, (C3648e) null);
        }
        C2971h hVar5 = this.f10167a;
        if (hVar5.f10171c != null || hVar5.f10182n) {
            C2971h.m7324b(hVar5, true);
            return;
        }
        C2971h.C2976e eVar = hVar5.f10176h;
        if (eVar != null) {
            eVar.start();
        }
    }
}
