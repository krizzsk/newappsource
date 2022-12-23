package ni0;

import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23566v;
import hi0.C23571x;
import ii0.C23610d;
import java.io.IOException;
import java.util.List;
import ki0.C23799e;
import li0.C24315c;
import li0.C24318e;
import li0.C24319f;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import si0.C24887a0;
import si0.C24893c0;

/* renamed from: ni0.m */
public final class C24527m implements C24315c {

    /* renamed from: g */
    public static final List<String> f62105g = C23610d.m57805m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f62106h = C23610d.m57805m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final C23560s.C23561a f62107a;

    /* renamed from: b */
    public final C23799e f62108b;

    /* renamed from: c */
    public final C24510d f62109c;

    /* renamed from: d */
    public volatile C24531o f62110d;

    /* renamed from: e */
    public final Protocol f62111e;

    /* renamed from: f */
    public volatile boolean f62112f;

    public C24527m(C23566v vVar, C23799e eVar, C24319f fVar, C24510d dVar) {
        this.f62108b = eVar;
        this.f62107a = fVar;
        this.f62109c = dVar;
        List<Protocol> list = vVar.f59577d;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f62111e = !list.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    /* renamed from: a */
    public final void mo60454a() throws IOException {
        C24531o oVar = this.f62110d;
        synchronized (oVar) {
            if (!oVar.f62129f) {
                if (!oVar.mo60782f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        oVar.f62131h.close();
    }

    /* renamed from: b */
    public final long mo60455b(C23529c0 c0Var) {
        return C24318e.m61056a(c0Var);
    }

    /* renamed from: c */
    public final C24887a0 mo60456c(C23571x xVar, long j) {
        C24531o oVar = this.f62110d;
        synchronized (oVar) {
            if (!oVar.f62129f) {
                if (!oVar.mo60782f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return oVar.f62131h;
    }

    public final void cancel() {
        this.f62112f = true;
        if (this.f62110d != null) {
            this.f62110d.mo60781e(ErrorCode.CANCEL);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60458d(hi0.C23571x r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            ni0.o r2 = r1.f62110d
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            hi0.b0 r2 = r0.f59639d
            r4 = 1
            if (r2 == 0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            hi0.q r5 = r0.f59638c
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.String[] r7 = r5.f59531a
            int r7 = r7.length
            int r7 = r7 / 2
            r8 = 4
            int r7 = r7 + r8
            r6.<init>(r7)
            ni0.a r7 = new ni0.a
            okio.ByteString r9 = ni0.C24505a.f62013f
            java.lang.String r10 = r0.f59637b
            r7.<init>((okio.ByteString) r9, (java.lang.String) r10)
            r6.add(r7)
            ni0.a r7 = new ni0.a
            okio.ByteString r9 = ni0.C24505a.f62014g
            hi0.r r10 = r0.f59636a
            java.lang.String r10 = li0.C24321h.m61067a(r10)
            r7.<init>((okio.ByteString) r9, (java.lang.String) r10)
            r6.add(r7)
            java.lang.String r7 = "Host"
            java.lang.String r7 = r0.mo58725a(r7)
            if (r7 == 0) goto L_0x004d
            ni0.a r9 = new ni0.a
            okio.ByteString r10 = ni0.C24505a.f62016i
            r9.<init>((okio.ByteString) r10, (java.lang.String) r7)
            r6.add(r9)
        L_0x004d:
            ni0.a r7 = new ni0.a
            okio.ByteString r9 = ni0.C24505a.f62015h
            hi0.r r0 = r0.f59636a
            java.lang.String r0 = r0.f59534a
            r7.<init>((okio.ByteString) r9, (java.lang.String) r0)
            r6.add(r7)
            java.lang.String[] r0 = r5.f59531a
            int r0 = r0.length
            int r0 = r0 / 2
            r7 = 0
        L_0x0061:
            if (r7 >= r0) goto L_0x0098
            java.lang.String r9 = r5.mo58683d(r7)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r10)
            java.util.List<java.lang.String> r10 = f62105g
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = "te"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0095
            java.lang.String r10 = r5.mo58686g(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0095
        L_0x0089:
            ni0.a r10 = new ni0.a
            java.lang.String r11 = r5.mo58686g(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r6.add(r10)
        L_0x0095:
            int r7 = r7 + 1
            goto L_0x0061
        L_0x0098:
            ni0.d r5 = r1.f62109c
            r0 = r2 ^ 1
            r13 = 0
            ni0.p r7 = r5.f62063v
            monitor-enter(r7)
            monitor-enter(r5)     // Catch:{ all -> 0x0188 }
            int r9 = r5.f62048g     // Catch:{ all -> 0x0185 }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00ad
            okhttp3.internal.http2.ErrorCode r9 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0185 }
            r5.mo60765k(r9)     // Catch:{ all -> 0x0185 }
        L_0x00ad:
            boolean r9 = r5.f62049h     // Catch:{ all -> 0x0185 }
            if (r9 != 0) goto L_0x017f
            int r15 = r5.f62048g     // Catch:{ all -> 0x0185 }
            int r9 = r15 + 2
            r5.f62048g = r9     // Catch:{ all -> 0x0185 }
            ni0.o r14 = new ni0.o     // Catch:{ all -> 0x0185 }
            r16 = 0
            r9 = r14
            r10 = r15
            r11 = r5
            r12 = r0
            r3 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0185 }
            if (r2 == 0) goto L_0x00d8
            long r9 = r5.f62059r     // Catch:{ all -> 0x0185 }
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x00d8
            long r9 = r3.f62125b     // Catch:{ all -> 0x0185 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            r2 = 0
            goto L_0x00d9
        L_0x00d8:
            r2 = 1
        L_0x00d9:
            boolean r9 = r3.mo60783g()     // Catch:{ all -> 0x0185 }
            if (r9 == 0) goto L_0x00e8
            java.util.LinkedHashMap r9 = r5.f62045d     // Catch:{ all -> 0x0185 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0185 }
            r9.put(r10, r3)     // Catch:{ all -> 0x0185 }
        L_0x00e8:
            monitor-exit(r5)     // Catch:{ all -> 0x0185 }
            ni0.p r9 = r5.f62063v     // Catch:{ all -> 0x0188 }
            monitor-enter(r9)     // Catch:{ all -> 0x0188 }
            boolean r10 = r9.f62152f     // Catch:{ all -> 0x017c }
            if (r10 != 0) goto L_0x0174
            ni0.b$b r10 = r9.f62153g     // Catch:{ all -> 0x017c }
            r10.mo60756d(r6)     // Catch:{ all -> 0x017c }
            si0.f r6 = r9.f62150d     // Catch:{ all -> 0x017c }
            long r10 = r6.f62947c     // Catch:{ all -> 0x017c }
            int r6 = r9.f62151e     // Catch:{ all -> 0x017c }
            long r12 = (long) r6     // Catch:{ all -> 0x017c }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x017c }
            int r6 = (int) r12     // Catch:{ all -> 0x017c }
            long r12 = (long) r6     // Catch:{ all -> 0x017c }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0109
            r17 = 4
            goto L_0x010b
        L_0x0109:
            r17 = 0
        L_0x010b:
            if (r0 == 0) goto L_0x0111
            r0 = r17 | 1
            byte r0 = (byte) r0     // Catch:{ all -> 0x017c }
            goto L_0x0113
        L_0x0111:
            r0 = r17
        L_0x0113:
            r9.mo60792e(r15, r6, r4, r0)     // Catch:{ all -> 0x017c }
            si0.h r0 = r9.f62148b     // Catch:{ all -> 0x017c }
            si0.f r4 = r9.f62150d     // Catch:{ all -> 0x017c }
            r0.mo58998P(r4, r12)     // Catch:{ all -> 0x017c }
            if (r14 <= 0) goto L_0x0123
            long r10 = r10 - r12
            r9.mo60797j(r15, r10)     // Catch:{ all -> 0x017c }
        L_0x0123:
            monitor-exit(r9)     // Catch:{ all -> 0x0188 }
            monitor-exit(r7)     // Catch:{ all -> 0x0188 }
            if (r2 == 0) goto L_0x0140
            ni0.p r2 = r5.f62063v
            monitor-enter(r2)
            boolean r0 = r2.f62152f     // Catch:{ all -> 0x013d }
            if (r0 != 0) goto L_0x0135
            si0.h r0 = r2.f62148b     // Catch:{ all -> 0x013d }
            r0.flush()     // Catch:{ all -> 0x013d }
            monitor-exit(r2)
            goto L_0x0140
        L_0x0135:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013d }
            java.lang.String r3 = "closed"
            r0.<init>(r3)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0140:
            r1.f62110d = r3
            boolean r0 = r1.f62112f
            if (r0 != 0) goto L_0x0165
            ni0.o r0 = r1.f62110d
            ni0.o$c r0 = r0.f62132i
            hi0.s$a r2 = r1.f62107a
            li0.f r2 = (li0.C24319f) r2
            int r2 = r2.f61621h
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.mo61373g(r2, r4)
            ni0.o r0 = r1.f62110d
            ni0.o$c r0 = r0.f62133j
            hi0.s$a r2 = r1.f62107a
            li0.f r2 = (li0.C24319f) r2
            int r2 = r2.f61622i
            long r2 = (long) r2
            r0.mo61373g(r2, r4)
            return
        L_0x0165:
            ni0.o r0 = r1.f62110d
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL
            r0.mo60781e(r2)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0174:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0188 }
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x017f:
            okhttp3.internal.http2.ConnectionShutdownException r0 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0185 }
            r0.<init>()     // Catch:{ all -> 0x0185 }
            throw r0     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0185 }
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0188 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C24527m.mo60458d(hi0.x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r0.f62132i.mo60788l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hi0.C23529c0.C23530a mo60459e(boolean r11) throws java.io.IOException {
        /*
            r10 = this;
            ni0.o r0 = r10.f62110d
            monitor-enter(r0)
            ni0.o$c r1 = r0.f62132i     // Catch:{ all -> 0x00d5 }
            r1.mo61362h()     // Catch:{ all -> 0x00d5 }
        L_0x0008:
            java.util.ArrayDeque r1 = r0.f62128e     // Catch:{ all -> 0x00ce }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0018
            okhttp3.internal.http2.ErrorCode r1 = r0.f62134k     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0018
            r0.mo60785i()     // Catch:{ all -> 0x00ce }
            goto L_0x0008
        L_0x0018:
            ni0.o$c r1 = r0.f62132i     // Catch:{ all -> 0x00d5 }
            r1.mo60788l()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayDeque r1 = r0.f62128e     // Catch:{ all -> 0x00d5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x00c1
            java.util.ArrayDeque r1 = r0.f62128e     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00d5 }
            hi0.q r1 = (hi0.C23556q) r1     // Catch:{ all -> 0x00d5 }
            monitor-exit(r0)
            okhttp3.Protocol r0 = r10.f62111e
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            r3 = 0
            java.lang.String[] r4 = r1.f59531a
            int r4 = r4.length
            int r4 = r4 / 2
            r5 = 0
            r6 = r5
        L_0x003f:
            if (r3 >= r4) goto L_0x0081
            java.lang.String r7 = r1.mo58683d(r3)
            java.lang.String r8 = r1.mo58686g(r3)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0067
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTP/1.1 "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            li0.j r6 = li0.C24323j.m61070a(r6)
            goto L_0x007e
        L_0x0067:
            java.util.List<java.lang.String> r9 = f62106h
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x007e
            hi0.v$a r9 = ii0.C23607a.f59680a
            r9.getClass()
            r2.add(r7)
            java.lang.String r7 = r8.trim()
            r2.add(r7)
        L_0x007e:
            int r3 = r3 + 1
            goto L_0x003f
        L_0x0081:
            if (r6 == 0) goto L_0x00b9
            hi0.c0$a r1 = new hi0.c0$a
            r1.<init>()
            r1.f59425b = r0
            int r0 = r6.f61629b
            r1.f59426c = r0
            java.lang.String r0 = r6.f61630c
            r1.f59427d = r0
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            hi0.q$a r2 = new hi0.q$a
            r2.<init>()
            java.util.ArrayList r3 = r2.f59532a
            java.util.Collections.addAll(r3, r0)
            r1.f59429f = r2
            if (r11 == 0) goto L_0x00b8
            hi0.v$a r11 = ii0.C23607a.f59680a
            r11.getClass()
            int r11 = r1.f59426c
            r0 = 100
            if (r11 != r0) goto L_0x00b8
            return r5
        L_0x00b8:
            return r1
        L_0x00b9:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00c1:
            java.io.IOException r11 = r0.f62135l     // Catch:{ all -> 0x00d5 }
            if (r11 == 0) goto L_0x00c6
            goto L_0x00cd
        L_0x00c6:
            okhttp3.internal.http2.StreamResetException r11 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x00d5 }
            okhttp3.internal.http2.ErrorCode r1 = r0.f62134k     // Catch:{ all -> 0x00d5 }
            r11.<init>(r1)     // Catch:{ all -> 0x00d5 }
        L_0x00cd:
            throw r11     // Catch:{ all -> 0x00d5 }
        L_0x00ce:
            r11 = move-exception
            ni0.o$c r1 = r0.f62132i     // Catch:{ all -> 0x00d5 }
            r1.mo60788l()     // Catch:{ all -> 0x00d5 }
            throw r11     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C24527m.mo60459e(boolean):hi0.c0$a");
    }

    /* renamed from: f */
    public final C23799e mo60460f() {
        return this.f62108b;
    }

    /* renamed from: g */
    public final void mo60461g() throws IOException {
        this.f62109c.flush();
    }

    /* renamed from: h */
    public final C24893c0 mo60462h(C23529c0 c0Var) {
        return this.f62110d.f62130g;
    }
}
