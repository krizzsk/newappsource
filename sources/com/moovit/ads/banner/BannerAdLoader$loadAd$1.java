package com.moovit.ads.banner;

import android.content.Context;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p920xp.C20553b;

@C23413c(mo58554c = "com.moovit.ads.banner.BannerAdLoader", mo58555f = "BannerAdLoader.kt", mo58556l = {26}, mo58557m = "loadAd")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class BannerAdLoader$loadAd$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BannerAdLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerAdLoader$loadAd$1(BannerAdLoader bannerAdLoader, C23349c<? super BannerAdLoader$loadAd$1> cVar) {
        super(cVar);
        this.this$0 = bannerAdLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BannerAdLoader.m37018a(this.this$0, (Context) null, (C20553b) null, this);
    }
}
