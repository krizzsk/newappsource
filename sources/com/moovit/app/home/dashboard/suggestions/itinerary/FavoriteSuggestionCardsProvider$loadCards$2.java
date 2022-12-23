package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import bf0.C21050d;
import ce0.C21100e;
import ff0.C23349c;
import gf0.C23413c;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p474et.C16874f;
import p474et.C16876h;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2", mo58555f = "FavoriteSuggestionCardsProvider.kt", mo58556l = {34, 41}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Let/f;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class FavoriteSuggestionCardsProvider$loadCards$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C16874f>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C16876h $sharedState;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C14972a this$0;

    /* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2$a */
    public static final class C14963a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C21100e.m49298B((Float) ((Pair) t).mo59069d(), (Float) ((Pair) t2).mo59069d());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteSuggestionCardsProvider$loadCards$2(Context context, C16876h hVar, C14972a aVar, C23349c cVar) {
        super(2, cVar);
        this.$context = context;
        this.this$0 = aVar;
        this.$sharedState = hVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new FavoriteSuggestionCardsProvider$loadCards$2(this.$context, this.$sharedState, this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteSuggestionCardsProvider$loadCards$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r4) goto L_0x0029
            if (r2 != r3) goto L_0x0021
            java.lang.Object r1 = r0.L$2
            com.moovit.transit.LocationDescriptor r1 = (com.moovit.transit.LocationDescriptor) r1
            java.lang.Object r2 = r0.L$1
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r0.L$0
            q00.a r3 = (q00.C19047a) r3
            p584jl.C17885a.m44475z0(r17)
            r10 = r3
            r3 = r17
            goto L_0x0081
        L_0x0021:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0029:
            p584jl.C17885a.m44475z0(r17)
            r2 = r17
            goto L_0x0052
        L_0x002f:
            p584jl.C17885a.m44475z0(r17)
            android.content.Context r2 = r0.$context
            boolean r2 = p977zz.C20934d0.m49032c(r2)
            if (r2 != 0) goto L_0x0041
            com.moovit.app.home.dashboard.suggestions.itinerary.a r1 = r0.this$0
            et.f r1 = r1.mo45183a()
            return r1
        L_0x0041:
            android.content.Context r2 = r0.$context
            lz.a r2 = ce0.C21100e.m49329X(r2)
            r0.label = r4
            java.lang.String r4 = "CONFIGURATION"
            java.lang.Object r2 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r2, r4, r0)
            if (r2 != r1) goto L_0x0052
            return r1
        L_0x0052:
            q00.a r2 = (q00.C19047a) r2
            android.content.Context r4 = r0.$context
            android.location.Location r4 = ce0.C21100e.m49339f0(r4)
            if (r4 != 0) goto L_0x0063
            com.moovit.app.home.dashboard.suggestions.itinerary.a r1 = r0.this$0
            et.f r1 = r1.mo45183a()
            return r1
        L_0x0063:
            com.moovit.commons.geo.LatLonE6 r5 = com.moovit.commons.geo.LatLonE6.m40177j(r4)
            com.moovit.transit.LocationDescriptor r5 = com.moovit.transit.LocationDescriptor.m17770k(r5)
            com.moovit.app.home.dashboard.suggestions.itinerary.a r6 = r0.this$0
            android.content.Context r7 = r0.$context
            r0.L$0 = r2
            r0.L$1 = r4
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r3 = r6.mo45166f(r7, r0)
            if (r3 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r10 = r2
            r2 = r4
            r1 = r5
        L_0x0081:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            cf0.p r3 = kotlin.collections.C23825c.m58506c0(r3)
            com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2$items$1 r4 = com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2$items$1.f38306f
            th0.e r3 = kotlin.sequences.C24177b.m60543d0(r3, r4)
            com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2$items$2 r4 = new com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2$items$2
            r4.<init>(r2)
            th0.n r2 = kotlin.sequences.C24177b.m60549j0(r3, r4)
            com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2$a r3 = new com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2$a
            r3.<init>()
            th0.j r4 = new th0.j
            r4.<init>(r2, r3)
            java.util.List r2 = kotlin.sequences.C24177b.m60553n0(r4)
            java.util.List r2 = p583jk.C17875h.m44285I(r2)
            com.moovit.app.home.dashboard.suggestions.itinerary.a r3 = r0.this$0
            et.h r4 = r0.$sharedState
            r3.getClass()
            java.util.LinkedHashSet r3 = com.moovit.app.home.dashboard.suggestions.itinerary.C14973b.m37836c(r4)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r4 = r2.size()
            r11.<init>(r4)
            java.util.Iterator r12 = r2.iterator()
        L_0x00c0:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r12.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            int r5 = r11.size()
            com.moovit.app.home.dashboard.suggestions.itinerary.a r6 = r0.this$0
            int r6 = r6.f38331a
            if (r5 < r6) goto L_0x00d7
            goto L_0x0124
        L_0x00d7:
            java.lang.Object r5 = r4.mo59068c()
            r13 = r5
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r13 = (com.moovit.app.useraccount.manager.favorites.LocationFavorite) r13
            T r5 = r13.f52687b
            r14 = r5
            com.moovit.transit.LocationDescriptor r14 = (com.moovit.transit.LocationDescriptor) r14
            java.lang.String r5 = "favoriteLocation.location"
            mf0.C24362h.m61210e(r14, r5)
            java.lang.Object r4 = r4.mo59069d()
            java.lang.Number r4 = (java.lang.Number) r4
            float r8 = r4.floatValue()
            com.moovit.app.home.dashboard.suggestions.itinerary.a r4 = r0.this$0
            android.content.Context r5 = r0.$context
            r6 = r10
            r7 = r14
            r9 = r3
            boolean r4 = r4.mo45172e(r5, r6, r7, r8, r9)
            if (r4 == 0) goto L_0x00c0
            et.a r15 = new et.a
            com.moovit.app.home.dashboard.suggestions.itinerary.a r4 = r0.this$0
            java.lang.String r5 = r4.mo45165d()
            r6 = 2131888815(0x7f120aaf, float:1.9412276E38)
            java.lang.String r4 = "origin"
            mf0.C24362h.m61210e(r1, r4)
            com.moovit.app.home.dashboard.suggestions.itinerary.a r4 = r0.this$0
            android.content.Context r7 = r0.$context
            java.lang.String r9 = r4.mo45167g(r7, r13)
            r4 = r15
            r7 = r1
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r3.add(r14)
            r11.add(r15)
            goto L_0x00c0
        L_0x0124:
            java.util.Iterator r1 = r2.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L_0x0130
            r1 = 0
            goto L_0x0160
        L_0x0130:
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r3 = r3.mo59069d()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
        L_0x0140:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x015b
            java.lang.Object r4 = r1.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.mo59069d()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r3 = java.lang.Math.min(r3, r4)
            goto L_0x0140
        L_0x015b:
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r3)
        L_0x0160:
            if (r1 == 0) goto L_0x0167
            float r1 = r1.floatValue()
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            et.f r3 = new et.f
            com.moovit.app.home.dashboard.suggestions.itinerary.a r4 = r0.this$0
            java.lang.String r4 = r4.mo45165d()
            boolean r2 = r2.isEmpty()
            r3.<init>((java.lang.String) r4, (boolean) r2, (float) r1, (java.util.List<? extends p474et.C16872d>) r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.FavoriteSuggestionCardsProvider$loadCards$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
