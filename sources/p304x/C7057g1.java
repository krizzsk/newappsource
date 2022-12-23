package p304x;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import p304x.C7090q;

/* renamed from: x.g1 */
public final /* synthetic */ class C7057g1 implements C7090q.C7093c {

    /* renamed from: a */
    public final /* synthetic */ C7066j1 f21950a;

    /* renamed from: b */
    public final /* synthetic */ int f21951b;

    /* renamed from: c */
    public final /* synthetic */ long f21952c;

    public /* synthetic */ C7057g1(C7066j1 j1Var, int i, long j) {
        this.f21950a = j1Var;
        this.f21951b = i;
        this.f21952c = j;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        C7066j1 j1Var = this.f21950a;
        int i = this.f21951b;
        long j = this.f21952c;
        j1Var.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !C7090q.m16620n(totalCaptureResult, j)) {
            return false;
        }
        CallbackToFutureAdapter.C0673a<Void> aVar = j1Var.f21978i;
        if (aVar != null) {
            aVar.mo2697b(null);
            j1Var.f21978i = null;
        }
        return true;
    }
}
