package p304x;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Size;
import androidx.appcompat.widget.C0441n1;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import mf0.C24368m;
import p019b0.C1424a;
import p032c0.C1751a;
import p032c0.C1753c;
import p032c0.C1755e;
import p054d0.C4289j0;
import p066e0.C4424e;
import p066e0.C4428g;
import p066e0.C4436j0;
import p066e0.C4450p0;
import p102h0.C5019d;
import p102h0.C5023g;
import p102h0.C5028j;
import p115i0.C5225a;
import p291w.C6956a;
import p316y.C7225s;
import p373au.C13533e;
import p695od.C18728c;

/* renamed from: x.q */
public final class C7090q implements CameraControlInternal {

    /* renamed from: b */
    public final C7092b f22035b;

    /* renamed from: c */
    public final Executor f22036c;

    /* renamed from: d */
    public final Object f22037d = new Object();

    /* renamed from: e */
    public final C7225s f22038e;

    /* renamed from: f */
    public final CameraControlInternal.C0563b f22039f;

    /* renamed from: g */
    public final SessionConfig.C0566b f22040g;

    /* renamed from: h */
    public final C7066j1 f22041h;

    /* renamed from: i */
    public final C7118x1 f22042i;

    /* renamed from: j */
    public final C7115w1 f22043j;

    /* renamed from: k */
    public final C7043e1 f22044k;

    /* renamed from: l */
    public C7127z1 f22045l;

    /* renamed from: m */
    public final C1753c f22046m;

    /* renamed from: n */
    public final C7045f0 f22047n;

    /* renamed from: o */
    public int f22048o;

    /* renamed from: p */
    public volatile boolean f22049p;

    /* renamed from: q */
    public volatile int f22050q;

    /* renamed from: r */
    public final C1424a f22051r;

    /* renamed from: s */
    public final C24368m f22052s;

    /* renamed from: t */
    public final AtomicLong f22053t;

    /* renamed from: u */
    public volatile C18728c<Void> f22054u;

    /* renamed from: v */
    public int f22055v;

    /* renamed from: w */
    public long f22056w;

    /* renamed from: x */
    public final C7091a f22057x;

    /* renamed from: x.q$a */
    public static final class C7091a extends C4424e {

        /* renamed from: a */
        public HashSet f22058a = new HashSet();

        /* renamed from: b */
        public ArrayMap f22059b = new ArrayMap();

        /* renamed from: a */
        public final void mo19945a() {
            Iterator it = this.f22058a.iterator();
            while (it.hasNext()) {
                C4424e eVar = (C4424e) it.next();
                try {
                    ((Executor) this.f22059b.get(eVar)).execute(new C7082o(eVar, 0));
                } catch (RejectedExecutionException unused) {
                    C4289j0.m11435b("Camera2CameraControlImp");
                }
            }
        }

        /* renamed from: b */
        public final void mo2570b(C4428g gVar) {
            Iterator it = this.f22058a.iterator();
            while (it.hasNext()) {
                C4424e eVar = (C4424e) it.next();
                try {
                    ((Executor) this.f22059b.get(eVar)).execute(new C7087p(0, eVar, gVar));
                } catch (RejectedExecutionException unused) {
                    C4289j0.m11435b("Camera2CameraControlImp");
                }
            }
        }

        /* renamed from: c */
        public final void mo19946c(CameraCaptureFailure cameraCaptureFailure) {
            Iterator it = this.f22058a.iterator();
            while (it.hasNext()) {
                C4424e eVar = (C4424e) it.next();
                try {
                    ((Executor) this.f22059b.get(eVar)).execute(new C7041e(eVar, cameraCaptureFailure));
                } catch (RejectedExecutionException unused) {
                    C4289j0.m11435b("Camera2CameraControlImp");
                }
            }
        }
    }

    /* renamed from: x.q$b */
    public static final class C7092b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final HashSet f22060a = new HashSet();

        /* renamed from: b */
        public final Executor f22061b;

