package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.app.Application;
import android.content.Context;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import ff0.C23349c;
import p474et.C16876h;
import wh0.C25177g;
import wh0.C25184i0;

/* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.a */
public abstract class C14972a extends C14973b {

    /* renamed from: a */
    public final int f38331a = 1;

    /* renamed from: b */
    public final Object mo45182b(Application application, C16876h hVar, C23349c cVar) {
        return C25177g.m63221e(C25184i0.f63460b, new FavoriteSuggestionCardsProvider$loadCards$2(application, hVar, this, (C23349c) null), cVar);
    }

    /* renamed from: f */
    public abstract Object mo45166f(Context context, C23349c<? super Iterable<LocationFavorite>> cVar);

    /* renamed from: g */
    public abstract String mo45167g(Context context, LocationFavorite locationFavorite);
}
