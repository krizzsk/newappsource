package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.C0416i1;
import androidx.camera.camera2.internal.C0525o;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.C0546b;
import androidx.camera.core.C0547c;
import androidx.camera.core.C0631r;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0574c;
import androidx.camera.core.impl.C0575d;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0593q;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24361g;
import p001a0.C0022m;
import p054d0.C4268a1;
import p054d0.C4279f;
import p054d0.C4288j;
import p054d0.C4289j0;
import p066e0.C4415a0;
import p066e0.C4421d0;
import p066e0.C4427f0;
import p066e0.C4428g;
import p066e0.C4434j;
import p066e0.C4439k0;
import p066e0.C4450p0;
import p089g0.C4721b;
import p102h0.C5018c;
import p102h0.C5023g;
import p304x.C7025a1;
import p304x.C7039d1;
import p304x.C7041e;
import p304x.C7075m1;
import p304x.C7078n;
import p304x.C7090q;
import p304x.C7103t;
import p304x.C7104t0;
import p304x.C7106u;
import p304x.C7107u0;
import p304x.C7109v;
import p304x.C7112w;
import p304x.C7113w0;
import p304x.C7116x;
import p304x.C7124z;
import p316y.C7197a0;
import p358af.C13437d;
import p583jk.C17875h;
import p695od.C18728c;

public final class Camera2CameraImpl implements CameraInternal {

    /* renamed from: b */
    public final C0593q f1685b;

    /* renamed from: c */
    public final C7197a0 f1686c;

    /* renamed from: d */
    public final SequentialExecutor f1687d;

    /* renamed from: e */
    public final C4721b f1688e;

    /* renamed from: f */
    public volatile InternalState f1689f = InternalState.INITIALIZED;

    /* renamed from: g */
    public final C4421d0<CameraInternal.State> f1690g;

    /* renamed from: h */
    public final C7113w0 f1691h;

    /* renamed from: i */
    public final C7090q f1692i;

    /* renamed from: j */
    public final C0497e f1693j;

    /* renamed from: k */
    public final C7124z f1694k;

    /* renamed from: l */
    public CameraDevice f1695l;

    /* renamed from: m */
    public int f1696m;

    /* renamed from: n */
    public C7025a1 f1697n;

    /* renamed from: o */
    public final LinkedHashMap f1698o;

    /* renamed from: p */
    public final C0495c f1699p;

    /* renamed from: q */
    public final C0575d f1700q;

    /* renamed from: r */
    public final HashSet f1701r;

    /* renamed from: s */
    public C7075m1 f1702s;

    /* renamed from: t */
    public final C0516i f1703t;

    /* renamed from: u */
    public final C0525o.C0526a f1704u;

    /* renamed from: v */
    public final HashSet f1705v;

    /* renamed from: w */
    public final Object f1706w;

    /* renamed from: x */
    public C4439k0 f1707x;

    /* renamed from: y */
    public boolean f1708y;

    /* renamed from: z */
    public final C7039d1 f1709z;

    public enum InternalState {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$a */
    public class C0493a implements C5018c<Void> {
        public C0493a() {
        }

        public final void onFailure(Throwable th) {
            SessionConfig sessionConfig;
            if (th instanceof DeferrableSurface.SurfaceClosedException) {
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                DeferrableSurface deferrableSurface = ((DeferrableSurface.SurfaceClosedException) th).mDeferrableSurface;
                Iterator<SessionConfig> it = camera2CameraImpl.f1685b.mo2505b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        sessionConfig = null;
                        break;
                    }
                    sessionConfig = it.next();
                    if (sessionConfig.mo2457b().contains(deferrableSurface)) {
                        break;
                    }
                }
                if (sessionConfig != null) {
                    Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                    camera2CameraImpl2.getClass();
                    C4721b z0 = C14226d.m35358z0();
                    List<SessionConfig.C0567c> list = sessionConfig.f1936e;
                    if (!list.isEmpty()) {
                        new Throwable();
                        camera2CameraImpl2.mo2251j("Posting surface closed");
                        z0.execute(new C7109v(0, list.get(0), sessionConfig));
                    }
                }
            } else if (th instanceof CancellationException) {
                Camera2CameraImpl.this.mo2251j("Unable to configure camera cancelled");
            } else {
                InternalState internalState = Camera2CameraImpl.this.f1689f;
                InternalState internalState2 = InternalState.OPENED;
                if (internalState == internalState2) {
                    Camera2CameraImpl.this.mo2262v(internalState2, new C0547c(4, th), true);
                }
                if (th instanceof CameraAccessException) {
                    Camera2CameraImpl camera2CameraImpl3 = Camera2CameraImpl.this;
                    StringBuilder k = C13555b.m33972k("Unable to configure camera due to ");
                    k.append(th.getMessage());
                    camera2CameraImpl3.mo2251j(k.toString());
                } else if (th instanceof TimeoutException) {
                    String str = Camera2CameraImpl.this.f1694k.f22138a;
                    C4289j0.m11435b("Camera2CameraImpl");
                }
            }
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$b */
    public static /* synthetic */ class C0494b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1711a;

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
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1711a = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1711a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1711a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1711a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1711a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1711a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1711a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1711a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraImpl.C0494b.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$c */
    public final class C0495c extends CameraManager.AvailabilityCallback implements C0575d.C0577b {

