package com.veriff.sdk.internal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: com.veriff.sdk.internal.yc */
public final class C22723yc {

    /* renamed from: b */
    public static final C22723yc f57477b;

    /* renamed from: d */
    public static final C22723yc f57478d = new C22724a(false).mo57217a();

    /* renamed from: e */
    public final boolean f57479e;

    /* renamed from: f */
    public final boolean f57480f;

    /* renamed from: g */
    public final String[] f57481g;

    /* renamed from: h */
    public final String[] f57482h;

    static {
        C22719xz xzVar = C22719xz.f57467bl;
        C22719xz xzVar2 = C22719xz.f57468bm;
        C22719xz xzVar3 = C22719xz.f57469bn;
        C22719xz xzVar4 = C22719xz.f57459aX;
        C22719xz xzVar5 = C22719xz.f57463bb;
        C22719xz xzVar6 = C22719xz.f57460aY;
        C22719xz xzVar7 = C22719xz.f57464bc;
        C22719xz xzVar8 = C22719xz.f57466bi;
        C22719xz xzVar9 = C22719xz.f57465bh;
        C22719xz[] xzVarArr = {xzVar, xzVar2, xzVar3, xzVar4, xzVar5, xzVar6, xzVar7, xzVar8, xzVar9, C22719xz.f57457aI, C22719xz.f57458aJ, C22719xz.f57461ag, C22719xz.f57462ah, C22719xz.f57454E, C22719xz.f57455I, C22719xz.f57471i};
        C22724a a = new C22724a(true).mo57214a(xzVar, xzVar2, xzVar3, xzVar4, xzVar5, xzVar6, xzVar7, xzVar8, xzVar9);
        C22762yx yxVar = C22762yx.TLS_1_3;
        C22762yx yxVar2 = C22762yx.TLS_1_2;
        a.mo57215a(yxVar, yxVar2).mo57213a(true).mo57217a();
        f57477b = new C22724a(true).mo57214a(xzVarArr).mo57215a(yxVar, yxVar2).mo57213a(true).mo57217a();
        new C22724a(true).mo57214a(xzVarArr).mo57215a(yxVar, yxVar2, C22762yx.TLS_1_1, C22762yx.TLS_1_0).mo57213a(true).mo57217a();
    }

    public C22723yc(C22724a aVar) {
        this.f57479e = aVar.f57483a;
        this.f57481g = aVar.f57484b;
        this.f57482h = aVar.f57485c;
        this.f57480f = aVar.f57486d;
    }

    /* renamed from: a */
    public boolean mo57205a() {
        return this.f57479e;
    }

    /* renamed from: b */
    public List<C22719xz> mo57207b() {
        String[] strArr = this.f57481g;
        if (strArr != null) {
            return C22719xz.m55470a(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public List<C22762yx> mo57208c() {
        String[] strArr = this.f57482h;
        if (strArr != null) {
            return C22762yx.m55797a(strArr);
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo57209d() {
        return this.f57480f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22723yc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C22723yc ycVar = (C22723yc) obj;
        boolean z = this.f57479e;
        if (z != ycVar.f57479e) {
            return false;
        }
        if (!z || (Arrays.equals(this.f57481g, ycVar.f57481g) && Arrays.equals(this.f57482h, ycVar.f57482h) && this.f57480f == ycVar.f57480f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f57479e) {
            return ((((527 + Arrays.hashCode(this.f57481g)) * 31) + Arrays.hashCode(this.f57482h)) * 31) + (this.f57480f ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f57479e) {
            return "ConnectionSpec()";
        }
        StringBuilder k = C13555b.m33972k("ConnectionSpec(cipherSuites=");
        k.append(Objects.toString(mo57207b(), "[all enabled]"));
        k.append(", tlsVersions=");
        k.append(Objects.toString(mo57208c(), "[all enabled]"));
        k.append(", supportsTlsExtensions=");
        return C25541a.m63885p(k, this.f57480f, ")");
    }

    /* renamed from: com.veriff.sdk.internal.yc$a */
    public static final class C22724a {

        /* renamed from: a */
        public boolean f57483a;

        /* renamed from: b */
        public String[] f57484b;

        /* renamed from: c */
        public String[] f57485c;

        /* renamed from: d */
        public boolean f57486d;

        public C22724a(boolean z) {
            this.f57483a = z;
        }

        /* renamed from: a */
        public C22724a mo57214a(C22719xz... xzVarArr) {
            if (this.f57483a) {
                String[] strArr = new String[xzVarArr.length];
                for (int i = 0; i < xzVarArr.length; i++) {
                    strArr[i] = xzVarArr[i].f57472bq;
                }
                return mo57216a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: b */
        public C22724a mo57218b(String... strArr) {
            if (!this.f57483a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f57485c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public C22724a(C22723yc ycVar) {
            this.f57483a = ycVar.f57479e;
            this.f57484b = ycVar.f57481g;
            this.f57485c = ycVar.f57482h;
            this.f57486d = ycVar.f57480f;
        }

        /* renamed from: a */
        public C22724a mo57216a(String... strArr) {
            if (!this.f57483a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f57484b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: a */
        public C22724a mo57215a(C22762yx... yxVarArr) {
            if (this.f57483a) {
                String[] strArr = new String[yxVarArr.length];
                for (int i = 0; i < yxVarArr.length; i++) {
                    strArr[i] = yxVarArr[i].f57690f;
                }
                return mo57218b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: a */
        public C22724a mo57213a(boolean z) {
            if (this.f57483a) {
                this.f57486d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: a */
        public C22723yc mo57217a() {
            return new C22723yc(this);
        }
    }

    /* renamed from: b */
    private C22723yc m55476b(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f57481g != null) {
            strArr = C22766za.m55841a((Comparator<? super String>) C22719xz.f57456a, sSLSocket.getEnabledCipherSuites(), this.f57481g);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f57482h != null) {
            strArr2 = C22766za.m55841a((Comparator<? super String>) C22766za.f57699g, sSLSocket.getEnabledProtocols(), this.f57482h);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a = C22766za.m55820a(C22719xz.f57456a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a != -1) {
            strArr = C22766za.m55842a(strArr, supportedCipherSuites[a]);
        }
        return new C22724a(this).mo57216a(strArr).mo57218b(strArr2).mo57217a();
    }

    /* renamed from: a */
    public void mo57204a(SSLSocket sSLSocket, boolean z) {
        C22723yc b = m55476b(sSLSocket, z);
        String[] strArr = b.f57482h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b.f57481g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: a */
    public boolean mo57206a(SSLSocket sSLSocket) {
        if (!this.f57479e) {
            return false;
        }
        String[] strArr = this.f57482h;
        if (strArr != null && !C22766za.m55848b(C22766za.f57699g, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f57481g;
        if (strArr2 == null || C22766za.m55848b(C22719xz.f57456a, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
