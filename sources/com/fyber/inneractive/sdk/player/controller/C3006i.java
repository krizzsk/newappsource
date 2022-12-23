package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.i */
public class C3006i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2997g f10279a;

    public C3006i(C2997g gVar) {
        this.f10279a = gVar;
    }

    public void run() {
        try {
            List<C2997g.C3003f> list = this.f10279a.f10257b;
            if (list != null) {
                for (C2997g.C3003f e : list) {
                    e.mo13865e();
                }
            }
        } catch (Exception e2) {
            if (IAlog.f12814a <= 3) {
                C2997g gVar = this.f10279a;
                gVar.getClass();
                IAlog.m9902a("%sonDrawnToSurface callback threw an exception!", IAlog.m9899a((Object) gVar));
                e2.printStackTrace();
            }
        }
    }
}
