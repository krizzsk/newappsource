package com.moovit.app.general.settings.privacy;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.play.core.appupdate.C14226d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p054d0.C4268a1;
import p977zz.C20943i;
import p977zz.C20964s0;
import p977zz.C20977y0;

public class PrivacyUpdateActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f38072X = 0;

    /* renamed from: U */
    public Intent f38073U;

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        FirebaseAnalytics.getInstance(this).mo43247a((Bundle) null, "privacy_update_screen_on_back_pressed");
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        if (C20977y0.m49123b(this, true)) {
            int parseColor = Color.parseColor("#ECF0F1");
            if (C20943i.m49051d(21)) {
                getWindow().setStatusBarColor(parseColor);
            }
        }
        setContentView((int) R.layout.privacy_update_activity);
        Intent intent = (Intent) getIntent().getParcelableExtra("activityToLaunchWhenFinished");
        this.f38073U = intent;
        if (intent == null && bundle != null) {
            this.f38073U = (Intent) bundle.getParcelable("activityToLaunchWhenFinished");
        }
        TextView textView = (TextView) findViewById(R.id.terms);
        String string = getString(R.string.onboarding_upgrade_privacy_popup_paragraph1_hyperlink);
        textView.setText(getString(R.string.onboarding_upgrade_privacy_popup_paragraph1, new Object[]{string}));
        C20964s0.m49105w(textView, string, false, new C4268a1(this, 11));
        findViewById(R.id.continue_button).setOnClickListener(new C4051q(this, 8));
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("activityToLaunchWhenFinished", this.f38073U);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        FirebaseAnalytics.getInstance(this).mo43247a((Bundle) null, "privacy_update_screen_impression");
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_finishing", isFinishing());
        FirebaseAnalytics.getInstance(this).mo43247a(bundle, "privacy_update_screen_stop");
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.clear();
        hashSet.add("USER_CONTEXT");
        return s1;
    }

    /* renamed from: w1 */
    public final Intent mo44546w1() {
        Intent intent = this.f38073U;
        if (intent == null) {
            intent = C14226d.m35335A0(this);
        }
        Intent intent2 = new Intent(intent);
        intent2.setFlags(0);
        return intent2;
    }
}
