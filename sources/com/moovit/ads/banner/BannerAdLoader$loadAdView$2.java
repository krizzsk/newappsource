package com.moovit.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import bf0.C21050d;
import com.moovit.ads.BannerAd;
import com.moovit.ads.HtmlBannerAd;
import com.moovit.ads.banner.html.HtmlBannerView;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import p920xp.C20553b;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.ads.banner.BannerAdLoader$loadAdView$2", mo58555f = "BannerAdLoader.kt", mo58556l = {36}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lcom/moovit/ads/banner/html/HtmlBannerView;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class BannerAdLoader$loadAdView$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super HtmlBannerView>, Object> {
    public final /* synthetic */ C20553b $config;
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerAdLoader$loadAdView$2(Context context, C20553b bVar, C23349c<? super BannerAdLoader$loadAdView$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$config = bVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new BannerAdLoader$loadAdView$2(this.$context, this.$config, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((BannerAdLoader$loadAdView$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            BannerAdLoader bannerAdLoader = BannerAdLoader.f37378a;
            Context context = this.$context;
            C20553b bVar = this.$config;
            this.label = 1;
            obj = BannerAdLoader.m37018a(bannerAdLoader, context, bVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context2 = this.$context;
        BannerAd bannerAd = (BannerAd) obj;
        if (bannerAd instanceof HtmlBannerAd) {
            HtmlBannerView htmlBannerView = new HtmlBannerView(context2, (AttributeSet) null, 0, 14, 0);
            htmlBannerView.setBannerAd(bannerAd);
            return htmlBannerView;
        }
        throw new NoWhenBranchMatchedException();
    }
}
