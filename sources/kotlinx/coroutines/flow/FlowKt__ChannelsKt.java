package kotlinx.coroutines.flow;

public final /* synthetic */ class FlowKt__ChannelsKt {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0089 A[SYNTHETIC, Splitter:B:42:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m60670a(zh0.C25523d<? super T> r7, yh0.C25321m<? extends T> r8, boolean r9, ff0.C23349c<? super bf0.C21050d> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0054
            if (r2 == r3) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            yh0.m r8 = (yh0.C25321m) r8
            java.lang.Object r9 = r0.L$0
            zh0.d r9 = (zh0.C25523d) r9
            p584jl.C17885a.m44475z0(r10)     // Catch:{ all -> 0x0052 }
        L_0x0034:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x005b
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            yh0.m r8 = (yh0.C25321m) r8
            java.lang.Object r9 = r0.L$0
            zh0.d r9 = (zh0.C25523d) r9
            p584jl.C17885a.m44475z0(r10)     // Catch:{ all -> 0x0052 }
            yh0.f r10 = (yh0.C25312f) r10     // Catch:{ all -> 0x0052 }
            java.lang.Object r10 = r10.f63623a     // Catch:{ all -> 0x0052 }
            goto L_0x006d
        L_0x0052:
            r9 = move-exception
            goto L_0x00a0
        L_0x0054:
            p584jl.C17885a.m44475z0(r10)
            boolean r10 = r7 instanceof zh0.C25533n
            if (r10 != 0) goto L_0x00bb
        L_0x005b:
            r0.L$0 = r7     // Catch:{ all -> 0x009c }
            r0.L$1 = r8     // Catch:{ all -> 0x009c }
            r0.Z$0 = r9     // Catch:{ all -> 0x009c }
            r0.label = r3     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r8.mo60319D(r0)     // Catch:{ all -> 0x009c }
            if (r10 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x006d:
            boolean r2 = r10 instanceof yh0.C25312f.C25313a     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x008a
            boolean r9 = r10 instanceof yh0.C25312f.C25313a     // Catch:{ all -> 0x0052 }
            if (r9 == 0) goto L_0x0078
            yh0.f$a r10 = (yh0.C25312f.C25313a) r10     // Catch:{ all -> 0x0052 }
            goto L_0x0079
        L_0x0078:
            r10 = r5
        L_0x0079:
            if (r10 == 0) goto L_0x007e
            java.lang.Throwable r9 = r10.f63624a     // Catch:{ all -> 0x0052 }
            goto L_0x007f
        L_0x007e:
            r9 = r5
        L_0x007f:
            if (r9 != 0) goto L_0x0089
            if (r7 == 0) goto L_0x0086
            r8.mo60320a(r5)
        L_0x0086:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        L_0x0089:
            throw r9     // Catch:{ all -> 0x0052 }
        L_0x008a:
            yh0.C25312f.m63570a(r10)     // Catch:{ all -> 0x0052 }
            r0.L$0 = r9     // Catch:{ all -> 0x0052 }
            r0.L$1 = r8     // Catch:{ all -> 0x0052 }
            r0.Z$0 = r7     // Catch:{ all -> 0x0052 }
            r0.label = r4     // Catch:{ all -> 0x0052 }
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch:{ all -> 0x0052 }
            if (r10 != r1) goto L_0x0034
            return r1
        L_0x009c:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x00a0:
            throw r9     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r10 = move-exception
            if (r7 == 0) goto L_0x00ba
            boolean r7 = r9 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L_0x00ab
            r5 = r9
            java.util.concurrent.CancellationException r5 = (java.util.concurrent.CancellationException) r5
        L_0x00ab:
            if (r5 != 0) goto L_0x00b7
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "Channel was consumed, consumer had failed"
            r5.<init>(r7)
            r5.initCause(r9)
        L_0x00b7:
            r8.mo60320a(r5)
        L_0x00ba:
            throw r10
        L_0x00bb:
            zh0.n r7 = (zh0.C25533n) r7
            r7.getClass()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.m60670a(zh0.d, yh0.m, boolean, ff0.c):java.lang.Object");
    }
}
