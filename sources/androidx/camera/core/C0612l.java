package androidx.camera.core;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0554h;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0581f;
import androidx.camera.core.impl.C0585i;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.C0588l;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24361g;
import p001a0.C0016g;
import p054d0.C4267a0;
import p054d0.C4273c0;
import p054d0.C4289j0;
import p054d0.C4298o;
import p066e0.C4415a0;
import p066e0.C4424e;
import p066e0.C4449p;
import p066e0.C4451q;
import p089g0.C4729d;
import p102h0.C5018c;
import p102h0.C5023g;
import p115i0.C5230f;
import p115i0.C5231g;
import p115i0.C5235k;
import p153l0.C5550a;
import p304x.C7082o;
import p358af.C13437d;
import p583jk.C17884p;
import p695od.C18728c;

/* renamed from: androidx.camera.core.l */
public final class C0612l extends UseCase {

    /* renamed from: F */
    public static final C0618f f2108F = new C0618f();

    /* renamed from: G */
    public static final C5550a f2109G = new C5550a();

    /* renamed from: A */
    public C0636s f2110A;

    /* renamed from: B */
    public C18728c<Void> f2111B = C5023g.m12857e((Object) null);

    /* renamed from: C */
    public C4424e f2112C;

    /* renamed from: D */
    public C4415a0 f2113D;

    /* renamed from: E */
    public C0620h f2114E;

    /* renamed from: l */
    public final C13715c f2115l = new C13715c();

    /* renamed from: m */
    public final Executor f2116m;

    /* renamed from: n */
    public final int f2117n;

    /* renamed from: o */
    public final AtomicReference<Integer> f2118o = new AtomicReference<>((Object) null);

    /* renamed from: p */
    public final int f2119p;

    /* renamed from: q */
    public int f2120q = -1;

    /* renamed from: r */
    public ExecutorService f2121r;

    /* renamed from: s */
    public C0578e f2122s;

    /* renamed from: t */
    public C4449p f2123t;

    /* renamed from: u */
    public int f2124u;

    /* renamed from: v */
    public C4451q f2125v;

    /* renamed from: w */
    public boolean f2126w = false;

    /* renamed from: x */
    public boolean f2127x = true;

    /* renamed from: y */
    public SessionConfig.C0566b f2128y;

    /* renamed from: z */
    public C0642t f2129z;

    /* renamed from: androidx.camera.core.l$a */
    public class C0613a extends C4424e {
    }

    /* renamed from: androidx.camera.core.l$b */
    public class C0614b extends C4424e {
    }

    /* renamed from: androidx.camera.core.l$c */
    public class C0615c implements C0620h.C0623c {

        /* renamed from: a */
        public final /* synthetic */ C5235k f2130a;

        public C0615c(C5235k kVar) {
            this.f2130a = kVar;
        }

        /* renamed from: a */
        public final void mo2552a(C0619g gVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                C5235k kVar = this.f2130a;
                synchronized (kVar.f17329b) {
                    kVar.f17330c = 0;
                }
                C5235k kVar2 = this.f2130a;
                synchronized (kVar2.f17329b) {
                    kVar2.f17331d = 0;
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.l$d */
    public class C0616d implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f2131b = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            StringBuilder k = C13555b.m33972k("CameraX-image_capture_");
            k.append(this.f2131b.getAndIncrement());
            return new Thread(runnable, k.toString());
        }
    }

    /* renamed from: androidx.camera.core.l$e */
    public static final class C0617e implements C0595r.C0596a<C0612l, C0585i, C0617e> {

        /* renamed from: a */
        public final C0589m f2132a;

        public C0617e() {
            this(C0589m.m1674t());
        }

        public final C0588l getMutableConfig() {
            return this.f2132a;
        }

        public final C0595r getUseCaseConfig() {
            return new C0585i(C0590n.m1678s(this.f2132a));
        }

