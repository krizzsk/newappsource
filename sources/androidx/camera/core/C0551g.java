package androidx.camera.core;

import android.os.Handler;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p032c0.C1754d;
import p054d0.C4292l;
import p066e0.C4437k;
import p066e0.C4440l;
import p115i0.C5231g;
import p358af.C13437d;

/* renamed from: androidx.camera.core.g */
public final class C0551g implements C5231g<CameraX> {

    /* renamed from: A */
    public static final C0572a f1900A = Config.C0564a.m1591a(UseCaseConfigFactory.C0571b.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");

    /* renamed from: B */
    public static final C0572a f1901B = Config.C0564a.m1591a(Executor.class, "camerax.core.appConfig.cameraExecutor");

    /* renamed from: C */
    public static final C0572a f1902C = Config.C0564a.m1591a(Handler.class, "camerax.core.appConfig.schedulerHandler");

    /* renamed from: D */
    public static final C0572a f1903D = Config.C0564a.m1591a(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");

    /* renamed from: E */
    public static final C0572a f1904E = Config.C0564a.m1591a(C4292l.class, "camerax.core.appConfig.availableCamerasLimiter");

    /* renamed from: y */
    public static final C0572a f1905y = Config.C0564a.m1591a(C4440l.C4441a.class, "camerax.core.appConfig.cameraFactoryProvider");

    /* renamed from: z */
    public static final C0572a f1906z = Config.C0564a.m1591a(C4437k.C4438a.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");

    /* renamed from: x */
    public final C0590n f1907x;

    /* renamed from: androidx.camera.core.g$a */
    public static final class C0552a {

        /* renamed from: a */
        public final C0589m f1908a;

        public C0552a() {
            Object obj;
            C0589m t = C0589m.m1674t();
            Class<CameraX> cls = CameraX.class;
            this.f1908a = t;
            Object obj2 = null;
            try {
                obj = t.mo2422a(C5231g.f17324u);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f1908a.mo2503w(C5231g.f17324u, cls);
                C0589m mVar = this.f1908a;
                C0572a aVar = C5231g.f17323t;
                mVar.getClass();
                try {
                    obj2 = mVar.mo2422a(aVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f1908a.mo2503w(C5231g.f17323t, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* renamed from: androidx.camera.core.g$b */
    public interface C0553b {
        C0551g getCameraXConfig();
    }

    public C0551g(C0590n nVar) {
        this.f1907x = nVar;
    }

    /* renamed from: a */
    public final Object mo2422a(Config.C0564a aVar) {
        return ((C0590n) getConfig()).mo2422a(aVar);
    }

    /* renamed from: b */
    public final Object mo2423b(Config.C0564a aVar, Object obj) {
        return ((C0590n) getConfig()).mo2423b(aVar, obj);
    }

    /* renamed from: c */
    public final Config.OptionPriority mo2424c(Config.C0564a aVar) {
        return ((C0590n) getConfig()).mo2424c(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo2425e(Config.C0564a aVar) {
        return C13437d.m33696a(this, (C0572a) aVar);
    }

    /* renamed from: f */
    public final Object mo2426f(Config.C0564a aVar, Config.OptionPriority optionPriority) {
        return ((C0590n) getConfig()).mo2426f(aVar, optionPriority);
    }

    public final Config getConfig() {
        return this.f1907x;
    }

    public final /* synthetic */ String getTargetName(String str) {
        throw null;
    }

    /* renamed from: h */
    public final Set mo2429h(Config.C0564a aVar) {
        return ((C0590n) getConfig()).mo2429h(aVar);
    }

    /* renamed from: l */
    public final /* synthetic */ void mo2430l(C1754d dVar) {
        C13437d.m33697b(this, dVar);
    }

    public final Set listOptions() {
        return ((C0590n) getConfig()).listOptions();
    }

    /* renamed from: s */
    public final C4292l mo2432s() {
        Object obj;
        C0590n nVar = this.f1907x;
        C0572a aVar = f1904E;
        nVar.getClass();
        try {
            obj = nVar.mo2422a(aVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C4292l) obj;
    }

    /* renamed from: t */
    public final C4440l.C4441a mo2433t() {
        Object obj;
        C0590n nVar = this.f1907x;
        C0572a aVar = f1905y;
        nVar.getClass();
        try {
            obj = nVar.mo2422a(aVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C4440l.C4441a) obj;
    }

    /* renamed from: u */
    public final C4437k.C4438a mo2434u() {
        Object obj;
        C0590n nVar = this.f1907x;
        C0572a aVar = f1906z;
        nVar.getClass();
        try {
            obj = nVar.mo2422a(aVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C4437k.C4438a) obj;
    }

    /* renamed from: v */
    public final UseCaseConfigFactory.C0571b mo2435v() {
        Object obj;
        C0590n nVar = this.f1907x;
        C0572a aVar = f1900A;
        nVar.getClass();
        try {
            obj = nVar.mo2422a(aVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (UseCaseConfigFactory.C0571b) obj;
    }
}
