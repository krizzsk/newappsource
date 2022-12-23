package com.veriff.sdk.camera.core;

import android.media.ImageReader;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

/* renamed from: com.veriff.sdk.camera.core.a */
public final /* synthetic */ class C12508a implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidImageReaderProxy f31017a;

    /* renamed from: b */
    public final /* synthetic */ Executor f31018b;

    /* renamed from: c */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f31019c;

    public /* synthetic */ C12508a(AndroidImageReaderProxy androidImageReaderProxy, Executor executor, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f31017a = androidImageReaderProxy;
        this.f31018b = executor;
        this.f31019c = onImageAvailableListener;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f31017a.lambda$setOnImageAvailableListener$1(this.f31018b, this.f31019c, imageReader);
    }
}
