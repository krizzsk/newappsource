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

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.itinerary.RecentSearchSuggestionCardsProvider$loadCards$2", mo58555f = "RecentSearchSuggestionCardsProvider.kt", mo58556l = {40}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Let/f;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class RecentSearchSuggestionCardsProvider$loadCards$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C16874f>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C16876h $sharedState;
    public int label;
    public final /* synthetic */ C14977f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentSearchSuggestionCardsProvider$loadCards$2(Context context, C14977f fVar, C16876h hVar, C23349c<? super RecentSearchSuggestionCardsProvider$loadCards$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.this$0 = fVar;
        this.$sharedState = hVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new RecentSearchSuggestionCardsProvider$loadCards$2(this.$context, this.this$0, this.$sharedState, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((RecentSearchSuggestionCardsProvider$loadCards$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0117, code lost:
        if (r0 != false) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0019
            if (r2 != r3) goto L_0x0011
            p584jl.C17885a.m44475z0(r20)
            r2 = r20
            goto L_0x002d
        L_0x0011:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0019:
            p584jl.C17885a.m44475z0(r20)
            android.content.Context r2 = r0.$context
            lz.a r2 = ce0.C21100e.m49329X(r2)
            r0.label = r3
            java.lang.String r4 = "CONFIGURATION"
            java.lang.Object r2 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r2, r4, r0)
            if (r2 != r1) goto L_0x002d
            return r1
        L_0x002d:
            q00.a r2 = (q00.C19047a) r2
            r00.f r1 = p874vr.C20199a.f51289m1
            java.lang.Object r1 = r2.mo51505b(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            com.moovit.app.home.dashboard.suggestions.itinerary.f r4 = r0.this$0
            android.content.Context r5 = r0.$context
            r4.getClass()
            lz.a r4 = ce0.C21100e.m49329X(r5)
            java.lang.String r5 = "HISTORY"
            java.lang.Object r4 = r4.mo50700l(r5)
            at.c r4 = (p372at.C13516c) r4
            c00.m<com.moovit.app.history.model.HistoryItem> r4 = r4.f33436d
            java.util.List r4 = r4.mo40647e()
            java.lang.String r5 = "historyController.historyItems"
            mf0.C24362h.m61210e(r4, r5)
            com.moovit.app.home.dashboard.suggestions.itinerary.f r5 = r0.this$0
            java.lang.String r6 = "timeProximity"
            mf0.C24362h.m61210e(r1, r6)
            long r6 = r1.longValue()
            r5.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x006c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0134
            java.lang.Object r8 = r4.next()
            r9 = r8
            com.moovit.app.history.model.HistoryItem r9 = (com.moovit.app.history.model.HistoryItem) r9
            at.d r11 = new at.d
            r11.<init>()
            java.lang.Object r11 = r9.mo45080Z1(r11)
            com.moovit.tripplanner.TripPlannerOptions r11 = (com.moovit.tripplanner.TripPlannerOptions) r11
            com.moovit.tripplanner.TripPlannerTime r11 = r11.mo24463V()
            java.lang.String r12 = "getTripPlannerOptions(historyItem).time"
            mf0.C24362h.m61210e(r11, r12)
            boolean r12 = r11.mo24489d()
            if (r12 == 0) goto L_0x0098
            long r11 = r9.getCreationTime()
            goto L_0x009c
        L_0x0098:
            long r11 = r11.mo24487b()
        L_0x009c:
            java.text.SimpleDateFormat r9 = com.moovit.util.time.C7925b.f23934a
            long r13 = java.lang.System.currentTimeMillis()
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x00a8
            r9 = 0
            goto L_0x00ad
        L_0x00a8:
            boolean r9 = com.moovit.util.time.C7925b.m18027o(r13, r11)
            r9 = r9 ^ r3
        L_0x00ad:
            if (r9 != 0) goto L_0x00b4
            r17 = r1
            r16 = r4
            goto L_0x011b
        L_0x00b4:
            long r13 = java.lang.System.currentTimeMillis()
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            r9.setTimeInMillis(r13)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            r15.setTimeInMillis(r11)
            int r10 = r9.get(r3)
            r3 = 2
            int r3 = r9.get(r3)
            r16 = r4
            r4 = 5
            int r4 = r9.get(r4)
            r15.set(r10, r3, r4)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r3.toSeconds(r13)
            r17 = r1
            long r0 = r15.getTimeInMillis()
            long r0 = r3.toSeconds(r0)
            long r9 = r9 - r0
            long r0 = java.lang.Math.abs(r9)
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00f4
            r0 = 1
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r0 == 0) goto L_0x011b
            boolean r0 = r5.f38334a
            if (r0 == 0) goto L_0x0119
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r13)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTimeInMillis(r11)
            r3 = 7
            int r0 = r0.get(r3)
            int r1 = r1.get(r3)
            if (r0 != r1) goto L_0x0116
            r0 = 1
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            if (r0 == 0) goto L_0x011b
        L_0x0119:
            r10 = 1
            goto L_0x011c
        L_0x011b:
            r10 = 0
        L_0x011c:
            if (r10 == 0) goto L_0x012b
            r0 = r17
            r0.add(r8)
            r3 = 1
            r1 = r0
            r4 = r16
            r0 = r19
            goto L_0x006c
        L_0x012b:
            r3 = 1
            r0 = r19
            r4 = r16
            r1 = r17
            goto L_0x006c
        L_0x0134:
            r18 = r1
            r1 = r0
            r0 = r18
            com.moovit.app.home.dashboard.suggestions.itinerary.f r3 = r1.this$0
            android.content.Context r10 = r1.$context
            et.h r4 = r1.$sharedState
            r3.getClass()
            java.util.LinkedHashSet r11 = com.moovit.app.home.dashboard.suggestions.itinerary.C14973b.m37836c(r4)
            java.util.Iterator r12 = r0.iterator()
        L_0x014a:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x017f
            java.lang.Object r13 = r12.next()
            r4 = r13
            com.moovit.app.history.model.HistoryItem r4 = (com.moovit.app.history.model.HistoryItem) r4
            at.e r5 = new at.e
            r5.<init>()
            java.lang.Object r4 = r4.mo45080Z1(r5)
            com.moovit.transit.Journey r4 = (com.moovit.transit.Journey) r4
            com.moovit.transit.LocationDescriptor r7 = r4.f23644c
            com.moovit.commons.geo.LatLonE6 r4 = r7.mo24310d()
            float r8 = aa0.C7530f.m17271d(r10, r4)
            float r4 = r3.f38335b
            float r4 = java.lang.Math.max(r4, r8)
            r3.f38335b = r4
            r4 = r3
            r5 = r10
            r6 = r2
            r9 = r11
            boolean r4 = r4.mo45172e(r5, r6, r7, r8, r9)
            if (r4 == 0) goto L_0x014a
            goto L_0x0180
        L_0x017f:
            r13 = 0
        L_0x0180:
            com.moovit.app.history.model.HistoryItem r13 = (com.moovit.app.history.model.HistoryItem) r13
            if (r13 != 0) goto L_0x019a
            et.f r2 = new et.f
            com.moovit.app.home.dashboard.suggestions.itinerary.f r3 = r1.this$0
            java.lang.String r3 = r3.mo45165d()
            boolean r0 = r0.isEmpty()
            com.moovit.app.home.dashboard.suggestions.itinerary.f r4 = r1.this$0
            float r4 = r4.f38335b
            r5 = 8
            r2.<init>((java.lang.String) r3, (boolean) r0, (float) r4, (int) r5)
            return r2
        L_0x019a:
            et.a r0 = new et.a
            com.moovit.app.home.dashboard.suggestions.itinerary.f r2 = r1.this$0
            java.lang.String r2 = r2.mo45165d()
            r3 = 2131888815(0x7f120aaf, float:1.9412276E38)
            at.e r4 = new at.e
            r4.<init>()
            java.lang.Object r4 = r13.mo45080Z1(r4)
            com.moovit.transit.Journey r4 = (com.moovit.transit.Journey) r4
            com.moovit.transit.LocationDescriptor r4 = r4.f23643b
            java.lang.String r5 = "getJourney(item).origin"
            mf0.C24362h.m61210e(r4, r5)
            at.e r5 = new at.e
            r5.<init>()
            java.lang.Object r5 = r13.mo45080Z1(r5)
            com.moovit.transit.Journey r5 = (com.moovit.transit.Journey) r5
            com.moovit.transit.LocationDescriptor r5 = r5.f23644c
            java.lang.String r6 = "getJourney(item).destination"
            mf0.C24362h.m61210e(r5, r6)
            r0.<init>(r2, r3, r4, r5)
            et.f r2 = new et.f
            com.moovit.app.home.dashboard.suggestions.itinerary.f r3 = r1.this$0
            java.lang.String r3 = r3.mo45165d()
            com.moovit.app.home.dashboard.suggestions.itinerary.f r4 = r1.this$0
            float r4 = r4.f38335b
            java.util.List r0 = p583jk.C17875h.m44280D(r0)
            r5 = 0
            r2.<init>((java.lang.String) r3, (boolean) r5, (float) r4, (java.util.List<? extends p474et.C16872d>) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.RecentSearchSuggestionCardsProvider$loadCards$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
