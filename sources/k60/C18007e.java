package k60;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import b00.C13556a;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.registration.PaymentRegistrationInfo;
import com.moovit.request.RequestOptions;
import com.moovit.view.address.Address;
import h60.C17315f1;
import h60.C17318g1;
import i00.C17522a;
import i60.C17559a;
import p242s1.C6333d0;
import p543hq.C17474b;
import p782rv.C19341f;
import p808sx.C19568d;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: k60.e */
public class C18007e extends C17999a {

    /* renamed from: A */
    public static final /* synthetic */ int f46109A = 0;

    /* renamed from: r */
    public final C18008a f46110r = new C18008a();

    /* renamed from: s */
    public final C18009b f46111s = new C18009b();

    /* renamed from: t */
    public final C19341f f46112t = new C19341f(this, 2);

    /* renamed from: u */
    public TextInputLayout f46113u;

    /* renamed from: v */
    public TextInputLayout f46114v;

    /* renamed from: w */
    public EditText f46115w;

    /* renamed from: x */
    public EditText f46116x;

    /* renamed from: y */
    public Button f46117y;

    /* renamed from: z */
    public C13556a f46118z = null;

    /* renamed from: k60.e$a */
    public class C18008a extends C20438i<C17315f1, C17318g1> {
        public C18008a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17315f1 f1Var = (C17315f1) cVar;
            C18007e eVar = C18007e.this;
            eVar.f46118z = null;
            eVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17315f1 f1Var = (C17315f1) cVar;
            C17318g1 g1Var = (C17318g1) gVar;
            C18007e.this.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17315f1 f1Var = (C17315f1) cVar;
            C18007e eVar = C18007e.this;
            eVar.mo46795h2(C13751d.m34341b(eVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: k60.e$b */
    public class C18009b extends C17522a {
        public C18009b() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C18007e eVar = C18007e.this;
            if (C20964s0.m49090h(eVar.f46115w.getText()) || C20964s0.m49090h(eVar.f46116x.getText())) {
                z = false;
            } else {
                z = true;
            }
            eVar.f46117y.setEnabled(z);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_step_name_fragment, viewGroup, false);
        C6333d0.m15030r(inflate.findViewById(C25750e.title), true);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C25750e.first_name);
        this.f46113u = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        C21100e.m49373x(editText, "firstName");
        this.f46115w = editText;
        editText.addTextChangedListener(this.f46111s);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C25750e.last_name);
        this.f46114v = textInputLayout2;
        EditText editText2 = textInputLayout2.getEditText();
        C21100e.m49373x(editText2, "lastName");
        this.f46116x = editText2;
        editText2.addTextChangedListener(this.f46111s);
        this.f46116x.setOnEditorActionListener(this.f46112t);
        Button button = (Button) inflate.findViewById(C25750e.button);
        this.f46117y = button;
        button.setOnClickListener(new C19568d(this, 8));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PaymentRegistrationInfo o2 = mo50499o2();
        this.f46115w.setText(o2.f42752j);
        this.f46116x.setText(o2.f42753k);
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_name";
    }

    /* renamed from: y2 */
    public final void mo50511y2() {
        boolean z;
        if (this.f46118z == null) {
            if (!C20964s0.m49094l(this.f46115w.getText())) {
                this.f46113u.setError(getString(C25754i.invalid_name_error));
                z = false;
            } else {
                z = true;
            }
            if (!C20964s0.m49094l(this.f46116x.getText())) {
                this.f46114v.setError(getString(C25754i.invalid_name_error));
                z = false;
            }
            if (!z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "name");
                aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                mo46797j2(aVar.mo49933a());
                return;
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "name");
            aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            mo46797j2(aVar2.mo49933a());
            PaymentRegistrationInfo o2 = mo50499o2();
            o2.f42752j = C20964s0.m49082C(this.f46115w.getText());
            o2.f42753k = C20964s0.m49082C(this.f46116x.getText());
            mo50507x2();
            C17315f1 f1Var = new C17315f1(mo46783R1(), mo50500p2().f42758b, o2.f42752j, o2.f42753k, (String) null, (Address) null);
            String str = f1Var.f44699w;
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            this.f46118z = mo46793f2(str, f1Var, L1, this.f46110r);
        }
    }
}
