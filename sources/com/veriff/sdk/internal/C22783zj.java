package com.veriff.sdk.internal;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* renamed from: com.veriff.sdk.internal.zj */
final class C22783zj {

    /* renamed from: a */
    private final List<C22723yc> f57764a;

    /* renamed from: b */
    private int f57765b = 0;

    /* renamed from: c */
    private boolean f57766c;

    /* renamed from: d */
    private boolean f57767d;

    public C22783zj(List<C22723yc> list) {
        this.f57764a = list;
    }

    /* renamed from: b */
    private boolean m55912b(SSLSocket sSLSocket) {
        for (int i = this.f57765b; i < this.f57764a.size(); i++) {
            if (this.f57764a.get(i).mo57206a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C22723yc mo57487a(SSLSocket sSLSocket) throws IOException {
        C22723yc ycVar;
        int i = this.f57765b;
        int size = this.f57764a.size();
        while (true) {
            if (i >= size) {
                ycVar = null;
                break;
            }
            ycVar = this.f57764a.get(i);
            if (ycVar.mo57206a(sSLSocket)) {
                this.f57765b = i + 1;
                break;
            }
            i++;
        }
        if (ycVar != null) {
            this.f57766c = m55912b(sSLSocket);
            C22763yy.f57691a.mo57370a(ycVar, sSLSocket, this.f57767d);
            return ycVar;
        }
        StringBuilder k = C13555b.m33972k("Unable to find acceptable protocols. isFallback=");
        k.append(this.f57767d);
        k.append(", modes=");
        k.append(this.f57764a);
        k.append(", supported protocols=");
        k.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(k.toString());
    }

    /* renamed from: a */
    public boolean mo57488a(IOException iOException) {
        this.f57767d = true;
        if (!this.f57766c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }
}
