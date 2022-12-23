package p555ie;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p648me.C18365c;

/* renamed from: ie.e */
public final class C17583e {

    /* renamed from: b */
    public static final Charset f45210b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C18365c f45211a;

    public C17583e(C18365c cVar) {
        this.f45211a = cVar;
    }

    /* renamed from: a */
    public static HashMap m43701a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    /* renamed from: d */
    public static void m43702d(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo50036b(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x000b
            me.c r6 = r4.f45211a
            java.lang.String r0 = "internal-keys"
            java.io.File r5 = r6.mo50830a(r5, r0)
            goto L_0x0013
        L_0x000b:
            me.c r6 = r4.f45211a
            java.lang.String r0 = "keys"
            java.io.File r5 = r6.mo50830a(r5, r0)
        L_0x0013:
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x004c
            long r0 = r5.length()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0024
            goto L_0x004c
        L_0x0024:
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x003c }
            java.lang.String r6 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35973k(r0)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.util.HashMap r5 = m43701a(r6)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r0)
            return r5
        L_0x0036:
            r5 = move-exception
            goto L_0x0048
        L_0x0038:
            r6 = r0
            goto L_0x003c
        L_0x003a:
            r5 = move-exception
            goto L_0x0047
        L_0x003c:
            m43702d(r5)     // Catch:{ all -> 0x003a }
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r6)
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L_0x0047:
            r0 = r6
        L_0x0048:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r0)
            throw r5
        L_0x004c:
            m43702d(r5)
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17583e.mo50036b(java.lang.String, boolean):java.util.Map");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        m43702d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r7 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo50037c(java.lang.String r7) {
        /*
            r6 = this;
            me.c r0 = r6.f45211a
            java.lang.String r1 = "user-data"
            java.io.File r7 = r0.mo50830a(r7, r1)
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 == 0) goto L_0x004a
            long r2 = r7.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            goto L_0x004a
        L_0x001a:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r0.<init>(r7)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35973k(r0)     // Catch:{ Exception -> 0x003d }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x003d }
            r3.<init>(r2)     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = "userId"
            boolean r4 = r3.isNull(r2)     // Catch:{ Exception -> 0x003d }
            if (r4 != 0) goto L_0x0034
            java.lang.String r1 = r3.optString(r2, r1)     // Catch:{ Exception -> 0x003d }
        L_0x0034:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r0)
            return r1
        L_0x0038:
            r1 = r0
            goto L_0x0046
        L_0x003a:
            r7 = move-exception
            goto L_0x0046
        L_0x003c:
            r0 = r1
        L_0x003d:
            m43702d(r7)     // Catch:{ all -> 0x0044 }
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r0)
            return r1
        L_0x0044:
            r7 = move-exception
            goto L_0x0038
        L_0x0046:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r1)
            throw r7
        L_0x004a:
            m43702d(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17583e.mo50037c(java.lang.String):java.lang.String");
    }
}
