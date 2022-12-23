package com.veriff.sdk.internal;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: com.veriff.sdk.internal.yj */
public final class C22735yj {

    /* renamed from: a */
    private final C22762yx f57516a;

    /* renamed from: b */
    private final C22719xz f57517b;

    /* renamed from: c */
    private final List<Certificate> f57518c;

    /* renamed from: d */
    private final List<Certificate> f57519d;

    private C22735yj(C22762yx yxVar, C22719xz xzVar, List<Certificate> list, List<Certificate> list2) {
        this.f57516a = yxVar;
        this.f57517b = xzVar;
        this.f57518c = list;
        this.f57519d = list2;
    }

    /* renamed from: a */
    public static C22735yj m55546a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C22719xz a = C22719xz.m55468a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C22762yx a2 = C22762yx.m55796a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C22766za.m55829a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C22766za.m55829a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C22735yj(a2, a, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: b */
    public C22719xz mo57259b() {
        return this.f57517b;
    }

    /* renamed from: c */
    public List<Certificate> mo57260c() {
        return this.f57518c;
    }

    /* renamed from: d */
    public List<Certificate> mo57261d() {
        return this.f57519d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22735yj)) {
            return false;
        }
        C22735yj yjVar = (C22735yj) obj;
        if (!this.f57516a.equals(yjVar.f57516a) || !this.f57517b.equals(yjVar.f57517b) || !this.f57518c.equals(yjVar.f57518c) || !this.f57519d.equals(yjVar.f57519d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f57517b.hashCode();
        int hashCode2 = this.f57518c.hashCode();
        return this.f57519d.hashCode() + ((hashCode2 + ((hashCode + ((this.f57516a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Handshake{tlsVersion=");
        k.append(this.f57516a);
        k.append(" cipherSuite=");
        k.append(this.f57517b);
        k.append(" peerCertificates=");
        k.append(m55547a(this.f57518c));
        k.append(" localCertificates=");
        return C13555b.m33970i(k, m55547a(this.f57519d), '}');
    }

    /* renamed from: a */
    public static C22735yj m55545a(C22762yx yxVar, C22719xz xzVar, List<Certificate> list, List<Certificate> list2) {
        if (yxVar == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (xzVar != null) {
            return new C22735yj(yxVar, xzVar, C22766za.m55828a(list), C22766za.m55828a(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public C22762yx mo57258a() {
        return this.f57516a;
    }

    /* renamed from: a */
    private List<String> m55547a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate next : list) {
            if (next instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) next).getSubjectDN()));
            } else {
                arrayList.add(next.getType());
            }
        }
        return arrayList;
    }
}
