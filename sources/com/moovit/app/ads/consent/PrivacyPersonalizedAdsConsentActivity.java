package com.moovit.app.ads.consent;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.activity.C0194b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import java.util.concurrent.TimeUnit;
import p073e7.C4584b;
import p073e7.C4585c;
import p543hq.C17474b;
import p977zz.C20964s0;

public class PrivacyPersonalizedAdsConsentActivity extends MoovitAppActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f37502Z = 0;

    /* renamed from: U */
    public long f37503U;

    /* renamed from: X */
    public boolean f37504X;

    /* renamed from: Y */
    public String f37505Y = "PRIVACY_NOT_AGREED";

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        return true;
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        if (!this.f37504X) {
            return super.mo44521e1();
        }
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_update");
        e1.mo49939g(AnalyticsAttributeKey.STATUS, this.f37505Y);
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        String str;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.personalized_ads_consent_activity);
        if (bundle != null) {
            str = bundle.getString("privacyAgreeAnalyticStatus");
        } else {
            str = "PRIVACY_NOT_AGREED";
        }
        this.f37505Y = str;
        this.f37504X = getIntent().getBooleanExtra("isPrivacyUpdateNeeded", false);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.alert_message);
        if (this.f37504X) {
            String string = getString(R.string.privacy_text);
            alertMessageView.setSubtitle((CharSequence) getString(R.string.onboarding_gdpr_ads_and_privacy_update_message, new Object[]{string}));
            C20964s0.m49105w(alertMessageView.f41346f, string, true, new C0194b(this, 7));
        } else {
            alertMessageView.setSubtitle((int) R.string.onboarding_gdpr_ads_consent_message);
        }
        alertMessageView.setPositiveButtonClickListener(new C4584b(this, 2));
        alertMessageView.setNegativeButtonClickListener(new C4585c(this, 2));
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putString("privacyAgreeAnalyticStatus", this.f37505Y);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        this.f37503U = SystemClock.elapsedRealtime();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        if (this.f37504X && mo44741y2()) {
            this.f37505Y = "PRIVACY_AGREED_AUTOMATICALLY";
            C14894a.m37560b(this).mo45018h();
        }
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String str;
        boolean booleanExtra = getIntent().getBooleanExtra("isPrivacyUpdateNeeded", false);
        C17474b.C17475a m1 = super.mo19762m1();
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
        if (booleanExtra) {
            str = "privacy_update";
        } else {
            str = null;
        }
        m1.mo49945m(analyticsAttributeKey, str);
        return m1;
    }

    /* renamed from: y2 */
    public final boolean mo44741y2() {
        if (C14894a.m37560b(this).mo45017g() || SystemClock.elapsedRealtime() - this.f37503U <= TimeUnit.SECONDS.toMillis(1)) {
            return false;
        }
        return true;
    }
}
