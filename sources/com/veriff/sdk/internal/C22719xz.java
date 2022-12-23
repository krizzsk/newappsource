package com.veriff.sdk.internal;

import com.appboy.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p239rb.C6298j;

/* renamed from: com.veriff.sdk.internal.xz */
public final class C22719xz {

    /* renamed from: E */
    public static final C22719xz f57454E = m55469a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: I */
    public static final C22719xz f57455I = m55469a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: a */
    public static final Comparator<String> f57456a = new C6298j(6);

    /* renamed from: aI */
    public static final C22719xz f57457aI = m55469a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: aJ */
    public static final C22719xz f57458aJ = m55469a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: aX */
    public static final C22719xz f57459aX = m55469a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: aY */
    public static final C22719xz f57460aY = m55469a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: ag */
    public static final C22719xz f57461ag = m55469a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: ah */
    public static final C22719xz f57462ah = m55469a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: bb */
    public static final C22719xz f57463bb = m55469a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: bc */
    public static final C22719xz f57464bc = m55469a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: bh */
    public static final C22719xz f57465bh = m55469a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: bi */
    public static final C22719xz f57466bi = m55469a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: bl */
    public static final C22719xz f57467bl = m55469a("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: bm */
    public static final C22719xz f57468bm = m55469a("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: bn */
    public static final C22719xz f57469bn = m55469a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: br */
    private static final Map<String, C22719xz> f57470br = new LinkedHashMap();

    /* renamed from: i */
    public static final C22719xz f57471i = m55469a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: bq */
    public final String f57472bq;

    static {
        m55469a("SSL_RSA_WITH_NULL_MD5", 1);
        m55469a("SSL_RSA_WITH_NULL_SHA", 2);
        m55469a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m55469a("SSL_RSA_WITH_RC4_128_MD5", 4);
        m55469a("SSL_RSA_WITH_RC4_128_SHA", 5);
        m55469a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m55469a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m55469a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m55469a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m55469a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m55469a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m55469a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m55469a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m55469a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m55469a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m55469a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m55469a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m55469a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m55469a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m55469a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m55469a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m55469a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m55469a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m55469a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m55469a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m55469a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m55469a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m55469a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m55469a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m55469a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m55469a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m55469a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m55469a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m55469a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m55469a("TLS_RSA_WITH_NULL_SHA256", 59);
        m55469a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m55469a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m55469a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m55469a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m55469a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m55469a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m55469a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m55469a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m55469a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m55469a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m55469a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m55469a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m55469a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m55469a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m55469a("TLS_PSK_WITH_RC4_128_SHA", 138);
        m55469a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m55469a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m55469a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m55469a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m55469a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m55469a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m55469a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m55469a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m55469a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m55469a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m55469a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", (int) ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        m55469a("TLS_FALLBACK_SCSV", 22016);
        m55469a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m55469a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m55469a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m55469a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m55469a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m55469a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m55469a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m55469a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m55469a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m55469a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m55469a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m55469a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m55469a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m55469a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m55469a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m55469a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m55469a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m55469a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m55469a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m55469a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m55469a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m55469a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m55469a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m55469a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m55469a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m55469a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m55469a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m55469a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m55469a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m55469a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m55469a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m55469a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m55469a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m55469a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m55469a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m55469a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m55469a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        m55469a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m55469a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        m55469a("TLS_AES_128_CCM_SHA256", 4868);
        m55469a("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private C22719xz(String str) {
        str.getClass();
        this.f57472bq = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m55467a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        int i = 4;
        while (i < min) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt == charAt2) {
                i++;
            } else if (charAt < charAt2) {
                return -1;
            } else {
                return 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b */
    private static String m55472b(String str) {
        if (str.startsWith("TLS_")) {
            StringBuilder k = C13555b.m33972k("SSL_");
            k.append(str.substring(4));
            return k.toString();
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            StringBuilder k2 = C13555b.m33972k("TLS_");
            k2.append(str.substring(4));
            return k2.toString();
        }
    }

    public String toString() {
        return this.f57472bq;
    }

    /* renamed from: a */
    public static synchronized C22719xz m55468a(String str) {
        C22719xz xzVar;
        synchronized (C22719xz.class) {
            Map<String, C22719xz> map = f57470br;
            xzVar = map.get(str);
            if (xzVar == null) {
                xzVar = map.get(m55472b(str));
                if (xzVar == null) {
                    xzVar = new C22719xz(str);
                }
                map.put(str, xzVar);
            }
        }
        return xzVar;
    }

    /* renamed from: a */
    public static List<C22719xz> m55470a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m55468a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C22719xz m55469a(String str, int i) {
        C22719xz xzVar = new C22719xz(str);
        f57470br.put(str, xzVar);
        return xzVar;
    }

    /* renamed from: a */
    public String mo57202a() {
        return this.f57472bq;
    }
}
