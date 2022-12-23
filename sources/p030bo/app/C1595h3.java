package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.ArrayList;

/* renamed from: bo.app.h3 */
public class C1595h3 implements C1636m3 {

    /* renamed from: b */
    public static final String f5742b = AppboyLogger.getBrazeLogTag(C1595h3.class);

    /* renamed from: a */
    public final C1600i0 f5743a;

    static {
        new ArrayList();
    }

    public C1595h3(C1600i0 i0Var) {
        this.f5743a = i0Var;
    }

    /* renamed from: a */
    public void mo6147a(C1628l3 l3Var) {
        mo6149c(l3Var);
    }

    /* renamed from: b */
    public void mo6148b(C1628l3 l3Var) {
        mo6149c(l3Var);
    }

    /* renamed from: c */
    public final void mo6149c(C1628l3 l3Var) {
        AppboyLogger.m5451d(f5742b, "Short circuiting execution of network request and immediately marking it as succeeded.", false);
        l3Var.mo6059a(this.f5743a, (C1717w2) null);
        l3Var.mo5974a(this.f5743a);
        if (l3Var instanceof C1620k3) {
            this.f5743a.mo6134a(new C1617k0((C1620k3) l3Var), C1617k0.class);
        }
    }
}
