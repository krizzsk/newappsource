package xh0;

import kotlinx.coroutines.android.C24183a;
import wh0.C25190k0;

/* renamed from: xh0.b */
public final /* synthetic */ class C25272b implements C25190k0 {

    /* renamed from: b */
    public final /* synthetic */ C24183a f63546b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f63547c;

    public /* synthetic */ C25272b(C24183a aVar, Runnable runnable) {
        this.f63546b = aVar;
        this.f63547c = runnable;
    }

    public final void dispose() {
        C24183a aVar = this.f63546b;
        aVar.f61419d.removeCallbacks(this.f63547c);
    }
}
