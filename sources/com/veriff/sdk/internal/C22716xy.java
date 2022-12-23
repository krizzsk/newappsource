package com.veriff.sdk.internal;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p001a0.C0016g;

/* renamed from: com.veriff.sdk.internal.xy */
public final class C22716xy {

    /* renamed from: a */
    public static final C22716xy f57450a = new C22717a().mo57197a();

    /* renamed from: b */
    private final Set<C22718b> f57451b;

    /* renamed from: c */
    private final abd f57452c;

    /* renamed from: com.veriff.sdk.internal.xy$a */
    public static final class C22717a {

        /* renamed from: a */
        private final List<C22718b> f57453a = new ArrayList();

        /* renamed from: a */
        public C22716xy mo57197a() {
            return new C22716xy(new LinkedHashSet(this.f57453a), (abd) null);
        }
    }

    /* renamed from: com.veriff.sdk.internal.xy$b */
    public static final class C22718b {
        /* renamed from: a */
        public boolean mo57198a(String str) {
            throw null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22718b)) {
                return false;
            }
            ((C22718b) obj).getClass();
            throw null;
        }

        public int hashCode() {
            C13715c.m34238d((String) null, C13715c.m34238d((String) null, 527, 31), 31);
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public C22716xy(Set<C22718b> set, abd abd) {
        this.f57451b = set;
        this.f57452c = abd;
    }

    /* renamed from: b */
    public static abl m55461b(X509Certificate x509Certificate) {
        return abl.m50462a(x509Certificate.getPublicKey().getEncoded()).mo53942e();
    }

    /* renamed from: a */
    public void mo57194a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<C22718b> a = mo57193a(str);
        if (!a.isEmpty()) {
            abd abd = this.f57452c;
            if (abd != null) {
                list = abd.mo53806a(list, str);
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                if (a.size() <= 0) {
                    i++;
                } else {
                    a.get(0).getClass();
                    throw null;
                }
            }
            StringBuilder t = C0016g.m36t("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                t.append("\n    ");
                t.append(m55460a((Certificate) x509Certificate2));
                t.append(": ");
                t.append(x509Certificate2.getSubjectDN().getName());
            }
            t.append("\n  Pinned certificates for ");
            t.append(str);
            t.append(":");
            int size3 = a.size();
            for (int i3 = 0; i3 < size3; i3++) {
                t.append("\n    ");
                t.append(a.get(i3));
            }
            throw new SSLPeerUnverifiedException(t.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22716xy) {
            C22716xy xyVar = (C22716xy) obj;
            if (!Objects.equals(this.f57452c, xyVar.f57452c) || !this.f57451b.equals(xyVar.f57451b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f57451b.hashCode() + (Objects.hashCode(this.f57452c) * 31);
    }

    /* renamed from: a */
    public List<C22718b> mo57193a(String str) {
        List<C22718b> emptyList = Collections.emptyList();
        for (C22718b next : this.f57451b) {
            if (next.mo57198a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    /* renamed from: a */
    public C22716xy mo57192a(abd abd) {
        if (Objects.equals(this.f57452c, abd)) {
            return this;
        }
        return new C22716xy(this.f57451b, abd);
    }

    /* renamed from: a */
    public static String m55460a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder k = C13555b.m33972k("sha256/");
            k.append(m55461b((X509Certificate) certificate).mo53938b());
            return k.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    public static abl m55459a(X509Certificate x509Certificate) {
        return abl.m50462a(x509Certificate.getPublicKey().getEncoded()).mo53941d();
    }
}
