package com.moovit.app.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitActivity;
import p921xq.C20554a;
import p921xq.C20558d;
import q50.C19080b;

/* renamed from: com.moovit.app.ads.r */
public final /* synthetic */ class C14757r implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f37564b;

    /* renamed from: c */
    public final /* synthetic */ Object f37565c;

    /* renamed from: d */
    public final /* synthetic */ Object f37566d;

    public /* synthetic */ C14757r(int i, Object obj, Object obj2) {
        this.f37564b = i;
        this.f37565c = obj;
        this.f37566d = obj2;
    }

    public final void onComplete(Task task) {
        C20554a aVar;
        switch (this.f37564b) {
            case 0:
                ((MobileAdsManager) this.f37565c).f37465g.remove((String) this.f37566d);
                return;
            case 1:
                MoovitNativeAdView moovitNativeAdView = (MoovitNativeAdView) this.f37565c;
                MoovitActivity moovitActivity = (MoovitActivity) this.f37566d;
                int i = MoovitNativeAdView.f37482i;
                moovitNativeAdView.getClass();
                if (task.isSuccessful()) {
                    aVar = (C20554a) task.getResult();
                } else {
                    aVar = null;
                }
                if (aVar instanceof C20558d) {
                    moovitNativeAdView.mo44738a(moovitActivity, (C20558d) task.getResult());
                    return;
                } else {
                    moovitNativeAdView.mo44738a(moovitActivity, (C20558d) null);
                    return;
                }
            default:
                C19080b bVar = (C19080b) this.f37565c;
                bVar.mo51514o2(bVar.f48502n, (C19080b.C19081a) this.f37566d);
                return;
        }
    }
}
