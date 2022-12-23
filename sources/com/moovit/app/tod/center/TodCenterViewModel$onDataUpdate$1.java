package com.moovit.app.tod.center;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.tod.center.TodCenterViewModel$onDataUpdate$1", mo58555f = "TodCenterViewModel.kt", mo58556l = {175, 179}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class TodCenterViewModel$onDataUpdate$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ C15489a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodCenterViewModel$onDataUpdate$1(C15489a aVar, C23349c<? super TodCenterViewModel$onDataUpdate$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new TodCenterViewModel$onDataUpdate$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((TodCenterViewModel$onDataUpdate$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r6.L$0
            androidx.lifecycle.v r0 = (androidx.lifecycle.C1043v) r0
            p584jl.C17885a.m44475z0(r7)
            goto L_0x006e
        L_0x0014:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001c:
            p584jl.C17885a.m44475z0(r7)
            goto L_0x002e
        L_0x0020:
            p584jl.C17885a.m44475z0(r7)
            com.moovit.app.tod.center.a r7 = r6.this$0
            r6.label = r3
            java.lang.Object r7 = com.moovit.app.tod.center.C15489a.m39630a(r7, r6)
            if (r7 != r0) goto L_0x002e
            return r0
        L_0x002e:
            java.util.List r7 = (java.util.List) r7
            com.moovit.app.tod.center.a r1 = r6.this$0
            androidx.lifecycle.v<java.util.List<com.moovit.app.tod.center.TodRidesCenterTab>> r1 = r1.f40211f
            r1.setValue(r7)
            com.moovit.app.tod.center.a r7 = r6.this$0
            androidx.lifecycle.v<zz.r<java.util.List<o00.l$b<com.moovit.app.tod.model.TodRide>>>> r1 = r7.f40212g
            android.app.Application r7 = r7.f3907b
            java.lang.String r3 = "getApplication()"
            mf0.C24362h.m61210e(r7, r3)
            com.moovit.app.tod.center.a r3 = r6.this$0
            com.moovit.app.tod.TodRidesProvider r3 = r3.f40209d
            com.moovit.app.tod.TodRidesProvider$b r3 = r3.f40034c
            java.util.List<com.moovit.app.tod.model.TodRide> r3 = r3.f40039a
            if (r3 != 0) goto L_0x0051
            java.util.List r3 = java.util.Collections.emptyList()
            goto L_0x0055
        L_0x0051:
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x0055:
            java.lang.String r4 = "ridesProvider.rides"
            mf0.C24362h.m61210e(r3, r4)
            r6.L$0 = r1
            r6.label = r2
            ci0.b r2 = wh0.C25184i0.f63459a
            com.moovit.app.tod.center.TodCenterViewModel$createSections$2 r4 = new com.moovit.app.tod.center.TodCenterViewModel$createSections$2
            r5 = 0
            r4.<init>(r7, r3, r5)
            java.lang.Object r7 = wh0.C25177g.m63221e(r2, r4, r6)
            if (r7 != r0) goto L_0x006d
            return r0
        L_0x006d:
            r0 = r1
        L_0x006e:
            zz.r r1 = new zz.r
            r1.<init>(r7)
            r0.setValue(r1)
            com.moovit.app.tod.center.a r7 = r6.this$0
            androidx.lifecycle.v<zz.r<java.util.List<com.moovit.app.tod.model.TodSubscription>>> r0 = r7.f40213h
            zz.r r1 = new zz.r
            com.moovit.app.tod.TodRidesProvider r7 = r7.f40209d
            com.moovit.app.tod.TodRidesProvider$b r7 = r7.f40034c
            java.util.List<com.moovit.app.tod.model.TodSubscription> r7 = r7.f40041c
            if (r7 != 0) goto L_0x0089
            java.util.List r7 = java.util.Collections.emptyList()
            goto L_0x008d
        L_0x0089:
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
        L_0x008d:
            r1.<init>(r7)
            r0.setValue(r1)
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.center.TodCenterViewModel$onDataUpdate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
