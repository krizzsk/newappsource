package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.appcompat.widget.C0436m1;
import androidx.camera.core.C0629q;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0581f;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.C0588l;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0591o;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import com.google.android.play.core.appupdate.C14226d;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import p054d0.C4297n0;
import p054d0.C4304q0;
import p066e0.C4424e;
import p066e0.C4428g;
import p066e0.C4451q;
import p066e0.C4460x;
import p089g0.C4721b;
import p115i0.C5231g;
import p304x.C7109v;
import p316y.C7229u;
import p583jk.C17884p;

/* renamed from: androidx.camera.core.r */
public final class C0631r extends UseCase {

    /* renamed from: r */
    public static final C0634c f2163r = new C0634c();

    /* renamed from: s */
    public static final C4721b f2164s = C14226d.m35358z0();

    /* renamed from: l */
    public C0635d f2165l;

    /* renamed from: m */
    public Executor f2166m = f2164s;

    /* renamed from: n */
    public DeferrableSurface f2167n;

    /* renamed from: o */
    public SurfaceRequest f2168o;

    /* renamed from: p */
    public boolean f2169p = false;

    /* renamed from: q */
    public Size f2170q;

    /* renamed from: androidx.camera.core.r$a */
    public class C0632a extends C4424e {

        /* renamed from: a */
        public final /* synthetic */ C4460x f2171a;

        public C0632a(C4460x xVar) {
            this.f2171a = xVar;
        }

