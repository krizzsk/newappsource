package p304x;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import p304x.C7090q;

/* renamed from: x.u1 */
public final /* synthetic */ class C7108u1 implements C7090q.C7093c {

    /* renamed from: a */
    public final /* synthetic */ C7115w1 f22096a;

    public /* synthetic */ C7108u1(C7115w1 w1Var) {
        this.f22096a = w1Var;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        boolean z;
        C7115w1 w1Var = this.f22096a;
        if (w1Var.f22115f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if (num == null || num.intValue() != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z == w1Var.f22116g) {
                w1Var.f22115f.mo2697b(null);
                w1Var.f22115f = null;
            }
        }
        return false;
    }
}
