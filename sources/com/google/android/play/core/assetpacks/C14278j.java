package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import p434dd.C16582u0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.j */
public class C14278j extends C16582u0 {

    /* renamed from: b */
    public final C17573l f35916b;

    /* renamed from: c */
    public final /* synthetic */ C14310r f35917c;

    public C14278j(C14310r rVar, C17573l lVar) {
        this.f35917c = rVar;
        this.f35916b = lVar;
    }

    /* renamed from: A */
    public void mo42843A(ArrayList arrayList) {
        this.f35917c.f36012d.mo49337c(this.f35916b);
        C14310r.f36007g.mo977d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: i */
    public void mo42844i(Bundle bundle, Bundle bundle2) {
        this.f35917c.f36013e.mo49337c(this.f35916b);
        C14310r.f36007g.mo977d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: m */
    public void mo42845m(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f35917c.f36012d.mo49337c(this.f35916b);
        C14310r.f36007g.mo977d("onGetChunkFileDescriptor", new Object[0]);
    }

    public void zzd(Bundle bundle) {
        this.f35917c.f36012d.mo49337c(this.f35916b);
        int i = bundle.getInt("error_code");
        C14310r.f36007g.mo975b("onError(%d)", Integer.valueOf(i));
        this.f35916b.mo50024a(new AssetPackException(i));
    }
}
