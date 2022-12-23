package com.facebook.appevents;

import com.facebook.internal.C2376b;
import java.util.ArrayList;
import java.util.List;
import p262t8.C6606a;

/* renamed from: com.facebook.appevents.q */
public final class C2353q {

    /* renamed from: a */
    public final C2376b f8568a;

    /* renamed from: b */
    public final String f8569b;

    /* renamed from: c */
    public ArrayList f8570c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f8571d = new ArrayList();

    /* renamed from: e */
    public int f8572e;

    public C2353q(C2376b bVar, String str) {
        this.f8568a = bVar;
        this.f8569b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12510a(com.facebook.appevents.AppEvent r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = p262t8.C6606a.m15601b(r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.String r0 = "event"
            mf0.C24362h.m61211f(r3, r0)     // Catch:{ all -> 0x002d }
            java.util.ArrayList r0 = r2.f8570c     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            java.util.ArrayList r1 = r2.f8571d     // Catch:{ all -> 0x002d }
            int r1 = r1.size()     // Catch:{ all -> 0x002d }
            int r0 = r0 + r1
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L_0x0026
            int r3 = r2.f8572e     // Catch:{ all -> 0x002d }
            int r3 = r3 + 1
            r2.f8572e = r3     // Catch:{ all -> 0x002d }
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = r2.f8570c     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            p262t8.C6606a.m15600a(r2, r3)     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2353q.mo12510a(com.facebook.appevents.AppEvent):void");
    }

    /* renamed from: b */
    public final synchronized void mo12511b(boolean z) {
        if (!C6606a.m15601b(this)) {
            if (z) {
                try {
                    this.f8570c.addAll(this.f8571d);
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                    return;
                }
            }
            this.f8571d.clear();
            this.f8572e = 0;
        }
    }

    /* renamed from: c */
    public final synchronized List<AppEvent> mo12512c() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f8570c;
            this.f8570c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        p262t8.C6606a.m15600a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12513d(com.facebook.GraphRequest r9, android.content.Context r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = p262t8.C6606a.m15601b(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r8)     // Catch:{ all -> 0x0070 }
            int r5 = r8.f8572e     // Catch:{ all -> 0x006d }
            g8.a r0 = p097g8.C4845a.f16269a     // Catch:{ all -> 0x006d }
            java.util.ArrayList r0 = r8.f8570c     // Catch:{ all -> 0x006d }
            p097g8.C4845a.m12166b(r0)     // Catch:{ all -> 0x006d }
            java.util.ArrayList r0 = r8.f8571d     // Catch:{ all -> 0x006d }
            java.util.ArrayList r2 = r8.f8570c     // Catch:{ all -> 0x006d }
            r0.addAll(r2)     // Catch:{ all -> 0x006d }
            java.util.ArrayList r0 = r8.f8570c     // Catch:{ all -> 0x006d }
            r0.clear()     // Catch:{ all -> 0x006d }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.util.ArrayList r2 = r8.f8571d     // Catch:{ all -> 0x006d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x006d }
        L_0x0029:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006d }
            com.facebook.appevents.AppEvent r3 = (com.facebook.appevents.AppEvent) r3     // Catch:{ all -> 0x006d }
            boolean r4 = r3.mo12455d()     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x004b
            if (r11 != 0) goto L_0x0043
            boolean r4 = r3.mo12456e()     // Catch:{ all -> 0x006d }
            if (r4 != 0) goto L_0x0029
        L_0x0043:
            org.json.JSONObject r3 = r3.mo12453b()     // Catch:{ all -> 0x006d }
            r0.put(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0029
        L_0x004b:
            com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "Event with invalid checksum: "
            mf0.C24362h.m61216k(r3, r4)     // Catch:{ all -> 0x006d }
            a8.o r3 = p009a8.C0115o.f331a     // Catch:{ all -> 0x006d }
            goto L_0x0029
        L_0x0055:
            int r11 = r0.length()     // Catch:{ all -> 0x006d }
            if (r11 != 0) goto L_0x005d
            monitor-exit(r8)     // Catch:{ all -> 0x0070 }
            return r1
        L_0x005d:
            bf0.d r11 = bf0.C21050d.f52856a     // Catch:{ all -> 0x006d }
            monitor-exit(r8)     // Catch:{ all -> 0x0070 }
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            r7 = r12
            r2.mo12514e(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0070 }
            int r9 = r0.length()     // Catch:{ all -> 0x0070 }
            return r9
        L_0x006d:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0070 }
            throw r9     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r9 = move-exception
            p262t8.C6606a.m15600a(r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2353q.mo12513d(com.facebook.GraphRequest, android.content.Context, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        p262t8.C6606a.m15600a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12514e(com.facebook.GraphRequest r4, android.content.Context r5, int r6, org.json.JSONArray r7, boolean r8) {
        /*
            r3 = this;
            boolean r0 = p262t8.C6606a.m15601b(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.HashMap r0 = com.facebook.appevents.internal.AppEventsLoggerUtility.f8536a     // Catch:{ JSONException -> 0x001f }
            com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType r0 = com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x001f }
            com.facebook.internal.b r1 = r3.f8568a     // Catch:{ JSONException -> 0x001f }
            java.lang.String r2 = r3.f8569b     // Catch:{ JSONException -> 0x001f }
            org.json.JSONObject r5 = com.facebook.appevents.internal.AppEventsLoggerUtility.m6204a(r0, r1, r2, r8, r5)     // Catch:{ JSONException -> 0x001f }
            int r8 = r3.f8572e     // Catch:{ JSONException -> 0x001f }
            if (r8 <= 0) goto L_0x0024
            java.lang.String r8 = "num_skipped_events"
            r5.put(r8, r6)     // Catch:{ JSONException -> 0x001f }
            goto L_0x0024
        L_0x001d:
            r4 = move-exception
            goto L_0x003b
        L_0x001f:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x001d }
            r5.<init>()     // Catch:{ all -> 0x001d }
        L_0x0024:
            r4.f8430c = r5     // Catch:{ all -> 0x001d }
            android.os.Bundle r5 = r4.f8431d     // Catch:{ all -> 0x001d }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x001d }
            java.lang.String r7 = "events.toString()"
            mf0.C24362h.m61210e(r6, r7)     // Catch:{ all -> 0x001d }
            java.lang.String r7 = "custom_events"
            r5.putString(r7, r6)     // Catch:{ all -> 0x001d }
            r4.f8432e = r6     // Catch:{ all -> 0x001d }
            r4.f8431d = r5     // Catch:{ all -> 0x001d }
            return
        L_0x003b:
            p262t8.C6606a.m15600a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2353q.mo12514e(com.facebook.GraphRequest, android.content.Context, int, org.json.JSONArray, boolean):void");
    }
}