        public C7092b(SequentialExecutor sequentialExecutor) {
            this.f22061b = sequentialExecutor;
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f22061b.execute(new C7097r(0, this, totalCaptureResult));
        }
    }

    /* renamed from: x.q$c */
    public interface C7093c {
        boolean onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    public C7090q(C7225s sVar, SequentialExecutor sequentialExecutor, Camera2CameraImpl.C0496d dVar, C4436j0 j0Var) {
        SessionConfig.C0566b bVar = new SessionConfig.C0566b();
        this.f22040g = bVar;
        this.f22048o = 0;
        this.f22049p = false;
        this.f22050q = 2;
        this.f22052s = new C24368m();
        this.f22053t = new AtomicLong(0);
        this.f22054u = C5023g.m12857e((Object) null);
        this.f22055v = 1;
        this.f22056w = 0;
        C7091a aVar = new C7091a();
        this.f22057x = aVar;
        this.f22038e = sVar;
        this.f22039f = dVar;
        this.f22036c = sequentialExecutor;
        C7092b bVar2 = new C7092b(sequentialExecutor);
        this.f22035b = bVar2;
        bVar.f1940b.f1979c = this.f22055v;
        bVar.f1940b.mo2480b(new C7122y0(bVar2));
        bVar.f1940b.mo2480b(aVar);
        this.f22044k = new C7043e1(this, sequentialExecutor);
        this.f22041h = new C7066j1(this, sequentialExecutor);
        this.f22042i = new C7118x1(this, sVar, sequentialExecutor);
        this.f22043j = new C7115w1(this, sVar, sequentialExecutor);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f22045l = new C7034c2(sVar);
        } else {
            this.f22045l = new C7040d2();
        }
        this.f22051r = new C1424a(j0Var);
        this.f22046m = new C1753c(this, sequentialExecutor);
        this.f22047n = new C7045f0(this, sVar, j0Var, sequentialExecutor);
        sequentialExecutor.execute(new C0441n1(this, 1));
    }

    /* renamed from: m */
    public static boolean m16619m(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m16620n(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof C4450p0) || (l = (Long) ((C4450p0) tag).mo19986a("CameraControlSessionUpdateId")) == null || l.longValue() < j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo2443a(Size size, SessionConfig.C0566b bVar) {
        this.f22045l.mo23287a(size, bVar);
    }

    /* renamed from: b */
    public final C18728c mo2444b(int i, int i2, ArrayList arrayList) {
        int i3;
        boolean z;
        synchronized (this.f22037d) {
            i3 = this.f22048o;
        }
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C4289j0.m11435b("Camera2CameraControlImp");
            return new C5028j.C5029a(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C5019d.m12842a(this.f22054u).mo20734c(new C7055g(this, arrayList, i, this.f22050q, i2), this.f22036c);
    }

    /* renamed from: c */
    public final void mo23326c(C7093c cVar) {
        this.f22035b.f22060a.add(cVar);
    }

    /* renamed from: d */
    public final void mo23327d(Config config) {
        C1753c cVar = this.f22046m;
        C1755e a = C1755e.C1756a.m5005b(config).mo6514a();
        synchronized (cVar.f6149e) {
            try {
                for (Config.C0564a next : a.getConfig().listOptions()) {
                    cVar.f6150f.f21715a.mo2503w(next, a.getConfig().mo2422a(next));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C5023g.m12858f(CallbackToFutureAdapter.m1884a(new C13533e(cVar, 2))).addListener(new C7067k(0), C14226d.m35352s0());
    }

    /* renamed from: e */
    public final void mo23328e() {
        C1753c cVar = this.f22046m;
        synchronized (cVar.f6149e) {
            cVar.f6150f = new C6956a.C6957a();
        }
        C5023g.m12858f(CallbackToFutureAdapter.m1884a(new C7071l0(cVar, 2))).addListener(new C7061i(0), C14226d.m35352s0());
    }

    public final C18728c<Void> enableTorch(boolean z) {
        int i;
        boolean z2;
        C18728c cVar;
        synchronized (this.f22037d) {
            i = this.f22048o;
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return new C5028j.C5029a(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        C7115w1 w1Var = this.f22043j;
        if (!w1Var.f22112c) {
            C4289j0.m11435b("TorchControl");
            cVar = new C5028j.C5029a(new IllegalStateException("No flash unit"));
        } else {
            C7115w1.m16651b(w1Var.f22111b, Integer.valueOf(z ? 1 : 0));
            cVar = CallbackToFutureAdapter.m1884a(new C7105t1(w1Var, z));
        }
        return C5023g.m12858f(cVar);
    }

    /* renamed from: f */
    public final void mo23329f() {
        synchronized (this.f22037d) {
            int i = this.f22048o;
            if (i != 0) {
                this.f22048o = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    /* renamed from: g */
    public final void mo23330g(boolean z) {
        this.f22049p = z;
        if (!z) {
            C0578e.C0579a aVar = new C0578e.C0579a();
            aVar.f1979c = this.f22055v;
            aVar.f1981e = true;
            C0589m t = C0589m.m1674t();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            t.mo2503w(C6956a.m16424s(key), Integer.valueOf(mo23334k(1)));
            t.mo2503w(C6956a.m16424s(CaptureRequest.FLASH_MODE), 0);
            aVar.mo2481c(new C6956a(C0590n.m1678s(t)));
            mo23337p(Collections.singletonList(aVar.mo2482d()));
        }
        mo23338q();
    }

    /* renamed from: h */
    public final Config mo23331h() {
        return this.f22046m.mo6512a();
    }

    /* renamed from: i */
    public final Rect mo23332i() {
        Rect rect = (Rect) this.f22038e.mo23532a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: j */
    public final androidx.camera.core.impl.SessionConfig mo23333j() {
        /*
            r8 = this;
            androidx.camera.core.impl.SessionConfig$b r0 = r8.f22040g
            int r1 = r8.f22055v
            androidx.camera.core.impl.e$a r2 = r0.f1940b
            r2.f1979c = r1
            w.a$a r1 = new w.a$a
            r1.<init>()
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.mo23202a(r2, r4)
            x.j1 r2 = r8.f22041h
            r2.getClass()
            int r4 = r2.f21973d
            r5 = 3
            if (r4 == r5) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 3
        L_0x0024:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            x.q r7 = r2.f21970a
            int r4 = r7.mo23335l(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.mo23202a(r6, r4)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.f21975f
            int r6 = r4.length
            if (r6 == 0) goto L_0x003d
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r1.mo23202a(r6, r4)
        L_0x003d:
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.f21976g
            int r6 = r4.length
            if (r6 == 0) goto L_0x0047
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r1.mo23202a(r6, r4)
        L_0x0047:
            android.hardware.camera2.params.MeteringRectangle[] r2 = r2.f21977h
            int r4 = r2.length
            if (r4 == 0) goto L_0x0051
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r1.mo23202a(r4, r2)
        L_0x0051:
            b0.a r2 = r8.f22051r
            android.util.Range<java.lang.Integer> r2 = r2.f5270a
            if (r2 == 0) goto L_0x005c
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.mo23202a(r4, r2)
        L_0x005c:
            x.x1 r2 = r8.f22042i
            x.x1$b r2 = r2.f22127e
            r2.mo23264a(r1)
            boolean r2 = r8.f22049p
            r4 = 2
            if (r2 == 0) goto L_0x0072
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.mo23202a(r2, r4)
            goto L_0x0078
        L_0x0072:
            int r2 = r8.f22050q
            if (r2 == 0) goto L_0x007a
            if (r2 == r3) goto L_0x008b
        L_0x0078:
            r5 = 1
            goto L_0x008b
        L_0x007a:
            mf0.m r2 = r8.f22052s
            r2.getClass()
            java.lang.Class<a0.l> r2 = p001a0.C0021l.class
            e0.i0 r2 = p001a0.C0022m.m93a(r2)
            a0.l r2 = (p001a0.C0021l) r2
            if (r2 == 0) goto L_0x008a
            goto L_0x0078
        L_0x008a:
            r5 = 2
        L_0x008b:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r4 = r8.mo23334k(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.mo23202a(r2, r4)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            y.s r4 = r8.f22038e
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r4 = r4.mo23532a(r5)
            int[] r4 = (int[]) r4
            if (r4 != 0) goto L_0x00a7
            goto L_0x00b5
        L_0x00a7:
            boolean r5 = m16619m(r3, r4)
            if (r5 == 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            boolean r4 = m16619m(r3, r4)
            if (r4 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo23202a(r2, r3)
            x.e1 r2 = r8.f22044k
            r2.getClass()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            x.f1 r2 = r2.f21905a
            java.lang.Object r4 = r2.f21941a
            monitor-enter(r4)
            int r2 = r2.f21942b     // Catch:{ all -> 0x0153 }
            monitor-exit(r4)     // Catch:{ all -> 0x0153 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo23202a(r3, r2)
            c0.c r2 = r8.f22046m
            w.a r2 = r2.mo6512a()
            androidx.camera.core.impl.Config r3 = r2.getConfig()
            java.util.Set r3 = r3.listOptions()
            java.util.Iterator r3 = r3.iterator()
        L_0x00e5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0101
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.Config$a r4 = (androidx.camera.core.impl.Config.C0564a) r4
            androidx.camera.core.impl.m r5 = r1.f21715a
            androidx.camera.core.impl.Config$OptionPriority r6 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
            androidx.camera.core.impl.Config r7 = r2.getConfig()
            java.lang.Object r7 = r7.mo2422a(r4)
            r5.mo2502v(r4, r6, r7)
            goto L_0x00e5
        L_0x0101:
            w.a r2 = new w.a
            androidx.camera.core.impl.m r1 = r1.f21715a
            androidx.camera.core.impl.n r1 = androidx.camera.core.impl.C0590n.m1678s(r1)
            r2.<init>(r1)
            androidx.camera.core.impl.e$a r0 = r0.f1940b
            r0.getClass()
            androidx.camera.core.impl.m r1 = androidx.camera.core.impl.C0589m.m1675u(r2)
            r0.f1978b = r1
            c0.c r0 = r8.f22046m
            w.a r0 = r0.mo6512a()
            r1 = 0
            androidx.camera.core.impl.Config r0 = r0.f6156x
            androidx.camera.core.impl.a r2 = p291w.C6956a.f21711D
            java.lang.Object r0 = r0.mo2423b(r2, r1)
            if (r0 == 0) goto L_0x0139
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0139
            androidx.camera.core.impl.SessionConfig$b r1 = r8.f22040g
            java.lang.String r2 = "Camera2CameraControl"
            androidx.camera.core.impl.e$a r1 = r1.f1940b
            e0.f0 r1 = r1.f1982f
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f15509a
            r1.put(r2, r0)
        L_0x0139:
            androidx.camera.core.impl.SessionConfig$b r0 = r8.f22040g
            java.lang.String r1 = "CameraControlSessionUpdateId"
            long r2 = r8.f22056w
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            androidx.camera.core.impl.e$a r0 = r0.f1940b
            e0.f0 r0 = r0.f1982f
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f15509a
            r0.put(r1, r2)
            androidx.camera.core.impl.SessionConfig$b r0 = r8.f22040g
            androidx.camera.core.impl.SessionConfig r0 = r0.mo2460c()
            return r0
        L_0x0153:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0153 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7090q.mo23333j():androidx.camera.core.impl.SessionConfig");
    }

    /* renamed from: k */
    public final int mo23334k(int i) {
        int[] iArr = (int[]) this.f22038e.mo23532a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m16619m(i, iArr)) {
            return i;
        }
        if (m16619m(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo23335l(int i) {
        int[] iArr = (int[]) this.f22038e.mo23532a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m16619m(i, iArr)) {
            return i;
        }
        if (m16619m(4, iArr)) {
            return 4;
        }
        if (m16619m(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: o */
    public final void mo23336o(boolean z) {
        C5225a aVar;
        boolean z2;
        C7066j1 j1Var = this.f22041h;
        if (z != j1Var.f21972c) {
            j1Var.f21972c = z;
            if (!j1Var.f21972c) {
                C7090q qVar = j1Var.f21970a;
                qVar.f22035b.f22060a.remove(j1Var.f21974e);
                CallbackToFutureAdapter.C0673a<Void> aVar2 = j1Var.f21978i;
                if (aVar2 != null) {
                    aVar2.mo2698c(new CameraControl.OperationCanceledException("Cancelled by another cancelFocusAndMetering()"));
                    j1Var.f21978i = null;
                }
                j1Var.f21970a.f22035b.f22060a.remove((Object) null);
                j1Var.f21978i = null;
                if (j1Var.f21975f.length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    j1Var.mo23309a(true, false);
                }
                MeteringRectangle[] meteringRectangleArr = C7066j1.f21969j;
                j1Var.f21975f = meteringRectangleArr;
                j1Var.f21976g = meteringRectangleArr;
                j1Var.f21977h = meteringRectangleArr;
                long q = j1Var.f21970a.mo23338q();
                if (j1Var.f21978i != null) {
                    C7090q qVar2 = j1Var.f21970a;
                    int i = 3;
                    if (j1Var.f21973d != 3) {
                        i = 4;
                    }
                    C7057g1 g1Var = new C7057g1(j1Var, qVar2.mo23335l(i), q);
                    j1Var.f21974e = g1Var;
                    j1Var.f21970a.mo23326c(g1Var);
                }
            }
        }
        C7118x1 x1Var = this.f22042i;
        if (x1Var.f22128f != z) {
            x1Var.f22128f = z;
            if (!z) {
                synchronized (x1Var.f22125c) {
                    x1Var.f22125c.mo23374a();
                    C7123y1 y1Var = x1Var.f22125c;
                    aVar = new C5225a(y1Var.f22134a, y1Var.f22135b, y1Var.f22136c, y1Var.f22137d);
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    x1Var.f22126d.setValue(aVar);
                } else {
                    x1Var.f22126d.postValue(aVar);
                }
                x1Var.f22127e.resetZoom();
                x1Var.f22123a.mo23338q();
            }
        }
        C7115w1 w1Var = this.f22043j;
        if (w1Var.f22114e != z) {
            w1Var.f22114e = z;
            if (!z) {
                if (w1Var.f22116g) {
                    w1Var.f22116g = false;
                    w1Var.f22110a.mo23330g(false);
                    C7115w1.m16651b(w1Var.f22111b, 0);
                }
                CallbackToFutureAdapter.C0673a<Void> aVar3 = w1Var.f22115f;
                if (aVar3 != null) {
                    aVar3.mo2698c(new CameraControl.OperationCanceledException("Camera is not active."));
                    w1Var.f22115f = null;
                }
            }
        }
        C7043e1 e1Var = this.f22044k;
        if (z != e1Var.f21907c) {
            e1Var.f21907c = z;
            if (!z) {
                C7054f1 f1Var = e1Var.f21905a;
                synchronized (f1Var.f21941a) {
                    f1Var.f21942b = 0;
                }
            }
        }
        C1753c cVar = this.f22046m;
        cVar.f6148d.execute(new C1751a(0, cVar, z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0017 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23337p(java.util.List<androidx.camera.core.impl.C0578e> r19) {
        /*
            r18 = this;
            r0 = r18
            androidx.camera.core.impl.CameraControlInternal$b r1 = r0.f22039f
            androidx.camera.camera2.internal.Camera2CameraImpl$d r1 = (androidx.camera.camera2.internal.Camera2CameraImpl.C0496d) r1
            androidx.camera.camera2.internal.Camera2CameraImpl r1 = androidx.camera.camera2.internal.Camera2CameraImpl.this
            r19.getClass()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r19.iterator()
        L_0x0017:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0159
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.e r4 = (androidx.camera.core.impl.C0578e) r4
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            androidx.camera.core.impl.C0589m.m1674t()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            p066e0.C4427f0.m11609c()
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r7 = r4.f1970a
            r6.addAll(r7)
            androidx.camera.core.impl.Config r7 = r4.f1971b
            androidx.camera.core.impl.m r7 = androidx.camera.core.impl.C0589m.m1675u(r7)
            int r10 = r4.f1972c
            java.util.List<e0.e> r8 = r4.f1973d
            r11.addAll(r8)
            boolean r12 = r4.f1974e
            e0.p0 r8 = r4.f1975f
            android.util.ArrayMap r9 = new android.util.ArrayMap
            r9.<init>()
            java.util.Set r13 = r8.mo19987b()
            java.util.Iterator r13 = r13.iterator()
        L_0x0057:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x006b
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r8.mo19986a(r14)
            r9.put(r14, r15)
            goto L_0x0057
        L_0x006b:
            e0.f0 r8 = new e0.f0
            r8.<init>(r9)
            int r9 = r4.f1972c
            r13 = 5
            if (r9 != r13) goto L_0x007b
            e0.g r9 = r4.f1976g
            if (r9 == 0) goto L_0x007b
            r14 = r9
            goto L_0x007c
        L_0x007b:
            r14 = r5
        L_0x007c:
            java.util.List r5 = r4.mo2478a()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x011c
            boolean r4 = r4.f1974e
            if (r4 == 0) goto L_0x011c
            boolean r4 = r6.isEmpty()
            java.lang.String r5 = "Camera2CameraImpl"
            if (r4 != 0) goto L_0x0097
            p054d0.C4289j0.m11435b(r5)
            goto L_0x0115
        L_0x0097:
            androidx.camera.core.impl.q r4 = r1.f1685b
            r4.getClass()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.LinkedHashMap r4 = r4.f2020a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00ab:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x00d8
            java.lang.Object r16 = r4.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r17 = r16.getValue()
            r9 = r17
            androidx.camera.core.impl.q$a r9 = (androidx.camera.core.impl.C0593q.C0594a) r9
            boolean r13 = r9.f2023c
            if (r13 == 0) goto L_0x00c9
            boolean r9 = r9.f2022b
            if (r9 == 0) goto L_0x00c9
            r9 = 1
            goto L_0x00ca
        L_0x00c9:
            r9 = 0
        L_0x00ca:
            if (r9 == 0) goto L_0x00ab
            java.lang.Object r9 = r16.getValue()
            androidx.camera.core.impl.q$a r9 = (androidx.camera.core.impl.C0593q.C0594a) r9
            androidx.camera.core.impl.SessionConfig r9 = r9.f2021a
            r15.add(r9)
            goto L_0x00ab
        L_0x00d8:
            java.util.Collection r4 = java.util.Collections.unmodifiableCollection(r15)
            java.util.Iterator r4 = r4.iterator()
        L_0x00e0:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x010c
            java.lang.Object r9 = r4.next()
            androidx.camera.core.impl.SessionConfig r9 = (androidx.camera.core.impl.SessionConfig) r9
            androidx.camera.core.impl.e r9 = r9.f1937f
            java.util.List r9 = r9.mo2478a()
            boolean r13 = r9.isEmpty()
            if (r13 != 0) goto L_0x00e0
            java.util.Iterator r9 = r9.iterator()
        L_0x00fc:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x00e0
            java.lang.Object r13 = r9.next()
            androidx.camera.core.impl.DeferrableSurface r13 = (androidx.camera.core.impl.DeferrableSurface) r13
            r6.add(r13)
            goto L_0x00fc
        L_0x010c:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x0117
            p054d0.C4289j0.m11435b(r5)
        L_0x0115:
            r9 = 0
            goto L_0x0118
        L_0x0117:
            r9 = 1
        L_0x0118:
            if (r9 != 0) goto L_0x011c
            goto L_0x0017
        L_0x011c:
            androidx.camera.core.impl.e r4 = new androidx.camera.core.impl.e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            androidx.camera.core.impl.n r9 = androidx.camera.core.impl.C0590n.m1678s(r7)
            e0.p0 r6 = p066e0.C4450p0.f15508b
            android.util.ArrayMap r6 = new android.util.ArrayMap
            r6.<init>()
            java.util.Set r7 = r8.mo19987b()
            java.util.Iterator r7 = r7.iterator()
        L_0x0136:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x014a
            java.lang.Object r13 = r7.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r15 = r8.mo19986a(r13)
            r6.put(r13, r15)
            goto L_0x0136
        L_0x014a:
            e0.p0 r13 = new e0.p0
            r13.<init>(r6)
            r7 = r4
            r8 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r2.add(r4)
            goto L_0x0017
        L_0x0159:
            java.lang.String r3 = "Issue capture request"
            r1.mo2251j(r3)
            x.a1 r1 = r1.f1697n
            r1.mo2284a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7090q.mo23337p(java.util.List):void");
    }

    /* renamed from: q */
    public final long mo23338q() {
        this.f22056w = this.f22053t.getAndIncrement();
        Camera2CameraImpl.this.mo2234A();
        return this.f22056w;
    }

    public final void setFlashMode(int i) {
        int i2;
        boolean z;
        synchronized (this.f22037d) {
            i2 = this.f22048o;
        }
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C4289j0.m11435b("Camera2CameraControlImp");
            return;
        }
        this.f22050q = i;
        this.f22054u = C5023g.m12858f(CallbackToFutureAdapter.m1884a(new C7070l(this, 0)));
    }
}
