package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.concurrent.atomic.AtomicInteger;
import p019b0.C1436m;
import p054d0.C4289j0;
import p102h0.C5023g;
import p102h0.C5028j;
import p316y.C7229u;
import p695od.C18728c;

public abstract class DeferrableSurface {

    /* renamed from: i */
    public static final Size f1920i = new Size(0, 0);

    /* renamed from: j */
    public static final boolean f1921j = C4289j0.m11434a("DeferrableSurface");

    /* renamed from: k */
    public static final AtomicInteger f1922k = new AtomicInteger(0);

    /* renamed from: l */
    public static final AtomicInteger f1923l = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f1924a;

    /* renamed from: b */
    public int f1925b;

    /* renamed from: c */
    public boolean f1926c;

    /* renamed from: d */
    public CallbackToFutureAdapter.C0673a<Void> f1927d;

    /* renamed from: e */
    public final CallbackToFutureAdapter.C0675c f1928e;

    /* renamed from: f */
    public final Size f1929f;

    /* renamed from: g */
    public final int f1930g;

    /* renamed from: h */
    public Class<?> f1931h;

    public static final class SurfaceClosedException extends Exception {
        public DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(DeferrableSurface deferrableSurface, String str) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException() {
            super("Surface request will not complete.");
        }
    }

    public DeferrableSurface() {
        this(f1920i, 0);
    }

    /* renamed from: a */
    public final void mo2450a() {
        CallbackToFutureAdapter.C0673a<Void> aVar;
        synchronized (this.f1924a) {
            if (!this.f1926c) {
                this.f1926c = true;
                if (this.f1925b == 0) {
                    aVar = this.f1927d;
                    this.f1927d = null;
                } else {
                    aVar = null;
                }
                if (C4289j0.m11434a("DeferrableSurface")) {
                    toString();
                    C4289j0.m11435b("DeferrableSurface");
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo2697b(null);
        }
    }

    /* renamed from: b */
    public final void mo2451b() {
        CallbackToFutureAdapter.C0673a<Void> aVar;
        synchronized (this.f1924a) {
            int i = this.f1925b;
            if (i != 0) {
                int i2 = i - 1;
                this.f1925b = i2;
                if (i2 != 0 || !this.f1926c) {
                    aVar = null;
                } else {
                    aVar = this.f1927d;
                    this.f1927d = null;
                }
                if (C4289j0.m11434a("DeferrableSurface")) {
                    toString();
                    C4289j0.m11435b("DeferrableSurface");
                    if (this.f1925b == 0) {
                        f1923l.get();
                        f1922k.decrementAndGet();
                        mo2455f();
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.mo2697b(null);
        }
    }

    /* renamed from: c */
    public final C18728c<Surface> mo2452c() {
        synchronized (this.f1924a) {
            if (this.f1926c) {
                C5028j.C5029a aVar = new C5028j.C5029a(new SurfaceClosedException(this, "DeferrableSurface already closed."));
                return aVar;
            }
            C18728c<Surface> g = mo2360g();
            return g;
        }
    }

    /* renamed from: d */
    public final C18728c<Void> mo2453d() {
        return C5023g.m12858f(this.f1928e);
    }

    /* renamed from: e */
    public final void mo2454e() throws SurfaceClosedException {
        synchronized (this.f1924a) {
            int i = this.f1925b;
            if (i == 0) {
                if (this.f1926c) {
                    throw new SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                }
            }
            this.f1925b = i + 1;
            if (C4289j0.m11434a("DeferrableSurface")) {
                if (this.f1925b == 1) {
                    f1923l.get();
                    f1922k.incrementAndGet();
                    mo2455f();
                }
                toString();
                C4289j0.m11435b("DeferrableSurface");
            }
        }
    }

    /* renamed from: f */
    public final void mo2455f() {
        if (!f1921j && C4289j0.m11434a("DeferrableSurface")) {
            C4289j0.m11435b("DeferrableSurface");
        }
        toString();
        C4289j0.m11435b("DeferrableSurface");
    }

    /* renamed from: g */
    public abstract C18728c<Surface> mo2360g();

    public DeferrableSurface(Size size, int i) {
        this.f1924a = new Object();
        this.f1925b = 0;
        this.f1926c = false;
        this.f1929f = size;
        this.f1930g = i;
        CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C1436m(this, 1));
        this.f1928e = a;
        if (C4289j0.m11434a("DeferrableSurface")) {
            f1923l.incrementAndGet();
            f1922k.get();
            mo2455f();
            a.f2322c.addListener(new C7229u(3, this, Log.getStackTraceString(new Exception())), C14226d.m35352s0());
        }
    }
}
