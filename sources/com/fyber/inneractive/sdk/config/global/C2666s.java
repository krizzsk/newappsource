package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.config.global.features.C2640a;
import com.fyber.inneractive.sdk.config.global.features.C2641b;
import com.fyber.inneractive.sdk.config.global.features.C2642c;
import com.fyber.inneractive.sdk.config.global.features.C2643d;
import com.fyber.inneractive.sdk.config.global.features.C2644e;
import com.fyber.inneractive.sdk.config.global.features.C2645f;
import com.fyber.inneractive.sdk.config.global.features.C2646g;
import com.fyber.inneractive.sdk.config.global.features.C2647h;
import com.fyber.inneractive.sdk.config.global.features.C2648i;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.flow.C2764d;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.s */
public class C2666s {

    /* renamed from: a */
    public final C2665r f9330a = new C2665r();

    /* renamed from: b */
    public String f9331b = "";

    /* renamed from: c */
    public Map<Class, C2644e> f9332c;

    /* renamed from: d */
    public JSONArray f9333d;

    public C2666s() {
        mo13270e();
        Map<Class, C2644e> a = mo13265a();
        this.f9332c = a;
        IAlog.m9902a("%s: created. Supported features: %s", "SupportedFeaturesProvider", a);
    }

    /* renamed from: b */
    public static C2666s m6734b() {
        return new C2666s();
    }

