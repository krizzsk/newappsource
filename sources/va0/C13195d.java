package va0;

import java.net.HttpURLConnection;
import java.util.Map;
import na0.C12925d;
import na0.C12928f;

/* renamed from: va0.d */
public final class C13195d extends C13194c {

    /* renamed from: d */
    public String f32765d;

    /* renamed from: e */
    public HttpURLConnection f32766e;

    /* renamed from: f */
    public Map<String, String> f32767f = null;

    public C13195d(C12928f fVar, C12925d dVar, long j, String str) {
        super(fVar, dVar, j);
        this.f32765d = str;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    public final void mo40072a(byte[] r14) {
        /*
            r13 = this;
            na0.d r0 = r13.f32763b
            ma0.c r0 = r0.f32004b
            long r1 = r13.f32764c
            boolean r0 = r0.mo39768b(r1, r14)
            if (r0 == 0) goto L_0x00a7
            if (r14 == 0) goto L_0x00a7
            java.net.HttpURLConnection r0 = r13.f32766e
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0016
            goto L_0x0026
        L_0x0016:
            java.util.Map r0 = r0.getHeaderFields()     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x001d
            goto L_0x0026
        L_0x001d:
            java.lang.String r1 = "Cache-Control"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x005a }
            r1 = r0
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x005a }
        L_0x0026:
            if (r1 != 0) goto L_0x0029
            goto L_0x005b
        L_0x0029:
            java.util.Iterator r0 = r1.iterator()     // Catch:{ Exception -> 0x005a }
        L_0x002d:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x005a }
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x003c
            goto L_0x002d
        L_0x003c:
            java.lang.String r4 = r1.trim()     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = "max-age="
            boolean r4 = r4.startsWith(r5)     // Catch:{ Exception -> 0x005a }
            if (r4 != 0) goto L_0x0049
            goto L_0x002d
        L_0x0049:
            r0 = 8
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x005a }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x005a }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x005a }
            long r0 = r4.toMillis(r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x005c
        L_0x005a:
        L_0x005b:
            r0 = r2
        L_0x005c:
            long r4 = java.lang.System.currentTimeMillis()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 7
            long r0 = r0.toMillis(r1)
        L_0x006d:
            long r4 = r4 + r0
            na0.d r0 = r13.f32763b
            ma0.b r0 = r0.f32006d
            long r10 = r13.f32764c
            java.util.concurrent.ExecutorService r1 = r0.f31916c
            ma0.b$a r2 = new ma0.b$a
            c00.r<nz.b<java.lang.Long>> r7 = r0.f31915b
            java.io.File r8 = r0.f31914a
            int r9 = r0.f31917d
            nz.a r12 = new nz.a
            r12.<init>(r4, r14)
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r12)
            r1.submit(r2)
            na0.d r0 = r13.f32763b
            ma0.a r0 = r0.f32005c
            long r1 = r13.f32764c
            monitor-enter(r0)
            int r3 = r0.f31909a     // Catch:{ all -> 0x00a4 }
            if (r3 != 0) goto L_0x0097
            monitor-exit(r0)
            goto L_0x00a7
        L_0x0097:
            int r3 = r0.f31910b     // Catch:{ all -> 0x00a4 }
            int r4 = r14.length     // Catch:{ all -> 0x00a4 }
            int r3 = r3 + r4
            r0.f31910b = r3     // Catch:{ all -> 0x00a4 }
            ma0.a$a r3 = r0.f31911c     // Catch:{ all -> 0x00a4 }
            r3.mo40146d(r1, r14)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)
            goto L_0x00a7
        L_0x00a4:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va0.C13195d.mo40072a(byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        if (r0 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r0 = r4.f32763b.f32003a;
        r1 = r4.f32764c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.f32014a.mo40150d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r4.f32763b.f32012j.mo39976m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if (r0 != null) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0066 }
            java.lang.String r1 = r4.f32765d     // Catch:{ IOException -> 0x0066 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0066 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0066 }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ IOException -> 0x0066 }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0066 }
            r4.f32766e = r0     // Catch:{ IOException -> 0x0066 }
            r1 = 5000(0x1388, float:7.006E-42)
            r0.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r0 = r4.f32766e     // Catch:{ IOException -> 0x0066 }
            r0.setReadTimeout(r1)     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r0 = r4.f32766e     // Catch:{ IOException -> 0x0066 }
            r1 = 0
            r0.setUseCaches(r1)     // Catch:{ IOException -> 0x0066 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f32767f     // Catch:{ IOException -> 0x0066 }
            if (r0 == 0) goto L_0x004f
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0066 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0066 }
        L_0x0031:
            boolean r1 = r0.hasNext()     // Catch:{ IOException -> 0x0066 }
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r0.next()     // Catch:{ IOException -> 0x0066 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r2 = r4.f32766e     // Catch:{ IOException -> 0x0066 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0066 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0066 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0066 }
            r2.addRequestProperty(r3, r1)     // Catch:{ IOException -> 0x0066 }
            goto L_0x0031
        L_0x004f:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r1 = r4.f32766e     // Catch:{ IOException -> 0x0066 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0066 }
            r2 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0066 }
            r4.mo40073b(r0)     // Catch:{ IOException -> 0x0066 }
            java.net.HttpURLConnection r0 = r4.f32766e
            if (r0 == 0) goto L_0x0077
            goto L_0x0074
        L_0x0064:
            r0 = move-exception
            goto L_0x008f
        L_0x0066:
            r0 = move-exception
            java.lang.Class<va0.d> r1 = va0.C13195d.class
            r0.getMessage()     // Catch:{ all -> 0x0064 }
            r0 = 0
            r4.mo40072a(r0)     // Catch:{ all -> 0x0064 }
            java.net.HttpURLConnection r0 = r4.f32766e
            if (r0 == 0) goto L_0x0077
        L_0x0074:
            r0.disconnect()
        L_0x0077:
            na0.d r0 = r4.f32763b
            na0.d$a r0 = r0.f32003a
            long r1 = r4.f32764c
            monitor-enter(r0)
            ya0.h<java.lang.Object> r3 = r0.f32014a     // Catch:{ all -> 0x008c }
            r3.mo40150d(r1)     // Catch:{ all -> 0x008c }
            monitor-exit(r0)
            na0.d r0 = r4.f32763b
            sa0.e r0 = r0.f32012j
            r0.mo39976m()
            return
        L_0x008c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x008f:
            java.net.HttpURLConnection r1 = r4.f32766e
            if (r1 == 0) goto L_0x0096
            r1.disconnect()
        L_0x0096:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va0.C13195d.run():void");
    }
}
