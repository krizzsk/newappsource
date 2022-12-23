package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22740ym;
import com.veriff.sdk.internal.C22752ys;
import com.veriff.sdk.internal.C22757yu;
import com.veriff.sdk.internal.aaj;
import hd0.C23451k;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p009a8.C0112l;

/* renamed from: com.veriff.sdk.internal.zm */
public final class C22788zm extends aaj.C21297c implements C22721ya {

    /* renamed from: g */
    public static final /* synthetic */ boolean f57795g = true;

    /* renamed from: a */
    public final C22789zn f57796a;

    /* renamed from: b */
    public boolean f57797b;

    /* renamed from: c */
    public int f57798c;

    /* renamed from: d */
    public int f57799d;

    /* renamed from: e */
    public final List<Reference<C22794zr>> f57800e = new ArrayList();

    /* renamed from: f */
    public long f57801f = Long.MAX_VALUE;

    /* renamed from: i */
    private final C22761yw f57802i;

    /* renamed from: j */
    private Socket f57803j;

    /* renamed from: k */
    private Socket f57804k;

    /* renamed from: l */
    private C22735yj f57805l;

    /* renamed from: m */
    private C22749yq f57806m;

    /* renamed from: n */
    private aaj f57807n;

    /* renamed from: o */
    private abk f57808o;

    /* renamed from: p */
    private abj f57809p;

    /* renamed from: q */
    private int f57810q;

    /* renamed from: r */
    private int f57811r = 1;

    public C22788zm(C22789zn znVar, C22761yw ywVar) {
        this.f57796a = znVar;
        this.f57802i = ywVar;
    }

