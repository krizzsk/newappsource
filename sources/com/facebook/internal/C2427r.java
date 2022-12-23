package com.facebook.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.C0199g;
import com.appsflyer.ServerParameters;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import mf0.C24365j;
import org.json.JSONObject;
import p009a8.C0115o;
import p019b0.C1426c;
import p210p8.C6100a;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.internal.r */
public final class C2427r {

    /* renamed from: a */
    public static final C2427r f8702a = new C2427r();

    /* renamed from: b */
    public static final AtomicBoolean f8703b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final ConcurrentLinkedQueue<C2428a> f8704c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    public static final ConcurrentHashMap f8705d = new ConcurrentHashMap();

    /* renamed from: e */
    public static Long f8706e;

    /* renamed from: f */
    public static C1426c f8707f;

    /* renamed from: com.facebook.internal.r$a */
    public interface C2428a {
        void onCompleted();
    }

    static {
        C24365j.m61219a(C2427r.class).mo59303c();
    }

    /* renamed from: a */
    public static JSONObject m6379a() {
        Bundle b = C25541a.m63872b(ServerParameters.PLATFORM, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        C0115o oVar = C0115o.f331a;
        b.putString(ServerParameters.SDK_DATA_SDK_VERSION, "15.1.0");
        b.putString("fields", "gatekeepers");
        String str = GraphRequest.f8425j;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        C24362h.m61210e(format, "java.lang.String.format(format, *args)");
        GraphRequest g = GraphRequest.C2281c.m6137g((AccessToken) null, format, (GraphRequest.C2280b) null);
        g.f8431d = b;
        JSONObject jSONObject = g.mo11903c().f367d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static final boolean m6380b(String str, String str2, boolean z) {
        HashMap hashMap;
        Boolean bool;
        ConcurrentHashMap concurrentHashMap;
        C24362h.m61211f(str, "name");
        f8702a.getClass();
        ArrayList<C6100a> arrayList = null;
        m6381c((C2426q) null);
        if (!f8705d.containsKey(str2)) {
            hashMap = new HashMap();
        } else {
            C1426c cVar = f8707f;
            if (!(cVar == null || (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) cVar.f5273c).get(str2)) == null)) {
                arrayList = new ArrayList<>(concurrentHashMap.size());
                for (Map.Entry value : concurrentHashMap.entrySet()) {
                    arrayList.add((C6100a) value.getValue());
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (C6100a aVar : arrayList) {
                    hashMap.put(aVar.f19364a, Boolean.valueOf(aVar.f19365b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) f8705d.get(str2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                C1426c cVar2 = f8707f;
                if (cVar2 == null) {
                    cVar2 = new C1426c(2);
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList2.add(new C6100a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C6100a aVar2 = (C6100a) it.next();
                    concurrentHashMap2.put(aVar2.f19364a, aVar2);
                }
                ((ConcurrentHashMap) cVar2.f5273c).put(str2, concurrentHashMap2);
                f8707f = cVar2;
                hashMap = hashMap2;
            }
        }
        if (hashMap.containsKey(str) && (bool = (Boolean) hashMap.get(str)) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5 = com.facebook.internal.C2397f0.f8630a;
        r5 = p009a8.C0115o.f331a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m6381c(com.facebook.internal.C2426q r8) {
        /*
            java.lang.Class<com.facebook.internal.r> r0 = com.facebook.internal.C2427r.class
            monitor-enter(r0)
            if (r8 == 0) goto L_0x000a
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.r$a> r1 = f8704c     // Catch:{ all -> 0x003c }
            r1.add(r8)     // Catch:{ all -> 0x003c }
        L_0x000a:
            java.lang.String r8 = p009a8.C0115o.m211b()     // Catch:{ all -> 0x003c }
            com.facebook.internal.r r1 = f8702a     // Catch:{ all -> 0x003c }
            java.lang.Long r2 = f8706e     // Catch:{ all -> 0x003c }
            r1.getClass()     // Catch:{ all -> 0x003c }
            r1 = 0
            r3 = 1
            if (r2 != 0) goto L_0x001a
            goto L_0x002c
        L_0x001a:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003c }
            long r6 = r2.longValue()     // Catch:{ all -> 0x003c }
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x002c
            r2 = 1
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r2 == 0) goto L_0x003e
            j$.util.concurrent.ConcurrentHashMap r2 = f8705d     // Catch:{ all -> 0x003c }
            boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x003e
            m6383e()     // Catch:{ all -> 0x003c }
            monitor-exit(r0)
            return
        L_0x003c:
            r8 = move-exception
            goto L_0x008e
        L_0x003e:
            android.content.Context r2 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x003c }
            java.lang.String r4 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x003c }
            r5[r1] = r8     // Catch:{ all -> 0x003c }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)     // Catch:{ all -> 0x003c }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            mf0.C24362h.m61210e(r4, r5)     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r5 = r2.getSharedPreferences(r5, r1)     // Catch:{ all -> 0x003c }
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch:{ all -> 0x003c }
            boolean r7 = com.facebook.internal.C2397f0.m6292A(r5)     // Catch:{ all -> 0x003c }
            if (r7 != 0) goto L_0x0076
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006d }
            r7.<init>(r5)     // Catch:{ JSONException -> 0x006d }
            r6 = r7
            goto L_0x0071
        L_0x006d:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x003c }
            a8.o r5 = p009a8.C0115o.f331a     // Catch:{ all -> 0x003c }
        L_0x0071:
            if (r6 == 0) goto L_0x0076
            m6382d(r8, r6)     // Catch:{ all -> 0x003c }
        L_0x0076:
            java.util.concurrent.Executor r5 = p009a8.C0115o.m212c()     // Catch:{ all -> 0x003c }
            java.util.concurrent.atomic.AtomicBoolean r6 = f8703b     // Catch:{ all -> 0x003c }
            boolean r1 = r6.compareAndSet(r1, r3)     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0084
            monitor-exit(r0)
            return
        L_0x0084:
            k5.d r1 = new k5.d     // Catch:{ all -> 0x003c }
            r1.<init>(r2, r8, r4)     // Catch:{ all -> 0x003c }
            r5.execute(r1)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)
            return
        L_0x008e:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2427r.m6381c(com.facebook.internal.q):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|20|21|(2:31|23)(1:24)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0052 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized org.json.JSONObject m6382d(java.lang.String r7, org.json.JSONObject r8) {
        /*
            java.lang.Class<com.facebook.internal.r> r0 = com.facebook.internal.C2427r.class
            monitor-enter(r0)
            j$.util.concurrent.ConcurrentHashMap r1 = f8705d     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0062 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0012
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0062 }
            r1.<init>()     // Catch:{ all -> 0x0062 }
        L_0x0012:
            r2 = 0
            r3 = 0
            java.lang.String r4 = "data"
            org.json.JSONArray r8 = r8.optJSONArray(r4)     // Catch:{ all -> 0x0062 }
            if (r8 != 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            org.json.JSONObject r3 = r8.optJSONObject(r2)     // Catch:{ all -> 0x0062 }
        L_0x0021:
            if (r3 != 0) goto L_0x0028
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0062 }
            r3.<init>()     // Catch:{ all -> 0x0062 }
        L_0x0028:
            java.lang.String r8 = "gatekeepers"
            org.json.JSONArray r8 = r3.optJSONArray(r8)     // Catch:{ all -> 0x0062 }
            if (r8 != 0) goto L_0x0035
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ all -> 0x0062 }
            r8.<init>()     // Catch:{ all -> 0x0062 }
        L_0x0035:
            int r3 = r8.length()     // Catch:{ all -> 0x0062 }
            if (r3 <= 0) goto L_0x005b
        L_0x003b:
            int r4 = r2 + 1
            org.json.JSONObject r2 = r8.getJSONObject(r2)     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r5 = "key"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r6 = "value"
            boolean r2 = r2.getBoolean(r6)     // Catch:{ JSONException -> 0x0052 }
            r1.put(r5, r2)     // Catch:{ JSONException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            com.facebook.internal.f0 r2 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0062 }
            a8.o r2 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0062 }
        L_0x0056:
            if (r4 < r3) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r2 = r4
            goto L_0x003b
        L_0x005b:
            j$.util.concurrent.ConcurrentHashMap r8 = f8705d     // Catch:{ all -> 0x0062 }
            r8.put(r7, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)
            return r1
        L_0x0062:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2427r.m6382d(java.lang.String, org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: e */
    public static void m6383e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<C2428a> concurrentLinkedQueue = f8704c;
            if (!concurrentLinkedQueue.isEmpty()) {
                C2428a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new C0199g(poll, 7));
                }
            } else {
                return;
            }
        }
    }
}
