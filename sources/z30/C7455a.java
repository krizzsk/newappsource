package z30;

import a00.C13382a;
import android.os.Bundle;
import android.os.Vibrator;
import android.p014os.VibrationEffect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import com.moovit.commons.utils.UiUtils;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStep;
import com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStepResult;
import l30.C5566a0;
import l30.C5597z;
import p496fr.C17065b;
import p543hq.C17474b;
import p977zz.C20943i;
import p977zz.C20948k0;
import u30.C6687a;

/* renamed from: z30.a */
public class C7455a extends C6687a<MicroMobilityQrCodeStep, MicroMobilityQrCodeStepResult> implements BarcodeScannerFragment.C15681a {

    /* renamed from: p */
    public static final /* synthetic */ int f22876p = 0;

    /* renamed from: o2 */
    public final void mo23710o2() {
        if (!C20948k0.m49058a(this.f40822c, "android.permission.CAMERA")) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 1001);
            return;
        }
        View view = getView();
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C5597z.instructions);
            C13382a.m33665a(textView, textView.getText());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5566a0.micro_mobility_qr_code_step_fragment, viewGroup, false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1001) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr.length <= 0 || iArr[0] != 0) {
            ((MicroMobilityPurchaseActivity) this.f40822c).finish();
        } else {
            mo23710o2();
        }
    }

    public final void onStart() {
        super.onStart();
        mo23710o2();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MicroMobilityQrCodeStep microMobilityQrCodeStep = (MicroMobilityQrCodeStep) this.f20766o;
        ((TextView) view.findViewById(C5597z.instructions)).setText(microMobilityQrCodeStep.f14979e);
        Button button = (Button) view.findViewById(C5597z.cta_view);
        TextView textView = (TextView) view.findViewById(C5597z.message);
        String str = microMobilityQrCodeStep.f14980f;
        if (str != null) {
            button.setText(str);
            button.setOnClickListener(new C17065b(8, this, microMobilityQrCodeStep));
            UiUtils.m40238F(0, textView, button);
            return;
        }
        UiUtils.m40238F(8, textView, button);
    }

    /* renamed from: w */
    public final void mo23711w(Barcode barcode) {
        if (!((MicroMobilityPurchaseActivity) this.f40822c).isFinishing()) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.QR_READ);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            mo46797j2(aVar.mo49933a());
            Vibrator vibrator = (Vibrator) this.f40822c.getSystemService("vibrator");
            if (C20943i.m49051d(26)) {
                vibrator.vibrate(VibrationEffect.createOneShot(300, -1));
            } else {
                vibrator.vibrate(300);
            }
            mo22864m2(new MicroMobilityQrCodeStepResult(((MicroMobilityQrCodeStep) this.f20766o).f14920b, barcode.f40798b));
        }
    }
}
