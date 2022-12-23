package p023b4;

import p043ch.qos.logback.classic.Level;
import p043ch.qos.logback.classic.Logger;
import p043ch.qos.logback.classic.spi.LoggerContextVO;

/* renamed from: b4.b */
public final class C1471b {

    /* renamed from: a */
    public transient Level f5344a;

    /* renamed from: b */
    public String f5345b;

    /* renamed from: c */
    public transient String f5346c;

    /* renamed from: d */
    public transient Object[] f5347d = null;

    public C1471b(Logger logger, Level level, String str) {
        String str2 = Logger.f6376i;
        logger.mo6670g();
        LoggerContextVO loggerContextVO = logger.f6383h.f20370p;
        this.f5344a = level;
        this.f5345b = str;
        System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo5824a() {
        /*
            r11 = this;
            java.lang.String r0 = r11.f5346c
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.Object[] r0 = r11.f5347d
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = r11.f5345b
            r2 = 0
            int r3 = r0.length
            r4 = -1
            if (r3 != 0) goto L_0x0011
            goto L_0x001c
        L_0x0011:
            int r3 = r0.length
            int r3 = r3 + r4
            r3 = r0[r3]
            boolean r5 = r3 instanceof java.lang.Throwable
            if (r5 == 0) goto L_0x001c
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            r5 = 0
            if (r3 == 0) goto L_0x0036
            int r3 = r0.length
            if (r3 == 0) goto L_0x002e
            int r3 = r0.length
            int r3 = r3 + r4
            java.lang.Object[] r6 = new java.lang.Object[r3]
            if (r3 <= 0) goto L_0x002c
            java.lang.System.arraycopy(r0, r5, r6, r5, r3)
        L_0x002c:
            r0 = r6
            goto L_0x0036
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "non-sensical empty or null argument array"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            if (r1 != 0) goto L_0x003f
            pj0.a r1 = new pj0.a
            r1.<init>(r2, r0)
            goto L_0x00d7
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1.length()
            int r3 = r3 + 50
            r2.<init>(r3)
            r3 = 0
            r6 = 0
        L_0x004c:
            int r7 = r0.length
            if (r3 >= r7) goto L_0x00c7
            java.lang.String r7 = "{}"
            int r7 = r1.indexOf(r7, r6)
            if (r7 != r4) goto L_0x0073
            if (r6 != 0) goto L_0x0062
            pj0.a r2 = new pj0.a
            r2.<init>(r1, r0)
            r1 = r2
            goto L_0x00d7
        L_0x0062:
            int r3 = r1.length()
            r2.append(r1, r6, r3)
            pj0.a r1 = new pj0.a
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            goto L_0x00d7
        L_0x0073:
            r8 = 92
            r9 = 1
            if (r7 != 0) goto L_0x0079
            goto L_0x0083
        L_0x0079:
            int r10 = r7 + -1
            char r10 = r1.charAt(r10)
            if (r10 != r8) goto L_0x0083
            r10 = 1
            goto L_0x0084
        L_0x0083:
            r10 = 0
        L_0x0084:
            if (r10 == 0) goto L_0x00b5
            r10 = 2
            if (r7 < r10) goto L_0x0093
            int r10 = r7 + -2
            char r10 = r1.charAt(r10)
            if (r10 != r8) goto L_0x0093
            r8 = 1
            goto L_0x0094
        L_0x0093:
            r8 = 0
        L_0x0094:
            if (r8 != 0) goto L_0x00a5
            int r3 = r3 + -1
            int r8 = r7 + -1
            r2.append(r1, r6, r8)
            r6 = 123(0x7b, float:1.72E-43)
            r2.append(r6)
            int r7 = r7 + 1
            goto L_0x00c4
        L_0x00a5:
            int r8 = r7 + -1
            r2.append(r1, r6, r8)
            r6 = r0[r3]
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            mf0.C24361g.m61134D(r2, r6, r8)
            goto L_0x00c2
        L_0x00b5:
            r2.append(r1, r6, r7)
            r6 = r0[r3]
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            mf0.C24361g.m61134D(r2, r6, r8)
        L_0x00c2:
            int r7 = r7 + 2
        L_0x00c4:
            r6 = r7
            int r3 = r3 + r9
            goto L_0x004c
        L_0x00c7:
            int r3 = r1.length()
            r2.append(r1, r6, r3)
            pj0.a r1 = new pj0.a
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
        L_0x00d7:
            java.lang.String r0 = r1.f62586a
            goto L_0x00dc
        L_0x00da:
            java.lang.String r0 = r11.f5345b
        L_0x00dc:
            r11.f5346c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p023b4.C1471b.mo5824a():java.lang.String");
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('[');
        q.append(this.f5344a);
        q.append("] ");
        q.append(mo5824a());
        return q.toString();
    }
}
