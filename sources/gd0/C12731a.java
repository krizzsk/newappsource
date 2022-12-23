package gd0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter;
import p229r1.C6231a;

/* renamed from: gd0.a */
public final /* synthetic */ class C12731a implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ Surface f31456a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f31457b;

    public /* synthetic */ C12731a(Surface surface, SurfaceTexture surfaceTexture) {
        this.f31456a = surface;
        this.f31457b = surfaceTexture;
    }

    public final void accept(Object obj) {
        CameraUseCaseAdapter.lambda$createExtraPreview$1(this.f31456a, this.f31457b, (SurfaceRequest.Result) obj);
    }
}
