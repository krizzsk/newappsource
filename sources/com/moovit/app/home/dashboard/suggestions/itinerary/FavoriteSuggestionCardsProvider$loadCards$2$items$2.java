package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.location.Location;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.transit.LocationDescriptor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo59060d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/moovit/app/useraccount/manager/favorites/LocationFavorite;", "", "fl", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class FavoriteSuggestionCardsProvider$loadCards$2$items$2 extends Lambda implements C24236l<LocationFavorite, Pair<? extends LocationFavorite, ? extends Float>> {
    public final /* synthetic */ Location $userLocation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteSuggestionCardsProvider$loadCards$2$items$2(Location location) {
        super(1);
        this.$userLocation = location;
    }

    public final Object invoke(Object obj) {
        LocationFavorite locationFavorite = (LocationFavorite) obj;
        C24362h.m61211f(locationFavorite, "fl");
        return new Pair(locationFavorite, Float.valueOf(((LocationDescriptor) locationFavorite.f52687b).mo24310d().mo46918d(this.$userLocation)));
    }
}
