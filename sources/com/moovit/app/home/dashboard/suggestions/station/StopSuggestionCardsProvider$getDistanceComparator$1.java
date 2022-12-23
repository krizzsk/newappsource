package com.moovit.app.home.dashboard.suggestions.station;

import aa0.C7530f;
import android.content.Context;
import com.moovit.transit.TransitStop;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"<anonymous>", "", "lhs", "Lcom/moovit/transit/TransitStop;", "rhs", "invoke", "(Lcom/moovit/transit/TransitStop;Lcom/moovit/transit/TransitStop;)Ljava/lang/Integer;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StopSuggestionCardsProvider$getDistanceComparator$1 extends Lambda implements C24240p<TransitStop, TransitStop, Integer> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionCardsProvider$getDistanceComparator$1(Context context) {
        super(2);
        this.$context = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        TransitStop transitStop = (TransitStop) obj;
        TransitStop transitStop2 = (TransitStop) obj2;
        C24362h.m61211f(transitStop, "lhs");
        C24362h.m61211f(transitStop2, "rhs");
        return Integer.valueOf(Float.compare(C7530f.m17271d(this.$context, transitStop.f23732d), C7530f.m17271d(this.$context, transitStop2.f23732d)));
    }
}
