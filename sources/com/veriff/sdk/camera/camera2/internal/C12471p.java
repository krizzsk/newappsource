package com.veriff.sdk.camera.camera2.internal;

import androidx.lifecycle.C1044w;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraInfoImpl;

/* renamed from: com.veriff.sdk.camera.camera2.internal.p */
public final /* synthetic */ class C12471p implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraInfoImpl.RedirectableLiveData f30994a;

    public /* synthetic */ C12471p(Camera2CameraInfoImpl.RedirectableLiveData redirectableLiveData) {
        this.f30994a = redirectableLiveData;
    }

    public final void onChanged(Object obj) {
        this.f30994a.setValue(obj);
    }
}
