package p160l9;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* renamed from: l9.i */
public final class C5650i implements InneractiveFullScreenAdRewardedListener {

    /* renamed from: a */
    public final /* synthetic */ C5651j f18403a;

    public C5650i(C5651j jVar) {
        this.f18403a = jVar;
    }

    public final void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
        this.f18403a.f18405b.onUserEarnedReward(RewardItem.DEFAULT_REWARD);
        this.f18403a.f18405b.onVideoComplete();
    }
}
