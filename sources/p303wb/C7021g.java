package p303wb;

import android.graphics.SurfaceTexture;

/* renamed from: wb.g */
public final /* synthetic */ class C7021g implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b */
    public final /* synthetic */ C7022h f21854b;

    public /* synthetic */ C7021g(C7022h hVar) {
        this.f21854b = hVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f21854b.f21855b.set(true);
    }
}
