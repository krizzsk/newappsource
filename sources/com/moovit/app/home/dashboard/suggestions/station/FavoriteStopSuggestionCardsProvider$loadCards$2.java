package com.moovit.app.home.dashboard.suggestions.station;

import android.content.Context;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p474et.C16874f;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$loadCards$2", mo58555f = "FavoriteStopSuggestionCardsProvider.kt", mo58556l = {42, 47, 48}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Let/f;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class FavoriteStopSuggestionCardsProvider$loadCards$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C16874f>, Object> {
    public final /* synthetic */ Context $context;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C14982a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteStopSuggestionCardsProvider$loadCards$2(C14982a aVar, Context context, C23349c<? super FavoriteStopSuggestionCardsProvider$loadCards$2> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$context = context;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new FavoriteStopSuggestionCardsProvider$loadCards$2(this.this$0, this.$context, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteStopSuggestionCardsProvider$loadCards$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135 A[LOOP:1: B:37:0x012d->B:39:0x0135, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r4) goto L_0x0033
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r0 = r9.L$1
            q00.a r0 = (q00.C19047a) r0
            java.lang.Object r1 = r9.L$0
            java.util.List r1 = (java.util.List) r1
            p584jl.C17885a.m44475z0(r10)
            goto L_0x0082
        L_0x001c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0024:
            java.lang.Object r1 = r9.L$1
            lz.a r1 = (p646lz.C18299a) r1
            java.lang.Object r5 = r9.L$0
            java.util.List r5 = (java.util.List) r5
            p584jl.C17885a.m44475z0(r10)
            r8 = r5
            r5 = r1
            r1 = r8
            goto L_0x006f
        L_0x0033:
            p584jl.C17885a.m44475z0(r10)
            goto L_0x0047
        L_0x0037:
            p584jl.C17885a.m44475z0(r10)
            com.moovit.app.home.dashboard.suggestions.station.a r10 = r9.this$0
            android.content.Context r1 = r9.$context
            r9.label = r4
            java.lang.Object r10 = com.moovit.app.home.dashboard.suggestions.station.C14982a.m37852e(r10, r1, r9)
            if (r10 != r0) goto L_0x0047
            return r0
        L_0x0047:
            java.util.List r10 = (java.util.List) r10
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x0056
            com.moovit.app.home.dashboard.suggestions.station.a r10 = r9.this$0
            et.f r10 = r10.mo45183a()
            return r10
        L_0x0056:
            android.content.Context r1 = r9.$context
            lz.a r1 = ce0.C21100e.m49329X(r1)
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r3
            java.lang.String r5 = "CONFIGURATION"
            java.lang.Object r5 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r1, r5, r9)
            if (r5 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r8 = r1
            r1 = r10
            r10 = r5
            r5 = r8
        L_0x006f:
            q00.a r10 = (q00.C19047a) r10
            r9.L$0 = r1
            r9.L$1 = r10
            r9.label = r2
            java.lang.String r2 = "METRO_CONTEXT"
            java.lang.Object r2 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r5, r2, r9)
            if (r2 != r0) goto L_0x0080
            return r0
        L_0x0080:
            r0 = r10
            r10 = r2
        L_0x0082:
            tp.f r10 = (p824tp.C19728f) r10
            r00.d r2 = p874vr.C20199a.f51285k1
            java.lang.Object r0 = r0.mo51505b(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.moovit.app.home.dashboard.suggestions.station.a r2 = r9.this$0
            android.content.Context r5 = r9.$context
            r2.getClass()
            java.util.List r10 = p546ht.C17490c.m43607c(r5, r10, r1)
            com.moovit.app.home.dashboard.suggestions.station.a r1 = r9.this$0
            android.content.Context r2 = r9.$context
            r1.getClass()
            java.util.Iterator r1 = r10.iterator()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x00aa
            r1 = 0
            goto L_0x00d1
        L_0x00aa:
            java.lang.Object r5 = r1.next()
            com.moovit.transit.TransitStop r5 = (com.moovit.transit.TransitStop) r5
            com.moovit.commons.geo.LatLonE6 r5 = r5.f23732d
            float r5 = aa0.C7530f.m17271d(r2, r5)
        L_0x00b6:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00cd
            java.lang.Object r6 = r1.next()
            com.moovit.transit.TransitStop r6 = (com.moovit.transit.TransitStop) r6
            com.moovit.commons.geo.LatLonE6 r6 = r6.f23732d
            float r6 = aa0.C7530f.m17271d(r2, r6)
            float r5 = java.lang.Math.max(r5, r6)
            goto L_0x00b6
        L_0x00cd:
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
        L_0x00d1:
            if (r1 == 0) goto L_0x00d8
            float r1 = r1.floatValue()
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            cf0.p r10 = kotlin.collections.C23825c.m58506c0(r10)
            com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$loadCards$2$sortedCards$1 r2 = new com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$loadCards$2$sortedCards$1
            android.content.Context r5 = r9.$context
            r2.<init>(r5, r0)
            th0.e r10 = kotlin.sequences.C24177b.m60543d0(r10, r2)
            com.moovit.app.home.dashboard.suggestions.station.a r0 = r9.this$0
            android.content.Context r2 = r9.$context
            r0.getClass()
            java.lang.String r0 = "context"
            mf0.C24362h.m61211f(r2, r0)
            com.moovit.app.home.dashboard.suggestions.station.StopSuggestionCardsProvider$getDistanceComparator$1 r0 = new com.moovit.app.home.dashboard.suggestions.station.StopSuggestionCardsProvider$getDistanceComparator$1
            r0.<init>(r2)
            ht.a r2 = new ht.a
            r2.<init>(r0)
            th0.j r0 = new th0.j
            r0.<init>(r10, r2)
            java.util.List r10 = kotlin.sequences.C24177b.m60553n0(r0)
            java.util.List r10 = p583jk.C17875h.m44285I(r10)
            int r0 = r10.size()
            int r0 = java.lang.Math.min(r0, r3)
            r2 = 0
            rf0.h r0 = p584jl.C17885a.m44393C0(r2, r0)
            java.util.List r10 = kotlin.collections.C23825c.m58494F0(r10, r0)
            com.moovit.app.home.dashboard.suggestions.station.a r0 = r9.this$0
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = cf0.C21136j.m49436X(r10, r5)
            r3.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L_0x012d:
            boolean r5 = r10.hasNext()
            java.lang.String r6 = "suggestion_favorite_station"
            if (r5 == 0) goto L_0x0147
            java.lang.Object r5 = r10.next()
            com.moovit.transit.TransitStop r5 = (com.moovit.transit.TransitStop) r5
            et.c r7 = new et.c
            r0.getClass()
            r7.<init>(r6, r5, r4)
            r3.add(r7)
            goto L_0x012d
        L_0x0147:
            java.util.List r10 = java.util.Collections.unmodifiableList(r3)
            et.f r0 = new et.f
            com.moovit.app.home.dashboard.suggestions.station.a r3 = r9.this$0
            r3.getClass()
            java.lang.String r3 = "cards"
            mf0.C24362h.m61210e(r10, r3)
            r0.<init>((java.lang.String) r6, (boolean) r2, (float) r1, (java.util.List<? extends p474et.C16872d>) r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.station.FavoriteStopSuggestionCardsProvider$loadCards$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
