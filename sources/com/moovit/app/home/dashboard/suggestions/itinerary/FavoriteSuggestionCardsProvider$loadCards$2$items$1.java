package com.moovit.app.home.dashboard.suggestions.itinerary;

import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.transit.LocationDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "", "fl", "Lcom/moovit/app/useraccount/manager/favorites/LocationFavorite;", "invoke", "(Lcom/moovit/app/useraccount/manager/favorites/LocationFavorite;)Ljava/lang/Boolean;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class FavoriteSuggestionCardsProvider$loadCards$2$items$1 extends Lambda implements C24236l<LocationFavorite, Boolean> {

    /* renamed from: f */
    public static final FavoriteSuggestionCardsProvider$loadCards$2$items$1 f38306f = new FavoriteSuggestionCardsProvider$loadCards$2$items$1();

    public FavoriteSuggestionCardsProvider$loadCards$2$items$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        LocationFavorite locationFavorite = (LocationFavorite) obj;
        C24362h.m61211f(locationFavorite, "fl");
        if (((LocationDescriptor) locationFavorite.f52687b).mo24310d() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
