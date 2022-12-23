package p295w3;

import p168m4.C5684b;
import p193o4.C5982h;
import p296w4.C6986d;

/* renamed from: w3.b */
public final class C6974b extends C5684b {

    /* renamed from: e */
    public static final C6986d f21738e = new C6986d((long) 60000.0d);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: w4.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: w4.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: w4.d} */
    /* JADX WARNING: type inference failed for: r5v4, types: [w4.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo170m(p193o4.C5982h r10, java.lang.String r11, org.xml.sax.helpers.AttributesImpl r12) {
        /*
            r9 = this;
            java.lang.String r11 = "logback.debug"
            java.lang.String r11 = p296w4.C6992h.m16472a(r11)
            if (r11 != 0) goto L_0x0012
            java.lang.String r11 = "debug"
            java.lang.String r11 = r12.getValue(r11)
            java.lang.String r11 = r10.mo21977q(r11)
        L_0x0012:
            boolean r0 = p296w4.C6992h.m16474c(r11)
            java.lang.String r1 = "false"
            if (r0 != 0) goto L_0x003f
            boolean r0 = r11.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "null"
            boolean r11 = r11.equalsIgnoreCase(r0)
            if (r11 == 0) goto L_0x0029
            goto L_0x003f
        L_0x0029:
            e4.d r11 = r9.f20771c
            v4.c r0 = new v4.c
            r0.<init>()
            r0.mo20064b(r11)
            e4.c r11 = r11.f15676d
            boolean r11 = r11.mo20057b(r0)
            if (r11 == 0) goto L_0x0044
            r0.start()
            goto L_0x0044
        L_0x003f:
            java.lang.String r11 = "debug attribute not set"
            r9.mo22865i(r11)
        L_0x0044:
            java.lang.String r11 = "scan"
            java.lang.String r11 = r12.getValue(r11)
            java.lang.String r11 = r10.mo21977q(r11)
            boolean r0 = p296w4.C6992h.m16474c(r11)
            if (r0 != 0) goto L_0x012a
            boolean r11 = r1.equalsIgnoreCase(r11)
            if (r11 != 0) goto L_0x012a
            e4.d r11 = r9.f20771c
            monitor-enter(r11)
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r11.f15680h     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x006d
            w4.f$a r0 = p296w4.C6988f.f21758a     // Catch:{ all -> 0x0127 }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x0127 }
            w4.f$a r1 = p296w4.C6988f.f21758a     // Catch:{ all -> 0x0127 }
            r2 = 2
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0127 }
            r11.f15680h = r0     // Catch:{ all -> 0x0127 }
        L_0x006d:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r11.f15680h     // Catch:{ all -> 0x0127 }
            monitor-exit(r11)
            e4.d r11 = r9.f20771c
            o4.b r11 = p583jk.C17875h.m44313x(r11)
            r1 = 0
            if (r11 != 0) goto L_0x007b
            r11 = r1
            goto L_0x007d
        L_0x007b:
            java.net.URL r11 = r11.f19121e
        L_0x007d:
            if (r11 != 0) goto L_0x0086
            java.lang.String r11 = "Due to missing top level configuration file, reconfiguration on change (configuration file scanning) cannot be done."
            r9.mo22867k(r11)
            goto L_0x012a
        L_0x0086:
            v3.b r2 = new v3.b
            r2.<init>()
            e4.d r3 = r9.f20771c
            r2.mo20064b(r3)
            e4.d r3 = r9.f20771c
            java.lang.String r4 = "RECONFIGURE_ON_CHANGE_TASK"
            r3.mo20060c(r2, r4)
            java.lang.String r3 = "scanPeriod"
            java.lang.String r3 = r12.getValue(r3)
            java.lang.String r3 = r10.mo21977q(r3)
            w4.d r4 = f21738e
            boolean r5 = p296w4.C6992h.m16474c(r3)
            if (r5 != 0) goto L_0x00d0
            w4.d r5 = p296w4.C6986d.m16470a(r3)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x00ae }
            goto L_0x00b4
        L_0x00ae:
            r5 = move-exception
            goto L_0x00b1
        L_0x00b0:
            r5 = move-exception
        L_0x00b1:
            r8 = r5
            r5 = r1
            r1 = r8
        L_0x00b4:
            if (r1 == 0) goto L_0x00cf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to parse 'scanPeriod' attribute ["
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = "]"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r9.mo22868l(r3, r1)
        L_0x00cf:
            r1 = r5
        L_0x00d0:
            if (r1 != 0) goto L_0x00e7
            java.lang.String r1 = "No 'scanPeriod' specified. Defaulting to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r3 = r4.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r9.mo22865i(r1)
            goto L_0x00e8
        L_0x00e7:
            r4 = r1
        L_0x00e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Will scan for changes in ["
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = "] "
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r9.mo22865i(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Setting ReconfigureOnChangeTask scanning period to "
            r11.append(r1)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r9.mo22865i(r11)
            long r4 = r4.f21756a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = r2
            r2 = r4
            java.util.concurrent.ScheduledFuture r11 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            e4.d r0 = r9.f20771c
            java.util.ArrayList r0 = r0.f15681i
            r0.add(r11)
            goto L_0x012a
        L_0x0127:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        L_0x012a:
            w4.c r11 = new w4.c
            e4.d r0 = r9.f20771c
            r11.<init>(r0)
            e4.d r11 = r11.f20771c
            java.lang.String r0 = "HOSTNAME"
            java.lang.String r1 = "localhost"
            r11.mo20061e(r0, r1)
            e4.d r11 = r9.f20771c
            r10.mo21976p(r11)
            e4.d r11 = r9.f20771c
            t3.a r11 = (p257t3.C6557a) r11
            java.lang.String r0 = "packagingData"
            java.lang.String r12 = r12.getValue(r0)
            java.lang.String r10 = r10.mo21977q(r12)
            r12 = 0
            if (r10 != 0) goto L_0x0151
            goto L_0x0165
        L_0x0151:
            java.lang.String r10 = r10.trim()
            java.lang.String r0 = "true"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0160
            r12 = 1
            goto L_0x0165
        L_0x0160:
            java.lang.String r0 = "false"
            r0.equalsIgnoreCase(r10)
        L_0x0165:
            r11.f20372r = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p295w3.C6974b.mo170m(o4.h, java.lang.String, org.xml.sax.helpers.AttributesImpl):void");
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        mo22865i("End of configuration.");
        hVar.mo21975o();
    }
}
