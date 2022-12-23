package p184n8;

import android.content.SharedPreferences;
import com.facebook.internal.C2397f0;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C23826d;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: n8.b */
public final class C5870b {

    /* renamed from: a */
    public static final C5870b f18863a = new C5870b();

    /* renamed from: b */
    public static final LinkedHashMap f18864b = new LinkedHashMap();

    /* renamed from: c */
    public static SharedPreferences f18865c;

    /* renamed from: d */
    public static final AtomicBoolean f18866d = new AtomicBoolean(false);

    /* renamed from: a */
    public static final void m14315a(String str, String str2) {
        Class<C5870b> cls = C5870b.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(str2, "predictedEvent");
                if (!f18866d.get()) {
                    f18863a.mo21745c();
                }
                LinkedHashMap linkedHashMap = f18864b;
                linkedHashMap.put(str, str2);
                SharedPreferences sharedPreferences = f18865c;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    C2397f0 f0Var = C2397f0.f8630a;
                    edit.putString("SUGGESTED_EVENTS_HISTORY", C2397f0.m6296E(C23826d.m58535Z(linkedHashMap))).apply();
                    return;
                }
                C24362h.m61217l("shardPreferences");
                throw null;
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|(1:8)|16|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m14316b(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "text"
            java.lang.Class<n8.b> r1 = p184n8.C5870b.class
            boolean r2 = p262t8.C6606a.m15601b(r1)
            r3 = 0
            if (r2 == 0) goto L_0x000d
            return r3
        L_0x000d:
            mf0.C24362h.m61211f(r5, r0)     // Catch:{ all -> 0x003f }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x003f }
            r2.<init>()     // Catch:{ all -> 0x003f }
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0034 }
        L_0x001d:
            if (r4 == 0) goto L_0x002f
            java.lang.Class r0 = r4.getClass()     // Catch:{ JSONException -> 0x0034 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ JSONException -> 0x0034 }
            r5.put(r0)     // Catch:{ JSONException -> 0x0034 }
            android.view.ViewGroup r4 = p085f8.C4714d.m12018h(r4)     // Catch:{ JSONException -> 0x0034 }
            goto L_0x001d
        L_0x002f:
            java.lang.String r4 = "classname"
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0034 }
        L_0x0034:
            com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x003f }
            java.lang.String r4 = com.facebook.internal.C2397f0.m6305N(r4)     // Catch:{ all -> 0x003f }
            return r4
        L_0x003f:
            r4 = move-exception
            p262t8.C6606a.m15600a(r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n8.C5870b.m14316b(android.view.View, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final void mo21745c() {
        String str = "";
        if (!C6606a.m15601b(this)) {
            try {
                AtomicBoolean atomicBoolean = f18866d;
                if (!atomicBoolean.get()) {
                    SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    C24362h.m61210e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
                    f18865c = sharedPreferences;
                    LinkedHashMap linkedHashMap = f18864b;
                    C2397f0 f0Var = C2397f0.f8630a;
                    SharedPreferences sharedPreferences2 = f18865c;
                    if (sharedPreferences2 != null) {
                        String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", str);
                        if (string != null) {
                            str = string;
                        }
                        linkedHashMap.putAll(C2397f0.m6295D(str));
                        atomicBoolean.set(true);
                        return;
                    }
                    C24362h.m61217l("shardPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
