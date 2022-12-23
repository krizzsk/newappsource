package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.List;

/* renamed from: bo.app.s1 */
public class C1686s1 {

    /* renamed from: c */
    public static final String f5978c = AppboyLogger.getBrazeLogTag(C1686s1.class);

    /* renamed from: a */
    public final C1526a4 f5979a;

    /* renamed from: b */
    public boolean f5980b = false;

    public C1686s1(C1526a4 a4Var) {
        this.f5979a = a4Var;
    }

    /* renamed from: a */
    public void mo6363a(C1594h2 h2Var) {
        if (this.f5980b) {
            String str = f5978c;
            AppboyLogger.m5459w(str, "Storage manager is closed. Not adding event: " + h2Var);
            return;
        }
        this.f5979a.mo5895a(h2Var);
    }

    /* renamed from: a */
    public void mo6364a(List<C1594h2> list) {
        if (this.f5980b) {
            String str = f5978c;
            AppboyLogger.m5459w(str, "Storage manager is closed. Not deleting events: " + list);
            return;
        }
        this.f5979a.mo5896a(list);
    }

    /* renamed from: a */
    public void mo6361a() {
        this.f5980b = true;
        this.f5979a.close();
    }

    /* renamed from: a */
    public void mo6362a(C1522a0 a0Var) {
        if (this.f5980b) {
            AppboyLogger.m5459w(f5978c, "Storage manager is closed. Not starting offline recovery.");
            return;
        }
        AppboyLogger.m5448d(f5978c, "Started offline AppboyEvent recovery task.");
        for (C1594h2 next : this.f5979a.mo5894a()) {
            String str = f5978c;
            AppboyLogger.m5457v(str, "Adding event to dispatch from storage: " + next);
            a0Var.mo5862a(next);
        }
    }
}
