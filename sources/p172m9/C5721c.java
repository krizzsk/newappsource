package p172m9;

import com.google.ads.mediation.unity.C3846a;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* renamed from: m9.c */
public final class C5721c implements IUnityAdsInitializationListener {

    /* renamed from: a */
    public final /* synthetic */ String f18550a;

    /* renamed from: b */
    public final /* synthetic */ String f18551b;

    /* renamed from: c */
    public final /* synthetic */ C3846a f18552c;

    public C5721c(C3846a aVar, String str, String str2) {
        this.f18552c = aVar;
        this.f18550a = str;
        this.f18551b = str2;
    }

    public final void onInitializationComplete() {
        String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", new Object[]{this.f18550a, this.f18551b});
    }

    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        this.f18552c.mo15731a(UnityAdsAdapterUtils.m10143b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", new Object[]{this.f18550a, str})));
    }
}
