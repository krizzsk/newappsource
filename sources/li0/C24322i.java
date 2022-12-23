package li0;

import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23566v;
import hi0.C23571x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import ki0.C23798d;
import ki0.C23803h;

/* renamed from: li0.i */
public final class C24322i implements C23560s {

    /* renamed from: a */
    public final C23566v f61627a;

    public C24322i(C23566v vVar) {
        this.f61627a = vVar;
    }

    /* renamed from: b */
    public static int m61068b(C23529c0 c0Var, int i) {
        String r = c0Var.mo58641r("Retry-After");
        if (r == null) {
            return i;
        }
        if (r.matches("\\d+")) {
            return Integer.valueOf(r).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final boolean mo60466a(IOException iOException, C23803h hVar, boolean z, C23571x xVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (!this.f61627a.f59597x) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        C23798d dVar = hVar.f60155h;
        synchronized (dVar.f60109c) {
            z3 = dVar.f60114h;
        }
        if (!z3 || !hVar.f60155h.mo59033c()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: hi0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: javax.net.ssl.SSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: hi0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: hi0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: javax.net.ssl.HostnameVerifier} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.IOException, ki0.d] */
    /* JADX WARNING: type inference failed for: r19v0, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: type inference failed for: r3v47 */
    /* JADX WARNING: type inference failed for: r19v3 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0221 A[SYNTHETIC] */
    public final hi0.C23529c0 intercept(hi0.C23560s.C23561a r27) throws java.io.IOException {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            li0.f r0 = (li0.C24319f) r0
            hi0.x r0 = r0.f61618e
            r2 = r27
            li0.f r2 = (li0.C24319f) r2
            ki0.h r9 = r2.f61615b
            r3 = 0
            r4 = 0
            r10 = r0
            r11 = r3
            r12 = 0
        L_0x0013:
            hi0.x r0 = r9.f60154g
            r4 = 1
            if (r0 == 0) goto L_0x0042
            hi0.r r0 = r0.f59636a
            hi0.r r5 = r10.f59636a
            boolean r0 = ii0.C23610d.m57809q(r0, r5)
            if (r0 == 0) goto L_0x002e
            ki0.d r0 = r9.f60155h
            boolean r0 = r0.mo59033c()
            if (r0 == 0) goto L_0x002e
            r27 = r12
            goto L_0x009e
        L_0x002e:
            ki0.c r0 = r9.f60157j
            if (r0 != 0) goto L_0x003c
            ki0.d r0 = r9.f60155h
            if (r0 == 0) goto L_0x0042
            r9.mo59052d(r3, r4)
            r9.f60155h = r3
            goto L_0x0042
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0042:
            r9.f60154g = r10
            ki0.d r0 = new ki0.d
            ki0.f r5 = r9.f60149b
            hi0.r r4 = r10.f59636a
            java.lang.String r6 = r4.f59534a
            java.lang.String r7 = "https"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0063
            hi0.v r3 = r9.f60148a
            javax.net.ssl.SSLSocketFactory r6 = r3.f59587n
            javax.net.ssl.HostnameVerifier r7 = r3.f59589p
            hi0.g r3 = r3.f59590q
            r20 = r3
            r18 = r6
            r19 = r7
            goto L_0x0069
        L_0x0063:
            r18 = r3
            r19 = r18
            r20 = r19
        L_0x0069:
            hi0.a r6 = new hi0.a
            java.lang.String r14 = r4.f59537d
            int r15 = r4.f59538e
            hi0.v r3 = r9.f60148a
            hi0.m r4 = r3.f59594u
            javax.net.SocketFactory r7 = r3.f59586m
            hi0.b r8 = r3.f59591r
            java.net.Proxy r13 = r3.f59576c
            r27 = r12
            java.util.List<okhttp3.Protocol> r12 = r3.f59577d
            java.util.List<hi0.i> r1 = r3.f59578e
            java.net.ProxySelector r3 = r3.f59582i
            r22 = r13
            r13 = r6
            r16 = r4
            r17 = r7
            r21 = r8
            r23 = r12
            r24 = r1
            r25 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            hi0.e r7 = r9.f60150c
            hi0.n r8 = r9.f60151d
            r3 = r0
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f60155h = r0
        L_0x009e:
            ki0.f r1 = r9.f60149b
            monitor-enter(r1)
            boolean r0 = r9.f60160m     // Catch:{ all -> 0x02b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x02b6 }
            if (r0 != 0) goto L_0x02ac
            r3 = 0
            hi0.c0 r0 = r2.mo60465b(r10, r9, r3)     // Catch:{ RouteException -> 0x028b, IOException -> 0x0277, all -> 0x0273 }
            if (r11 == 0) goto L_0x00d0
            hi0.c0$a r1 = new hi0.c0$a
            r1.<init>(r0)
            hi0.c0$a r0 = new hi0.c0$a
            r0.<init>(r11)
            r0.f59430g = r3
            hi0.c0 r0 = r0.mo58645a()
            hi0.e0 r3 = r0.f59416h
            if (r3 != 0) goto L_0x00c8
            r1.f59433j = r0
            hi0.c0 r0 = r1.mo58645a()
            goto L_0x00d0
        L_0x00c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "priorResponse.body != null"
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            r11 = r0
            hi0.v$a r0 = ii0.C23607a.f59680a
            r0.getClass()
            ki0.c r0 = r11.f59422n
            if (r0 == 0) goto L_0x00e1
            ki0.e r1 = r0.mo59026b()
            hi0.f0 r1 = r1.f60117c
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            int r3 = r11.f59412d
            hi0.x r4 = r11.f59410b
            java.lang.String r4 = r4.f59637b
            r5 = 307(0x133, float:4.3E-43)
            java.lang.String r6 = "GET"
            if (r3 == r5) goto L_0x0175
            r5 = 308(0x134, float:4.32E-43)
            if (r3 == r5) goto L_0x0175
            r5 = 401(0x191, float:5.62E-43)
            if (r3 == r5) goto L_0x016b
            r5 = 503(0x1f7, float:7.05E-43)
            if (r3 == r5) goto L_0x0153
            r5 = 407(0x197, float:5.7E-43)
            if (r3 == r5) goto L_0x012f
            r1 = 408(0x198, float:5.72E-43)
            if (r3 == r1) goto L_0x010e
            switch(r3) {
                case 300: goto L_0x010a;
                case 301: goto L_0x010a;
                case 302: goto L_0x010a;
                case 303: goto L_0x010a;
                default: goto L_0x0105;
            }
        L_0x0105:
            r1 = 0
            r7 = r26
            goto L_0x01c7
        L_0x010a:
            r7 = r26
            goto L_0x0186
        L_0x010e:
            r7 = r26
            hi0.v r3 = r7.f61627a
            boolean r3 = r3.f59597x
            if (r3 != 0) goto L_0x0118
            goto L_0x01c6
        L_0x0118:
            hi0.c0 r3 = r11.f59419k
            if (r3 == 0) goto L_0x0122
            int r3 = r3.f59412d
            if (r3 != r1) goto L_0x0122
            goto L_0x01c6
        L_0x0122:
            r1 = 0
            int r1 = m61068b(r11, r1)
            if (r1 <= 0) goto L_0x012b
            goto L_0x01c6
        L_0x012b:
            hi0.x r1 = r11.f59410b
            goto L_0x01c7
        L_0x012f:
            r7 = r26
            if (r1 == 0) goto L_0x0136
            java.net.Proxy r1 = r1.f59462b
            goto L_0x013a
        L_0x0136:
            hi0.v r1 = r7.f61627a
            java.net.Proxy r1 = r1.f59576c
        L_0x013a:
            java.net.Proxy$Type r1 = r1.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            if (r1 != r3) goto L_0x014b
            hi0.v r1 = r7.f61627a
            hi0.b r1 = r1.f59591r
            r1.getClass()
            goto L_0x01c6
        L_0x014b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r1)
            throw r0
        L_0x0153:
            r7 = r26
            hi0.c0 r1 = r11.f59419k
            if (r1 == 0) goto L_0x015f
            int r1 = r1.f59412d
            if (r1 != r5) goto L_0x015f
            goto L_0x01c6
        L_0x015f:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = m61068b(r11, r1)
            if (r1 != 0) goto L_0x01c6
            hi0.x r1 = r11.f59410b
            goto L_0x01c7
        L_0x016b:
            r7 = r26
            hi0.v r1 = r7.f61627a
            hi0.b r1 = r1.f59592s
            r1.getClass()
            goto L_0x01c6
        L_0x0175:
            r7 = r26
            boolean r1 = r4.equals(r6)
            if (r1 != 0) goto L_0x0186
            java.lang.String r1 = "HEAD"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0186
            goto L_0x01c6
        L_0x0186:
            hi0.v r1 = r7.f61627a
            boolean r1 = r1.f59596w
            if (r1 != 0) goto L_0x018d
            goto L_0x01c6
        L_0x018d:
            java.lang.String r1 = "Location"
            java.lang.String r1 = r11.mo58641r(r1)
            if (r1 != 0) goto L_0x0196
            goto L_0x01c6
        L_0x0196:
            hi0.x r3 = r11.f59410b
            hi0.r r3 = r3.f59636a
            r3.getClass()
            hi0.r$a r5 = new hi0.r$a     // Catch:{ IllegalArgumentException -> 0x01a6 }
            r5.<init>()     // Catch:{ IllegalArgumentException -> 0x01a6 }
            r5.mo58708c(r3, r1)     // Catch:{ IllegalArgumentException -> 0x01a6 }
            goto L_0x01a7
        L_0x01a6:
            r5 = 0
        L_0x01a7:
            if (r5 == 0) goto L_0x01ae
            hi0.r r1 = r5.mo58707b()
            goto L_0x01af
        L_0x01ae:
            r1 = 0
        L_0x01af:
            if (r1 != 0) goto L_0x01b2
            goto L_0x01c6
        L_0x01b2:
            java.lang.String r3 = r1.f59534a
            hi0.x r5 = r11.f59410b
            hi0.r r5 = r5.f59636a
            java.lang.String r5 = r5.f59534a
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01c9
            hi0.v r3 = r7.f61627a
            boolean r3 = r3.f59595v
            if (r3 != 0) goto L_0x01c9
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            r10 = r1
            goto L_0x021f
        L_0x01c9:
            hi0.x r3 = r11.f59410b
            r3.getClass()
            hi0.x$a r5 = new hi0.x$a
            r5.<init>(r3)
            boolean r3 = mf0.C24361g.m61163g0(r4)
            if (r3 == 0) goto L_0x0208
            java.lang.String r3 = "PROPFIND"
            boolean r8 = r4.equals(r3)
            boolean r3 = r4.equals(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x01ec
            r3 = 0
            r5.mo58728b(r6, r3)
            goto L_0x01f7
        L_0x01ec:
            if (r8 == 0) goto L_0x01f3
            hi0.x r3 = r11.f59410b
            hi0.b0 r3 = r3.f59639d
            goto L_0x01f4
        L_0x01f3:
            r3 = 0
        L_0x01f4:
            r5.mo58728b(r4, r3)
        L_0x01f7:
            if (r8 != 0) goto L_0x0208
            java.lang.String r3 = "Transfer-Encoding"
            r5.mo58729c(r3)
            java.lang.String r3 = "Content-Length"
            r5.mo58729c(r3)
            java.lang.String r3 = "Content-Type"
            r5.mo58729c(r3)
        L_0x0208:
            hi0.x r3 = r11.f59410b
            hi0.r r3 = r3.f59636a
            boolean r3 = ii0.C23610d.m57809q(r3, r1)
            if (r3 != 0) goto L_0x0217
            java.lang.String r3 = "Authorization"
            r5.mo58729c(r3)
        L_0x0217:
            r5.mo58730d(r1)
            hi0.x r1 = r5.mo58727a()
            goto L_0x01c7
        L_0x021f:
            if (r10 != 0) goto L_0x023b
            if (r0 == 0) goto L_0x023a
            boolean r0 = r0.f60096e
            if (r0 == 0) goto L_0x023a
            boolean r0 = r9.f60161n
            if (r0 != 0) goto L_0x0234
            r0 = 1
            r9.f60161n = r0
            ki0.h$a r0 = r9.f60152e
            r0.mo61363i()
            goto L_0x023a
        L_0x0234:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x023a:
            return r11
        L_0x023b:
            hi0.e0 r1 = r11.f59416h
            ii0.C23610d.m57796d(r1)
            ki0.f r1 = r9.f60149b
            monitor-enter(r1)
            ki0.c r3 = r9.f60157j     // Catch:{ all -> 0x0270 }
            if (r3 == 0) goto L_0x0249
            r3 = 1
            goto L_0x024a
        L_0x0249:
            r3 = 0
        L_0x024a:
            monitor-exit(r1)     // Catch:{ all -> 0x0270 }
            if (r3 == 0) goto L_0x025b
            li0.c r1 = r0.f60095d
            r1.cancel()
            ki0.h r1 = r0.f60092a
            r3 = 1
            r4 = 0
            r1.mo59051c(r0, r3, r3, r4)
            r3 = r4
            goto L_0x025d
        L_0x025b:
            r0 = 0
            r3 = r0
        L_0x025d:
            int r12 = r27 + 1
            r0 = 20
            if (r12 > r0) goto L_0x0264
            goto L_0x029f
        L_0x0264:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many follow-up requests: "
            java.lang.String r1 = p379.C16759e.m42349e(r1, r12)
            r0.<init>(r1)
            throw r0
        L_0x0270:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0270 }
            throw r0
        L_0x0273:
            r0 = move-exception
            r7 = r26
            goto L_0x02a8
        L_0x0277:
            r0 = move-exception
            r7 = r26
            r1 = r0
            boolean r0 = r1 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x02a7 }
            if (r0 != 0) goto L_0x0282
            r0 = 1
            goto L_0x0283
        L_0x0282:
            r0 = 0
        L_0x0283:
            boolean r0 = r7.mo60466a(r1, r9, r0, r10)     // Catch:{ all -> 0x02a7 }
            if (r0 == 0) goto L_0x028a
            goto L_0x029a
        L_0x028a:
            throw r1     // Catch:{ all -> 0x02a7 }
        L_0x028b:
            r0 = move-exception
            r7 = r26
            r1 = r0
            java.io.IOException r0 = r1.mo60863c()     // Catch:{ all -> 0x02a7 }
            r4 = 0
            boolean r0 = r7.mo60466a(r0, r9, r4, r10)     // Catch:{ all -> 0x02a7 }
            if (r0 == 0) goto L_0x02a2
        L_0x029a:
            r9.mo59050b()
            r12 = r27
        L_0x029f:
            r1 = r7
            goto L_0x0013
        L_0x02a2:
            java.io.IOException r0 = r1.mo60862b()     // Catch:{ all -> 0x02a7 }
            throw r0     // Catch:{ all -> 0x02a7 }
        L_0x02a7:
            r0 = move-exception
        L_0x02a8:
            r9.mo59050b()
            throw r0
        L_0x02ac:
            r7 = r26
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x02b6:
            r0 = move-exception
            r7 = r26
        L_0x02b9:
            monitor-exit(r1)     // Catch:{ all -> 0x02bb }
            throw r0
        L_0x02bb:
            r0 = move-exception
            goto L_0x02b9
        */
        throw new UnsupportedOperationException("Method not decompiled: li0.C24322i.intercept(hi0.s$a):hi0.c0");
    }
}
