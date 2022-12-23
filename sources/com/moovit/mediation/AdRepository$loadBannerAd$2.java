package com.moovit.mediation;

import android.content.Context;
import android.location.Location;
import android.view.View;
import bf0.C21050d;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.moovit.ads.AdTargeting;
import com.moovit.ads.banner.BannerAdLoader;
import com.moovit.commons.geo.LatLonE6;
import d30.C4340a;
import ff0.C23349c;
import gf0.C23413c;
import gk0.C23438a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;
import p920xp.C20553b;

@C23413c(mo58554c = "com.moovit.mediation.AdRepository$loadBannerAd$2", mo58555f = "AdRepository.kt", mo58556l = {32}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo59060d2 = {"Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class AdRepository$loadBannerAd$2 extends SuspendLambda implements C24236l<C23349c<? super C21050d>, Object> {
    public final /* synthetic */ MoovitAdTracker $adTracker;
    public final /* synthetic */ MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> $callback;
    public final /* synthetic */ MediationBannerAdConfiguration $conf;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdRepository$loadBannerAd$2(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, MoovitAdTracker moovitAdTracker, C23349c<? super AdRepository$loadBannerAd$2> cVar) {
        super(1, cVar);
        this.$conf = mediationBannerAdConfiguration;
        this.$callback = mediationAdLoadCallback;
        this.$adTracker = moovitAdTracker;
    }

    public final C23349c<C21050d> create(C23349c<?> cVar) {
        return new AdRepository$loadBannerAd$2(this.$conf, this.$callback, this.$adTracker, cVar);
    }

    public final Object invoke(Object obj) {
        return ((AdRepository$loadBannerAd$2) create((C23349c) obj)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C20553b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            MediationBannerAdConfiguration mediationBannerAdConfiguration = this.$conf;
            C24362h.m61211f(mediationBannerAdConfiguration, "conf");
            mediationBannerAdConfiguration.getMediationExtras().setClassLoader(LatLonE6.class.getClassLoader());
            String string = mediationBannerAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
            LatLonE6 latLonE6 = null;
            if (string != null) {
                C23438a.f59213a.getClass();
                AdSize adSize = mediationBannerAdConfiguration.getAdSize();
                if (adSize != null) {
                    com.moovit.ads.AdSize adSize2 = new com.moovit.ads.AdSize(adSize.getWidth(), adSize.getHeight());
                    Location location = (Location) mediationBannerAdConfiguration.getMediationExtras().getParcelable(MoovitMediationAdapter.EXTRA_USER_LOCATION);
                    LatLonE6 latLonE62 = (LatLonE6) mediationBannerAdConfiguration.getMediationExtras().getParcelable(MoovitMediationAdapter.EXTRA_TARGET_LOCATION);
                    if (location == null) {
                        location = null;
                    }
                    if (latLonE62 != null) {
                        latLonE6 = latLonE62;
                    }
                    C20553b bVar2 = new C20553b(string, new AdTargeting(location, latLonE6), adSize2);
                    Context context = this.$conf.getContext();
                    C24362h.m61210e(context, "conf.context");
                    this.L$0 = bVar2;
                    this.label = 1;
                    Object b = BannerAdLoader.m37019b(context, bVar2, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = bVar2;
                    obj = b;
                } else {
                    throw new AdMediationException(AdMediationError.MISSING_AD_SIZE, (Throwable) null);
                }
            } else {
                throw new AdMediationException(AdMediationError.MISSING_PLACEMENT_ID, (Throwable) null);
            }
        } else if (i == 1) {
            bVar = (C20553b) this.L$0;
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MediationBannerAdCallback onSuccess = this.$callback.onSuccess(new C4340a((View) obj));
        C24362h.m61210e(onSuccess, "callback.onSuccess(BannerAd(bannerView))");
        MoovitAdTracker moovitAdTracker = this.$adTracker;
        String str = bVar.f51692a;
        moovitAdTracker.getClass();
        C24362h.m61211f(str, "placementId");
        C23438a.f59213a.getClass();
        moovitAdTracker.f14794d.put(str, onSuccess);
        return C21050d.f52856a;
    }
}
