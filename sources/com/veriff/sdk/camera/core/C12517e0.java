package com.veriff.sdk.camera.core;

import android.util.Size;
import com.veriff.sdk.camera.core.impl.PreviewConfig;
import com.veriff.sdk.camera.core.impl.SessionConfig;

/* renamed from: com.veriff.sdk.camera.core.e0 */
public final /* synthetic */ class C12517e0 implements SessionConfig.ErrorListener {

    /* renamed from: a */
    public final /* synthetic */ Preview f31036a;

    /* renamed from: b */
    public final /* synthetic */ String f31037b;

    /* renamed from: c */
    public final /* synthetic */ PreviewConfig f31038c;

    /* renamed from: d */
    public final /* synthetic */ Size f31039d;

    public /* synthetic */ C12517e0(Preview preview, String str, PreviewConfig previewConfig, Size size) {
        this.f31036a = preview;
        this.f31037b = str;
        this.f31038c = previewConfig;
        this.f31039d = size;
    }

    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f31036a.lambda$createPipeline$0(this.f31037b, this.f31038c, this.f31039d, sessionConfig, sessionError);
    }
}
