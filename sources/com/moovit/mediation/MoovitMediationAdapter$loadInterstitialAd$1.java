package com.moovit.mediation;

import android.content.Context;
import bf0.C21050d;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.moovit.mediation.MoovitAdTracker;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.mediation.MoovitMediationAdapter$loadInterstitialAd$1", mo58555f = "MoovitMediationAdapter.kt", mo58556l = {75}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class MoovitMediationAdapter$loadInterstitialAd$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> $callback;
    public final /* synthetic */ MediationInterstitialAdConfiguration $conf;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoovitMediationAdapter$loadInterstitialAd$1(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, C23349c<? super MoovitMediationAdapter$loadInterstitialAd$1> cVar) {
        super(2, cVar);
        this.$conf = mediationInterstitialAdConfiguration;
        this.$callback = mediationAdLoadCallback;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new MoovitMediationAdapter$loadInterstitialAd$1(this.$conf, this.$callback, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((MoovitMediationAdapter$loadInterstitialAd$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            MoovitAdTracker.C4112a aVar = MoovitAdTracker.f14791e;
            Context context = this.$conf.getContext();
            C24362h.m61210e(context, "conf.context");
            MoovitAdTracker a = aVar.mo19373a(context);
            AdRepository adRepository = AdRepository.f14790a;
            MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.$conf;
            MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.$callback;
            this.label = 1;
            Object a2 = adRepository.mo19367a(mediationAdLoadCallback, new AdRepository$loadInterstitialAd$2(mediationInterstitialAdConfiguration, mediationAdLoadCallback, a, (C23349c<? super AdRepository$loadInterstitialAd$2>) null), this);
            if (a2 != coroutineSingletons) {
                a2 = C21050d.f52856a;
            }
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C21050d.f52856a;
    }
}
