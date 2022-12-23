package com.moovit.payment.account.personalinfo;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.model.PersonalDetails;
import com.moovit.request.RequestOptions;
import com.moovit.view.address.Address;
import com.moovit.view.address.AddressInputView;
import f50.C25723a;
import f50.C25724b;
import f50.C25725c;
import f50.C25726d;
import h60.C17315f1;
import h60.C17318g1;
import p054d0.C4291k0;
import p543hq.C17474b;
import p761qy.C19201a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import v50.C20101a;

public class PaymentAccountEditDetailsActivity extends MoovitPaymentActivity {

    /* renamed from: s0 */
    public static final /* synthetic */ int f64077s0 = 0;

    /* renamed from: U */
    public final C25699a f64078U = new C25699a();

    /* renamed from: X */
    public final C25723a f64079X = new C25723a(this);

    /* renamed from: Y */
    public PersonalDetails f64080Y;

    /* renamed from: Z */
    public TextInputLayout f64081Z;

    /* renamed from: l0 */
    public EditText f64082l0;

    /* renamed from: m0 */
    public TextInputLayout f64083m0;

    /* renamed from: n0 */
    public EditText f64084n0;

    /* renamed from: o0 */
    public TextInputLayout f64085o0;

    /* renamed from: p0 */
    public EditText f64086p0;

    /* renamed from: q0 */
    public AddressInputView f64087q0;

    /* renamed from: r0 */
    public Button f64088r0;

    /* renamed from: com.moovit.payment.account.personalinfo.PaymentAccountEditDetailsActivity$a */
    public class C25699a extends C20438i<C17315f1, C17318g1> {
        public C25699a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17315f1 f1Var = (C17315f1) cVar;
            PaymentAccountEditDetailsActivity paymentAccountEditDetailsActivity = PaymentAccountEditDetailsActivity.this;
            int i = PaymentAccountEditDetailsActivity.f64077s0;
            paymentAccountEditDetailsActivity.mo83544B2(false);
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17315f1 f1Var = (C17315f1) cVar;
            C17318g1 g1Var = (C17318g1) gVar;
            PaymentAccountEditDetailsActivity paymentAccountEditDetailsActivity = PaymentAccountEditDetailsActivity.this;
            int i = PaymentAccountEditDetailsActivity.f64077s0;
            paymentAccountEditDetailsActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17315f1 f1Var = (C17315f1) cVar;
            PaymentAccountEditDetailsActivity paymentAccountEditDetailsActivity = PaymentAccountEditDetailsActivity.this;
            paymentAccountEditDetailsActivity.mo44530n2(C13751d.m34341b(paymentAccountEditDetailsActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: A2 */
    public final void mo83543A2() {
        if (C20964s0.m49090h(this.f64082l0.getText()) && (!C20964s0.m49087e(this.f64080Y.f64038b, this.f64082l0.getText()))) {
            this.f64088r0.setEnabled(false);
        } else if (C20964s0.m49090h(this.f64084n0.getText()) && (!C20964s0.m49087e(this.f64080Y.f64039c, this.f64084n0.getText()))) {
            this.f64088r0.setEnabled(false);
        } else if (C20964s0.m49090h(this.f64086p0.getText()) && (!C20964s0.m49087e(this.f64080Y.f64040d, this.f64086p0.getText()))) {
            this.f64088r0.setEnabled(false);
        } else if (!this.f64087q0.mo24773l() || !mo83545y2(this.f64080Y.f64044h)) {
            this.f64088r0.setEnabled(true);
        } else {
            this.f64088r0.setEnabled(false);
        }
    }

    /* renamed from: B2 */
    public final void mo83544B2(boolean z) {
        if (z) {
            findViewById(C25750e.progress_bar).setVisibility(0);
            this.f64088r0.setText((CharSequence) null);
            return;
        }
        findViewById(C25750e.progress_bar).setVisibility(4);
        this.f64088r0.setText(C25754i.payment_my_account_save);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_account_details_edit_activity);
        this.f64080Y = (PersonalDetails) getIntent().getParcelableExtra("personalDetails");
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(C25750e.first_name);
        this.f64081Z = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        C21100e.m49373x(editText, "firstNameView");
        this.f64082l0 = editText;
        editText.setText(this.f64080Y.f64038b);
        this.f64082l0.addTextChangedListener(new C25724b(this));
        TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(C25750e.last_name);
        this.f64083m0 = textInputLayout2;
        EditText editText2 = textInputLayout2.getEditText();
        C21100e.m49373x(editText2, "lastNameView");
        this.f64084n0 = editText2;
        editText2.setText(this.f64080Y.f64039c);
        this.f64084n0.addTextChangedListener(new C25725c(this));
        if (((Boolean) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C20101a.f51014a0)).booleanValue()) {
            ViewGroup viewGroup = (ViewGroup) findViewById(C25750e.personal_details_layout);
            int indexOfChild = viewGroup.indexOfChild(this.f64081Z);
            int indexOfChild2 = viewGroup.indexOfChild(this.f64083m0);
            viewGroup.removeView(this.f64081Z);
            viewGroup.addView(this.f64081Z, indexOfChild2);
            viewGroup.removeView(this.f64083m0);
            viewGroup.addView(this.f64083m0, indexOfChild);
        }
        TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(C25750e.email);
        this.f64085o0 = textInputLayout3;
        EditText editText3 = textInputLayout3.getEditText();
        C21100e.m49373x(editText3, "emailView");
        this.f64086p0 = editText3;
        editText3.setText(this.f64080Y.f64040d);
        this.f64086p0.addTextChangedListener(new C25726d(this));
        AddressInputView addressInputView = (AddressInputView) findViewById(C25750e.address);
        this.f64087q0 = addressInputView;
        Address address = this.f64080Y.f64044h;
        if (address != null) {
            addressInputView.setAddress(address);
        }
        this.f64087q0.setCompleteImeOptions(4);
        this.f64087q0.setCompleteEditorActionListener(this.f64079X);
        this.f64087q0.setOnInputChangedListener(new C4291k0(this, 14));
        Button button = (Button) findViewById(C25750e.save_view);
        this.f64088r0 = button;
        button.setOnClickListener(new C19201a(this, 8));
    }

