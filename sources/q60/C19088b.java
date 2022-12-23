package q60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import c70.C13751d;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.steps.mot.payment.MotPangoInstructions;
import com.moovit.view.p340cc.C7963e;
import ga0.C12704f;
import h60.C17336m1;
import h60.C17339n1;
import p066e0.C4452q0;
import p242s1.C6333d0;
import p304x.C7099r1;
import p501fw.C17102a;
import p543hq.C17474b;
import p572iw.C17662e;
import p644lx.C18284b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import z20.C20806a;

/* renamed from: q60.b */
public class C19088b extends C15682c<PaymentRegistrationActivity> {

    /* renamed from: z */
    public static final /* synthetic */ int f48519z = 0;

    /* renamed from: n */
    public final C19089a f48520n = new C19089a();

    /* renamed from: o */
    public final C19090b f48521o = new C19090b();

    /* renamed from: p */
    public MotPangoInstructions f48522p;

    /* renamed from: q */
    public String f48523q;

    /* renamed from: r */
    public C12704f f48524r;

    /* renamed from: s */
    public MaterialCardView f48525s;

    /* renamed from: t */
    public RadioButton f48526t;

    /* renamed from: u */
    public EditText f48527u;

    /* renamed from: v */
    public View f48528v;

    /* renamed from: w */
    public MaterialCardView f48529w;

    /* renamed from: x */
    public ListItemView f48530x;

    /* renamed from: y */
    public Button f48531y;

    /* renamed from: q60.b$a */
    public class C19089a extends C20438i<C17336m1, C17339n1> {
        public C19089a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17336m1 m1Var = (C17336m1) cVar;
            C17339n1 n1Var = (C17339n1) gVar;
            C19088b.this.mo46784S1();
            C19088b bVar = C19088b.this;
            bVar.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SET_PANGO_CARD_RESULT);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            bVar.mo46797j2(aVar.mo49933a());
            C20806a.C20807a aVar2 = new C20806a.C20807a("payment_method_tap");
            aVar2.mo52934b("mot", "feature");
            aVar2.mo52934b(bVar.f48523q, "payment_context");
            aVar2.mo52935c();
            C12704f fVar = bVar.f48524r;
            if (!(fVar == null || fVar.getDialog() == null)) {
                bVar.f48524r.mo39495T1();
            }
            View view = bVar.getView();
            if (view == null) {
                Toast.makeText(bVar.getContext(), C25754i.payment_registration_payment_method_success_message, 1).show();
                bVar.mo46786U1(C19091c.class, new C4452q0(15));
                return;
            }
            view.postDelayed(new C7099r1(bVar, 13), 2000);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17336m1 m1Var = (C17336m1) cVar;
            C19088b bVar = C19088b.this;
            int i = C19088b.f48519z;
            bVar.mo46784S1();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SET_PANGO_CARD_RESULT);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
            aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
            bVar.mo46797j2(aVar.mo49933a());
            bVar.mo46795h2(C13751d.m34341b(bVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: q60.b$b */
    public class C19090b implements Runnable {
        public C19090b() {
        }

        public final void run() {
            if (C19088b.this.f48526t.isChecked()) {
                UiUtils.m40239G(C19088b.this.f48527u);
            } else if (C19088b.this.f48530x.isChecked()) {
                UiUtils.m40252k(C19088b.this.f48527u);
            }
        }
    }

    /* renamed from: q60.b$c */
    public interface C19091c {
        /* renamed from: i0 */
        void mo51523i0();

        /* renamed from: p1 */
        void mo51524p1();
    }

    static {
        Class<C19088b> cls = C19088b.class;
    }

    public C19088b() {
        super(PaymentRegistrationActivity.class);
    }

    /* renamed from: m2 */
    public final void mo51520m2(CharSequence charSequence) {
        this.f48531y.setEnabled((this.f48526t.isChecked() && C7963e.m18150a(charSequence)) || this.f48530x.isChecked());
    }

    /* renamed from: n2 */
    public final void mo51521n2(boolean z) {
        int i;
        this.f48525s.setActivated(z);
        this.f48526t.setChecked(z);
        View view = this.f48528v;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        boolean z2 = !z;
        this.f48529w.setActivated(z2);
        this.f48530x.setChecked(z2);
        this.f48530x.setActivated(z2);
        this.f48527u.postDelayed(this.f48521o, 100);
        mo51520m2(this.f48527u.getText());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f48522p = (MotPangoInstructions) arguments.getParcelable("pangoInstructions");
            this.f48523q = arguments.getString("paymentContext");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_step_mot_payment_method_pango_fragment, viewGroup, false);
        C6333d0.m15030r(inflate.findViewById(C25750e.title), true);
        this.f48524r = (C12704f) getChildFragmentManager().mo3923A(C12704f.f31376m);
        if (this.f48522p != null) {
            MaterialCardView materialCardView = (MaterialCardView) inflate.findViewById(C25750e.pango_card_view);
            this.f48525s = materialCardView;
            materialCardView.setOnClickListener(new C17102a(this, 22));
            ((FormatTextView) this.f48525s.findViewById(C25750e.pango_credit_card_details)).setArguments(this.f48522p.f42819b.f24083c);
            this.f48526t = (RadioButton) this.f48525s.findViewById(C25750e.pango_button);
            EditText editText = ((TextInputLayout) inflate.findViewById(C25750e.cvv)).getEditText();
            this.f48527u = editText;
            editText.addTextChangedListener(new C19092c(this));
            this.f48528v = this.f48525s.findViewById(C25750e.cvv_group);
        }
        this.f48529w = (MaterialCardView) inflate.findViewById(C25750e.credit_card_view);
        ListItemView listItemView = (ListItemView) inflate.findViewById(C25750e.credit_card_content);
        this.f48530x = listItemView;
        listItemView.setOnClickListener(new C17662e(this, 10));
        Button button = (Button) inflate.findViewById(C25750e.button);
        this.f48531y = button;
        button.setOnClickListener(new C18284b(this, 11));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "substep_pango_payment_method_impression");
        mo46797j2(aVar.mo49933a());
        C20806a.C20807a aVar2 = new C20806a.C20807a("payment_method_view");
        aVar2.mo52934b("mot", "feature");
        aVar2.mo52934b(this.f48523q, "payment_context");
        MarketingEventImpressionBinder.m41586a(this, aVar2.mo52933a());
    }
}
