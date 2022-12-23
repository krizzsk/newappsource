package ki0;

import com.amazonaws.http.HttpHeader;
import com.facebook.appevents.C2349o;
import hi0.C23518a;
import hi0.C23521b0;
import hi0.C23529c0;
import hi0.C23539f0;
import hi0.C23550n;
import hi0.C23555p;
import hi0.C23558r;
import hi0.C23566v;
import hi0.C23571x;
import ii0.C23610d;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import li0.C24315c;
import li0.C24318e;
import li0.C24319f;
import mi0.C24388a;
import ni0.C24509c;
import ni0.C24510d;
import ni0.C24527m;
import ni0.C24531o;
import ni0.C24535p;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import pi0.C24721f;
import ri0.C24832d;
import si0.C24895d0;
import si0.C24911r;
import si0.C24917w;
import si0.C24918x;

/* renamed from: ki0.e */
public final class C23799e extends C24510d.C24515e {

    /* renamed from: b */
    public final C23800f f60116b;

    /* renamed from: c */
    public final C23539f0 f60117c;

    /* renamed from: d */
    public Socket f60118d;

    /* renamed from: e */
    public Socket f60119e;

    /* renamed from: f */
    public C23555p f60120f;

    /* renamed from: g */
    public Protocol f60121g;

    /* renamed from: h */
    public C24510d f60122h;

    /* renamed from: i */
    public C24918x f60123i;

    /* renamed from: j */
    public C24917w f60124j;

    /* renamed from: k */
    public boolean f60125k;

    /* renamed from: l */
    public int f60126l;

    /* renamed from: m */
    public int f60127m;

    /* renamed from: n */
    public int f60128n;

    /* renamed from: o */
    public int f60129o = 1;

    /* renamed from: p */
    public final ArrayList f60130p = new ArrayList();

    /* renamed from: q */
    public long f60131q = Long.MAX_VALUE;

