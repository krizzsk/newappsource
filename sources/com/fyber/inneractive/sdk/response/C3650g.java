package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.vast.C2799c;
import com.fyber.inneractive.sdk.measurement.C2825i;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2839f;
import com.fyber.inneractive.sdk.model.vast.C2846m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.response.g */
public class C3650g extends C3648e {

    /* renamed from: B */
    public long f12770B;

    /* renamed from: C */
    public C2835b f12771C;

    /* renamed from: D */
    public Map<C2846m, C2799c> f12772D = new LinkedHashMap();

    /* renamed from: E */
    public List<C2839f> f12773E = new ArrayList();

    /* renamed from: F */
    public final List<C2825i> f12774F = new ArrayList();

    /* renamed from: G */
    public LinkedHashMap<String, String> f12775G = new LinkedHashMap<>();

    /* renamed from: a */
    public InneractiveErrorCode mo13326a(InneractiveAdRequest inneractiveAdRequest) {
        return mo13327a((InneractiveAdRequest) null, (C2666s) null);
    }

    /* renamed from: e */
    public List<C2825i> mo15297e() {
        return this.f12774F;
    }

    /* renamed from: f */
    public C2835b mo15298f() {
        return this.f12771C;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0219  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.external.InneractiveErrorCode mo13327a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r18, com.fyber.inneractive.sdk.config.global.C2666s r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            com.fyber.inneractive.sdk.flow.vast.g r3 = new com.fyber.inneractive.sdk.flow.vast.g
            r3.<init>()
            java.lang.String r0 = r1.f12751i
            java.lang.String r4 = "VastErrorInvalidFile"
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = "reason"
            r6 = 0
            if (r4 == 0) goto L_0x0034
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C2922o.VAST_ERROR_INVALID_RESPONSE
            java.lang.String r8 = r1.f12752j
            if (r8 == 0) goto L_0x002c
            com.fyber.inneractive.sdk.network.q$b r8 = new com.fyber.inneractive.sdk.network.q$b
            r8.<init>()
            java.lang.String r9 = r1.f12752j
            java.lang.String r10 = "exception"
            com.fyber.inneractive.sdk.network.q$b r8 = r8.mo13719a(r10, r9)
            goto L_0x002d
        L_0x002c:
            r8 = 0
        L_0x002d:
            r16 = r4
            r4 = r0
            r0 = r16
            goto L_0x0114
        L_0x0034:
            java.lang.String r4 = "ErrorNoCompatibleMediaFile"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00c4
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C2922o.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE
            java.util.Map<com.fyber.inneractive.sdk.model.vast.m, com.fyber.inneractive.sdk.flow.vast.c> r8 = r1.f12772D
            if (r8 == 0) goto L_0x002c
            java.util.Set r9 = r8.keySet()
            if (r9 == 0) goto L_0x002c
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x002c
            com.fyber.inneractive.sdk.network.q$b r10 = new com.fyber.inneractive.sdk.network.q$b
            r10.<init>()
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x005e:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00bc
            java.lang.Object r12 = r9.next()
            com.fyber.inneractive.sdk.model.vast.m r12 = (com.fyber.inneractive.sdk.model.vast.C2846m) r12
            java.lang.Object r13 = r8.get(r12)     // Catch:{ JSONException -> 0x00b3 }
            com.fyber.inneractive.sdk.flow.vast.c r13 = (com.fyber.inneractive.sdk.flow.vast.C2799c) r13     // Catch:{ JSONException -> 0x00b3 }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b3 }
            r14.<init>()     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r15 = "url"
            java.lang.String r7 = r12.f9794g     // Catch:{ JSONException -> 0x00b3 }
            r14.put(r15, r7)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r7 = "bitrate"
            java.lang.Integer r15 = r12.f9792e     // Catch:{ JSONException -> 0x00b3 }
            r14.put(r7, r15)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r7 = "mime"
            java.lang.String r15 = r12.f9791d     // Catch:{ JSONException -> 0x00b3 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ JSONException -> 0x00b3 }
            if (r15 == 0) goto L_0x0091
            java.lang.String r15 = "na"
            goto L_0x0093
        L_0x0091:
            java.lang.String r15 = r12.f9791d     // Catch:{ JSONException -> 0x00b3 }
        L_0x0093:
            r14.put(r7, r15)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r7 = "delivery"
            java.lang.String r12 = r12.f9788a     // Catch:{ JSONException -> 0x00b3 }
            r14.put(r7, r12)     // Catch:{ JSONException -> 0x00b3 }
            com.fyber.inneractive.sdk.flow.vast.c$a r7 = r13.f9661a     // Catch:{ JSONException -> 0x00b3 }
            if (r7 == 0) goto L_0x00a4
            int r7 = r7.f9671a     // Catch:{ JSONException -> 0x00b3 }
            goto L_0x00a5
        L_0x00a4:
            r7 = 0
        L_0x00a5:
            r14.put(r5, r7)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r7 = "required_value"
            java.lang.Object r12 = r13.f9662b     // Catch:{ JSONException -> 0x00b3 }
            r14.put(r7, r12)     // Catch:{ JSONException -> 0x00b3 }
            r11.put(r14)     // Catch:{ JSONException -> 0x00b3 }
            goto L_0x005e
        L_0x00b3:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "VastResponseValidator: Failed converting media file data to Extra data json!"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r8, r7)
            goto L_0x002c
        L_0x00bc:
            java.lang.String r7 = "media_files"
            r10.mo13719a(r7, r11)
            r8 = r10
            goto L_0x002d
        L_0x00c4:
            java.lang.String r4 = "VastErrorTooManyWrappers"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00e7
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C2922o.VAST_ERROR_TOO_MANY_WRAPPERS
            com.fyber.inneractive.sdk.network.q$b r7 = new com.fyber.inneractive.sdk.network.q$b
            r7.<init>()
            com.fyber.inneractive.sdk.config.IAConfigManager r8 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.q r8 = r8.f9221i
            int r8 = r8.f9360c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "max"
            com.fyber.inneractive.sdk.network.q$b r8 = r7.mo13719a(r9, r8)
            goto L_0x002d
        L_0x00e7:
            java.lang.String r4 = "ErrorNoMediaFiles"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00f5
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C2922o.VAST_ERROR_NO_MEDIA_FILES
            goto L_0x002c
        L_0x00f5:
            java.lang.String r4 = "ErrorConfigurationMismatch"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0103
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C2922o.INTERNAL_CONFIG_MISMATCH
            goto L_0x002c
        L_0x0103:
            java.lang.String r4 = "VastErrorUnsecure"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0111
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C2922o.VAST_ERROR_UNSECURE_URL
            goto L_0x002c
        L_0x0111:
            r0 = 0
            r4 = 0
            r8 = 0
        L_0x0114:
            if (r0 == 0) goto L_0x0136
            com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
            if (r19 != 0) goto L_0x011c
            r9 = 0
            goto L_0x0120
        L_0x011c:
            org.json.JSONArray r9 = r19.mo13268c()
        L_0x0120:
            r7.<init>(r1)
            r7.f10041b = r0
            r7.f10040a = r2
            r7.f10043d = r9
            if (r8 == 0) goto L_0x0132
            org.json.JSONArray r0 = r7.f10045f
            org.json.JSONObject r8 = r8.f10055a
            r0.put(r8)
        L_0x0132:
            r8 = 0
            r7.mo13717a((java.lang.String) r8)
        L_0x0136:
            java.util.List<com.fyber.inneractive.sdk.model.vast.f> r0 = r1.f12773E
            java.lang.String r7 = "Got exception adding param to json object: %s, %s"
            r9 = 1
            if (r0 == 0) goto L_0x0209
            int r10 = r0.size()
            if (r10 <= 0) goto L_0x0209
            com.fyber.inneractive.sdk.network.q$a r10 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r11 = com.fyber.inneractive.sdk.network.C2924p.VAST_EVENT_COMPANION_FILTERED
            if (r19 != 0) goto L_0x014b
            r12 = 0
            goto L_0x014f
        L_0x014b:
            org.json.JSONArray r12 = r19.mo13268c()
        L_0x014f:
            r10.<init>(r1)
            r10.f10042c = r11
            r10.f10040a = r2
            r10.f10043d = r12
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.util.Iterator r13 = r0.iterator()
        L_0x0166:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r13.next()
            com.fyber.inneractive.sdk.model.vast.f r0 = (com.fyber.inneractive.sdk.model.vast.C2839f) r0
            r0.getClass()
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = "w"
            java.lang.Integer r8 = r0.f9761a     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r15, r8)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = "h"
            java.lang.Integer r15 = r0.f9762b     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r8, r15)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = "ctr"
            java.lang.String r15 = r0.f9767g     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r8, r15)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = "clt"
            java.util.List<java.lang.String> r15 = r0.f9768h     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r8, r15)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = r0.f9766f     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r15 = "content"
            if (r8 == 0) goto L_0x01a3
            r14.put(r15, r8)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = "HTMLResource"
            goto L_0x01a4
        L_0x01a3:
            r8 = 0
        L_0x01a4:
            com.fyber.inneractive.sdk.model.vast.i r6 = r0.f9764d     // Catch:{ JSONException -> 0x01d9 }
            if (r6 == 0) goto L_0x01b8
            java.lang.String r6 = r6.f9780b     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r15, r6)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r6 = "creativeType"
            com.fyber.inneractive.sdk.model.vast.i r8 = r0.f9764d     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = r8.f9779a     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r6, r8)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = "StaticResource"
        L_0x01b8:
            java.lang.String r6 = r0.f9765e     // Catch:{ JSONException -> 0x01d9 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x01d9 }
            if (r6 != 0) goto L_0x01c7
            java.lang.String r6 = r0.f9765e     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r15, r6)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r8 = "iFrameResource"
        L_0x01c7:
            if (r8 == 0) goto L_0x01cf
            java.lang.String r6 = "type"
            r14.put(r6, r8)     // Catch:{ JSONException -> 0x01d9 }
        L_0x01cf:
            com.fyber.inneractive.sdk.flow.vast.a$a r0 = r0.f9769i     // Catch:{ JSONException -> 0x01d9 }
            if (r0 == 0) goto L_0x01e9
            int r0 = r0.f9658a     // Catch:{ JSONException -> 0x01d9 }
            r14.put(r5, r0)     // Catch:{ JSONException -> 0x01d9 }
            goto L_0x01e9
        L_0x01d9:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r6[r8] = r0
            java.lang.String r0 = "Failed creating Companion json object: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r0, r6)
            r14 = 0
        L_0x01e9:
            r12.put(r14)
            r6 = 0
            goto L_0x0166
        L_0x01ef:
            java.lang.String r0 = "companion_data"
            r11.put(r0, r12)     // Catch:{ Exception -> 0x01f5 }
            goto L_0x0200
        L_0x01f5:
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            r6[r9] = r12
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r7, r6)
        L_0x0200:
            org.json.JSONArray r0 = r10.f10045f
            r0.put(r11)
            r5 = 0
            r10.mo13717a((java.lang.String) r5)
        L_0x0209:
            com.fyber.inneractive.sdk.model.vast.b r0 = r1.f12771C
            if (r0 == 0) goto L_0x0214
            java.util.PriorityQueue<com.fyber.inneractive.sdk.model.vast.c> r0 = r0.f9742f
            int r0 = r0.size()
            goto L_0x0215
        L_0x0214:
            r0 = 0
        L_0x0215:
            java.util.List<com.fyber.inneractive.sdk.model.vast.f> r5 = r1.f12773E
            if (r5 == 0) goto L_0x021e
            int r5 = r5.size()
            goto L_0x021f
        L_0x021e:
            r5 = 0
        L_0x021f:
            com.fyber.inneractive.sdk.network.q$a r6 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C2924p.NUMBER_OF_COMPANIONS
            if (r19 != 0) goto L_0x0227
            r10 = 0
            goto L_0x022b
        L_0x0227:
            org.json.JSONArray r10 = r19.mo13268c()
        L_0x022b:
            r6.<init>(r1)
            r6.f10042c = r8
            r6.f10040a = r2
            r6.f10043d = r10
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r10 = "number_of_endcards"
            int r0 = r0 + r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.put(r10, r0)     // Catch:{ Exception -> 0x0244 }
            goto L_0x024f
        L_0x0244:
            r5 = 2
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r5 = 0
            r11[r5] = r10
            r11[r9] = r0
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r7, r11)
        L_0x024f:
            org.json.JSONArray r0 = r6.f10045f
            r0.put(r8)
            r5 = 0
            r6.mo13717a((java.lang.String) r5)
            com.fyber.inneractive.sdk.model.vast.b r0 = r1.f12771C
            if (r0 == 0) goto L_0x02de
            com.fyber.inneractive.sdk.flow.vast.f r0 = new com.fyber.inneractive.sdk.flow.vast.f
            r0.<init>(r3, r1)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x02de
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            com.fyber.inneractive.sdk.network.q$a r6 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C2924p.OMID_VAST_DETECTION
            if (r19 != 0) goto L_0x0279
            r10 = 0
            goto L_0x027d
        L_0x0279:
            org.json.JSONArray r10 = r19.mo13268c()
        L_0x027d:
            r6.<init>(r1)
            r6.f10042c = r8
            r6.f10040a = r2
            r6.f10043d = r10
            java.util.Iterator r0 = r0.iterator()
        L_0x028a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02c3
            java.lang.Object r2 = r0.next()
            com.fyber.inneractive.sdk.measurement.i r2 = (com.fyber.inneractive.sdk.measurement.C2825i) r2
            r2.getClass()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r10 = "success"
            boolean r11 = r2.mo13616b()     // Catch:{ JSONException -> 0x02bb }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ JSONException -> 0x02bb }
            r8.put(r10, r11)     // Catch:{ JSONException -> 0x02bb }
            boolean r10 = r2.mo13616b()     // Catch:{ JSONException -> 0x02bb }
            if (r10 != 0) goto L_0x02bd
            java.lang.String r10 = "error_reason"
            java.lang.String r2 = r2.mo13614a()     // Catch:{ JSONException -> 0x02bb }
            r8.put(r10, r2)     // Catch:{ JSONException -> 0x02bb }
            goto L_0x02bd
        L_0x02bb:
            r8 = 0
        L_0x02bd:
            if (r8 == 0) goto L_0x028a
            r5.put(r8)
            goto L_0x028a
        L_0x02c3:
            java.lang.String r0 = "verifications"
            r3.put(r0, r5)     // Catch:{ Exception -> 0x02ca }
            goto L_0x02d5
        L_0x02ca:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r8 = 0
            r2[r8] = r0
            r2[r9] = r5
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r7, r2)
        L_0x02d5:
            org.json.JSONArray r0 = r6.f10045f
            r0.put(r3)
            r2 = 0
            r6.mo13717a((java.lang.String) r2)
        L_0x02de:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.response.C3650g.mo13327a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s):com.fyber.inneractive.sdk.external.InneractiveErrorCode");
    }
}
