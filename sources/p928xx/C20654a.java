package p928xx;

import aa0.C7524a;
import android.content.Intent;
import com.moovit.MoovitActivity;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignActivity;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignScreenInfo;
import p874vr.C20199a;
import q00.C19047a;

/* renamed from: xx.a */
public final class C20654a implements C7524a<Intent> {
    /* renamed from: a */
    public final Object mo23790a(MoovitActivity moovitActivity) throws Exception {
        boolean z;
        OnBoardingCampaignScreenInfo onBoardingCampaignScreenInfo;
        TrackingEvent trackingEvent = TrackingEvent.ON_BOARDING_CAMPAIGN;
        if (moovitActivity.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        moovitActivity.getSharedPreferences("events_tracker_store", 0).edit().putInt(trackingEvent.getPrefsKey(), trackingEvent.getMaxOccurrences()).apply();
        C19047a aVar = (C19047a) MoovitAppApplication.m37038x().f37321e.mo50695h("CONFIGURATION", false);
        if (aVar == null || !((Boolean) aVar.mo51505b(C20199a.f51241C0)).booleanValue() || (onBoardingCampaignScreenInfo = ((C20656c) new C20655b(moovitActivity.mo44548x1()).mo52626J()).f52227m) == null) {
            return null;
        }
        int i = OnBoardingCampaignActivity.f40560U;
        Intent intent = new Intent(moovitActivity, OnBoardingCampaignActivity.class);
        intent.putExtra("screen_info", onBoardingCampaignScreenInfo);
        return intent;
    }

    /* renamed from: b */
    public final void mo23791b(MoovitActivity moovitActivity, Object obj) {
        moovitActivity.startActivity((Intent) obj);
    }
}
