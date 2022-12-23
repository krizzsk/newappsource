package com.veriff.sdk.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.internal.YuvToJpegProcessor;

/* renamed from: com.veriff.sdk.camera.core.s */
public final /* synthetic */ class C12569s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31097b;

    /* renamed from: c */
    public final /* synthetic */ Object f31098c;

    /* renamed from: d */
    public final /* synthetic */ Object f31099d;

    public /* synthetic */ C12569s(int i, Object obj, Object obj2) {
        this.f31097b = i;
        this.f31098c = obj;
        this.f31099d = obj2;
    }

    public final void run() {
        switch (this.f31097b) {
            case 0:
                ImageCapture.lambda$createPipeline$1((YuvToJpegProcessor) this.f31098c, (CaptureProcessorPipeline) this.f31099d);
                return;
            case 1:
                ((ImageCapture.ImageCaptureRequest) this.f31098c).lambda$dispatchImage$0((ImageProxy) this.f31099d);
                return;
            default:
                ((CameraX) this.f31098c).lambda$shutdownInternal$10((CallbackToFutureAdapter.C0673a) this.f31099d);
                return;
        }
    }
}
