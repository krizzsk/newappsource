package com.veriff.sdk.views.camera;

import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.veriff.sdk.views.camera.C22863d;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo59060d2 = {"com/veriff/sdk/views/camera/CapturePhotoScreen$bindCameraToLifecycle$1", "Landroidx/lifecycle/o;", "Lbf0/d;", "start", "stop", "Lcom/veriff/sdk/views/camera/Camera$Type;", "returnOrientation", "Lcom/veriff/sdk/views/camera/Camera$Type;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class CapturePhotoScreen$bindCameraToLifecycle$1 implements C1031o {

    /* renamed from: a */
    public final /* synthetic */ C22896n f57904a;

    /* renamed from: b */
    private C22863d.C22866c f57905b;

    public CapturePhotoScreen$bindCameraToLifecycle$1(C22896n nVar) {
        this.f57904a = nVar;
    }

    @C1045x(Lifecycle.Event.ON_START)
    public final void start() {
        C22863d.C22866c cVar = this.f57905b;
        if (cVar != null) {
            this.f57904a.f58139e.selectCamera(cVar);
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public final void stop() {
        this.f57905b = this.f57904a.f58139e.getSelectedCamera();
        this.f57904a.f58139e.deselectCamera();
    }
}
