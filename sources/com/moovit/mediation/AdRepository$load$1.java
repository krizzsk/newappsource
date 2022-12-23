package com.moovit.mediation;

import bf0.C21050d;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lf0.C24236l;

@C23413c(mo58554c = "com.moovit.mediation.AdRepository", mo58555f = "AdRepository.kt", mo58556l = {68}, mo58557m = "load")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class AdRepository$load$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AdRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdRepository$load$1(AdRepository adRepository, C23349c<? super AdRepository$load$1> cVar) {
        super(cVar);
        this.this$0 = adRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo19367a((MediationAdLoadCallback<?, ?>) null, (C24236l<? super C23349c<? super C21050d>, ? extends Object>) null, this);
    }
}
