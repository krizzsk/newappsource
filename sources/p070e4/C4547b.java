package p070e4;

import androidx.lifecycle.C1042u;
import p001a0.C0016g;
import p023b4.C1471b;
import p271u4.C6693d;

/* renamed from: e4.b */
public abstract class C4547b<E> extends C6693d implements C4546a<E> {

    /* renamed from: e */
    public volatile boolean f15662e = false;

    /* renamed from: f */
    public boolean f15663f = false;

    /* renamed from: g */
    public String f15664g;

    /* renamed from: h */
    public C1042u f15665h = new C1042u(2);

    /* renamed from: i */
    public int f15666i = 0;

    /* renamed from: j */
    public int f15667j = 0;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0076=Splitter:B:32:0x0076, B:15:0x003d=Splitter:B:15:0x003d} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20052d(p023b4.C1471b r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f15663f     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 5
            r1 = 0
            r2 = 1
            r4.f15663f = r2     // Catch:{ Exception -> 0x003b }
            boolean r2 = r4.f15662e     // Catch:{ Exception -> 0x003b }
            if (r2 != 0) goto L_0x0041
            int r5 = r4.f15666i     // Catch:{ Exception -> 0x003b }
            int r2 = r5 + 1
            r4.f15666i = r2     // Catch:{ Exception -> 0x003b }
            if (r5 >= r0) goto L_0x003d
            v4.g r5 = new v4.g     // Catch:{ Exception -> 0x003b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b }
            r2.<init>()     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = "Attempted to append to non started appender ["
            r2.append(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = r4.f15664g     // Catch:{ Exception -> 0x003b }
            r2.append(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = "]."
            r2.append(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003b }
            r5.<init>(r2, r4)     // Catch:{ Exception -> 0x003b }
            r4.mo22866j(r5)     // Catch:{ Exception -> 0x003b }
            goto L_0x003d
        L_0x0039:
            r5 = move-exception
            goto L_0x007a
        L_0x003b:
            r5 = move-exception
            goto L_0x0053
        L_0x003d:
            r4.f15663f = r1     // Catch:{ all -> 0x007d }
            monitor-exit(r4)
            return
        L_0x0041:
            androidx.lifecycle.u r2 = r4.f15665h     // Catch:{ Exception -> 0x003b }
            ch.qos.logback.core.spi.FilterReply r2 = r2.mo4331f(r5)     // Catch:{ Exception -> 0x003b }
            ch.qos.logback.core.spi.FilterReply r3 = p043ch.qos.logback.core.spi.FilterReply.DENY     // Catch:{ Exception -> 0x003b }
            if (r2 != r3) goto L_0x004f
            r4.f15663f = r1     // Catch:{ all -> 0x007d }
            monitor-exit(r4)
            return
        L_0x004f:
            r4.mo172m(r5)     // Catch:{ Exception -> 0x003b }
            goto L_0x0076
        L_0x0053:
            int r2 = r4.f15667j     // Catch:{ all -> 0x0039 }
            int r3 = r2 + 1
            r4.f15667j = r3     // Catch:{ all -> 0x0039 }
            if (r2 >= r0) goto L_0x0076
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "Appender ["
            r0.append(r2)     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = r4.f15664g     // Catch:{ all -> 0x0039 }
            r0.append(r2)     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "] failed to append."
            r0.append(r2)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            r4.mo21727f(r0, r5)     // Catch:{ all -> 0x0039 }
        L_0x0076:
            r4.f15663f = r1     // Catch:{ all -> 0x007d }
            monitor-exit(r4)
            return
        L_0x007a:
            r4.f15663f = r1     // Catch:{ all -> 0x007d }
            throw r5     // Catch:{ all -> 0x007d }
        L_0x007d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p070e4.C4547b.mo20052d(b4.b):void");
    }

    public final String getName() {
        return this.f15664g;
    }

    /* renamed from: h */
    public final void mo20054h(String str) {
        this.f15664g = str;
    }

    public final boolean isStarted() {
        return this.f15662e;
    }

    /* renamed from: m */
    public abstract void mo172m(C1471b bVar);

    public void start() {
        this.f15662e = true;
    }

    public void stop() {
        this.f15662e = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        return C0016g.m31o(sb, this.f15664g, "]");
    }
}
