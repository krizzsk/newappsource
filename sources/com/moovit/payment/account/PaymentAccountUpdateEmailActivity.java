package com.moovit.payment.account;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import b00.C13556a;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.request.RequestOptions;
import com.moovit.view.address.Address;
import h60.C17315f1;
import h60.C17318g1;
import i00.C17522a;
import k50.C25744a;
import p073e7.C4584b;
import p242s1.C6333d0;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25764f;

public class PaymentAccountUpdateEmailActivity extends MoovitPaymentActivity {

    /* renamed from: o0 */
    public static final /* synthetic */ int f63839o0 = 0;

    /* renamed from: U */
    public final C25605a f63840U = new C25605a();

    /* renamed from: X */
    public final C25606b f63841X = new C25606b();

    /* renamed from: Y */
    public final C25764f f63842Y = new C25764f(this, 0);

    /* renamed from: Z */
    public TextInputLayout f63843Z;

    /* renamed from: l0 */
    public EditText f63844l0;

    /* renamed from: m0 */
    public Button f63845m0;

    /* renamed from: n0 */
    public C13556a f63846n0 = null;

    /* renamed from: com.moovit.payment.account.PaymentAccountUpdateEmailActivity$a */
    public class C25605a extends C20438i<C17315f1, C17318g1> {
        public C25605a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17315f1 f1Var = (C17315f1) cVar;
            PaymentAccountUpdateEmailActivity paymentAccountUpdateEmailActivity = PaymentAccountUpdateEmailActivity.this;
            paymentAccountUpdateEmailActivity.f63846n0 = null;
            paymentAccountUpdateEmailActivity.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17318g1 g1Var = (C17318g1) gVar;
            String str = ((C17315f1) cVar).f44700x;
            if (!C20964s0.m49090h(str)) {
                new C25744a((MoovitApplication) PaymentAccountUpdateEmailActivity.this.getApplication(), str).mo49820a();
                PaymentAccountUpdateEmailActivity.this.finish();
                return;
            }
            throw new IllegalStateException("Email sent in request can't be null");
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            PaymentAccountUpdateEmailActivity.this.mo44530n2(C13751d.m34341b(((C17315f1) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: com.moovit.payment.account.PaymentAccountUpdateEmailActivity$b */
    public class C25606b extends C17522a {
        public C25606b() {
        }

        public final void afterTextChanged(Editable editable) {
            PaymentAccountUpdateEmailActivity paymentAccountUpdateEmailActivity = PaymentAccountUpdateEmailActivity.this;
            paymentAccountUpdateEmailActivity.f63843Z.setError((CharSequence) null);
            paymentAccountUpdateEmailActivity.f63845m0.setEnabled(!C20964s0.m49090h(paymentAccountUpdateEmailActivity.f63844l0.getText()));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_update_email_activity);
        C6333d0.m15030r(findViewById(C25750e.title), true);
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(C25750e.email);
        this.f63843Z = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        C21100e.m49373x(editText, "email");
        this.f63844l0 = editText;
        editText.addTextChangedListener(this.f63841X);
        this.f63844l0.setOnEditorActionListener(this.f63842Y);
        Button button = (Button) findViewById(C25750e.button);
        this.f63845m0 = button;
        button.setOnClickListener(new C4584b(this, 28));
    }

    /* renamed from: y2 */
    public final void mo83333y2() {
        boolean z;
        if (this.f63846n0 == null) {
            if (!C20964s0.m49093k(this.f63844l0.getText())) {
                this.f63843Z.setError(getString(C25754i.invalid_email_error));
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "email");
                aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                mo44545v2(aVar.mo49933a());
                return;
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "email");
            aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            mo44545v2(aVar2.mo49933a());
            mo44543u2((CharSequence) null);
            C17315f1 f1Var = new C17315f1(mo44548x1(), (String) null, (String) null, (String) null, C20964s0.m49082C(this.f63844l0.getText()), (Address) null);
            String str = f1Var.f44699w;
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f63846n0 = mo44527k2(str, f1Var, requestOptions, this.f63840U);
        }
    }
}
