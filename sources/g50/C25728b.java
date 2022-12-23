package g50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.AlertMessageView;
import com.moovit.payment.account.profile.PaymentAccountAddProfileActivity;
import p543hq.C17474b;
import p739px.C19037a;
import v40.C25751f;

/* renamed from: g50.b */
public class C25728b extends C15682c<PaymentAccountAddProfileActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f64159n = 0;

    public C25728b() {
        super(PaymentAccountAddProfileActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AlertMessageView alertMessageView = (AlertMessageView) layoutInflater.inflate(C25751f.payment_add_profile_explanation_fragment, viewGroup, false);
        alertMessageView.setPositiveButtonClickListener(new C19037a(this, 10));
        return alertMessageView;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "substep_profiles_explanation");
        mo46797j2(aVar.mo49933a());
        ((PaymentAccountAddProfileActivity) this.f40822c).setTitle("");
    }
}
