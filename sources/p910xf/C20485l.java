package p910xf;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: xf.l */
public final class C20485l {

    /* renamed from: c */
    public static final C20485l f51866c = new C20485l();

    /* renamed from: a */
    public final HashMap f51867a = new HashMap();

    /* renamed from: b */
    public final Object f51868b = new Object();

    /* renamed from: a */
    public final void mo52681a(C20482k<?> kVar) {
        C20482k<?> kVar2;
        synchronized (this.f51868b) {
            String eVar = kVar.mo52674d().toString();
            WeakReference weakReference = (WeakReference) this.f51867a.get(eVar);
            if (weakReference != null) {
                kVar2 = (C20482k) weakReference.get();
            } else {
                kVar2 = null;
            }
            if (kVar2 == null || kVar2 == kVar) {
                this.f51867a.remove(eVar);
            }
        }
    }
}
