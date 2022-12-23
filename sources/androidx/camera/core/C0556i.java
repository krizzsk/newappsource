package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0584h;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.C0588l;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import p054d0.C4310t0;
import p054d0.C4320y;
import p066e0.C4415a0;
import p089g0.C4727c;
import p115i0.C5231g;
import p115i0.C5232h;
import p583jk.C17884p;

/* renamed from: androidx.camera.core.i */
public final class C0556i extends UseCase {

    /* renamed from: p */
    public static final C0560d f1911p = new C0560d();

    /* renamed from: l */
    public final C0608j f1912l;

    /* renamed from: m */
    public final Object f1913m = new Object();

    /* renamed from: n */
    public C0557a f1914n;

    /* renamed from: o */
    public C4415a0 f1915o;

    /* renamed from: androidx.camera.core.i$a */
    public interface C0557a {
        /* renamed from: a */
        void mo2441a();

        /* renamed from: c */
        void mo2442c(C4310t0 t0Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.i$b */
    public @interface C0558b {
    }

    /* renamed from: androidx.camera.core.i$c */
    public static final class C0559c implements C0595r.C0596a<C0556i, C0584h, C0559c> {

        /* renamed from: a */
        public final C0589m f1916a;

        public C0559c() {
            this(C0589m.m1674t());
        }

        public final C0588l getMutableConfig() {
            return this.f1916a;
        }

        public final C0595r getUseCaseConfig() {
            return new C0584h(C0590n.m1678s(this.f1916a));
        }

        public C0559c(C0589m mVar) {
            Object obj;
            Class<C0556i> cls = C0556i.class;
            this.f1916a = mVar;
            Object obj2 = null;
            try {
                obj = mVar.mo2422a(C5231g.f17324u);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f1916a.mo2503w(C5231g.f17324u, cls);
                C0589m mVar2 = this.f1916a;
                C0572a aVar = C5231g.f17323t;
                mVar2.getClass();
                try {
                    obj2 = mVar2.mo2422a(aVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f1916a.mo2503w(C5231g.f17323t, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* renamed from: androidx.camera.core.i$d */
    public static final class C0560d {

        /* renamed from: a */
        public static final C0584h f1917a;

        static {
            Size size = new Size(640, 480);
            C0559c cVar = new C0559c();
            cVar.f1916a.mo2503w(C0587k.f2009j, size);
            cVar.f1916a.mo2503w(C0595r.f2028q, 1);
            cVar.f1916a.mo2503w(C0587k.f2005f, 0);
            f1917a = new C0584h(C0590n.m1678s(cVar.f1916a));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.i$e */
    public @interface C0561e {
    }

    public C0556i(C0584h hVar) {
        super(hVar);
        C4727c cVar;
        if (((Integer) ((C0590n) ((C0584h) this.f1865f).getConfig()).mo2423b(C0584h.f1989y, 0)).intValue() == 1) {
            this.f1912l = new C4320y();
        } else {
            if (C4727c.f16024c != null) {
                cVar = C4727c.f16024c;
            } else {
                synchronized (C4727c.class) {
                    if (C4727c.f16024c == null) {
                        C4727c.f16024c = new C4727c();
                    }
                }
                cVar = C4727c.f16024c;
            }
            this.f1912l = new C0609k((Executor) hVar.mo2423b(C5232h.f17325v, cVar));
        }
        this.f1912l.f2086e = mo2438A();
        C0608j jVar = this.f1912l;
        C0584h hVar2 = (C0584h) this.f1865f;
        Boolean bool = Boolean.FALSE;
        hVar2.getClass();
        jVar.f2087f = ((Boolean) ((C0590n) hVar2.getConfig()).mo2423b(C0584h.f1988D, bool)).booleanValue();
    }

    /* renamed from: A */
    public final int mo2438A() {
        C0584h hVar = (C0584h) this.f1865f;
        hVar.getClass();
        return ((Integer) ((C0590n) hVar.getConfig()).mo2423b(C0584h.f1986B, 1)).intValue();
    }

    /* renamed from: d */
    public final C0595r<?> mo2369d(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo2468a(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS, 1);
        if (z) {
            f1911p.getClass();
            a = C13715c.m34250p(a, C0560d.f1917a);
        }
        if (a == null) {
            return null;
        }
        return new C0584h(C0590n.m1678s(((C0559c) mo2373h(a)).f1916a));
    }

    /* renamed from: h */
    public final C0595r.C0596a<?, ?, ?> mo2373h(Config config) {
        return new C0559c(C0589m.m1675u(config));
    }

    /* renamed from: p */
    public final void mo2381p() {
        this.f1912l.f2101t = true;
    }

    /* renamed from: s */
    public final void mo2384s() {
        C17884p.m44372k();
        C4415a0 a0Var = this.f1915o;
        if (a0Var != null) {
            a0Var.mo2450a();
            this.f1915o = null;
        }
        C0608j jVar = this.f1912l;
        jVar.f2101t = false;
        jVar.mo2539d();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.camera.core.impl.r$a<?, ?, ?>, androidx.camera.core.impl.r$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.C0595r<?> mo2385t(p066e0.C4443m r4, androidx.camera.core.impl.C0595r.C0596a<?, ?, ?> r5) {
        /*
            r3 = this;
            androidx.camera.core.impl.r<?> r0 = r3.f1865f
            androidx.camera.core.impl.h r0 = (androidx.camera.core.impl.C0584h) r0
            r0.getClass()
            androidx.camera.core.impl.a r1 = androidx.camera.core.impl.C0584h.f1987C
            androidx.camera.core.impl.Config r0 = r0.getConfig()
            androidx.camera.core.impl.n r0 = (androidx.camera.core.impl.C0590n) r0
            r2 = 0
            java.lang.Object r0 = r0.mo2423b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            e0.j0 r4 = r4.getCameraQuirks()
            java.lang.Class<k0.c> r1 = p140k0.C5447c.class
            boolean r4 = r4.mo19959e(r1)
            androidx.camera.core.j r1 = r3.f1912l
            if (r0 != 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            boolean r4 = r0.booleanValue()
        L_0x0029:
            r1.f2088g = r4
            java.lang.Object r4 = r3.f1913m
            monitor-enter(r4)
            androidx.camera.core.i$a r0 = r3.f1914n     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            r0.mo2441a()     // Catch:{ all -> 0x003b }
        L_0x0035:
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            androidx.camera.core.impl.r r4 = r5.getUseCaseConfig()
            return r4
        L_0x003b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0556i.mo2385t(e0.m, androidx.camera.core.impl.r$a):androidx.camera.core.impl.r");
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ImageAnalysis:");
        k.append(mo2371f());
        return k.toString();
    }

    /* renamed from: v */
    public final Size mo2387v(Size size) {
        mo2390y(mo2440z(mo2368c(), (C0584h) this.f1865f, size).mo2460c());
        return size;
    }

    /* renamed from: w */
    public final void mo2388w(Matrix matrix) {
        C0608j jVar = this.f1912l;
        synchronized (jVar.f2100s) {
            jVar.f2094m = matrix;
            jVar.f2095n = new Matrix(jVar.f2094m);
        }
    }

    /* renamed from: x */
    public final void mo2389x(Rect rect) {
        this.f1868i = rect;
        C0608j jVar = this.f1912l;
        synchronized (jVar.f2100s) {
            jVar.f2092k = rect;
            jVar.f2093l = new Rect(jVar.f2092k);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
        if (r9.equals((java.lang.Boolean) ((androidx.camera.core.impl.C0590n) r10.getConfig()).mo2423b(androidx.camera.core.impl.C0584h.f1987C, null)) != false) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018a  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.SessionConfig.C0566b mo2440z(java.lang.String r13, androidx.camera.core.impl.C0584h r14, android.util.Size r15) {
        /*
            r12 = this;
            p583jk.C17884p.m44372k()
            g0.c r0 = p089g0.C4727c.f16024c
            if (r0 == 0) goto L_0x000a
            g0.c r0 = p089g0.C4727c.f16024c
            goto L_0x001b
        L_0x000a:
            java.lang.Class<g0.c> r0 = p089g0.C4727c.class
            monitor-enter(r0)
            g0.c r1 = p089g0.C4727c.f16024c     // Catch:{ all -> 0x01c5 }
            if (r1 != 0) goto L_0x0018
            g0.c r1 = new g0.c     // Catch:{ all -> 0x01c5 }
            r1.<init>()     // Catch:{ all -> 0x01c5 }
            p089g0.C4727c.f16024c = r1     // Catch:{ all -> 0x01c5 }
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
            g0.c r0 = p089g0.C4727c.f16024c
        L_0x001b:
            r14.getClass()
            androidx.camera.core.impl.a r1 = p115i0.C5232h.f17325v
            java.lang.Object r0 = r14.mo2423b(r1, r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r0.getClass()
            androidx.camera.core.impl.r<?> r1 = r12.f1865f
            androidx.camera.core.impl.h r1 = (androidx.camera.core.impl.C0584h) r1
            androidx.camera.core.impl.a r2 = androidx.camera.core.impl.C0584h.f1989y
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            androidx.camera.core.impl.Config r1 = r1.getConfig()
            androidx.camera.core.impl.n r1 = (androidx.camera.core.impl.C0590n) r1
            java.lang.Object r1 = r1.mo2423b(r2, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 != r2) goto L_0x0066
            androidx.camera.core.impl.r<?> r1 = r12.f1865f
            androidx.camera.core.impl.h r1 = (androidx.camera.core.impl.C0584h) r1
            r4 = 6
            r1.getClass()
            androidx.camera.core.impl.a r5 = androidx.camera.core.impl.C0584h.f1990z
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            androidx.camera.core.impl.Config r1 = r1.getConfig()
            androidx.camera.core.impl.n r1 = (androidx.camera.core.impl.C0590n) r1
            java.lang.Object r1 = r1.mo2423b(r5, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0067
        L_0x0066:
            r1 = 4
        L_0x0067:
            androidx.camera.core.impl.a r4 = androidx.camera.core.impl.C0584h.f1985A
            androidx.camera.core.impl.Config r5 = r14.getConfig()
            androidx.camera.core.impl.n r5 = (androidx.camera.core.impl.C0590n) r5
            r6 = 0
            java.lang.Object r5 = r5.mo2423b(r4, r6)
            d0.h0 r5 = (p054d0.C4285h0) r5
            if (r5 == 0) goto L_0x0097
            androidx.camera.core.t r1 = new androidx.camera.core.t
            androidx.camera.core.impl.Config r5 = r14.getConfig()
            androidx.camera.core.impl.n r5 = (androidx.camera.core.impl.C0590n) r5
            java.lang.Object r4 = r5.mo2423b(r4, r6)
            d0.h0 r4 = (p054d0.C4285h0) r4
            r15.getWidth()
            r15.getHeight()
            r12.mo2370e()
            e0.z r4 = r4.newInstance()
            r1.<init>(r4)
            goto L_0x00b2
        L_0x0097:
            androidx.camera.core.t r4 = new androidx.camera.core.t
            int r5 = r15.getWidth()
            int r7 = r15.getHeight()
            int r8 = r12.mo2370e()
            android.media.ImageReader r1 = android.media.ImageReader.newInstance(r5, r7, r8, r1)
            d0.c r5 = new d0.c
            r5.<init>(r1)
            r4.<init>(r5)
            r1 = r4
        L_0x00b2:
            androidx.camera.core.impl.CameraInternal r4 = r12.mo2366a()
            if (r4 == 0) goto L_0x00e3
            androidx.camera.core.impl.CameraInternal r4 = r12.mo2366a()
            androidx.camera.core.impl.r<?> r5 = r12.f1865f
            androidx.camera.core.impl.h r5 = (androidx.camera.core.impl.C0584h) r5
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r5.getClass()
            androidx.camera.core.impl.a r8 = androidx.camera.core.impl.C0584h.f1988D
            androidx.camera.core.impl.Config r5 = r5.getConfig()
            androidx.camera.core.impl.n r5 = (androidx.camera.core.impl.C0590n) r5
            java.lang.Object r5 = r5.mo2423b(r8, r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00e3
            int r4 = r12.mo2372g(r4)
            int r4 = r4 % 180
            if (r4 == 0) goto L_0x00e3
            r4 = 1
            goto L_0x00e4
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            if (r4 == 0) goto L_0x00eb
            int r5 = r15.getHeight()
            goto L_0x00ef
        L_0x00eb:
            int r5 = r15.getWidth()
        L_0x00ef:
            if (r4 == 0) goto L_0x00f6
            int r4 = r15.getWidth()
            goto L_0x00fa
        L_0x00f6:
            int r4 = r15.getHeight()
        L_0x00fa:
            int r7 = r12.mo2438A()
            r8 = 2
            r9 = 35
            if (r7 != r8) goto L_0x0105
            r7 = 1
            goto L_0x0107
        L_0x0105:
            r7 = 35
        L_0x0107:
            int r10 = r12.mo2370e()
            if (r10 != r9) goto L_0x0115
            int r10 = r12.mo2438A()
            if (r10 != r8) goto L_0x0115
            r8 = 1
            goto L_0x0116
        L_0x0115:
            r8 = 0
        L_0x0116:
            int r10 = r12.mo2370e()
            if (r10 != r9) goto L_0x014a
            androidx.camera.core.impl.CameraInternal r9 = r12.mo2366a()
            if (r9 == 0) goto L_0x012c
            androidx.camera.core.impl.CameraInternal r9 = r12.mo2366a()
            int r9 = r12.mo2372g(r9)
            if (r9 != 0) goto L_0x014b
        L_0x012c:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.r<?> r10 = r12.f1865f
            androidx.camera.core.impl.h r10 = (androidx.camera.core.impl.C0584h) r10
            r10.getClass()
            androidx.camera.core.impl.a r11 = androidx.camera.core.impl.C0584h.f1987C
            androidx.camera.core.impl.Config r10 = r10.getConfig()
            androidx.camera.core.impl.n r10 = (androidx.camera.core.impl.C0590n) r10
            java.lang.Object r10 = r10.mo2423b(r11, r6)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x014a
            goto L_0x014b
        L_0x014a:
            r2 = 0
        L_0x014b:
            if (r8 != 0) goto L_0x014f
            if (r2 == 0) goto L_0x0161
        L_0x014f:
            androidx.camera.core.t r6 = new androidx.camera.core.t
            int r2 = r1.getMaxImages()
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r5, r4, r7, r2)
            d0.c r4 = new d0.c
            r4.<init>(r2)
            r6.<init>(r4)
        L_0x0161:
            if (r6 == 0) goto L_0x016f
            androidx.camera.core.j r2 = r12.f1912l
            java.lang.Object r4 = r2.f2100s
            monitor-enter(r4)
            r2.f2090i = r6     // Catch:{ all -> 0x016c }
            monitor-exit(r4)     // Catch:{ all -> 0x016c }
            goto L_0x016f
        L_0x016c:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x016c }
            throw r13
        L_0x016f:
            androidx.camera.core.impl.CameraInternal r2 = r12.mo2366a()
            if (r2 == 0) goto L_0x017d
            androidx.camera.core.j r4 = r12.f1912l
            int r2 = r12.mo2372g(r2)
            r4.f2084c = r2
        L_0x017d:
            androidx.camera.core.j r2 = r12.f1912l
            r1.mo2556a(r2, r0)
            androidx.camera.core.impl.SessionConfig$b r0 = androidx.camera.core.impl.SessionConfig.C0566b.m1604d(r14)
            e0.a0 r2 = r12.f1915o
            if (r2 == 0) goto L_0x018d
            r2.mo2450a()
        L_0x018d:
            e0.a0 r2 = new e0.a0
            android.view.Surface r4 = r1.getSurface()
            int r5 = r12.mo2370e()
            r2.<init>(r4, r15, r5)
            r12.f1915o = r2
            od.c r2 = r2.mo2453d()
            d0.t r4 = new d0.t
            r4.<init>(r3, r1, r6)
            g0.b r1 = com.google.android.play.core.appupdate.C14226d.m35358z0()
            r2.addListener(r4, r1)
            e0.a0 r1 = r12.f1915o
            java.util.LinkedHashSet r2 = r0.f1939a
            r2.add(r1)
            androidx.camera.core.impl.e$a r2 = r0.f1940b
            java.util.HashSet r2 = r2.f1977a
            r2.add(r1)
            d0.u r1 = new d0.u
            r1.<init>(r12, r13, r14, r15)
            java.util.ArrayList r13 = r0.f1943e
            r13.add(r1)
            return r0
        L_0x01c5:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0556i.mo2440z(java.lang.String, androidx.camera.core.impl.h, android.util.Size):androidx.camera.core.impl.SessionConfig$b");
    }
}
