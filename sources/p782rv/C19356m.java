package p782rv;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.taxi.MVSourceFeature;
import i00.C17522a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p073e7.C4584b;
import p259t5.C6592b;
import p297w5.C6996c;
import p527gy.C17261e;
import p543hq.C17474b;
import p881vy.C20257j;
import p881vy.C20258k;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20941h;
import p977zz.C20964s0;
import z90.C13346d;
import z90.C13347e;
import z90.C13352j;
import z90.C13353k;

/* renamed from: rv.m */
public class C19356m extends C19332a {

    /* renamed from: B */
    public static final /* synthetic */ int f49247B = 0;

    /* renamed from: A */
    public CountDownTimer f49248A;

    /* renamed from: n */
    public final C19357a f49249n = new C19357a();

    /* renamed from: o */
    public final C19358b f49250o = new C19358b();

    /* renamed from: p */
    public final C19359c f49251p = new C19359c();

    /* renamed from: q */
    public final C19360d f49252q = new C19360d();

    /* renamed from: r */
    public final C19361e f49253r = new C19361e();

    /* renamed from: s */
    public final C19354k f49254s = new C19354k(this);

    /* renamed from: t */
    public final C19355l f49255t = new C19355l(this);

    /* renamed from: u */
    public boolean f49256u;

    /* renamed from: v */
    public View f49257v;

    /* renamed from: w */
    public TextView f49258w;

    /* renamed from: x */
    public FormatTextView f49259x;

    /* renamed from: y */
    public Button f49260y;

    /* renamed from: z */
    public ViewGroup f49261z;