    /* renamed from: y2 */
    public final boolean mo83545y2(Address address) {
        if (this.f64087q0.mo24773l()) {
            if (address != null) {
                return true;
            }
            return false;
        } else if (address == null) {
            return true;
        } else {
            return !C20975x0.m49118e(address, this.f64087q0.mo24775s(false, false));
        }
    }

    /* renamed from: z2 */
    public final void mo83546z2() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!C20964s0.m49087e(this.f64080Y.f64038b, this.f64082l0.getText())) {
            z = C20964s0.m49094l(this.f64082l0.getText());
        } else {
            z = true;
        }
        if (!z) {
            this.f64081Z.setError(getString(C25754i.invalid_name_error));
            this.f64081Z.requestFocus();
            z2 = false;
        } else {
            z2 = true;
        }
        if (!C20964s0.m49087e(this.f64080Y.f64039c, this.f64084n0.getText())) {
            z3 = C20964s0.m49094l(this.f64084n0.getText());
        } else {
            z3 = true;
        }
        if (!z3) {
            this.f64083m0.setError(getString(C25754i.invalid_name_error));
            if (z2) {
                this.f64083m0.requestFocus();
            }
            z2 = false;
        }
        if (!C20964s0.m49087e(this.f64080Y.f64040d, this.f64086p0.getText())) {
            z4 = C20964s0.m49093k(this.f64086p0.getText());
        } else {
            z4 = true;
        }
        if (!z4) {
            this.f64085o0.setError(getString(C25754i.invalid_email_error));
            if (z2) {
                this.f64085o0.requestFocus();
            }
            z2 = false;
        }
        if (!mo83545y2(this.f64080Y.f64044h) || this.f64087q0.mo24775s(true, z2) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            z2 = false;
        }
        if (z2) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_save_details_clicked");
            mo44545v2(aVar.mo49933a());
            mo83544B2(true);
            C17315f1 f1Var = new C17315f1(mo44548x1(), (String) null, C20964s0.m49082C(this.f64082l0.getText()), C20964s0.m49082C(this.f64084n0.getText()), C20964s0.m49082C(this.f64086p0.getText()), this.f64087q0.mo24775s(false, false));
            String str = f1Var.f44699w;
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            mo44527k2(str, f1Var, requestOptions, this.f64078U);
        }
    }
}