    public C23799e(C23800f fVar, C23539f0 f0Var) {
        this.f60116b = fVar;
        this.f60117c = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59035a(ni0.C24510d r5) {
        /*
            r4 = this;
            ki0.f r0 = r4.f60116b
            monitor-enter(r0)
            monitor-enter(r5)     // Catch:{ all -> 0x001b }
            com.facebook.appevents.o r1 = r5.f62061t     // Catch:{ all -> 0x001d }
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r1.f8561a     // Catch:{ all -> 0x001d }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0016
            java.io.Serializable r1 = r1.f8562b     // Catch:{ all -> 0x001d }
            int[] r1 = (int[]) r1     // Catch:{ all -> 0x001d }
            r2 = 4
            r2 = r1[r2]     // Catch:{ all -> 0x001d }
        L_0x0016:
            monitor-exit(r5)     // Catch:{ all -> 0x001b }
            r4.f60129o = r2     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r5 = move-exception
            goto L_0x0020
        L_0x001d:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C23799e.mo59035a(ni0.d):void");
    }

    /* renamed from: b */
    public final void mo59036b(C24531o oVar) throws IOException {
        oVar.mo60779c(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0128, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0128, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0128, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59037c(int r8, int r9, int r10, int r11, boolean r12, hi0.C23550n r13) {
        /*
            r7 = this;
            okhttp3.Protocol r0 = r7.f60121g
            if (r0 != 0) goto L_0x013a
            hi0.f0 r0 = r7.f60117c
            hi0.a r0 = r0.f59461a
            java.util.List<hi0.i> r1 = r0.f59374f
            ki0.b r2 = new ki0.b
            r2.<init>(r1)
            javax.net.ssl.SSLSocketFactory r3 = r0.f59377i
            if (r3 != 0) goto L_0x004c
            hi0.i r0 = hi0.C23543i.f59491f
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003f
            hi0.f0 r0 = r7.f60117c
            hi0.a r0 = r0.f59461a
            hi0.r r0 = r0.f59369a
            java.lang.String r0 = r0.f59537d
            pi0.f r1 = pi0.C24721f.f62584a
            boolean r1 = r1.mo61201l(r0)
            if (r1 == 0) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            okhttp3.internal.connection.RouteException r8 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r9 = new java.net.UnknownServiceException
            java.lang.String r10 = "CLEARTEXT communication to "
            java.lang.String r11 = " not permitted by network security policy"
            java.lang.String r10 = p358af.C13437d.m33706k(r10, r0, r11)
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x003f:
            okhttp3.internal.connection.RouteException r8 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r9 = new java.net.UnknownServiceException
            java.lang.String r10 = "CLEARTEXT communication not enabled for client"
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x004c:
            java.util.List<okhttp3.Protocol> r0 = r0.f59373e
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x012d
        L_0x0056:
            r0 = 0
            r1 = r0
        L_0x0058:
            r3 = 1
            r4 = 0
            hi0.f0 r5 = r7.f60117c     // Catch:{ IOException -> 0x00d6 }
            hi0.a r6 = r5.f59461a     // Catch:{ IOException -> 0x00d6 }
            javax.net.ssl.SSLSocketFactory r6 = r6.f59377i     // Catch:{ IOException -> 0x00d6 }
            if (r6 == 0) goto L_0x006e
            java.net.Proxy r5 = r5.f59462b     // Catch:{ IOException -> 0x00d6 }
            java.net.Proxy$Type r5 = r5.type()     // Catch:{ IOException -> 0x00d6 }
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00d6 }
            if (r5 != r6) goto L_0x006e
            r5 = 1
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            if (r5 == 0) goto L_0x0079
            r7.mo59039e(r8, r9, r10, r13)     // Catch:{ IOException -> 0x00d6 }
            java.net.Socket r5 = r7.f60118d     // Catch:{ IOException -> 0x00d6 }
            if (r5 != 0) goto L_0x007c
            goto L_0x0086
        L_0x0079:
            r7.mo59038d(r8, r9, r13)     // Catch:{ IOException -> 0x00d6 }
        L_0x007c:
            r7.mo59040f(r2, r11, r13)     // Catch:{ IOException -> 0x00d6 }
            hi0.f0 r5 = r7.f60117c     // Catch:{ IOException -> 0x00d6 }
            java.net.InetSocketAddress r5 = r5.f59463c     // Catch:{ IOException -> 0x00d6 }
            r13.getClass()     // Catch:{ IOException -> 0x00d6 }
        L_0x0086:
            hi0.f0 r8 = r7.f60117c
            hi0.a r9 = r8.f59461a
            javax.net.ssl.SSLSocketFactory r9 = r9.f59377i
            if (r9 == 0) goto L_0x0099
            java.net.Proxy r8 = r8.f59462b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.HTTP
            if (r8 != r9) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            if (r3 == 0) goto L_0x00ae
            java.net.Socket r8 = r7.f60118d
            if (r8 == 0) goto L_0x00a1
            goto L_0x00ae
        L_0x00a1:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r9 = "Too many tunnel connections attempted: 21"
            r8.<init>(r9)
            okhttp3.internal.connection.RouteException r9 = new okhttp3.internal.connection.RouteException
            r9.<init>(r8)
            throw r9
        L_0x00ae:
            ni0.d r8 = r7.f60122h
            if (r8 == 0) goto L_0x00d5
            ki0.f r8 = r7.f60116b
            monitor-enter(r8)
            ni0.d r9 = r7.f60122h     // Catch:{ all -> 0x00d2 }
            monitor-enter(r9)     // Catch:{ all -> 0x00d2 }
            com.facebook.appevents.o r10 = r9.f62061t     // Catch:{ all -> 0x00cf }
            r11 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r10.f8561a     // Catch:{ all -> 0x00cf }
            r12 = r12 & 16
            if (r12 == 0) goto L_0x00ca
            java.io.Serializable r10 = r10.f8562b     // Catch:{ all -> 0x00cf }
            int[] r10 = (int[]) r10     // Catch:{ all -> 0x00cf }
            r11 = 4
            r11 = r10[r11]     // Catch:{ all -> 0x00cf }
        L_0x00ca:
            monitor-exit(r9)     // Catch:{ all -> 0x00d2 }
            r7.f60129o = r11     // Catch:{ all -> 0x00d2 }
            monitor-exit(r8)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d5
        L_0x00cf:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d2 }
            throw r10     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00d2 }
            throw r9
        L_0x00d5:
            return
        L_0x00d6:
            r5 = move-exception
            java.net.Socket r6 = r7.f60119e
            ii0.C23610d.m57797e(r6)
            java.net.Socket r6 = r7.f60118d
            ii0.C23610d.m57797e(r6)
            r7.f60119e = r0
            r7.f60118d = r0
            r7.f60123i = r0
            r7.f60124j = r0
            r7.f60120f = r0
            r7.f60121g = r0
            r7.f60122h = r0
            hi0.f0 r6 = r7.f60117c
            java.net.InetSocketAddress r6 = r6.f59463c
            r13.getClass()
            if (r1 != 0) goto L_0x00fe
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r5)
            goto L_0x0101
        L_0x00fe:
            r1.mo60861a(r5)
        L_0x0101:
            if (r12 == 0) goto L_0x012c
            r2.f60091d = r3
            boolean r3 = r2.f60090c
            if (r3 != 0) goto L_0x010a
            goto L_0x0128
        L_0x010a:
            boolean r3 = r5 instanceof java.net.ProtocolException
            if (r3 == 0) goto L_0x010f
            goto L_0x0128
        L_0x010f:
            boolean r3 = r5 instanceof java.io.InterruptedIOException
            if (r3 == 0) goto L_0x0114
            goto L_0x0128
        L_0x0114:
            boolean r3 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x0121
            java.lang.Throwable r3 = r5.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 == 0) goto L_0x0121
            goto L_0x0128
        L_0x0121:
            boolean r3 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            boolean r4 = r5 instanceof javax.net.ssl.SSLException
        L_0x0128:
            if (r4 == 0) goto L_0x012c
            goto L_0x0058
        L_0x012c:
            throw r1
        L_0x012d:
            okhttp3.internal.connection.RouteException r8 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r9 = new java.net.UnknownServiceException
            java.lang.String r10 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x013a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "already connected"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C23799e.mo59037c(int, int, int, int, boolean, hi0.n):void");
    }

    /* renamed from: d */
    public final void mo59038d(int i, int i2, C23550n nVar) throws IOException {
        Socket socket;
        C23539f0 f0Var = this.f60117c;
        Proxy proxy = f0Var.f59462b;
        C23518a aVar = f0Var.f59461a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = aVar.f59371c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f60118d = socket;
        InetSocketAddress inetSocketAddress = this.f60117c.f59463c;
        nVar.getClass();
        this.f60118d.setSoTimeout(i2);
        try {
            C24721f.f62584a.mo61198h(this.f60118d, this.f60117c.f59463c, i);
            try {
                this.f60123i = C24911r.m62547c(C24911r.m62551g(this.f60118d));
                this.f60124j = new C24917w(C24911r.m62549e(this.f60118d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder k = C13555b.m33972k("Failed to connect to ");
            k.append(this.f60117c.f59463c);
            ConnectException connectException = new ConnectException(k.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: e */
    public final void mo59039e(int i, int i2, int i3, C23550n nVar) throws IOException {
        C23571x.C23572a aVar = new C23571x.C23572a();
        aVar.mo58730d(this.f60117c.f59461a.f59369a);
        aVar.mo58728b("CONNECT", (C23521b0) null);
        aVar.f59644c.mo58695f(HttpHeader.HOST, C23610d.m57803k(this.f60117c.f59461a.f59369a, true));
        aVar.f59644c.mo58695f("Proxy-Connection", "Keep-Alive");
        aVar.f59644c.mo58695f(HttpHeader.USER_AGENT, "okhttp/3.14.9");
        C23571x a = aVar.mo58727a();
        C23529c0.C23530a aVar2 = new C23529c0.C23530a();
        aVar2.f59424a = a;
        aVar2.f59425b = Protocol.HTTP_1_1;
        aVar2.f59426c = 407;
        aVar2.f59427d = "Preemptive Authenticate";
        aVar2.f59430g = C23610d.f59687d;
        aVar2.f59434k = -1;
        aVar2.f59435l = -1;
        aVar2.f59429f.mo58695f("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.mo58645a();
        this.f60117c.f59461a.f59372d.getClass();
        C23558r rVar = a.f59636a;
        mo59038d(i, i2, nVar);
        String str = "CONNECT " + C23610d.m57803k(rVar, true) + " HTTP/1.1";
        C24918x xVar = this.f60123i;
        C24388a aVar3 = new C24388a((C23566v) null, (C23799e) null, xVar, this.f60124j);
        C24895d0 E = xVar.mo58974E();
        long j = (long) i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        E.mo61373g(j, timeUnit);
        this.f60124j.mo60537E().mo61373g((long) i3, timeUnit);
        aVar3.mo60535l(a.f59638c, str);
        aVar3.mo60454a();
        C23529c0.C23530a e = aVar3.mo60459e(false);
        e.f59424a = a;
        C23529c0 a2 = e.mo58645a();
        long a3 = C24318e.m61056a(a2);
        if (a3 != -1) {
            C24388a.C24392d j2 = aVar3.mo60533j(a3);
            C23610d.m57810r(j2, Integer.MAX_VALUE, timeUnit);
            j2.close();
        }
        int i4 = a2.f59412d;
        if (i4 != 200) {
            if (i4 == 407) {
                this.f60117c.f59461a.f59372d.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder k = C13555b.m33972k("Unexpected response code for CONNECT: ");
            k.append(a2.f59412d);
            throw new IOException(k.toString());
        } else if (!this.f60123i.f62987b.mo61415l1() || !this.f60124j.f62984b.mo61415l1()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0131 A[Catch:{ all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0137 A[Catch:{ all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59040f(ki0.C23794b r7, int r8, hi0.C23550n r9) throws java.io.IOException {
        /*
            r6 = this;
            hi0.f0 r0 = r6.f60117c
            hi0.a r0 = r0.f59461a
            javax.net.ssl.SSLSocketFactory r1 = r0.f59377i
            if (r1 != 0) goto L_0x0025
            java.util.List<okhttp3.Protocol> r7 = r0.f59373e
            okhttp3.Protocol r9 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto L_0x001c
            java.net.Socket r7 = r6.f60118d
            r6.f60119e = r7
            r6.f60121g = r9
            r6.mo59043i(r8)
            return
        L_0x001c:
            java.net.Socket r7 = r6.f60118d
            r6.f60119e = r7
            okhttp3.Protocol r7 = okhttp3.Protocol.HTTP_1_1
            r6.f60121g = r7
            return
        L_0x0025:
            r9.getClass()
            hi0.f0 r9 = r6.f60117c
            hi0.a r9 = r9.f59461a
            javax.net.ssl.SSLSocketFactory r0 = r9.f59377i
            r1 = 0
            java.net.Socket r2 = r6.f60118d     // Catch:{ AssertionError -> 0x012a }
            hi0.r r3 = r9.f59369a     // Catch:{ AssertionError -> 0x012a }
            java.lang.String r4 = r3.f59537d     // Catch:{ AssertionError -> 0x012a }
            int r3 = r3.f59538e     // Catch:{ AssertionError -> 0x012a }
            r5 = 1
            java.net.Socket r0 = r0.createSocket(r2, r4, r3, r5)     // Catch:{ AssertionError -> 0x012a }
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch:{ AssertionError -> 0x012a }
            hi0.i r7 = r7.mo59024a(r0)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            boolean r2 = r7.f59493b     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            if (r2 == 0) goto L_0x0051
            pi0.f r2 = pi0.C24721f.f62584a     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            hi0.r r3 = r9.f59369a     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r3 = r3.f59537d     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.util.List<okhttp3.Protocol> r4 = r9.f59373e     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.mo61194g(r0, r3, r4)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
        L_0x0051:
            r0.startHandshake()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            javax.net.ssl.SSLSession r2 = r0.getSession()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            hi0.p r3 = hi0.C23555p.m57705a(r2)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            javax.net.ssl.HostnameVerifier r4 = r9.f59378j     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            hi0.r r5 = r9.f59369a     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r5 = r5.f59537d     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            boolean r2 = r4.verify(r5, r2)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            if (r2 != 0) goto L_0x00db
            java.util.List<java.security.cert.Certificate> r7 = r3.f59529c     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            boolean r8 = r7.isEmpty()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r1 = "Hostname "
            if (r8 != 0) goto L_0x00bd
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.<init>()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.append(r1)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            hi0.r r9 = r9.f59369a     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = r9.f59537d     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = " not verified:\n    certificate: "
            r2.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = hi0.C23540g.m57684b(r7)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = "\n    DN: "
            r2.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.security.Principal r9 = r7.getSubjectDN()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = r9.getName()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = "\n    subjectAltNames: "
            r2.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.util.ArrayList r7 = ri0.C24832d.m62363a(r7)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.append(r7)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r7 = r2.toString()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r8.<init>(r7)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            throw r8     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
        L_0x00ba:
            r7 = move-exception
            goto L_0x0139
        L_0x00bd:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r8.<init>()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r8.append(r1)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            hi0.r r9 = r9.f59369a     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = r9.f59537d     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r8.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = " not verified (no certificates)"
            r8.append(r9)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r8 = r8.toString()     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r7.<init>(r8)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            throw r7     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
        L_0x00db:
            hi0.g r2 = r9.f59379k     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            hi0.r r9 = r9.f59369a     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r9 = r9.f59537d     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.util.List<java.security.cert.Certificate> r4 = r3.f59529c     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r2.mo58655a(r9, r4)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            boolean r7 = r7.f59493b     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            if (r7 == 0) goto L_0x00f0
            pi0.f r7 = pi0.C24721f.f62584a     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.lang.String r1 = r7.mo61195j(r0)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
        L_0x00f0:
            r6.f60119e = r0     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            si0.d r7 = si0.C24911r.m62551g(r0)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            si0.x r7 = si0.C24911r.m62547c(r7)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r6.f60123i = r7     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            java.net.Socket r7 = r6.f60119e     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            si0.c r7 = si0.C24911r.m62549e(r7)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            si0.w r9 = new si0.w     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r9.<init>(r7)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r6.f60124j = r9     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            r6.f60120f = r3     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            if (r1 == 0) goto L_0x0112
            okhttp3.Protocol r7 = okhttp3.Protocol.get(r1)     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            goto L_0x0114
        L_0x0112:
            okhttp3.Protocol r7 = okhttp3.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
        L_0x0114:
            r6.f60121g = r7     // Catch:{ AssertionError -> 0x0125, all -> 0x00ba }
            pi0.f r7 = pi0.C24721f.f62584a
            r7.mo61211a(r0)
            okhttp3.Protocol r7 = r6.f60121g
            okhttp3.Protocol r9 = okhttp3.Protocol.HTTP_2
            if (r7 != r9) goto L_0x0124
            r6.mo59043i(r8)
        L_0x0124:
            return
        L_0x0125:
            r7 = move-exception
            r1 = r0
            goto L_0x012b
        L_0x0128:
            r7 = move-exception
            goto L_0x0138
        L_0x012a:
            r7 = move-exception
        L_0x012b:
            boolean r8 = ii0.C23610d.m57807o(r7)     // Catch:{ all -> 0x0128 }
            if (r8 == 0) goto L_0x0137
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0128 }
            r8.<init>(r7)     // Catch:{ all -> 0x0128 }
            throw r8     // Catch:{ all -> 0x0128 }
        L_0x0137:
            throw r7     // Catch:{ all -> 0x0128 }
        L_0x0138:
            r0 = r1
        L_0x0139:
            if (r0 == 0) goto L_0x0140
            pi0.f r8 = pi0.C24721f.f62584a
            r8.mo61211a(r0)
        L_0x0140:
            ii0.C23610d.m57797e(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C23799e.mo59040f(ki0.b, int, hi0.n):void");
    }

    /* renamed from: g */
    public final C24315c mo59041g(C23566v vVar, C24319f fVar) throws SocketException {
        if (this.f60122h != null) {
            return new C24527m(vVar, this, fVar, this.f60122h);
        }
        this.f60119e.setSoTimeout(fVar.f61621h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f60123i.mo58974E().mo61373g((long) fVar.f61621h, timeUnit);
        this.f60124j.mo60537E().mo61373g((long) fVar.f61622i, timeUnit);
        return new C24388a(vVar, this, this.f60123i, this.f60124j);
    }

    /* renamed from: h */
    public final void mo59042h() {
        synchronized (this.f60116b) {
            this.f60125k = true;
        }
    }

    /* renamed from: i */
    public final void mo59043i(int i) throws IOException {
        boolean z;
        int i2;
        this.f60119e.setSoTimeout(0);
        C24510d.C24513c cVar = new C24510d.C24513c();
        Socket socket = this.f60119e;
        String str = this.f60117c.f59461a.f59369a.f59537d;
        C24918x xVar = this.f60123i;
        C24917w wVar = this.f60124j;
        cVar.f62072a = socket;
        cVar.f62073b = str;
        cVar.f62074c = xVar;
        cVar.f62075d = wVar;
        cVar.f62076e = this;
        cVar.f62077f = i;
        C24510d dVar = new C24510d(cVar);
        this.f60122h = dVar;
        C24535p pVar = dVar.f62063v;
        synchronized (pVar) {
            if (pVar.f62152f) {
                throw new IOException("closed");
            } else if (pVar.f62149c) {
                Logger logger = C24535p.f62147h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C23610d.m57802j(">> CONNECTION %s", C24509c.f62038a.mo60874l()));
                }
                pVar.f62148b.write(C24509c.f62038a.mo60880s());
                pVar.f62148b.flush();
            }
        }
        C24535p pVar2 = dVar.f62063v;
        C2349o oVar = dVar.f62060s;
        synchronized (pVar2) {
            if (!pVar2.f62152f) {
                pVar2.mo60792e(0, Integer.bitCount(oVar.f8561a) * 6, (byte) 4, (byte) 0);
                for (int i3 = 0; i3 < 10; i3++) {
                    if (((1 << i3) & oVar.f8561a) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (i3 == 4) {
                            i2 = 3;
                        } else if (i3 == 7) {
                            i2 = 4;
                        } else {
                            i2 = i3;
                        }
                        pVar2.f62148b.writeShort(i2);
                        pVar2.f62148b.writeInt(((int[]) oVar.f8562b)[i3]);
                    }
                }
                pVar2.f62148b.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = dVar.f62060s.mo12501a();
        if (a != 65535) {
            dVar.f62063v.mo60796i(0, (long) (a - 65535));
        }
        new Thread(dVar.f62064w).start();
    }

    /* renamed from: j */
    public final boolean mo59044j(C23558r rVar) {
        int i = rVar.f59538e;
        C23558r rVar2 = this.f60117c.f59461a.f59369a;
        if (i != rVar2.f59538e) {
            return false;
        }
        if (rVar.f59537d.equals(rVar2.f59537d)) {
            return true;
        }
        C23555p pVar = this.f60120f;
        if (pVar == null || !C24832d.m62365c(rVar.f59537d, (X509Certificate) pVar.f59529c.get(0))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Object obj;
        StringBuilder k = C13555b.m33972k("Connection{");
        k.append(this.f60117c.f59461a.f59369a.f59537d);
        k.append(":");
        k.append(this.f60117c.f59461a.f59369a.f59538e);
        k.append(", proxy=");
        k.append(this.f60117c.f59462b);
        k.append(" hostAddress=");
        k.append(this.f60117c.f59463c);
        k.append(" cipherSuite=");
        C23555p pVar = this.f60120f;
        if (pVar != null) {
            obj = pVar.f59528b;
        } else {
            obj = "none";
        }
        k.append(obj);
        k.append(" protocol=");
        k.append(this.f60121g);
        k.append('}');
        return k.toString();
    }
}
