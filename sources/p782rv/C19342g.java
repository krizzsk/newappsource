package p782rv;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import ba0.C7564a;
import ba0.C7565b;
import ba0.C7566c;
import ba0.C7568e;
import c70.C13751d;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo;
import com.moovit.request.RequestOptions;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import i00.C17522a;
import java.util.ArrayList;
import p073e7.C4585c;
import p527gy.C17261e;
import p543hq.C17474b;
import p567iq.C17635b;
import p740py.C19040a;
import p740py.C19041b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import z90.C13352j;
import z90.C13353k;

/* renamed from: rv.g */
public class C19342g extends C19332a {

    /* renamed from: A */
    public static final /* synthetic */ int f49212A = 0;

    /* renamed from: n */
    public final C19343a f49213n = new C19343a();

    /* renamed from: o */
    public final C19344b f49214o = new C19344b();

    /* renamed from: p */
    public final C19345c f49215p = new C19345c();

    /* renamed from: q */
    public final C19346d f49216q = new C19346d();

    /* renamed from: r */
    public final C19347e f49217r = new C19347e();

    /* renamed from: s */
    public C7566c f49218s = new C7566c();

    /* renamed from: t */
    public final C19348f f49219t = new C19348f();

    /* renamed from: u */
    public final C19341f f49220u = new C19341f(this, 0);

    /* renamed from: v */
    public Button f49221v;

    /* renamed from: w */
    public EditText f49222w;

    /* renamed from: x */
    public TextView f49223x;

    /* renamed from: y */
    public TextView f49224y;

    /* renamed from: z */
    public Spinner f49225z;

    /* renamed from: rv.g$a */
    public class C19343a extends C20438i<C13352j, C13353k> {
        public C19343a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13352j jVar = (C13352j) cVar;
            C19342g.this.mo46784S1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13352j jVar = (C13352j) cVar;
            C13353k kVar = (C13353k) gVar;
            Context context = C19342g.this.f49224y.getContext();
            ArrayList arrayList = new ArrayList(2);
            if (!((C17261e) context.getSystemService("user_profile_manager_service")).mo49805e().f44616o.f40615b) {
                arrayList.add(new C19040a(context, true));
            }
            arrayList.add(new C19041b(context, Boolean.TRUE, (Boolean) null, (Boolean) null));
            C17635b.m43779f(context).f50172b.mo42914c(arrayList, true);
            C19342g.this.mo51745p2(false);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C13352j jVar = (C13352j) cVar;
            C19342g gVar = C19342g.this;
            gVar.mo46795h2(C13751d.m34341b(gVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: rv.g$b */
    public class C19344b extends ClickableSpan {
        public C19344b() {
        }

        public final void onClick(View view) {
            C19342g gVar = C19342g.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.URI, C19342g.this.getString(R.string.wondo_terms_of_use_url));
            gVar.mo46797j2(aVar.mo49933a());
            C19342g.this.startActivity(WebViewActivity.m18168y2(view.getContext(), C19342g.this.getString(R.string.wondo_terms_of_use_url), C19342g.this.getString(R.string.wondo_consent_legal_terms_of_service)));
        }
    }

    /* renamed from: rv.g$c */
    public class C19345c extends ClickableSpan {
        public C19345c() {
        }

        public final void onClick(View view) {
            C19342g gVar = C19342g.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.URI, C19342g.this.getString(R.string.cobrand_wondo_terms_of_use_url));
            gVar.mo46797j2(aVar.mo49933a());
            C19342g.this.startActivity(WebViewActivity.m18168y2(view.getContext(), C19342g.this.getString(R.string.cobrand_wondo_terms_of_use_url), C19342g.this.getString(R.string.wondo_consent_legal_terms_of_service)));
        }
    }

    /* renamed from: rv.g$d */
    public class C19346d extends ClickableSpan {
        public C19346d() {
        }

        public final void onClick(View view) {
            C19342g gVar = C19342g.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_policy_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.URI, C19342g.this.getString(R.string.wondo_privacy_url));
            gVar.mo46797j2(aVar.mo49933a());
            C19342g.this.startActivity(WebViewActivity.m18168y2(view.getContext(), C19342g.this.getString(R.string.wondo_privacy_url), C19342g.this.getString(R.string.wondo_consent_legal_privacy_policy)));
        }
    }

    /* renamed from: rv.g$e */
    public class C19347e extends ClickableSpan {
        public C19347e() {
        }

