package com.umo.ads.p349s;

import ac0.C7557a;
import bf0.C21050d;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import ff0.C23349c;
import gf0.C23413c;
import kc0.C12836b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import p845um.C19958a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.ad.playback.ui.views.AKHtmlAdView$trackAdLoading$1", mo58555f = "AKHtmlAdView.kt", mo58556l = {258}, mo58557m = "invokeSuspend")
/* renamed from: com.umo.ads.s.zzb */
public final class zzb extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ C12836b zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzb(long j, C12836b bVar, C23349c<? super zzb> cVar) {
        super(2, cVar);
        this.zzb = j;
        this.zzc = bVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new zzb(this.zzb, this.zzc, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zzb) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.zza;
        if (i == 0) {
            C17885a.m44475z0(obj);
            long j = this.zzb;
            this.zza = 1;
            if (C19958a.m47431e(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTML_AD: Ad Load Timed Out");
        J0.append(this.zzc.f31715l);
        J0.append("...");
        logger.mo6667d(J0.toString());
        this.zzc.mo39657d(true);
        this.zzc.mo39656c((String) null, UMOAdKitError.AD_PLAY_TIMED_OUT);
        return C21050d.f52856a;
    }
}
