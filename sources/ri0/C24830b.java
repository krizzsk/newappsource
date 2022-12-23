package ri0;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: ri0.b */
public final class C24830b implements C24833e {

    /* renamed from: a */
    public final LinkedHashMap f62774a = new LinkedHashMap();

    public C24830b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f62774a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f62774a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public final X509Certificate mo61207a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f62774a.get(x509Certificate.getIssuerX500Principal());
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24830b) || !((C24830b) obj).f62774a.equals(this.f62774a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f62774a.hashCode();
    }
}