    /* renamed from: a */
    public Map<Class, C2644e> mo13265a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f9332c.entrySet()) {
            hashMap.put(next.getKey(), ((C2644e) next.getValue()).mo13234b());
        }
        return hashMap;
    }

    /* renamed from: c */
    public JSONArray mo13268c() {
        if (this.f9333d == null) {
            JSONArray a = C2654g.m6703a(this.f9332c, false);
            this.f9333d = a;
            IAlog.m9902a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a);
        }
        return this.f9333d;
    }

    /* renamed from: d */
    public JSONArray mo13269d() {
        JSONArray a = C2654g.m6703a(this.f9332c, true);
        IAlog.m9902a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a);
        return a;
    }

    /* renamed from: e */
    public void mo13270e() {
        this.f9330a.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(C2649j.class, new C2649j());
        hashMap.put(C2641b.class, new C2641b());
        hashMap.put(C2640a.class, new C2640a());
        hashMap.put(C2647h.class, new C2647h());
        hashMap.put(C2643d.class, new C2643d());
        hashMap.put(C2646g.class, new C2646g());
        hashMap.put(C2642c.class, new C2642c());
        hashMap.put(C2648i.class, new C2648i());
        hashMap.put(C2645f.class, new C2645f());
        this.f9332c = hashMap;
        this.f9333d = null;
    }

    /* renamed from: a */
    public void mo13266a(C2638e eVar) {
        for (C2644e next : this.f9332c.values()) {
            List<C2635b> list = next.f9303c;
            for (int size = list.size() - 1; size >= 0; size--) {
                C2635b bVar = list.get(size);
                List<C2637d> list2 = bVar.f9293d;
                if (list2 != null) {
                    Iterator<C2637d> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2637d next2 = it.next();
                        if (next2.mo13231a(eVar)) {
                            next.f9303c.remove(bVar);
                            next.f9304d.remove(bVar.f9290a);
                            this.f9333d = null;
                            IAlog.m9902a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f9290a, next2);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public <T extends C2644e> T mo13264a(Class<T> cls) {
        if (this.f9332c.containsKey(cls)) {
            return (C2644e) this.f9332c.get(cls);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13267a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r0.f9331b = r1
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.global.a r1 = r1.f9238z
            r1.f9289b = r0
            java.util.Map<java.lang.Class, com.fyber.inneractive.sdk.config.global.features.e> r2 = r0.f9332c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0016:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01fb
            java.lang.Object r3 = r2.next()
            com.fyber.inneractive.sdk.config.global.features.e r3 = (com.fyber.inneractive.sdk.config.global.features.C2644e) r3
            com.fyber.inneractive.sdk.config.global.l r4 = r1.f9288a
            if (r3 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x0016
            java.lang.String r5 = r3.f9302b
            com.fyber.inneractive.sdk.config.global.q r4 = r4.mo13257a((java.lang.String) r5)
            r5 = 2
            java.lang.String r6 = "a"
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x01ec
            com.fyber.inneractive.sdk.config.global.n r9 = r4.f9327a
            r3.f9327a = r9
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r6
            r9[r8] = r3
            java.lang.String r10 = "%s: Feature before variant merge: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r10, r9)
            java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.global.b> r4 = r4.f9329c
            java.util.Set r9 = r4.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x004e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01ec
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r4.get(r10)
            com.fyber.inneractive.sdk.config.global.b r10 = (com.fyber.inneractive.sdk.config.global.C2635b) r10
            if (r10 == 0) goto L_0x004e
            java.util.Random r11 = new java.util.Random
            r11.<init>()
            r12 = 100
            int r11 = r11.nextInt(r12)
            int r11 = r11 + r8
            int r13 = r10.f9291b
            r14 = 4
            r15 = 3
            if (r13 >= r11) goto L_0x0093
            java.lang.Object[] r13 = new java.lang.Object[r14]
            r13[r7] = r6
            java.lang.String r14 = r10.f9290a
            r13[r8] = r14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r5] = r11
            int r11 = r10.f9291b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r15] = r11
            java.lang.String r11 = "%s: Experiment '%s' filtered! rand: %d, with perc: %d"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r11, r13)
        L_0x008f:
            r5 = 1
            r12 = 3
            goto L_0x015b
        L_0x0093:
            java.util.List<com.fyber.inneractive.sdk.config.global.d> r13 = r10.f9293d
            if (r13 == 0) goto L_0x00ed
            java.util.Iterator r13 = r13.iterator()
        L_0x009b:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x00ed
            java.lang.Object r16 = r13.next()
            r12 = r16
            com.fyber.inneractive.sdk.config.global.d r12 = (com.fyber.inneractive.sdk.config.global.C2637d) r12
            com.fyber.inneractive.sdk.config.IAConfigManager r14 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.String r14 = r14.f9216d     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.config.global.e r5 = new com.fyber.inneractive.sdk.config.global.e     // Catch:{ NumberFormatException -> 0x00de }
            r5.<init>()     // Catch:{ NumberFormatException -> 0x00de }
            r5.f9297b = r14     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.config.global.s r14 = r1.f9289b     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.String r14 = r14.f9331b     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r14 = com.fyber.inneractive.sdk.serverapi.C3655a.m9852a((java.lang.String) r14)     // Catch:{ NumberFormatException -> 0x00de }
            r5.f9298c = r14     // Catch:{ NumberFormatException -> 0x00de }
            boolean r5 = r12.mo13231a(r5)     // Catch:{ NumberFormatException -> 0x00de }
            if (r5 == 0) goto L_0x00d9
            java.lang.String r5 = "%s: Experiment '%s' filtered! with %s"
            java.lang.Object[] r14 = new java.lang.Object[r15]     // Catch:{ NumberFormatException -> 0x00de }
            r14[r7] = r6     // Catch:{ NumberFormatException -> 0x00de }
            java.lang.String r15 = r10.f9290a     // Catch:{ NumberFormatException -> 0x00de }
            r14[r8] = r15     // Catch:{ NumberFormatException -> 0x00de }
            r15 = 2
            r14[r15] = r12     // Catch:{ NumberFormatException -> 0x00de }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r5, r14)     // Catch:{ NumberFormatException -> 0x00de }
            goto L_0x013a
        L_0x00d9:
            r5 = 2
            r12 = 100
            r14 = 4
            goto L_0x009b
        L_0x00de:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r7] = r6
            java.lang.String r12 = "%s: invalid publisherId"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r12, r5)
            r5 = 2
            r12 = 100
            r14 = 4
            r15 = 3
            goto L_0x009b
        L_0x00ed:
            boolean r5 = r3 instanceof com.fyber.inneractive.sdk.config.global.features.C2649j
            if (r5 == 0) goto L_0x013c
            java.util.List<com.fyber.inneractive.sdk.config.global.k> r5 = r10.f9292c
            java.util.Iterator r5 = r5.iterator()
        L_0x00f7:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x013c
            java.lang.Object r12 = r5.next()
            com.fyber.inneractive.sdk.config.global.k r12 = (com.fyber.inneractive.sdk.config.global.C2658k) r12
            com.fyber.inneractive.sdk.config.global.n r13 = r12.f9327a
            if (r13 == 0) goto L_0x011e
            java.util.Map r13 = r13.mo13261a()
            if (r13 == 0) goto L_0x011e
            com.fyber.inneractive.sdk.config.global.n r12 = r12.f9327a
            java.util.Map r12 = r12.mo13261a()
            java.lang.String r13 = "use_fmp_cache_mechanism"
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L_0x011e
            r12 = 1
            goto L_0x011f
        L_0x011e:
            r12 = 0
        L_0x011f:
            if (r12 == 0) goto L_0x00f7
            com.fyber.inneractive.sdk.util.u r12 = com.fyber.inneractive.sdk.util.C3732u.Video
            com.fyber.inneractive.sdk.config.IAConfigManager r13 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            java.util.Map<com.fyber.inneractive.sdk.util.u, com.fyber.inneractive.sdk.util.t> r13 = r13.f9211H
            java.lang.Object r12 = r13.get(r12)
            com.fyber.inneractive.sdk.util.t r12 = (com.fyber.inneractive.sdk.util.C3730t) r12
            if (r12 == 0) goto L_0x0137
            java.lang.String r13 = "vid_cache"
            boolean r12 = r12.mo13654a(r13)
            goto L_0x0138
        L_0x0137:
            r12 = 0
        L_0x0138:
            if (r12 != 0) goto L_0x00f7
        L_0x013a:
            goto L_0x008f
        L_0x013c:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r6
            java.lang.String r12 = r10.f9290a
            r5[r8] = r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 2
            r5[r12] = r11
            int r11 = r10.f9291b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 3
            r5[r12] = r11
            java.lang.String r11 = "%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r11, r5)
            r5 = 0
        L_0x015b:
            if (r5 != 0) goto L_0x01e9
            java.util.List<com.fyber.inneractive.sdk.config.global.k> r5 = r10.f9292c
            java.util.Random r11 = new java.util.Random
            r11.<init>()
            r13 = 100
            int r11 = r11.nextInt(r13)
            int r11 = r11 + r8
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r7] = r6
            java.lang.String r12 = r10.f9290a
            r13[r8] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r14 = 2
            r13[r14] = r12
            java.lang.String r12 = "%s: selectVariant for experiment '%s' generated random number: %d"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r12, r13)
            java.util.Iterator r5 = r5.iterator()
            r12 = 0
        L_0x0184:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x01b3
            java.lang.Object r13 = r5.next()
            com.fyber.inneractive.sdk.config.global.k r13 = (com.fyber.inneractive.sdk.config.global.C2658k) r13
            int r15 = r13.f9324c
            int r12 = r12 + r15
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r7] = r6
            r15[r8] = r13
            java.lang.String r8 = "%s: selectVariant variant found: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r8, r15)
            if (r12 < r11) goto L_0x01a2
            r14 = 1
            goto L_0x01b5
        L_0x01a2:
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r7] = r6
            java.lang.String r13 = r13.f9323b
            r14 = 1
            r8[r14] = r13
            java.lang.String r13 = "%s: selectVariant variant '%s' percentage outside selected range"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r13, r8)
            r8 = 1
            r14 = 2
            goto L_0x0184
        L_0x01b3:
            r14 = 1
            r13 = 0
        L_0x01b5:
            if (r13 == 0) goto L_0x01c9
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r6
            java.lang.String r8 = r10.f9290a
            r5[r14] = r8
            r8 = 2
            r5[r8] = r13
            java.lang.String r11 = "%s: experiment '%s' variant selected! %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r11, r5)
            goto L_0x01d7
        L_0x01c9:
            r8 = 2
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r7] = r6
            java.lang.String r8 = r10.f9290a
            r5[r14] = r8
            java.lang.String r8 = "%s: experiment '%s' no variant was selected! using control group"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r8, r5)
        L_0x01d7:
            java.util.List<com.fyber.inneractive.sdk.config.global.b> r5 = r3.f9303c
            r5.add(r10)
            if (r13 == 0) goto L_0x01e5
            java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.global.k> r5 = r3.f9304d
            java.lang.String r8 = r10.f9290a
            r5.put(r8, r13)
        L_0x01e5:
            r5 = 2
            r8 = 1
            goto L_0x004e
        L_0x01e9:
            r5 = 2
            goto L_0x004e
        L_0x01ec:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r6
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = "%s: Feature after variant merge: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r3, r4)
            goto L_0x0016
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.C2666s.mo13267a(java.lang.String):void");
    }

    /* renamed from: a */
    public static JSONArray m6733a(C2764d dVar, C2776j<?> jVar) {
        C2666s sVar;
        C2666s sVar2;
        if (dVar != null && (sVar2 = dVar.f9559f) != null) {
            return sVar2.mo13268c();
        }
        if (jVar == null || (sVar = jVar.f9592c) == null) {
            return null;
        }
        return sVar.mo13268c();
    }
}
