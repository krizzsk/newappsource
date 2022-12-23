package p906wz;

import b00.C13556a;
import com.appboy.Constants;
import com.moovit.commons.utils.SafeRunnable;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import p584jl.C17885a;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20956o0;
import wh0.C25189k;
import wh0.C25192l;

/* renamed from: wz.j */
public final class C20439j<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> implements SafeRunnable, C13556a {

    /* renamed from: b */
    public final RQ f51777b;

    /* renamed from: c */
    public final C25189k<RS> f51778c;

    /* renamed from: d */
    public final AtomicBoolean f51779d = new AtomicBoolean(false);

    public C20439j(C20431c cVar, C25192l lVar) {
        this.f51777b = cVar;
        this.f51778c = lVar;
    }

    public final boolean cancel(boolean z) {
        this.f51779d.set(true);
        return true;
    }

    public final void onError(Throwable th) {
        C24362h.m61211f(th, Constants.APPBOY_PUSH_TITLE_KEY);
        if (this.f51779d.compareAndSet(false, true)) {
            this.f51778c.resumeWith(C17885a.m44400G(th));
        }
    }

    public final /* synthetic */ void run() {
        C20956o0.m49074b(this);
    }

    public final void safeRun() {
        if (!this.f51779d.get()) {
            this.f51777b.mo5818H();
            if (!this.f51779d.get()) {
                this.f51778c.resumeWith(this.f51777b.mo40051G());
            }
        }
    }
}
