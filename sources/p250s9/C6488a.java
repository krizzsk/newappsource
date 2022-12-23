package p250s9;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p237r9.C6269b;
import p275u9.C6741l;
import p583jk.C17884p;

/* renamed from: s9.a */
public final class C6488a implements C6741l {

    /* renamed from: c */
    public static final String f20230c;

    /* renamed from: d */
    public static final Set<C6269b> f20231d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C6269b[]{new C6269b("proto"), new C6269b("json")})));

    /* renamed from: e */
    public static final C6488a f20232e;

    /* renamed from: f */
    public static final C6488a f20233f;

    /* renamed from: a */
    public final String f20234a;

    /* renamed from: b */
    public final String f20235b;

    static {
        String M = C17884p.m44342M("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20230c = M;
        String M2 = C17884p.m44342M("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String M3 = C17884p.m44342M("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20232e = new C6488a(M, (String) null);
        f20233f = new C6488a(M2, M3);
    }

    public C6488a(String str, String str2) {
        this.f20234a = str;
        this.f20235b = str2;
    }

    /* renamed from: a */
    public static C6488a m15373a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C6488a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: b */
    public final byte[] mo22592b() {
        String str = this.f20235b;
        if (str == null && this.f20234a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f20234a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
