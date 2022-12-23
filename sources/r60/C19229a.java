package r60;

import a00.C13382a;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.C0199g;
import ba0.C7564a;
import ba0.C7565b;
import ba0.C7566c;
import ba0.C7568e;
import com.google.android.material.textfield.TextInputLayout;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInfo;
import com.moovit.payment.registration.steps.phone.PhoneAlternativeAuthInstructions;
import com.moovit.payment.registration.steps.phone.PhoneInstructions;
import com.moovit.request.RequestOptions;
import h60.C17321h1;
import i00.C17522a;
import i60.C17559a;
import k60.C17999a;
import p001a0.C0016g;
import p242s1.C6333d0;
import p310x5.C7159d;
import p453dw.C16740o;
import p543hq.C17474b;
import p782rv.C19350i;
import p906wz.C20437h;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import z20.C20806a;

/* renamed from: r60.a */
public class C19229a extends C17999a {

    /* renamed from: A */
    public static final /* synthetic */ int f48829A = 0;

    /* renamed from: r */
    public String f48830r;

    /* renamed from: s */
    public String f48831s;

    /* renamed from: t */
    public final C19230a f48832t = new C19230a();

    /* renamed from: u */
    public C7566c f48833u = new C7566c();

    /* renamed from: v */
    public final C19350i f48834v = new C19350i(this, 1);

    /* renamed from: w */
    public Spinner f48835w;

    /* renamed from: x */
    public TextInputLayout f48836x;

    /* renamed from: y */
    public EditText f48837y;

    /* renamed from: z */
    public Button f48838z;

