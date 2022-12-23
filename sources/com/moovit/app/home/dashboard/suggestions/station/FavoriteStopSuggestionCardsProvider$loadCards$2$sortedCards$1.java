package com.moovit.app.home.dashboard.suggestions.station;

import aa0.C7530f;
import android.content.Context;
import com.moovit.transit.TransitStop;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "", "stop", "Lcom/moovit/transit/TransitStop;", "invoke", "(Lcom/moovit/transit/TransitStop;)Ljava/lang/Boolean;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class FavoriteStopSuggestionCardsProvider$loadCards$2$sortedCards$1 extends Lambda implements C24236l<TransitStop, Boolean> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Integer $radius;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteStopSuggestionCardsProvider$loadCards$2$sortedCards$1(Context context, Integer num) {
        super(1);
        this.$context = context;
        this.$radius = num;
    }

    public final Object invoke(Object obj) {
        Float f;
        boolean z;
        TransitStop transitStop = (TransitStop) obj;
        C24362h.m61211f(transitStop, "stop");
        float d = C7530f.m17271d(this.$context, transitStop.f23732d);
        Integer num = this.$radius;
        if (num != null) {
            f = Float.valueOf((float) num.intValue());
        } else {
            f = null;
        }
        if (d < f.floatValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
