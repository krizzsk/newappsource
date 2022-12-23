package p60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C13717b;
import c70.C13751d;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.dashboard.C14951n;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.inputfields.C16069a;
import com.moovit.inputfields.InputField;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.inputfields.TextInputFieldView;
import com.moovit.payment.registration.steps.input.InputFieldsInstructions;
import java.util.ArrayList;
import java.util.List;
import k60.C17999a;
import p543hq.C17474b;
import p583jk.C17884p;
import p597jy.C17979a;
import p713ov.C18833b;
import p977zz.C20935e;
import p977zz.C20944i0;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;

/* renamed from: p60.a */
public abstract class C18883a extends C17999a implements C16069a.C16070a {

    /* renamed from: u */
    public static final /* synthetic */ int f48058u = 0;

    /* renamed from: r */
    public InputFieldsInstructions f48059r;

    /* renamed from: s */
    public ViewGroup f48060s;

    /* renamed from: t */
    public Button f48061t;

    /* renamed from: A2 */
    public abstract InputFieldsInstructions mo51080A2();

    /* renamed from: B2 */
    public final void mo51348B2(Button button, String str, C20944i0<String, String> i0Var) {
        if (i0Var != null) {
            button.setText((CharSequence) i0Var.f52692a);
            button.setOnClickListener(new C18833b(this, button, str, i0Var, 1));
            button.setVisibility(0);
            return;
        }
        button.setVisibility(8);
    }

    /* renamed from: C2 */
    public final void mo51349C2() {
        int childCount = this.f48060s.getChildCount();
        boolean z = true;
        for (int i = 0; i < childCount; i++) {
            z &= ((C16069a) this.f48060s.getChildAt(i)).validate();
        }
        mo46797j2(mo51352y2(z).mo49933a());
        if (z) {
            InputFieldsInstructions inputFieldsInstructions = this.f48059r;
            int childCount2 = this.f48060s.getChildCount();
            ArrayList arrayList = new ArrayList(childCount2);
            for (int i2 = 0; i2 < childCount2; i2++) {
                InputFieldValue a = ((C16069a) this.f48060s.getChildAt(i2)).mo48265a();
                if (a != null) {
                    arrayList.add(a);
                }
            }
            mo51081D2(inputFieldsInstructions, arrayList);
        }
    }

    /* renamed from: D2 */
    public abstract void mo51081D2(InputFieldsInstructions inputFieldsInstructions, ArrayList arrayList);

    /* renamed from: E2 */
    public final void mo51350E2(Exception exc) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.RESPONSE);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo49058q2());
        aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: F2 */
    public final void mo51351F2() {
        int childCount = this.f48060s.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (C20964s0.m49090h(((C16069a) this.f48060s.getChildAt(i)).getValue())) {
                this.f48061t.setEnabled(false);
                return;
            }
        }
        this.f48061t.setEnabled(true);
    }

    /* renamed from: H0 */
    public final void mo23440H0() {
        mo51351F2();
    }

    /* renamed from: e2 */
    public final void mo46792e2(Bundle bundle) {
        super.mo46792e2(bundle);
        InputFieldsInstructions A2 = mo51080A2();
        C21100e.m49373x(A2, "instructions");
        this.f48059r = A2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.abstract_payment_registration_input_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int childCount = this.f48060s.getChildCount();
        for (int i = 0; i < childCount; i++) {
            bundle.putString(C16759e.m42349e("input_field_value#", i), ((C16069a) this.f48060s.getChildAt(i)).getValue());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        super.onViewCreated(view, bundle);
        Image image = this.f48059r.f42806d;
        ImageView imageView = (ImageView) view.findViewById(C25750e.logo);
        if (this.f48059r.f42806d != null) {
            imageView.setVisibility(0);
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        } else {
            imageView.setVisibility(8);
        }
        UiUtils.m40234B((TextView) view.findViewById(C25750e.title), this.f48059r.f42807e);
        UiUtils.m40234B((TextView) view.findViewById(C25750e.subtitle), this.f48059r.f42808f);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C25750e.list_view);
        this.f48060s = viewGroup;
        List<InputField> list = this.f48059r.f42809g;
        if (C13717b.m34258e(list)) {
            i = 0;
        } else {
            i = list.size();
        }
        UiUtils.m40250i(viewGroup, C25751f.input_field_text_layout, 0, i);
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
                textInputFieldView.mo48263B(4, new C14951n(this, 3));
            } else {
                textInputFieldView.mo48263B(5, (C20935e<C16069a>) null);
            }
        }
        mo51348B2((Button) view.findViewById(C25750e.inline_action), "inline_action_clicked", this.f48059r.f42810h);
        mo51348B2((Button) view.findViewById(C25750e.footer_action), "footer_action_clicked", this.f48059r.f42811i);
        Button button = (Button) view.findViewById(C25750e.button);
        this.f48061t = button;
        String str2 = this.f48059r.f42812j;
        if (str2 == null) {
            str2 = getString(mo51082z2());
        }
        button.setText(str2);
        this.f48061t.setOnClickListener(new C17979a(this, 11));
        mo51351F2();
    }

    /* renamed from: y2 */
    public C17474b.C17475a mo51352y2(boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo49058q2());
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        return aVar;
    }

    /* renamed from: z2 */
    public abstract int mo51082z2();
}
