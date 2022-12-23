package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.itinerary.CustomFavoriteSuggestionCardsProvider", mo58555f = "CustomFavoriteSuggestionCardsProvider.kt", mo58556l = {28}, mo58557m = "getFavoriteLocations")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CustomFavoriteSuggestionCardsProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1(CustomFavoriteSuggestionCardsProvider customFavoriteSuggestionCardsProvider, C23349c<? super CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1> cVar) {
        super(cVar);
        this.this$0 = customFavoriteSuggestionCardsProvider;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo45166f((Context) null, this);
    }
}
