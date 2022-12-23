package com.moovit.mediation;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import bf0.C21050d;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.moovit.ads.AdTargeting;
import com.moovit.ads.interstitial.InterstitialAdLoader;
import com.moovit.commons.geo.LatLonE6;
import e30.C4545a;
import ff0.C23349c;
import gf0.C23413c;
import gk0.C23438a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;
import p967zp.C20882b;

@C23413c(mo58554c = "com.moovit.mediation.AdRepository$loadInterstitialAd$2", mo58555f = "AdRepository.kt", mo58556l = {52}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo59060d2 = {"Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class AdRepository$loadInterstitialAd$2 extends SuspendLambda implements C24236l<C23349c<? super C21050d>, Object> {
    public final /* synthetic */ MoovitAdTracker $adTracker;
    public final /* synthetic */ MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> $callback;
    public final /* synthetic */ MediationInterstitialAdConfiguration $conf;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdRepository$loadInterstitialAd$2(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, MoovitAdTracker moovitAdTracker, C23349c<? super AdRepository$loadInterstitialAd$2> cVar) {
        super(1, cVar);
        this.$conf = mediationInterstitialAdConfiguration;
        this.$callback = mediationAdLoadCallback;
        this.$adTracker = moovitAdTracker;
    }

    public final C23349c<C21050d> create(C23349c<?> cVar) {
        return new AdRepository$loadInterstitialAd$2(this.$conf, this.$callback, this.$adTracker, cVar);
    }

    public final Object invoke(Object obj) {
        return ((AdRepository$loadInterstitialAd$2) create((C23349c) obj)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C20882b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.$conf;
            C24362h.m61211f(mediationInterstitialAdConfiguration, "conf");
            mediationInterstitialAdConfiguration.getMediationExtras().setClassLoader(LatLonE6.class.getClassLoader());
            String string = mediationInterstitialAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
            LatLonE6 latLonE6 = null;
            if (string != null) {
                C23438a.f59213a.getClass();
                Location location = (Location) mediationInterstitialAdConfiguration.getMediationExtras().getParcelable(MoovitMediationAdapter.EXTRA_USER_LOCATION);
                LatLonE6 latLonE62 = (LatLonE6) mediationInterstitialAdConfiguration.getMediationExtras().getParcelable(MoovitMediationAdapter.EXTRA_TARGET_LOCATION);
                if (location == null) {
                    location = null;
                }
                if (latLonE62 != null) {
                    latLonE6 = latLonE62;
                }
                C20882b bVar2 = new C20882b(string, new AdTargeting(location, latLonE6));
                InterstitialAdLoader interstitialAdLoader = InterstitialAdLoader.f37388a;
                Context context = this.$conf.getContext();
                C24362h.m61210e(context, "conf.context");
                this.L$0 = bVar2;
                this.label = 1;
                Object b = interstitialAdLoader.mo44664b(context, bVar2, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
                obj = b;
            } else {
                throw new AdMediationException(AdMediationError.MISSING_PLACEMENT_ID, (Throwable) null);
            }
        } else if (i == 1) {
            bVar = (C20882b) this.L$0;
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MediationInterstitialAdCallback onSuccess = this.$callback.onSuccess(new C4545a((Intent) obj));
        C24362h.m61210e(onSuccess, "callback.onSuccess(Inter…alAd(interstitialIntent))");
        MoovitAdTracker moovitAdTracker = this.$adTracker;
        String str = bVar.f51692a;
        moovitAdTracker.getClass();
        C24362h.m61211f(str, "placementId");
        C23438a.f59213a.getClass();
        moovitAdTracker.f14794d.put(str, onSuccess);
        return C21050d.f52856a;
    }
}
