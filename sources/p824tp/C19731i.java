package p824tp;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.SparseArray;
import com.google.android.play.core.assetpacks.C14343z0;
import com.moovit.MoovitApplication;
import com.moovit.env.EnvironmentProvider;
import com.moovit.network.model.ServerId;
import g30.C4776h;
import j80.C12778f;
import java.util.HashMap;
import p269u2.C6677a;
import p567iq.C17635b;
import p898wr.C20399a;
import p898wr.C20400b;
import p968zq.C20884b;
import p977zz.C20944i0;
import s00.C19390c;
import s00.C19391d;

/* renamed from: tp.i */
public abstract class C19731i<G extends C19390c, M extends C19391d> extends ContextWrapper {

    /* renamed from: a */
    public final C19721a f50171a;

    /* renamed from: b */
    public final C14343z0 f50172b;

    /* renamed from: c */
    public final C6677a f50173c;

    /* renamed from: d */
    public final C12778f f50174d;

    /* renamed from: e */
    public final C20399a f50175e;

    /* renamed from: f */
    public final HashMap f50176f;

    public C19731i(MoovitApplication moovitApplication) {
        super(moovitApplication);
        int i;
        SparseArray<String> sparseArray = EnvironmentProvider.f41473b;
        C17635b bVar = (C17635b) this;
        if (moovitApplication.getSharedPreferences("environment_provider", 0).getBoolean("isDeveloper", false)) {
            i = 5;
        } else {
            i = 1;
        }
        this.f50171a = new C19721a(bVar, i);
        this.f50172b = new C14343z0(moovitApplication);
        this.f50173c = new C6677a(new C20884b());
        this.f50175e = new C20399a();
        this.f50176f = new HashMap(2);
        this.f50174d = new C12778f(moovitApplication);
    }

    /* renamed from: a */
    public static C19731i<?, ?> m47197a(Context context) {
        return MoovitApplication.class.cast(context.getApplicationContext()).mo44558j();
    }

    /* renamed from: b */
    public final M mo52084b(ServerId serverId, long j) {
        M m;
        synchronized (this.f50176f) {
            C20944i0 i0Var = new C20944i0(serverId, Long.valueOf(j));
            m = (C19391d) this.f50176f.get(i0Var);
            if (m == null) {
                m = new C20400b(serverId, j);
                registerComponentCallbacks(m);
                this.f50176f.put(i0Var, m);
            }
        }
        return m;
    }

    /* renamed from: c */
    public final M mo52085c(C4776h hVar) {
        return mo52084b(hVar.f16126a, hVar.f16127b);
    }

    /* renamed from: d */
    public final M mo52086d(C19728f fVar) {
        return mo52085c(fVar.f50165a);
    }

    /* renamed from: e */
    public final M mo52087e(ServerId serverId, long j) {
        synchronized (this.f50176f) {
            M m = (C19391d) this.f50176f.remove(new C20944i0(serverId, Long.valueOf(j)));
            if (m == null) {
                M bVar = new C20400b(serverId, j);
                return bVar;
            }
            unregisterComponentCallbacks(m);
            return m;
        }
    }
}
