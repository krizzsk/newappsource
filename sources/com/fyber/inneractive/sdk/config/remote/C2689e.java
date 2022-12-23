package com.fyber.inneractive.sdk.config.remote;

import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.config.remote.e */
public class C2689e {

    /* renamed from: a */
    public C2685a f9382a;

    /* renamed from: b */
    public List<C2692h> f9383b = null;

    /* renamed from: c */
    public String f9384c;

    /* renamed from: d */
    public String f9385d;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.fyber.inneractive.sdk.config.remote.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0189 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.config.remote.C2689e m6761a(org.json.JSONObject r19) throws com.fyber.inneractive.sdk.external.InvalidAppIdException {
        /*
            r0 = r19
            java.lang.String r1 = "updateHash"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0011
            return r2
        L_0x0011:
            com.fyber.inneractive.sdk.config.remote.e r3 = new com.fyber.inneractive.sdk.config.remote.e
            r3.<init>()
            r3.f9384c = r1
            java.lang.String r1 = "app"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            r4 = -1
            java.lang.String r5 = "id"
            if (r1 != 0) goto L_0x0025
            r6 = -1
            goto L_0x0029
        L_0x0025:
            int r6 = r1.optInt(r5, r4)
        L_0x0029:
            java.lang.String r7 = "isActive"
            java.lang.String r8 = "native"
            java.lang.String r9 = "viewability"
            java.lang.String r10 = "display"
            java.lang.String r11 = "video"
            java.lang.String r12 = "monitor"
            if (r6 != r4) goto L_0x003b
            r4 = r2
            goto L_0x0083
        L_0x003b:
            com.fyber.inneractive.sdk.config.remote.a r4 = new com.fyber.inneractive.sdk.config.remote.a
            r4.<init>()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4.f9371a = r6
            java.lang.String r6 = "publisherId"
            java.lang.String r6 = r1.optString(r6, r2)
            r4.f9372b = r6
            org.json.JSONObject r6 = r1.optJSONObject(r12)
            com.fyber.inneractive.sdk.config.remote.f r6 = com.fyber.inneractive.sdk.config.remote.C2690f.m6762a(r6)
            r4.f9373c = r6
            org.json.JSONObject r6 = r1.optJSONObject(r11)
            com.fyber.inneractive.sdk.config.remote.j r6 = com.fyber.inneractive.sdk.config.remote.C2694j.m6767a(r6)
            r4.f9374d = r6
            org.json.JSONObject r6 = r1.optJSONObject(r10)
            com.fyber.inneractive.sdk.config.remote.b r6 = com.fyber.inneractive.sdk.config.remote.C2686b.m6758a(r6)
            r4.f9375e = r6
            org.json.JSONObject r6 = r1.optJSONObject(r9)
            com.fyber.inneractive.sdk.config.remote.k r6 = com.fyber.inneractive.sdk.config.remote.C2695k.m6768a(r6)
            r4.f9376f = r6
            java.lang.String r6 = r1.optString(r7, r2)
            r4.f9377g = r6
            org.json.JSONObject r1 = r1.optJSONObject(r8)
            com.fyber.inneractive.sdk.config.remote.C2691g.m6763a(r1)
        L_0x0083:
            if (r4 != 0) goto L_0x0086
            return r2
        L_0x0086:
            r3.f9382a = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r4 = "spots"
            org.json.JSONArray r0 = r0.optJSONArray(r4)
            if (r0 == 0) goto L_0x0192
            r6 = 0
        L_0x0096:
            int r13 = r0.length()
            if (r6 >= r13) goto L_0x0192
            org.json.JSONObject r13 = r0.optJSONObject(r6)
            if (r13 != 0) goto L_0x00a3
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r14 = r13.optString(r5, r2)
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 == 0) goto L_0x00b5
        L_0x00ad:
            r17 = r0
            r15 = r2
            r18 = r7
            r7 = r15
            goto L_0x0184
        L_0x00b5:
            com.fyber.inneractive.sdk.config.remote.h r15 = new com.fyber.inneractive.sdk.config.remote.h
            r15.<init>()
            r15.f9388a = r14
            java.lang.String r14 = r13.optString(r7, r2)
            r15.f9389b = r14
            org.json.JSONObject r14 = r13.optJSONObject(r10)
            com.fyber.inneractive.sdk.config.remote.b r14 = com.fyber.inneractive.sdk.config.remote.C2686b.m6758a(r14)
            r15.f9390c = r14
            org.json.JSONObject r14 = r13.optJSONObject(r12)
            com.fyber.inneractive.sdk.config.remote.f r14 = com.fyber.inneractive.sdk.config.remote.C2690f.m6762a(r14)
            r15.f9391d = r14
            org.json.JSONObject r14 = r13.optJSONObject(r8)
            com.fyber.inneractive.sdk.config.remote.C2691g.m6763a(r14)
            org.json.JSONObject r14 = r13.optJSONObject(r11)
            com.fyber.inneractive.sdk.config.remote.j r14 = com.fyber.inneractive.sdk.config.remote.C2694j.m6767a(r14)
            r15.f9392e = r14
            org.json.JSONObject r14 = r13.optJSONObject(r9)
            com.fyber.inneractive.sdk.config.remote.k r14 = com.fyber.inneractive.sdk.config.remote.C2695k.m6768a(r14)
            r15.f9393f = r14
            java.lang.String r14 = "units"
            org.json.JSONArray r13 = r13.optJSONArray(r14)
            if (r13 == 0) goto L_0x0178
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0102
            goto L_0x0178
        L_0x0102:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r4 = 0
        L_0x0108:
            int r2 = r13.length()
            if (r4 >= r2) goto L_0x0172
            org.json.JSONObject r2 = r13.optJSONObject(r4)
            r17 = r0
            if (r2 == 0) goto L_0x0164
            com.fyber.inneractive.sdk.config.remote.i r0 = new com.fyber.inneractive.sdk.config.remote.i
            r0.<init>()
            r18 = r7
            r16 = r13
            r7 = 0
            java.lang.String r13 = r2.optString(r5, r7)
            r0.f9395a = r13
            java.lang.String r13 = "spotId"
            java.lang.String r13 = r2.optString(r13, r7)
            r0.f9396b = r13
            org.json.JSONObject r13 = r2.optJSONObject(r10)
            com.fyber.inneractive.sdk.config.remote.b r13 = com.fyber.inneractive.sdk.config.remote.C2686b.m6758a(r13)
            r0.f9397c = r13
            org.json.JSONObject r13 = r2.optJSONObject(r12)
            com.fyber.inneractive.sdk.config.remote.f r13 = com.fyber.inneractive.sdk.config.remote.C2690f.m6762a(r13)
            r0.f9398d = r13
            org.json.JSONObject r13 = r2.optJSONObject(r8)
            com.fyber.inneractive.sdk.config.remote.g r13 = com.fyber.inneractive.sdk.config.remote.C2691g.m6763a(r13)
            r0.f9399e = r13
            org.json.JSONObject r13 = r2.optJSONObject(r11)
            com.fyber.inneractive.sdk.config.remote.j r13 = com.fyber.inneractive.sdk.config.remote.C2694j.m6767a(r13)
            r0.f9400f = r13
            org.json.JSONObject r2 = r2.optJSONObject(r9)
            com.fyber.inneractive.sdk.config.remote.k r2 = com.fyber.inneractive.sdk.config.remote.C2695k.m6768a(r2)
            r0.f9401g = r2
            r14.add(r0)
            goto L_0x0169
        L_0x0164:
            r18 = r7
            r16 = r13
            r7 = 0
        L_0x0169:
            int r4 = r4 + 1
            r13 = r16
            r0 = r17
            r7 = r18
            goto L_0x0108
        L_0x0172:
            r17 = r0
            r18 = r7
            r7 = 0
            goto L_0x0182
        L_0x0178:
            r17 = r0
            r18 = r7
            r7 = r2
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0182:
            r15.f9394g = r14
        L_0x0184:
            if (r15 == 0) goto L_0x0189
            r1.add(r15)
        L_0x0189:
            int r6 = r6 + 1
            r2 = r7
            r0 = r17
            r7 = r18
            goto L_0x0096
        L_0x0192:
            r3.f9383b = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.remote.C2689e.m6761a(org.json.JSONObject):com.fyber.inneractive.sdk.config.remote.e");
    }
}
