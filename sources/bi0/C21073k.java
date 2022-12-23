package bi0;

import wh0.C25179g1;

/* renamed from: bi0.k */
public final class C21073k {

    /* renamed from: a */
    public static final C25179g1 f52890a;

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.hintOnError();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005d */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = bi0.C21080r.f52895a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000c
        L_0x000a:
            r0 = r1
        L_0x000c:
            if (r0 == 0) goto L_0x0011
            java.lang.Boolean.parseBoolean(r0)
        L_0x0011:
            java.util.Iterator r0 = p001a0.C0016g.m38v()     // Catch:{ all -> 0x006d }
            th0.h r0 = kotlin.sequences.SequencesKt__SequencesKt.m60537X(r0)     // Catch:{ all -> 0x006d }
            java.util.List r0 = kotlin.sequences.C24177b.m60553n0(r0)     // Catch:{ all -> 0x006d }
            java.util.List r0 = p583jk.C17875h.m44285I(r0)     // Catch:{ all -> 0x006d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x006d }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006d }
            if (r3 != 0) goto L_0x002d
            r3 = r1
            goto L_0x0054
        L_0x002d:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006d }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x006d }
            if (r4 != 0) goto L_0x0038
            goto L_0x0054
        L_0x0038:
            r4 = r3
            bi0.j r4 = (bi0.C21072j) r4     // Catch:{ all -> 0x006d }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x006d }
        L_0x003f:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x006d }
            r6 = r5
            bi0.j r6 = (bi0.C21072j) r6     // Catch:{ all -> 0x006d }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x006d }
            if (r4 >= r6) goto L_0x004e
            r3 = r5
            r4 = r6
        L_0x004e:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x006d }
            if (r5 != 0) goto L_0x003f
        L_0x0054:
            bi0.j r3 = (bi0.C21072j) r3     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x0065
            wh0.g1 r1 = r3.createDispatcher(r0)     // Catch:{ all -> 0x005d }
            goto L_0x0060
        L_0x005d:
            r3.hintOnError()     // Catch:{ all -> 0x006d }
        L_0x0060:
            if (r1 == 0) goto L_0x0065
            f52890a = r1
            return
        L_0x0065:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.C21073k.<clinit>():void");
    }
}
