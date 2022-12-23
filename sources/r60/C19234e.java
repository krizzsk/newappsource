package r60;

import a00.C13382a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b00.C13556a;
import c70.C13751d;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.Color;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.PinCodeView;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import h60.C17299a0;
import h60.C17321h1;
import h60.C17324i1;
import h60.C17347q0;
import h60.C17350r0;
import h60.C17373z;
import i60.C17559a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p054d0.C4314v;
import p242s1.C6333d0;
import p543hq.C17474b;
import p572iw.C17662e;
import p644lx.C18284b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: r60.e */
public class C19234e extends C15682c<PaymentRegistrationActivity> implements PinCodeView.C15865b {

    /* renamed from: G */
    public static final Pattern f48842G = Pattern.compile("\\s[0-9]{4}\\s");

    /* renamed from: A */
    public FormatTextView f48843A;

    /* renamed from: B */
    public Button f48844B;

    /* renamed from: C */
    public FormatTextView f48845C;

    /* renamed from: D */
    public PinCodeView f48846D;

    /* renamed from: E */
    public CountDownTimer f48847E;

    /* renamed from: F */
    public C13556a f48848F = null;

    /* renamed from: n */
    public final C19235a f48849n = new C19235a();

    /* renamed from: o */
    public final C19236b f48850o = new C19236b();

    /* renamed from: p */
    public final C19237c f48851p = new C19237c();

    /* renamed from: q */
    public final C19238d f48852q = new C19238d();

    /* renamed from: r */
    public final C19239e f48853r = new C19239e();

    /* renamed from: s */
    public String f48854s;

    /* renamed from: t */
    public String f48855t;

    /* renamed from: u */
    public String f48856u;

    /* renamed from: v */
    public String f48857v;

    /* renamed from: w */
    public Button f48858w;

    /* renamed from: x */
    public ColorStateList f48859x;

    /* renamed from: y */
    public ProgressBar f48860y;

    /* renamed from: z */
    public TextView f48861z;

    /* renamed from: r60.e$a */
    public class C19235a extends C20438i<C17321h1, C17324i1> {
        public C19235a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17321h1 h1Var = (C17321h1) cVar;
            C17324i1 i1Var = (C17324i1) gVar;
            C19234e eVar = C19234e.this;
            Pattern pattern = C19234e.f48842G;
            eVar.mo51653m2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19234e.this.mo46795h2(C13751d.m34341b(((C17321h1) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: r60.e$b */
    public class C19236b extends C20438i<C17373z, C17299a0> {
        public C19236b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17373z zVar = (C17373z) cVar;
            C17299a0 a0Var = (C17299a0) gVar;
            C19234e eVar = C19234e.this;
            Pattern pattern = C19234e.f48842G;
            eVar.mo51653m2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19234e.this.mo46795h2(C13751d.m34341b(((C17373z) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    /* renamed from: r60.e$c */
    public class C19237c extends C20438i<C17347q0, C17350r0> {
        public C19237c() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17347q0 q0Var = (C17347q0) cVar;
            C19234e eVar = C19234e.this;
            eVar.f48848F = null;
            eVar.f48858w.setClickable(true);
            if (eVar.f48860y != null) {
                eVar.f48858w.setTextColor(eVar.f48859x);
                eVar.f48860y.setVisibility(4);
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17347q0 q0Var = (C17347q0) cVar;
            C17350r0 r0Var = (C17350r0) gVar;
            C19234e eVar = C19234e.this;
            Pattern pattern = C19234e.f48842G;
            eVar.getClass();
            C17559a aVar = r0Var.f44738n;
            if (!r0Var.f44737m || aVar.f45167c) {
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.PHONE_CODE_VERIFIED);
                aVar2.mo49939g(AnalyticsAttributeKey.ID, aVar.f45166b);
                aVar2.mo49941i(AnalyticsAttributeKey.IS_MIGRATED_USER, aVar.f45167c);
                eVar.mo46797j2(aVar2.mo49933a());
                eVar.mo46786U1(C19243h.class, new C4314v(aVar, 17));
                return;
            }
            new C19242g().show(eVar.getChildFragmentManager(), "PaymentRegistrationSwitchDeviceDialog");
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            int i;
            C17347q0 q0Var = (C17347q0) cVar;
            C19234e eVar = C19234e.this;
            Pattern pattern = C19234e.f48842G;
            eVar.getClass();
            int i2 = C13751d.f33851b;
            if (exc instanceof UserRequestError) {
                UserRequestError userRequestError = (UserRequestError) exc;
                i = userRequestError.mo49160b();
                eVar.f48861z.setVisibility(0);
                eVar.f48861z.setText(userRequestError.mo49159a());
                TextView textView = eVar.f48861z;
                C13382a.m33665a(textView, textView.getText());
                eVar.f48858w.setEnabled(false);
            } else {
                eVar.mo46795h2(C13751d.m34341b(eVar.requireContext(), (String) null, exc));
                i = -1;
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "phone_code_verification_failed");
            aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, i);
            eVar.mo46797j2(aVar.mo49933a());
            return true;
        }
    }

    /* renamed from: r60.e$d */
    public class C19238d extends BroadcastReceiver {
        public C19238d() {
        }

        public final void onReceive(Context context, Intent intent) {
            Status status;
            String stringExtra;
            if (C19234e.this.f48846D != null && SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction()) && (status = (Status) intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) != null && status.getStatusCode() == 0 && (stringExtra = intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)) != null) {
                Matcher matcher = C19234e.f48842G.matcher(stringExtra);
                if (matcher.find()) {
                    String trim = stringExtra.substring(matcher.start(), matcher.end()).trim();
                    if (trim.length() == 4) {
                        C19234e.this.f48846D.setPinCode(trim);
                    }
                }
            }
        }
    }

    /* renamed from: r60.e$e */
    public class C19239e implements Runnable {
        public C19239e() {
        }

        public final void run() {
            C19234e.this.f48845C.setVisibility(0);
        }
    }

    /* renamed from: r60.e$f */
    public class C19240f extends CountDownTimer {
        public C19240f() {
            super(20000, 1000);
        }

        public final void onFinish() {
            C19234e.this.f48843A.setVisibility(4);
            C19234e.this.f48844B.setVisibility(0);
        }

        public final void onTick(long j) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
            C19234e.this.f48843A.setArguments(String.format(Locale.getDefault(), "%02d:%02d", new Object[]{0, Long.valueOf(seconds)}));
        }
    }

    public C19234e() {
        super(PaymentRegistrationActivity.class);
    }

    /* renamed from: j */
    public final void mo23547j(String str, boolean z) {
        if (z) {
            mo51654n2(str, false);
        }
    }

    /* renamed from: m2 */
    public final void mo51653m2() {
        CountDownTimer countDownTimer = this.f48847E;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f48847E = null;
        }
        this.f48843A.setVisibility(0);
        this.f48844B.setVisibility(4);
        this.f48847E = new C19240f().start();
    }

    /* renamed from: n2 */
    public final void mo51654n2(String str, boolean z) {
        if (this.f48848F == null && this.f40824e) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "phone_code");
            mo46797j2(aVar.mo49933a());
            this.f48858w.setClickable(false);
            if (this.f48860y != null) {
                this.f48858w.setTextColor(Color.f41004h.f41007b);
                this.f48860y.setVisibility(0);
            }
            C17347q0 q0Var = new C17347q0(mo46783R1(), this.f48854s, str, z);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C17347q0.class, sb, "_");
            sb.append(q0Var.f44731w);
            sb.append(q0Var.f44732x);
            sb.append(q0Var.f44733y);
            String sb2 = sb.toString();
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            this.f48848F = mo46793f2(sb2, q0Var, L1, this.f48851p);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f48854s = Q1.getString("paymentContext");
        this.f48855t = Q1.getString("callingCode");
        this.f48856u = Q1.getString("phoneNumber");
        this.f48857v = Q1.getString("fullPhoneNumber");
        if (this.f48854s == null || this.f48856u == null) {
            throw new IllegalStateException("Did you use PaymentRegistrationPhoneVerificationFragment.newInstance(...)?");
        }
        Context context = getContext();
        if (context != null) {
            context.registerReceiver(this.f48852q, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION));
            SmsRetriever.getClient(context).startSmsRetriever().addOnCompleteListener(new C19233d());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_phone_validation_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        Context context = getContext();
        if (context != null) {
            context.unregisterReceiver(this.f48852q);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f48845C.removeCallbacks(this.f48853r);
    }