        public C0617e(C0589m mVar) {
            Object obj;
            Class<C0612l> cls = C0612l.class;
            this.f2132a = mVar;
            Object obj2 = null;
            try {
                obj = mVar.mo2422a(C5231g.f17324u);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f2132a.mo2503w(C5231g.f17324u, cls);
                C0589m mVar2 = this.f2132a;
                C0572a aVar = C5231g.f17323t;
                mVar2.getClass();
                try {
                    obj2 = mVar2.mo2422a(aVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f2132a.mo2503w(C5231g.f17323t, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* renamed from: androidx.camera.core.l$f */
    public static final class C0618f {

        /* renamed from: a */
        public static final C0585i f2133a;

        static {
            C0617e eVar = new C0617e();
            eVar.f2132a.mo2503w(C0595r.f2028q, 4);
            eVar.f2132a.mo2503w(C0587k.f2005f, 0);
            f2133a = new C0585i(C0590n.m1678s(eVar.f2132a));
        }
    }

    /* renamed from: androidx.camera.core.l$g */
    public static class C0619g {
    }

    /* renamed from: androidx.camera.core.l$h */
    public static class C0620h implements C0554h.C0555a {

        /* renamed from: a */
        public final ArrayDeque f2134a = new ArrayDeque();

        /* renamed from: b */
        public C0619g f2135b = null;

        /* renamed from: c */
        public CallbackToFutureAdapter.C0675c f2136c = null;

        /* renamed from: d */
        public int f2137d = 0;

        /* renamed from: e */
        public final C0622b f2138e;

        /* renamed from: f */
        public final int f2139f = 2;

        /* renamed from: g */
        public final C0623c f2140g;

        /* renamed from: h */
        public final Object f2141h = new Object();

        /* renamed from: androidx.camera.core.l$h$a */
        public class C0621a implements C5018c<C0627p> {

            /* renamed from: a */
            public final /* synthetic */ C0619g f2142a;

            public C0621a(C0619g gVar) {
                this.f2142a = gVar;
            }

            public final void onFailure(Throwable th) {
                synchronized (C0620h.this.f2141h) {
                    if (th instanceof CancellationException) {
                        C0620h hVar = C0620h.this;
                        hVar.f2135b = null;
                        hVar.f2136c = null;
                        hVar.mo2555c();
                    } else {
                        C0619g gVar = this.f2142a;
                        C0612l.m1761C(th);
                        if (th != null) {
                            th.getMessage();
                        }
                        gVar.getClass();
                        throw null;
                    }
                }
            }

            public final void onSuccess(Object obj) {
                C0627p pVar = (C0627p) obj;
                synchronized (C0620h.this.f2141h) {
                    pVar.getClass();
                    new HashSet().add(C0620h.this);
                    C0620h.this.f2137d++;
                    this.f2142a.getClass();
                    throw null;
                }
            }
        }

        /* renamed from: androidx.camera.core.l$h$b */
        public interface C0622b {
        }

        /* renamed from: androidx.camera.core.l$h$c */
        public interface C0623c {
        }

        public C0620h(C4267a0 a0Var, C0615c cVar) {
            this.f2138e = a0Var;
            this.f2140g = cVar;
        }

        /* renamed from: a */
        public final void mo2554a(RuntimeException runtimeException) {
            C0619g gVar;
            CallbackToFutureAdapter.C0675c cVar;
            ArrayList arrayList;
            synchronized (this.f2141h) {
                gVar = this.f2135b;
                this.f2135b = null;
                cVar = this.f2136c;
                this.f2136c = null;
                arrayList = new ArrayList(this.f2134a);
                this.f2134a.clear();
            }
            if (gVar == null || cVar == null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    C0612l.m1761C(runtimeException);
                    runtimeException.getMessage();
                    ((C0619g) it.next()).getClass();
                    throw null;
                }
                return;
            }
            C0612l.m1761C(runtimeException);
            runtimeException.getMessage();
            throw null;
        }

        /* renamed from: b */
        public final void mo2437b(C0627p pVar) {
            synchronized (this.f2141h) {
                this.f2137d--;
                mo2555c();
            }
        }

        /* renamed from: c */
        public final void mo2555c() {
            synchronized (this.f2141h) {
                if (this.f2135b == null) {
                    if (this.f2137d >= this.f2139f) {
                        C4289j0.m11435b("ImageCapture");
                        return;
                    }
                    C0619g gVar = (C0619g) this.f2134a.poll();
                    if (gVar != null) {
                        this.f2135b = gVar;
                        C0623c cVar = this.f2140g;
                        if (cVar != null) {
                            ((C0615c) cVar).mo2552a(gVar);
                        }
                        C0612l lVar = (C0612l) ((C4267a0) this.f2138e).f15173c;
                        lVar.getClass();
                        CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C4273c0(0, lVar, gVar));
                        this.f2136c = a;
                        C5023g.m12853a(a, new C0621a(gVar), C14226d.m35352s0());
                    }
                }
            }
        }
    }

    public C0612l(C0585i iVar) {
        super(iVar);
        new Matrix();
        C0585i iVar2 = (C0585i) this.f1865f;
        C0572a aVar = C0585i.f2001y;
        iVar2.getClass();
        if (((C0590n) iVar2.getConfig()).mo2425e(aVar)) {
            this.f2117n = ((Integer) ((C0590n) iVar2.getConfig()).mo2422a(aVar)).intValue();
        } else {
            this.f2117n = 1;
        }
        this.f2119p = ((Integer) ((C0590n) iVar2.getConfig()).mo2423b(C0585i.f1998G, 0)).intValue();
        C4729d x0 = C14226d.m35357x0();
        Executor executor = (Executor) ((C0590n) iVar2.getConfig()).mo2423b(C5230f.f17322s, x0);
        executor.getClass();
        this.f2116m = executor;
        new SequentialExecutor(executor);
    }

    /* renamed from: C */
    public static void m1761C(Throwable th) {
        if (!(th instanceof CameraClosedException) && (th instanceof ImageCaptureException)) {
            ((ImageCaptureException) th).getClass();
        }
    }

    /* renamed from: F */
    public static boolean m1762F(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x024b  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.SessionConfig.C0566b mo2544A(java.lang.String r16, androidx.camera.core.impl.C0585i r17, android.util.Size r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            p583jk.C17884p.m44372k()
            androidx.camera.core.impl.SessionConfig$b r2 = androidx.camera.core.impl.SessionConfig.C0566b.m1604d(r17)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 2
            r5 = 23
            if (r3 < r5) goto L_0x001c
            int r5 = r1.f2117n
            if (r5 != r4) goto L_0x001c
            androidx.camera.core.impl.CameraControlInternal r5 = r15.mo2367b()
            r5.mo2443a(r0, r2)
        L_0x001c:
            androidx.camera.core.impl.a r5 = androidx.camera.core.impl.C0585i.f1996E
            androidx.camera.core.impl.Config r6 = r17.getConfig()
            androidx.camera.core.impl.n r6 = (androidx.camera.core.impl.C0590n) r6
            r7 = 0
            java.lang.Object r6 = r6.mo2423b(r5, r7)
            d0.h0 r6 = (p054d0.C4285h0) r6
            r8 = 0
            if (r6 == 0) goto L_0x0057
            androidx.camera.core.t r3 = new androidx.camera.core.t
            androidx.camera.core.impl.Config r4 = r17.getConfig()
            androidx.camera.core.impl.n r4 = (androidx.camera.core.impl.C0590n) r4
            java.lang.Object r4 = r4.mo2423b(r5, r7)
            d0.h0 r4 = (p054d0.C4285h0) r4
            r18.getWidth()
            r18.getHeight()
            r15.mo2370e()
            e0.z r4 = r4.newInstance()
            r3.<init>(r4)
            r1.f2129z = r3
            androidx.camera.core.l$a r3 = new androidx.camera.core.l$a
            r3.<init>()
            r1.f2112C = r3
            goto L_0x0126
        L_0x0057:
            boolean r5 = r1.f2127x
            r6 = 26
            r9 = 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0101
            int r5 = r15.mo2370e()
            if (r5 != r9) goto L_0x007c
            d0.c r3 = new d0.c
            int r5 = r18.getWidth()
            int r6 = r18.getHeight()
            int r9 = r15.mo2370e()
            android.media.ImageReader r4 = android.media.ImageReader.newInstance(r5, r6, r9, r4)
            r3.<init>(r4)
            r4 = r7
            goto L_0x00d2
        L_0x007c:
            int r5 = r15.mo2370e()
            r10 = 35
            if (r5 != r10) goto L_0x00ea
            if (r3 < r6) goto L_0x00e2
            i0.k r3 = new i0.k
            int r5 = r15.mo2547E()
            r3.<init>(r5, r4)
            d0.m0 r5 = new d0.m0
            int r6 = r18.getWidth()
            int r11 = r18.getHeight()
            android.media.ImageReader r4 = android.media.ImageReader.newInstance(r6, r11, r10, r4)
            r5.<init>(r4)
            d0.o$a r4 = p054d0.C4298o.m11451a()
            androidx.camera.core.s$d r6 = new androidx.camera.core.s$d
            r6.<init>(r5, r4, r3)
            java.util.concurrent.ExecutorService r10 = r1.f2121r
            r6.f2203e = r10
            r6.f2202d = r9
            androidx.camera.core.s r9 = new androidx.camera.core.s
            r9.<init>(r6)
            e0.f0 r6 = p066e0.C4427f0.m11609c()
            java.lang.String r10 = r9.f2190p
            java.util.List<androidx.camera.core.impl.f> r4 = r4.f15228a
            java.lang.Object r4 = r4.get(r8)
            androidx.camera.core.impl.f r4 = (androidx.camera.core.impl.C0581f) r4
            r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.util.Map<java.lang.String, java.lang.Object> r11 = r6.f15509a
            r11.put(r10, r4)
            r5.f15219c = r6
            r4 = r3
            r3 = r9
        L_0x00d2:
            androidx.camera.core.l$b r5 = new androidx.camera.core.l$b
            r5.<init>()
            r1.f2112C = r5
            androidx.camera.core.t r5 = new androidx.camera.core.t
            r5.<init>(r3)
            r1.f2129z = r5
            goto L_0x01b8
        L_0x00e2:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Does not support API level < 26"
            r0.<init>(r2)
            throw r0
        L_0x00ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unsupported image format:"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            int r3 = r15.mo2370e()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0101:
            e0.q r5 = r1.f2125v
            if (r5 != 0) goto L_0x0129
            boolean r10 = r1.f2126w
            if (r10 == 0) goto L_0x010a
            goto L_0x0129
        L_0x010a:
            androidx.camera.core.q r3 = new androidx.camera.core.q
            int r5 = r18.getWidth()
            int r6 = r18.getHeight()
            int r9 = r15.mo2370e()
            r3.<init>(r5, r6, r9, r4)
            androidx.camera.core.q$a r4 = r3.f2151b
            r1.f2112C = r4
            androidx.camera.core.t r4 = new androidx.camera.core.t
            r4.<init>(r3)
            r1.f2129z = r4
        L_0x0126:
            r4 = r7
            goto L_0x01b8
        L_0x0129:
            int r4 = r15.mo2370e()
            int r10 = r15.mo2370e()
            boolean r11 = r1.f2126w
            if (r11 == 0) goto L_0x016c
            if (r3 < r6) goto L_0x0164
            java.lang.String r3 = "ImageCapture"
            p054d0.C4289j0.m11435b(r3)
            e0.q r3 = r1.f2125v
            if (r3 == 0) goto L_0x0157
            i0.k r3 = new i0.k
            int r5 = r15.mo2547E()
            int r6 = r1.f2124u
            r3.<init>(r5, r6)
            d0.r r5 = new d0.r
            e0.q r6 = r1.f2125v
            int r10 = r1.f2124u
            java.util.concurrent.ExecutorService r11 = r1.f2121r
            r5.<init>(r6, r10, r3, r11)
            goto L_0x016e
        L_0x0157:
            i0.k r5 = new i0.k
            int r3 = r15.mo2547E()
            int r6 = r1.f2124u
            r5.<init>(r3, r6)
            r3 = r5
            goto L_0x016e
        L_0x0164:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Software JPEG only supported on API 26+"
            r0.<init>(r2)
            throw r0
        L_0x016c:
            r3 = r7
            r9 = r10
        L_0x016e:
            androidx.camera.core.s$d r6 = new androidx.camera.core.s$d
            int r10 = r18.getWidth()
            int r11 = r18.getHeight()
            int r12 = r1.f2124u
            d0.o$a r13 = p054d0.C4298o.m11451a()
            e0.p r13 = r15.mo2545B(r13)
            androidx.camera.core.q r14 = new androidx.camera.core.q
            r14.<init>(r10, r11, r4, r12)
            r6.<init>(r14, r13, r5)
            java.util.concurrent.ExecutorService r4 = r1.f2121r
            r6.f2203e = r4
            r6.f2202d = r9
            androidx.camera.core.s r4 = new androidx.camera.core.s
            r4.<init>(r6)
            r1.f2110A = r4
            java.lang.Object r5 = r4.f2175a
            monitor-enter(r5)
            e0.z r4 = r4.f2181g     // Catch:{ all -> 0x027e }
            boolean r6 = r4 instanceof androidx.camera.core.C0629q     // Catch:{ all -> 0x027e }
            if (r6 == 0) goto L_0x01a6
            androidx.camera.core.q r4 = (androidx.camera.core.C0629q) r4     // Catch:{ all -> 0x027e }
            androidx.camera.core.q$a r4 = r4.f2151b     // Catch:{ all -> 0x027e }
            monitor-exit(r5)     // Catch:{ all -> 0x027e }
            goto L_0x01ac
        L_0x01a6:
            d0.o0 r4 = new d0.o0     // Catch:{ all -> 0x027e }
            r4.<init>()     // Catch:{ all -> 0x027e }
            monitor-exit(r5)     // Catch:{ all -> 0x027e }
        L_0x01ac:
            r1.f2112C = r4
            androidx.camera.core.t r4 = new androidx.camera.core.t
            androidx.camera.core.s r5 = r1.f2110A
            r4.<init>(r5)
            r1.f2129z = r4
            r4 = r3
        L_0x01b8:
            androidx.camera.core.l$h r3 = r1.f2114E
            if (r3 == 0) goto L_0x01c6
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r6 = "Request is canceled."
            r5.<init>(r6)
            r3.mo2554a(r5)
        L_0x01c6:
            androidx.camera.core.l$h r3 = new androidx.camera.core.l$h
            d0.a0 r5 = new d0.a0
            r5.<init>(r15, r8)
            if (r4 != 0) goto L_0x01d1
            r6 = r7
            goto L_0x01d6
        L_0x01d1:
            androidx.camera.core.l$c r6 = new androidx.camera.core.l$c
            r6.<init>(r4)
        L_0x01d6:
            r3.<init>(r5, r6)
            r1.f2114E = r3
            androidx.camera.core.t r3 = r1.f2129z
            c r4 = r1.f2115l
            g0.b r5 = com.google.android.play.core.appupdate.C14226d.m35358z0()
            r3.mo2556a(r4, r5)
            e0.a0 r3 = r1.f2113D
            if (r3 == 0) goto L_0x01ed
            r3.mo2450a()
        L_0x01ed:
            e0.a0 r3 = new e0.a0
            androidx.camera.core.t r4 = r1.f2129z
            android.view.Surface r4 = r4.getSurface()
            android.util.Size r5 = new android.util.Size
            androidx.camera.core.t r6 = r1.f2129z
            int r6 = r6.getWidth()
            androidx.camera.core.t r9 = r1.f2129z
            int r9 = r9.getHeight()
            r5.<init>(r6, r9)
            androidx.camera.core.t r6 = r1.f2129z
            int r6 = r6.getImageFormat()
            r3.<init>(r4, r5, r6)
            r1.f2113D = r3
            androidx.camera.core.s r3 = r1.f2110A
            r4 = 1
            if (r3 == 0) goto L_0x024b
            java.lang.Object r5 = r3.f2175a
            monitor-enter(r5)
            boolean r6 = r3.f2179e     // Catch:{ all -> 0x0248 }
            if (r6 == 0) goto L_0x0231
            boolean r6 = r3.f2180f     // Catch:{ all -> 0x0248 }
            if (r6 != 0) goto L_0x0231
            od.c<java.lang.Void> r3 = r3.f2189o     // Catch:{ all -> 0x0248 }
            com.facebook.appevents.l r6 = new com.facebook.appevents.l     // Catch:{ all -> 0x0248 }
            r6.<init>(r8)     // Catch:{ all -> 0x0248 }
            g0.a r7 = com.google.android.play.core.appupdate.C14226d.m35352s0()     // Catch:{ all -> 0x0248 }
            h0.b r3 = p102h0.C5023g.m12860h(r3, r6, r7)     // Catch:{ all -> 0x0248 }
            goto L_0x0246
        L_0x0231:
            androidx.concurrent.futures.CallbackToFutureAdapter$c r6 = r3.f2186l     // Catch:{ all -> 0x0248 }
            if (r6 != 0) goto L_0x0240
            d0.a0 r6 = new d0.a0     // Catch:{ all -> 0x0248 }
            r6.<init>(r3, r4)     // Catch:{ all -> 0x0248 }
            androidx.concurrent.futures.CallbackToFutureAdapter$c r6 = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(r6)     // Catch:{ all -> 0x0248 }
            r3.f2186l = r6     // Catch:{ all -> 0x0248 }
        L_0x0240:
            androidx.concurrent.futures.CallbackToFutureAdapter$c r3 = r3.f2186l     // Catch:{ all -> 0x0248 }
            od.c r3 = p102h0.C5023g.m12858f(r3)     // Catch:{ all -> 0x0248 }
        L_0x0246:
            monitor-exit(r5)     // Catch:{ all -> 0x0248 }
            goto L_0x024f
        L_0x0248:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0248 }
            throw r0
        L_0x024b:
            h0.j$c r3 = p102h0.C5023g.m12857e(r7)
        L_0x024f:
            r1.f2111B = r3
            e0.a0 r3 = r1.f2113D
            od.c r3 = r3.mo2453d()
            androidx.camera.core.t r5 = r1.f2129z
            java.util.Objects.requireNonNull(r5)
            x.b2 r6 = new x.b2
            r6.<init>(r5, r4)
            g0.b r4 = com.google.android.play.core.appupdate.C14226d.m35358z0()
            r3.addListener(r6, r4)
            e0.a0 r3 = r1.f2113D
            java.util.LinkedHashSet r4 = r2.f1939a
            r4.add(r3)
            d0.b0 r3 = new d0.b0
            r4 = r16
            r5 = r17
            r3.<init>(r15, r4, r5, r0)
            java.util.ArrayList r0 = r2.f1943e
            r0.add(r3)
            return r2
        L_0x027e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x027e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0612l.mo2544A(java.lang.String, androidx.camera.core.impl.i, android.util.Size):androidx.camera.core.impl.SessionConfig$b");
    }

    /* renamed from: B */
    public final C4449p mo2545B(C4298o.C4299a aVar) {
        List<C0581f> captureStages = this.f2123t.getCaptureStages();
        if (captureStages == null || captureStages.isEmpty()) {
            return aVar;
        }
        return new C4298o.C4299a(captureStages);
    }

    /* renamed from: D */
    public final int mo2546D() {
        int i;
        synchronized (this.f2118o) {
            i = this.f2120q;
            if (i == -1) {
                C0585i iVar = (C0585i) this.f1865f;
                iVar.getClass();
                i = ((Integer) ((C0590n) iVar.getConfig()).mo2423b(C0585i.f2002z, 2)).intValue();
            }
        }
        return i;
    }

    /* renamed from: E */
    public final int mo2547E() {
        C0585i iVar = (C0585i) this.f1865f;
        C0572a aVar = C0585i.f1999H;
        iVar.getClass();
        if (((C0590n) iVar.getConfig()).mo2425e(aVar)) {
            return ((Integer) ((C0590n) iVar.getConfig()).mo2422a(aVar)).intValue();
        }
        int i = this.f2117n;
        if (i == 0) {
            return 100;
        }
        if (i == 1 || i == 2) {
            return 95;
        }
        throw new IllegalStateException(C13437d.m33707l(C13555b.m33972k("CaptureMode "), this.f2117n, " is invalid"));
    }

    /* renamed from: G */
    public final void mo2548G() {
        synchronized (this.f2118o) {
            if (this.f2118o.get() == null) {
                mo2367b().setFlashMode(mo2546D());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2549H() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.f2118o
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.f2118o     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            int r1 = r1.intValue()     // Catch:{ all -> 0x001f }
            int r2 = r3.mo2546D()     // Catch:{ all -> 0x001f }
            if (r1 == r2) goto L_0x001d
            r3.mo2548G()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0612l.mo2549H():void");
    }

    /* renamed from: d */
    public final C0595r<?> mo2369d(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo2468a(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, this.f2117n);
        if (z) {
            f2108F.getClass();
            a = C13715c.m34250p(a, C0618f.f2133a);
        }
        if (a == null) {
            return null;
        }
        return new C0585i(C0590n.m1678s(((C0617e) mo2373h(a)).f2132a));
    }

    /* renamed from: h */
    public final C0595r.C0596a<?, ?, ?> mo2373h(Config config) {
        return new C0617e(C0589m.m1675u(config));
    }

    /* renamed from: p */
    public final void mo2381p() {
        C0585i iVar = (C0585i) this.f1865f;
        C0578e.C0580b s = iVar.mo2500s();
        if (s != null) {
            C0578e.C0579a aVar = new C0578e.C0579a();
            s.mo2483a(iVar, aVar);
            this.f2122s = aVar.mo2482d();
            this.f2125v = (C4451q) ((C0590n) iVar.getConfig()).mo2423b(C0585i.f1993B, null);
            this.f2124u = ((Integer) ((C0590n) iVar.getConfig()).mo2423b(C0585i.f1995D, 2)).intValue();
            C4298o.C4299a a = C4298o.m11451a();
            this.f2123t = (C4449p) ((C0590n) iVar.getConfig()).mo2423b(C0585i.f1992A, a);
            C0572a aVar2 = C0585i.f1997F;
            Boolean bool = Boolean.FALSE;
            this.f2126w = ((Boolean) ((C0590n) iVar.getConfig()).mo2423b(aVar2, bool)).booleanValue();
            this.f2127x = ((Boolean) ((C0590n) iVar.getConfig()).mo2423b(C0585i.f2000I, bool)).booleanValue();
            C24361g.m61185s(mo2366a(), "Attached camera cannot be null");
            this.f2121r = Executors.newFixedThreadPool(1, new C0616d());
            return;
        }
        StringBuilder k = C13555b.m33972k("Implementation is missing option unpacker for ");
        k.append(C0016g.m18a(iVar, iVar.toString()));
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: q */
    public final void mo2382q() {
        mo2548G();
    }

    /* renamed from: s */
    public final void mo2384s() {
        C18728c<Void> cVar = this.f2111B;
        if (this.f2114E != null) {
            this.f2114E.mo2554a(new CameraClosedException());
        }
        mo2551z();
        this.f2126w = false;
        cVar.addListener(new C7082o(this.f2121r, 2), C14226d.m35352s0());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [androidx.camera.core.impl.r$a<?, ?, ?>, androidx.camera.core.impl.r$a, d0.s] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.C0595r<?> mo2385t(p066e0.C4443m r9, androidx.camera.core.impl.C0595r.C0596a<?, ?, ?> r10) {
        /*
            r8 = this;
            androidx.camera.core.impl.r r0 = r10.getUseCaseConfig()
            androidx.camera.core.impl.a r1 = androidx.camera.core.impl.C0585i.f1993B
            r2 = 0
            java.lang.Object r0 = r0.mo2423b(r1, r2)
            java.lang.String r1 = "ImageCapture"
            if (r0 == 0) goto L_0x0026
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L_0x0026
            p054d0.C4289j0.m11435b(r1)
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0585i.f1997F
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.m r9 = (androidx.camera.core.impl.C0589m) r9
            r9.mo2503w(r0, r3)
            goto L_0x0061
        L_0x0026:
            e0.j0 r9 = r9.getCameraQuirks()
            java.lang.Class<k0.d> r0 = p140k0.C5448d.class
            boolean r9 = r9.mo19959e(r0)
            if (r9 == 0) goto L_0x0061
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0585i.f1997F
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.n r9 = (androidx.camera.core.impl.C0590n) r9
            r9.getClass()
            java.lang.Object r3 = r9.mo2422a(r0)     // Catch:{ IllegalArgumentException -> 0x0044 }
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r9 = r3.booleanValue()
            if (r9 != 0) goto L_0x0051
            p054d0.C4289j0.m11435b(r1)
            goto L_0x0061
        L_0x0051:
            p054d0.C4289j0.m11435b(r1)
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0585i.f1997F
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.m r9 = (androidx.camera.core.impl.C0589m) r9
            r9.mo2503w(r0, r3)
        L_0x0061:
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0585i.f1997F
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = r9
            androidx.camera.core.impl.n r4 = (androidx.camera.core.impl.C0590n) r4
            r4.getClass()
            java.lang.Object r3 = r4.mo2422a(r0)     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            r3 = 256(0x100, float:3.59E-43)
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00b3
            int r0 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r0 >= r7) goto L_0x008c
            p054d0.C4289j0.m11435b(r1)
            r0 = 0
            goto L_0x008d
        L_0x008c:
            r0 = 1
        L_0x008d:
            androidx.camera.core.impl.a r7 = androidx.camera.core.impl.C0585i.f1994C
            java.lang.Object r4 = r4.mo2422a(r7)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x0096
        L_0x0094:
            r4 = r2
        L_0x0096:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x00a4
            int r4 = r4.intValue()
            if (r4 == r3) goto L_0x00a4
            p054d0.C4289j0.m11435b(r1)
            r0 = 0
        L_0x00a4:
            if (r0 != 0) goto L_0x00b4
            p054d0.C4289j0.m11435b(r1)
            androidx.camera.core.impl.a r1 = androidx.camera.core.impl.C0585i.f1997F
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.m r9 = (androidx.camera.core.impl.C0589m) r9
            r9.mo2503w(r1, r4)
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r1 = androidx.camera.core.impl.C0585i.f1994C
            androidx.camera.core.impl.n r9 = (androidx.camera.core.impl.C0590n) r9
            r9.getClass()
            java.lang.Object r9 = r9.mo2422a(r1)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            goto L_0x00c6
        L_0x00c4:
            r9 = r2
        L_0x00c6:
            java.lang.Integer r9 = (java.lang.Integer) r9
            r1 = 35
            if (r9 == 0) goto L_0x00ff
            androidx.camera.core.impl.l r3 = r10.getMutableConfig()
            androidx.camera.core.impl.a r4 = androidx.camera.core.impl.C0585i.f1993B
            androidx.camera.core.impl.n r3 = (androidx.camera.core.impl.C0590n) r3
            r3.getClass()
            java.lang.Object r2 = r3.mo2422a(r4)     // Catch:{ IllegalArgumentException -> 0x00dc }
            goto L_0x00dd
        L_0x00dc:
        L_0x00dd:
            if (r2 != 0) goto L_0x00e1
            r2 = 1
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            java.lang.String r3 = "Cannot set buffer format with CaptureProcessor defined."
            mf0.C24361g.m61177o(r2, r3)
            androidx.camera.core.impl.l r2 = r10.getMutableConfig()
            androidx.camera.core.impl.a r3 = androidx.camera.core.impl.C0586j.f2004e
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            int r1 = r9.intValue()
        L_0x00f4:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            androidx.camera.core.impl.m r2 = (androidx.camera.core.impl.C0589m) r2
            r2.mo2503w(r3, r9)
            goto L_0x0176
        L_0x00ff:
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r4 = androidx.camera.core.impl.C0585i.f1993B
            androidx.camera.core.impl.n r9 = (androidx.camera.core.impl.C0590n) r9
            r9.getClass()
            java.lang.Object r9 = r9.mo2422a(r4)     // Catch:{ IllegalArgumentException -> 0x010f }
            goto L_0x0111
        L_0x010f:
            r9 = r2
        L_0x0111:
            if (r9 != 0) goto L_0x0167
            if (r0 == 0) goto L_0x0116
            goto L_0x0167
        L_0x0116:
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0587k.f2011l
            androidx.camera.core.impl.n r9 = (androidx.camera.core.impl.C0590n) r9
            r9.getClass()
            java.lang.Object r2 = r9.mo2422a(r0)     // Catch:{ IllegalArgumentException -> 0x0126 }
            goto L_0x0127
        L_0x0126:
        L_0x0127:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x013b
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0586j.f2004e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            androidx.camera.core.impl.m r9 = (androidx.camera.core.impl.C0589m) r9
            r9.mo2503w(r0, r1)
            goto L_0x0176
        L_0x013b:
            boolean r9 = m1762F(r3, r2)
            if (r9 == 0) goto L_0x0151
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0586j.f2004e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            androidx.camera.core.impl.m r9 = (androidx.camera.core.impl.C0589m) r9
            r9.mo2503w(r0, r1)
            goto L_0x0176
        L_0x0151:
            boolean r9 = m1762F(r1, r2)
            if (r9 == 0) goto L_0x0176
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0586j.f2004e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.core.impl.m r9 = (androidx.camera.core.impl.C0589m) r9
            r9.mo2503w(r0, r1)
            goto L_0x0176
        L_0x0167:
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0586j.f2004e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.core.impl.m r9 = (androidx.camera.core.impl.C0589m) r9
            r9.mo2503w(r0, r1)
        L_0x0176:
            androidx.camera.core.impl.l r9 = r10.getMutableConfig()
            androidx.camera.core.impl.a r0 = androidx.camera.core.impl.C0585i.f1995D
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.core.impl.n r9 = (androidx.camera.core.impl.C0590n) r9
            r9.getClass()
            java.lang.Object r1 = r9.mo2422a(r0)     // Catch:{ IllegalArgumentException -> 0x018b }
            goto L_0x018c
        L_0x018b:
        L_0x018c:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r9 = r1.intValue()
            if (r9 < r5) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r5 = 0
        L_0x0196:
            java.lang.String r9 = "Maximum outstanding image count must be at least 1"
            mf0.C24361g.m61177o(r5, r9)
            androidx.camera.core.impl.r r9 = r10.getUseCaseConfig()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0612l.mo2385t(e0.m, androidx.camera.core.impl.r$a):androidx.camera.core.impl.r");
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ImageCapture:");
        k.append(mo2371f());
        return k.toString();
    }

    /* renamed from: u */
    public final void mo2386u() {
        if (this.f2114E != null) {
            this.f2114E.mo2554a(new CameraClosedException());
        }
    }

    /* renamed from: v */
    public final Size mo2387v(Size size) {
        SessionConfig.C0566b A = mo2544A(mo2368c(), (C0585i) this.f1865f, size);
        this.f2128y = A;
        mo2390y(A.mo2460c());
        mo2376k();
        return size;
    }

    /* renamed from: w */
    public final void mo2388w(Matrix matrix) {
    }

    /* renamed from: z */
    public final void mo2551z() {
        C17884p.m44372k();
        C0620h hVar = this.f2114E;
        if (hVar != null) {
            hVar.mo2554a(new CancellationException("Request is canceled."));
            this.f2114E = null;
        }
        C4415a0 a0Var = this.f2113D;
        this.f2113D = null;
        this.f2129z = null;
        this.f2110A = null;
        this.f2111B = C5023g.m12857e((Object) null);
        if (a0Var != null) {
            a0Var.mo2450a();
        }
    }
}