        /* renamed from: b */
        public final void mo2570b(C4428g gVar) {
            if (this.f2171a.mo19993a()) {
                C0631r rVar = C0631r.this;
                Iterator it = rVar.f1860a.iterator();
                while (it.hasNext()) {
                    ((UseCase.C0540c) it.next()).mo2237b(rVar);
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.r$b */
    public static final class C0633b implements C0595r.C0596a<C0631r, C0591o, C0633b> {

        /* renamed from: a */
        public final C0589m f2173a;

        public C0633b() {
            this(C0589m.m1674t());
        }

        /* renamed from: a */
        public final C0631r mo2575a() {
            Object obj;
            C0589m mVar = this.f2173a;
            C0572a aVar = C0587k.f2005f;
            mVar.getClass();
            Object obj2 = null;
            try {
                obj = mVar.mo2422a(aVar);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            if (obj != null) {
                C0589m mVar2 = this.f2173a;
                C0572a aVar2 = C0587k.f2008i;
                mVar2.getClass();
                try {
                    obj2 = mVar2.mo2422a(aVar2);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 != null) {
                    throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
                }
            }
            return new C0631r(new C0591o(C0590n.m1678s(this.f2173a)));
        }

        public final C0588l getMutableConfig() {
            return this.f2173a;
        }

        public final C0595r getUseCaseConfig() {
            return new C0591o(C0590n.m1678s(this.f2173a));
        }

        public C0633b(C0589m mVar) {
            Object obj;
            Class<C0631r> cls = C0631r.class;
            this.f2173a = mVar;
            Object obj2 = null;
            try {
                obj = mVar.mo2422a(C5231g.f17324u);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f2173a.mo2503w(C5231g.f17324u, cls);
                C0589m mVar2 = this.f2173a;
                C0572a aVar = C5231g.f17323t;
                mVar2.getClass();
                try {
                    obj2 = mVar2.mo2422a(aVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f2173a.mo2503w(C5231g.f17323t, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* renamed from: androidx.camera.core.r$c */
    public static final class C0634c {

        /* renamed from: a */
        public static final C0591o f2174a;

        static {
            C0633b bVar = new C0633b();
            bVar.f2173a.mo2503w(C0595r.f2028q, 2);
            bVar.f2173a.mo2503w(C0587k.f2005f, 0);
            f2174a = new C0591o(C0590n.m1678s(bVar.f2173a));
        }
    }

    /* renamed from: androidx.camera.core.r$d */
    public interface C0635d {
        /* renamed from: a */
        void mo2576a(SurfaceRequest surfaceRequest);
    }

    public C0631r(C0591o oVar) {
        super(oVar);
    }

    /* renamed from: A */
    public final void mo2571A() {
        SurfaceRequest.C0537g gVar;
        Executor executor;
        CameraInternal a = mo2366a();
        C0635d dVar = this.f2165l;
        Size size = this.f2170q;
        Rect rect = this.f1868i;
        if (rect == null) {
            if (size != null) {
                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                rect = null;
            }
        }
        SurfaceRequest surfaceRequest = this.f2168o;
        if (a != null && dVar != null && rect != null) {
            C0549e eVar = new C0549e(rect, mo2372g(a), ((C0587k) this.f1865f).mo2499r());
            synchronized (surfaceRequest.f1840a) {
                surfaceRequest.f1849j = eVar;
                gVar = surfaceRequest.f1850k;
                executor = surfaceRequest.f1851l;
            }
            if (gVar != null && executor != null) {
                executor.execute(new C7229u(2, gVar, eVar));
            }
        }
    }

    /* renamed from: B */
    public final void mo2572B(C0635d dVar) {
        boolean z;
        C4721b bVar = f2164s;
        C17884p.m44372k();
        if (dVar == null) {
            this.f2165l = null;
            mo2377l();
            return;
        }
        this.f2165l = dVar;
        this.f2166m = bVar;
        mo2376k();
        if (this.f2169p) {
            SurfaceRequest surfaceRequest = this.f2168o;
            C0635d dVar2 = this.f2165l;
            if (dVar2 == null || surfaceRequest == null) {
                z = false;
            } else {
                this.f2166m.execute(new C7109v(3, dVar2, surfaceRequest));
                z = true;
            }
            if (z) {
                mo2571A();
                this.f2169p = false;
            }
        } else if (this.f1866g != null) {
            mo2390y(mo2574z(mo2368c(), (C0591o) this.f1865f, this.f1866g).mo2460c());
            mo2378m();
        }
    }

    /* renamed from: d */
    public final C0595r<?> mo2369d(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo2468a(UseCaseConfigFactory.CaptureType.PREVIEW, 1);
        if (z) {
            f2163r.getClass();
            a = C13715c.m34250p(a, C0634c.f2174a);
        }
        if (a == null) {
            return null;
        }
        return new C0591o(C0590n.m1678s(((C0633b) mo2373h(a)).f2173a));
    }

    /* renamed from: h */
    public final C0595r.C0596a<?, ?, ?> mo2373h(Config config) {
        return new C0633b(C0589m.m1675u(config));
    }

    /* renamed from: s */
    public final void mo2384s() {
        DeferrableSurface deferrableSurface = this.f2167n;
        if (deferrableSurface != null) {
            deferrableSurface.mo2450a();
        }
        this.f2168o = null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.camera.core.impl.r$a<?, ?, ?>, androidx.camera.core.impl.r$a, d0.s] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.C0595r<?> mo2385t(p066e0.C4443m r3, androidx.camera.core.impl.C0595r.C0596a<?, ?, ?> r4) {
        /*
            r2 = this;
            androidx.camera.core.impl.l r3 = r4.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0591o.f2018z
            androidx.camera.core.impl.n r3 = (androidx.camera.core.impl.C0590n) r3
            r3.getClass()
            java.lang.Object r3 = r3.mo2422a(r0)     // Catch:{ IllegalArgumentException -> 0x0010 }
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            if (r3 == 0) goto L_0x0025
            androidx.camera.core.impl.l r3 = r4.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0586j.f2004e
            r1 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.core.impl.m r3 = (androidx.camera.core.impl.C0589m) r3
            r3.mo2503w(r0, r1)
            goto L_0x0036
        L_0x0025:
            androidx.camera.core.impl.l r3 = r4.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0586j.f2004e
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.core.impl.m r3 = (androidx.camera.core.impl.C0589m) r3
            r3.mo2503w(r0, r1)
        L_0x0036:
            androidx.camera.core.impl.r r3 = r4.getUseCaseConfig()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0631r.mo2385t(e0.m, androidx.camera.core.impl.r$a):androidx.camera.core.impl.r");
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Preview:");
        k.append(mo2371f());
        return k.toString();
    }

    /* renamed from: v */
    public final Size mo2387v(Size size) {
        this.f2170q = size;
        mo2390y(mo2574z(mo2368c(), (C0591o) this.f1865f, this.f2170q).mo2460c());
        return size;
    }

    /* renamed from: x */
    public final void mo2389x(Rect rect) {
        this.f1868i = rect;
        mo2571A();
    }

    /* renamed from: z */
    public final SessionConfig.C0566b mo2574z(String str, C0591o oVar, Size size) {
        boolean z;
        C0629q.C0630a aVar;
        Size size2 = size;
        C17884p.m44372k();
        SessionConfig.C0566b d = SessionConfig.C0566b.m1604d(oVar);
        C4451q qVar = (C4451q) ((C0590n) oVar.getConfig()).mo2423b(C0591o.f2018z, null);
        DeferrableSurface deferrableSurface = this.f2167n;
        if (deferrableSurface != null) {
            deferrableSurface.mo2450a();
        }
        SurfaceRequest surfaceRequest = new SurfaceRequest(size2, mo2366a(), ((Boolean) ((C0590n) oVar.getConfig()).mo2423b(C0591o.f2016A, Boolean.FALSE)).booleanValue());
        this.f2168o = surfaceRequest;
        C0635d dVar = this.f2165l;
        if (dVar != null) {
            this.f2166m.execute(new C7109v(3, dVar, surfaceRequest));
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo2571A();
        } else {
            this.f2169p = true;
        }
        if (qVar != null) {
            C0581f.C0582a aVar2 = new C0581f.C0582a();
            HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar2.hashCode());
            int width = size.getWidth();
            int height = size.getHeight();
            int inputFormat = oVar.getInputFormat();
            Handler handler = new Handler(handlerThread.getLooper());
            SurfaceRequest.C0532b bVar = surfaceRequest.f1848i;
            C4304q0 q0Var = r6;
            C4304q0 q0Var2 = new C4304q0(width, height, inputFormat, handler, aVar2, qVar, bVar, num);
            synchronized (q0Var.f15232m) {
                if (!q0Var.f15233n) {
                    aVar = q0Var.f15238s;
                } else {
                    throw new IllegalStateException("ProcessingSurface already released!");
                }
            }
            d.mo2458a(aVar);
            q0Var.mo2453d().addListener(new C0436m1(handlerThread, 2), C14226d.m35352s0());
            this.f2167n = q0Var;
            d.f1940b.f1982f.f15509a.put(num, 0);
        } else {
            C4460x xVar = (C4460x) ((C0590n) oVar.getConfig()).mo2423b(C0591o.f2017y, null);
            if (xVar != null) {
                d.mo2458a(new C0632a(xVar));
            }
            this.f2167n = surfaceRequest.f1848i;
        }
        DeferrableSurface deferrableSurface2 = this.f2167n;
        d.f1939a.add(deferrableSurface2);
        d.f1940b.f1977a.add(deferrableSurface2);
        d.f1943e.add(new C4297n0(this, str, oVar, size2));
        return d;
    }
}
