package p656mm;

import p364al.C13483d;
import p517go.C17210b;
import p656mm.C18403c;
import p705on.C18801i;

/* renamed from: mm.a */
public final class C18399a implements C13483d {

    /* renamed from: a */
    public final C18801i.C18802a f46905a;

    /* renamed from: b */
    public final C18403c.C18404a f46906b;

    /* renamed from: c */
    public final C17210b f46907c;

    /* renamed from: d */
    public final Integer f46908d;

    /* renamed from: e */
    public final String f46909e;

    /* renamed from: f */
    public final Integer f46910f;

    /* renamed from: mm.a$a */
    public static class C18400a {

        /* renamed from: a */
        public final C18801i.C18802a f46911a;

        /* renamed from: b */
        public final C18403c.C18404a f46912b;

        /* renamed from: c */
        public final C17210b f46913c;

        public C18400a(C18403c.C18404a aVar, C18801i.C18802a aVar2, C17210b bVar) {
            this.f46911a = aVar2;
            this.f46912b = aVar;
            this.f46913c = bVar;
        }
    }

    public C18399a(C18403c.C18404a aVar, C18801i.C18802a aVar2, C17210b bVar, Integer num, Integer num2, String str) {
        this.f46905a = aVar2;
        this.f46906b = aVar;
        this.f46907c = bVar;
        this.f46908d = num;
        this.f46909e = str;
        this.f46910f = num2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        return r3;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p364al.C13487h<p705on.C18801i> mo40394C() {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.f46910f
            int r0 = r0.intValue()
            r1 = 0
            if (r0 >= 0) goto L_0x0018
            java.lang.Integer r0 = p388bk.C13634a.f33615i
            bk.a r2 = new bk.a
            java.lang.String r3 = "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."
            r2.<init>(r1, r0, r3)
            al.h r0 = new al.h
            r0.<init>(r1, r2)
            return r0
        L_0x0018:
            go.b r0 = r6.f46907c
            monitor-enter(r0)
            go.b r2 = r6.f46907c     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = r6.f46909e     // Catch:{ all -> 0x0035 }
            uk.o r2 = r2.mo49785a(r3)     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0037
            java.lang.Integer r2 = p388bk.C13634a.f33612f     // Catch:{ all -> 0x0035 }
            bk.a r3 = new bk.a     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."
            r3.<init>(r1, r2, r4)     // Catch:{ all -> 0x0035 }
            al.h r2 = new al.h     // Catch:{ all -> 0x0035 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r2
        L_0x0035:
            r1 = move-exception
            goto L_0x00a9
        L_0x0037:
            java.util.Map<java.lang.Integer, uk.a0> r3 = r2.f50668c     // Catch:{ all -> 0x0035 }
            java.lang.Integer r4 = r6.f46908d     // Catch:{ all -> 0x0035 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0035 }
            uk.a0 r3 = (p843uk.C19918a0) r3     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x0053
            java.lang.Integer r2 = p388bk.C13634a.f33613g     // Catch:{ all -> 0x0035 }
            bk.a r3 = new bk.a     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."
            r3.<init>(r1, r2, r4)     // Catch:{ all -> 0x0035 }
            al.h r2 = new al.h     // Catch:{ all -> 0x0035 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r2
        L_0x0053:
            mm.c$a r4 = r6.f46906b     // Catch:{ all -> 0x0035 }
            java.lang.Integer r5 = r6.f46910f     // Catch:{ all -> 0x0035 }
            r4.getClass()     // Catch:{ all -> 0x0035 }
            mm.c r4 = new mm.c     // Catch:{ all -> 0x0035 }
            r4.<init>(r2, r3, r5)     // Catch:{ all -> 0x0035 }
            al.h r2 = r4.mo50857a()     // Catch:{ all -> 0x0035 }
            boolean r3 = r2.mo40399a()     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x008f
            pj.a r2 = r2.f33366b     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = r2.f48169a     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "purchase"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x007b
            al.h r3 = new al.h     // Catch:{ all -> 0x0035 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x008d
        L_0x007b:
            r3 = 900(0x384, float:1.261E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0035 }
            bk.a r4 = new bk.a     // Catch:{ all -> 0x0035 }
            java.lang.String r5 = "Unexpected error"
            r4.<init>(r2, r3, r5)     // Catch:{ all -> 0x0035 }
            al.h r3 = new al.h     // Catch:{ all -> 0x0035 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0035 }
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r3
        L_0x008f:
            S r2 = r2.f33365a     // Catch:{ all -> 0x0035 }
            uk.o r2 = (p843uk.C19945o) r2     // Catch:{ all -> 0x0035 }
            go.b r3 = r6.f46907c     // Catch:{ all -> 0x0035 }
            java.util.HashMap r3 = r3.f44499a     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = r2.f50666a     // Catch:{ all -> 0x0035 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            on.i$a r0 = r6.f46905a
            on.i r0 = r0.mo51288a(r2)
            al.h r2 = new al.h
            r2.<init>(r0, r1)
            return r2
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p656mm.C18399a.mo40394C():al.h");
    }
}
