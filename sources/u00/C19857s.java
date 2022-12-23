package u00;

import aa0.C7538j;
import android.content.Context;
import com.moovit.network.model.ServerId;
import j80.C12786g;
import java.io.File;
import java.util.Objects;
import mf0.C24361g;
import p786rz.C19387a;
import p898wr.C20400b;

/* renamed from: u00.s */
public final class C19857s extends C19806a {

    /* renamed from: b */
    public C7538j<C12786g> f50477b = null;

    public C19857s(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        C7538j<C12786g> h = mo52157h(context);
        File g = h.mo23800g(h.f48435e);
        if (!g.isDirectory()) {
            Objects.toString(mo52107d());
            mo52109f();
            return;
        }
        C19387a.m46675g(g);
        if (C24361g.m61154X(g.list())) {
            g.delete();
        }
        Objects.toString(mo52107d());
        mo52109f();
    }

    /* renamed from: h */
    public final C7538j<C12786g> mo52157h(Context context) {
        if (this.f50477b == null) {
            synchronized (this) {
                if (this.f50477b == null) {
                    ServerId d = mo52107d();
                    long f = mo52109f();
                    C12786g.C12787a aVar = C12786g.f31604g;
                    C7538j jVar = new C7538j(context, "twitter_service_alert_feeds", d, f, aVar, aVar);
                    this.f50477b = jVar;
                    jVar.mo51501d();
                }
            }
        }
        return this.f50477b;
    }
}
