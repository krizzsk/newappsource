package com.moovit.ads.mapitem;

import android.content.Context;
import android.util.AttributeSet;
import bf0.C21050d;
import com.moovit.ads.HtmlMapItemAd;
import com.moovit.ads.MapItemAd;
import com.moovit.ads.mapitem.html.HtmlMapItemAdView;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p393bq.C13652a;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.ads.mapitem.MapItemAdLoader$loadAdView$2", mo58555f = "MapItemAdLoader.kt", mo58556l = {36}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lcom/moovit/ads/mapitem/html/HtmlMapItemAdView;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class MapItemAdLoader$loadAdView$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super HtmlMapItemAdView>, Object> {
    public final /* synthetic */ C13652a $config;
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdLoader$loadAdView$2(Context context, C13652a aVar, C23349c<? super MapItemAdLoader$loadAdView$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$config = aVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new MapItemAdLoader$loadAdView$2(this.$context, this.$config, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((MapItemAdLoader$loadAdView$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C14709a aVar = C14709a.f37397a;
            Context context = this.$context;
            C13652a aVar2 = this.$config;
            this.label = 1;
            obj = C14709a.m37025a(aVar, context, aVar2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context2 = this.$context;
        MapItemAd mapItemAd = (MapItemAd) obj;
        if (mapItemAd instanceof HtmlMapItemAd) {
            HtmlMapItemAdView htmlMapItemAdView = new HtmlMapItemAdView(context2, (AttributeSet) null, 0, 14, 0);
            htmlMapItemAdView.setMapItemAd(mapItemAd);
            return htmlMapItemAdView;
        }
        throw new NoWhenBranchMatchedException();
    }
}
