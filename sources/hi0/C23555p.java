package hi0;

import ii0.C23610d;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;

/* renamed from: hi0.p */
public final class C23555p {

    /* renamed from: a */
    public final TlsVersion f59527a;

    /* renamed from: b */
    public final C23542h f59528b;

    /* renamed from: c */
    public final List<Certificate> f59529c;

    /* renamed from: d */
    public final List<Certificate> f59530d;

    public C23555p(TlsVersion tlsVersion, C23542h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f59527a = tlsVersion;
        this.f59528b = hVar;
        this.f59529c = list;
        this.f59530d = list2;
    }

    /* renamed from: a */
    public static C23555p m57705a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C23542h a = C23542h.m57686a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                TlsVersion forJavaName = TlsVersion.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C23610d.m57805m(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C23610d.m57805m(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C23555p(forJavaName, a, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: b */
    public static ArrayList m57706b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23555p)) {
            return false;
        }
        C23555p pVar = (C23555p) obj;
        if (!this.f59527a.equals(pVar.f59527a) || !this.f59528b.equals(pVar.f59528b) || !this.f59529c.equals(pVar.f59529c) || !this.f59530d.equals(pVar.f59530d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f59528b.hashCode();
        int hashCode2 = this.f59529c.hashCode();
        return this.f59530d.hashCode() + ((hashCode2 + ((hashCode + ((this.f59527a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Handshake{tlsVersion=");
        k.append(this.f59527a);
        k.append(" cipherSuite=");
        k.append(this.f59528b);
        k.append(" peerCertificates=");
        k.append(m57706b(this.f59529c));
        k.append(" localCertificates=");
        k.append(m57706b(this.f59530d));
        k.append('}');
        return k.toString();
    }
}
