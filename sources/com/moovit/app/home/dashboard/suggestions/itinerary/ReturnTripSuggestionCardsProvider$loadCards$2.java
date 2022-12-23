package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p474et.C16874f;
import p474et.C16876h;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider$loadCards$2", mo58555f = "ReturnTripSuggestionCardsProvider.kt", mo58556l = {38, 48, 55}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Let/f;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class ReturnTripSuggestionCardsProvider$loadCards$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C16874f>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C16876h $sharedState;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C14978g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReturnTripSuggestionCardsProvider$loadCards$2(Context context, C14978g gVar, C16876h hVar, C23349c<? super ReturnTripSuggestionCardsProvider$loadCards$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.this$0 = gVar;
        this.$sharedState = hVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new ReturnTripSuggestionCardsProvider$loadCards$2(this.$context, this.this$0, this.$sharedState, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ReturnTripSuggestionCardsProvider$loadCards$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r4) goto L_0x0038
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            long r0 = r11.J$0
            java.lang.Object r2 = r11.L$1
            com.moovit.transit.LocationDescriptor r2 = (com.moovit.transit.LocationDescriptor) r2
            java.lang.Object r3 = r11.L$0
            com.moovit.transit.LocationDescriptor r3 = (com.moovit.transit.LocationDescriptor) r3
            p584jl.C17885a.m44475z0(r12)
            r8 = r2
            r9 = r3
            goto L_0x00cd
        L_0x0020:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0028:
            java.lang.Object r1 = r11.L$2
            com.moovit.app.history.itinerary.ItineraryHistoryItem r1 = (com.moovit.app.history.itinerary.ItineraryHistoryItem) r1
            java.lang.Object r3 = r11.L$1
            com.moovit.transit.LocationDescriptor r3 = (com.moovit.transit.LocationDescriptor) r3
            java.lang.Object r4 = r11.L$0
            lz.a r4 = (p646lz.C18299a) r4
            p584jl.C17885a.m44475z0(r12)
            goto L_0x0094
        L_0x0038:
            java.lang.Object r1 = r11.L$0
            lz.a r1 = (p646lz.C18299a) r1
            p584jl.C17885a.m44475z0(r12)
            r4 = r1
            goto L_0x0059
        L_0x0041:
            p584jl.C17885a.m44475z0(r12)
            android.content.Context r12 = r11.$context
            lz.a r12 = ce0.C21100e.m49329X(r12)
            r11.L$0 = r12
            r11.label = r4
            java.lang.String r1 = "LATEST_ITINERARY_CONTROLLER"
            java.lang.Object r1 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r12, r1, r11)
            if (r1 != r0) goto L_0x0057
            return r0
        L_0x0057:
            r4 = r12
            r12 = r1
        L_0x0059:
            bt.b r12 = (p396bt.C13682b) r12
            android.content.Context r1 = r11.$context
            android.location.Location r1 = ce0.C21100e.m49339f0(r1)
            if (r1 != 0) goto L_0x006a
            com.moovit.app.home.dashboard.suggestions.itinerary.g r12 = r11.this$0
            et.f r12 = r12.mo45183a()
            return r12
        L_0x006a:
            com.moovit.commons.geo.LatLonE6 r1 = com.moovit.commons.geo.LatLonE6.m40177j(r1)
            com.moovit.transit.LocationDescriptor r1 = com.moovit.transit.LocationDescriptor.m17770k(r1)
            com.moovit.app.history.itinerary.ItineraryHistoryItem r12 = r12.f33720d
            if (r12 != 0) goto L_0x007d
            com.moovit.app.home.dashboard.suggestions.itinerary.g r12 = r11.this$0
            et.f r12 = r12.mo45183a()
            return r12
        L_0x007d:
            com.moovit.app.home.dashboard.suggestions.itinerary.g r5 = r11.this$0
            android.content.Context r6 = r11.$context
            r11.L$0 = r4
            r11.L$1 = r1
            r11.L$2 = r12
            r11.label = r3
            java.lang.Object r3 = com.moovit.app.home.dashboard.suggestions.itinerary.C14978g.m37845f(r5, r6, r4, r12, r11)
            if (r3 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r10 = r1
            r1 = r12
            r12 = r3
            r3 = r10
        L_0x0094:
            com.moovit.transit.LocationDescriptor r12 = (com.moovit.transit.LocationDescriptor) r12
            if (r12 != 0) goto L_0x009f
            com.moovit.app.home.dashboard.suggestions.itinerary.g r12 = r11.this$0
            et.f r12 = r12.mo45183a()
            return r12
        L_0x009f:
            com.moovit.app.suggestedroutes.TripPlanOptions r5 = r1.f38129b
            com.moovit.tripplanner.TripPlannerTime r5 = r5.f39803b
            java.lang.String r6 = "tripPlanSelectedItinerary.options.time"
            mf0.C24362h.m61210e(r5, r6)
            boolean r6 = r5.mo24489d()
            if (r6 == 0) goto L_0x00b1
            long r5 = r1.f38131d
            goto L_0x00b5
        L_0x00b1:
            long r5 = r5.mo24487b()
        L_0x00b5:
            r11.L$0 = r3
            r11.L$1 = r12
            r1 = 0
            r11.L$2 = r1
            r11.J$0 = r5
            r11.label = r2
            java.lang.String r1 = "CONFIGURATION"
            java.lang.Object r1 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r4, r1, r11)
            if (r1 != r0) goto L_0x00c9
            return r0
        L_0x00c9:
            r8 = r12
            r12 = r1
            r9 = r3
            r0 = r5
        L_0x00cd:
            r4 = r12
            q00.a r4 = (q00.C19047a) r4
            android.content.Context r12 = r11.$context
            com.moovit.commons.geo.LatLonE6 r2 = r8.mo24310d()
            float r12 = aa0.C7530f.m17271d(r12, r2)
            com.moovit.app.home.dashboard.suggestions.itinerary.g r2 = r11.this$0
            et.h r3 = r11.$sharedState
            r2.getClass()
            java.util.LinkedHashSet r7 = com.moovit.app.home.dashboard.suggestions.itinerary.C14973b.m37836c(r3)
            java.text.SimpleDateFormat r2 = com.moovit.util.time.C7925b.f23934a
            boolean r0 = android.text.format.DateUtils.isToday(r0)
            if (r0 == 0) goto L_0x011d
            com.moovit.app.home.dashboard.suggestions.itinerary.g r2 = r11.this$0
            android.content.Context r3 = r11.$context
            r5 = r8
            r6 = r12
            boolean r0 = r2.mo45172e(r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x011d
            et.a r0 = new et.a
            com.moovit.app.home.dashboard.suggestions.itinerary.g r1 = r11.this$0
            r1.getClass()
            r1 = 2131888821(0x7f120ab5, float:1.9412288E38)
            java.lang.String r2 = "origin"
            mf0.C24362h.m61210e(r9, r2)
            java.lang.String r2 = "suggestion_return_trip"
            r0.<init>(r2, r1, r9, r8)
            et.f r1 = new et.f
            com.moovit.app.home.dashboard.suggestions.itinerary.g r3 = r11.this$0
            r3.getClass()
            r3 = 0
            java.util.List r0 = p583jk.C17875h.m44280D(r0)
            r1.<init>((java.lang.String) r2, (boolean) r3, (float) r12, (java.util.List<? extends p474et.C16872d>) r0)
            return r1
        L_0x011d:
            com.moovit.app.home.dashboard.suggestions.itinerary.g r12 = r11.this$0
            et.f r12 = r12.mo45183a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.ReturnTripSuggestionCardsProvider$loadCards$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
