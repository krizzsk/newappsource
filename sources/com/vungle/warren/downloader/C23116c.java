package com.vungle.warren.downloader;

import com.vungle.warren.C23152i;
import com.vungle.warren.downloader.C23112a;
import com.vungle.warren.error.VungleException;

/* renamed from: com.vungle.warren.downloader.c */
public final class C23116c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C23127h f58671b;

    /* renamed from: c */
    public final /* synthetic */ C23112a f58672c;

    /* renamed from: d */
    public final /* synthetic */ C23117d f58673d;

    public C23116c(C23117d dVar, C23127h hVar, C23152i iVar) {
        this.f58673d = dVar;
        this.f58671b = hVar;
        this.f58672c = iVar;
    }

    public final void run() {
        this.f58673d.mo58163O(this.f58671b, this.f58672c, new C23112a.C23113a(-1, new VungleException(39), 1));
    }
}