    public final void onPause() {
        super.onPause();
        CountDownTimer countDownTimer = this.f48847E;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f48847E = null;
        }
    }

    public final void onResume() {
        super.onResume();
        if (C13382a.m33671g(this.f48846D.getContext())) {
            this.f48846D.requestFocus();
        }
        if (this.f48844B.getVisibility() != 0) {
            mo51653m2();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = true;
        C6333d0.m15030r(view.findViewById(C25750e.title), true);
        ((FormatTextView) view.findViewById(C25750e.subtitle)).setArguments(this.f48856u);
        PinCodeView pinCodeView = (PinCodeView) view.findViewById(C25750e.pin_code);
        this.f48846D = pinCodeView;
        pinCodeView.setListener(this);
        this.f48861z = (TextView) view.findViewById(C25750e.error);
        this.f48843A = (FormatTextView) view.findViewById(C25750e.resend_counter);
        Button button = (Button) view.findViewById(C25750e.resend_button);
        this.f48844B = button;
        button.setOnClickListener(new C18284b(this, 12));
        this.f48845C = (FormatTextView) view.findViewById(C25750e.feedback);
        Intent intent = ((PaymentRegistrationActivity) this.f40822c).f42741Y;
        if (intent != null) {
            String string = getString(C25754i.payment_registration_validate_phone_number_feedback_action);
            this.f48845C.setMovementMethod(LinkMovementMethod.getInstance());
            this.f48845C.setArguments(string);
            C20964s0.m49104v(this.f48845C, string, new C19241f(this, intent), new Object[0]);
        }
        Button button2 = (Button) view.findViewById(C25750e.button);
        this.f48858w = button2;
        button2.setOnClickListener(new C17662e(this, 11));
        this.f48859x = this.f48858w.getTextColors();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C25750e.container);
        LayoutInflater.from(view.getContext()).inflate(C25751f.payment_registration_step_progress_bar, constraintLayout, true);
        ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(C25750e.progress_bar);
        this.f48860y = progressBar;
        progressBar.setIndeterminateTintList(this.f48858w.getTextColors());
        if (((PaymentRegistrationActivity) this.f40822c).f42741Y == null) {
            z = false;
        }
        if (z) {
            this.f48845C.postDelayed(this.f48853r, 30000);
        }
    }

    /* renamed from: v */
    public final void mo23549v(String str, boolean z) {
        this.f48861z.setVisibility(4);
        this.f48858w.setEnabled(z);
        if (z) {
            mo51654n2(str, false);
        }
    }
}
