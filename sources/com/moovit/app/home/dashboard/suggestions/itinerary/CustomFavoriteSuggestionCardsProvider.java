package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.transit.LocationDescriptor;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import uh0.C25081h;

public final class CustomFavoriteSuggestionCardsProvider extends C14972a {
    /* renamed from: d */
    public final String mo45165d() {
        return "suggestion_custom_favorite";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45166f(android.content.Context r5, ff0.C23349c<? super java.lang.Iterable<com.moovit.app.useraccount.manager.favorites.LocationFavorite>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.moovit.app.home.dashboard.suggestions.itinerary.CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.moovit.app.home.dashboard.suggestions.itinerary.CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1 r0 = (com.moovit.app.home.dashboard.suggestions.itinerary.CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.moovit.app.home.dashboard.suggestions.itinerary.CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1 r0 = new com.moovit.app.home.dashboard.suggestions.itinerary.CustomFavoriteSuggestionCardsProvider$getFavoriteLocations$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p584jl.C17885a.m44475z0(r6)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p584jl.C17885a.m44475z0(r6)
            lz.a r5 = ce0.C21100e.m49329X(r5)
            r0.label = r3
            java.lang.String r6 = "USER_ACCOUNT"
            java.lang.Object r6 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r5, r6, r0)
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.moovit.app.useraccount.manager.UserAccountManager r6 = (com.moovit.app.useraccount.manager.UserAccountManager) r6
            dy.e r5 = r6.mo46573d()
            java.util.List r5 = r5.mo49437k()
            java.lang.String r6 = "allLocationFavorites"
            mf0.C24362h.m61210e(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0059:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r1 = (com.moovit.app.useraccount.manager.favorites.LocationFavorite) r1
            T r1 = r1.f52687b
            com.moovit.transit.LocationDescriptor r1 = (com.moovit.transit.LocationDescriptor) r1
            com.moovit.transit.LocationDescriptor$LocationType r1 = r1.f23647b
            com.moovit.transit.LocationDescriptor$LocationType r2 = com.moovit.transit.LocationDescriptor.LocationType.STOP
            if (r1 == r2) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            if (r1 == 0) goto L_0x0059
            r6.add(r0)
            goto L_0x0059
        L_0x0079:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.CustomFavoriteSuggestionCardsProvider.mo45166f(android.content.Context, ff0.c):java.lang.Object");
    }

    /* renamed from: g */
    public final String mo45167g(Context context, LocationFavorite locationFavorite) {
        boolean z;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        String str = locationFavorite.f40599c;
        boolean z2 = false;
        if (str == null || !(!C25081h.m62831B(str))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str;
        }
        String str2 = ((LocationDescriptor) locationFavorite.f52687b).f23651f;
        if (str2 != null && (!C25081h.m62831B(str2))) {
            z2 = true;
        }
        if (z2) {
            C24362h.m61210e(str2, "title");
            return str2;
        }
        String g = ((LocationDescriptor) locationFavorite.f52687b).mo24314g();
        if (g == null) {
            return "";
        }
        return g;
    }
}
