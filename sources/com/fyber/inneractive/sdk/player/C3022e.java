package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.fyber.inneractive.sdk.player.e */
public class C3022e {

    /* renamed from: a */
    public C2997g f10319a;

    /* renamed from: b */
    public ScheduledThreadPoolExecutor f10320b;

    /* renamed from: c */
    public Runnable f10321c;

    /* renamed from: d */
    public boolean f10322d = false;

    /* renamed from: com.fyber.inneractive.sdk.player.e$a */
    public class C3023a implements Runnable {
        public C3023a() {
        }

        public void run() {
            C3022e eVar = C3022e.this;
            eVar.getClass();
            IAlog.m9902a("player progress monitor: run started", new Object[0]);
            int c = eVar.f10319a.mo13813c();
            if (!eVar.f10322d) {
                int i = c + 0;
                IAlog.m9902a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(i));
                if (i >= 2000) {
                    IAlog.m9902a("run: setting played 2 seconds flag", new Object[0]);
                    eVar.f10322d = true;
                }
            }
            eVar.f10319a.mo13805a(c);
        }
    }

    public C3022e(C2997g gVar) {
        this.f10319a = gVar;
        this.f10321c = new C3023a();
    }
}
