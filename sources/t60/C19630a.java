package t60;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c00.C13723g;
import com.google.android.gms.common.Scopes;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.C15053i;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationSpec;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0114n;
import p242s1.C6333d0;
import p373au.C13533e;
import p543hq.C17474b;
import p572iw.C17662e;
import p684nq.C18583d;
import p783rw.C19370b;
import p810sz.C19617r;
import s60.C19440e;
import t60.C19634d;
import t60.C19637f;
import v40.C25750e;
import v40.C25751f;
import w40.C25765g;

/* renamed from: t60.a */
public class C19630a extends C15682c<PaymentRegistrationActivity> implements C19634d.C19635a, C19637f.C19638a, C19440e.C19441a {

    /* renamed from: u */
    public static final /* synthetic */ int f49807u = 0;

    /* renamed from: n */
    public PaymentProfile f49808n;

    /* renamed from: o */
    public boolean f49809o;

    /* renamed from: p */
    public Button f49810p;

    /* renamed from: q */
    public ColorStateList f49811q;

    /* renamed from: r */
    public TextView f49812r;

    /* renamed from: s */
    public ProgressBar f49813s;

    /* renamed from: t */
    public boolean f49814t;

    /* renamed from: t60.a$a */
    public interface C19631a {
        /* renamed from: l */
        void mo51845l(List<ProfileCertificateData> list);

        /* renamed from: p0 */
        void mo51846p0(List<ProfileCertificateData> list);

        /* renamed from: z1 */
        void mo51849z1();
    }

    static {
        Class<C19630a> cls = C19630a.class;
    }

    public C19630a() {
        super(PaymentRegistrationActivity.class);
    }

    /* renamed from: A0 */
    public final void mo51972A0() {
        mo46786U1(C19631a.class, new C0114n(18));
        FragmentManager childFragmentManager = getChildFragmentManager();
        C19617r rVar = C25765g.f64279a;
        for (Fragment next : childFragmentManager.mo3930H()) {
            if (next instanceof C19634d) {
                ((C19634d) next).mo51976B1();
            }
        }
        this.f49810p.setEnabled(false);
        this.f49814t = true;
        ((PaymentRegistrationActivity) this.f40822c).onBackPressed();
    }

    /* renamed from: P */
    public final void mo51973P(ProfileCertificateData profileCertificateData) {
        this.f49810p.setEnabled(C25765g.m64313a(getChildFragmentManager()));
        mo51975m2();
    }

    /* renamed from: S */
    public final void mo51974S() {
        this.f49810p.setEnabled(C25765g.m64313a(getChildFragmentManager()));
        mo51975m2();
    }

    /* renamed from: f0 */
    public final void mo51853f0() {
        mo46786U1(C19631a.class, new C13533e(C25765g.m64314b(getChildFragmentManager()), 15));
    }

    /* renamed from: m2 */
    public final void mo51975m2() {
        if (C25765g.m64313a(getChildFragmentManager()) || !this.f49809o) {
            this.f49812r.setVisibility(8);
            this.f49812r.setClickable(false);
            return;
        }
        this.f49812r.setVisibility(0);
        this.f49812r.setClickable(true);
        this.f49812r.setOnClickListener(new C19370b(this, 16));
    }

    public final boolean onBackPressed() {
        boolean z;
        if (this.f49814t) {
            this.f49814t = false;
            return false;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C19617r rVar = C25765g.f64279a;
        ArrayList<T> c = C13723g.m34282c(childFragmentManager.mo3930H(), new C18583d(7));
        if (C13717b.m34258e(c)) {
            z = false;
        } else {
            z = C13723g.m34280a(c, new C15053i(6));
        }
        if (z) {
            new C19637f().show(getChildFragmentManager(), "VerificationsDismissalDialog");
            return true;
        }
        mo46786U1(C19631a.class, new C0114n(18));
        return false;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f49808n = (PaymentProfile) Q1.getParcelable(Scopes.PROFILE);
        this.f49809o = Q1.getBoolean("skip");
        if (this.f49808n == null) {
            throw new ApplicationBugException("Did you use PaymentRegistrationProfileRequiredDataFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.profile_required_data_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C25750e.title);
        textView.setText(this.f49808n.f42830d);
        C6333d0.m15030r(textView, true);
        ((TextView) inflate.findViewById(C25750e.subtitle)).setText(this.f49808n.f42831e);
        Button button = (Button) inflate.findViewById(C25750e.continue_button);
        this.f49810p = button;
        button.setOnClickListener(new C17662e(this, 12));
        this.f49811q = this.f49810p.getTextColors();
        this.f49810p.setEnabled(C25765g.m64313a(getChildFragmentManager()));
        this.f49812r = (TextView) inflate.findViewById(C25750e.skip_view);
        mo51975m2();
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C25750e.progress_bar);
        this.f49813s = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(this.f49810p.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
        for (ProfileCertificationSpec next : this.f49808n.f42833g) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (childFragmentManager.mo3923A(next.f42853b) == null) {
                C0909a aVar = new C0909a(childFragmentManager);
                aVar.mo4041e(C25750e.documents_buttons_container, (Fragment) next.mo49115b(C19632b.m47070a()), next.f42853b, 1);
                aVar.mo4040d();
            }
        }
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "substep_certifications_upload");
        aVar.mo49937e(AnalyticsAttributeKey.ID, this.f49808n.f42828b);
        mo46797j2(aVar.mo49933a());
    }
}
