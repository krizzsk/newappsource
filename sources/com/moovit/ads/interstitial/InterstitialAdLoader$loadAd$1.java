package com.moovit.ads.interstitial;

import android.content.Context;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p967zp.C20882b;

@C23413c(mo58554c = "com.moovit.ads.interstitial.InterstitialAdLoader", mo58555f = "InterstitialAdLoader.kt", mo58556l = {24}, mo58557m = "loadAd")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class InterstitialAdLoader$loadAd$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InterstitialAdLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterstitialAdLoader$loadAd$1(InterstitialAdLoader interstitialAdLoader, C23349c<? super InterstitialAdLoader$loadAd$1> cVar) {
        super(cVar);
        this.this$0 = interstitialAdLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo44663a((Context) null, (C20882b) null, this);
    }
}
