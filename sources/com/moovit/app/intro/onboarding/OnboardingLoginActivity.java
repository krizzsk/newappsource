package com.moovit.app.intro.onboarding;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.tranzmate.R;
import p073e7.C4583a;
import p259t5.C6593c;
import p543hq.C17474b;
import p828tt.C19762c;

public class OnboardingLoginActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f38468U = 0;

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "back_clicked");
        mo44545v2(aVar.mo49933a());
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.login_suggestion_activity);
        findViewById(R.id.join_button).setOnClickListener(new C6593c(this, 15));
        findViewById(R.id.cancel).setOnClickListener(new C4583a(this, 14));
        C19762c.m47215a(this, C19762c.f50247b);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2354) {
            mo45260y2();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: y2 */
    public final void mo45260y2() {
        Intent intent = (Intent) getIntent().getParcelableExtra("activity_to_start_on_finish");
        if (intent == null) {
            intent = C14226d.m35335A0(this);
        }
        intent.setExtrasClassLoader(OnboardingActivity.class.getClassLoader());
        C14226d.m35339F0(intent);
        startActivity(intent);
        finish();
    }
}
