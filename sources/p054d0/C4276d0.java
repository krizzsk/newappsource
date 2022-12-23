package p054d0;

import androidx.camera.core.C0627p;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import p066e0.C4462z;

/* renamed from: d0.d0 */
public final /* synthetic */ class C4276d0 implements C4462z.C4463a {

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f15195b;

    public /* synthetic */ C4276d0(CallbackToFutureAdapter.C0673a aVar) {
        this.f15195b = aVar;
    }

    /* renamed from: c */
    public final void mo2538c(C4462z zVar) {
        CallbackToFutureAdapter.C0673a aVar = this.f15195b;
        try {
            C0627p acquireLatestImage = zVar.acquireLatestImage();
            if (acquireLatestImage == null) {
                aVar.mo2698c(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.mo2697b(acquireLatestImage)) {
                acquireLatestImage.close();
            }
        } catch (IllegalStateException e) {
            aVar.mo2698c(e);
        }
    }
}
