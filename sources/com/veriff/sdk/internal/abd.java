package com.veriff.sdk.internal;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public abstract class abd {
    /* renamed from: a */
    public static abd m50311a(X509TrustManager x509TrustManager) {
        return aay.m50281e().mo53798a(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo53806a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