        /* renamed from: a */
        public final String f1712a;

        /* renamed from: b */
        public boolean f1713b = true;

        public C0495c(String str) {
            this.f1712a = str;
        }

        /* renamed from: a */
        public final void mo2268a() {
            if (Camera2CameraImpl.this.f1689f == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.mo2265z(false);
            }
        }

        public final void onCameraAvailable(String str) {
            if (this.f1712a.equals(str)) {
                this.f1713b = true;
                if (Camera2CameraImpl.this.f1689f == InternalState.PENDING_OPEN) {
                    Camera2CameraImpl.this.mo2265z(false);
                }
            }
        }

        public final void onCameraUnavailable(String str) {
            if (this.f1712a.equals(str)) {
                this.f1713b = false;
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$d */
    public final class C0496d implements CameraControlInternal.C0563b {
        public C0496d() {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$e */
    public final class C0497e extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final Executor f1716a;

        /* renamed from: b */
        public final ScheduledExecutorService f1717b;

        /* renamed from: c */
        public C0499b f1718c;

        /* renamed from: d */
        public ScheduledFuture<?> f1719d;

        /* renamed from: e */
        public final C0498a f1720e = new C0498a();

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$e$a */
        public class C0498a {

            /* renamed from: a */
            public long f1722a = -1;

            public C0498a() {
            }

            /* renamed from: a */
            public final int mo2278a() {
                if (!C0497e.this.mo2273c()) {
                    return 700;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f1722a == -1) {
                    this.f1722a = uptimeMillis;
                }
                long j = uptimeMillis - this.f1722a;
                if (j <= 120000) {
                    return 1000;
                }
                if (j <= 300000) {
                    return 2000;
                }
                return 4000;
            }
        }

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$e$b */
        public class C0499b implements Runnable {

            /* renamed from: b */
            public Executor f1724b;

            /* renamed from: c */
            public boolean f1725c = false;

            public C0499b(Executor executor) {
                this.f1724b = executor;
            }

            /* renamed from: a */
            public static void m1398a(C0499b bVar) {
                boolean z;
                if (!bVar.f1725c) {
                    if (Camera2CameraImpl.this.f1689f == InternalState.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C24361g.m61193w((String) null, z);
                    if (C0497e.this.mo2273c()) {
                        Camera2CameraImpl.this.mo2264y(true);
                    } else {
                        Camera2CameraImpl.this.mo2265z(true);
                    }
                }
            }

            public final void run() {
                this.f1724b.execute(new C0416i1(this, 1));
            }
        }

        public C0497e(SequentialExecutor sequentialExecutor, C4721b bVar) {
            this.f1716a = sequentialExecutor;
            this.f1717b = bVar;
        }

        /* renamed from: a */
        public final boolean mo2271a() {
            if (this.f1719d == null) {
                return false;
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            StringBuilder k = C13555b.m33972k("Cancelling scheduled re-open: ");
            k.append(this.f1718c);
            camera2CameraImpl.mo2251j(k.toString());
            this.f1718c.f1725c = true;
            this.f1718c = null;
            this.f1719d.cancel(false);
            this.f1719d = null;
            return true;
        }

        /* renamed from: b */
        public final void mo2272b() {
            boolean z;
            boolean z2;
            int i;
            boolean z3;
            boolean z4 = true;
            if (this.f1718c == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w((String) null, z);
            if (this.f1719d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C24361g.m61193w((String) null, z2);
            C0498a aVar = this.f1720e;
            aVar.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar.f1722a == -1) {
                aVar.f1722a = uptimeMillis;
            }
            long j = uptimeMillis - aVar.f1722a;
            if (!C0497e.this.mo2273c()) {
                i = 10000;
            } else {
                i = 1800000;
            }
            if (j >= ((long) i)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                aVar.f1722a = -1;
                z4 = false;
            }
            if (z4) {
                this.f1718c = new C0499b(this.f1716a);
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                StringBuilder k = C13555b.m33972k("Attempting camera re-open in ");
                k.append(this.f1720e.mo2278a());
                k.append("ms: ");
                k.append(this.f1718c);
                k.append(" activeResuming = ");
                k.append(Camera2CameraImpl.this.f1708y);
                camera2CameraImpl.mo2251j(k.toString());
                this.f1719d = this.f1717b.schedule(this.f1718c, (long) this.f1720e.mo2278a(), TimeUnit.MILLISECONDS);
                return;
            }
            C0497e.this.mo2273c();
            C4289j0.m11435b("Camera2CameraImpl");
            Camera2CameraImpl.this.mo2262v(InternalState.PENDING_OPEN, (C0547c) null, false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r0 = r0.f1696m;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo2273c() {
            /*
                r3 = this;
                androidx.camera.camera2.internal.Camera2CameraImpl r0 = androidx.camera.camera2.internal.Camera2CameraImpl.this
                boolean r1 = r0.f1708y
                r2 = 1
                if (r1 == 0) goto L_0x000f
                int r0 = r0.f1696m
                if (r0 == r2) goto L_0x0010
                r1 = 2
                if (r0 != r1) goto L_0x000f
                goto L_0x0010
            L_0x000f:
                r2 = 0
            L_0x0010:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraImpl.C0497e.mo2273c():boolean");
        }

        public final void onClosed(CameraDevice cameraDevice) {
            boolean z;
            Camera2CameraImpl.this.mo2251j("CameraDevice.onClosed()");
            if (Camera2CameraImpl.this.f1695l == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("Unexpected onClose callback on camera device: " + cameraDevice, z);
            int i = C0494b.f1711a[Camera2CameraImpl.this.f1689f.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.f1696m != 0) {
                        StringBuilder k = C13555b.m33972k("Camera closed due to error: ");
                        k.append(Camera2CameraImpl.m1366l(Camera2CameraImpl.this.f1696m));
                        camera2CameraImpl.mo2251j(k.toString());
                        mo2272b();
                        return;
                    }
                    camera2CameraImpl.mo2265z(false);
                    return;
                } else if (i != 7) {
                    StringBuilder k2 = C13555b.m33972k("Camera closed while in state: ");
                    k2.append(Camera2CameraImpl.this.f1689f);
                    throw new IllegalStateException(k2.toString());
                }
            }
            C24361g.m61193w((String) null, Camera2CameraImpl.this.mo2253n());
            Camera2CameraImpl.this.mo2252k();
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.mo2251j("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            boolean z;
            boolean z2;
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f1695l = cameraDevice;
            camera2CameraImpl.f1696m = i;
            int i2 = C0494b.f1711a[camera2CameraImpl.f1689f.ordinal()];
            int i3 = 3;
            if (i2 != 3) {
                int i4 = 6;
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", new Object[]{cameraDevice.getId(), Camera2CameraImpl.m1366l(i), Camera2CameraImpl.this.f1689f.name()});
                    C4289j0.m11435b("Camera2CameraImpl");
                    if (Camera2CameraImpl.this.f1689f == InternalState.OPENING || Camera2CameraImpl.this.f1689f == InternalState.OPENED || Camera2CameraImpl.this.f1689f == InternalState.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StringBuilder k = C13555b.m33972k("Attempt to handle open error from non open state: ");
                    k.append(Camera2CameraImpl.this.f1689f);
                    C24361g.m61193w(k.toString(), z);
                    if (i == 1 || i == 2 || i == 4) {
                        String.format("Attempt to reopen camera[%s] after error[%s]", new Object[]{cameraDevice.getId(), Camera2CameraImpl.m1366l(i)});
                        C4289j0.m11435b("Camera2CameraImpl");
                        if (Camera2CameraImpl.this.f1696m != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C24361g.m61193w("Can only reopen camera device after error if the camera device is actually in an error state.", z2);
                        if (i == 1) {
                            i3 = 2;
                        } else if (i == 2) {
                            i3 = 1;
                        }
                        Camera2CameraImpl.this.mo2262v(InternalState.REOPENING, new C0547c(i3, (Throwable) null), true);
                        Camera2CameraImpl.this.mo2249h(false);
                        return;
                    }
                    cameraDevice.getId();
                    C4289j0.m11435b("Camera2CameraImpl");
                    if (i == 3) {
                        i4 = 5;
                    }
                    Camera2CameraImpl.this.mo2262v(InternalState.CLOSING, new C0547c(i4, (Throwable) null), true);
                    Camera2CameraImpl.this.mo2249h(false);
                    return;
                } else if (i2 != 7) {
                    StringBuilder k2 = C13555b.m33972k("onError() should not be possible from state: ");
                    k2.append(Camera2CameraImpl.this.f1689f);
                    throw new IllegalStateException(k2.toString());
                }
            }
            String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", new Object[]{cameraDevice.getId(), Camera2CameraImpl.m1366l(i), Camera2CameraImpl.this.f1689f.name()});
            C4289j0.m11435b("Camera2CameraImpl");
            Camera2CameraImpl.this.mo2249h(false);
        }

        public final void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.mo2251j("CameraDevice.onOpened()");
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f1695l = cameraDevice;
            camera2CameraImpl.f1696m = 0;
            this.f1720e.f1722a = -1;
            int i = C0494b.f1711a[camera2CameraImpl.f1689f.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    Camera2CameraImpl.this.mo2261u(InternalState.OPENED);
                    Camera2CameraImpl.this.mo2256q();
                    return;
                } else if (i != 7) {
                    StringBuilder k = C13555b.m33972k("onOpened() should not be possible from state: ");
                    k.append(Camera2CameraImpl.this.f1689f);
                    throw new IllegalStateException(k.toString());
                }
            }
            C24361g.m61193w((String) null, Camera2CameraImpl.this.mo2253n());
            Camera2CameraImpl.this.f1695l.close();
            Camera2CameraImpl.this.f1695l = null;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$f */
    public static abstract class C0500f {
        /* renamed from: a */
        public abstract SessionConfig mo2280a();

        /* renamed from: b */
        public abstract Size mo2281b();

        /* renamed from: c */
        public abstract String mo2282c();

        /* renamed from: d */
        public abstract Class<?> mo2283d();
    }

    public Camera2CameraImpl(C7197a0 a0Var, String str, C7124z zVar, C0575d dVar, Executor executor, Handler handler, C7039d1 d1Var) throws CameraUnavailableException {
        C7197a0 a0Var2 = a0Var;
        String str2 = str;
        C7124z zVar2 = zVar;
        C0575d dVar2 = dVar;
        C4421d0<CameraInternal.State> d0Var = new C4421d0<>();
        this.f1690g = d0Var;
        boolean z = false;
        this.f1696m = 0;
        new AtomicInteger(0);
        this.f1698o = new LinkedHashMap();
        this.f1701r = new HashSet();
        this.f1705v = new HashSet();
        this.f1706w = new Object();
        this.f1708y = false;
        this.f1686c = a0Var2;
        this.f1700q = dVar2;
        C4721b bVar = new C4721b(handler);
        this.f1688e = bVar;
        SequentialExecutor sequentialExecutor = new SequentialExecutor(executor);
        this.f1687d = sequentialExecutor;
        this.f1693j = new C0497e(sequentialExecutor, bVar);
        this.f1685b = new C0593q(str2);
        d0Var.f15490a.postValue(new C4421d0.C4423b(CameraInternal.State.CLOSED));
        C7113w0 w0Var = new C7113w0(dVar2);
        this.f1691h = w0Var;
        C0516i iVar = new C0516i(sequentialExecutor);
        this.f1703t = iVar;
        this.f1709z = d1Var;
        this.f1697n = mo2254o();
        try {
            C7090q qVar = new C7090q(a0Var.mo23499b(str), sequentialExecutor, new C0496d(), zVar2.f22144g);
            this.f1692i = qVar;
            this.f1694k = zVar2;
            zVar2.mo23377e(qVar);
            zVar2.f22142e.redirectTo(w0Var.f22108b);
            this.f1704u = new C0525o.C0526a(handler, iVar, zVar2.f22144g, C0022m.f8a, sequentialExecutor, bVar);
            C0495c cVar = new C0495c(str2);
            this.f1699p = cVar;
            synchronized (dVar2.f1961b) {
                z = !dVar2.f1963d.containsKey(this) ? true : z;
                C24361g.m61193w("Camera is already registered: " + this, z);
                dVar2.f1963d.put(this, new C0575d.C0576a(sequentialExecutor, cVar));
            }
            a0Var2.f22323a.mo23503a(sequentialExecutor, cVar);
        } catch (CameraAccessExceptionCompat e) {
            throw C17875h.m44310u(e);
        }
    }

    /* renamed from: l */
    public static String m1366l(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: m */
    public static String m1367m(UseCase useCase) {
        return useCase.mo2371f() + useCase.hashCode();
    }

    /* renamed from: w */
    public static ArrayList m1368w(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            arrayList2.add(new C0507a(m1367m(useCase), useCase.getClass(), useCase.f1870k, useCase.f1866g));
        }
        return arrayList2;
    }

    /* renamed from: A */
    public final void mo2234A() {
        boolean z;
        C0593q qVar = this.f1685b;
        qVar.getClass();
        SessionConfig.C0569e eVar = new SessionConfig.C0569e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : qVar.f2020a.entrySet()) {
            C0593q.C0594a aVar = (C0593q.C0594a) entry.getValue();
            if (aVar.f2023c && aVar.f2022b) {
                eVar.mo2463a(aVar.f2021a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        C4289j0.m11435b("UseCaseAttachState");
        if (!eVar.f1949j || !eVar.f1948i) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            SessionConfig b = eVar.mo2464b();
            C7090q qVar2 = this.f1692i;
            int i = b.f1937f.f1972c;
            qVar2.f22055v = i;
            qVar2.f22041h.f21973d = i;
            qVar2.f22047n.f21915f = i;
            eVar.mo2463a(qVar2.mo23333j());
            this.f1697n.mo2289e(eVar.mo2464b());
            return;
        }
        C7090q qVar3 = this.f1692i;
        qVar3.f22055v = 1;
        qVar3.f22041h.f21973d = 1;
        qVar3.f22047n.f21915f = 1;
        this.f1697n.mo2289e(qVar3.mo23333j());
    }

    /* renamed from: a */
    public final void mo2235a(UseCase useCase) {
        useCase.getClass();
        this.f1687d.execute(new C7106u(this, m1367m(useCase), useCase.f1870k));
    }

    public final void attachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            C7090q qVar = this.f1692i;
            synchronized (qVar.f22037d) {
                qVar.f22048o++;
            }
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                String m = m1367m(useCase);
                if (!this.f1705v.contains(m)) {
                    this.f1705v.add(m);
                    useCase.mo2382q();
                }
            }
            try {
                this.f1687d.execute(new C7078n(1, this, new ArrayList(m1368w(arrayList))));
            } catch (RejectedExecutionException unused) {
                mo2251j("Unable to attach use cases.");
                this.f1692i.mo23329f();
            }
        }
    }

    /* renamed from: b */
    public final void mo2237b(UseCase useCase) {
        useCase.getClass();
        this.f1687d.execute(new C7112w(0, this, m1367m(useCase), useCase.f1870k));
    }

    /* renamed from: c */
    public final void mo2238c(boolean z) {
        this.f1687d.execute(new C0508b(0, this, z));
    }

    /* renamed from: d */
    public final void mo2239d(UseCase useCase) {
        useCase.getClass();
        this.f1687d.execute(new C0510d(0, this, m1367m(useCase), useCase.f1870k));
    }

    public final void detachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(m1368w(arrayList));
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                String m = m1367m(useCase);
                if (this.f1705v.contains(m)) {
                    useCase.mo2386u();
                    this.f1705v.remove(m);
                }
            }
            this.f1687d.execute(new C0509c(0, this, arrayList2));
        }
    }

    /* renamed from: e */
    public final void mo2241e(UseCase useCase) {
        useCase.getClass();
        this.f1687d.execute(new C7103t(0, this, m1367m(useCase)));
    }

    /* renamed from: f */
    public final void mo2242f() {
        SessionConfig b = this.f1685b.mo2504a().mo2464b();
        C0578e eVar = b.f1937f;
        int size = eVar.mo2478a().size();
        int size2 = b.mo2457b().size();
        if (b.mo2457b().isEmpty()) {
            return;
        }
        if (eVar.mo2478a().isEmpty()) {
            if (this.f1702s == null) {
                this.f1702s = new C7075m1(this.f1694k.f22139b, this.f1709z);
            }
            if (this.f1702s != null) {
                C0593q qVar = this.f1685b;
                StringBuilder sb = new StringBuilder();
                this.f1702s.getClass();
                sb.append("MeteringRepeating");
                sb.append(this.f1702s.hashCode());
                String sb2 = sb.toString();
                SessionConfig sessionConfig = this.f1702s.f21992b;
                C0593q.C0594a aVar = (C0593q.C0594a) qVar.f2020a.get(sb2);
                if (aVar == null) {
                    aVar = new C0593q.C0594a(sessionConfig);
                    qVar.f2020a.put(sb2, aVar);
                }
                aVar.f2022b = true;
                C0593q qVar2 = this.f1685b;
                StringBuilder sb3 = new StringBuilder();
                this.f1702s.getClass();
                sb3.append("MeteringRepeating");
                sb3.append(this.f1702s.hashCode());
                String sb4 = sb3.toString();
                SessionConfig sessionConfig2 = this.f1702s.f21992b;
                C0593q.C0594a aVar2 = (C0593q.C0594a) qVar2.f2020a.get(sb4);
                if (aVar2 == null) {
                    aVar2 = new C0593q.C0594a(sessionConfig2);
                    qVar2.f2020a.put(sb4, aVar2);
                }
                aVar2.f2023c = true;
            }
        } else if (size2 == 1 && size == 1) {
            mo2258s();
        } else if (size >= 2) {
            mo2258s();
        } else {
            C4289j0.m11435b("Camera2CameraImpl");
        }
    }

    /* renamed from: g */
    public final void mo2243g(C0574c cVar) {
        if (cVar == null) {
            cVar = C4434j.f15499a;
        }
        C4434j.C4435a aVar = (C4434j.C4435a) cVar;
        aVar.getClass();
        C4439k0 k0Var = (C4439k0) ((C0590n) aVar.getConfig()).mo2423b(C0574c.f1958c, null);
        synchronized (this.f1706w) {
            this.f1707x = k0Var;
        }
        C7090q qVar = this.f1692i;
        qVar.f22045l.mo23290d(((Boolean) C13437d.m33700e(aVar, C0574c.f1959d, Boolean.FALSE)).booleanValue());
    }

    public final CameraControl getCameraControl() {
        throw null;
    }

    public final C7090q getCameraControlInternal() {
        return this.f1692i;
    }

    public final C4288j getCameraInfo() {
        return this.f1694k;
    }

    public final C7124z getCameraInfoInternal() {
        return this.f1694k;
    }

    public final C4421d0 getCameraState() {
        return this.f1690g;
    }

    /* renamed from: h */
    public final void mo2249h(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (this.f1689f == InternalState.CLOSING || this.f1689f == InternalState.RELEASING || (this.f1689f == InternalState.REOPENING && this.f1696m != 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder k = C13555b.m33972k("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: ");
        k.append(this.f1689f);
        k.append(" (error: ");
        k.append(m1366l(this.f1696m));
        k.append(")");
        C24361g.m61193w(k.toString(), z2);
        int i = Build.VERSION.SDK_INT;
        if (i > 23 && i < 29) {
            if (this.f1694k.mo23376d() != 2) {
                z3 = false;
            }
            if (z3 && this.f1696m == 0) {
                CaptureSession captureSession = new CaptureSession();
                this.f1701r.add(captureSession);
                mo2259t(false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                C7041e eVar = new C7041e(2, surface, surfaceTexture);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                C0589m t = C0589m.m1674t();
                ArrayList arrayList = new ArrayList();
                C4427f0 c = C4427f0.m11609c();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                C4415a0 a0Var = new C4415a0(surface);
                linkedHashSet.add(a0Var);
                mo2251j("Start configAndClose.");
                ArrayList arrayList6 = new ArrayList(linkedHashSet);
                ArrayList arrayList7 = new ArrayList(hashSet);
                C0590n s = C0590n.m1678s(t);
                C4450p0 p0Var = C4450p0.f15508b;
                ArrayMap arrayMap = new ArrayMap();
                for (String next : c.mo19987b()) {
                    arrayMap.put(next, c.mo19986a(next));
                }
                SessionConfig sessionConfig = new SessionConfig(arrayList6, arrayList2, arrayList3, arrayList5, arrayList4, new C0578e(arrayList7, s, 1, arrayList, false, new C4450p0(arrayMap), (C4428g) null), (InputConfiguration) null);
                CameraDevice cameraDevice = this.f1695l;
                cameraDevice.getClass();
                captureSession.mo2290f(sessionConfig, cameraDevice, this.f1704u.mo2352a()).addListener(new C7116x(this, captureSession, a0Var, eVar, 0), this.f1687d);
                this.f1697n.mo2285b();
            }
        }
        mo2259t(false);
        this.f1697n.mo2285b();
    }

    /* renamed from: i */
    public final CameraDevice.StateCallback mo2250i() {
        ArrayList arrayList = new ArrayList(this.f1685b.mo2504a().mo2464b().f1933b);
        arrayList.add(this.f1703t.f1792f);
        arrayList.add(this.f1693j);
        if (arrayList.isEmpty()) {
            return new C7107u0();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new C7104t0(arrayList);
    }

    /* renamed from: j */
    public final void mo2251j(String str) {
        String.format("{%s} %s", new Object[]{toString(), str});
        C4289j0.m11435b("Camera2CameraImpl");
    }

    /* renamed from: k */
    public final void mo2252k() {
        boolean z;
        if (this.f1689f == InternalState.RELEASING || this.f1689f == InternalState.CLOSING) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w((String) null, z);
        C24361g.m61193w((String) null, this.f1698o.isEmpty());
        this.f1695l = null;
        if (this.f1689f == InternalState.CLOSING) {
            mo2261u(InternalState.INITIALIZED);
            return;
        }
        C7197a0 a0Var = this.f1686c;
        a0Var.f22323a.mo23504b(this.f1699p);
        mo2261u(InternalState.RELEASED);
    }

    /* renamed from: n */
    public final boolean mo2253n() {
        return this.f1698o.isEmpty() && this.f1701r.isEmpty();
    }

    /* renamed from: o */
    public final C7025a1 mo2254o() {
        synchronized (this.f1706w) {
            if (this.f1707x == null) {
                CaptureSession captureSession = new CaptureSession();
                return captureSession;
            }
            ProcessingCaptureSession processingCaptureSession = new ProcessingCaptureSession(this.f1707x, this.f1694k, this.f1687d, this.f1688e);
            return processingCaptureSession;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: p */
    public final void mo2255p(boolean z) {
        if (!z) {
            this.f1693j.f1720e.f1722a = -1;
        }
        this.f1693j.mo2271a();
        mo2251j("Opening camera.");
        mo2261u(InternalState.OPENING);
        try {
            C7197a0 a0Var = this.f1686c;
            a0Var.f22323a.mo23505c(this.f1694k.f22138a, this.f1687d, mo2250i());
        } catch (CameraAccessExceptionCompat e) {
            StringBuilder k = C13555b.m33972k("Unable to open camera due to ");
            k.append(e.getMessage());
            mo2251j(k.toString());
            if (e.mo2308a() == 10001) {
                mo2262v(InternalState.INITIALIZED, new C0547c(7, e), true);
            }
        } catch (SecurityException e2) {
            StringBuilder k2 = C13555b.m33972k("Unable to open camera due to ");
            k2.append(e2.getMessage());
            mo2251j(k2.toString());
            mo2261u(InternalState.REOPENING);
            this.f1693j.mo2272b();
        }
    }

    /* renamed from: q */
    public final void mo2256q() {
        boolean z;
        boolean z2 = true;
        if (this.f1689f == InternalState.OPENED) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w((String) null, z);
        SessionConfig.C0569e a = this.f1685b.mo2504a();
        if (!a.f1949j || !a.f1948i) {
            z2 = false;
        }
        if (!z2) {
            mo2251j("Unable to create capture session due to conflicting configurations");
            return;
        }
        C7025a1 a1Var = this.f1697n;
        SessionConfig b = a.mo2464b();
        CameraDevice cameraDevice = this.f1695l;
        cameraDevice.getClass();
        C5023g.m12853a(a1Var.mo2290f(b, cameraDevice, this.f1704u.mo2352a()), new C0493a(), this.f1687d);
    }

    /* renamed from: r */
    public final C18728c mo2257r(C7025a1 a1Var) {
        a1Var.close();
        C18728c release = a1Var.release();
        StringBuilder k = C13555b.m33972k("Releasing session in state ");
        k.append(this.f1689f.name());
        mo2251j(k.toString());
        this.f1698o.put(a1Var, release);
        C5023g.m12853a(release, new C0511e(this, a1Var), C14226d.m35352s0());
        return release;
    }

    /* renamed from: s */
    public final void mo2258s() {
        if (this.f1702s != null) {
            C0593q qVar = this.f1685b;
            StringBuilder sb = new StringBuilder();
            this.f1702s.getClass();
            sb.append("MeteringRepeating");
            sb.append(this.f1702s.hashCode());
            String sb2 = sb.toString();
            if (qVar.f2020a.containsKey(sb2)) {
                C0593q.C0594a aVar = (C0593q.C0594a) qVar.f2020a.get(sb2);
                aVar.f2022b = false;
                if (!aVar.f2023c) {
                    qVar.f2020a.remove(sb2);
                }
            }
            C0593q qVar2 = this.f1685b;
            StringBuilder sb3 = new StringBuilder();
            this.f1702s.getClass();
            sb3.append("MeteringRepeating");
            sb3.append(this.f1702s.hashCode());
            qVar2.mo2506c(sb3.toString());
            C7075m1 m1Var = this.f1702s;
            m1Var.getClass();
            C4289j0.m11435b("MeteringRepeating");
            C4415a0 a0Var = m1Var.f21991a;
            if (a0Var != null) {
                a0Var.mo2450a();
            }
            m1Var.f21991a = null;
            this.f1702s = null;
        }
    }

    /* renamed from: t */
    public final void mo2259t(boolean z) {
        boolean z2;
        if (this.f1697n != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24361g.m61193w((String) null, z2);
        mo2251j("Resetting Capture Session");
        C7025a1 a1Var = this.f1697n;
        SessionConfig d = a1Var.mo2288d();
        List<C0578e> c = a1Var.mo2286c();
        C7025a1 o = mo2254o();
        this.f1697n = o;
        o.mo2289e(d);
        this.f1697n.mo2284a(c);
        mo2257r(a1Var);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.f1694k.f22138a});
    }

    /* renamed from: u */
    public final void mo2261u(InternalState internalState) {
        mo2262v(internalState, (C0547c) null, true);
    }

    /* renamed from: v */
    public final void mo2262v(InternalState internalState, C0547c cVar, boolean z) {
        CameraInternal.State state;
        boolean z2;
        CameraInternal.State state2;
        C0546b bVar;
        HashMap hashMap;
        boolean z3;
        boolean z4;
        StringBuilder k = C13555b.m33972k("Transitioning camera internal state: ");
        k.append(this.f1689f);
        k.append(" --> ");
        k.append(internalState);
        mo2251j(k.toString());
        this.f1689f = internalState;
        switch (C0494b.f1711a[internalState.ordinal()]) {
            case 1:
                state = CameraInternal.State.CLOSED;
                break;
            case 2:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 3:
                state = CameraInternal.State.CLOSING;
                break;
            case 4:
                state = CameraInternal.State.OPEN;
                break;
            case 5:
            case 6:
                state = CameraInternal.State.OPENING;
                break;
            case 7:
                state = CameraInternal.State.RELEASING;
                break;
            case 8:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        C0575d dVar = this.f1700q;
        synchronized (dVar.f1961b) {
            int i = dVar.f1964e;
            z2 = false;
            if (state == CameraInternal.State.RELEASED) {
                C0575d.C0576a aVar = (C0575d.C0576a) dVar.f1963d.remove(this);
                if (aVar != null) {
                    dVar.mo2476a();
                    state2 = aVar.f1965a;
                } else {
                    state2 = null;
                }
            } else {
                C0575d.C0576a aVar2 = (C0575d.C0576a) dVar.f1963d.get(this);
                C24361g.m61185s(aVar2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                CameraInternal.State state3 = aVar2.f1965a;
                aVar2.f1965a = state;
                CameraInternal.State state4 = CameraInternal.State.OPENING;
                if (state == state4) {
                    if (state == null || !state.holdsCameraSlot()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        if (state3 != state4) {
                            z4 = false;
                            C24361g.m61193w("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z4);
                        }
                    }
                    z4 = true;
                    C24361g.m61193w("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z4);
                }
                if (state3 != state) {
                    dVar.mo2476a();
                }
                state2 = state3;
            }
            if (state2 != state) {
                if (i < 1 && dVar.f1964e > 0) {
                    hashMap = new HashMap();
                    for (Map.Entry entry : dVar.f1963d.entrySet()) {
                        if (((C0575d.C0576a) entry.getValue()).f1965a == CameraInternal.State.PENDING_OPEN) {
                            hashMap.put((C4279f) entry.getKey(), (C0575d.C0576a) entry.getValue());
                        }
                    }
                } else if (state != CameraInternal.State.PENDING_OPEN || dVar.f1964e <= 0) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put(this, (C0575d.C0576a) dVar.f1963d.get(this));
                }
                if (hashMap != null && !z) {
                    hashMap.remove(this);
                }
                if (hashMap != null) {
                    for (C0575d.C0576a aVar3 : hashMap.values()) {
                        aVar3.getClass();
                        try {
                            Executor executor = aVar3.f1966b;
                            C0575d.C0577b bVar2 = aVar3.f1967c;
                            Objects.requireNonNull(bVar2);
                            executor.execute(new C4268a1(bVar2, 1));
                        } catch (RejectedExecutionException unused) {
                            C4289j0.m11435b("CameraStateRegistry");
                        }
                    }
                }
            }
        }
        this.f1690g.f15490a.postValue(new C4421d0.C4423b(state));
        C7113w0 w0Var = this.f1691h;
        w0Var.getClass();
        switch (C7113w0.C7114a.f22109a[state.ordinal()]) {
            case 1:
                C0575d dVar2 = w0Var.f22107a;
                synchronized (dVar2.f1961b) {
                    Iterator it = dVar2.f1963d.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C0575d.C0576a) ((Map.Entry) it.next()).getValue()).f1965a == CameraInternal.State.CLOSING) {
                                z2 = true;
                            }
                        }
                    }
                }
                if (!z2) {
                    bVar = new C0546b(CameraState.Type.PENDING_OPEN, (C0547c) null);
                    break;
                } else {
                    bVar = new C0546b(CameraState.Type.OPENING, (C0547c) null);
                    break;
                }
            case 2:
                bVar = new C0546b(CameraState.Type.OPENING, cVar);
                break;
            case 3:
                bVar = new C0546b(CameraState.Type.OPEN, cVar);
                break;
            case 4:
            case 5:
                bVar = new C0546b(CameraState.Type.CLOSING, cVar);
                break;
            case 6:
            case 7:
                bVar = new C0546b(CameraState.Type.CLOSED, cVar);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        bVar.toString();
        state.toString();
        Objects.toString(cVar);
        C4289j0.m11435b("CameraStateMachine");
        if (!Objects.equals(w0Var.f22108b.getValue(), bVar)) {
            bVar.toString();
            C4289j0.m11435b("CameraStateMachine");
            w0Var.f22108b.postValue(bVar);
        }
    }

    /* renamed from: x */
    public final void mo2263x(List list) {
        boolean z;
        Size b;
        boolean isEmpty = this.f1685b.mo2505b().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Rational rational = null;
        while (true) {
            z = true;
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            C0500f fVar = (C0500f) it.next();
            C0593q qVar = this.f1685b;
            String c = fVar.mo2282c();
            if (qVar.f2020a.containsKey(c)) {
                z2 = ((C0593q.C0594a) qVar.f2020a.get(c)).f2022b;
            }
            if (!z2) {
                C0593q qVar2 = this.f1685b;
                String c2 = fVar.mo2282c();
                SessionConfig a = fVar.mo2280a();
                C0593q.C0594a aVar = (C0593q.C0594a) qVar2.f2020a.get(c2);
                if (aVar == null) {
                    aVar = new C0593q.C0594a(a);
                    qVar2.f2020a.put(c2, aVar);
                }
                aVar.f2022b = true;
                arrayList.add(fVar.mo2282c());
                if (fVar.mo2283d() == C0631r.class && (b = fVar.mo2281b()) != null) {
                    rational = new Rational(b.getWidth(), b.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder k = C13555b.m33972k("Use cases [");
            k.append(TextUtils.join(", ", arrayList));
            k.append("] now ATTACHED");
            mo2251j(k.toString());
            if (isEmpty) {
                this.f1692i.mo23336o(true);
                C7090q qVar3 = this.f1692i;
                synchronized (qVar3.f22037d) {
                    qVar3.f22048o++;
                }
            }
            mo2242f();
            mo2234A();
            mo2259t(false);
            InternalState internalState = this.f1689f;
            InternalState internalState2 = InternalState.OPENED;
            if (internalState == internalState2) {
                mo2256q();
            } else {
                int i = C0494b.f1711a[this.f1689f.ordinal()];
                if (i == 1 || i == 2) {
                    mo2264y(false);
                } else if (i != 3) {
                    StringBuilder k2 = C13555b.m33972k("open() ignored due to being in state: ");
                    k2.append(this.f1689f);
                    mo2251j(k2.toString());
                } else {
                    mo2261u(InternalState.REOPENING);
                    if (!mo2253n() && this.f1696m == 0) {
                        if (this.f1695l == null) {
                            z = false;
                        }
                        C24361g.m61193w("Camera Device should be open if session close is not complete", z);
                        mo2261u(internalState2);
                        mo2256q();
                    }
                }
            }
            if (rational != null) {
                this.f1692i.f22041h.getClass();
            }
        }
    }

    /* renamed from: y */
    public final void mo2264y(boolean z) {
        mo2251j("Attempting to force open the camera.");
        if (!this.f1700q.mo2477b(this)) {
            mo2251j("No cameras available. Waiting for available camera before opening camera.");
            mo2261u(InternalState.PENDING_OPEN);
            return;
        }
        mo2255p(z);
    }

    /* renamed from: z */
    public final void mo2265z(boolean z) {
        boolean z2;
        mo2251j("Attempting to open the camera.");
        if (!this.f1699p.f1713b || !this.f1700q.mo2477b(this)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            mo2251j("No cameras available. Waiting for available camera before opening camera.");
            mo2261u(InternalState.PENDING_OPEN);
            return;
        }
        mo2255p(z);
    }
}
