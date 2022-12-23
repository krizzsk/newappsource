package com.veriff.sdk.camera.camera2.internal;

import com.veriff.sdk.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p695od.C18728c;

/* renamed from: com.veriff.sdk.camera.camera2.internal.b0 */
public final /* synthetic */ class C12429b0 implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f30945a;

    /* renamed from: b */
    public final /* synthetic */ List f30946b;

    public /* synthetic */ C12429b0(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, List list) {
        this.f30945a = synchronizedCaptureSessionBaseImpl;
        this.f30946b = list;
    }

    public final C18728c apply(Object obj) {
        return this.f30945a.lambda$startWithDeferrableSurface$1(this.f30946b, (List) obj);
    }
}
