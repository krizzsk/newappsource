package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0583g;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import mf0.C24361g;
import p032c0.C1755e;
import p054d0.C4289j0;
import p066e0.C4424e;
import p066e0.C4439k0;
import p102h0.C5019d;
import p102h0.C5023g;
import p291w.C6956a;
import p304x.C7025a1;
import p304x.C7124z;
import p695od.C18728c;

public final class ProcessingCaptureSession implements C7025a1 {

    /* renamed from: o */
    public static ArrayList f1745o = new ArrayList();

    /* renamed from: p */
    public static int f1746p = 0;

    /* renamed from: a */
    public final C4439k0 f1747a;

    /* renamed from: b */
    public final Executor f1748b;

    /* renamed from: c */
    public final ScheduledExecutorService f1749c;

    /* renamed from: d */
    public final CaptureSession f1750d = new CaptureSession();

    /* renamed from: e */
    public List<DeferrableSurface> f1751e = new ArrayList();

    /* renamed from: f */
    public SessionConfig f1752f;

    /* renamed from: g */
    public C0512f f1753g;

    /* renamed from: h */
    public SessionConfig f1754h;

    /* renamed from: i */
    public boolean f1755i = false;

    /* renamed from: j */
    public ProcessorState f1756j;

    /* renamed from: k */
    public volatile C0578e f1757k = null;

    /* renamed from: l */
    public volatile boolean f1758l = false;

    /* renamed from: m */
    public C1755e f1759m = new C1755e(C0590n.m1678s(C0589m.m1674t()));

    /* renamed from: n */
    public C1755e f1760n = new C1755e(C0590n.m1678s(C0589m.m1674t()));

    public enum ProcessorState {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$a */
    public static /* synthetic */ class C0505a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1761a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1761a = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_ENDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.CLOSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.ProcessingCaptureSession.C0505a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$b */
    public static class C0506b {

        /* renamed from: a */
        public List<C4424e> f1762a = Collections.emptyList();

        /* renamed from: b */
        public final Executor f1763b;

        public C0506b(Executor executor) {
            this.f1763b = executor;
        }
    }

    public ProcessingCaptureSession(C4439k0 k0Var, C7124z zVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f1747a = k0Var;
        this.f1748b = executor;
        this.f1749c = scheduledExecutorService;
        this.f1756j = ProcessorState.UNINITIALIZED;
        new C0506b(executor);
        f1746p++;
        C4289j0.m11435b("ProcessingCaptureSession");
    }

    /* renamed from: g */
    public static void m1420g(List<C0578e> list) {
        for (C0578e eVar : list) {
            for (C4424e a : eVar.f1973d) {
                a.mo19945a();
            }
        }
    }

    /* renamed from: a */
    public final void mo2284a(List<C0578e> list) {
        boolean z;
        if (!list.isEmpty()) {
            if (list.size() <= 1) {
                if (!list.isEmpty()) {
                    Iterator<C0578e> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f1972c != 2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f1757k != null || this.f1758l) {
                        m1420g(list);
                        return;
                    }
                    C0578e eVar = list.get(0);
                    Objects.toString(this.f1756j);
                    C4289j0.m11435b("ProcessingCaptureSession");
                    int i = C0505a.f1761a[this.f1756j.ordinal()];
                    if (i == 1 || i == 2) {
                        this.f1757k = eVar;
                        return;
                    } else if (i == 3) {
                        this.f1758l = true;
                        C1755e.C1756a b = C1755e.C1756a.m5005b(eVar.f1971b);
                        Config config = eVar.f1971b;
                        C0572a aVar = C0578e.f1968h;
                        if (config.mo2425e(aVar)) {
                            C0572a s = C6956a.m16424s(CaptureRequest.JPEG_ORIENTATION);
                            b.f6157a.mo2503w(s, (Integer) eVar.f1971b.mo2422a(aVar));
                        }
                        Config config2 = eVar.f1971b;
                        C0572a aVar2 = C0578e.f1969i;
                        if (config2.mo2425e(aVar2)) {
                            CaptureRequest.Key key = CaptureRequest.JPEG_QUALITY;
                            Byte valueOf = Byte.valueOf(((Integer) eVar.f1971b.mo2422a(aVar2)).byteValue());
                            b.f6157a.mo2503w(C6956a.m16424s(key), valueOf);
                        }
                        C1755e a = b.mo6514a();
                        this.f1760n = a;
                        mo2302h(this.f1759m, a);
                        this.f1747a.mo19965a();
                        return;
                    } else if (i == 4 || i == 5) {
                        Objects.toString(this.f1756j);
                        C4289j0.m11435b("ProcessingCaptureSession");
                        m1420g(list);
                        return;
                    } else {
                        return;
                    }
                }
            }
            m1420g(list);
        }
    }

