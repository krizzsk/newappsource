package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.display.c */
public class C2706c extends C2704a {
    /* renamed from: a */
    public void mo13290a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        Intent intent = new Intent(activity, InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
        try {
            IAlog.m9902a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m9899a((Object) activity), inneractiveAdSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.m9904c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m9899a((Object) activity));
        }
    }
}
