package p782rv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.R;
import p073e7.C4585c;
import p543hq.C17474b;

/* renamed from: rv.n */
public class C19363n extends C19332a {

    /* renamed from: p */
    public static final /* synthetic */ int f49268p = 0;

    /* renamed from: n */
    public Button f49269n;

    /* renamed from: o */
    public Button f49270o;

    /* renamed from: n2 */
    public final AnalyticsEventKey mo51743n2() {
        return AnalyticsEventKey.STEP_WELCOME;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ride_sharing_registration_step_welcome_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.registration_welcome_message);
        this.f49269n = (Button) inflate.findViewById(R.id.action_button);
        this.f49270o = (Button) inflate.findViewById(R.id.skip_button);
        RideSharingRegistrationInfo m2 = mo51742m2();
        boolean z = true;
        boolean z2 = !m2.f39393i;
        RideSharingRegistrationSteps rideSharingRegistrationSteps = m2.f39387c;
        if (rideSharingRegistrationSteps == null || !rideSharingRegistrationSteps.f42980e) {
            z = false;
        }
        if (z2) {
            textView.setText(R.string.ride_sharing_registration_complete_welcome_message);
        } else if (z) {
            textView.setText(R.string.ride_sharing_registration_complete_existing_user_welcome_message);
        } else {
            textView.setText(R.string.ride_sharing_registration_complete_existing_user_with_credit_card_welcome_message);
        }
        if (z) {
            this.f49270o.setVisibility(0);
            this.f49270o.setOnClickListener(new C4051q(this, 27));
            this.f49269n.setText(getString(R.string.ride_sharing_registration_credit_card));
            this.f49269n.setOnClickListener(new C4052r(this, 17));
        } else {
            this.f49270o.setVisibility(8);
            this.f49269n.setText(getString(R.string.ok));
            this.f49269n.setOnClickListener(new C4585c(this, 21));
        }
        return inflate;
    }

    /* renamed from: r2 */
    public final void mo51772r2() {
        boolean z;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "skip_clicked");
        mo46797j2(aVar.mo49933a());
        RideSharingRegistrationInfo m2 = mo51742m2();
        RideSharingRegistrationSteps rideSharingRegistrationSteps = m2.f39387c;
        if (rideSharingRegistrationSteps == null || !rideSharingRegistrationSteps.f42977b) {
            z = false;
        } else {
            z = true;
        }
        m2.f39387c = new RideSharingRegistrationSteps(z, false, false, false);
        mo51745p2(false);
    }
}