    /* renamed from: b */
    public final void mo2285b() {
        C4289j0.m11435b("ProcessingCaptureSession");
        if (this.f1757k != null) {
            for (C4424e a : this.f1757k.f1973d) {
                a.mo19945a();
            }
            this.f1757k = null;
        }
    }

    /* renamed from: c */
    public final List<C0578e> mo2286c() {
        if (this.f1757k == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(new C0578e[]{this.f1757k});
    }

    public final void close() {
        Objects.toString(this.f1756j);
        C4289j0.m11435b("ProcessingCaptureSession");
        int i = C0505a.f1761a[this.f1756j.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.f1747a.mo19966b();
                C0512f fVar = this.f1753g;
                if (fVar != null) {
                    fVar.getClass();
                }
                this.f1756j = ProcessorState.ON_CAPTURE_SESSION_ENDED;
            } else if (i != 4) {
                if (i == 5) {
                    return;
                }
                this.f1756j = ProcessorState.CLOSED;
                this.f1750d.close();
            }
        }
        this.f1747a.mo19967c();
        this.f1756j = ProcessorState.CLOSED;
        this.f1750d.close();
    }

    /* renamed from: d */
    public final SessionConfig mo2288d() {
        return this.f1752f;
    }

    /* renamed from: e */
    public final void mo2289e(SessionConfig sessionConfig) {
        C4289j0.m11435b("ProcessingCaptureSession");
        this.f1752f = sessionConfig;
        if (sessionConfig != null && this.f1756j == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            C1755e a = C1755e.C1756a.m5005b(sessionConfig.f1937f.f1971b).mo6514a();
            this.f1759m = a;
            mo2302h(a, this.f1760n);
            if (!this.f1755i) {
                this.f1747a.mo19971g();
                this.f1755i = true;
            }
        }
    }

    /* renamed from: f */
    public final C18728c<Void> mo2290f(SessionConfig sessionConfig, CameraDevice cameraDevice, C0525o oVar) {
        boolean z;
        if (this.f1756j == ProcessorState.UNINITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder k = C13555b.m33972k("Invalid state state:");
        k.append(this.f1756j);
        C24361g.m61177o(z, k.toString());
        C24361g.m61177o(!sessionConfig.mo2457b().isEmpty(), "SessionConfig contains no surfaces");
        C4289j0.m11435b("ProcessingCaptureSession");
        List<DeferrableSurface> b = sessionConfig.mo2457b();
        this.f1751e = b;
        return C5023g.m12860h(C5019d.m12842a(C0583g.m1629b(b, this.f1748b, this.f1749c)).mo20734c(new C0518j(this, sessionConfig, cameraDevice, oVar), this.f1748b), new C0519k(this, 0), this.f1748b);
    }

    /* renamed from: h */
    public final void mo2302h(C1755e eVar, C1755e eVar2) {
        C0589m t = C0589m.m1674t();
        for (Config.C0564a aVar : eVar.listOptions()) {
            t.mo2503w(aVar, eVar.mo2422a(aVar));
        }
        for (Config.C0564a aVar2 : eVar2.listOptions()) {
            t.mo2503w(aVar2, eVar2.mo2422a(aVar2));
        }
        C4439k0 k0Var = this.f1747a;
        C0590n.m1678s(t);
        k0Var.mo19970f();
    }

    public final C18728c release() {
        boolean z;
        if (this.f1756j == ProcessorState.CLOSED) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("release() can only be called in CLOSED state", z);
        C4289j0.m11435b("ProcessingCaptureSession");
        return this.f1750d.release();
    }
}
