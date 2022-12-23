package g50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.Scopes;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.account.profile.PaymentAccountAddProfileActivity;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationSpec;
import java.util.List;
import p242s1.C6333d0;
import p501fw.C17102a;
import p543hq.C17474b;
import t60.C19632b;
import t60.C19634d;
import v40.C25750e;
import v40.C25751f;
import w40.C25765g;

/* renamed from: g50.a */
public class C25727a extends C15682c<PaymentAccountAddProfileActivity> implements C19634d.C19635a {

    /* renamed from: p */
    public static final /* synthetic */ int f64156p = 0;

    /* renamed from: n */
    public PaymentProfile f64157n;

    /* renamed from: o */
    public Button f64158o;

    public C25727a() {
        super(PaymentAccountAddProfileActivity.class);
    }

    /* renamed from: P */
    public final void mo51973P(ProfileCertificateData profileCertificateData) {
        mo83583m2();
    }

    /* renamed from: S */
    public final void mo51974S() {
        mo83583m2();
    }

    /* renamed from: m2 */
    public final void mo83583m2() {
        if (C25765g.m64313a(getChildFragmentManager())) {
            this.f64158o.setEnabled(true);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentProfile paymentProfile = (PaymentProfile) mo46782Q1().getParcelable(Scopes.PROFILE);
        this.f64157n = paymentProfile;
        if (paymentProfile == null) {
            throw new ApplicationBugException("Did you use PaymentAccountAddProfileCertificationsFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_add_profile_certifications_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C25750e.title);
        textView.setText(this.f64157n.f42830d);
        C6333d0.m15030r(textView, true);
        ((TextView) inflate.findViewById(C25750e.subtitle)).setText(this.f64157n.f42831e);
        List<ProfileCertificationSpec> list = this.f64157n.f42833g;
        if (list != null) {
            for (ProfileCertificationSpec next : list) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                if (childFragmentManager.mo3923A(next.f42853b) == null) {
                    C0909a aVar = new C0909a(childFragmentManager);
                    aVar.mo4041e(C25750e.documents_buttons_container, (Fragment) next.mo49115b(C19632b.m47070a()), next.f42853b, 1);
                    aVar.mo4040d();
                }
            }
        }
        Button button = (Button) inflate.findViewById(C25750e.save_button);
        this.f64158o = button;
        button.setOnClickListener(new C17102a(this, 18));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "substep_certifications_upload");
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo83583m2();
    }
}
