package s60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.AlertMessageView;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import p009a8.C0112l;
import p543hq.C17474b;
import p761qy.C19201a;
import v40.C25751f;

/* renamed from: s60.a */
public class C19433a extends C15682c<PaymentRegistrationActivity> {

    /* renamed from: n */
    public static final String f49434n = C19433a.class.getSimpleName();

    /* renamed from: s60.a$a */
    public interface C19434a {
        /* renamed from: R0 */
        void mo51843R0();

        /* renamed from: Z */
        void mo51844Z();
    }

    public C19433a() {
        super(PaymentRegistrationActivity.class);
    }

    public final boolean onBackPressed() {
        mo46786U1(C19434a.class, new C0112l(17));
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AlertMessageView alertMessageView = (AlertMessageView) layoutInflater.inflate(C25751f.payment_add_profile_explanation_fragment, viewGroup, false);
        alertMessageView.setPositiveButtonClickListener(new C19201a(this, 11));
        return alertMessageView;
    }

    public final void onStart() {
        super.onStart();
        ((PaymentRegistrationActivity) this.f40822c).setTitle((CharSequence) null);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "substep_profiles_explanation");
        mo46797j2(aVar.mo49933a());
    }
}
