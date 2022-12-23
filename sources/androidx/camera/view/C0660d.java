package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.C0509c;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.view.C0658c;
import java.util.Objects;
import java.util.concurrent.Executor;
import p054d0.C4268a1;
import p054d0.C4289j0;
import p090g1.C4732a;
import p102h0.C5023g;
import p176n0.C5789h;
import p176n0.C5792k;
import p176n0.C5793l;
import p695od.C18728c;

/* renamed from: androidx.camera.view.d */
public final class C0660d extends C0658c {

    /* renamed from: e */
    public SurfaceView f2269e;

    /* renamed from: f */
    public final C0662b f2270f = new C0662b();

    /* renamed from: g */
    public C0658c.C0659a f2271g;

    /* renamed from: androidx.camera.view.d$a */
    public static class C0661a {
        /* renamed from: a */
        public static void m1852a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* renamed from: androidx.camera.view.d$b */
    public class C0662b implements SurfaceHolder.Callback {

        /* renamed from: b */
        public Size f2272b;

        /* renamed from: c */
        public SurfaceRequest f2273c;

        /* renamed from: d */
        public Size f2274d;

        /* renamed from: e */
        public boolean f2275e = false;

        public C0662b() {
        }

        /* renamed from: a */
        public final boolean mo2649a() {
            boolean z;
            Size size;
            Surface surface = C0660d.this.f2269e.getHolder().getSurface();
            if (this.f2275e || this.f2273c == null || (size = this.f2272b) == null || !size.equals(this.f2274d)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            C4289j0.m11435b("SurfaceViewImpl");
            this.f2273c.mo2359a(surface, C4732a.getMainExecutor(C0660d.this.f2269e.getContext()), new C5793l(this, 0));
            this.f2275e = true;
            C0660d dVar = C0660d.this;
            dVar.f2268d = true;
            dVar.mo2647f();
            return true;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C4289j0.m11435b("SurfaceViewImpl");
            this.f2274d = new Size(i2, i3);
            mo2649a();
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C4289j0.m11435b("SurfaceViewImpl");
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C4289j0.m11435b("SurfaceViewImpl");
            if (this.f2275e) {
                SurfaceRequest surfaceRequest = this.f2273c;
                if (surfaceRequest != null) {
                    Objects.toString(surfaceRequest);
                    C4289j0.m11435b("SurfaceViewImpl");
                    this.f2273c.f1848i.mo2450a();
                }
            } else {
                SurfaceRequest surfaceRequest2 = this.f2273c;
                if (surfaceRequest2 != null) {
                    Objects.toString(surfaceRequest2);
                    C4289j0.m11435b("SurfaceViewImpl");
                    this.f2273c.f1845f.mo2698c(new DeferrableSurface.SurfaceUnavailableException());
                }
            }
            this.f2275e = false;
            this.f2273c = null;
            this.f2274d = null;
            this.f2272b = null;
        }
    }

    public C0660d(PreviewView previewView, C0656b bVar) {
        super(previewView, bVar);
    }

    /* renamed from: a */
    public final View mo2642a() {
        return this.f2269e;
    }

    /* renamed from: b */
    public final Bitmap mo2643b() {
        SurfaceView surfaceView = this.f2269e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f2269e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f2269e.getWidth(), this.f2269e.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.f2269e;
        C0661a.m1852a(surfaceView2, createBitmap, new C5792k(), surfaceView2.getHandler());
        return createBitmap;
    }

    /* renamed from: c */
    public final void mo2644c() {
    }

    /* renamed from: d */
    public final void mo2645d() {
    }

    /* renamed from: e */
    public final void mo2646e(SurfaceRequest surfaceRequest, C5789h hVar) {
        this.f2265a = surfaceRequest.f1841b;
        this.f2271g = hVar;
        this.f2266b.getClass();
        this.f2265a.getClass();
        SurfaceView surfaceView = new SurfaceView(this.f2266b.getContext());
        this.f2269e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f2265a.getWidth(), this.f2265a.getHeight()));
        this.f2266b.removeAllViews();
        this.f2266b.addView(this.f2269e);
        this.f2269e.getHolder().addCallback(this.f2270f);
        Executor mainExecutor = C4732a.getMainExecutor(this.f2269e.getContext());
        surfaceRequest.f1847h.mo2696a(new C4268a1(this, 2), mainExecutor);
        this.f2269e.post(new C0509c(3, this, surfaceRequest));
    }

    /* renamed from: g */
    public final C18728c<Void> mo2648g() {
        return C5023g.m12857e((Object) null);
    }
}
