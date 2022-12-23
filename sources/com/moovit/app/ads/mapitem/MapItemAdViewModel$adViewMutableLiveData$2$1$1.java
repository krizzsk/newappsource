package com.moovit.app.ads.mapitem;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p393bq.C13652a;
import p583jk.C17875h;
import wh0.C25177g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lbq/a;", "kotlin.jvm.PlatformType", "config", "Lbf0/d;", "invoke", "(Lbq/a;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class MapItemAdViewModel$adViewMutableLiveData$2$1$1 extends Lambda implements C24236l<C13652a, C21050d> {
    public final /* synthetic */ MapItemAdViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdViewModel$adViewMutableLiveData$2$1$1(MapItemAdViewModel mapItemAdViewModel) {
        super(1);
        this.this$0 = mapItemAdViewModel;
    }

    public final Object invoke(Object obj) {
        C13652a aVar = (C13652a) obj;
        MapItemAdViewModel mapItemAdViewModel = this.this$0;
        C24362h.m61210e(aVar, "config");
        mapItemAdViewModel.getClass();
        C25177g.m63218b(C17875h.m44315z(mapItemAdViewModel), (CoroutineContext) null, new MapItemAdViewModel$loadAdView$1(mapItemAdViewModel, aVar, (C23349c<? super MapItemAdViewModel$loadAdView$1>) null), 3);
        return C21050d.f52856a;
    }
}
