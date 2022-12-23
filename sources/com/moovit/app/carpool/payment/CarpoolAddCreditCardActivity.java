package com.moovit.app.carpool.payment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b00.C13556a;
import ci0.C21211f;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.payment.ZoozVersion;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import i00.C17522a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import p073e7.C4585c;
import p428cv.C16501c;
import p428cv.C16502d;
import p428cv.C16504e;
import p428cv.C16506g;
import p428cv.C16508i;
import p543hq.C17474b;
import p614kr.C18119a;
import p614kr.C18120b;
import p614kr.C18121c;
import p614kr.C18122d;
import p614kr.C18123e;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20964s0;

public class CarpoolAddCreditCardActivity extends MoovitAppActivity {

    /* renamed from: x0 */
    public static final /* synthetic */ int f37786x0 = 0;

    /* renamed from: U */
    public final C18119a f37787U = new C18119a(this, 0);

    /* renamed from: X */
    public final C14814a f37788X = new C14814a();

    /* renamed from: Y */
    public TextInputLayout f37789Y;

    /* renamed from: Z */
    public TextInputLayout f37790Z;

    /* renamed from: l0 */
    public TextInputLayout f37791l0;

    /* renamed from: m0 */
    public TextInputLayout f37792m0;

    /* renamed from: n0 */
    public TextInputLayout f37793n0;

    /* renamed from: o0 */
    public Spinner f37794o0;

    /* renamed from: p0 */
    public Spinner f37795p0;

    /* renamed from: q0 */
    public Button f37796q0;

    /* renamed from: r0 */
    public View f37797r0;

    /* renamed from: s0 */
    public NestedScrollView f37798s0;

    /* renamed from: t0 */
    public C13556a f37799t0;

    /* renamed from: u0 */
    public boolean f37800u0;

    /* renamed from: v0 */
    public String f37801v0 = null;

    /* renamed from: w0 */
    public ZoozVersion f37802w0 = null;

