package ce0;

import android.content.Context;
import android.content.Intent;
import ce0.C21087a;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import java.lang.ref.WeakReference;
import xd0.C25247e;

/* renamed from: ce0.b */
public final class C21094b extends C21087a.C21093f {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f52931a;

    /* renamed from: b */
    public final /* synthetic */ Intent f52932b;

    /* renamed from: c */
    public final /* synthetic */ Intent f52933c;

    /* renamed from: d */
    public final /* synthetic */ PresenterAdOpenCallback f52934d;

    /* renamed from: e */
    public final /* synthetic */ C21087a.C21092e f52935e;

    public C21094b(WeakReference weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback, C25247e eVar) {
        this.f52931a = weakReference;
        this.f52932b = intent;
        this.f52933c = intent2;
        this.f52934d = presenterAdOpenCallback;
        this.f52935e = eVar;
    }

    /* renamed from: c */
    public final void mo53289c() {
        C21087a aVar = C21087a.f52911k;
        aVar.f52915e.remove(this);
        Context context = (Context) this.f52931a.get();
        if (context != null && C21087a.m49279c(context, this.f52932b, this.f52933c, this.f52934d)) {
            aVar.mo53276b(this.f52935e);
        }
    }
}
