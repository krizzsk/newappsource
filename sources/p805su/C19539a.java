package p805su;

import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;

/* renamed from: su.a */
public abstract class C19539a extends C15682c<MotQrCodeActivationActivity> {
    public C19539a() {
        super(MotQrCodeActivationActivity.class);
    }

    /* renamed from: m2 */
    public abstract int mo51895m2();

    /* renamed from: n2 */
    public final MotQrCodeScanResult mo51896n2() {
        MotQrCodeScanResult motQrCodeScanResult = ((MotQrCodeActivationActivity) this.f40822c).f39027U;
        C21100e.m49373x(motQrCodeScanResult, "scanResult");
        return motQrCodeScanResult;
    }

    /* renamed from: o2 */
    public final void mo51897o2() {
        MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) this.f40822c;
        if (motQrCodeActivationActivity != null) {
            int m2 = mo51895m2();
            if (m2 == 0) {
                motQrCodeActivationActivity.setTitle((CharSequence) null);
            } else {
                motQrCodeActivationActivity.setTitle(m2);
            }
        }
    }
}
