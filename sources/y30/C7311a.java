package y30;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.PinCodeView;
import com.moovit.micromobility.purchase.step.pincode.MicroMobilityPinCodeStep;
import com.moovit.micromobility.purchase.step.pincode.MicroMobilityPinCodeStepResult;
import l30.C5566a0;
import l30.C5597z;
import p480ez.C16910b;
import p543hq.C17474b;
import u30.C6687a;

/* renamed from: y30.a */
public class C7311a extends C6687a<MicroMobilityPinCodeStep, MicroMobilityPinCodeStepResult> implements PinCodeView.C15865b {

    /* renamed from: r */
    public static final /* synthetic */ int f22412r = 0;

    /* renamed from: p */
    public Button f22413p;

    /* renamed from: q */
    public PinCodeView f22414q;

    /* renamed from: j */
    public final void mo23547j(String str, boolean z) {
        if (z) {
            mo23548o2(str);
        }
    }

    /* renamed from: o2 */
    public final void mo23548o2(String str) {
        MicroMobilityPinCodeStep microMobilityPinCodeStep = (MicroMobilityPinCodeStep) this.f20766o;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "continue_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, microMobilityPinCodeStep.f14921c);
        mo46797j2(aVar.mo49933a());
        mo22864m2(new MicroMobilityPinCodeStepResult(microMobilityPinCodeStep.f14920b, str));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5566a0.micro_mobility_pin_code_step_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        this.f22414q.requestFocus();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MicroMobilityPinCodeStep microMobilityPinCodeStep = (MicroMobilityPinCodeStep) this.f20766o;
        ((TextView) view.findViewById(C5597z.title)).setText(microMobilityPinCodeStep.f14973e);
        ((TextView) view.findViewById(C5597z.instructions)).setText(microMobilityPinCodeStep.f14974f);
        PinCodeView pinCodeView = (PinCodeView) view.findViewById(C5597z.pin_code);
        this.f22414q = pinCodeView;
        pinCodeView.setLength(microMobilityPinCodeStep.f14976h);
        this.f22414q.setListener(this);
        Button button = (Button) view.findViewById(C5597z.button);
        this.f22413p = button;
        button.setText(microMobilityPinCodeStep.f14975g);
        this.f22413p.setOnClickListener(new C16910b(this, 5));
    }

    /* renamed from: v */
    public final void mo23549v(String str, boolean z) {
        this.f22413p.setEnabled(z);
    }
}
