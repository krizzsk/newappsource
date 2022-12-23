package com.moovit.app.home.dashboard.suggestions.station;

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

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.station.NearbyStopSuggestionCardProvider$loadCards$2", mo58555f = "NearbyStopSuggestionCardProvider.kt", mo58556l = {38, 39}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Let/f;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class NearbyStopSuggestionCardProvider$loadCards$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C16874f>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C16876h $sharedState;
    public Object L$0;
    public int label;
    public final /* synthetic */ C14983b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyStopSuggestionCardProvider$loadCards$2(Context context, C14983b bVar, C16876h hVar, C23349c<? super NearbyStopSuggestionCardProvider$loadCards$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.this$0 = bVar;
        this.$sharedState = hVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new NearbyStopSuggestionCardProvider$loadCards$2(this.$context, this.this$0, this.$sharedState, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopSuggestionCardProvider$loadCards$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008e A[LOOP:0: B:16:0x0088->B:18:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r7.L$0
            q00.a r0 = (q00.C19047a) r0
            p584jl.C17885a.m44475z0(r8)
            goto L_0x004b
        L_0x0014:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001c:
            java.lang.Object r1 = r7.L$0
            lz.a r1 = (p646lz.C18299a) r1
            p584jl.C17885a.m44475z0(r8)
            goto L_0x003a
        L_0x0024:
            p584jl.C17885a.m44475z0(r8)
            android.content.Context r8 = r7.$context
            lz.a r1 = ce0.C21100e.m49329X(r8)
            r7.L$0 = r1
            r7.label = r3
            java.lang.String r8 = "CONFIGURATION"
            java.lang.Object r8 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r1, r8, r7)
            if (r8 != r0) goto L_0x003a
            return r0
        L_0x003a:
            q00.a r8 = (q00.C19047a) r8
            r7.L$0 = r8
            r7.label = r2
            java.lang.String r2 = "METRO_CONTEXT"
            java.lang.Object r1 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r1, r2, r7)
            if (r1 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r0 = r8
            r8 = r1
        L_0x004b:
            tp.f r8 = (p824tp.C19728f) r8
            r00.d r1 = p874vr.C20199a.f51287l1
            java.lang.Object r0 = r0.mo51505b(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            android.content.Context r1 = r7.$context
            com.moovit.location.a r1 = com.moovit.location.C16202a.get(r1)
            uz.g r1 = r1.getPermissionAwareHighAccuracyFrequentUpdates()
            android.location.Location r1 = r1.mo50014i()
            com.moovit.commons.geo.LatLonE6 r1 = com.moovit.commons.geo.LatLonE6.m40177j(r1)
            java.lang.String r2 = "radius"
            mf0.C24362h.m61210e(r0, r2)
            int r0 = r0.intValue()
            java.util.HashSet r0 = com.moovit.map.items.C16283a.m41527Q(r0, r1)
            com.moovit.app.home.dashboard.suggestions.station.b r1 = r7.this$0
            android.content.Context r2 = r7.$context
            r1.getClass()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            c70.e r2 = ce0.C21100e.m49341g0(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0088:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r0.next()
            android.graphics.Point r4 = (android.graphics.Point) r4
            com.moovit.map.items.a r5 = new com.moovit.map.items.a
            com.moovit.map.items.MapItem$Type r6 = com.moovit.map.items.MapItem.Type.STOP
            r5.<init>(r2, r6, r4)
            wz.g r4 = r5.mo52626J()
            com.moovit.map.items.b r4 = (com.moovit.map.items.C16284b) r4
            java.util.List<com.moovit.map.items.MapItem> r4 = r4.f42557m
            java.lang.String r5 = "response.mapItems"
            mf0.C24362h.m61210e(r4, r5)
            r1.addAll(r4)
            goto L_0x0088
        L_0x00ac:
            com.moovit.app.home.dashboard.suggestions.station.b r0 = r7.this$0
            android.content.Context r2 = r7.$context
            r0.getClass()
            java.util.List r8 = p546ht.C17490c.m43607c(r2, r8, r1)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00c4
            com.moovit.app.home.dashboard.suggestions.station.b r8 = r7.this$0
            et.f r8 = r8.mo45183a()
            return r8
        L_0x00c4:
            com.moovit.app.home.dashboard.suggestions.station.b r0 = r7.this$0
            et.h r1 = r7.$sharedState
            r0.getClass()
            java.lang.String r0 = "sharedState"
            mf0.C24362h.m61211f(r1, r0)
            java.util.List<et.d> r0 = r1.f43894c
            cf0.p r0 = kotlin.collections.C23825c.m58506c0(r0)
            com.moovit.app.home.dashboard.suggestions.station.StopSuggestionCardsProvider$getPreviousStops$$inlined$filterIsInstance$1 r1 = com.moovit.app.home.dashboard.suggestions.station.C14979x5e814bf7.f38336f
            th0.e r0 = kotlin.sequences.C24177b.m60543d0(r0, r1)
            com.moovit.app.home.dashboard.suggestions.station.StopSuggestionCardsProvider$getPreviousStops$1 r1 = com.moovit.app.home.dashboard.suggestions.station.StopSuggestionCardsProvider$getPreviousStops$1.f38337f
            th0.n r0 = kotlin.sequences.C24177b.m60549j0(r0, r1)
            java.util.List r0 = kotlin.sequences.C24177b.m60553n0(r0)
            java.util.List r0 = p583jk.C17875h.m44285I(r0)
            com.moovit.app.home.dashboard.suggestions.station.b r1 = r7.this$0
            android.content.Context r2 = r7.$context
            r1.getClass()
            java.lang.String r1 = "context"
            mf0.C24362h.m61211f(r2, r1)
            com.moovit.app.home.dashboard.suggestions.station.StopSuggestionCardsProvider$getDistanceComparator$1 r1 = new com.moovit.app.home.dashboard.suggestions.station.StopSuggestionCardsProvider$getDistanceComparator$1
            r1.<init>(r2)
            ht.b r2 = new ht.b
            r2.<init>(r1)
            java.util.List r8 = kotlin.collections.C23825c.m58496H0(r8, r2)
            java.lang.Object r8 = kotlin.collections.C23825c.m58513j0(r8)
            com.moovit.transit.TransitStop r8 = (com.moovit.transit.TransitStop) r8
            com.moovit.app.home.dashboard.suggestions.station.b r1 = r7.this$0
            r1.getClass()
            java.lang.String r1 = "stop1"
            mf0.C24362h.m61211f(r8, r1)
            java.lang.String r1 = "stops"
            mf0.C24362h.m61211f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x011d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0137
            java.lang.Object r1 = r0.next()
            r2 = r1
            j40.a r2 = (j40.C5384a) r2
            com.moovit.network.model.ServerId r4 = r8.f23730b
            com.moovit.network.model.ServerId r2 = r2.getServerId()
            boolean r2 = mf0.C24362h.m61206a(r4, r2)
            if (r2 == 0) goto L_0x011d
            goto L_0x0138
        L_0x0137:
            r1 = 0
        L_0x0138:
            r0 = 0
            if (r1 == 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r3 = 0
        L_0x013d:
            r1 = 0
            java.lang.String r2 = "suggestion_nearby_station"
            if (r3 == 0) goto L_0x014f
            et.f r8 = new et.f
            com.moovit.app.home.dashboard.suggestions.station.b r3 = r7.this$0
            r3.getClass()
            r3 = 12
            r8.<init>((java.lang.String) r2, (boolean) r0, (float) r1, (int) r3)
            return r8
        L_0x014f:
            et.c r3 = new et.c
            com.moovit.app.home.dashboard.suggestions.station.b r4 = r7.this$0
            r4.getClass()
            r3.<init>(r2, r8, r0)
            et.f r8 = new et.f
            com.moovit.app.home.dashboard.suggestions.station.b r4 = r7.this$0
            r4.getClass()
            java.util.List r3 = p583jk.C17875h.m44280D(r3)
            r8.<init>((java.lang.String) r2, (boolean) r0, (float) r1, (java.util.List<? extends p474et.C16872d>) r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.station.NearbyStopSuggestionCardProvider$loadCards$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
