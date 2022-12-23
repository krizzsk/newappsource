package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.n */
public final class C14294n extends C14278j {

    /* renamed from: d */
    public final /* synthetic */ C14310r f35952d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14294n(C14310r rVar, C17573l lVar) {
        super(rVar, lVar);
        this.f35952d = rVar;
    }

    /* renamed from: i */
    public final void mo42844i(Bundle bundle, Bundle bundle2) {
        super.mo42844i(bundle, bundle2);
        if (!this.f35952d.f36014f.compareAndSet(true, false)) {
            C14310r.f36007g.mo978e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f35952d.zzf();
        }
    }

    public final void zzd(Bundle bundle) {
        this.f35952d.f36013e.mo49337c(this.f35916b);
        int i = bundle.getInt("error_code");
        C14310r.f36007g.mo975b("onError(%d)", Integer.valueOf(i));
        this.f35916b.mo50024a(new AssetPackException(i));
    }
}
