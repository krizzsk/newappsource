package n60;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import b00.C13556a;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInfo;
import com.moovit.payment.registration.steps.email.EmailInstructions;
import com.moovit.request.RequestOptions;
import h60.C17323i0;
import h60.C17326j0;
import i00.C17522a;
import i60.C17559a;
import k60.C17999a;
import p242s1.C6333d0;
import p543hq.C17474b;
import p614kr.C18119a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: n60.c */
public class C18532c extends C17999a {

    /* renamed from: y */
    public static final /* synthetic */ int f47176y = 0;

    /* renamed from: r */
    public final C18533a f47177r = new C18533a();

    /* renamed from: s */
    public final C18534b f47178s = new C18534b();

    /* renamed from: t */
    public final C18119a f47179t = new C18119a(this, 1);

    /* renamed from: u */
    public TextInputLayout f47180u;

    /* renamed from: v */
    public EditText f47181v;

    /* renamed from: w */
    public Button f47182w;

    /* renamed from: x */
    public C13556a f47183x = null;

    /* renamed from: n60.c$a */
    public class C18533a extends C20438i<C17323i0, C17326j0> {
        public C18533a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17323i0 i0Var = (C17323i0) cVar;
            C18532c cVar2 = C18532c.this;
            cVar2.f47183x = null;
            cVar2.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17323i0 i0Var = (C17323i0) cVar;
            C17326j0 j0Var = (C17326j0) gVar;
            C18532c cVar2 = C18532c.this;
            int i = C18532c.f47176y;
            cVar2.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18532c.this.mo46795h2(C13751d.m34341b(((C17323i0) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: n60.c$b */
    public class C18534b extends C17522a {
        public C18534b() {
        }

        public final void afterTextChanged(Editable editable) {
            C18532c cVar = C18532c.this;
            cVar.f47180u.setError((CharSequence) null);
            cVar.f47182w.setEnabled(!C20964s0.m49090h(cVar.f47181v.getText()));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_email_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EmailInstructions emailInstructions = mo50500p2().f42767k;
        if (emailInstructions != null) {
            TextView textView = (TextView) view.findViewById(C25750e.title);
            UiUtils.m40234B(textView, emailInstructions.f42782b);
            C6333d0.m15030r(textView, true);
            UiUtils.m40234B((TextView) view.findViewById(C25750e.subtitle), emailInstructions.f42783c);
            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C25750e.email);
            this.f47180u = textInputLayout;
            EditText editText = textInputLayout.getEditText();
            C21100e.m49373x(editText, "email");
            this.f47181v = editText;
            editText.addTextChangedListener(this.f47178s);
            this.f47181v.setOnEditorActionListener(this.f47179t);
            Button button = (Button) view.findViewById(C25750e.button);
            this.f47182w = button;
            button.setOnClickListener(new C18531b(this, 0));
            PaymentRegistrationInfo o2 = mo50499o2();
            if (!C20964s0.m49090h(o2.f42754l)) {
                this.f47181v.setText(o2.f42754l);
                o2.f42754l = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("PaymentRegistrationInstructions must contain non null EmailWithVerificationInstructions");
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_email_verification";
    }

    /* renamed from: y2 */
    public final void mo50936y2() {
        boolean z;
        if (this.f47183x == null) {
            if (!C20964s0.m49093k(this.f47181v.getText())) {
                this.f47180u.setError(getString(C25754i.invalid_email_error));
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "email");
                aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                mo46797j2(aVar.mo49933a());
                return;
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "email");
            aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            mo46797j2(aVar2.mo49933a());
            PaymentRegistrationInfo o2 = mo50499o2();
            o2.f42754l = C20964s0.m49082C(this.f47181v.getText());
            o2.f42745c = AccountAuthType.EMAIL;
            mo50507x2();
            C17323i0 i0Var = new C17323i0(mo46783R1(), mo50500p2().f42758b, o2.f42754l);
            String O = i0Var.mo49833O();
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            this.f47183x = mo46793f2(O, i0Var, L1, this.f47177r);
        }
    }
}
