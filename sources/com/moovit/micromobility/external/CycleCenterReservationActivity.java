package com.moovit.micromobility.external;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import ba0.C7568e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PersonalDetails;
import com.moovit.util.time.C7925b;
import ga0.C12699d;
import i00.C17522a;
import l30.C5566a0;
import l30.C5597z;
import p453dw.C16740o;
import p597jy.C17979a;
import p739px.C19037a;
import p944yq.C20750a;
import p947yt.C20767b;
import p977zz.C20950l0;
import p977zz.C20964s0;
import q30.C6168a;
import w40.C25761d;

public class CycleCenterReservationActivity extends MoovitActivity {

    /* renamed from: w0 */
    public static final C20950l0<Integer> f14868w0 = new C20950l0<>(100, 240);

    /* renamed from: U */
    public final C4147a f14869U = new C4147a();

    /* renamed from: X */
    public ListItemView f14870X;

    /* renamed from: Y */
    public ListItemView f14871Y;

    /* renamed from: Z */
    public RadioGroup f14872Z;

    /* renamed from: l0 */
    public TextInputLayout f14873l0;

    /* renamed from: m0 */
    public EditText f14874m0;

    /* renamed from: n0 */
    public TextInputLayout f14875n0;

    /* renamed from: o0 */
    public EditText f14876o0;

    /* renamed from: p0 */
    public TextInputLayout f14877p0;

    /* renamed from: q0 */
    public EditText f14878q0;

    /* renamed from: r0 */
    public TextInputLayout f14879r0;

    /* renamed from: s0 */
    public EditText f14880s0;

    /* renamed from: t0 */
    public TextInputLayout f14881t0;

    /* renamed from: u0 */
    public EditText f14882u0;

    /* renamed from: v0 */
    public Button f14883v0;

    /* renamed from: com.moovit.micromobility.external.CycleCenterReservationActivity$a */
    public class C4147a extends C17522a {
        public C4147a() {
        }

        public final void afterTextChanged(Editable editable) {
            CycleCenterReservationActivity cycleCenterReservationActivity = CycleCenterReservationActivity.this;
            cycleCenterReservationActivity.f14873l0.setError((CharSequence) null);
            cycleCenterReservationActivity.f14875n0.setError((CharSequence) null);
            cycleCenterReservationActivity.f14877p0.setError((CharSequence) null);
            cycleCenterReservationActivity.f14879r0.setError((CharSequence) null);
            cycleCenterReservationActivity.f14881t0.setError((CharSequence) null);
            cycleCenterReservationActivity.mo19482B2();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11159z2(android.text.Editable r6) {
        /*
            boolean r0 = p977zz.C20964s0.m49094l(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            if (r6 != 0) goto L_0x000b
            goto L_0x0024
        L_0x000b:
            int r0 = r6.length()
            r3 = 0
        L_0x0010:
            if (r3 >= r0) goto L_0x0024
            int r4 = java.lang.Character.codePointAt(r6, r3)
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L_0x001e
            r6 = 1
            goto L_0x0025
        L_0x001e:
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            goto L_0x0010
        L_0x0024:
            r6 = 0
        L_0x0025:
            if (r6 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.micromobility.external.CycleCenterReservationActivity.m11159z2(android.text.Editable):boolean");
    }

    /* renamed from: A2 */
    public final void mo19481A2(String str) {
        C12699d.C12701b bVar = new C12699d.C12701b((Context) this);
        bVar.mo39494d(str);
        bVar.mo39488j();
        bVar.mo39483e(0);
        bVar.mo39486h(this);
        bVar.mo39485g();
        bVar.mo39489k().show(getSupportFragmentManager(), str);
    }

    /* renamed from: B2 */
    public final void mo19482B2() {
        boolean z;
        if (this.f14870X.getTag() == null || this.f14871Y.getTag() == null || this.f14872Z.getCheckedRadioButtonId() == -1 || C20964s0.m49090h(this.f14874m0.getText()) || C20964s0.m49090h(this.f14876o0.getText()) || C20964s0.m49090h(this.f14878q0.getText()) || C20964s0.m49090h(this.f14880s0.getText()) || C20964s0.m49090h(this.f14882u0.getText())) {
            z = false;
        } else {
            z = true;
        }
        this.f14883v0.setEnabled(z);
    }

    /* renamed from: S1 */
    public final void mo19483S1(int i, String str) {
        Long l;
        if (("start_time_dialog_fragment_tag".equals(str) || "end_time_dialog_fragment_tag".equals(str)) && i == -1) {
            C12699d dVar = (C12699d) getSupportFragmentManager().mo3923A(str);
            if (dVar != null) {
                l = Long.valueOf(dVar.mo39477W1());
            } else {
                l = null;
            }
            if (l != null) {
                long longValue = l.longValue();
                String d = C7925b.m18016d(this, longValue);
                if ("start_time_dialog_fragment_tag".equals(str)) {
                    this.f14870X.setTag(Long.valueOf(longValue));
                    this.f14870X.setSubtitle((CharSequence) d);
                } else if ("end_time_dialog_fragment_tag".equals(str)) {
                    this.f14871Y.setTag(Long.valueOf(longValue));
                    this.f14871Y.setSubtitle((CharSequence) d);
                }
                mo19482B2();
            }
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C5566a0.provider_reservation_activity);
        C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) this, new C20750a(this, 6)).addOnFailureListener((Activity) this, (OnFailureListener) new C20767b(this, 1));
    }

