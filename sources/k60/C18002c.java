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
import p399bw.C13696a;
import p543hq.C17474b;
import p739px.C19037a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: k60.c */
public class C18002c extends C17999a {

    /* renamed from: y */
    public static final /* synthetic */ int f46095y = 0;

    /* renamed from: r */
    public final C18003a f46096r = new C18003a();

    /* renamed from: s */
    public final C18004b f46097s = new C18004b();

    /* renamed from: t */
    public final C13696a f46098t = new C13696a(this, 1);

    /* renamed from: u */
    public TextInputLayout f46099u;

    /* renamed from: v */
    public EditText f46100v;

    /* renamed from: w */
    public Button f46101w;

    /* renamed from: x */
    public C13556a f46102x = null;

    /* renamed from: k60.c$a */
    public class C18003a extends C20438i<C17315f1, C17318g1> {
        public C18003a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17315f1 f1Var = (C17315f1) cVar;
            C18002c cVar2 = C18002c.this;
            cVar2.f46102x = null;
            cVar2.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17315f1 f1Var = (C17315f1) cVar;
            C17318g1 g1Var = (C17318g1) gVar;
            C18002c.this.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17315f1 f1Var = (C17315f1) cVar;
            C18002c cVar2 = C18002c.this;
            cVar2.mo46795h2(C13751d.m34341b(cVar2.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: k60.c$b */
    public class C18004b extends C17522a {
        public C18004b() {
        }

        public final void afterTextChanged(Editable editable) {
            C18002c cVar = C18002c.this;
            cVar.f46099u.setError((CharSequence) null);
            cVar.f46101w.setEnabled(!C20964s0.m49090h(cVar.f46100v.getText()));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_step_email_fragment, viewGroup, false);
        C6333d0.m15030r(inflate.findViewById(C25750e.title), true);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C25750e.email);
        this.f46099u = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        C21100e.m49373x(editText, "email");
        this.f46100v = editText;
        editText.addTextChangedListener(this.f46097s);
        this.f46100v.setOnEditorActionListener(this.f46098t);
        Button button = (Button) inflate.findViewById(C25750e.button);
        this.f46101w = button;
        button.setOnClickListener(new C19037a(this, 12));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f46100v.setText(mo50499o2().f42754l);
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_email";
    }

    /* renamed from: y2 */
    public final void mo50510y2() {
        boolean z;
        if (this.f46102x == null) {
            if (!C20964s0.m49093k(this.f46100v.getText())) {
                this.f46099u.setError(getString(C25754i.invalid_email_error));
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
            o2.f42754l = C20964s0.m49082C(this.f46100v.getText());
            mo50507x2();
            C17315f1 f1Var = new C17315f1(mo46783R1(), mo50500p2().f42758b, (String) null, (String) null, o2.f42754l, (Address) null);
            String str = f1Var.f44699w;
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            this.f46102x = mo46793f2(str, f1Var, L1, this.f46096r);
        }
    }
}
