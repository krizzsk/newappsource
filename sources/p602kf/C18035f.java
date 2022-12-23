package p602kf;

import com.google.firebase.perf.config.RemoteConfigManager;
import ie0.C23588c;
import p389bl.C13641g;

/* renamed from: kf.f */
public final class C18035f implements C23588c<RemoteConfigManager> {

    /* renamed from: a */
    public final C18030a f46148a;

    public C18035f(C18030a aVar) {
        this.f46148a = aVar;
    }

    public final Object get() {
        this.f46148a.getClass();
        RemoteConfigManager instance = RemoteConfigManager.getInstance();
        C13641g.m34117e(instance);
        return instance;
    }
}
