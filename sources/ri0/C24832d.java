package ri0;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: ri0.d */
public final class C24832d implements HostnameVerifier {

    /* renamed from: a */
    public static final C24832d f62775a = new C24832d();

    /* renamed from: a */
    public static ArrayList m62363a(X509Certificate x509Certificate) {
        List<String> b = m62364b(x509Certificate, 7);
        List<String> b2 = m62364b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b2.size() + b.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m62364b(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m62365c(java.lang.String r9, java.security.cert.X509Certificate r10) {
        /*
            java.util.regex.Pattern r0 = ii0.C23610d.f59694k
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r0 = r0.matches()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            r0 = 7
            java.util.List r10 = m62364b(r10, r0)
            int r0 = r10.size()
            r2 = 0
        L_0x0018:
            if (r2 >= r0) goto L_0x00ea
            java.lang.Object r3 = r10.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r9.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0028
            goto L_0x00e9
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x002b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
            r0 = 2
            java.util.List r10 = m62364b(r10, r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x003a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == 0) goto L_0x00e6
            int r3 = r9.length()
            if (r3 == 0) goto L_0x00e6
            java.lang.String r3 = "."
            boolean r4 = r9.startsWith(r3)
            if (r4 != 0) goto L_0x00e6
            java.lang.String r4 = ".."
            boolean r5 = r9.endsWith(r4)
            if (r5 == 0) goto L_0x0060
            goto L_0x00e6
        L_0x0060:
            if (r0 == 0) goto L_0x00e6
            int r5 = r0.length()
            if (r5 == 0) goto L_0x00e6
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto L_0x00e6
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L_0x0076
            goto L_0x00e6
        L_0x0076:
            boolean r4 = r9.endsWith(r3)
            r5 = 46
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = p001a0.C0016g.m28k(r9, r5)
            goto L_0x0084
        L_0x0083:
            r4 = r9
        L_0x0084:
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x008e
            java.lang.String r0 = p001a0.C0016g.m28k(r0, r5)
        L_0x008e:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x00a1
            boolean r0 = r4.equals(r0)
            goto L_0x00e7
        L_0x00a1:
            java.lang.String r3 = "*."
            boolean r6 = r0.startsWith(r3)
            if (r6 == 0) goto L_0x00e6
            r6 = 42
            int r6 = r0.indexOf(r6, r2)
            r7 = -1
            if (r6 == r7) goto L_0x00b3
            goto L_0x00e6
        L_0x00b3:
            int r6 = r4.length()
            int r8 = r0.length()
            if (r6 >= r8) goto L_0x00be
            goto L_0x00e6
        L_0x00be:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00c5
            goto L_0x00e6
        L_0x00c5:
            java.lang.String r0 = r0.substring(r2)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto L_0x00d0
            goto L_0x00e6
        L_0x00d0:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x00e4
            int r3 = r3 + -1
            int r0 = r4.lastIndexOf(r5, r3)
            if (r0 == r7) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r0 = 1
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            if (r0 == 0) goto L_0x003a
        L_0x00e9:
            r1 = 1
        L_0x00ea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ri0.C24832d.m62365c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m62365c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
