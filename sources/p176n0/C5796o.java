package p176n0;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.C0663e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Objects;
import mf0.C24361g;
import p054d0.C4289j0;
import p090g1.C4732a;
import p102h0.C5018c;
import p102h0.C5023g;

/* renamed from: n0.o */
public final class C5796o implements TextureView.SurfaceTextureListener {

    /* renamed from: b */
    public final /* synthetic */ C0663e f18749b;

    /* renamed from: n0.o$a */
    public class C5797a implements C5018c<SurfaceRequest.C0535e> {

        /* renamed from: a */
        public final /* synthetic */ SurfaceTexture f18750a;

        public C5797a(SurfaceTexture surfaceTexture) {
            this.f18750a = surfaceTexture;
        }

        public final void onFailure(Throwable th) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }

        public final void onSuccess(Object obj) {
            boolean z;
            if (((SurfaceRequest.C0535e) obj).mo2361a() != 3) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("Unexpected result from SurfaceRequest. Surface was provided twice.", z);
            C4289j0.m11435b("TextureViewImpl");
            this.f18750a.release();
            C0663e eVar = C5796o.this.f18749b;
            if (eVar.f2282j != null) {
                eVar.f2282j = null;
            }
        }
    }

    public C5796o(C0663e eVar) {
        this.f18749b = eVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C4289j0.m11435b("TextureViewImpl");
        C0663e eVar = this.f18749b;
        eVar.f2278f = surfaceTexture;
        if (eVar.f2279g != null) {
            eVar.f2280h.getClass();
            Objects.toString(this.f18749b.f2280h);
            C4289j0.m11435b("TextureViewImpl");
            this.f18749b.f2280h.f1848i.mo2450a();
            return;
        }
        eVar.mo2653h();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0663e eVar = this.f18749b;
        eVar.f2278f = null;
        CallbackToFutureAdapter.C0675c cVar = eVar.f2279g;
        if (cVar != null) {
            C5023g.m12853a(cVar, new C5797a(surfaceTexture), C4732a.getMainExecutor(eVar.f2277e.getContext()));
            this.f18749b.f2282j = surfaceTexture;
            return false;
        }
        C4289j0.m11435b("TextureViewImpl");
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C4289j0.m11435b("TextureViewImpl");
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        CallbackToFutureAdapter.C0673a andSet = this.f18749b.f2283k.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo2697b(null);
        }
    }
}
