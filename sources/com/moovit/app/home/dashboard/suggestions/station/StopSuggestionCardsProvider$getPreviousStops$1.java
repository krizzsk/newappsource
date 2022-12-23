package com.moovit.app.home.dashboard.suggestions.station;

import com.moovit.transit.TransitStop;
import com.usebutton.sdk.internal.models.Widget;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p474et.C16871c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Let/c;", "card", "Lcom/moovit/transit/TransitStop;", "invoke", "(Let/c;)Lcom/moovit/transit/TransitStop;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopSuggestionCardsProvider$getPreviousStops$1 extends Lambda implements C24236l<C16871c, TransitStop> {

    /* renamed from: f */
    public static final StopSuggestionCardsProvider$getPreviousStops$1 f38337f = new StopSuggestionCardsProvider$getPreviousStops$1();

    public StopSuggestionCardsProvider$getPreviousStops$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C16871c cVar = (C16871c) obj;
        C24362h.m61211f(cVar, Widget.VIEW_TYPE_CARD);
        return cVar.f43881c;
    }
}
