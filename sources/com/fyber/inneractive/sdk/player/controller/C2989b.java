package com.fyber.inneractive.sdk.player.controller;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.player.controller.C3020s;

/* renamed from: com.fyber.inneractive.sdk.player.controller.b */
public interface C2989b<ListenerT extends C3020s> {
    /* renamed from: a */
    void mo13823a(long j);

    /* renamed from: a */
    void mo13824a(Bitmap bitmap);

    /* renamed from: a */
    void mo13825a(ListenerT listenert);

    /* renamed from: b */
    void mo13826b(int i);

    /* renamed from: c */
    void mo13827c(boolean z);

    /* renamed from: c */
    boolean mo13828c();

    /* renamed from: d */
    void mo13829d(boolean z);

    void destroy();

    /* renamed from: f */
    void mo13831f();

    void pauseVideo();
}