    /* renamed from: y2 */
    public final void mo19484y2(PaymentAccount paymentAccount) {
        PersonalDetails personalDetails;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (paymentAccount != null) {
            personalDetails = paymentAccount.f64015d;
        } else {
            personalDetails = null;
        }
        ListItemView listItemView = (ListItemView) findViewById(C5597z.start_time);
        this.f14870X = listItemView;
        listItemView.setOnClickListener(new C19037a(this, 7));
        ListItemView listItemView2 = (ListItemView) findViewById(C5597z.end_time);
        this.f14871Y = listItemView2;
        listItemView2.setOnClickListener(new C16740o(this, 11));
        RadioGroup radioGroup = (RadioGroup) findViewById(C5597z.checkable_options);
        this.f14872Z = radioGroup;
        radioGroup.setOnCheckedChangeListener(new C6168a(this));
        if (personalDetails != null) {
            str = personalDetails.f64038b;
        } else {
            str = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(C5597z.first_name);
        this.f14873l0 = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        C21100e.m49373x(editText, "firstNameView");
        this.f14874m0 = editText;
        editText.setText(str);
        this.f14874m0.addTextChangedListener(this.f14869U);
        if (personalDetails != null) {
            str2 = personalDetails.f64039c;
        } else {
            str2 = null;
        }
        TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(C5597z.last_name);
        this.f14875n0 = textInputLayout2;
        EditText editText2 = textInputLayout2.getEditText();
        C21100e.m49373x(editText2, "lastNameView");
        this.f14876o0 = editText2;
        editText2.setText(str2);
        this.f14876o0.addTextChangedListener(this.f14869U);
        if (personalDetails != null) {
            str3 = personalDetails.f64041e;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            str4 = C7568e.m17311a(this, str3, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
        } else {
            str4 = null;
        }
        TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(C5597z.phone_number);
        this.f14877p0 = textInputLayout3;
        EditText editText3 = textInputLayout3.getEditText();
        C21100e.m49373x(editText3, "phoneNumberView");
        this.f14878q0 = editText3;
        editText3.setText(str4);
        this.f14878q0.addTextChangedListener(this.f14869U);
        if (personalDetails != null) {
            str5 = personalDetails.f64040d;
        }
        TextInputLayout textInputLayout4 = (TextInputLayout) findViewById(C5597z.email);
        this.f14879r0 = textInputLayout4;
        EditText editText4 = textInputLayout4.getEditText();
        C21100e.m49373x(editText4, "emailView");
        this.f14880s0 = editText4;
        editText4.setText(str5);
        this.f14880s0.addTextChangedListener(this.f14869U);
        TextInputLayout textInputLayout5 = (TextInputLayout) findViewById(C5597z.height);
        this.f14881t0 = textInputLayout5;
        EditText editText5 = textInputLayout5.getEditText();
        C21100e.m49373x(editText5, "heightView");
        this.f14882u0 = editText5;
        editText5.addTextChangedListener(this.f14869U);
        Button button = (Button) findViewById(C5597z.send_email_button);
        this.f14883v0 = button;
        button.setOnClickListener(new C17979a(this, 3));
    }
}
