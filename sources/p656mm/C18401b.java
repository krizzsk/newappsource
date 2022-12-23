package p656mm;

import p364al.C13483d;
import p517go.C17210b;
import p656mm.C18403c;
import p705on.C18801i;

/* renamed from: mm.b */
public final class C18401b implements C13483d {

    /* renamed from: a */
    public final C17210b f46914a;

    /* renamed from: b */
    public final C18403c.C18404a f46915b;

    /* renamed from: c */
    public final C18801i.C18802a f46916c;

    /* renamed from: d */
    public final Integer f46917d;

    /* renamed from: e */
    public final String f46918e;

    /* renamed from: f */
    public final Integer f46919f;

    /* renamed from: mm.b$a */
    public static class C18402a {

        /* renamed from: a */
        public final C17210b f46920a;

        /* renamed from: b */
        public final C18403c.C18404a f46921b;

        /* renamed from: c */
        public final C18801i.C18802a f46922c;

        public C18402a(C18403c.C18404a aVar, C18801i.C18802a aVar2, C17210b bVar) {
            this.f46920a = bVar;
            this.f46921b = aVar;
            this.f46922c = aVar2;
        }
    }

    public C18401b(C18403c.C18404a aVar, C18801i.C18802a aVar2, C17210b bVar, Integer num, Integer num2, String str) {
        this.f46914a = bVar;
        this.f46915b = aVar;
        this.f46916c = aVar2;
        this.f46917d = num;
        this.f46918e = str;
        this.f46919f = num2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        return r3;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p364al.C13487h<p705on.C18801i> mo40394C() {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.f46919f
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
            go.b r0 = r6.f46914a
            monitor-enter(r0)
            go.b r2 = r6.f46914a     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = r6.f46918e     // Catch:{ all -> 0x0035 }
            uk.o r2 = r2.mo49785a(r3)     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0038
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
            goto L_0x00b7
        L_0x0038:
            java.util.Map<java.lang.Integer, uk.a0> r3 = r2.f50668c     // Catch:{ all -> 0x0035 }
            java.lang.Integer r4 = r6.f46917d     // Catch:{ all -> 0x0035 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0035 }
            uk.a0 r3 = (p843uk.C19918a0) r3     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x0054
            java.lang.Integer r2 = p388bk.C13634a.f33613g     // Catch:{ all -> 0x0035 }
            bk.a r3 = new bk.a     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."
            r3.<init>(r1, r2, r4)     // Catch:{ all -> 0x0035 }
            al.h r2 = new al.h     // Catch:{ all -> 0x0035 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r2
        L_0x0054:
            mm.c$a r4 = r6.f46915b     // Catch:{ all -> 0x0035 }
            java.lang.Integer r5 = r6.f46919f     // Catch:{ all -> 0x0035 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0035 }
            int r5 = -r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0035 }
            r4.getClass()     // Catch:{ all -> 0x0035 }
            mm.c r4 = new mm.c     // Catch:{ all -> 0x0035 }
            r4.<init>(r2, r3, r5)     // Catch:{ all -> 0x0035 }
            al.h r2 = r4.mo50857a()     // Catch:{ all -> 0x0035 }
            boolean r3 = r2.mo40399a()     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0099
            pj.a r2 = r2.f33366b     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = r2.f48169a     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "purchase"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0085
            al.h r3 = new al.h     // Catch:{ all -> 0x0035 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x0097
        L_0x0085:
            r3 = 900(0x384, float:1.261E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0035 }
            bk.a r4 = new bk.a     // Catch:{ all -> 0x0035 }
            java.lang.String r5 = "Unexpected error"
            r4.<init>(r2, r3, r5)     // Catch:{ all -> 0x0035 }
            al.h r3 = new al.h     // Catch:{ all -> 0x0035 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0035 }
        L_0x0097:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r3
        L_0x0099:
            go.b r3 = r6.f46914a     // Catch:{ all -> 0x0035 }
            S r4 = r2.f33365a     // Catch:{ all -> 0x0035 }
            uk.o r4 = (p843uk.C19945o) r4     // Catch:{ all -> 0x0035 }
            java.util.HashMap r3 = r3.f44499a     // Catch:{ all -> 0x0035 }
            java.lang.String r5 = r4.f50666a     // Catch:{ all -> 0x0035 }
            r3.put(r5, r4)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            al.h r0 = new al.h
            on.i$a r3 = r6.f46916c
            S r2 = r2.f33365a
            uk.o r2 = (p843uk.C19945o) r2
            on.i r2 = r3.mo51288a(r2)
            r0.<init>(r2, r1)
            return r0
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p656mm.C18401b.mo40394C():al.h");
    }
}
