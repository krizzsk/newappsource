package pi0;

import hi0.C23566v;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import ri0.C24829a;
import ri0.C24830b;
import ri0.C24831c;
import ri0.C24833e;
import si0.C24898f;

/* renamed from: pi0.f */
public class C24721f {

    /* renamed from: a */
    public static final C24721f f62584a;

    /* renamed from: b */
    public static final Logger f62585b = Logger.getLogger(C23566v.class.getName());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: pi0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: pi0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: pi0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: pi0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: pi0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: pi0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: pi0.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if (r0 != null) goto L_0x00af;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0144  */
    static {
        /*
            java.lang.String r0 = "java.vm.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "Dalvik"
            boolean r1 = r2.equals(r1)
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.String r6 = java.lang.System.getProperty(r0)
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x001e
            goto L_0x0032
        L_0x001e:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoClassDefFoundError -> 0x0023 }
            goto L_0x0024
        L_0x0021:
            goto L_0x0032
        L_0x0023:
            r6 = 0
        L_0x0024:
            r7 = 29
            if (r6 < r7) goto L_0x0032
            java.lang.Class r6 = java.lang.Class.forName(r1)     // Catch:{ ReflectiveOperationException -> 0x0021 }
            pi0.a r7 = new pi0.a     // Catch:{ ReflectiveOperationException -> 0x0021 }
            r7.<init>(r6)     // Catch:{ ReflectiveOperationException -> 0x0021 }
            goto L_0x0033
        L_0x0032:
            r7 = r3
        L_0x0033:
            if (r7 == 0) goto L_0x0037
            goto L_0x014a
        L_0x0037:
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0095
        L_0x0042:
            java.lang.Class r7 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0094 }
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r8 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0094 }
            java.lang.String r0 = "setUseSessionTickets"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x007f }
            r1[r4] = r2     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.String r0 = "setHostname"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r4] = r2     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.reflect.Method r10 = r8.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.String r0 = "getAlpnSelectedProtocol"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.reflect.Method r11 = r8.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.String r0 = "setAlpnProtocols"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.Class<byte[]> r2 = byte[].class
            r1[r4] = r2     // Catch:{ NoSuchMethodException -> 0x007f }
            java.lang.reflect.Method r12 = r8.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007f }
            pi0.b r3 = new pi0.b     // Catch:{ NoSuchMethodException -> 0x007f }
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ NoSuchMethodException -> 0x007f }
            goto L_0x0095
        L_0x007f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected Android API level 21+ but was "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0094:
        L_0x0095:
            if (r3 == 0) goto L_0x009a
        L_0x0097:
            r7 = r3
            goto L_0x014a
        L_0x009a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "No platform found on Android"
            r0.<init>(r1)
            throw r0
        L_0x00a2:
            java.lang.String r0 = "okhttp.platform"
            byte[] r1 = ii0.C23610d.f59684a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ AccessControlException -> 0x00ad }
            if (r0 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ad:
        L_0x00ae:
            r0 = r3
        L_0x00af:
            java.lang.String r1 = "conscrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b9
            r0 = 1
            goto L_0x00c9
        L_0x00b9:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r4]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r0 = r1.equals(r0)
        L_0x00c9:
            if (r0 == 0) goto L_0x00d4
            pi0.c r0 = pi0.C24717c.m62189o()
            if (r0 == 0) goto L_0x00d4
        L_0x00d1:
            r7 = r0
            goto L_0x014a
        L_0x00d4:
            java.lang.Class<javax.net.ssl.SSLParameters> r0 = javax.net.ssl.SSLParameters.class
            java.lang.String r1 = "setApplicationProtocols"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x00f3 }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r2[r4] = r6     // Catch:{ NoSuchMethodException -> 0x00f3 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x00f3 }
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00f3 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r6)     // Catch:{ NoSuchMethodException -> 0x00f3 }
            pi0.e r2 = new pi0.e     // Catch:{ NoSuchMethodException -> 0x00f3 }
            r2.<init>(r0, r1)     // Catch:{ NoSuchMethodException -> 0x00f3 }
            r7 = r2
            goto L_0x00f5
        L_0x00f3:
            r7 = r3
        L_0x00f5:
            if (r7 == 0) goto L_0x00f8
            goto L_0x014a
        L_0x00f8:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r0 = java.lang.Class.forName(r0, r5, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r1 = java.lang.Class.forName(r1, r5, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r2, r5, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r2, r5, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.String r2 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            r6[r5] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.reflect.Method r7 = r0.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.String r1 = "get"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r2[r4] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.reflect.Method r8 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.String r1 = "remove"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r2[r4] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            java.lang.reflect.Method r9 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            pi0.d r0 = new pi0.d     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x013f }
            r3 = r0
            goto L_0x0140
        L_0x013f:
        L_0x0140:
            if (r3 == 0) goto L_0x0144
            goto L_0x0097
        L_0x0144:
            pi0.f r0 = new pi0.f
            r0.<init>()
            goto L_0x00d1
        L_0x014a:
            f62584a = r7
            java.lang.Class<hi0.v> r0 = hi0.C23566v.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f62585b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.C24721f.<clinit>():void");
    }

    /* renamed from: b */
    public static ArrayList m62200b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static byte[] m62201e(List<Protocol> list) {
        C24898f fVar = new C24898f();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                fVar.mo61395V(protocol.toString().length());
                fVar.mo61404c0(protocol.toString());
            }
        }
        return fVar.mo61408f1();
    }

    /* renamed from: a */
    public void mo61211a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public C24831c mo61196c(X509TrustManager x509TrustManager) {
        return new C24829a(mo61197d(x509TrustManager));
    }

    /* renamed from: d */
    public C24833e mo61197d(X509TrustManager x509TrustManager) {
        return new C24830b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo61210f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo61194g(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
    }

    /* renamed from: h */
    public void mo61198h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: i */
    public SSLContext mo61199i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: j */
    public String mo61195j(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: k */
    public Object mo61200k() {
        if (f62585b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: l */
    public boolean mo61201l(String str) {
        return true;
    }

    /* renamed from: m */
    public void mo61202m(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f62585b.log(level, str, th);
    }

    /* renamed from: n */
    public void mo61203n(Object obj, String str) {
        if (obj == null) {
            str = C25541a.m63881k(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo61202m(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
