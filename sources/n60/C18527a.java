package n60;

import a00.C13382a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b00.C13556a;
import c70.C13751d;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.Color;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.PinCodeView;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import h60.C17317g0;
import h60.C17320h0;
import h60.C17323i0;
import h60.C17326j0;
import java.util.concurrent.TimeUnit;
import p242s1.C6333d0;
import p304x.C7071l0;
import p543hq.C17474b;
import p572iw.C17662e;
import p783rw.C19370b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import r60.C19243h;
import v40.C25748c;
import v40.C25750e;
import v40.C25751f;
import v40.C25753h;

/* renamed from: n60.a */
public class C18527a extends C15682c<PaymentRegistrationActivity> implements PinCodeView.C15865b {

    /* renamed from: A */
    public static final /* synthetic */ int f47157A = 0;

    /* renamed from: n */
    public final C18528a f47158n = new C18528a();

    /* renamed from: o */
    public final C18529b f47159o = new C18529b();

    /* renamed from: p */
    public String f47160p;

    /* renamed from: q */
    public String f47161q;

    /* renamed from: r */
    public Button f47162r;

    /* renamed from: s */
    public ColorStateList f47163s;

    /* renamed from: t */
    public ProgressBar f47164t;

    /* renamed from: u */
    public TextView f47165u;

    /* renamed from: v */
    public FormatTextView f47166v;

    /* renamed from: w */
    public Button f47167w;

    /* renamed from: x */
    public PinCodeView f47168x;

    /* renamed from: y */
    public CountDownTimer f47169y;

    /* renamed from: z */
    public C13556a f47170z = null;

