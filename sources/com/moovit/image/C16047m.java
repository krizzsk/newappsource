package com.moovit.image;

import android.content.res.Configuration;
import p693nz.C18651c;
import p693nz.C18659h;
import p977zz.C20928b;

/* renamed from: com.moovit.image.m */
public final class C16047m extends C20928b {

    /* renamed from: b */
    public final /* synthetic */ C18651c f41802b;

    public C16047m(C18659h hVar) {
        this.f41802b = hVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f41802b.clear();
    }

    public final void onLowMemory() {
        this.f41802b.onLowMemory();
    }
}