    /* renamed from: a */
    private C22752ys m55943a(int i, int i2, C22752ys ysVar, C22738yl ylVar) throws IOException {
        StringBuilder k = C13555b.m33972k("CONNECT ");
        k.append(C22766za.m55821a(ylVar, true));
        k.append(" HTTP/1.1");
        String sb = k.toString();
        while (true) {
            aad aad = new aad((C22746yp) null, (C22788zm) null, this.f57808o, this.f57809p);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57808o.mo53672a().mo53957a((long) i, timeUnit);
            this.f57809p.mo53674a().mo53957a((long) i2, timeUnit);
            aad.mo53664a(ysVar.mo57395c(), sb);
            aad.mo53668c();
            C22757yu a = aad.mo53662a(false).mo57438a(ysVar).mo57443a();
            aad.mo53669c(a);
            int c = a.mo57418c();
            if (c != 200) {
                if (c == 407) {
                    C22703xt d = this.f57802i.mo57449a().mo57141d();
                    C22761yw ywVar = this.f57802i;
                    ((C0112l) d).getClass();
                    C22752ys a2 = C23451k.m57551a(ywVar, a);
                    if (a2 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(a.mo57415a("Connection"))) {
                        return a2;
                    } else {
                        ysVar = a2;
                    }
                } else {
                    StringBuilder k2 = C13555b.m33972k("Unexpected response code for CONNECT: ");
                    k2.append(a.mo57418c());
                    throw new IOException(k2.toString());
                }
            } else if (this.f57808o.mo53880d().mo53890f() && this.f57809p.mo53875c().mo53890f()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: g */
    private C22752ys m55950g() throws IOException {
        C22752ys a = new C22752ys.C22753a().mo57403a(this.f57802i.mo57449a().mo57137a()).mo57407a("CONNECT", (C22754yt) null).mo57408a(HttpHeader.HOST, C22766za.m55821a(this.f57802i.mo57449a().mo57137a(), true)).mo57408a("Proxy-Connection", "Keep-Alive").mo57408a(HttpHeader.USER_AGENT, C22767zb.m55853a()).mo57409a();
        C22757yu a2 = new C22757yu.C22758a().mo57438a(a).mo57437a(C22749yq.HTTP_1_1).mo57433a(407).mo57441a("Preemptive Authenticate").mo57440a(C22766za.f57697d).mo57434a(-1).mo57445b(-1).mo57442a("Proxy-Authenticate", "OkHttp-Preemptive").mo57443a();
        C22703xt d = this.f57802i.mo57449a().mo57141d();
        C22761yw ywVar = this.f57802i;
        ((C0112l) d).getClass();
        C22752ys a3 = C23451k.m57551a(ywVar, a2);
        if (a3 != null) {
            return a3;
        }
        return a;
    }

    /* renamed from: b */
    public C22761yw mo57518b() {
        return this.f57802i;
    }

    /* renamed from: c */
    public void mo57519c() {
        C22766za.m55836a(this.f57803j);
    }

    /* renamed from: d */
    public Socket mo57520d() {
        return this.f57804k;
    }

    /* renamed from: e */
    public C22735yj mo57521e() {
        return this.f57805l;
    }

    /* renamed from: f */
    public boolean mo57522f() {
        return this.f57807n != null;
    }

    public String toString() {
        Object obj;
        StringBuilder k = C13555b.m33972k("Connection{");
        k.append(this.f57802i.mo57449a().mo57137a().mo57292f());
        k.append(":");
        k.append(this.f57802i.mo57449a().mo57137a().mo57293g());
        k.append(", proxy=");
        k.append(this.f57802i.mo57450b());
        k.append(" hostAddress=");
        k.append(this.f57802i.mo57451c());
        k.append(" cipherSuite=");
        C22735yj yjVar = this.f57805l;
        if (yjVar != null) {
            obj = yjVar.mo57259b();
        } else {
            obj = "none";
        }
        k.append(obj);
        k.append(" protocol=");
        k.append(this.f57806m);
        k.append('}');
        return k.toString();
    }

    /* renamed from: a */
    public void mo57512a() {
        if (f57795g || !Thread.holdsLock(this.f57796a)) {
            synchronized (this.f57796a) {
                this.f57797b = true;
            }
            return;
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[Catch:{ IOException -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0128  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57513a(int r17, int r18, int r19, int r20, boolean r21, com.veriff.sdk.internal.C22713xw r22, com.veriff.sdk.internal.C22730yh r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            com.veriff.sdk.internal.yq r0 = r7.f57806m
            if (r0 != 0) goto L_0x0143
            com.veriff.sdk.internal.yw r0 = r7.f57802i
            com.veriff.sdk.internal.xs r0 = r0.mo57449a()
            java.util.List r0 = r0.mo57144f()
            com.veriff.sdk.internal.zj r10 = new com.veriff.sdk.internal.zj
            r10.<init>(r0)
            com.veriff.sdk.internal.yw r1 = r7.f57802i
            com.veriff.sdk.internal.xs r1 = r1.mo57449a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo57148i()
            if (r1 != 0) goto L_0x0066
            com.veriff.sdk.internal.yc r1 = com.veriff.sdk.internal.C22723yc.f57478d
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0059
            com.veriff.sdk.internal.yw r0 = r7.f57802i
            com.veriff.sdk.internal.xs r0 = r0.mo57449a()
            com.veriff.sdk.internal.yl r0 = r0.mo57137a()
            java.lang.String r0 = r0.mo57292f()
            com.veriff.sdk.internal.aay r1 = com.veriff.sdk.internal.aay.m50281e()
            boolean r1 = r1.mo53804b((java.lang.String) r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0078
        L_0x0046:
            com.veriff.sdk.internal.zp r1 = new com.veriff.sdk.internal.zp
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = p358af.C13437d.m33706k(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0059:
            com.veriff.sdk.internal.zp r0 = new com.veriff.sdk.internal.zp
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0066:
            com.veriff.sdk.internal.yw r0 = r7.f57802i
            com.veriff.sdk.internal.xs r0 = r0.mo57449a()
            java.util.List r0 = r0.mo57142e()
            com.veriff.sdk.internal.yq r1 = com.veriff.sdk.internal.C22749yq.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0136
        L_0x0078:
            r11 = 0
            r12 = r11
        L_0x007a:
            com.veriff.sdk.internal.yw r0 = r7.f57802i     // Catch:{ IOException -> 0x00ed }
            boolean r0 = r0.mo57452d()     // Catch:{ IOException -> 0x00ed }
            if (r0 == 0) goto L_0x009b
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m55945a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00ed }
            java.net.Socket r0 = r7.f57803j     // Catch:{ IOException -> 0x00ed }
            if (r0 != 0) goto L_0x0096
            goto L_0x00b8
        L_0x0096:
            r13 = r17
            r14 = r18
            goto L_0x00a2
        L_0x009b:
            r13 = r17
            r14 = r18
            r7.m55946a((int) r13, (int) r14, (com.veriff.sdk.internal.C22713xw) r8, (com.veriff.sdk.internal.C22730yh) r9)     // Catch:{ IOException -> 0x00e9 }
        L_0x00a2:
            r15 = r20
            r7.m55948a((com.veriff.sdk.internal.C22783zj) r10, (int) r15, (com.veriff.sdk.internal.C22713xw) r8, (com.veriff.sdk.internal.C22730yh) r9)     // Catch:{ IOException -> 0x00e7 }
            com.veriff.sdk.internal.yw r0 = r7.f57802i     // Catch:{ IOException -> 0x00e7 }
            java.net.InetSocketAddress r0 = r0.mo57451c()     // Catch:{ IOException -> 0x00e7 }
            com.veriff.sdk.internal.yw r1 = r7.f57802i     // Catch:{ IOException -> 0x00e7 }
            java.net.Proxy r1 = r1.mo57450b()     // Catch:{ IOException -> 0x00e7 }
            com.veriff.sdk.internal.yq r2 = r7.f57806m     // Catch:{ IOException -> 0x00e7 }
            r9.mo57243a(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00e7 }
        L_0x00b8:
            com.veriff.sdk.internal.yw r0 = r7.f57802i
            boolean r0 = r0.mo57452d()
            if (r0 == 0) goto L_0x00d2
            java.net.Socket r0 = r7.f57803j
            if (r0 == 0) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            com.veriff.sdk.internal.zp r1 = new com.veriff.sdk.internal.zp
            r1.<init>(r0)
            throw r1
        L_0x00d2:
            com.veriff.sdk.internal.aaj r0 = r7.f57807n
            if (r0 == 0) goto L_0x00e6
            com.veriff.sdk.internal.zn r1 = r7.f57796a
            monitor-enter(r1)
            com.veriff.sdk.internal.aaj r0 = r7.f57807n     // Catch:{ all -> 0x00e3 }
            int r0 = r0.mo53690a()     // Catch:{ all -> 0x00e3 }
            r7.f57811r = r0     // Catch:{ all -> 0x00e3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e3 }
            goto L_0x00e6
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e3 }
            throw r0
        L_0x00e6:
            return
        L_0x00e7:
            r0 = move-exception
            goto L_0x00f3
        L_0x00e9:
            r0 = move-exception
        L_0x00ea:
            r15 = r20
            goto L_0x00f3
        L_0x00ed:
            r0 = move-exception
            r13 = r17
            r14 = r18
            goto L_0x00ea
        L_0x00f3:
            java.net.Socket r1 = r7.f57804k
            com.veriff.sdk.internal.C22766za.m55836a((java.net.Socket) r1)
            java.net.Socket r1 = r7.f57803j
            com.veriff.sdk.internal.C22766za.m55836a((java.net.Socket) r1)
            r7.f57804k = r11
            r7.f57803j = r11
            r7.f57808o = r11
            r7.f57809p = r11
            r7.f57805l = r11
            r7.f57806m = r11
            r7.f57807n = r11
            com.veriff.sdk.internal.yw r1 = r7.f57802i
            java.net.InetSocketAddress r3 = r1.mo57451c()
            com.veriff.sdk.internal.yw r1 = r7.f57802i
            java.net.Proxy r4 = r1.mo57450b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo57244a(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0128
            com.veriff.sdk.internal.zp r12 = new com.veriff.sdk.internal.zp
            r12.<init>(r0)
            goto L_0x012b
        L_0x0128:
            r12.mo57533a(r0)
        L_0x012b:
            if (r21 == 0) goto L_0x0135
            boolean r0 = r10.mo57488a((java.io.IOException) r0)
            if (r0 == 0) goto L_0x0135
            goto L_0x007a
        L_0x0135:
            throw r12
        L_0x0136:
            com.veriff.sdk.internal.zp r0 = new com.veriff.sdk.internal.zp
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22788zm.mo57513a(int, int, int, int, boolean, com.veriff.sdk.internal.xw, com.veriff.sdk.internal.yh):void");
    }

    /* renamed from: a */
    private void m55945a(int i, int i2, int i3, C22713xw xwVar, C22730yh yhVar) throws IOException {
        C22752ys g = m55950g();
        C22738yl a = g.mo57390a();
        int i4 = 0;
        while (i4 < 21) {
            m55946a(i, i2, xwVar, yhVar);
            g = m55943a(i2, i3, g, a);
            if (g != null) {
                C22766za.m55836a(this.f57803j);
                this.f57803j = null;
                this.f57809p = null;
                this.f57808o = null;
                yhVar.mo57243a(xwVar, this.f57802i.mo57451c(), this.f57802i.mo57450b(), (C22749yq) null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m55946a(int i, int i2, C22713xw xwVar, C22730yh yhVar) throws IOException {
        Socket socket;
        Proxy b = this.f57802i.mo57450b();
        C22702xs a = this.f57802i.mo57449a();
        if (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) {
            socket = a.mo57140c().createSocket();
        } else {
            socket = new Socket(b);
        }
        this.f57803j = socket;
        yhVar.mo57242a(xwVar, this.f57802i.mo57451c(), b);
        this.f57803j.setSoTimeout(i2);
        try {
            aay.m50281e().mo53802a(this.f57803j, this.f57802i.mo57451c(), i);
            try {
                this.f57808o = abr.m50508a(abr.m50518b(this.f57803j));
                this.f57809p = abr.m50507a(abr.m50512a(this.f57803j));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder k = C13555b.m33972k("Failed to connect to ");
            k.append(this.f57802i.mo57451c());
            ConnectException connectException = new ConnectException(k.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: a */
    private void m55948a(C22783zj zjVar, int i, C22713xw xwVar, C22730yh yhVar) throws IOException {
        if (this.f57802i.mo57449a().mo57148i() == null) {
            List<C22749yq> e = this.f57802i.mo57449a().mo57142e();
            C22749yq yqVar = C22749yq.H2_PRIOR_KNOWLEDGE;
            if (e.contains(yqVar)) {
                this.f57804k = this.f57803j;
                this.f57806m = yqVar;
                m55944a(i);
                return;
            }
            this.f57804k = this.f57803j;
            this.f57806m = C22749yq.HTTP_1_1;
            return;
        }
        yhVar.mo57245b(xwVar);
        m55947a(zjVar);
        yhVar.mo57236a(xwVar, this.f57805l);
        if (this.f57806m == C22749yq.HTTP_2) {
            m55944a(i);
        }
    }

    /* renamed from: a */
    private void m55944a(int i) throws IOException {
        this.f57804k.setSoTimeout(0);
        aaj a = new aaj.C21295a(true).mo53717a(this.f57804k, this.f57802i.mo57449a().mo57137a().mo57292f(), this.f57808o, this.f57809p).mo53716a((aaj.C21297c) this).mo53715a(i).mo53718a();
        this.f57807n = a;
        a.mo53709c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m55947a(com.veriff.sdk.internal.C22783zj r8) throws java.io.IOException {
        /*
            r7 = this;
            com.veriff.sdk.internal.yw r0 = r7.f57802i
            com.veriff.sdk.internal.xs r0 = r0.mo57449a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo57148i()
            r2 = 0
            java.net.Socket r3 = r7.f57803j     // Catch:{ AssertionError -> 0x012e }
            com.veriff.sdk.internal.yl r4 = r0.mo57137a()     // Catch:{ AssertionError -> 0x012e }
            java.lang.String r4 = r4.mo57292f()     // Catch:{ AssertionError -> 0x012e }
            com.veriff.sdk.internal.yl r5 = r0.mo57137a()     // Catch:{ AssertionError -> 0x012e }
            int r5 = r5.mo57293g()     // Catch:{ AssertionError -> 0x012e }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x012e }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x012e }
            com.veriff.sdk.internal.yc r8 = r8.mo57487a((javax.net.ssl.SSLSocket) r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r8.mo57209d()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 == 0) goto L_0x0041
            com.veriff.sdk.internal.aay r3 = com.veriff.sdk.internal.aay.m50281e()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.yl r4 = r0.mo57137a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r4 = r4.mo57292f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r0.mo57142e()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.mo53797a((javax.net.ssl.SSLSocket) r1, (java.lang.String) r4, (java.util.List<com.veriff.sdk.internal.C22749yq>) r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.yj r4 = com.veriff.sdk.internal.C22735yj.m55546a((javax.net.ssl.SSLSession) r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo57149j()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.yl r6 = r0.mo57137a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r6 = r6.mo57292f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.mo57260c()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.yl r0 = r0.mo57137a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo57292f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = com.veriff.sdk.internal.C22716xy.m55460a((java.security.cert.Certificate) r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r8 = com.veriff.sdk.internal.abe.m50313a(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r2     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.yl r0 = r0.mo57137a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo57292f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00d8:
            com.veriff.sdk.internal.xy r3 = r0.mo57150k()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.yl r0 = r0.mo57137a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo57292f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r4.mo57260c()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.mo57194a(r0, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r8 = r8.mo57209d()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r8 == 0) goto L_0x00f9
            com.veriff.sdk.internal.aay r8 = com.veriff.sdk.internal.aay.m50281e()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r2 = r8.mo53796a((javax.net.ssl.SSLSocket) r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00f9:
            r7.f57804k = r1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.aca r8 = com.veriff.sdk.internal.abr.m50518b((java.net.Socket) r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.abk r8 = com.veriff.sdk.internal.abr.m50508a((com.veriff.sdk.internal.aca) r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f57808o = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.net.Socket r8 = r7.f57804k     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.abz r8 = com.veriff.sdk.internal.abr.m50512a((java.net.Socket) r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.abj r8 = com.veriff.sdk.internal.abr.m50507a((com.veriff.sdk.internal.abz) r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f57809p = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f57805l = r4     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r2 == 0) goto L_0x011a
            com.veriff.sdk.internal.yq r8 = com.veriff.sdk.internal.C22749yq.m55695a(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            goto L_0x011c
        L_0x011a:
            com.veriff.sdk.internal.yq r8 = com.veriff.sdk.internal.C22749yq.HTTP_1_1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x011c:
            r7.f57806m = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            com.veriff.sdk.internal.aay r8 = com.veriff.sdk.internal.aay.m50281e()
            r8.mo53815b((javax.net.ssl.SSLSocket) r1)
            return
        L_0x0126:
            r8 = move-exception
            r2 = r1
            goto L_0x013c
        L_0x0129:
            r8 = move-exception
            r2 = r1
            goto L_0x012f
        L_0x012c:
            r8 = move-exception
            goto L_0x013c
        L_0x012e:
            r8 = move-exception
        L_0x012f:
            boolean r0 = com.veriff.sdk.internal.C22766za.m55839a((java.lang.AssertionError) r8)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x013b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012c }
            r0.<init>(r8)     // Catch:{ all -> 0x012c }
            throw r0     // Catch:{ all -> 0x012c }
        L_0x013b:
            throw r8     // Catch:{ all -> 0x012c }
        L_0x013c:
            if (r2 == 0) goto L_0x0145
            com.veriff.sdk.internal.aay r0 = com.veriff.sdk.internal.aay.m50281e()
            r0.mo53815b((javax.net.ssl.SSLSocket) r2)
        L_0x0145:
            com.veriff.sdk.internal.C22766za.m55836a((java.net.Socket) r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22788zm.m55947a(com.veriff.sdk.internal.zj):void");
    }

    /* renamed from: a */
    public boolean mo57515a(C22702xs xsVar, List<C22761yw> list) {
        if (this.f57800e.size() >= this.f57811r || this.f57797b || !C22763yy.f57691a.mo57374a(this.f57802i.mo57449a(), xsVar)) {
            return false;
        }
        if (xsVar.mo57137a().mo57292f().equals(mo57518b().mo57449a().mo57137a().mo57292f())) {
            return true;
        }
        if (this.f57807n == null || list == null || !m55949a(list) || xsVar.mo57149j() != abe.f53542a || !mo57516a(xsVar.mo57137a())) {
            return false;
        }
        try {
            xsVar.mo57150k().mo57194a(xsVar.mo57137a().mo57292f(), mo57521e().mo57260c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m55949a(List<C22761yw> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C22761yw ywVar = list.get(i);
            if (ywVar.mo57450b().type() == Proxy.Type.DIRECT && this.f57802i.mo57450b().type() == Proxy.Type.DIRECT && this.f57802i.mo57451c().equals(ywVar.mo57451c())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo57516a(C22738yl ylVar) {
        if (ylVar.mo57293g() != this.f57802i.mo57449a().mo57137a().mo57293g()) {
            return false;
        }
        if (ylVar.mo57292f().equals(this.f57802i.mo57449a().mo57137a().mo57292f())) {
            return true;
        }
        if (this.f57805l == null || !abe.f53542a.mo53832a(ylVar.mo57292f(), (X509Certificate) this.f57805l.mo57260c().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C22799zu mo57511a(C22746yp ypVar, C22740ym.C22741a aVar) throws SocketException {
        if (this.f57807n != null) {
            return new aak(ypVar, this, aVar, this.f57807n);
        }
        this.f57804k.setSoTimeout(aVar.mo57326c());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f57808o.mo53672a().mo53957a((long) aVar.mo57326c(), timeUnit);
        this.f57809p.mo53674a().mo53957a((long) aVar.mo57328d(), timeUnit);
        return new aad(ypVar, this, this.f57808o, this.f57809p);
    }

    /* renamed from: a */
    public boolean mo57517a(boolean z) {
        int soTimeout;
        if (this.f57804k.isClosed() || this.f57804k.isInputShutdown() || this.f57804k.isOutputShutdown()) {
            return false;
        }
        aaj aaj = this.f57807n;
        if (aaj != null) {
            return aaj.mo53708b(System.nanoTime());
        }
        if (z) {
            try {
                soTimeout = this.f57804k.getSoTimeout();
                this.f57804k.setSoTimeout(1);
                if (this.f57808o.mo53890f()) {
                    this.f57804k.setSoTimeout(soTimeout);
                    return false;
                }
                this.f57804k.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f57804k.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo53720a(aam aam) throws IOException {
        aam.mo53738a(aaf.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: a */
    public void mo53719a(aaj aaj) {
        synchronized (this.f57796a) {
            this.f57811r = aaj.mo53690a();
        }
    }

    /* renamed from: a */
    public void mo57514a(IOException iOException) {
        if (f57795g || !Thread.holdsLock(this.f57796a)) {
            synchronized (this.f57796a) {
                if (iOException instanceof aar) {
                    aaf aaf = ((aar) iOException).f53500a;
                    if (aaf == aaf.REFUSED_STREAM) {
                        int i = this.f57810q + 1;
                        this.f57810q = i;
                        if (i > 1) {
                            this.f57797b = true;
                            this.f57798c++;
                        }
                    } else if (aaf != aaf.CANCEL) {
                        this.f57797b = true;
                        this.f57798c++;
                    }
                } else if (!mo57522f() || (iOException instanceof aae)) {
                    this.f57797b = true;
                    if (this.f57799d == 0) {
                        if (iOException != null) {
                            this.f57796a.mo57525a(this.f57802i, iOException);
                        }
                        this.f57798c++;
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }
}
