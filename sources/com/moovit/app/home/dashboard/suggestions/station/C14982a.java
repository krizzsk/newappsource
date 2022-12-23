package com.moovit.app.home.dashboard.suggestions.station;

import android.app.Application;
import ff0.C23349c;
import p474et.C16876h;
import p546ht.C17490c;
import wh0.C25177g;
import wh0.C25184i0;

/* renamed from: com.moovit.app.home.dashboard.suggestions.station.a */
public final class C14982a extends C17490c {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m37852e(com.moovit.app.home.dashboard.suggestions.station.C14982a r4, android.content.Context r5, ff0.C23349c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$getFavoriteStops$1
            if (r0 == 0) goto L_0x0016
            r0 = r6
            com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$getFavoriteStops$1 r0 = (com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$getFavoriteStops$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$getFavoriteStops$1 r0 = new com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$getFavoriteStops$1
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            p584jl.C17885a.m44475z0(r4)
            goto L_0x0044
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            p584jl.C17885a.m44475z0(r4)
            lz.a r4 = ce0.C21100e.m49329X(r5)
            r0.label = r2
            java.lang.String r5 = "USER_ACCOUNT"
            java.lang.Object r4 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r4, r5, r0)
            if (r4 != r6) goto L_0x0044
            goto L_0x0053
        L_0x0044:
            com.moovit.app.useraccount.manager.UserAccountManager r4 = (com.moovit.app.useraccount.manager.UserAccountManager) r4
            dy.e r4 = r4.mo46573d()
            java.util.List r6 = r4.mo49438l()
            java.lang.String r4 = "uam.favoritesManager.allStopFavorite"
            mf0.C24362h.m61210e(r6, r4)
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.station.C14982a.m37852e(com.moovit.app.home.dashboard.suggestions.station.a, android.content.Context, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo45182b(Application application, C16876h hVar, C23349c cVar) {
        return C25177g.m63221e(C25184i0.f63460b, new FavoriteStopSuggestionCardsProvider$loadCards$2(this, application, (C23349c<? super FavoriteStopSuggestionCardsProvider$loadCards$2>) null), cVar);
    }

    /* renamed from: d */
    public final String mo45187d() {
        return "suggestion_favorite_station";
    }
}
