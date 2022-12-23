package ji0;

import com.amazonaws.http.HttpHeader;
import hi0.C23529c0;
import hi0.C23560s;

/* renamed from: ji0.b */
public final class C23738b implements C23560s {

    /* renamed from: a */
    public final C23749h f59966a;

    public C23738b(C23749h hVar) {
        this.f59966a = hVar;
    }

    /* renamed from: a */
    public static boolean m58303a(String str) {
        if (HttpHeader.CONTENT_LENGTH.equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || HttpHeader.CONTENT_TYPE.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m58304b(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static C23529c0 m58305c(C23529c0 c0Var) {
        if (c0Var == null || c0Var.f59416h == null) {
            return c0Var;
        }
        C23529c0.C23530a aVar = new C23529c0.C23530a(c0Var);
        aVar.f59430g = null;
        return aVar.mo58645a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: hi0.c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: ji0.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: ji0.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: ji0.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: ji0.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: hi0.c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: hi0.c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: ji0.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: ji0.e$b} */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0222, code lost:
        if (r3 > 0) goto L_0x0224;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x036f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hi0.C23529c0 intercept(hi0.C23560s.C23561a r26) throws java.io.IOException {
        /*
            r25 = this;
            r1 = r25
            ji0.h r0 = r1.f59966a
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00e3
            r5 = r26
            li0.f r5 = (li0.C24319f) r5
            hi0.x r5 = r5.f61618e
            hi0.c$a r0 = (hi0.C23522c.C23523a) r0
            hi0.c r0 = hi0.C23522c.this
            r0.getClass()
            hi0.r r6 = r5.f59636a
            java.lang.String r6 = hi0.C23522c.m57651f(r6)
            ji0.e r0 = r0.f59384c     // Catch:{ IOException -> 0x00df }
            ji0.e$d r0 = r0.mo58980h(r6)     // Catch:{ IOException -> 0x00df }
            if (r0 != 0) goto L_0x0025
            goto L_0x00e0
        L_0x0025:
            hi0.c$d r6 = new hi0.c$d     // Catch:{ IOException -> 0x00db }
            si0.c0[] r7 = r0.f60006d     // Catch:{ IOException -> 0x00db }
            r7 = r7[r3]     // Catch:{ IOException -> 0x00db }
            r6.<init>((si0.C24893c0) r7)     // Catch:{ IOException -> 0x00db }
            hi0.q r7 = r6.f59406g
            java.lang.String r8 = "Content-Type"
            java.lang.String r7 = r7.mo58682c(r8)
            hi0.q r8 = r6.f59406g
            java.lang.String r9 = "Content-Length"
            java.lang.String r8 = r8.mo58682c(r9)
            hi0.x$a r9 = new hi0.x$a
            r9.<init>()
            java.lang.String r10 = r6.f59400a
            r9.mo58731e(r10)
            java.lang.String r10 = r6.f59402c
            r9.mo58728b(r10, r4)
            hi0.q r10 = r6.f59401b
            hi0.q$a r10 = r10.mo58684e()
            r9.f59644c = r10
            hi0.x r9 = r9.mo58727a()
            hi0.c0$a r10 = new hi0.c0$a
            r10.<init>()
            r10.f59424a = r9
            okhttp3.Protocol r9 = r6.f59403d
            r10.f59425b = r9
            int r9 = r6.f59404e
            r10.f59426c = r9
            java.lang.String r9 = r6.f59405f
            r10.f59427d = r9
            hi0.q r9 = r6.f59406g
            hi0.q$a r9 = r9.mo58684e()
            r10.f59429f = r9
            hi0.c$c r9 = new hi0.c$c
            r9.<init>(r0, r7, r8)
            r10.f59430g = r9
            hi0.p r0 = r6.f59407h
            r10.f59428e = r0
            long r7 = r6.f59408i
            r10.f59434k = r7
            long r7 = r6.f59409j
            r10.f59435l = r7
            hi0.c0 r0 = r10.mo58645a()
            java.lang.String r7 = r6.f59400a
            hi0.r r8 = r5.f59636a
            java.lang.String r8 = r8.f59542i
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00d2
            java.lang.String r7 = r6.f59402c
            java.lang.String r8 = r5.f59637b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00d2
            hi0.q r6 = r6.f59401b
            int r7 = li0.C24318e.f61613a
            hi0.q r7 = r0.f59415g
            java.util.Set r7 = li0.C24318e.m61061f(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x00af:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00cd
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.List r9 = r6.mo58687h(r8)
            hi0.q r10 = r5.f59638c
            java.util.List r8 = r10.mo58687h(r8)
            boolean r8 = java.util.Objects.equals(r9, r8)
            if (r8 != 0) goto L_0x00af
            r5 = 0
            goto L_0x00ce
        L_0x00cd:
            r5 = 1
        L_0x00ce:
            if (r5 == 0) goto L_0x00d2
            r5 = 1
            goto L_0x00d3
        L_0x00d2:
            r5 = 0
        L_0x00d3:
            if (r5 != 0) goto L_0x00e1
            hi0.e0 r0 = r0.f59416h
            ii0.C23610d.m57796d(r0)
            goto L_0x00e0
        L_0x00db:
            ii0.C23610d.m57796d(r0)
            goto L_0x00e0
        L_0x00df:
        L_0x00e0:
            r0 = r4
        L_0x00e1:
            r5 = r0
            goto L_0x00e4
        L_0x00e3:
            r5 = r4
        L_0x00e4:
            long r6 = java.lang.System.currentTimeMillis()
            r0 = r26
            li0.f r0 = (li0.C24319f) r0
            hi0.x r8 = r0.f61618e
            if (r5 == 0) goto L_0x015e
            long r12 = r5.f59420l
            long r14 = r5.f59421m
            hi0.q r2 = r5.f59415g
            java.lang.String[] r3 = r2.f59531a
            int r3 = r3.length
            int r3 = r3 / 2
            r16 = r4
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r10 = 0
            r11 = -1
        L_0x0109:
            if (r10 >= r3) goto L_0x016f
            java.lang.String r4 = r2.mo58683d(r10)
            java.lang.String r9 = r2.mo58686g(r10)
            r22 = r2
            java.lang.String r2 = "Date"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0124
            java.util.Date r16 = li0.C24316d.m61055a(r9)
            r21 = r9
            goto L_0x0158
        L_0x0124:
            java.lang.String r2 = "Expires"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0131
            java.util.Date r17 = li0.C24316d.m61055a(r9)
            goto L_0x0158
        L_0x0131:
            java.lang.String r2 = "Last-Modified"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0140
            java.util.Date r18 = li0.C24316d.m61055a(r9)
            r20 = r9
            goto L_0x0158
        L_0x0140:
            java.lang.String r2 = "ETag"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x014b
            r19 = r9
            goto L_0x0158
        L_0x014b:
            java.lang.String r2 = "Age"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0158
            r2 = -1
            int r11 = li0.C24318e.m61058c(r2, r9)
        L_0x0158:
            int r10 = r10 + 1
            r2 = r22
            r4 = 0
            goto L_0x0109
        L_0x015e:
            r11 = -1
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x016f:
            if (r5 != 0) goto L_0x0178
            ji0.d r2 = new ji0.d
            r3 = 0
            r2.<init>(r8, r3)
            goto L_0x019b
        L_0x0178:
            hi0.r r2 = r8.f59636a
            java.lang.String r2 = r2.f59534a
            java.lang.String r3 = "https"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x018f
            hi0.p r2 = r5.f59414f
            if (r2 != 0) goto L_0x018f
            ji0.d r2 = new ji0.d
            r3 = 0
            r2.<init>(r8, r3)
            goto L_0x019b
        L_0x018f:
            r3 = 0
            boolean r2 = ji0.C23740d.m58306a(r8, r5)
            if (r2 != 0) goto L_0x019f
            ji0.d r2 = new ji0.d
            r2.<init>(r8, r3)
        L_0x019b:
            r22 = r0
            goto L_0x032a
        L_0x019f:
            hi0.d r2 = r8.f59641f
            if (r2 == 0) goto L_0x01a4
            goto L_0x01ac
        L_0x01a4:
            hi0.q r2 = r8.f59638c
            hi0.d r2 = hi0.C23531d.m57670a(r2)
            r8.f59641f = r2
        L_0x01ac:
            boolean r3 = r2.f59437a
            if (r3 != 0) goto L_0x0322
            java.lang.String r3 = "If-Modified-Since"
            java.lang.String r4 = r8.mo58725a(r3)
            java.lang.String r9 = "If-None-Match"
            if (r4 != 0) goto L_0x01c3
            java.lang.String r4 = r8.mo58725a(r9)
            if (r4 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r4 = 0
            goto L_0x01c4
        L_0x01c3:
            r4 = 1
        L_0x01c4:
            if (r4 == 0) goto L_0x01c8
            goto L_0x0322
        L_0x01c8:
            hi0.d r4 = r5.mo58639i()
            if (r16 == 0) goto L_0x01e0
            long r22 = r16.getTime()
            r24 = r9
            long r9 = r14 - r22
            r22 = r0
            r0 = 0
            long r9 = java.lang.Math.max(r0, r9)
            r0 = -1
            goto L_0x01e7
        L_0x01e0:
            r22 = r0
            r24 = r9
            r0 = -1
            r9 = 0
        L_0x01e7:
            if (r11 == r0) goto L_0x01f8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = r3
            r23 = r4
            long r3 = (long) r11
            long r3 = r0.toMillis(r3)
            long r9 = java.lang.Math.max(r9, r3)
            goto L_0x01fb
        L_0x01f8:
            r1 = r3
            r23 = r4
        L_0x01fb:
            long r3 = r14 - r12
            long r6 = r6 - r14
            long r9 = r9 + r3
            long r9 = r9 + r6
            hi0.d r0 = r5.mo58639i()
            int r0 = r0.f59439c
            r3 = -1
            if (r0 == r3) goto L_0x0211
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = (long) r0
            long r3 = r3.toMillis(r6)
            goto L_0x0224
        L_0x0211:
            if (r17 == 0) goto L_0x0228
            if (r16 == 0) goto L_0x0219
            long r14 = r16.getTime()
        L_0x0219:
            long r3 = r17.getTime()
            long r3 = r3 - r14
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x025a
        L_0x0224:
            r6 = r3
            r3 = 0
            goto L_0x025d
        L_0x0228:
            if (r18 == 0) goto L_0x025a
            hi0.x r0 = r5.f59410b
            hi0.r r0 = r0.f59636a
            java.util.List<java.lang.String> r3 = r0.f59540g
            if (r3 != 0) goto L_0x0234
            r0 = 0
            goto L_0x0242
        L_0x0234:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List<java.lang.String> r0 = r0.f59540g
            hi0.C23558r.m57726k(r3, r0)
            java.lang.String r0 = r3.toString()
        L_0x0242:
            if (r0 != 0) goto L_0x025a
            if (r16 == 0) goto L_0x024a
            long r12 = r16.getTime()
        L_0x024a:
            long r3 = r18.getTime()
            long r12 = r12 - r3
            r3 = 0
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x025c
            r6 = 10
            long r6 = r12 / r6
            goto L_0x025d
        L_0x025a:
            r3 = 0
        L_0x025c:
            r6 = r3
        L_0x025d:
            int r0 = r2.f59439c
            r11 = -1
            if (r0 == r11) goto L_0x026d
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r0
            long r12 = r12.toMillis(r13)
            long r6 = java.lang.Math.min(r6, r12)
        L_0x026d:
            int r0 = r2.f59445i
            if (r0 == r11) goto L_0x0279
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r0
            long r12 = r12.toMillis(r13)
            goto L_0x027a
        L_0x0279:
            r12 = r3
        L_0x027a:
            r0 = r23
            boolean r14 = r0.f59443g
            if (r14 != 0) goto L_0x028c
            int r2 = r2.f59444h
            if (r2 == r11) goto L_0x028c
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = (long) r2
            long r2 = r3.toMillis(r14)
            goto L_0x028d
        L_0x028c:
            r2 = r3
        L_0x028d:
            boolean r0 = r0.f59437a
            if (r0 != 0) goto L_0x02d2
            long r12 = r12 + r9
            long r2 = r2 + r6
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d2
            hi0.c0$a r0 = new hi0.c0$a
            r0.<init>(r5)
            java.lang.String r1 = "Warning"
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x02a9
            hi0.q$a r2 = r0.f59429f
            java.lang.String r3 = "110 HttpURLConnection \"Response is stale\""
            r2.mo58690a(r1, r3)
        L_0x02a9:
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x02c7
            hi0.d r2 = r5.mo58639i()
            int r2 = r2.f59439c
            r3 = -1
            if (r2 != r3) goto L_0x02bd
            if (r17 != 0) goto L_0x02bd
            r2 = 1
            goto L_0x02be
        L_0x02bd:
            r2 = 0
        L_0x02be:
            if (r2 == 0) goto L_0x02c7
            hi0.q$a r2 = r0.f59429f
            java.lang.String r3 = "113 HttpURLConnection \"Heuristic expiration\""
            r2.mo58690a(r1, r3)
        L_0x02c7:
            ji0.d r2 = new ji0.d
            hi0.c0 r0 = r0.mo58645a()
            r1 = 0
            r2.<init>(r1, r0)
            goto L_0x032a
        L_0x02d2:
            if (r19 == 0) goto L_0x02d9
            r0 = r19
            r3 = r24
            goto L_0x02e4
        L_0x02d9:
            if (r18 == 0) goto L_0x02df
            r3 = r1
            r0 = r20
            goto L_0x02e4
        L_0x02df:
            if (r16 == 0) goto L_0x031b
            r3 = r1
            r0 = r21
        L_0x02e4:
            hi0.q r1 = r8.f59638c
            hi0.q$a r1 = r1.mo58684e()
            hi0.v$a r2 = ii0.C23607a.f59680a
            r2.getClass()
            r1.mo58692c(r3, r0)
            hi0.x$a r0 = new hi0.x$a
            r0.<init>(r8)
            java.util.ArrayList r1 = r1.f59532a
            int r2 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            hi0.q$a r2 = new hi0.q$a
            r2.<init>()
            java.util.ArrayList r3 = r2.f59532a
            java.util.Collections.addAll(r3, r1)
            r0.f59644c = r2
            hi0.x r0 = r0.mo58727a()
            ji0.d r2 = new ji0.d
            r2.<init>(r0, r5)
            goto L_0x032a
        L_0x031b:
            ji0.d r2 = new ji0.d
            r0 = 0
            r2.<init>(r8, r0)
            goto L_0x032a
        L_0x0322:
            r22 = r0
            r0 = 0
            ji0.d r2 = new ji0.d
            r2.<init>(r8, r0)
        L_0x032a:
            hi0.x r0 = r2.f59967a
            if (r0 == 0) goto L_0x0346
            hi0.d r0 = r8.f59641f
            if (r0 == 0) goto L_0x0333
            goto L_0x033b
        L_0x0333:
            hi0.q r0 = r8.f59638c
            hi0.d r0 = hi0.C23531d.m57670a(r0)
            r8.f59641f = r0
        L_0x033b:
            boolean r0 = r0.f59446j
            if (r0 == 0) goto L_0x0346
            ji0.d r2 = new ji0.d
            r3 = 0
            r2.<init>(r3, r3)
            goto L_0x0347
        L_0x0346:
            r3 = 0
        L_0x0347:
            hi0.x r0 = r2.f59967a
            hi0.c0 r1 = r2.f59968b
            r4 = r25
            ji0.h r6 = r4.f59966a
            if (r6 == 0) goto L_0x0362
            hi0.c$a r6 = (hi0.C23522c.C23523a) r6
            hi0.c r6 = hi0.C23522c.this
            monitor-enter(r6)
            hi0.x r7 = r2.f59967a     // Catch:{ all -> 0x035f }
            if (r7 == 0) goto L_0x035b
            goto L_0x035d
        L_0x035b:
            hi0.c0 r2 = r2.f59968b     // Catch:{ all -> 0x035f }
        L_0x035d:
            monitor-exit(r6)
            goto L_0x0362
        L_0x035f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0362:
            if (r5 == 0) goto L_0x036b
            if (r1 != 0) goto L_0x036b
            hi0.e0 r2 = r5.f59416h
            ii0.C23610d.m57796d(r2)
        L_0x036b:
            r6 = -1
            if (r0 != 0) goto L_0x0399
            if (r1 != 0) goto L_0x0399
            hi0.c0$a r0 = new hi0.c0$a
            r0.<init>()
            r1 = r22
            hi0.x r1 = r1.f61618e
            r0.f59424a = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            r0.f59425b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.f59426c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.f59427d = r1
            hi0.d0 r1 = ii0.C23610d.f59687d
            r0.f59430g = r1
            r0.f59434k = r6
            long r1 = java.lang.System.currentTimeMillis()
            r0.f59435l = r1
            hi0.c0 r0 = r0.mo58645a()
            return r0
        L_0x0399:
            if (r0 != 0) goto L_0x03b5
            r1.getClass()
            hi0.c0$a r0 = new hi0.c0$a
            r0.<init>(r1)
            hi0.c0 r1 = m58305c(r1)
            if (r1 == 0) goto L_0x03ae
            java.lang.String r2 = "cacheResponse"
            hi0.C23529c0.C23530a.m57668b(r2, r1)
        L_0x03ae:
            r0.f59432i = r1
            hi0.c0 r0 = r0.mo58645a()
            return r0
        L_0x03b5:
            r2 = r26
            li0.f r2 = (li0.C24319f) r2     // Catch:{ all -> 0x059d }
            hi0.c0 r2 = r2.mo60464a(r0)     // Catch:{ all -> 0x059d }
            if (r1 == 0) goto L_0x04c6
            int r5 = r2.f59412d
            r8 = 304(0x130, float:4.26E-43)
            if (r5 != r8) goto L_0x04c1
            hi0.c0$a r0 = new hi0.c0$a
            r0.<init>(r1)
            hi0.q r5 = r1.f59415g
            hi0.q r6 = r2.f59415g
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            java.lang.String[] r8 = r5.f59531a
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = 0
        L_0x03db:
            if (r9 >= r8) goto L_0x041a
            java.lang.String r10 = r5.mo58683d(r9)
            java.lang.String r11 = r5.mo58686g(r9)
            java.lang.String r12 = "Warning"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x03f6
            java.lang.String r12 = "1"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x03f6
            goto L_0x0417
        L_0x03f6:
            boolean r12 = m58303a(r10)
            if (r12 != 0) goto L_0x0408
            boolean r12 = m58304b(r10)
            if (r12 == 0) goto L_0x0408
            java.lang.String r12 = r6.mo58682c(r10)
            if (r12 != 0) goto L_0x0417
        L_0x0408:
            hi0.v$a r12 = ii0.C23607a.f59680a
            r12.getClass()
            r7.add(r10)
            java.lang.String r10 = r11.trim()
            r7.add(r10)
        L_0x0417:
            int r9 = r9 + 1
            goto L_0x03db
        L_0x041a:
            java.lang.String[] r5 = r6.f59531a
            int r5 = r5.length
            int r5 = r5 / 2
            r8 = 0
        L_0x0420:
            if (r8 >= r5) goto L_0x0448
            java.lang.String r9 = r6.mo58683d(r8)
            boolean r10 = m58303a(r9)
            if (r10 != 0) goto L_0x0445
            boolean r10 = m58304b(r9)
            if (r10 == 0) goto L_0x0445
            hi0.v$a r10 = ii0.C23607a.f59680a
            java.lang.String r11 = r6.mo58686g(r8)
            r10.getClass()
            r7.add(r9)
            java.lang.String r9 = r11.trim()
            r7.add(r9)
        L_0x0445:
            int r8 = r8 + 1
            goto L_0x0420
        L_0x0448:
            int r5 = r7.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            hi0.q$a r6 = new hi0.q$a
            r6.<init>()
            java.util.ArrayList r7 = r6.f59532a
            java.util.Collections.addAll(r7, r5)
            r0.f59429f = r6
            long r5 = r2.f59420l
            r0.f59434k = r5
            long r5 = r2.f59421m
            r0.f59435l = r5
            hi0.c0 r5 = m58305c(r1)
            if (r5 == 0) goto L_0x0473
            java.lang.String r6 = "cacheResponse"
            hi0.C23529c0.C23530a.m57668b(r6, r5)
        L_0x0473:
            r0.f59432i = r5
            hi0.c0 r5 = m58305c(r2)
            if (r5 == 0) goto L_0x0480
            java.lang.String r6 = "networkResponse"
            hi0.C23529c0.C23530a.m57668b(r6, r5)
        L_0x0480:
            r0.f59431h = r5
            hi0.c0 r0 = r0.mo58645a()
            hi0.e0 r2 = r2.f59416h
            r2.close()
            ji0.h r2 = r4.f59966a
            hi0.c$a r2 = (hi0.C23522c.C23523a) r2
            hi0.c r2 = hi0.C23522c.this
            monitor-enter(r2)
            monitor-exit(r2)
            ji0.h r2 = r4.f59966a
            hi0.c$a r2 = (hi0.C23522c.C23523a) r2
            hi0.c r2 = hi0.C23522c.this
            r2.getClass()
            hi0.c$d r2 = new hi0.c$d
            r2.<init>((hi0.C23529c0) r0)
            hi0.e0 r1 = r1.f59416h
            hi0.c$c r1 = (hi0.C23522c.C23526c) r1
            ji0.e$d r1 = r1.f59393c
            ji0.e r5 = ji0.C23741e.this     // Catch:{ IOException -> 0x04ba }
            java.lang.String r6 = r1.f60004b     // Catch:{ IOException -> 0x04ba }
            long r7 = r1.f60005c     // Catch:{ IOException -> 0x04ba }
            ji0.e$b r1 = r5.mo58979g(r7, r6)     // Catch:{ IOException -> 0x04ba }
            if (r1 == 0) goto L_0x04c0
            r2.mo58636c(r1)     // Catch:{ IOException -> 0x04bb }
            r1.mo58992b()     // Catch:{ IOException -> 0x04bb }
            goto L_0x04c0
        L_0x04ba:
            r1 = r3
        L_0x04bb:
            if (r1 == 0) goto L_0x04c0
            r1.mo58991a()     // Catch:{ IOException -> 0x04c0 }
        L_0x04c0:
            return r0
        L_0x04c1:
            hi0.e0 r5 = r1.f59416h
            ii0.C23610d.m57796d(r5)
        L_0x04c6:
            hi0.c0$a r5 = new hi0.c0$a
            r5.<init>(r2)
            hi0.c0 r1 = m58305c(r1)
            if (r1 == 0) goto L_0x04d6
            java.lang.String r8 = "cacheResponse"
            hi0.C23529c0.C23530a.m57668b(r8, r1)
        L_0x04d6:
            r5.f59432i = r1
            hi0.c0 r1 = m58305c(r2)
            if (r1 == 0) goto L_0x04e3
            java.lang.String r2 = "networkResponse"
            hi0.C23529c0.C23530a.m57668b(r2, r1)
        L_0x04e3:
            r5.f59431h = r1
            hi0.c0 r1 = r5.mo58645a()
            ji0.h r2 = r4.f59966a
            if (r2 == 0) goto L_0x059c
            boolean r2 = li0.C24318e.m61057b(r1)
            if (r2 == 0) goto L_0x058b
            boolean r2 = ji0.C23740d.m58306a(r0, r1)
            if (r2 == 0) goto L_0x058b
            ji0.h r0 = r4.f59966a
            hi0.c$a r0 = (hi0.C23522c.C23523a) r0
            hi0.c r0 = hi0.C23522c.this
            r0.getClass()
            hi0.x r2 = r1.f59410b
            java.lang.String r2 = r2.f59637b
            boolean r5 = mf0.C24361g.m61150T(r2)
            if (r5 == 0) goto L_0x0514
            hi0.x r2 = r1.f59410b     // Catch:{ IOException -> 0x0512 }
            r0.mo58632h(r2)     // Catch:{ IOException -> 0x0512 }
            goto L_0x0551
        L_0x0512:
            goto L_0x0551
        L_0x0514:
            java.lang.String r5 = "GET"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x051d
            goto L_0x0551
        L_0x051d:
            hi0.q r2 = r1.f59415g
            java.util.Set r2 = li0.C24318e.m61061f(r2)
            java.lang.String r5 = "*"
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x052c
            goto L_0x0551
        L_0x052c:
            hi0.c$d r2 = new hi0.c$d
            r2.<init>((hi0.C23529c0) r1)
            ji0.e r5 = r0.f59384c     // Catch:{ IOException -> 0x054b }
            hi0.x r8 = r1.f59410b     // Catch:{ IOException -> 0x054b }
            hi0.r r8 = r8.f59636a     // Catch:{ IOException -> 0x054b }
            java.lang.String r8 = hi0.C23522c.m57651f(r8)     // Catch:{ IOException -> 0x054b }
            ji0.e$b r5 = r5.mo58979g(r6, r8)     // Catch:{ IOException -> 0x054b }
            if (r5 != 0) goto L_0x0542
            goto L_0x0551
        L_0x0542:
            r2.mo58636c(r5)     // Catch:{ IOException -> 0x054c }
            hi0.c$b r2 = new hi0.c$b     // Catch:{ IOException -> 0x054c }
            r2.<init>(r5)     // Catch:{ IOException -> 0x054c }
            goto L_0x0552
        L_0x054b:
            r5 = r3
        L_0x054c:
            if (r5 == 0) goto L_0x0551
            r5.mo58991a()     // Catch:{ IOException -> 0x0512 }
        L_0x0551:
            r2 = r3
        L_0x0552:
            if (r2 != 0) goto L_0x0555
            goto L_0x058a
        L_0x0555:
            hi0.c$b$a r0 = r2.f59388c
            if (r0 != 0) goto L_0x055a
            goto L_0x058a
        L_0x055a:
            hi0.e0 r3 = r1.f59416h
            si0.i r3 = r3.mo53600t()
            si0.w r5 = new si0.w
            r5.<init>(r0)
            ji0.a r0 = new ji0.a
            r0.<init>(r3, r2, r5)
            java.lang.String r2 = "Content-Type"
            java.lang.String r2 = r1.mo58641r(r2)
            hi0.e0 r3 = r1.f59416h
            long r5 = r3.mo53598i()
            hi0.c0$a r3 = new hi0.c0$a
            r3.<init>(r1)
            li0.g r1 = new li0.g
            si0.x r0 = si0.C24911r.m62547c(r0)
            r1.<init>(r2, r5, r0)
            r3.f59430g = r1
            hi0.c0 r1 = r3.mo58645a()
        L_0x058a:
            return r1
        L_0x058b:
            java.lang.String r2 = r0.f59637b
            boolean r2 = mf0.C24361g.m61150T(r2)
            if (r2 == 0) goto L_0x059c
            ji0.h r2 = r4.f59966a     // Catch:{ IOException -> 0x059c }
            hi0.c$a r2 = (hi0.C23522c.C23523a) r2     // Catch:{ IOException -> 0x059c }
            hi0.c r2 = hi0.C23522c.this     // Catch:{ IOException -> 0x059c }
            r2.mo58632h(r0)     // Catch:{ IOException -> 0x059c }
        L_0x059c:
            return r1
        L_0x059d:
            r0 = move-exception
            if (r5 == 0) goto L_0x05a5
            hi0.e0 r1 = r5.f59416h
            ii0.C23610d.m57796d(r1)
        L_0x05a5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C23738b.intercept(hi0.s$a):hi0.c0");
    }
}
