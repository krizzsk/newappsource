package com.veriff.sdk.internal;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class abc implements abf {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f53541a = new LinkedHashMap();

    public abc(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f53541a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f53541a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo53811a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f53541a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abc) || !((abc) obj).f53541a.equals(this.f53541a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f53541a.hashCode();
    }
}