    /* renamed from: r60.a$a */
    public class C19230a extends C17522a {
        public C19230a() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C19229a aVar = C19229a.this;
            aVar.f48836x.setError((CharSequence) null);
            aVar.mo51647C2();
            aVar.mo51646B2();
        }
    }

    /* renamed from: A2 */
    public final void mo51645A2(boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "phone_number");
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        mo46797j2(aVar.mo49933a());
        if (z) {
            new C20806a.C20807a("submit_phone_tap").mo52935c();
        }
    }

    /* renamed from: B2 */
    public final void mo51646B2() {
        boolean z;
        EditText editText = this.f48837y;
        if (editText != null && this.f48838z != null) {
            Editable text = editText.getText();
            Button button = this.f48838z;
            if (text == null || text.length() < 5) {
                z = false;
            } else {
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: C2 */
    public final void mo51647C2() {
        String str;
        String C = C20964s0.m49082C(this.f48837y.getText());
        if (C != null) {
            str = C13382a.m33670f(C);
        } else {
            str = null;
        }
        this.f48837y.setContentDescription(C13382a.m33667c(str, this.f48831s));
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        int i;
        PhoneAlternativeAuthInstructions phoneAlternativeAuthInstructions;
        PhoneAlternativeAuthInstructions phoneAlternativeAuthInstructions2;
        mo50505v2();
        C6333d0.m15030r((TextView) view.findViewById(C25750e.title), true);
        Context context = view.getContext();
        C7565b bVar = new C7565b(context, C7568e.m17314d(context));
        Spinner spinner = (Spinner) view.findViewById(C25750e.codes_spinner);
        this.f48835w = spinner;
        spinner.setAccessibilityDelegate(new C19231b(this));
        this.f48835w.setAdapter(bVar);
        this.f48835w.setOnItemSelectedListener(new C19232c(this));
        PaymentRegistrationInfo o2 = mo50499o2();
        Spinner spinner2 = this.f48835w;
        int i2 = o2.f42748f;
        if (i2 != -1) {
            i = C7568e.m17313c(i2, context);
        } else {
            i = C7568e.m17315e(context);
        }
        spinner2.setSelection(i);
        this.f48836x = (TextInputLayout) view.findViewById(C25750e.phone_input_layout);
        EditText editText = (EditText) view.findViewById(C25750e.phone_input);
        this.f48837y = editText;
        editText.addTextChangedListener(this.f48832t);
        this.f48837y.setOnEditorActionListener(this.f48834v);
        C13382a.m33668d(this.f48837y, false);
        String str = mo50499o2().f42750h;
        if (str != null) {
            this.f48837y.setText(str);
        }
        this.f48837y.addTextChangedListener(this.f48833u);
        if (C13382a.m33671g(view.getContext())) {
            this.f48837y.postDelayed(new C0199g(this, 17), 100);
        }
        Button button = (Button) view.findViewById(C25750e.button);
        this.f48838z = button;
        button.setOnClickListener(new C16740o(this, 19));
        mo51646B2();
        PhoneInstructions phoneInstructions = mo50500p2().f42766j;
        PhoneAlternativeAuthInstructions phoneAlternativeAuthInstructions3 = null;
        if (phoneInstructions == null || (phoneAlternativeAuthInstructions = phoneInstructions.f42825b) == null) {
            phoneAlternativeAuthInstructions = null;
        }
        Button button2 = (Button) view.findViewById(C25750e.primary_alternate_auth_button);
        if (phoneAlternativeAuthInstructions != null) {
            button2.setText(phoneAlternativeAuthInstructions.f42823b);
            button2.setOnClickListener(new C7159d(4, this, phoneAlternativeAuthInstructions));
            button2.setVisibility(0);
        } else {
            button2.setVisibility(8);
        }
        PhoneInstructions phoneInstructions2 = mo50500p2().f42766j;
        if (!(phoneInstructions2 == null || (phoneAlternativeAuthInstructions2 = phoneInstructions2.f42826c) == null)) {
            phoneAlternativeAuthInstructions3 = phoneAlternativeAuthInstructions2;
        }
        Button button3 = (Button) view.findViewById(C25750e.secondary_alternate_auth_button);
        if (phoneAlternativeAuthInstructions3 != null) {
            button3.setText(phoneAlternativeAuthInstructions3.f42823b);
            button3.setOnClickListener(new C7159d(4, this, phoneAlternativeAuthInstructions3));
            button3.setVisibility(0);
            return;
        }
        button3.setVisibility(8);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f48830r = getString(C25754i.voiceover_area_code);
        this.f48831s = getString(C25754i.voiceover_enter_phone_hint);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_enter_phone_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C20806a.C20807a aVar = new C20806a.C20807a("submit_phone_view");
        aVar.mo52934b(mo50500p2().f42758b, "payment_context");
        MarketingEventImpressionBinder.m41586a(this, aVar.mo52933a());
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_phone_number";
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("phone_number_not_valid_dialog_fragment_tag".equals(str)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirmation_dialog");
            aVar.mo49939g(AnalyticsAttributeKey.DIALOG_ACTION_TYPE, C0016g.m17G(i));
            mo46797j2(aVar.mo49933a());
            String string = bundle.getString("phoneNumber");
            if (i == -1 && string != null) {
                mo51649z2((C7564a) this.f48835w.getSelectedItem(), string);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: y2 */
    public final void mo51648y2() {
        boolean z;
        String C = C20964s0.m49082C(this.f48837y.getText());
        C7564a aVar = (C7564a) this.f48835w.getSelectedItem();
        Phonenumber$PhoneNumber h = C7568e.m17318h(C, aVar.f23054c);
        if (h == null) {
            z = false;
        } else {
            z = PhoneNumberUtil.m36283j().mo43766s(h);
        }
        if (!z) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "confirmation_dialog");
            aVar2.mo49939g(AnalyticsAttributeKey.IS_VALID, "phone_number");
            mo46797j2(aVar2.mo49933a());
            AlertDialogFragment.C15856a i = new AlertDialogFragment.C15856a(requireContext()).mo47682k("phone_number_not_valid_dialog_fragment_tag").mo47683l(C25754i.payment_registration_invalid_phone_number_alert_title).mo47679h(C).mo47681j(C25754i.yes).mo47680i(C25754i.f64217no);
            i.mo47675d(false);
            i.f41328b.putString("phoneNumber", C);
            i.mo47673b().show(getChildFragmentManager(), "phone_number_not_valid_dialog_fragment_tag");
            mo51645A2(false);
            return;
        }
        mo51649z2(aVar, C);
    }

    /* renamed from: z2 */
    public final void mo51649z2(C7564a aVar, String str) {
        mo51645A2(true);
        PaymentRegistrationInfo o2 = mo50499o2();
        o2.f42745c = AccountAuthType.PHONE;
        o2.f42746d = null;
        o2.f42748f = aVar.f23052a;
        o2.f42749g = aVar.f23053b;
        o2.f42750h = str;
        o2.f42751i = C7568e.m17312b(str, aVar.f23054c, PhoneNumberUtil.PhoneNumberFormat.E164);
        C17321h1 h1Var = new C17321h1(mo46783R1(), mo50500p2().f42758b, o2.f42749g, o2.f42750h);
        String O = h1Var.mo49832O();
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        mo46793f2(O, h1Var, L1, (C20437h) null);
        mo50504u2((C17559a) null);
    }
}
