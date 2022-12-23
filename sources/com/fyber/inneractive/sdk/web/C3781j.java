package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.mraid.C2865f;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3764d;

/* renamed from: com.fyber.inneractive.sdk.web.j */
public class C3781j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3764d.C3767c f13049a;

    public C3781j(C3764d.C3767c cVar) {
        this.f13049a = cVar;
    }

    public void run() {
        C3764d dVar = C3764d.this;
        dVar.getClass();
        C3714n.f12902b.post(new C3780i(dVar, "Image failed to download."));
        C3764d.this.mo15451a(C2865f.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.m9902a("failed to download and save the image file.", new Object[0]);
    }
}
