package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.C0520l;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import mf0.C24361g;
import p019b0.C1433j;
import p054d0.C4289j0;
import p066e0.C4424e;
import p066e0.C4427f0;
import p066e0.C4428g;
import p066e0.C4450p0;
import p102h0.C5018c;
import p102h0.C5019d;
import p102h0.C5023g;
import p102h0.C5028j;
import p291w.C6958b;
import p291w.C6959c;
import p304x.C7024a0;
import p304x.C7025a1;
import p304x.C7070l;
import p304x.C7079n0;
import p304x.C7126z0;
import p695od.C18728c;

public final class CaptureSession implements C7025a1 {

    /* renamed from: a */
    public final Object f1727a;

    /* renamed from: b */
    public final ArrayList f1728b;

    /* renamed from: c */
    public final C0501a f1729c;

    /* renamed from: d */
    public final C0504d f1730d;

    /* renamed from: e */
    public C0525o f1731e;

    /* renamed from: f */
    public C0520l f1732f;

    /* renamed from: g */
    public SessionConfig f1733g;

    /* renamed from: h */
    public C0590n f1734h;

    /* renamed from: i */
    public C6959c f1735i;

    /* renamed from: j */
    public final HashMap f1736j;

    /* renamed from: k */
    public List<DeferrableSurface> f1737k;

    /* renamed from: l */
    public State f1738l;

    /* renamed from: m */
    public CallbackToFutureAdapter.C0675c f1739m;

    /* renamed from: n */
    public CallbackToFutureAdapter.C0673a<Void> f1740n;

    /* renamed from: o */
    public final C1433j f1741o;

    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$a */
    public class C0501a extends CameraCaptureSession.CaptureCallback {
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$b */
    public class C0502b implements C5018c<Void> {
        public C0502b() {
        }

        public final void onFailure(Throwable th) {
            synchronized (CaptureSession.this.f1727a) {
                CaptureSession.this.f1731e.f1816a.stop();
                int i = C0503c.f1743a[CaptureSession.this.f1738l.ordinal()];
                if (i == 4 || i == 6 || i == 7) {
                    if (!(th instanceof CancellationException)) {
                        Objects.toString(CaptureSession.this.f1738l);
                        C4289j0.m11435b("CaptureSession");
                        CaptureSession.this.mo2291h();
                    }
                }
            }
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$c */
    public static /* synthetic */ class C0503c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1743a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = androidx.camera.camera2.internal.CaptureSession.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1743a = r0
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1743a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1743a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1743a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1743a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1743a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1743a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1743a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.C0503c.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$d */
    public final class C0504d extends C0520l.C0521a {
        public C0504d() {
        }

        /* renamed from: h */
        public final void mo2298h(C0520l lVar) {
            synchronized (CaptureSession.this.f1727a) {
                switch (C0503c.f1743a[CaptureSession.this.f1738l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.f1738l);
                    case 4:
                    case 6:
                    case 7:
                        CaptureSession.this.mo2291h();
                        break;
                    case 8:
                        C4289j0.m11435b("CaptureSession");
                        break;
                }
                Objects.toString(CaptureSession.this.f1738l);
                C4289j0.m11435b("CaptureSession");
            }
        }

        /* renamed from: i */
        public final void mo2299i(C0522m mVar) {
            synchronized (CaptureSession.this.f1727a) {
                switch (C0503c.f1743a[CaptureSession.this.f1738l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.f1738l);
                    case 4:
                        CaptureSession captureSession = CaptureSession.this;
                        captureSession.f1738l = State.OPENED;
                        captureSession.f1732f = mVar;
                        if (captureSession.f1733g != null) {
                            C6959c cVar = captureSession.f1735i;
                            cVar.getClass();
                            List<C6958b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f15497a));
                            ArrayList arrayList = new ArrayList();
                            for (C6958b add : unmodifiableList) {
                                arrayList.add(add);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C6958b) it.next()).getClass();
                            }
                            if (!arrayList2.isEmpty()) {
                                CaptureSession captureSession2 = CaptureSession.this;
                                captureSession2.mo2292i(captureSession2.mo2295m(arrayList2));
                            }
                        }
                        C4289j0.m11435b("CaptureSession");
                        CaptureSession captureSession3 = CaptureSession.this;
                        captureSession3.mo2294k(captureSession3.f1733g);
                        CaptureSession.this.mo2293j();
                        break;
                    case 6:
                        CaptureSession.this.f1732f = mVar;
                        break;
                    case 7:
                        mVar.close();
                        break;
                }
                Objects.toString(CaptureSession.this.f1738l);
                C4289j0.m11435b("CaptureSession");
            }
        }

