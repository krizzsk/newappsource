package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.app.Application;
import ff0.C23349c;
import p474et.C16876h;
import wh0.C25177g;
import wh0.C25184i0;

/* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.g */
public final class C14978g extends C14973b {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m37845f(com.moovit.app.home.dashboard.suggestions.itinerary.C14978g r6, android.content.Context r7, p646lz.C18299a r8, com.moovit.app.history.itinerary.ItineraryHistoryItem r9, ff0.C23349c r10) {
        /*
            r6.getClass()
            boolean r0 = r10 instanceof com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider$retrieveDestination$1
            if (r0 == 0) goto L_0x0016
            r0 = r10
            com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider$retrieveDestination$1 r0 = (com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider$retrieveDestination$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider$retrieveDestination$1 r0 = new com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider$retrieveDestination$1
            r0.<init>(r6, r10)
        L_0x001b:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r4) goto L_0x003a
            if (r1 != r3) goto L_0x0032
            java.lang.Object r7 = r0.L$0
            com.moovit.transit.LocationDescriptor r7 = (com.moovit.transit.LocationDescriptor) r7
            p584jl.C17885a.m44475z0(r6)
            goto L_0x0092
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r7 = r0.L$1
            com.moovit.transit.LocationDescriptor r7 = (com.moovit.transit.LocationDescriptor) r7
            java.lang.Object r8 = r0.L$0
            android.content.Context r8 = (android.content.Context) r8
            p584jl.C17885a.m44475z0(r6)
            goto L_0x0072
        L_0x0046:
            p584jl.C17885a.m44475z0(r6)
            com.moovit.itinerary.model.Itinerary r6 = r9.f38130c
            com.moovit.itinerary.model.leg.Leg r6 = r6.mo48289b()
            com.moovit.transit.LocationDescriptor r6 = r6.mo48332W()
            java.lang.String r9 = "tripPlanSelectedItinerar…itinerary.firstLeg.origin"
            mf0.C24362h.m61210e(r6, r9)
            com.moovit.transit.LocationDescriptor$LocationType r9 = r6.f23647b
            com.moovit.transit.LocationDescriptor$LocationType r1 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT
            if (r9 == r1) goto L_0x005f
            goto L_0x009c
        L_0x005f:
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r4
            java.lang.String r9 = "METRO_CONTEXT"
            java.lang.Object r8 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r8, r9, r0)
            if (r8 != r10) goto L_0x006e
            goto L_0x009d
        L_0x006e:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x0072:
            tp.f r6 = (p824tp.C19728f) r6
            com.moovit.commons.geo.LatLonE6 r9 = r7.mo24310d()
            com.moovit.transit.LocationDescriptor r9 = com.moovit.transit.LocationDescriptor.m17770k(r9)
            com.google.android.gms.tasks.Task r6 = aa0.C7530f.m17272e(r8, r6, r9)
            java.lang.String r8 = "performGeocodingLocation…text, metroContext, copy)"
            mf0.C24362h.m61210e(r6, r8)
            r0.L$0 = r7
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = com.moovit.commons.async.AsyncExtKt.m40163a(r6, r0)
            if (r6 != r10) goto L_0x0092
            goto L_0x009d
        L_0x0092:
            com.moovit.transit.LocationDescriptor r6 = (com.moovit.transit.LocationDescriptor) r6
            boolean r7 = mf0.C24362h.m61206a(r7, r6)
            if (r7 == 0) goto L_0x009c
            r10 = r2
            goto L_0x009d
        L_0x009c:
            r10 = r6
        L_0x009d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.C14978g.m37845f(com.moovit.app.home.dashboard.suggestions.itinerary.g, android.content.Context, lz.a, com.moovit.app.history.itinerary.ItineraryHistoryItem, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo45182b(Application application, C16876h hVar, C23349c cVar) {
        return C25177g.m63221e(C25184i0.f63460b, new ReturnTripSuggestionCardsProvider$loadCards$2(application, this, hVar, (C23349c<? super ReturnTripSuggestionCardsProvider$loadCards$2>) null), cVar);
    }

    /* renamed from: d */
    public final String mo45165d() {
        return "suggestion_return_trip";
    }
}
