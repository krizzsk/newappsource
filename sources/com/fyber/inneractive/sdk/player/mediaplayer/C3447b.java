package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.b */
public class C3447b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12292a;

    /* renamed from: b */
    public final /* synthetic */ C3433a f12293b;

    public C3447b(C3433a aVar, int i) {
        this.f12293b = aVar;
        this.f12292a = i;
    }

    public void run() {
        C3433a aVar = this.f12293b;
        int i = this.f12292a;
        String c = aVar.mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        aVar.seekTo(i);
        IAlog.m9905d(c + "timelog: " + "seekTo" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
