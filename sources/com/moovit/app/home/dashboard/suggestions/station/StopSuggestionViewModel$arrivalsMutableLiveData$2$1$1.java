package com.moovit.app.home.dashboard.suggestions.station;

import bf0.C21050d;
import com.moovit.transit.TransitStop;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;
import wh0.C25177g;
import wh0.C25184i0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lcom/moovit/transit/TransitStop;", "kotlin.jvm.PlatformType", "stop", "Lbf0/d;", "invoke", "(Lcom/moovit/transit/TransitStop;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopSuggestionViewModel$arrivalsMutableLiveData$2$1$1 extends Lambda implements C24236l<TransitStop, C21050d> {
    public final /* synthetic */ StopSuggestionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionViewModel$arrivalsMutableLiveData$2$1$1(StopSuggestionViewModel stopSuggestionViewModel) {
        super(1);
        this.this$0 = stopSuggestionViewModel;
    }

    public final Object invoke(Object obj) {
        TransitStop transitStop = (TransitStop) obj;
        StopSuggestionViewModel stopSuggestionViewModel = this.this$0;
        C24362h.m61210e(transitStop, "stop");
        stopSuggestionViewModel.getClass();
        C25177g.m63218b(C17875h.m44315z(stopSuggestionViewModel), C25184i0.f63460b, new StopSuggestionViewModel$getLineArrivals$1(stopSuggestionViewModel, transitStop, (C23349c<? super StopSuggestionViewModel$getLineArrivals$1>) null), 2);
        return C21050d.f52856a;
    }
}
