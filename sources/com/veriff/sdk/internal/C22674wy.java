package com.veriff.sdk.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.veriff.sdk.internal.wy */
public class C22674wy extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f57330a;

    /* renamed from: b */
    private TrustManager[] f57331b;

    public C22674wy() throws KeyStoreException, KeyManagementException, NoSuchAlgorithmException {
        m55275b();
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, this.f57331b, (SecureRandom) null);
        this.f57330a = instance.getSocketFactory();
    }

    /* renamed from: a */
    private Socket m55274a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    /* renamed from: b */
    private void m55275b() throws KeyStoreException, NoSuchAlgorithmException {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            StringBuilder k = C13555b.m33972k("Unexpected default trust managers:");
            k.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(k.toString());
        }
        this.f57331b = trustManagers;
    }

    public Socket createSocket() throws IOException {
        return m55274a(this.f57330a.createSocket());
    }

    public String[] getDefaultCipherSuites() {
        return this.f57330a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f57330a.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m55274a(this.f57330a.createSocket(socket, str, i, z));
    }

    /* renamed from: a */
    public X509TrustManager mo57041a() {
        return (X509TrustManager) this.f57331b[0];
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return m55274a(this.f57330a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return m55274a(this.f57330a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m55274a(this.f57330a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m55274a(this.f57330a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