    /* renamed from: com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity$a */
    public class C14814a implements AdapterView.OnItemSelectedListener {
        public C14814a() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            boolean z;
            int i2;
            if (view != null) {
                CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = CarpoolAddCreditCardActivity.this;
                TextView textView = (TextView) view;
                int i3 = CarpoolAddCreditCardActivity.f37786x0;
                carpoolAddCreditCardActivity.getClass();
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    carpoolAddCreditCardActivity.findViewById(R.id.expirationDateError).setVisibility(4);
                }
                if (z) {
                    i2 = R.attr.colorOnSurface;
                } else {
                    i2 = R.attr.colorOnSurfaceEmphasisMedium;
                }
                C20964s0.m49107y(textView, R.attr.textAppearanceBody, i2);
            }
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity$b */
    public class C14815b extends C21211f {
        public C14815b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C16501c cVar2 = (C16501c) cVar;
            CarpoolAddCreditCardActivity.this.mo44506I1();
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C16501c cVar2 = (C16501c) cVar;
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = CarpoolAddCreditCardActivity.this;
            int i = CarpoolAddCreditCardActivity.f37786x0;
            carpoolAddCreditCardActivity.mo44871E2((String) null);
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C16501c cVar2 = (C16501c) cVar;
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = CarpoolAddCreditCardActivity.this;
            int i = CarpoolAddCreditCardActivity.f37786x0;
            carpoolAddCreditCardActivity.mo44871E2((String) null);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C16501c cVar2 = (C16501c) cVar;
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = CarpoolAddCreditCardActivity.this;
            int i = CarpoolAddCreditCardActivity.f37786x0;
            carpoolAddCreditCardActivity.mo44871E2((String) null);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16501c cVar2 = (C16501c) cVar;
            C16502d dVar = (C16502d) gVar;
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = CarpoolAddCreditCardActivity.this;
            carpoolAddCreditCardActivity.f37801v0 = dVar.f43099m;
            carpoolAddCreditCardActivity.f37802w0 = dVar.f43100n;
            carpoolAddCreditCardActivity.mo44867A2();
        }
    }

    /* renamed from: com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity$c */
    public class C14816c extends C17522a {
        public C14816c() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = CarpoolAddCreditCardActivity.this.f37789Y;
            if (textInputLayout != null) {
                textInputLayout.setError("");
            }
            CarpoolAddCreditCardActivity.this.f37790Z.setError("");
            CarpoolAddCreditCardActivity.this.f37791l0.setError("");
            TextInputLayout textInputLayout2 = CarpoolAddCreditCardActivity.this.f37792m0;
            if (textInputLayout2 != null) {
                textInputLayout2.setError("");
            }
            TextInputLayout textInputLayout3 = CarpoolAddCreditCardActivity.this.f37793n0;
            if (textInputLayout3 != null) {
                textInputLayout3.setError("");
            }
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = CarpoolAddCreditCardActivity.this;
            carpoolAddCreditCardActivity.mo44874H2(carpoolAddCreditCardActivity.f37791l0, 2);
        }
    }

    /* renamed from: A2 */
    public final void mo44867A2() {
        this.f37798s0 = (NestedScrollView) findViewById(R.id.scroller);
        findViewById(R.id.dock_container).setVisibility(0);
        this.f37798s0.setVisibility(0);
        this.f37797r0 = findViewById(R.id.dock_shadow);
        UiUtils.m40259r(this.f37798s0, new C18120b(this, 0));
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.credit_card_container);
        this.f37790Z = textInputLayout;
        mo44870D2(textInputLayout.getEditText(), 16);
        TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(R.id.cvv_container);
        this.f37791l0 = textInputLayout2;
        mo44870D2(textInputLayout2.getEditText(), 4);
        this.f37794o0 = (Spinner) findViewById(R.id.month);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.month_array, R.layout.carpool_spinner_text_item);
        createFromResource.setDropDownViewResource(R.layout.carpool_spinner_text_item_dropdown);
        this.f37794o0.setAdapter(createFromResource);
        this.f37794o0.setOnItemSelectedListener(this.f37788X);
        this.f37795p0 = (Spinner) findViewById(R.id.year);
        int i = Calendar.getInstance().get(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.year));
        for (int i2 = i; i2 < i + 15; i2++) {
            arrayList.add(String.valueOf(i2));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.carpool_spinner_text_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.carpool_spinner_text_item_dropdown);
        this.f37795p0.setAdapter(arrayAdapter);
        this.f37795p0.setOnItemSelectedListener(this.f37788X);
        Button button = (Button) findViewById(R.id.save_button);
        this.f37796q0 = button;
        button.setOnClickListener(new C4585c(this, 4));
        if (this.f37802w0.equals(ZoozVersion.ZOOZ)) {
            TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(R.id.email_container);
            this.f37789Y = textInputLayout3;
            textInputLayout3.setVisibility(0);
            mo44870D2(this.f37789Y.getEditText(), 100);
            this.f37789Y.getEditText().setOnEditorActionListener(this.f37787U);
            return;
        }
        findViewById(R.id.latam_extention).setVisibility(0);
        this.f37792m0 = (TextInputLayout) findViewById(R.id.card_holder_name_container);
        this.f37793n0 = (TextInputLayout) findViewById(R.id.identity_document_container);
        mo44870D2(this.f37792m0.getEditText(), 100);
        mo44870D2(this.f37793n0.getEditText(), 100);
        this.f37793n0.getEditText().setOnEditorActionListener(this.f37787U);
    }

    /* renamed from: B2 */
    public final boolean mo44868B2(String str, String str2) {
        boolean z;
        if (str.length() < 6 || str.length() > 16) {
            this.f37790Z.setError(getString(R.string.credit_card_error));
            z = false;
        } else {
            z = true;
        }
        if (str2.length() < 3 || str2.length() > 4) {
            this.f37791l0.setError(getString(R.string.cvv_error));
            mo44874H2(this.f37791l0, 4);
            z = false;
        } else {
            mo44874H2(this.f37791l0, 2);
        }
        if (this.f37794o0.getSelectedItemPosition() != 0 && this.f37795p0.getSelectedItemPosition() != 0) {
            return z;
        }
        findViewById(R.id.expirationDateError).setVisibility(0);
        return false;
    }

    /* renamed from: C2 */
    public final void mo44869C2(String str, String str2, String str3, String str4, String str5) {
        C16508i iVar = new C16508i(mo44548x1(), str, false, str5, str2, str3, str4);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("sendPaymentMethodTokenRequest", iVar, requestOptions, new C18123e(this));
    }

    /* renamed from: D2 */
    public final void mo44870D2(EditText editText, int i) {
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        editText.addTextChangedListener(new C14816c());
    }

    /* renamed from: E2 */
    public final void mo44871E2(String str) {
        AlertDialogFragment.C15856a aVar = new AlertDialogFragment.C15856a((Context) this);
        aVar.mo47676e(R.drawable.img_empty_warning, false);
        AlertDialogFragment.C15856a l = aVar.mo47683l(R.string.carpool_credit_card_general_error_title);
        l.mo47674c(true);
        mo44530n2(l.mo47682k("creditCardErrorALertTag").mo47681j(R.string.retry_connect).mo47680i(R.string.cancel).mo47679h(str).mo47673b());
    }

    /* renamed from: F2 */
    public final void mo44872F2(String str) {
        mo44506I1();
        this.f37796q0.setEnabled(true);
        mo44871E2(str);
    }

    /* renamed from: G2 */
    public final void mo44873G2(boolean z) {
        if (z || !this.f37800u0) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.STEP_CREDIT_CARD);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
            mo44545v2(aVar.mo49933a());
            this.f37800u0 = z;
        }
    }

    /* renamed from: H2 */
    public final void mo44874H2(TextInputLayout textInputLayout, int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textInputLayout.getLayoutParams();
        layoutParams.topMargin = UiUtils.m40249h(getResources(), (float) i);
        this.f37791l0.setLayoutParams(layoutParams);
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        mo44873G2(false);
        C13556a aVar = this.f37799t0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37799t0 = null;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_add_credit_card_activity);
        if (bundle != null) {
            this.f37801v0 = bundle.getString("paymentToken");
            this.f37802w0 = (ZoozVersion) bundle.getParcelable("zoozVersion");
        }
        if (this.f37801v0 == null || this.f37802w0 == null) {
            mo44875y2();
        } else {
            mo44867A2();
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putString("paymentToken", this.f37801v0);
        bundle.putParcelable("zoozVersion", this.f37802w0);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("CARPOOL_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("creditCardErrorALertTag".equals(str)) {
            if (i != -1) {
                finish();
            } else if (this.f37801v0 == null) {
                mo44875y2();
            } else {
                mo44876z2();
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: y2 */
    public final void mo44875y2() {
        mo44543u2((CharSequence) null);
        C16501c cVar = new C16501c(mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("getCustomerTokenRequest", cVar, requestOptions, new C14815b());
    }

    /* renamed from: z2 */
    public final void mo44876z2() {
        boolean z;
        boolean z2;
        boolean z3;
        String obj = this.f37790Z.getEditText().getText().toString();
        String obj2 = this.f37791l0.getEditText().getText().toString();
        boolean z4 = true;
        if (this.f37802w0.equals(ZoozVersion.ZOOZ)) {
            String obj3 = this.f37789Y.getEditText().getText().toString();
            if (C20964s0.m49090h(obj3) || !Patterns.EMAIL_ADDRESS.matcher(obj3).matches()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                this.f37789Y.setError(getString(R.string.email_error));
            }
            boolean B2 = mo44868B2(obj, obj2);
            if (B2 && z3) {
                mo44543u2((CharSequence) null);
                this.f37796q0.setEnabled(false);
                String str = obj2;
                C16506g gVar = r0;
                C16506g gVar2 = new C16506g(this, this.f37801v0, obj, str, (String) this.f37794o0.getSelectedItem(), (String) this.f37795p0.getSelectedItem(), obj3);
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                this.f37799t0 = mo44527k2("SendCreditCardDetailsSdkWorkaroundRequest", gVar, requestOptions, new C18121c(this));
            }
            if (!B2 || !z3) {
                z4 = false;
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_credit_card_registration_clicked");
            aVar.mo49941i(AnalyticsAttributeKey.CARPOOL_CREDIT_CARD_CLIENT_VALIDATION, z4);
            mo44545v2(aVar.mo49933a());
            return;
        }
        String trim = this.f37792m0.getEditText().getText().toString().trim();
        String trim2 = this.f37793n0.getEditText().getText().toString().trim();
        if (trim.isEmpty()) {
            this.f37792m0.setError(getString(R.string.required_field));
            z = false;
        } else {
            z = true;
        }
        if (trim2.isEmpty()) {
            this.f37793n0.setError(getString(R.string.required_field));
            z2 = false;
        } else {
            z2 = z;
        }
        boolean B22 = mo44868B2(obj, obj2);
        if (B22 && z2) {
            String str2 = this.f37801v0;
            String str3 = (String) this.f37794o0.getSelectedItem();
            String str4 = (String) this.f37795p0.getSelectedItem();
            mo44543u2((CharSequence) null);
            this.f37796q0.setEnabled(false);
            String str5 = obj;
            C16504e eVar = r0;
            C16504e eVar2 = new C16504e(this, str5, trim, str3, str4, trim2);
            RequestOptions requestOptions2 = new RequestOptions();
            requestOptions2.f42909f = true;
            C18122d dVar = r0;
            String str6 = obj2;
            C18122d dVar2 = new C18122d(this, str5, str3, str4, str6, str2);
            mo44527k2("SendCreditCardDetailsRequest", eVar, requestOptions2, dVar);
        }
        if (!B22 || !z2) {
            z4 = false;
        }
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_credit_card_registration_clicked");
        aVar2.mo49941i(AnalyticsAttributeKey.CARPOOL_CREDIT_CARD_CLIENT_VALIDATION, z4);
        mo44545v2(aVar2.mo49933a());
    }
}
