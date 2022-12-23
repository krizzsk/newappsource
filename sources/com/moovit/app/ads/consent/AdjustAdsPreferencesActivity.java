package com.moovit.app.ads.consent;

import android.os.Bundle;
import com.moovit.app.MoovitAppActivity;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import p073e7.C4583a;
import p297w5.C6996c;

public class AdjustAdsPreferencesActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f37501U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.adjust_ads_preferences_activity);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.alert_message);
        alertMessageView.setPositiveButtonClickListener(new C4583a(this, 4));
        alertMessageView.setNegativeButtonClickListener(new C6996c(this, 5));
    }
}
