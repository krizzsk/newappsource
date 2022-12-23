package p672ne;

import p066e0.C4452q0;
import p601ke.C18028a;

/* renamed from: ne.a */
public final class C18539a {

    /* renamed from: b */
    public static final C18028a f47201b = new C18028a();

    /* renamed from: c */
    public static final String f47202c = m45456a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    public static final String f47203d = m45456a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    public static final C4452q0 f47204e = new C4452q0(8);

    /* renamed from: a */
    public final C18541c f47205a;

    public C18539a(C18541c cVar) {
        this.f47205a = cVar;
    }

    /* renamed from: a */
    public static String m45456a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
