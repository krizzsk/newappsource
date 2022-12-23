package com.moovit.app.stoparrivals;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p952yy.C20787c;
import zh0.C25522c;
import zh0.C25523d;

public final class StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1 implements C25522c<C20787c> {

    /* renamed from: b */
    public final /* synthetic */ C25522c f39618b;

    public StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1(C25522c cVar) {
        this.f39618b = cVar;
    }

    public final Object collect(final C25523d dVar, C23349c cVar) {
        Object collect = this.f39618b.collect(new C25523d() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, ff0.C23349c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1.C153182.C153191
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1$2$1 r0 = (com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1.C153182.C153191) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1$2$1 r0 = new com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1$2$1
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
                    zh0.d r6 = r3
                    yy.e r5 = (p952yy.C20791e) r5
                    yy.c r5 = r5.f52474m
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0041
                    return r1
                L_0x0041:
                    bf0.d r5 = bf0.C21050d.f52856a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stoparrivals.StopArrivalsViewModel$fetchLineArrivals$$inlined$map$1.C153182.emit(java.lang.Object, ff0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C21050d.f52856a;
    }
}
