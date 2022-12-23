package p083f5;

import java.io.Closeable;
import java.net.HttpURLConnection;

/* renamed from: f5.a */
public final class C4682a implements Closeable {

    /* renamed from: b */
    public final HttpURLConnection f15950b;

    public C4682a(HttpURLConnection httpURLConnection) {
        this.f15950b = httpURLConnection;
    }

    public final void close() {
        this.f15950b.disconnect();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|27) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x005e=Splitter:B:17:0x005e, B:22:0x006e=Splitter:B:22:0x006e} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo20203e() {
        /*
            r4 = this;
            r0 = 0
            java.net.HttpURLConnection r1 = r4.f15950b     // Catch:{ IOException -> 0x000d }
            int r1 = r1.getResponseCode()     // Catch:{ IOException -> 0x000d }
            int r1 = r1 / 100
            r2 = 2
            if (r1 != r2) goto L_0x000d
            r0 = 1
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r0 = 0
            goto L_0x0069
        L_0x0011:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x006f }
            r0.<init>()     // Catch:{ IOException -> 0x006f }
            java.lang.String r1 = "Unable to fetch "
            r0.append(r1)     // Catch:{ IOException -> 0x006f }
            java.net.HttpURLConnection r1 = r4.f15950b     // Catch:{ IOException -> 0x006f }
            java.net.URL r1 = r1.getURL()     // Catch:{ IOException -> 0x006f }
            r0.append(r1)     // Catch:{ IOException -> 0x006f }
            java.lang.String r1 = ". Failed with "
            r0.append(r1)     // Catch:{ IOException -> 0x006f }
            java.net.HttpURLConnection r1 = r4.f15950b     // Catch:{ IOException -> 0x006f }
            int r1 = r1.getResponseCode()     // Catch:{ IOException -> 0x006f }
            r0.append(r1)     // Catch:{ IOException -> 0x006f }
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch:{ IOException -> 0x006f }
            java.net.HttpURLConnection r1 = r4.f15950b     // Catch:{ IOException -> 0x006f }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006f }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x006f }
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x006f }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006f }
            r2.<init>(r3)     // Catch:{ IOException -> 0x006f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x006f }
            r1.<init>()     // Catch:{ IOException -> 0x006f }
        L_0x004c:
            java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x005b
            r1.append(r3)     // Catch:{ all -> 0x006a }
            r3 = 10
            r1.append(r3)     // Catch:{ all -> 0x006a }
            goto L_0x004c
        L_0x005b:
            r2.close()     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x006f }
            r0.append(r1)     // Catch:{ IOException -> 0x006f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x006f }
        L_0x0069:
            return r0
        L_0x006a:
            r0 = move-exception
            r2.close()     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            throw r0     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            r0 = move-exception
            java.lang.String r1 = "get error failed "
            p107h5.C5055c.m12897c(r1, r0)
            java.lang.String r0 = r0.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p083f5.C4682a.mo20203e():java.lang.String");
    }
}
