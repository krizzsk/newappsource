package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.h */
public class C3005h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f10277a;

    /* renamed from: b */
    public final /* synthetic */ C2997g f10278b;

    public C3005h(C2997g gVar, boolean z) {
        this.f10278b = gVar;
        this.f10277a = z;
    }

    public void run() {
        C2997g gVar = this.f10278b;
        if (!gVar.f10262g) {
            try {
                List<C2997g.C3003f> list = gVar.f10257b;
                if (list != null) {
                    for (C2997g.C3003f e : list) {
                        e.mo13747e(this.f10277a);
                    }
                }
            } catch (Exception unused) {
                if (IAlog.f12814a <= 3) {
                    C2997g gVar2 = this.f10278b;
                    gVar2.getClass();
                    IAlog.m9902a("%sonPlayerError callback threw an exception!", IAlog.m9899a((Object) gVar2));
                }
            }
        }
    }
}
