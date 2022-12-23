package aa0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import p693nz.C18651c;
import p693nz.C18662j;

/* renamed from: aa0.h */
public final class C7536h implements ComponentCallbacks2 {

    /* renamed from: b */
    public final /* synthetic */ C18651c f23013b;

    public C7536h(C18662j jVar) {
        this.f23013b = jVar;
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        this.f23013b.onLowMemory();
    }

    public final /* synthetic */ void onTrimMemory(int i) {
    }
}