        /* renamed from: j */
        public final void mo2300j(C0522m mVar) {
            synchronized (CaptureSession.this.f1727a) {
                if (C0503c.f1743a[CaptureSession.this.f1738l.ordinal()] != 1) {
                    Objects.toString(CaptureSession.this.f1738l);
                    C4289j0.m11435b("CaptureSession");
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.f1738l);
                }
            }
        }

        /* renamed from: k */
        public final void mo2301k(C0520l lVar) {
            synchronized (CaptureSession.this.f1727a) {
                if (CaptureSession.this.f1738l != State.UNINITIALIZED) {
                    C4289j0.m11435b("CaptureSession");
                    CaptureSession.this.mo2291h();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.f1738l);
                }
            }
        }
    }

    public CaptureSession() {
        this.f1727a = new Object();
        this.f1728b = new ArrayList();
        this.f1729c = new C0501a();
        this.f1734h = C0590n.f2014z;
        this.f1735i = new C6959c(new C6958b[0]);
        this.f1736j = new HashMap();
        this.f1737k = Collections.emptyList();
        this.f1738l = State.UNINITIALIZED;
        this.f1741o = new C1433j();
        this.f1738l = State.INITIALIZED;
        this.f1730d = new C0504d();
    }

    /* renamed from: g */
    public static C7024a0 m1403g(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4424e eVar = (C4424e) it.next();
            if (eVar == null) {
                obj = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                C7126z0.m16660a(eVar, arrayList2);
                if (arrayList2.size() == 1) {
                    obj = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    obj = new C7024a0(arrayList2);
                }
            }
            arrayList.add(obj);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C7024a0(arrayList);
    }

    /* renamed from: l */
    public static C0589m m1404l(ArrayList arrayList) {
        C0589m t = C0589m.m1674t();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Config config = ((C0578e) it.next()).f1971b;
            for (Config.C0564a next : config.listOptions()) {
                Object obj = null;
                Object b = config.mo2423b(next, null);
                if (t.mo2425e(next)) {
                    try {
                        obj = t.mo2422a(next);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (!Objects.equals(obj, b)) {
                        next.mo2447b();
                        Objects.toString(b);
                        Objects.toString(obj);
                        C4289j0.m11435b("CaptureSession");
                    }
                } else {
                    t.mo2503w(next, b);
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public final void mo2284a(List<C0578e> list) {
        synchronized (this.f1727a) {
            switch (C0503c.f1743a[this.f1738l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f1738l);
                case 2:
                case 3:
                case 4:
                    this.f1728b.addAll(list);
                    break;
                case 5:
                    this.f1728b.addAll(list);
                    mo2293j();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    /* renamed from: b */
    public final void mo2285b() {
        ArrayList<C0578e> arrayList;
        synchronized (this.f1727a) {
            if (!this.f1728b.isEmpty()) {
                arrayList = new ArrayList<>(this.f1728b);
                this.f1728b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (C0578e eVar : arrayList) {
                for (C4424e a : eVar.f1973d) {
                    a.mo19945a();
                }
            }
        }
    }

    /* renamed from: c */
    public final List<C0578e> mo2286c() {
        List<C0578e> unmodifiableList;
        synchronized (this.f1727a) {
            unmodifiableList = Collections.unmodifiableList(this.f1728b);
        }
        return unmodifiableList;
    }

    public final void close() {
        synchronized (this.f1727a) {
            int i = C0503c.f1743a[this.f1738l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.f1733g != null) {
                                    C6959c cVar = this.f1735i;
                                    cVar.getClass();
                                    List<C6958b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f15497a));
                                    ArrayList arrayList = new ArrayList();
                                    for (C6958b add : unmodifiableList) {
                                        arrayList.add(add);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        ((C6958b) it.next()).getClass();
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        try {
                                            mo2284a(mo2295m(arrayList2));
                                        } catch (IllegalStateException unused) {
                                            C4289j0.m11435b("CaptureSession");
                                        }
                                    }
                                }
                            }
                        }
                        C0525o oVar = this.f1731e;
                        C24361g.m61185s(oVar, "The Opener shouldn't null in state:" + this.f1738l);
                        this.f1731e.f1816a.stop();
                        this.f1738l = State.CLOSED;
                        this.f1733g = null;
                    } else {
                        C0525o oVar2 = this.f1731e;
                        C24361g.m61185s(oVar2, "The Opener shouldn't null in state:" + this.f1738l);
                        this.f1731e.f1816a.stop();
                    }
                }
                this.f1738l = State.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f1738l);
            }
        }
    }

    /* renamed from: d */
    public final SessionConfig mo2288d() {
        SessionConfig sessionConfig;
        synchronized (this.f1727a) {
            sessionConfig = this.f1733g;
        }
        return sessionConfig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2289e(androidx.camera.core.impl.SessionConfig r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1727a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.C0503c.f1743a     // Catch:{ all -> 0x005f }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f1738l     // Catch:{ all -> 0x005f }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x005f }
            r1 = r1[r2]     // Catch:{ all -> 0x005f }
            switch(r1) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0041;
                case 3: goto L_0x0041;
                case 4: goto L_0x0041;
                case 5: goto L_0x0019;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x005f }
        L_0x0010:
            goto L_0x005d
        L_0x0011:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x005f }
            throw r4     // Catch:{ all -> 0x005f }
        L_0x0019:
            r3.f1733g = r4     // Catch:{ all -> 0x005f }
            if (r4 != 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return
        L_0x001f:
            java.util.HashMap r1 = r3.f1736j     // Catch:{ all -> 0x005f }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x005f }
            java.util.List r4 = r4.mo2457b()     // Catch:{ all -> 0x005f }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x005f }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = "CaptureSession"
            p054d0.C4289j0.m11435b(r4)     // Catch:{ all -> 0x005f }
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return
        L_0x0036:
            java.lang.String r4 = "CaptureSession"
            p054d0.C4289j0.m11435b(r4)     // Catch:{ all -> 0x005f }
            androidx.camera.core.impl.SessionConfig r4 = r3.f1733g     // Catch:{ all -> 0x005f }
            r3.mo2294k(r4)     // Catch:{ all -> 0x005f }
            goto L_0x005d
        L_0x0041:
            r3.f1733g = r4     // Catch:{ all -> 0x005f }
            goto L_0x005d
        L_0x0044:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x005f }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f1738l     // Catch:{ all -> 0x005f }
            r1.append(r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005f }
            r4.<init>(r1)     // Catch:{ all -> 0x005f }
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return
        L_0x005f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.mo2289e(androidx.camera.core.impl.SessionConfig):void");
    }

    /* renamed from: f */
    public final C18728c<Void> mo2290f(SessionConfig sessionConfig, CameraDevice cameraDevice, C0525o oVar) {
        synchronized (this.f1727a) {
            if (C0503c.f1743a[this.f1738l.ordinal()] != 2) {
                Objects.toString(this.f1738l);
                C4289j0.m11435b("CaptureSession");
                C5028j.C5029a aVar = new C5028j.C5029a(new IllegalStateException("open() should not allow the state: " + this.f1738l));
                return aVar;
            }
            this.f1738l = State.GET_SURFACE;
            ArrayList arrayList = new ArrayList(sessionConfig.mo2457b());
            this.f1737k = arrayList;
            this.f1731e = oVar;
            C5019d c = C5019d.m12842a(oVar.f1816a.mo2340a(arrayList)).mo20734c(new C0515h(this, sessionConfig, cameraDevice), ((C0522m) this.f1731e.f1816a).f1803d);
            C5023g.m12853a(c, new C0502b(), ((C0522m) this.f1731e.f1816a).f1803d);
            C18728c<Void> f = C5023g.m12858f(c);
            return f;
        }
    }

    /* renamed from: h */
    public final void mo2291h() {
        State state = this.f1738l;
        State state2 = State.RELEASED;
        if (state == state2) {
            C4289j0.m11435b("CaptureSession");
            return;
        }
        this.f1738l = state2;
        this.f1732f = null;
        CallbackToFutureAdapter.C0673a<Void> aVar = this.f1740n;
        if (aVar != null) {
            aVar.mo2697b(null);
            this.f1740n = null;
        }
    }

    /* renamed from: i */
    public final void mo2292i(ArrayList arrayList) {
        boolean z;
        C4428g gVar;
        synchronized (this.f1727a) {
            if (!arrayList.isEmpty()) {
                try {
                    C0513g gVar2 = new C0513g();
                    ArrayList arrayList2 = new ArrayList();
                    C4289j0.m11435b("CaptureSession");
                    Iterator it = arrayList.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        C0578e eVar = (C0578e) it.next();
                        if (eVar.mo2478a().isEmpty()) {
                            C4289j0.m11435b("CaptureSession");
                        } else {
                            Iterator<DeferrableSurface> it2 = eVar.mo2478a().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z = true;
                                    break;
                                }
                                DeferrableSurface next = it2.next();
                                if (!this.f1736j.containsKey(next)) {
                                    Objects.toString(next);
                                    C4289j0.m11435b("CaptureSession");
                                    z = false;
                                    break;
                                }
                            }
                            if (z) {
                                if (eVar.f1972c == 2) {
                                    z2 = true;
                                }
                                C0578e.C0579a aVar = new C0578e.C0579a(eVar);
                                if (eVar.f1972c == 5 && (gVar = eVar.f1976g) != null) {
                                    aVar.f1983g = gVar;
                                }
                                SessionConfig sessionConfig = this.f1733g;
                                if (sessionConfig != null) {
                                    aVar.mo2481c(sessionConfig.f1937f.f1971b);
                                }
                                aVar.mo2481c(this.f1734h);
                                aVar.mo2481c(eVar.f1971b);
                                CaptureRequest b = C7079n0.m16606b(aVar.mo2482d(), this.f1732f.getDevice(), this.f1736j);
                                if (b == null) {
                                    C4289j0.m11435b("CaptureSession");
                                    return;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (C4424e a : eVar.f1973d) {
                                    C7126z0.m16660a(a, arrayList3);
                                }
                                gVar2.mo2310a(b, arrayList3);
                                arrayList2.add(b);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        if (this.f1741o.mo5768a(arrayList2, z2)) {
                            this.f1732f.stopRepeating();
                            gVar2.f1783b = new C7070l(this, 1);
                        }
                        this.f1732f.mo2327c(arrayList2, gVar2);
                        return;
                    }
                    C4289j0.m11435b("CaptureSession");
                } catch (CameraAccessException e) {
                    e.getMessage();
                    C4289j0.m11435b("CaptureSession");
                    Thread.dumpStack();
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo2293j() {
        if (!this.f1728b.isEmpty()) {
            try {
                mo2292i(this.f1728b);
            } finally {
                this.f1728b.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.getMessage();
        p054d0.C4289j0.m11435b("CaptureSession");
        java.lang.Thread.dumpStack();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c5, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0007, B:11:0x001d] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2294k(androidx.camera.core.impl.SessionConfig r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1727a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000c
            java.lang.String r6 = "CaptureSession"
            p054d0.C4289j0.m11435b(r6)     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x000c:
            androidx.camera.core.impl.e r6 = r6.f1937f     // Catch:{ all -> 0x0064 }
            java.util.List r1 = r6.mo2478a()     // Catch:{ all -> 0x0064 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x0031
            java.lang.String r6 = "CaptureSession"
            p054d0.C4289j0.m11435b(r6)     // Catch:{ all -> 0x0064 }
            androidx.camera.camera2.internal.l r6 = r5.f1732f     // Catch:{ CameraAccessException -> 0x0023 }
            r6.stopRepeating()     // Catch:{ CameraAccessException -> 0x0023 }
            goto L_0x002f
        L_0x0023:
            r6 = move-exception
            java.lang.String r1 = "CaptureSession"
            r6.getMessage()     // Catch:{ all -> 0x0064 }
            p054d0.C4289j0.m11435b(r1)     // Catch:{ all -> 0x0064 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0064 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0031:
            java.lang.String r1 = "CaptureSession"
            p054d0.C4289j0.m11435b(r1)     // Catch:{ CameraAccessException -> 0x00b6 }
            androidx.camera.core.impl.e$a r1 = new androidx.camera.core.impl.e$a     // Catch:{ CameraAccessException -> 0x00b6 }
            r1.<init>(r6)     // Catch:{ CameraAccessException -> 0x00b6 }
            w.c r2 = r5.f1735i     // Catch:{ CameraAccessException -> 0x00b6 }
            r2.getClass()     // Catch:{ CameraAccessException -> 0x00b6 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x00b6 }
            java.util.HashSet r2 = r2.f15497a     // Catch:{ CameraAccessException -> 0x00b6 }
            r3.<init>(r2)     // Catch:{ CameraAccessException -> 0x00b6 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)     // Catch:{ CameraAccessException -> 0x00b6 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x00b6 }
            r3.<init>()     // Catch:{ CameraAccessException -> 0x00b6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ CameraAccessException -> 0x00b6 }
        L_0x0054:
            boolean r4 = r2.hasNext()     // Catch:{ CameraAccessException -> 0x00b6 }
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r2.next()     // Catch:{ CameraAccessException -> 0x00b6 }
            w.b r4 = (p291w.C6958b) r4     // Catch:{ CameraAccessException -> 0x00b6 }
            r3.add(r4)     // Catch:{ CameraAccessException -> 0x00b6 }
            goto L_0x0054
        L_0x0064:
            r6 = move-exception
            goto L_0x00c4
        L_0x0066:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x00b6 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x00b6 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ CameraAccessException -> 0x00b6 }
        L_0x006f:
            boolean r4 = r3.hasNext()     // Catch:{ CameraAccessException -> 0x00b6 }
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r3.next()     // Catch:{ CameraAccessException -> 0x00b6 }
            w.b r4 = (p291w.C6958b) r4     // Catch:{ CameraAccessException -> 0x00b6 }
            r4.getClass()     // Catch:{ CameraAccessException -> 0x00b6 }
            goto L_0x006f
        L_0x007f:
            androidx.camera.core.impl.m r2 = m1404l(r2)     // Catch:{ CameraAccessException -> 0x00b6 }
            r5.f1734h = r2     // Catch:{ CameraAccessException -> 0x00b6 }
            r1.mo2481c(r2)     // Catch:{ CameraAccessException -> 0x00b6 }
            androidx.camera.core.impl.e r1 = r1.mo2482d()     // Catch:{ CameraAccessException -> 0x00b6 }
            androidx.camera.camera2.internal.l r2 = r5.f1732f     // Catch:{ CameraAccessException -> 0x00b6 }
            android.hardware.camera2.CameraDevice r2 = r2.getDevice()     // Catch:{ CameraAccessException -> 0x00b6 }
            java.util.HashMap r3 = r5.f1736j     // Catch:{ CameraAccessException -> 0x00b6 }
            android.hardware.camera2.CaptureRequest r1 = p304x.C7079n0.m16606b(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x00b6 }
            if (r1 != 0) goto L_0x00a1
            java.lang.String r6 = "CaptureSession"
            p054d0.C4289j0.m11435b(r6)     // Catch:{ CameraAccessException -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x00a1:
            java.util.List<e0.e> r6 = r6.f1973d     // Catch:{ CameraAccessException -> 0x00b6 }
            r2 = 1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback[] r2 = new android.hardware.camera2.CameraCaptureSession.CaptureCallback[r2]     // Catch:{ CameraAccessException -> 0x00b6 }
            r3 = 0
            androidx.camera.camera2.internal.CaptureSession$a r4 = r5.f1729c     // Catch:{ CameraAccessException -> 0x00b6 }
            r2[r3] = r4     // Catch:{ CameraAccessException -> 0x00b6 }
            x.a0 r6 = m1403g(r6, r2)     // Catch:{ CameraAccessException -> 0x00b6 }
            androidx.camera.camera2.internal.l r2 = r5.f1732f     // Catch:{ CameraAccessException -> 0x00b6 }
            r2.setSingleRepeatingRequest(r1, r6)     // Catch:{ CameraAccessException -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x00b6:
            r6 = move-exception
            java.lang.String r1 = "CaptureSession"
            r6.getMessage()     // Catch:{ all -> 0x0064 }
            p054d0.C4289j0.m11435b(r1)     // Catch:{ all -> 0x0064 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x00c4:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.mo2294k(androidx.camera.core.impl.SessionConfig):void");
    }

    /* renamed from: m */
    public final ArrayList mo2295m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0578e eVar = (C0578e) it.next();
            HashSet hashSet = new HashSet();
            C0589m.m1674t();
            ArrayList arrayList3 = new ArrayList();
            C4427f0.m11609c();
            hashSet.addAll(eVar.f1970a);
            C0589m u = C0589m.m1675u(eVar.f1971b);
            arrayList3.addAll(eVar.f1973d);
            boolean z = eVar.f1974e;
            C4450p0 p0Var = eVar.f1975f;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : p0Var.mo19987b()) {
                arrayMap.put(next, p0Var.mo19986a(next));
            }
            C4427f0 f0Var = new C4427f0(arrayMap);
            for (DeferrableSurface add : this.f1733g.f1937f.mo2478a()) {
                hashSet.add(add);
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            C0590n s = C0590n.m1678s(u);
            C4450p0 p0Var2 = C4450p0.f15508b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String next2 : f0Var.mo19987b()) {
                arrayMap2.put(next2, f0Var.mo19986a(next2));
            }
            arrayList2.add(new C0578e(arrayList4, s, 1, arrayList3, z, new C4450p0(arrayMap2), (C4428g) null));
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r4.f1731e.f1816a.stop() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        mo2291h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r4.f1739m != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r4.f1739m = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(new h60.C17327j1(r4, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r1 = r4.f1739m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r4.f1738l = androidx.camera.camera2.internal.CaptureSession.State.RELEASED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        return p102h0.C5023g.m12857e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.f1738l = androidx.camera.camera2.internal.CaptureSession.State.RELEASING;
        r1 = r4.f1731e;
        mf0.C24361g.m61185s(r1, "The Opener shouldn't null in state:" + r4.f1738l);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p695od.C18728c release() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f1727a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.C0503c.f1743a     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r4.f1738l     // Catch:{ all -> 0x0054 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0054 }
            r1 = r1[r2]     // Catch:{ all -> 0x0054 }
            switch(r1) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0079;
                case 3: goto L_0x005a;
                case 4: goto L_0x0019;
                case 5: goto L_0x0012;
                case 6: goto L_0x0012;
                case 7: goto L_0x0043;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x0054 }
        L_0x0010:
            goto L_0x0097
        L_0x0012:
            androidx.camera.camera2.internal.l r1 = r4.f1732f     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0019
            r1.close()     // Catch:{ all -> 0x0054 }
        L_0x0019:
            androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ all -> 0x0054 }
            r4.f1738l = r1     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.o r1 = r4.f1731e     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r2.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.f1738l     // Catch:{ all -> 0x0054 }
            r2.append(r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0054 }
            mf0.C24361g.m61185s(r1, r2)     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.o r1 = r4.f1731e     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.o$b r1 = r1.f1816a     // Catch:{ all -> 0x0054 }
            boolean r1 = r1.stop()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0043
            r4.mo2291h()     // Catch:{ all -> 0x0054 }
            goto L_0x0097
        L_0x0043:
            androidx.concurrent.futures.CallbackToFutureAdapter$c r1 = r4.f1739m     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x0056
            h60.j1 r1 = new h60.j1     // Catch:{ all -> 0x0054 }
            r2 = 0
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0054 }
            androidx.concurrent.futures.CallbackToFutureAdapter$c r1 = androidx.concurrent.futures.CallbackToFutureAdapter.m1884a(r1)     // Catch:{ all -> 0x0054 }
            r4.f1739m = r1     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            r1 = move-exception
            goto L_0x009e
        L_0x0056:
            androidx.concurrent.futures.CallbackToFutureAdapter$c r1 = r4.f1739m     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return r1
        L_0x005a:
            androidx.camera.camera2.internal.o r1 = r4.f1731e     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r2.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.f1738l     // Catch:{ all -> 0x0054 }
            r2.append(r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0054 }
            mf0.C24361g.m61185s(r1, r2)     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.o r1 = r4.f1731e     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.o$b r1 = r1.f1816a     // Catch:{ all -> 0x0054 }
            r1.stop()     // Catch:{ all -> 0x0054 }
        L_0x0079:
            androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ all -> 0x0054 }
            r4.f1738l = r1     // Catch:{ all -> 0x0054 }
            goto L_0x0097
        L_0x007e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r2.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "release() should not be possible in state: "
            r2.append(r3)     // Catch:{ all -> 0x0054 }
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.f1738l     // Catch:{ all -> 0x0054 }
            r2.append(r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0054 }
            r1.<init>(r2)     // Catch:{ all -> 0x0054 }
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0097:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            r0 = 0
            h0.j$c r0 = p102h0.C5023g.m12857e(r0)
            return r0
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.release():od.c");
    }
}
