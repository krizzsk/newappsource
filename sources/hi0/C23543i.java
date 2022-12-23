package hi0;

import ii0.C23610d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* renamed from: hi0.i */
public final class C23543i {

    /* renamed from: e */
    public static final C23543i f59490e;

    /* renamed from: f */
    public static final C23543i f59491f = new C23543i(new C23544a(false));

    /* renamed from: a */
    public final boolean f59492a;

    /* renamed from: b */
    public final boolean f59493b;

    /* renamed from: c */
    public final String[] f59494c;

    /* renamed from: d */
    public final String[] f59495d;

    static {
        C23542h hVar = C23542h.f59486q;
        C23542h hVar2 = C23542h.f59487r;
        C23542h hVar3 = C23542h.f59488s;
        C23542h hVar4 = C23542h.f59480k;
        C23542h hVar5 = C23542h.f59482m;
        C23542h hVar6 = C23542h.f59481l;
        C23542h hVar7 = C23542h.f59483n;
        C23542h hVar8 = C23542h.f59485p;
        C23542h hVar9 = C23542h.f59484o;
        C23542h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        C23542h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, C23542h.f59478i, C23542h.f59479j, C23542h.f59476g, C23542h.f59477h, C23542h.f59474e, C23542h.f59475f, C23542h.f59473d};
        C23544a aVar = new C23544a(true);
        aVar.mo58666a(hVarArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.mo58669d(tlsVersion, tlsVersion2);
        if (aVar.f59496a) {
            aVar.f59499d = true;
            new C23543i(aVar);
            C23544a aVar2 = new C23544a(true);
            aVar2.mo58666a(hVarArr2);
            aVar2.mo58669d(tlsVersion, tlsVersion2);
            if (aVar2.f59496a) {
                aVar2.f59499d = true;
                f59490e = new C23543i(aVar2);
                C23544a aVar3 = new C23544a(true);
                aVar3.mo58666a(hVarArr2);
                aVar3.mo58669d(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
                if (aVar3.f59496a) {
                    aVar3.f59499d = true;
                    new C23543i(aVar3);
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public C23543i(C23544a aVar) {
        this.f59492a = aVar.f59496a;
        this.f59494c = aVar.f59497b;
        this.f59495d = aVar.f59498c;
        this.f59493b = aVar.f59499d;
    }

    /* renamed from: a */
    public final boolean mo58662a(SSLSocket sSLSocket) {
        if (!this.f59492a) {
            return false;
        }
        String[] strArr = this.f59495d;
        if (strArr != null && !C23610d.m57808p(C23610d.f59692i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f59494c;
        if (strArr2 == null || C23610d.m57808p(C23542h.f59471b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23543i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C23543i iVar = (C23543i) obj;
        boolean z = this.f59492a;
        if (z != iVar.f59492a) {
            return false;
        }
        if (!z || (Arrays.equals(this.f59494c, iVar.f59494c) && Arrays.equals(this.f59495d, iVar.f59495d) && this.f59493b == iVar.f59493b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f59492a) {
            return ((((527 + Arrays.hashCode(this.f59494c)) * 31) + Arrays.hashCode(this.f59495d)) * 31) + (this.f59493b ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        if (!this.f59492a) {
            return "ConnectionSpec()";
        }
        StringBuilder k = C13555b.m33972k("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f59494c;
        List<TlsVersion> list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String a : strArr) {
                arrayList.add(C23542h.m57686a(a));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        k.append(Objects.toString(list, "[all enabled]"));
        k.append(", tlsVersions=");
        String[] strArr2 = this.f59495d;
        if (strArr2 != null) {
            list2 = TlsVersion.forJavaNames(strArr2);
        }
        k.append(Objects.toString(list2, "[all enabled]"));
        k.append(", supportsTlsExtensions=");
        return C25541a.m63885p(k, this.f59493b, ")");
    }

    /* renamed from: hi0.i$a */
    public static final class C23544a {

        /* renamed from: a */
        public boolean f59496a;

        /* renamed from: b */
        public String[] f59497b;

        /* renamed from: c */
        public String[] f59498c;

        /* renamed from: d */
        public boolean f59499d;

        public C23544a(boolean z) {
            this.f59496a = z;
        }

        /* renamed from: a */
        public final void mo58666a(C23542h... hVarArr) {
            if (this.f59496a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f59489a;
                }
                mo58667b(strArr);
                return;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: b */
        public final void mo58667b(String... strArr) {
            if (!this.f59496a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f59497b = (String[]) strArr.clone();
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: c */
        public final void mo58668c(String... strArr) {
            if (!this.f59496a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f59498c = (String[]) strArr.clone();
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: d */
        public final void mo58669d(TlsVersion... tlsVersionArr) {
            if (this.f59496a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                mo58668c(strArr);
                return;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C23544a(C23543i iVar) {
            this.f59496a = iVar.f59492a;
            this.f59497b = iVar.f59494c;
            this.f59498c = iVar.f59495d;
            this.f59499d = iVar.f59493b;
        }
    }
}