    /* renamed from: rv.m$a */
    public class C19357a extends C20438i<C13346d, C13347e> {
        public C19357a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13346d dVar = (C13346d) cVar;
            C19356m mVar = C19356m.this;
            boolean z = ((C13347e) gVar).f33136m;
            int i = C19356m.f49247B;
            RideSharingRegistrationInfo m2 = mVar.mo51742m2();
            m2.f39393i = z;
            if (!z) {
                C20257j jVar = new C20257j(mVar.mo46783R1(), RideSharingRegistrationActivity.f39377m0.mo19759a(((RideSharingRegistrationActivity) mVar.f40822c).getSharedPreferences("ride_sharing_registration", 0)), m2.f39388d);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C20257j.class, sb, "_");
                sb.append(jVar.f51363w);
                sb.append("_");
                sb.append(jVar.f51364x);
                String sb2 = sb.toString();
                RequestOptions L1 = mVar.mo46777L1();
                L1.f42909f = true;
                mVar.mo46793f2(sb2, jVar, L1, mVar.f49250o);
                return;
            }
            mVar.mo51766t2((WondoFullScreenDisplayInfo) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C13346d dVar = (C13346d) cVar;
            C19356m.this.mo46784S1();
            if (exc instanceof UserRequestError) {
                C19356m mVar = C19356m.this;
                String c = ((UserRequestError) exc).mo49161c();
                mVar.f49258w.setVisibility(0);
                mVar.f49258w.setText(c);
                mVar.mo51767u2(R.attr.colorError);
                mVar.f49257v.setEnabled(false);
                return true;
            }
            C19356m mVar2 = C19356m.this;
            String string = mVar2.getString(R.string.general_error_title);
            mVar2.f49258w.setVisibility(0);
            mVar2.f49258w.setText(string);
            mVar2.mo51767u2(R.attr.colorError);
            mVar2.f49257v.setEnabled(false);
            return true;
        }
    }

    /* renamed from: rv.m$b */
    public class C19358b extends C20438i<C20257j, C20258k> {
        public C19358b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20257j jVar = (C20257j) cVar;
            C19356m mVar = C19356m.this;
            WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo = ((C20258k) gVar).f51365m;
            int i = C19356m.f49247B;
            mVar.mo51766t2(wondoFullScreenDisplayInfo);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C20257j jVar = (C20257j) cVar;
            C19356m mVar = C19356m.this;
            int i = C19356m.f49247B;
            mVar.mo51766t2((WondoFullScreenDisplayInfo) null);
            return true;
        }
    }

    /* renamed from: rv.m$c */
    public class C19359c extends C20438i<C13352j, C13353k> {
        public C19359c() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13352j jVar = (C13352j) cVar;
            C19356m.this.mo46784S1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13352j jVar = (C13352j) cVar;
            C13353k kVar = (C13353k) gVar;
            C19356m mVar = C19356m.this;
            int i = C19356m.f49247B;
            mVar.mo51768v2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C13352j jVar = (C13352j) cVar;
            C19356m mVar = C19356m.this;
            mVar.mo46795h2(C13751d.m34341b(mVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: rv.m$d */
    public class C19360d implements View.OnFocusChangeListener {
        public C19360d() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && !C19356m.this.f49256u) {
                UiUtils.m40240H(view.getContext());
                C19356m.this.f49256u = true;
            }
        }
    }

    /* renamed from: rv.m$e */
    public class C19361e extends C17522a {
        public C19361e() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            C19356m mVar = C19356m.this;
            int i4 = C19356m.f49247B;
            int i5 = 0;
            if (mVar.mo51764r2().length() >= 4) {
                z = true;
            } else {
                z = false;
            }
            mVar.f49257v.setEnabled(z);
            mVar.f49258w.setVisibility(8);
            mVar.mo51767u2(R.attr.colorOnSurface);
            while (i5 < mVar.f49261z.getChildCount()) {
                View childAt = mVar.f49261z.getChildAt(i5);
                if (!(childAt instanceof EditText) || !childAt.hasFocus() || C20964s0.m49090h(((EditText) childAt).getText()) || i5 == mVar.f49261z.getChildCount() - 1) {
                    i5++;
                } else {
                    mVar.f49261z.getChildAt(i5 + 1).requestFocus();
                    return;
                }
            }
        }
    }

    /* renamed from: rv.m$f */
    public class C19362f extends CountDownTimer {
        public C19362f() {
            super(20000, 1000);
        }

        public final void onFinish() {
            C19356m.this.f49259x.setVisibility(4);
            C19356m.this.f49260y.setVisibility(0);
        }

        public final void onTick(long j) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
            C19356m.this.f49259x.setArguments(String.format(Locale.getDefault(), "%02d:%02d", new Object[]{0, Long.valueOf(seconds)}));
        }
    }

    /* renamed from: n2 */
    public final AnalyticsEventKey mo51743n2() {
        return AnalyticsEventKey.STEP_VALIDATE_PHONE;
    }

    public final boolean onBackPressed() {
        mo51744o2();
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ride_sharing_registration_step_phone_validation_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.continue_button);
        this.f49257v = findViewById;
        findViewById.setOnClickListener(new C4584b(this, 22));
        this.f49258w = (TextView) inflate.findViewById(R.id.error);
        this.f49261z = (ViewGroup) inflate.findViewById(R.id.digits);
        for (int i = 0; i < this.f49261z.getChildCount(); i++) {
            View childAt = this.f49261z.getChildAt(i);
            if (childAt instanceof EditText) {
                EditText editText = (EditText) childAt;
                editText.setOnFocusChangeListener(this.f49252q);
                editText.addTextChangedListener(this.f49253r);
                editText.setOnEditorActionListener(this.f49254s);
                editText.setOnKeyListener(this.f49255t);
            }
        }
        RideSharingRegistrationInfo m2 = mo51742m2();
        String string = getString(R.string.ride_sharing_registration_verification_code_subtitle, m2.f39392h);
        int indexOf = string.indexOf(m2.f39392h);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(C20941h.m49043f(16842907, inflate.getContext())), indexOf, m2.f39392h.length() + indexOf, 33);
        TextView textView = (TextView) inflate.findViewById(R.id.subtitle);
        textView.setText(spannableString);
        textView.setOnClickListener(new C6592b(this, 25));
        this.f49259x = (FormatTextView) inflate.findViewById(R.id.resend_counter);
        Button button = (Button) inflate.findViewById(R.id.resend_button);
        this.f49260y = button;
        button.setOnClickListener(new C6996c(this, 27));
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        CountDownTimer countDownTimer = this.f49248A;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f49248A = null;
        }
    }

    public final void onResume() {
        super.onResume();
        int i = 0;
        while (true) {
            if (i >= this.f49261z.getChildCount()) {
                break;
            }
            View childAt = this.f49261z.getChildAt(i);
            if (childAt instanceof EditText) {
                childAt.requestFocus();
                break;
            }
            i++;
        }
        if (this.f49260y.getVisibility() != 0) {
            mo51768v2();
        }
    }

    /* renamed from: r2 */
    public final String mo51764r2() {
        String C;
        StringBuilder sb = new StringBuilder(4);
        for (int i = 0; i < this.f49261z.getChildCount(); i++) {
            View childAt = this.f49261z.getChildAt(i);
            if ((childAt instanceof EditText) && (C = C20964s0.m49082C(((EditText) childAt).getText())) != null) {
                sb.append(C);
            }
        }
        return sb.toString();
    }

    /* renamed from: s2 */
    public final void mo51765s2() {
        String r2 = mo51764r2();
        if (r2.length() >= 4) {
            this.f40822c.mo44540t2(R.string.ride_sharing_registration_verifying_code);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "validate_phone_continue_clicked");
            mo46797j2(aVar.mo49933a());
            C13346d dVar = new C13346d(mo46783R1(), r2, MVSourceFeature.RIDE_SHARING);
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            mo46793f2("resend_verification_code", dVar, L1, this.f49249n);
        }
    }

    /* renamed from: t2 */
    public final void mo51766t2(WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo) {
        mo46784S1();
        mo51742m2().f39394j = wondoFullScreenDisplayInfo;
        ((C17261e) ((RideSharingRegistrationActivity) this.f40822c).getSystemService("user_profile_manager_service")).mo49806i();
        mo51745p2(true);
    }

    /* renamed from: u2 */
    public final void mo51767u2(int i) {
        int f = C20941h.m49043f(i, this.f49261z.getContext());
        for (int i2 = 0; i2 < this.f49261z.getChildCount(); i2++) {
            View childAt = this.f49261z.getChildAt(i2);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(f);
            }
        }
    }

    /* renamed from: v2 */
    public final void mo51768v2() {
        CountDownTimer countDownTimer = this.f49248A;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f49248A = null;
        }
        this.f49259x.setVisibility(0);
        this.f49260y.setVisibility(4);
        this.f49248A = new C19362f().start();
    }
}
