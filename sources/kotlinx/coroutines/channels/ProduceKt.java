package kotlinx.coroutines.channels;

public final class ProduceKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: lf0.a<bf0.d>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m60647a(yh0.C25319k<?> r4, lf0.C24225a<bf0.C21050d> r5, ff0.C23349c<? super bf0.C21050d> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r4 = r0.L$1
            r5 = r4
            lf0.a r5 = (lf0.C24225a) r5
            java.lang.Object r4 = r0.L$0
            yh0.k r4 = (yh0.C25319k) r4
            p584jl.C17885a.m44475z0(r6)     // Catch:{ all -> 0x0073 }
            goto L_0x006d
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            p584jl.C17885a.m44475z0(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            wh0.y0$b r2 = wh0.C25232y0.C25234b.f63506b
            kotlin.coroutines.CoroutineContext$a r6 = r6.mo53081c(r2)
            if (r6 != r4) goto L_0x0049
            r6 = 1
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 == 0) goto L_0x0078
            r0.L$0 = r4     // Catch:{ all -> 0x0073 }
            r0.L$1 = r5     // Catch:{ all -> 0x0073 }
            r0.label = r3     // Catch:{ all -> 0x0073 }
            wh0.l r6 = new wh0.l     // Catch:{ all -> 0x0073 }
            ff0.c r0 = ce0.C21100e.m49351l0(r0)     // Catch:{ all -> 0x0073 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0073 }
            r6.mo61835t()     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch:{ all -> 0x0073 }
            r0.<init>(r6)     // Catch:{ all -> 0x0073 }
            r4.mo60353u(r0)     // Catch:{ all -> 0x0073 }
            java.lang.Object r4 = r6.mo61834s()     // Catch:{ all -> 0x0073 }
            if (r4 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r5.invoke()
            bf0.d r4 = bf0.C21050d.f52856a
            return r4
        L_0x0073:
            r4 = move-exception
            r5.invoke()
            throw r4
        L_0x0078:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.m60647a(yh0.k, lf0.a, ff0.c):java.lang.Object");
    }
}
