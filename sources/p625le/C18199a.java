package p625le;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p358af.C13437d;

/* renamed from: le.a */
public final class C18199a {

    /* renamed from: a */
    public final String f46447a;

    /* renamed from: b */
    public final Map<String, String> f46448b;

    /* renamed from: c */
    public final HashMap f46449c = new HashMap();

    public C18199a(String str, HashMap hashMap) {
        this.f46447a = str;
        this.f46448b = hashMap;
    }

    /* renamed from: a */
    public static String m44899a(String str, Map map) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() != null) {
            str2 = (String) entry.getValue();
        } else {
            str2 = "";
        }
        sb2.append(str2);
        sb.append(sb2.toString());
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            StringBuilder k = C13555b.m33972k("&");
            k.append((String) entry2.getKey());
            k.append("=");
            if (entry2.getValue() != null) {
                str3 = (String) entry2.getValue();
            } else {
                str3 = "";
            }
            k.append(str3);
            sb.append(k.toString());
        }
        String sb3 = sb.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return C13437d.m33706k(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = C25541a.m63881k("&", sb3);
        }
        return C25541a.m63881k(str, sb3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p229r1.C6235e mo50609b() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = r8.f46447a     // Catch:{ all -> 0x008e }
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.f46448b     // Catch:{ all -> 0x008e }
            java.lang.String r1 = m44899a(r1, r2)     // Catch:{ all -> 0x008e }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x008e }
            r2.<init>(r1)     // Catch:{ all -> 0x008e }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x008e }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x008e }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x008c }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x008c }
            java.util.HashMap r2 = r8.f46449c     // Catch:{ all -> 0x008c }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x008c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008c }
        L_0x002b:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x0047
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x008c }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x008c }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x008c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x008c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x008c }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x008c }
            goto L_0x002b
        L_0x0047:
            r1.connect()     // Catch:{ all -> 0x008c }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x008c }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x007e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x007a }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x007a }
            r0.<init>(r4)     // Catch:{ all -> 0x007a }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r5.<init>()     // Catch:{ all -> 0x007a }
        L_0x0069:
            int r6 = r0.read(r4)     // Catch:{ all -> 0x007a }
            r7 = -1
            if (r6 == r7) goto L_0x0075
            r7 = 0
            r5.append(r4, r7, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0069
        L_0x0075:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r0 = move-exception
            r2 = r0
            r0 = r3
            goto L_0x0091
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            r3.close()
        L_0x0083:
            r1.disconnect()
            r1.e r1 = new r1.e
            r1.<init>(r2, r0)
            return r1
        L_0x008c:
            r2 = move-exception
            goto L_0x0091
        L_0x008e:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            if (r1 == 0) goto L_0x009b
            r1.disconnect()
        L_0x009b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p625le.C18199a.mo50609b():r1.e");
    }
}
