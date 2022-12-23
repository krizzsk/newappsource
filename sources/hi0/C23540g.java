package hi0;

import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;
import p001a0.C0016g;
import ri0.C24831c;

/* renamed from: hi0.g */
public final class C23540g {

    /* renamed from: c */
    public static final C23540g f59464c = new C23540g(new LinkedHashSet(new ArrayList()), (C24831c) null);

    /* renamed from: a */
    public final Set<C23541a> f59465a;

    /* renamed from: b */
    public final C24831c f59466b;

    /* renamed from: hi0.g$a */
    public static final class C23541a {

        /* renamed from: a */
        public final String f59467a;

        /* renamed from: b */
        public final String f59468b;

        /* renamed from: c */
        public final String f59469c;

        /* renamed from: d */
        public final ByteString f59470d;

        public C23541a(String str, String str2) {
            String str3;
            this.f59467a = str;
            if (str.startsWith("*.")) {
                StringBuilder k = C13555b.m33972k(UrlPrivacyValidator.HTTP_SCHEME);
                k.append(str.substring(2));
                str3 = C23558r.m57725j(k.toString()).f59537d;
            } else {
                str3 = C23558r.m57725j(UrlPrivacyValidator.HTTP_SCHEME + str).f59537d;
            }
            this.f59468b = str3;
            if (str2.startsWith("sha1/")) {
                this.f59469c = "sha1/";
                this.f59470d = ByteString.m61902g(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.f59469c = "sha256/";
                this.f59470d = ByteString.m61902g(str2.substring(7));
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("pins must start with 'sha256/' or 'sha1/': ", str2));
            }
            if (this.f59470d == null) {
                throw new IllegalArgumentException(C25541a.m63881k("pins must be base64: ", str2));
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C23541a) {
                C23541a aVar = (C23541a) obj;
                if (!this.f59467a.equals(aVar.f59467a) || !this.f59469c.equals(aVar.f59469c) || !this.f59470d.equals(aVar.f59470d)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f59470d.hashCode() + C13715c.m34238d(this.f59469c, C13715c.m34238d(this.f59467a, 527, 31), 31);
        }

        public final String toString() {
            return this.f59469c + this.f59470d.mo60869f();
        }
    }

    public C23540g(Set<C23541a> set, C24831c cVar) {
        this.f59465a = set;
        this.f59466b = cVar;
    }

    /* renamed from: b */
    public static String m57684b(X509Certificate x509Certificate) {
        if (x509Certificate instanceof X509Certificate) {
            StringBuilder k = C13555b.m33972k("sha256/");
            k.append(ByteString.m61904o(x509Certificate.getPublicKey().getEncoded()).mo60871i("SHA-256").mo60869f());
            return k.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    public final void mo58655a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        int i;
        List emptyList = Collections.emptyList();
        Iterator<C23541a> it = this.f59465a.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C23541a next = it.next();
            if (next.f59467a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == next.f59468b.length()) {
                    String str2 = next.f59468b;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        i = 1;
                    }
                }
            } else {
                i = str.equals(next.f59468b);
            }
            if (i != 0) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(next);
            }
        }
        if (!emptyList.isEmpty()) {
            C24831c cVar = this.f59466b;
            if (cVar != null) {
                list = cVar.mo61204a(str, list);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                int size2 = emptyList.size();
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    C23541a aVar = (C23541a) emptyList.get(i3);
                    if (aVar.f59469c.equals("sha256/")) {
                        if (byteString == null) {
                            byteString = ByteString.m61904o(x509Certificate.getPublicKey().getEncoded()).mo60871i("SHA-256");
                        }
                        if (aVar.f59470d.equals(byteString)) {
                            return;
                        }
                    } else if (aVar.f59469c.equals("sha1/")) {
                        if (byteString2 == null) {
                            byteString2 = ByteString.m61904o(x509Certificate.getPublicKey().getEncoded()).mo60871i("SHA-1");
                        }
                        if (aVar.f59470d.equals(byteString2)) {
                            return;
                        }
                    } else {
                        StringBuilder k = C13555b.m33972k("unsupported hashAlgorithm: ");
                        k.append(aVar.f59469c);
                        throw new AssertionError(k.toString());
                    }
                }
            }
            StringBuilder t = C0016g.m36t("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i4);
                t.append("\n    ");
                t.append(m57684b(x509Certificate2));
                t.append(": ");
                t.append(x509Certificate2.getSubjectDN().getName());
            }
            t.append("\n  Pinned certificates for ");
            t.append(str);
            t.append(":");
            int size4 = emptyList.size();
            while (i < size4) {
                t.append("\n    ");
                t.append((C23541a) emptyList.get(i));
                i++;
            }
            throw new SSLPeerUnverifiedException(t.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23540g) {
            C23540g gVar = (C23540g) obj;
            if (!Objects.equals(this.f59466b, gVar.f59466b) || !this.f59465a.equals(gVar.f59465a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f59465a.hashCode() + (Objects.hashCode(this.f59466b) * 31);
    }
}
