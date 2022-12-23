package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p474et.C16874f;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.itinerary.LatestItinerarySuggestionCardProvider$loadCards$2", mo58555f = "LatestItinerarySuggestionCardProvider.kt", mo58556l = {32, 38}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Let/f;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class LatestItinerarySuggestionCardProvider$loadCards$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C16874f>, Object> {
    public final /* synthetic */ Context $context;
    public Object L$0;
    public int label;
    public final /* synthetic */ C14976e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LatestItinerarySuggestionCardProvider$loadCards$2(Context context, C14976e eVar, C23349c<? super LatestItinerarySuggestionCardProvider$loadCards$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.this$0 = eVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new LatestItinerarySuggestionCardProvider$loadCards$2(this.$context, this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LatestItinerarySuggestionCardProvider$loadCards$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r10.L$0
            com.moovit.app.history.itinerary.ItineraryHistoryItem r0 = (com.moovit.app.history.itinerary.ItineraryHistoryItem) r0
            p584jl.C17885a.m44475z0(r11)
            goto L_0x0056
        L_0x0014:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001c:
            java.lang.Object r1 = r10.L$0
            lz.a r1 = (p646lz.C18299a) r1
            p584jl.C17885a.m44475z0(r11)
            goto L_0x003a
        L_0x0024:
            p584jl.C17885a.m44475z0(r11)
            android.content.Context r11 = r10.$context
            lz.a r1 = ce0.C21100e.m49329X(r11)
            r10.L$0 = r1
            r10.label = r3
            java.lang.String r11 = "LATEST_ITINERARY_CONTROLLER"
            java.lang.Object r11 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r1, r11, r10)
            if (r11 != r0) goto L_0x003a
            return r0
        L_0x003a:
            bt.b r11 = (p396bt.C13682b) r11
            com.moovit.app.history.itinerary.ItineraryHistoryItem r11 = r11.f33720d
            if (r11 != 0) goto L_0x0047
            com.moovit.app.home.dashboard.suggestions.itinerary.e r11 = r10.this$0
            et.f r11 = r11.mo45183a()
            return r11
        L_0x0047:
            r10.L$0 = r11
            r10.label = r2
            java.lang.String r2 = "CONFIGURATION"
            java.lang.Object r1 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r1, r2, r10)
            if (r1 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r0 = r11
            r11 = r1
        L_0x0056:
            q00.a r11 = (q00.C19047a) r11
            q00.d$d r1 = q00.C19053d.f48484w
            java.lang.Object r11 = r11.mo51505b(r1)
            java.lang.String r1 = "configuration[SysConfigs…SIT_LINE_REAL_TIME_RANGE]"
            mf0.C24362h.m61210e(r11, r1)
            zz.l0 r11 = (p977zz.C20950l0) r11
            com.moovit.app.suggestedroutes.TripPlanOptions r1 = r0.f38129b
            com.moovit.tripplanner.TripPlannerTime r1 = r1.f39803b
            java.lang.String r2 = "tripPlanSelectedItinerary.options.time"
            mf0.C24362h.m61210e(r1, r2)
            boolean r2 = r1.mo24489d()
            if (r2 == 0) goto L_0x0077
            long r1 = r0.f38131d
            goto L_0x007b
        L_0x0077:
            long r1 = r1.mo24487b()
        L_0x007b:
            com.moovit.itinerary.model.Itinerary r0 = r0.f38130c
            java.text.SimpleDateFormat r4 = com.moovit.util.time.C7925b.f23934a
            boolean r1 = android.text.format.DateUtils.isToday(r1)
            if (r1 == 0) goto L_0x00ce
            com.moovit.app.home.dashboard.suggestions.itinerary.e r1 = r10.this$0
            r1.getClass()
            java.lang.String r1 = "itinerary"
            mf0.C24362h.m61211f(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            com.moovit.util.time.Time r4 = r0.mo48288K1()
            long r4 = r4.mo24631g()
            T r11 = r11.f52696b
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            r8 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 * r8
            long r6 = r6 + r4
            r11 = 0
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r3 = 0
        L_0x00b0:
            if (r3 == 0) goto L_0x00ce
            et.b r1 = new et.b
            com.moovit.app.home.dashboard.suggestions.itinerary.e r2 = r10.this$0
            r2.getClass()
            r1.<init>(r0)
            et.f r0 = new et.f
            com.moovit.app.home.dashboard.suggestions.itinerary.e r2 = r10.this$0
            r2.getClass()
            r2 = 0
            java.util.List r1 = p583jk.C17875h.m44280D(r1)
            java.lang.String r3 = "suggestion_latest_route"
            r0.<init>((java.lang.String) r3, (boolean) r11, (float) r2, (java.util.List<? extends p474et.C16872d>) r1)
            return r0
        L_0x00ce:
            com.moovit.app.home.dashboard.suggestions.itinerary.e r11 = r10.this$0
            et.f r11 = r11.mo45183a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.LatestItinerarySuggestionCardProvider$loadCards$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
