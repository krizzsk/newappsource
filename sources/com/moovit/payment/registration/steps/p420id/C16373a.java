package com.moovit.payment.registration.steps.p420id;

import a00.C13382a;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import c70.C13751d;
import com.appboy.support.StringUtils;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.registration.PaymentRegistrationInfo;
import com.moovit.payment.registration.steps.p420id.PaymentAccountId;
import com.moovit.request.RequestOptions;
import h60.C17303b1;
import h60.C17306c1;
import i00.C17522a;
import i60.C17559a;
import j50.C25743a;
import k60.C17999a;
import p242s1.C6333d0;
import p453dw.C16740o;
import p543hq.C17474b;
import p824tp.C19742t;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25764f;

/* renamed from: com.moovit.payment.registration.steps.id.a */
public class C16373a extends C17999a {

    /* renamed from: y */
    public static final /* synthetic */ int f42789y = 0;

    /* renamed from: r */
    public final C16374a f42790r = new C16374a();

    /* renamed from: s */
    public final C16375b f42791s = new C16375b();

    /* renamed from: t */
    public final C25764f f42792t = new C25764f(this, 1);

    /* renamed from: u */
    public final C16376c f42793u = new C16376c();

    /* renamed from: v */
    public Spinner f42794v;

    /* renamed from: w */
    public EditText f42795w;

    /* renamed from: x */
    public Button f42796x;

    /* renamed from: com.moovit.payment.registration.steps.id.a$a */
    public class C16374a extends C20438i<C17303b1, C17306c1> {
        public C16374a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17303b1 b1Var = (C17303b1) cVar;
            C16373a aVar = C16373a.this;
            int i = C16373a.f42789y;
            aVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17303b1 b1Var = (C17303b1) cVar;
            C17306c1 c1Var = (C17306c1) gVar;
            C16373a aVar = C16373a.this;
            int i = C16373a.f42789y;
            aVar.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17303b1 b1Var = (C17303b1) cVar;
            C16373a aVar = C16373a.this;
            aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.id.a$b */
    public class C16375b extends C17522a {
        public C16375b() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C16373a aVar = C16373a.this;
            int i4 = C16373a.f42789y;
            aVar.mo49060z2();
            aVar.mo49057A2();
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.id.a$c */
    public class C16376c implements AdapterView.OnItemSelectedListener {
        public C16376c() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            if (view != null) {
                PaymentAccountId.IdType idType = (PaymentAccountId.IdType) view.getTag();
                C16373a aVar = C16373a.this;
                int i2 = C16373a.f42789y;
                aVar.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "id_type_selected");
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.ID;
                int i3 = C25743a.f64178a[idType.ordinal()];
                if (i3 == 1) {
                    str = "id_number";
                } else if (i3 != 2) {
                    str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                } else {
                    str = "passport_number";
                }
                aVar2.mo49939g(analyticsAttributeKey, str);
                aVar.mo46797j2(aVar2.mo49933a());
                int i4 = idType.shortDescription;
                C13382a.m33674j(aVar.f42794v, aVar.getString(C25754i.voiceover_payment_registration_enter_id_passport), aVar.getString(C25754i.voiceover_selected, aVar.getString(i4)));
                aVar.f42795w.setHint(idType.shortDescription);
            }
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.id.a$d */
    public static class C16377d extends ArrayAdapter<PaymentAccountId.IdType> {

        /* renamed from: b */
        public final LayoutInflater f42800b;

        /* renamed from: c */
        public PaymentAccountId.IdType[] f42801c;

        public C16377d(Context context, PaymentAccountId.IdType[] idTypeArr) {
            super(context, 0, idTypeArr);
            this.f42800b = LayoutInflater.from(context);
            this.f42801c = idTypeArr;
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            PaymentAccountId.IdType idType = this.f42801c[i];
            if (view == null) {
                textView = (TextView) this.f42800b.inflate(C19742t.spinner_text_item_dropdown, viewGroup, false);
            } else {
                textView = (TextView) view;
            }
            textView.setText(idType.description);
            return textView;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = (TextView) this.f42800b.inflate(C19742t.spinner_text_item, viewGroup, false);
            } else {
                textView = (TextView) view;
            }
            PaymentAccountId.IdType idType = this.f42801c[i];
            textView.setText(idType.shortDescription);
            textView.setTag(idType);
            return textView;
        }
    }

    /* renamed from: A2 */
    public final void mo49057A2() {
        boolean z;
        EditText editText = this.f42795w;
        if (editText != null && this.f42796x != null) {
            Editable text = editText.getText();
            Button button = this.f42796x;
            if (text == null || text.length() < 5) {
                z = false;
            } else {
                z = true;
            }
            button.setEnabled(z);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_id_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C6333d0.m15030r(view.findViewById(C25750e.title), true);
        C16377d dVar = new C16377d(view.getContext(), PaymentAccountId.IdType.values());
        dVar.setDropDownViewResource(C25751f.spinner_list_item_dropdown);
        Spinner spinner = (Spinner) view.findViewById(C25750e.id_types_spinner);
        this.f42794v = spinner;
        spinner.setAdapter(dVar);
        this.f42794v.setOnItemSelectedListener(this.f42793u);
        EditText editText = (EditText) view.findViewById(C25750e.id_input);
        this.f42795w = editText;
        editText.addTextChangedListener(this.f42791s);
        this.f42795w.setOnEditorActionListener(this.f42792t);
        C13382a.m33668d(this.f42795w, false);
        mo49060z2();
        Button button = (Button) view.findViewById(C25750e.button);
        this.f42796x = button;
        button.setOnClickListener(new C16740o(this, 18));
        mo49057A2();
        PaymentAccountId paymentAccountId = mo50499o2().f42756n;
        if (paymentAccountId != null) {
            this.f42794v.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
            this.f42794v.setSelection(((C16377d) this.f42794v.getAdapter()).getPosition(paymentAccountId.f42788c));
            this.f42795w.setText(paymentAccountId.f42787b);
            this.f42795w.setHint(paymentAccountId.f42788c.shortDescription);
            this.f42795w.requestFocus();
            this.f42794v.setOnItemSelectedListener(this.f42793u);
        }
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_id";
    }

    /* renamed from: y2 */
    public final void mo49059y2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "id");
        mo46797j2(aVar.mo49933a());
        PaymentRegistrationInfo o2 = mo50499o2();
        o2.f42756n = new PaymentAccountId(C20964s0.m49082C(this.f42795w.getText()), (PaymentAccountId.IdType) this.f42794v.getSelectedItem());
        mo50507x2();
        C17303b1 b1Var = new C17303b1(mo46783R1(), o2.f42756n);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17303b1.class, sb, "_");
        sb.append(b1Var.f44689w.f42787b);
        sb.append(b1Var.f44689w.f42788c.name());
        String sb2 = sb.toString();
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        mo46793f2(sb2, b1Var, L1, this.f42790r);
    }

    /* renamed from: z2 */
    public final void mo49060z2() {
        String str;
        String C = C20964s0.m49082C(this.f42795w.getText());
        if (C != null) {
            str = C13382a.m33670f(C);
        } else {
            str = null;
        }
        this.f42795w.setContentDescription(C13382a.m33667c(str, getString(C25754i.voiceover_enter_id_hint)));
    }
}
