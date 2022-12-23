package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.view.C0658c;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p054d0.C4291k0;
import p054d0.C4294m;
import p090g1.C4732a;
import p176n0.C5789h;
import p176n0.C5794m;
import p176n0.C5796o;
import p304x.C7087p;
import p695od.C18728c;

/* renamed from: androidx.camera.view.e */
public final class C0663e extends C0658c {

    /* renamed from: e */
    public TextureView f2277e;

    /* renamed from: f */
    public SurfaceTexture f2278f;

    /* renamed from: g */
    public CallbackToFutureAdapter.C0675c f2279g;

    /* renamed from: h */
    public SurfaceRequest f2280h;

    /* renamed from: i */
    public boolean f2281i = false;

    /* renamed from: j */
    public SurfaceTexture f2282j;

    /* renamed from: k */
    public AtomicReference<CallbackToFutureAdapter.C0673a<Void>> f2283k = new AtomicReference<>();

    /* renamed from: l */
    public C0658c.C0659a f2284l;

    public C0663e(PreviewView previewView, C0656b bVar) {
        super(previewView, bVar);
    }

    /* renamed from: a */
    public final View mo2642a() {
        return this.f2277e;
    }

    /* renamed from: b */
    public final Bitmap mo2643b() {
        TextureView textureView = this.f2277e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f2277e.getBitmap();
    }

    /* renamed from: c */
    public final void mo2644c() {
        SurfaceTexture surfaceTexture;
        if (this.f2281i && this.f2282j != null && this.f2277e.getSurfaceTexture() != (surfaceTexture = this.f2282j)) {
            this.f2277e.setSurfaceTexture(surfaceTexture);
            this.f2282j = null;
            this.f2281i = false;
        }
    }

    /* renamed from: d */
    public final void mo2645d() {
        this.f2281i = true;
    }

    /* renamed from: e */
    public final void mo2646e(SurfaceRequest surfaceRequest, C5789h hVar) {
        this.f2265a = surfaceRequest.f1841b;
        this.f2284l = hVar;
        this.f2266b.getClass();
        this.f2265a.getClass();
        TextureView textureView = new TextureView(this.f2266b.getContext());
        this.f2277e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f2265a.getWidth(), this.f2265a.getHeight()));
        this.f2277e.setSurfaceTextureListener(new C5796o(this));
        this.f2266b.removeAllViews();
        this.f2266b.addView(this.f2277e);
        SurfaceRequest surfaceRequest2 = this.f2280h;
        if (surfaceRequest2 != null) {
            surfaceRequest2.f1845f.mo2698c(new DeferrableSurface.SurfaceUnavailableException());
        }
        this.f2280h = surfaceRequest;
        Executor mainExecutor = C4732a.getMainExecutor(this.f2277e.getContext());
        surfaceRequest.f1847h.mo2696a(new C7087p(5, this, surfaceRequest), mainExecutor);
        mo2653h();
    }

    /* renamed from: g */
    public final C18728c<Void> mo2648g() {
        return CallbackToFutureAdapter.m1884a(new C4291k0(this, 2));
    }

    /* renamed from: h */
    public final void mo2653h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f2265a;
        if (size != null && (surfaceTexture = this.f2278f) != null && this.f2280h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f2265a.getHeight());
            Surface surface = new Surface(this.f2278f);
            SurfaceRequest surfaceRequest = this.f2280h;
            CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C4294m(1, this, surface));
            this.f2279g = a;
            a.f2322c.addListener(new C5794m(this, surface, a, surfaceRequest, 0), C4732a.getMainExecutor(this.f2277e.getContext()));
            this.f2268d = true;
            mo2647f();
        }
    }
}
