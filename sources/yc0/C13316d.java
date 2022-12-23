package yc0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13008c;
import zc0.C13379b;

/* renamed from: yc0.d */
public final class C13316d extends C13311a<RewardedAd> {
    public C13316d(Context context, C13379b bVar, C13008c cVar, C12982b bVar2, ScarRewardedAdHandler scarRewardedAdHandler) {
        super(context, cVar, bVar, bVar2);
        this.f33053e = new C13317e(scarRewardedAdHandler, this);
    }

    /* renamed from: a */
    public final void mo39895a(Activity activity) {
        T t = this.f33049a;
        if (t != null) {
            ((RewardedAd) t).show(activity, ((C13317e) this.f33053e).f33064g);
        } else {
            this.f33054f.handleError(C12981a.m32861a(this.f33051c));
        }
    }

    /* renamed from: c */
    public final void mo40219c(AdRequest adRequest) {
        RewardedAd.load(this.f33050b, this.f33051c.f32195c, adRequest, (RewardedAdLoadCallback) ((C13317e) this.f33053e).f33063f);
    }
}
