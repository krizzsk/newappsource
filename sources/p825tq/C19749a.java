package p825tq;

import ce0.C21100e;
import com.moovit.MoovitApplication;
import f00.C16919g;

/* renamed from: tq.a */
public final class C19749a {

    /* renamed from: b */
    public static final C16919g.C16925f f50223b = new C16919g.C16925f("last_open_consent", -1);

    /* renamed from: c */
    public static final C16919g.C16924e f50224c = new C16919g.C16924e("times_open_consent", 0);

    /* renamed from: d */
    public static volatile C19749a f50225d;

    /* renamed from: a */
    public final MoovitApplication<?, ?, ?> f50226a;

    public C19749a(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f50226a = moovitApplication;
    }

    /* renamed from: a */
    public static synchronized void m47203a(MoovitApplication<?, ?, ?> moovitApplication) {
        synchronized (C19749a.class) {
            if (f50225d == null) {
                f50225d = new C19749a(moovitApplication);
            }
        }
    }
}