    /* renamed from: n60.a$a */
    public class C18528a extends C20438i<C17323i0, C17326j0> {
        public C18528a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17323i0 i0Var = (C17323i0) cVar;
            C17326j0 j0Var = (C17326j0) gVar;
            C18527a aVar = C18527a.this;
            int i = C18527a.f47157A;
            aVar.mo50931m2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18527a.this.mo46795h2(C13751d.m34341b(((C17323i0) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: n60.a$b */
    public class C18529b extends C20438i<C17317g0, C17320h0> {
        public C18529b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17317g0 g0Var = (C17317g0) cVar;
            C18527a aVar = C18527a.this;
            aVar.f47170z = null;
            aVar.f47162r.setClickable(true);
            if (aVar.f47164t != null) {
                aVar.f47162r.setTextColor(aVar.f47163s);
                aVar.f47164t.setVisibility(4);
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17317g0 g0Var = (C17317g0) cVar;
            C18527a aVar = C18527a.this;
            int i = C18527a.f47157A;
            aVar.getClass();
            aVar.mo46797j2(new C17474b.C17475a(AnalyticsEventKey.EMAIL_AUTH_VERIFIED).mo49933a());
            aVar.mo46786U1(C19243h.class, new C7071l0((C17320h0) gVar, 16));
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17317g0 g0Var = (C17317g0) cVar;
            C18527a aVar = C18527a.this;
            int i = C18527a.f47157A;
            aVar.getClass();
            int d = C13751d.m34343d(exc);
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "email_code_verification_failed");
            aVar2.mo49935c(AnalyticsAttributeKey.ERROR_CODE, d);
            aVar.mo46797j2(aVar2.mo49933a());
            if (!(exc instanceof UserRequestError)) {
                aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), (String) null, exc));
            } else {
                UserRequestError userRequestError = (UserRequestError) exc;
                if (d == 43102) {
                    aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), aVar.getTag(), exc));
                } else {
                    aVar.f47165u.setVisibility(0);
                    aVar.f47165u.setText(userRequestError.mo49159a());
                    TextView textView = aVar.f47165u;
                    C13382a.m33665a(textView, textView.getText());
                    aVar.f47162r.setEnabled(false);
                }
            }
            return true;
        }
    }

    /* renamed from: n60.a$c */
    public class C18530c extends CountDownTimer {
        public C18530c() {
            super(60000, 1000);
        }

        public final void onFinish() {
            C18527a.this.f47166v.setVisibility(4);
            C18527a.this.f47167w.setVisibility(0);
        }

        public final void onTick(long j) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
            C18527a aVar = C18527a.this;
            FormatTextView formatTextView = aVar.f47166v;
            Context requireContext = aVar.requireContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(requireContext.getResources().getQuantityString(C25753h.unit_seconds, seconds, new Object[]{Integer.valueOf(seconds)}));
            spannableStringBuilder.setSpan(C20964s0.m49084b(requireContext, C25748c.textAppearanceBodySmallStrong, C25748c.colorOnSurface), 0, spannableStringBuilder.length(), 33);
            formatTextView.setSpannedArguments(spannableStringBuilder);
        }
    }

    public C18527a() {
        super(PaymentRegistrationActivity.class);
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if (bundle.getInt("errorCode", -1) == 43102) {
            requireActivity().getSupportFragmentManager().mo3936Q();
        }
    }

    /* renamed from: j */
    public final void mo23547j(String str, boolean z) {
        if (z) {
            mo50932n2(str);
        }
    }

    /* renamed from: m2 */
    public final void mo50931m2() {
        CountDownTimer countDownTimer = this.f47169y;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f47169y = null;
        }
        this.f47166v.setVisibility(0);
        this.f47167w.setVisibility(4);
        this.f47169y = new C18530c().start();
    }

    /* renamed from: n2 */
    public final void mo50932n2(String str) {
        if (this.f47170z == null && this.f40824e) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "email_code");
            mo46797j2(aVar.mo49933a());
            this.f47162r.setClickable(false);
            if (this.f47164t != null) {
                this.f47162r.setTextColor(Color.f41004h.f41007b);
                this.f47164t.setVisibility(0);
            }
            C17317g0 g0Var = new C17317g0(mo46783R1(), this.f47160p, str);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C17317g0.class, sb, "_");
            sb.append(g0Var.f44703w);
            sb.append(g0Var.f44704x);
            String sb2 = sb.toString();
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            this.f47170z = mo46793f2(sb2, g0Var, L1, this.f47159o);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f47160p = Q1.getString("paymentContext");
        String string = Q1.getString("email");
        this.f47161q = string;
        if (this.f47160p == null || string == null) {
            throw new IllegalStateException("Did you use PaymentRegistrationEmailCodeVerificationFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_email_validation_fragment, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        CountDownTimer countDownTimer = this.f47169y;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f47169y = null;
        }
    }

    public final void onResume() {
        super.onResume();
        this.f47168x.requestFocus();
        if (this.f47167w.getVisibility() != 0) {
            mo50931m2();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C6333d0.m15030r(view.findViewById(C25750e.title), true);
        PinCodeView pinCodeView = (PinCodeView) view.findViewById(C25750e.pin_code);
        this.f47168x = pinCodeView;
        pinCodeView.setListener(this);
        this.f47165u = (TextView) view.findViewById(C25750e.error);
        this.f47166v = (FormatTextView) view.findViewById(C25750e.resend_counter);
        Button button = (Button) view.findViewById(C25750e.resend_button);
        this.f47167w = button;
        button.setOnClickListener(new C17662e(this, 9));
        Button button2 = (Button) view.findViewById(C25750e.button);
        this.f47162r = button2;
        button2.setOnClickListener(new C19370b(this, 14));
        this.f47163s = this.f47162r.getTextColors();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C25750e.container);
        LayoutInflater.from(view.getContext()).inflate(C25751f.payment_registration_step_progress_bar, constraintLayout, true);
        ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(C25750e.progress_bar);
        this.f47164t = progressBar;
        progressBar.setIndeterminateTintList(this.f47162r.getTextColors());
    }

    /* renamed from: v */
    public final void mo23549v(String str, boolean z) {
        this.f47165u.setVisibility(4);
        this.f47162r.setEnabled(z);
        if (z) {
            mo50932n2(str);
        }
    }
}
