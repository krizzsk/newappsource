package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24361g;
import p001a0.C0016g;
import p054d0.C4317w0;
import p054d0.C4319x0;
import p054d0.C4322y0;
import p102h0.C5018c;
import p102h0.C5023g;
import p229r1.C6231a;
import p304x.C7029b1;
import p304x.C7087p;
import p304x.C7097r;
import p695od.C18728c;

public final class SurfaceRequest {

    /* renamed from: a */
    public final Object f1840a = new Object();

    /* renamed from: b */
    public final Size f1841b;

    /* renamed from: c */
    public final boolean f1842c;

    /* renamed from: d */
    public final CameraInternal f1843d;

    /* renamed from: e */
    public final CallbackToFutureAdapter.C0675c f1844e;

    /* renamed from: f */
    public final CallbackToFutureAdapter.C0673a<Surface> f1845f;

    /* renamed from: g */
    public final CallbackToFutureAdapter.C0675c f1846g;

    /* renamed from: h */
    public final CallbackToFutureAdapter.C0673a<Void> f1847h;

    /* renamed from: i */
    public final C0532b f1848i;

    /* renamed from: j */
    public C0536f f1849j;

    /* renamed from: k */
    public C0537g f1850k;

    /* renamed from: l */
    public Executor f1851l;

    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$a */
    public class C0531a implements C5018c<Void> {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C0673a f1852a;

        /* renamed from: b */
        public final /* synthetic */ C18728c f1853b;

        public C0531a(CallbackToFutureAdapter.C0673a aVar, CallbackToFutureAdapter.C0675c cVar) {
            this.f1852a = aVar;
            this.f1853b = cVar;
        }

        public final void onFailure(Throwable th) {
            if (th instanceof RequestCancelledException) {
                C24361g.m61193w((String) null, this.f1853b.cancel(false));
            } else {
                C24361g.m61193w((String) null, this.f1852a.mo2697b(null));
            }
        }

        public final void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            C24361g.m61193w((String) null, this.f1852a.mo2697b(null));
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$b */
    public class C0532b extends DeferrableSurface {
        public C0532b(Size size) {
            super(size, 34);
        }

        /* renamed from: g */
        public final C18728c<Surface> mo2360g() {
            return SurfaceRequest.this.f1844e;
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$c */
    public class C0533c implements C5018c<Surface> {

        /* renamed from: a */
        public final /* synthetic */ C18728c f1855a;

        /* renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter.C0673a f1856b;

        /* renamed from: c */
        public final /* synthetic */ String f1857c;

        public C0533c(C18728c cVar, CallbackToFutureAdapter.C0673a aVar, String str) {
            this.f1855a = cVar;
            this.f1856b = aVar;
            this.f1857c = str;
        }

        public final void onFailure(Throwable th) {
            if (th instanceof CancellationException) {
                C24361g.m61193w((String) null, this.f1856b.mo2698c(new RequestCancelledException(C0016g.m31o(new StringBuilder(), this.f1857c, " cancelled."), th)));
            } else {
                this.f1856b.mo2697b(null);
            }
        }

        public final void onSuccess(Object obj) {
            Surface surface = (Surface) obj;
            C5023g.m12859g(true, this.f1855a, this.f1856b, C14226d.m35352s0());
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$d */
    public class C0534d implements C5018c<Void> {

        /* renamed from: a */
        public final /* synthetic */ C6231a f1858a;

        /* renamed from: b */
        public final /* synthetic */ Surface f1859b;

        public C0534d(C6231a aVar, Surface surface) {
            this.f1858a = aVar;
            this.f1859b = surface;
        }

        public final void onFailure(Throwable th) {
            C24361g.m61193w("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof RequestCancelledException);
            this.f1858a.accept(new C0548d(1, this.f1859b));
        }

        public final void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            this.f1858a.accept(new C0548d(0, this.f1859b));
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$e */
    public static abstract class C0535e {
        /* renamed from: a */
        public abstract int mo2361a();

        /* renamed from: b */
        public abstract Surface mo2362b();
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$f */
    public static abstract class C0536f {
        /* renamed from: a */
        public abstract Rect mo2363a();

        /* renamed from: b */
        public abstract int mo2364b();

        /* renamed from: c */
        public abstract int mo2365c();
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$g */
    public interface C0537g {
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, boolean z) {
        this.f1841b = size;
        this.f1843d = cameraInternal;
        this.f1842c = z;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C4317w0(atomicReference, str, 0));
        CallbackToFutureAdapter.C0673a<Void> aVar = (CallbackToFutureAdapter.C0673a) atomicReference.get();
        aVar.getClass();
        this.f1847h = aVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        CallbackToFutureAdapter.C0675c a2 = CallbackToFutureAdapter.m1884a(new C4319x0(0, atomicReference2, str));
        this.f1846g = a2;
        C5023g.m12853a(a2, new C0531a(aVar, a), C14226d.m35352s0());
        CallbackToFutureAdapter.C0673a aVar2 = (CallbackToFutureAdapter.C0673a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        CallbackToFutureAdapter.C0675c a3 = CallbackToFutureAdapter.m1884a(new C4322y0(atomicReference3, str));
        this.f1844e = a3;
        CallbackToFutureAdapter.C0673a<Surface> aVar3 = (CallbackToFutureAdapter.C0673a) atomicReference3.get();
        aVar3.getClass();
        this.f1845f = aVar3;
        C0532b bVar = new C0532b(size);
        this.f1848i = bVar;
        C18728c<Void> d = bVar.mo2453d();
        C5023g.m12853a(a3, new C0533c(d, aVar2, str), C14226d.m35352s0());
        d.addListener(new C7029b1(this, 2), C14226d.m35352s0());
    }

    /* renamed from: a */
    public final void mo2359a(Surface surface, Executor executor, C6231a<C0535e> aVar) {
        if (this.f1845f.mo2697b(surface) || this.f1844e.isCancelled()) {
            C5023g.m12853a(this.f1846g, new C0534d(aVar, surface), executor);
            return;
        }
        C24361g.m61193w((String) null, this.f1844e.isDone());
        try {
            this.f1844e.get();
            executor.execute(new C7087p(4, aVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new C7097r(5, aVar, surface));
        }
    }
}
