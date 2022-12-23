package x30;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.inputfields.C16069a;
import com.moovit.inputfields.InputField;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.inputfields.TextInputFieldView;
import com.moovit.micromobility.purchase.step.inputs.MicroMobilityInputStep;
import com.moovit.micromobility.purchase.step.inputs.MicroMobilityInputStepResult;
import i20.C17544f;
import java.util.ArrayList;
import java.util.List;
import l30.C5566a0;
import l30.C5597z;
import p543hq.C17474b;
import p583jk.C17884p;
import p808sx.C19568d;
import p977zz.C20935e;
import p977zz.C20964s0;
import u30.C6687a;

/* renamed from: x30.a */
public class C7154a extends C6687a<MicroMobilityInputStep, MicroMobilityInputStepResult> implements C16069a.C16070a {

    /* renamed from: r */
    public static final /* synthetic */ int f22224r = 0;

    /* renamed from: p */
    public ViewGroup f22225p;

    /* renamed from: q */
    public Button f22226q;

    /* renamed from: H0 */
    public final void mo23440H0() {
        mo23442p2();
    }

    /* renamed from: o2 */
    public final void mo23441o2() {
        int childCount = this.f22225p.getChildCount();
        boolean z = true;
        for (int i = 0; i < childCount; i++) {
            z &= ((C16069a) this.f22225p.getChildAt(i)).validate();
        }
        if (z) {
            MicroMobilityInputStep microMobilityInputStep = (MicroMobilityInputStep) this.f20766o;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "continue_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, microMobilityInputStep.f14921c);
            mo46797j2(aVar.mo49933a());
            String str = microMobilityInputStep.f14920b;
            int childCount2 = this.f22225p.getChildCount();
            ArrayList arrayList = new ArrayList(childCount2);
            for (int i2 = 0; i2 < childCount2; i2++) {
                InputFieldValue a = ((C16069a) this.f22225p.getChildAt(i2)).mo48265a();
                if (a != null) {
                    arrayList.add(a);
                }
            }
            mo22864m2(new MicroMobilityInputStepResult(str, arrayList));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5566a0.micro_mobility_input_step_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int childCount = this.f22225p.getChildCount();
        for (int i = 0; i < childCount; i++) {
            bundle.putString(C16759e.m42349e("input_field_value#", i), ((C16069a) this.f22225p.getChildAt(i)).getValue());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        super.onViewCreated(view, bundle);
        MicroMobilityInputStep microMobilityInputStep = (MicroMobilityInputStep) this.f20766o;
        Image image = microMobilityInputStep.f14966f;
        ImageView imageView = (ImageView) view.findViewById(C5597z.logo);
        if (microMobilityInputStep.f14966f != null) {
            imageView.setVisibility(0);
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        } else {
            imageView.setVisibility(8);
        }
        UiUtils.m40234B((TextView) view.findViewById(C5597z.title), microMobilityInputStep.f14967g);
        UiUtils.m40234B((TextView) view.findViewById(C5597z.subtitle), microMobilityInputStep.f14968h);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C5597z.list_view);
        this.f22225p = viewGroup;
        List<InputField> list = ((MicroMobilityInputStep) this.f20766o).f14970j;
        if (C13717b.m34258e(list)) {
            i = 0;
        } else {
            i = list.size();
        }
        UiUtils.m40250i(viewGroup, C5566a0.input_field_text_layout, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            TextInputFieldView textInputFieldView = (TextInputFieldView) viewGroup.getChildAt(i2);
            InputField inputField = list.get(i2);
            if (i2 == 0) {
                textInputFieldView.requestFocus();
            }
            if (bundle != null) {
                str = bundle.getString("input_field_value#" + i2);
            } else {
                str = null;
            }
            textInputFieldView.mo48264C(inputField, str);
            textInputFieldView.setInputFieldListener(this);
            if (i2 == i - 1) {
                textInputFieldView.mo48263B(4, new C17544f(this, 1));
            } else {
                textInputFieldView.mo48263B(5, (C20935e<C16069a>) null);
            }
        }
        Button button = (Button) view.findViewById(C5597z.button);
        this.f22226q = button;
        button.setText(microMobilityInputStep.f14969i);
        this.f22226q.setOnClickListener(new C19568d(this, 4));
        mo23442p2();
    }

    /* renamed from: p2 */
    public final void mo23442p2() {
        int childCount = this.f22225p.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (C20964s0.m49090h(((C16069a) this.f22225p.getChildAt(i)).getValue())) {
                this.f22226q.setEnabled(false);
                return;
            }
        }
        this.f22226q.setEnabled(true);
    }
}
