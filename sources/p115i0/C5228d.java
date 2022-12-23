package p115i0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import p229r1.C6231a;

/* renamed from: i0.d */
public final /* synthetic */ class C5228d implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ Surface f17320a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f17321b;

    public /* synthetic */ C5228d(Surface surface, SurfaceTexture surfaceTexture) {
        this.f17320a = surface;
        this.f17321b = surfaceTexture;
    }

    public final void accept(Object obj) {
        Surface surface = this.f17320a;
        SurfaceTexture surfaceTexture = this.f17321b;
        SurfaceRequest.C0535e eVar = (SurfaceRequest.C0535e) obj;
        surface.release();
        surfaceTexture.release();
    }
}
