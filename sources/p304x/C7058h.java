package p304x;

import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import p304x.C7090q;

/* renamed from: x.h */
public final /* synthetic */ class C7058h implements C7090q.C7093c {

    /* renamed from: a */
    public final /* synthetic */ long f21953a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f21954b;

    public /* synthetic */ C7058h(long j, CallbackToFutureAdapter.C0673a aVar) {
        this.f21953a = j;
        this.f21954b = aVar;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        long j = this.f21953a;
        CallbackToFutureAdapter.C0673a aVar = this.f21954b;
        if (!C7090q.m16620n(totalCaptureResult, j)) {
            return false;
        }
        aVar.mo2697b(null);
        return true;
    }
}
