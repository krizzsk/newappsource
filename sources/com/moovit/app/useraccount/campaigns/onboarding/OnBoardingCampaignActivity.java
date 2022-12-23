package com.moovit.app.useraccount.campaigns.onboarding;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.tranzmate.R;
import p496fr.C17065b;
import p583jk.C17884p;

public class OnBoardingCampaignActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f40560U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.on_boarding_campaign_activity);
        OnBoardingCampaignScreenInfo onBoardingCampaignScreenInfo = (OnBoardingCampaignScreenInfo) getIntent().getParcelableExtra("screen_info");
        if (onBoardingCampaignScreenInfo == null) {
            finish();
        } else {
            ImageView imageView = (ImageView) findViewById(R.id.image);
            C17884p.m44354Y(imageView).mo51642v(onBoardingCampaignScreenInfo.f40561b).mo51628o0(onBoardingCampaignScreenInfo.f40561b).mo10850T(imageView);
            ((TextView) findViewById(R.id.title)).setText(onBoardingCampaignScreenInfo.f40562c);
            ((TextView) findViewById(R.id.subtitle)).setText(onBoardingCampaignScreenInfo.f40563d);
            Button button = (Button) findViewById(R.id.action);
            button.setText((CharSequence) onBoardingCampaignScreenInfo.f40564e.f52692a);
            button.setOnClickListener(new C17065b(6, this, onBoardingCampaignScreenInfo));
            Button button2 = (Button) findViewById(R.id.secondary_action);
            if (onBoardingCampaignScreenInfo.f40565f == null) {
                button2.setVisibility(8);
            } else {
                button2.setVisibility(0);
                button2.setText((CharSequence) onBoardingCampaignScreenInfo.f40565f.f52692a);
                button2.setOnClickListener(new C4054t(9, this, onBoardingCampaignScreenInfo));
            }
        }
        TrackingEvent trackingEvent = TrackingEvent.ON_BOARDING_CAMPAIGN;
        getSharedPreferences("events_tracker_store", 0).edit().putInt(trackingEvent.getPrefsKey(), trackingEvent.getMaxOccurrences()).apply();
    }
}
