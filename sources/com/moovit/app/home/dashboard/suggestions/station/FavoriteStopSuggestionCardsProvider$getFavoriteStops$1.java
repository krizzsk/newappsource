package com.moovit.app.home.dashboard.suggestions.station;

import android.content.Context;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider", mo58555f = "FavoriteStopSuggestionCardsProvider.kt", mo58556l = {79}, mo58557m = "getFavoriteStops")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class FavoriteStopSuggestionCardsProvider$getFavoriteStops$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C14982a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteStopSuggestionCardsProvider$getFavoriteStops$1(C14982a aVar, C23349c<? super FavoriteStopSuggestionCardsProvider$getFavoriteStops$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C14982a.m37852e(this.this$0, (Context) null, this);
    }
}
