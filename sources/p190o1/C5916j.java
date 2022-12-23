package p190o1;

import p190o1.C5917k;
import p229r1.C6231a;

/* renamed from: o1.j */
public final class C5916j implements C6231a<C5917k.C5918a> {

    /* renamed from: a */
    public final /* synthetic */ String f19000a;

    public C5916j(String str) {
        this.f19000a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 >= r2.size()) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        ((p229r1.C6231a) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            o1.k$a r5 = (p190o1.C5917k.C5918a) r5
            java.lang.Object r0 = p190o1.C5917k.f19003c
            monitor-enter(r0)
            s0.h<java.lang.String, java.util.ArrayList<r1.a<o1.k$a>>> r1 = p190o1.C5917k.f19004d     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r4.f19000a     // Catch:{ all -> 0x002e }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x002e }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            goto L_0x002d
        L_0x0014:
            java.lang.String r3 = r4.f19000a     // Catch:{ all -> 0x002e }
            r1.remove(r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            r0 = 0
        L_0x001b:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002d
            java.lang.Object r1 = r2.get(r0)
            r1.a r1 = (p229r1.C6231a) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x001b
        L_0x002d:
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p190o1.C5916j.accept(java.lang.Object):void");
    }
}