        public final void onClick(View view) {
            C19342g gVar = C19342g.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_policy_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.URI, C19342g.this.getString(R.string.cobrand_wondo_privacy_url));
            gVar.mo46797j2(aVar.mo49933a());
            C19342g.this.startActivity(WebViewActivity.m18168y2(view.getContext(), C19342g.this.getString(R.string.cobrand_wondo_privacy_url), C19342g.this.getString(R.string.wondo_consent_legal_privacy_policy)));
        }
    }

    /* renamed from: rv.g$f */
    public class C19348f extends C17522a {
        public C19348f() {
        }

        public final void afterTextChanged(Editable editable) {
            C19342g gVar = C19342g.this;
            gVar.f49223x.setVisibility(4);
            if (gVar.getView() != null) {
                gVar.f49221v.setEnabled(!C20964s0.m49090h(gVar.f49222w.getText()));
            }
        }
    }

    /* renamed from: n2 */
    public final AnalyticsEventKey mo51743n2() {
        return AnalyticsEventKey.STEP_ENTER_PHONE;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        SpannableString spannableString;
        View inflate = layoutInflater.inflate(R.layout.ride_sharing_registration_step_enter_phone_fragment, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.accept_button);
        this.f49221v = button;
        button.setOnClickListener(new C4585c(this, 20));
        EditText editText = (EditText) inflate.findViewById(R.id.phone_input);
        this.f49222w = editText;
        editText.addTextChangedListener(this.f49219t);
        this.f49222w.setOnEditorActionListener(this.f49220u);
        this.f49223x = (TextView) inflate.findViewById(R.id.phone_input_error);
        String str = mo51742m2().f39391g;
        if (str != null) {
            this.f49222w.setText(str);
            this.f49222w.requestFocus();
        }
        this.f49222w.addTextChangedListener(this.f49218s);
        this.f49222w.setOnFocusChangeListener(new C19340e(this));
        Context context = inflate.getContext();
        C7565b bVar = new C7565b(context, C7568e.m17314d(context));
        Spinner spinner = (Spinner) inflate.findViewById(R.id.codes_spinner);
        this.f49225z = spinner;
        spinner.setAdapter(bVar);
        this.f49225z.setOnItemSelectedListener(new C19349h(this));
        RideSharingRegistrationInfo m2 = mo51742m2();
        Spinner spinner2 = this.f49225z;
        int i2 = m2.f39389e;
        if (i2 != -1) {
            i = C7568e.m17313c(i2, context);
        } else {
            i = C7568e.m17315e(context);
        }
        spinner2.setSelection(i);
        if (((C17261e) this.f40822c.getSystemService("user_profile_manager_service")).mo49805e().f44616o.f40615b) {
            String string = getString(R.string.wondo_consent_legal_terms_of_service);
            String string2 = getString(R.string.wondo_consent_legal_privacy_policy);
            String string3 = getString(R.string.ride_sharing_registration_gdpr_setting_1, string, string2);
            spannableString = new SpannableString(string3);
            int lastIndexOf = string3.lastIndexOf(string);
            if (lastIndexOf != -1) {
                spannableString.setSpan(this.f49214o, lastIndexOf, string.length() + lastIndexOf, 33);
            }
            int lastIndexOf2 = string3.lastIndexOf(string2);
            if (lastIndexOf2 != -1) {
                spannableString.setSpan(this.f49216q, lastIndexOf2, string2.length() + lastIndexOf2, 33);
            }
        } else {
            String string4 = getString(R.string.wondo_consent_legal_terms_of_service);
            String string5 = getString(R.string.wondo_consent_legal_privacy_policy);
            String string6 = getString(R.string.ride_sharing_registration_gdpr_cobrand_setting_1, string4, string5, string4, string5);
            spannableString = new SpannableString(string6);
            int indexOf = string6.indexOf(string4);
            if (indexOf != -1) {
                spannableString.setSpan(this.f49215p, indexOf, string4.length() + indexOf, 33);
            }
            int indexOf2 = string6.indexOf(string5);
            if (indexOf2 != -1) {
                spannableString.setSpan(this.f49217r, indexOf2, string5.length() + indexOf2, 33);
            }
            int lastIndexOf3 = string6.lastIndexOf(string4);
            if (lastIndexOf3 != -1) {
                spannableString.setSpan(this.f49214o, lastIndexOf3, string4.length() + lastIndexOf3, 33);
            }
            int lastIndexOf4 = string6.lastIndexOf(string5);
            if (lastIndexOf4 != -1) {
                spannableString.setSpan(this.f49216q, lastIndexOf4, string5.length() + lastIndexOf4, 33);
            }
        }
        TextView textView = (TextView) inflate.findViewById(R.id.legal);
        this.f49224y = textView;
        textView.setText(spannableString);
        this.f49224y.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getView() != null) {
            this.f49221v.setEnabled(!C20964s0.m49090h(this.f49222w.getText()));
        }
    }

    /* renamed from: r2 */
    public final void mo51752r2() {
        boolean z;
        Phonenumber$PhoneNumber h = C7568e.m17318h(this.f49222w.getText(), ((C7564a) this.f49225z.getSelectedItem()).f23054c);
        boolean z2 = false;
        if (h == null) {
            z = false;
        } else {
            z = PhoneNumberUtil.m36283j().mo43766s(h);
        }
        if (!z) {
            this.f49223x.setVisibility(0);
        } else {
            z2 = true;
        }
        if (z2) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "accept_clicked");
            mo46797j2(aVar.mo49933a());
            C7564a aVar2 = (C7564a) this.f49225z.getSelectedItem();
            String C = C20964s0.m49082C(this.f49222w.getText());
            RideSharingRegistrationInfo m2 = mo51742m2();
            m2.f39389e = aVar2.f23052a;
            m2.f39390f = aVar2.f23053b;
            m2.f39391g = C;
            m2.f39392h = C7568e.m17312b(C, aVar2.f23054c, PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
            this.f40822c.mo44540t2(R.string.ride_sharing_registration_requesting_verification_code);
            C13352j jVar = new C13352j(mo46783R1(), m2.f39390f, m2.f39391g);
            String O = jVar.mo40234O();
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            mo46793f2(O, jVar, L1, this.f49213n);
        }
    }
}
