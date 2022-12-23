package com.moovit.app.home.dashboard.suggestions;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$loadAllCards$1", mo58555f = "SuggestionsSectionViewModel.kt", mo58556l = {121, 126}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class SuggestionsSectionViewModel$loadAllCards$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ SuggestionsSectionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsSectionViewModel$loadAllCards$1(SuggestionsSectionViewModel suggestionsSectionViewModel, C23349c<? super SuggestionsSectionViewModel$loadAllCards$1> cVar) {
        super(2, cVar);
        this.this$0 = suggestionsSectionViewModel;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new SuggestionsSectionViewModel$loadAllCards$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestionsSectionViewModel$loadAllCards$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00aa  */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0044
            if (r1 == r2) goto L_0x0038
            if (r1 != r3) goto L_0x0030
            long r4 = r13.J$0
            java.lang.Object r1 = r13.L$3
            et.e r1 = (p474et.C16873e) r1
            java.lang.Object r6 = r13.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r13.L$1
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r13.L$0
            et.h r8 = (p474et.C16876h) r8
            p584jl.C17885a.m44475z0(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo59073b()
            r9 = r8
            r8 = r7
            r7 = r6
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r13
            goto L_0x00a2
        L_0x0030:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0038:
            java.lang.Object r1 = r13.L$1
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r4 = r13.L$0
            et.h r4 = (p474et.C16876h) r4
            p584jl.C17885a.m44475z0(r14)
            goto L_0x006a
        L_0x0044:
            p584jl.C17885a.m44475z0(r14)
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r14 = r13.this$0
            long r4 = java.lang.System.currentTimeMillis()
            r14.f38303h = r4
            et.h r4 = new et.h
            r14 = 8
            r4.<init>(r14)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r14 = r13.this$0
            r13.L$0 = r4
            r13.L$1 = r1
            r13.label = r2
            java.lang.Object r14 = com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel.m37811a(r14, r13)
            if (r14 != r0) goto L_0x006a
            return r0
        L_0x006a:
            java.util.List r14 = (java.util.List) r14
            java.util.Iterator r14 = r14.iterator()
            r6 = r14
            r7 = r1
            r8 = r4
            r14 = r13
        L_0x0074:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0113
            java.lang.Object r1 = r6.next()
            et.e r1 = (p474et.C16873e) r1
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r9 = r14.this$0
            r14.L$0 = r8
            r14.L$1 = r7
            r14.L$2 = r6
            r14.L$3 = r1
            r14.J$0 = r4
            r14.label = r3
            java.lang.Object r9 = com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel.m37812b(r9, r1, r8, r14)
            if (r9 != r0) goto L_0x0099
            return r0
        L_0x0099:
            r12 = r0
            r0 = r14
            r14 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r5 = r4
            r4 = r1
            r1 = r12
        L_0x00a2:
            et.f r4 = r4.mo45183a()
            boolean r10 = r14 instanceof kotlin.Result.Failure
            if (r10 == 0) goto L_0x00ab
            r14 = r4
        L_0x00ab:
            et.f r14 = (p474et.C16874f) r14
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r5
            float r4 = (float) r10
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            r8.put(r14, r5)
            java.util.List<et.d> r14 = r14.f43888d
            monitor-enter(r9)
            java.lang.String r4 = "cards"
            mf0.C24362h.m61211f(r14, r4)     // Catch:{ all -> 0x0110 }
            int r4 = r9.f43895d     // Catch:{ all -> 0x0110 }
            int r5 = r9.f43892a     // Catch:{ all -> 0x0110 }
            r6 = 0
            if (r4 >= r5) goto L_0x00de
            int r5 = r5 - r4
            int r4 = r14.size()     // Catch:{ all -> 0x0110 }
            if (r5 <= r4) goto L_0x00d5
            r5 = r4
        L_0x00d5:
            java.util.ArrayList r4 = r9.f43893b     // Catch:{ all -> 0x0110 }
            java.util.List r14 = r14.subList(r6, r5)     // Catch:{ all -> 0x0110 }
            r4.addAll(r14)     // Catch:{ all -> 0x0110 }
        L_0x00de:
            int r14 = r9.f43895d     // Catch:{ all -> 0x0110 }
            int r4 = r9.f43892a     // Catch:{ all -> 0x0110 }
            if (r14 != r4) goto L_0x00e5
            r6 = 1
        L_0x00e5:
            monitor-exit(r9)
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r14 = r0.this$0
            bf0.c r14 = r14.f38299d
            java.lang.Object r14 = r14.getValue()
            androidx.lifecycle.v r14 = (androidx.lifecycle.C1043v) r14
            zz.r r4 = new zz.r
            et.g r5 = new et.g
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.List<et.d> r11 = r9.f43894c
            r10.<init>(r11)
            r5.<init>(r10)
            r4.<init>(r5)
            r14.postValue(r4)
            if (r6 == 0) goto L_0x0109
            bf0.d r14 = bf0.C21050d.f52856a
            return r14
        L_0x0109:
            r14 = r0
            r0 = r1
            r6 = r7
            r7 = r8
            r8 = r9
            goto L_0x0074
        L_0x0110:
            r14 = move-exception
            monitor-exit(r9)
            throw r14
        L_0x0113:
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r14 = r14.this$0
            bf0.c r14 = r14.f38301f
            java.lang.Object r14 = r14.getValue()
            androidx.lifecycle.v r14 = (androidx.lifecycle.C1043v) r14
            r14.postValue(r7)
            bf0.d r14 = bf0.C21050d.f52856a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$loadAllCards$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
