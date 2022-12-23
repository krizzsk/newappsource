package com.veriff.sdk.internal;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class aay {

    /* renamed from: a */
    private static final aay f53525a = m50276a();

    /* renamed from: b */
    private static final Logger f53526b = Logger.getLogger(C22746yp.class.getName());

    /* renamed from: b */
    private static aay m50278b() {
        aav a;
        if (m50282g() && (a = aav.m50263a()) != null) {
            return a;
        }
        aax a2 = aax.m50273a();
        if (a2 != null) {
            return a2;
        }
        aay a3 = aaw.m50269a();
        if (a3 != null) {
            return a3;
        }
        return new aay();
    }

    /* renamed from: d */
    private static aay m50280d() {
        aay a = aat.m50240a();
        if (a != null) {
            return a;
        }
        aay b = aau.m50245b();
        if (b != null) {
            return b;
        }
        throw new NullPointerException("No platform found on Android");
    }

    /* renamed from: e */
    public static aay m50281e() {
        return f53525a;
    }

    /* renamed from: g */
    public static boolean m50282g() {
        if ("conscrypt".equals(C22766za.m55823a("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: h */
    public static boolean m50283h() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: a */
    public String mo53796a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public void mo53801a(String str, Object obj) {
        if (obj == null) {
            str = C25541a.m63881k(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo53800a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo53797a(SSLSocket sSLSocket, String str, List<C22749yq> list) throws IOException {
    }

    /* renamed from: a */
    public void mo53814a(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: b */
    public void mo53815b(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public boolean mo53804b(String str) {
        return true;
    }

    /* renamed from: c */
    public SSLContext mo53805c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: f */
    public String mo53817f() {
        return "OkHttp";
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: b */
    public static byte[] m50279b(List<C22749yq> list) {
        abi abi = new abi();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C22749yq yqVar = list.get(i);
            if (yqVar != C22749yq.HTTP_1_0) {
                abi.mo53899i(yqVar.toString().length());
                abi.mo53870b(yqVar.toString());
            }
        }
        return abi.mo53919u();
    }

    /* renamed from: a */
    public void mo53802a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo53800a(int i, String str, Throwable th) {
        f53526b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public Object mo53799a(String str) {
        if (f53526b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m50277a(List<C22749yq> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C22749yq yqVar = list.get(i);
            if (yqVar != C22749yq.HTTP_1_0) {
                arrayList.add(yqVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public abf mo53803b(X509TrustManager x509TrustManager) {
        return new abc(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: a */
    public abd mo53798a(X509TrustManager x509TrustManager) {
        return new abb(mo53803b(x509TrustManager));
    }

    /* renamed from: a */
    private static aay m50276a() {
        if (m50283h()) {
            return m50280d();
        }
        return m50278b();
    }
}
