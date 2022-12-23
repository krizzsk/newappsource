package com.moovit.app.intro.onboarding;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.intro.onboarding.OnboardingFragment;
import com.tranzmate.R;
import p543hq.C17474b;
import p828tt.C19762c;

public class OnboardingActivity extends MoovitAppActivity implements OnboardingFragment.C15023b {
    /* renamed from: D */
    public final void mo45258D() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "got_it");
        mo44545v2(aVar.mo49933a());
        Intent intent = (Intent) getIntent().getParcelableExtra("activity_to_start_on_finish");
        if (intent == null) {
            intent = C14226d.m35335A0(this);
        }
        intent.setExtrasClassLoader(OnboardingActivity.class.getClassLoader());
        C14226d.m35339F0(intent);
        startActivity(intent);
        finish();
    }

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.onboarding_activity);
        C19762c.m47215a(this, C19762c.f50246a);
    }
}
