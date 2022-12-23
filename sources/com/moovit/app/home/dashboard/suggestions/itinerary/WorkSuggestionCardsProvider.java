package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import mf0.C24362h;
import p874vr.C20199a;
import q00.C19047a;
import q00.C19053d;

public final class WorkSuggestionCardsProvider extends C14972a {
    /* renamed from: d */
    public final String mo45165d() {
        return "suggestion_work";
    }

    /* renamed from: e */
    public final boolean mo45172e(Context context, C19047a aVar, LocationDescriptor locationDescriptor, float f, LinkedHashSet linkedHashSet) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(aVar, "conf");
        if (!super.mo45172e(context, aVar, locationDescriptor, f, linkedHashSet) || ((List) aVar.mo51505b(C19053d.f48464P)).contains(Integer.valueOf(Calendar.getInstance().get(7)))) {
            return false;
        }
        Integer num = (Integer) aVar.mo51505b(C20199a.f51291n1);
        Integer num2 = (Integer) aVar.mo51505b(C20199a.f51293o1);
        C24362h.m61210e(num, "startHour");
        int intValue = num.intValue();
        C24362h.m61210e(num2, "endHour");
        int intValue2 = num2.intValue();
        SimpleDateFormat simpleDateFormat = C7925b.f23934a;
        long currentTimeMillis = System.currentTimeMillis();
        if (intValue2 < intValue) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(currentTimeMillis);
        int i = instance.get(11);
        if (intValue > i || i >= intValue2) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45166f(android.content.Context r5, ff0.C23349c<? super java.lang.Iterable<com.moovit.app.useraccount.manager.favorites.LocationFavorite>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.moovit.app.home.dashboard.suggestions.itinerary.WorkSuggestionCardsProvider$getFavoriteLocations$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.moovit.app.home.dashboard.suggestions.itinerary.WorkSuggestionCardsProvider$getFavoriteLocations$1 r0 = (com.moovit.app.home.dashboard.suggestions.itinerary.WorkSuggestionCardsProvider$getFavoriteLocations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.moovit.app.home.dashboard.suggestions.itinerary.WorkSuggestionCardsProvider$getFavoriteLocations$1 r0 = new com.moovit.app.home.dashboard.suggestions.itinerary.WorkSuggestionCardsProvider$getFavoriteLocations$1
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
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r5 = r5.f43621e
            java.util.List r5 = p583jk.C17875h.m44280D(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.WorkSuggestionCardsProvider.mo45166f(android.content.Context, ff0.c):java.lang.Object");
    }

    /* renamed from: g */
    public final String mo45167g(Context context, LocationFavorite locationFavorite) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        String string = context.getString(R.string.dashboard_favorites_work);
        C24362h.m61210e(string, "context.getString(R.stri…dashboard_favorites_work)");
        return string;
    }
}
