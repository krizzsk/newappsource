package p945yr;

import aa0.C7538j;
import android.content.Context;
import com.moovit.network.model.ServerId;
import java.io.File;
import mf0.C24361g;
import p786rz.C19387a;
import s00.C19391d;
import u00.C19806a;

/* renamed from: yr.a */
public final class C20755a extends C19806a {

    /* renamed from: b */
    public C7538j<ServerId> f52366b = null;

    public C20755a(C19391d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        C7538j<ServerId> h = mo52891h(context);
        File g = h.mo23800g(h.f48435e);
        if (!g.isDirectory()) {
            mo52107d();
            mo52109f();
            return;
        }
        C19387a.m46675g(g);
        if (C24361g.m61154X(g.list())) {
            g.delete();
        }
        mo52107d();
        mo52109f();
    }

    /* renamed from: h */
    public final C7538j<ServerId> mo52891h(Context context) {
        if (this.f52366b == null) {
            synchronized (this) {
                if (this.f52366b == null) {
                    C7538j jVar = new C7538j(context, "syncable_line_group_ids", mo52107d(), mo52109f(), ServerId.f15141f, ServerId.f15140e);
                    this.f52366b = jVar;
                    jVar.mo51501d();
                }
            }
        }
        return this.f52366b;
    }
}
